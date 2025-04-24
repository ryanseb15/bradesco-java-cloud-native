package debugging_java;

public class StackTrace {
    public static void main(String[] args) {
        System.out.println("Inicio do método main.");
        a();
        System.out.println("Fim do método main.");
    }

    static void a() {
        System.out.println("Inicio do método a.");
        b();
        System.out.println("Fim do método a.");
    }

    static void b() {
        System.out.println("Inicio do método b.");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        c();
        System.out.println("Fim do método b.");
    }

    static void c() {
        System.out.println("Inicio do método c.");
        Thread.dumpStack();
        System.out.println("Fim do método c.");
    }
}
