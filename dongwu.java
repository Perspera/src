class Animal {
    private String name;
    private int id;
    public Animal(String myname, int myid){
        name =myname;
        id=myid;
    }
    public void  eat(){
        System.out.println(name+"在吃");
    }
    public void sleep(){
        System.out.println(name+"在睡觉");
    }
    public void introduction(){
        System.out.println("我是"+id+"号"+name+".");
    }
}
public class dongwu{
    public static void main(String[] args) {
        Penguin penguin =new Penguin("Penguin", 12);
        mouse Mouse =new mouse("mouse", 520);
        penguin.eat();
        penguin.sleep();
        penguin.introduction();
        Mouse.eat();
        Mouse.sleep();
        Mouse.introduction();
    }
}
 class mouse extends Animal {
    public mouse(String myname, int myid) {
        super(myname, myid);
    }
}
 class Penguin extends Animal {
    public Penguin(String myname, int myid) {
        super(myname, myid);
    }
}

