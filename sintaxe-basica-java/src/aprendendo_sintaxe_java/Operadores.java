package aprendendo_sintaxe_java;

public class Operadores {
    public static void main(String[] args) {
        int i = 1;
        i = -1;
        System.out.println(i);
        i = 1;
        i -= 1;
        System.out.println(i);
        i = 1;
        i -= -1;
        System.out.println(i);
        i = 1;
        i = -i;
        System.out.println(i);
        i = 1;
        i -= i;
        System.out.println(i);
        i = 1;
        i -= -i;
        System.out.println(i);
        i = 0;
        i = -i;
        System.out.println(i);

        boolean booleano = true;
        System.out.println(!booleano);
        System.out.println(booleano);
        booleano = !booleano;
        System.out.println(booleano);
        System.out.println(!booleano);

        int x = 1, y = 2;
        boolean r;
        if (x == y) {
            r = true;
        } else {
            r = false;
        }
        System.out.println(r);

        r = x == y ? true : false;
        System.out.println(r);

        int a = 1, b = 2;
        boolean n = a == b;
        System.out.println(n);
        System.out.println(n = a != b);
        System.out.println(n);

        boolean p = true, q = false;
        if (p && q) {
            System.out.println(1);
        }
        if (p || q) {
            System.out.println(2);
        }
        if (p && (7 > 4)) {
            System.out.println(3);
        }
    }
}
