class mammals {
    void mam(){
        System.out.println("Inside Mammals Class");
    }
}
class Lion extends Mammals{
    void roar(){
        System.out.println("Inside Lion class ");
    }
}
class Human extends Mammals{
    void hum(){
        System.out.println("Inside Human")
    }
}
class Main{
    public static void main(String args[]){
        Lion obj=new Lion();
        obj.roar();
        obj.mam();
        Human obj1 = new Human();
        obj1.hum();
    }
}
