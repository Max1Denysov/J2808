package two;

public class protection2 extends one.protection {
    protection2(){
        System.out.println("Constructor extends from another package");
        //System.out.println("one: " + one);
        System.out.println("two: " + two);
        //System.out.println("three: " + three);
        System.out.println("four: " + four);
    }
}
