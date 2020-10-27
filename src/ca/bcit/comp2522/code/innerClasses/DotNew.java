package ca.bcit.comp2522.code.innerClasses;

public class DotNew {
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        Inner dni = dn.new Inner();
    }

    public class Inner {
    }
}
