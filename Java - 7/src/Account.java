public class Account {
    private int id;
    private String holder;
    private int amount;

    public Account(int id, String holder, int amount) {
        this.id = id;
        this.holder = holder;
        this.amount = amount;
    }

    public int getId(){
        return id;
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public String getHolder(){
        return holder;
    }
    public void AccountInfo(){
        System.out.println("ID: " + getId() + ", Имя: " + getHolder() + ", Остаток: " + getAmount());
    }


    @Override
    public String toString() {
        return (id + "|" + holder + "|" + amount);
    }
}