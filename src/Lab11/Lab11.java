package Lab11;

public class Lab11 {

    public static void main(String[] args) {
//        A a = new A();
//        A aa = new A(true);
//        A aaa= new A(false);
//        System.out.println("-------------------------------");
//        B b = new B();
//        B bb = new B(true);
//        B bbb= new B(false);
//
//
//        System.out.println("-------------------------------");
//        C c= new C();
//        C cc= new C(true);
//        C ccc= new C(false);
//
//        System.out.println("-------------------------------");


        new C();
    }



}
class A{
    A(){
        System.out.println(" A");
    }
    A(boolean akcja){
        if( akcja == false){
            System.out.println("Wywołano konstruktor A");
        }
    }
}
class B extends A{
    B(){

        System.out.println(" B");
    }

    B(boolean akcja){
        super(true);
        if( akcja == false){
            System.out.println("Wywołano konstruktor B");
        }
    }
}
class C extends B{
    C(){

        System.out.println(" C");

    }
    C(boolean akcja){
        super(true);
        if( akcja == false){
            System.out.println("Wywołano konstruktor C");
        }
    }
}
