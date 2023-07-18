package nestedClasses;

public class Test {
    static class A{} //static class
    class B{}        //inner class
    void method(){
        class C{}    //local class
    }
}
