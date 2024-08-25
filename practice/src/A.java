 public  class A implements I1 {
    String name;
    int age;
    static String schoolName="DAV";
    void check(int vl){
        System.out.println("HI");
    }
    @Override
    public void check() {
        // TODO Auto-generated method stub
        System.out.println("HI");
    }
    public static void main(String[] args) {
        I1 obj=new A();
        obj.check();
        obj.speak();
        A a=new A();
        a.speak();
    }

}
