package homework.inheritance;



public interface University {
    default void country() {
        System.out.println("India"); }
        default void state() {
            System.out.println("Himachal Pradesh");}
        }