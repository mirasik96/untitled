package multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("Moy_potok");
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of thread5 = " + myThread5.getName() +
                " Priority of thread5 = " + myThread5.getPriority());

        MyThread5 myThread6 = new MyThread5();
        System.out.println("Name of thread6 = " + myThread6.getName() +
                " Priority of thread6 = " + myThread6.getPriority());
    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("privet");
    }
}

