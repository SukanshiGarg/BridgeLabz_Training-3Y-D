class Parent {
    Parent() {
        super();
        System.out.println("Hii from parent constructor");
    }

    Parent(int a) {
        this();
        System.out.println(a);
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

}
