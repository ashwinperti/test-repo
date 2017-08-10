public class Dog{
    String a1;
    Dog(String a2)
    {
        a1 = a2;
    }
    public void setAttribute(String s)
    {
        a1 = s;
    }
     public static void main(String[] args){
          Dog f = new Dog("f");
            System.out.println(f.a1);
          changeReference(f); // It won't change the reference!
          System.out.println(f.a1);
          modifyReference(f); // It will modify the object that the reference variable "f" refers to!
        System.out.println(f.a1);
     }
     public static void changeReference(Dog a){
          Dog b = new Dog("b");
          a = b;
          System.out.println(a.a1);
          System.out.println(b.a1);
     }
     public static void modifyReference(Dog c){
          c.setAttribute("c");
     }
}