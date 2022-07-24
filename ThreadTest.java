What is the result of compiling and executing the following Java class: 
public class ThreadTest extends Thread {
public void run() {
System.out.println("In run");
suspend();
resume();
System.out.println("Leaving run");
}
public static void main(String args []) {
(new ThreadTest()).start();
}
}