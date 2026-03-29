public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheese = 100;
    private int extraToopings= 100;
    private int takevalue=100;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price= 300;
        }else{
            this.price=400;
        }
    }
   public void addExtraCheese(){
        System.out.println("extra cheese added");
        this.price += extraCheese;
   }
   public void addExtraToppings(){
        System.out.println("added extra cheese");
        this.price +=extraToopings;
   }
   public void takeAway(){
        System.out.println("takeWay ");
        this.price += takevalue;
   }
   public void getBill(){
       System.out.println("total Price" + " " + this.price);

   }
    public void getPizzaPrice(){
        System.out.println(this.price);
    }
}
