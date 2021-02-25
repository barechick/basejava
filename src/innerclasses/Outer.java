package innerclasses;

public class Outer {
    int i = 11;
    public class Inner {
        int i = 36;
        public void test() {
            System.out.println("用this访问Inner类的i变量：" + this.i);
            System.out.println("访问Inner类的i变量：" + i);
            System.out.println("用this访问Outer类的i变量：" + Outer.this.i);
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner in = o.new Inner();
        in.test();
    }
}
