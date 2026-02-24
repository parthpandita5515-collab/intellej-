package homework.encapsulation;

public class EncMain {
    public static void main(String[] args) {
        Enc enc = new Enc();
        enc.setName("lala");
        System.out.println(enc.getName());
        enc.setRollNo("bye bye");
        System.out.println(enc.getRollNo());
        enc.test();
        enc.test2();
    }
}
