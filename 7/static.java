class Counter {
    static int number=10;
    void increment(){
        number=number+1;
    }
    public static void main(String[] args) {
        Counter obj1=new Counter(); 
        Counter obj2=new Counter(); 
        Counter obj3=new Counter(); 
        obj1.increment();
        System.out.println("After object 1:" + Counter.number);
        obj2.increment();
        System.out.println("After object 2:" + Counter.number);
        obj3.increment();
        System.out.println("After object 3:" + Counter.number);
    }
}
