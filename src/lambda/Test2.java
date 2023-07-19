package lambda;

public class Test2 {
    static void returnLength(I i) {
        System.out.println(i.abc("Privet"));
    }

    void someMethod() {
        returnLength(String::length);
    }

    public static void main(String[] args) {
        I i = String::length;
        returnLength(i);
    }
}

interface I {
    int abc(String s);
}