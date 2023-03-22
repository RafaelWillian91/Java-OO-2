package pet;


public  abstract class Pet {
    private int amount;

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(int amount){
        this.amount += amount;
    }

    public  int getAmount(){
        return amount;
    }



}
