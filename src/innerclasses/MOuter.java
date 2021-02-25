package innerclasses;

public class MOuter {
    private int i = 11;
    public void show() {
        final int a = 25; // 常量
        int b = 13; // 变量
        // 局部内部类
        class MInner {
            int c = 2; // 内部类中的变量
            public void print() {
                System.out.println("访问外部类的方法中的变量a：" + a);
                System.out.println("访问内部类中的变量c：" + c);
            }
        }
        MInner mi = new MInner();
        mi.print();
    }

    public static void main(String[] args) {
        MOuter mo = new MOuter();
        mo.show();
    }
}
