# Практика

Практические задания очень похожи на реальную работу в обычной жизни.
Каждое из них подулирует определенную ситуацию, которая может (и случится) в жизни каждого инженера.


### Формат сдачи

К каждому заданию необходимо прикрепить список команд, которые вы выполняли для решения задачи. Добавьте к ним пояснения, что делает команда для удобства проверки.

Создайте в Вашем персональном пространстве в scm.x5.ru репозиторий "linux-hw". Решения разместите в файлах в этом репозитории.


### Задача 1. Исследование проекта

Вы хотите приступить к работе над новым OpenSource проектом.
Для начала, вы хотите понять, с камим файлами вам предстоит работать?

Задачи:

1. Найдите 5 самых больших (по количеству строк) файлов в https://github.com/dry-python/returns/tree/master/returns
2. Найдите 5 самых маленьких (по количеству строк) файлов во всем проекте https://github.com/dry-python/returns
3. Посчитайте, сколько раз внутри проекта используется импорт собственных исходников: выведете сколько раз там встречается начало импорта `from returns`

Форма сдачи: необходимо прикрепить список команд, которые вы выполняли для решения задачи. Добавьте к ним само задание для удобства проверки. Пример:

```
0. Вытянуть проект

first command

1. Создать новый пустой файл `.gitignore`

second command
one more command
```


Решение разместите в файле "task1.txt"



### Задача 2. Создание нового пользователя для коллеги

Ваш коллега попросил создать для него нового Linux пользователя.
Вы вместе собираетесь делать новый проект на одной машине.
Проект называется `ideal`.

Что нужно?

1. Создать новую группу `ideal` для работы над проектом
2. Добавить себя в группу `ideal`
3. Создать пользователя для коллеги. Его имя будет `maxim`, рабочая директория `/home/maxim_files`, среда по-умолчанию: `bash`
4. Необходимо добавить `maxim` в группу `ideal`
5. Создать папку(и) `/var/ideal/source`
6. Создать файл `/var/ideal/source/README.md` с содержимым `# Ideal Project`
7. Сделать, чтобы группа `ideal` могла читать и редактировать все файлы в папке `/var/ideal`. Никто не может исполнять, остальные - только читать.
8. Проверить разрешения внутри всех подпапок `/var/ideal`


Решение разместите в файле "task2.txt"




### Задача 3. Автоматизация рутины

Напишите скрипт, который поможет вам работать с гитом!

Нам потребуется сделать `sh` скрипт, который будет выводить полезную информацию о ближайщем прошлом проекта.

Требования:
0. Называться скрипт должен `git-overview.sh`. Если запускается вне `git` проекта, то выдаем сообщение об ошибке и статус код `1`
1. Скрипт должен выводить текущую дату и время
2. Скрипт должен выводить количество коммитов в текущем проекте: `All commits: $COMMIT_COUNT`
3. Скрипт должен выводить количество коммитов за последнюю неделю
4. Скрипт должен выводить количества добавленных и удаленных строк за последнюю неделю
5. Скрипт должен выводить уникальный список имен людей, кто за последнюю неделю делал коммиты
6. Завершаем работу со статусом `0`

Необходимо, чтобы проходила проверка при помощи `shellcheck`.

Форма сдачи: файл `git-overview.sh`
