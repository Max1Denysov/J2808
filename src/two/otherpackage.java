package two;

class otherpackage {
    otherpackage(){
        one.protection p = new one.protection();

        System.out.println("Constructor from another package");
       // System.out.println("one: " + p.one);
        System.out.println("two: " + p.two);
       // System.out.println("three: " + p.three);
        //System.out.println("four: " + p.four);
    }
}
