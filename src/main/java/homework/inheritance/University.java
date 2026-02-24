package homework.inheritance;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

public interface University {
    default void country() {System.out.println("India");}
    default void state(){
        System.out.println("Himachal Pradesh");
    }
    public void city();
    public void collage();
}
