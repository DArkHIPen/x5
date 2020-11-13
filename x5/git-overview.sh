#!/bin/bash

date=$(date)

COMMIT_COUNT=`git rev-list --all --count`

COMMIT_LAST_WEEK=`git log --since=1.week --oneline | wc -l`

COMMIT_CHANGES_LAST_WEEK=`git log --since=1.week --numstat --shortstat | tail -n 1`

AUTHOT_OF_COMMITS_LAST_WEEK=`git log --since=1.week --pretty=format:"%an"`

STATUS_CODE=1

if [git status | grep fatal ]; then
	STATUS_CODE=1
	echo "Error: git is not initial. Status: $STATUS_CODE"
else
	echo $date
	echo 
	echo "All commits: $COMMIT_COUNT"
	echo "Commits for last week: $COMMIT_LAST_WEEK"
	echo 
	echo "Changes for last week: $COMMIT_CHANGES_LAST_WEEK"
	echo
	echo "Authors for last week: $AUTHOT_OF_COMMITS_LAST_WEEK"
	STATUS_CODE=0	
fi
