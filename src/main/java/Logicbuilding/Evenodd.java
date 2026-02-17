package Logicbuilding;

public class Evenodd {
    public float no;

    public float getNo() {
        return no;
    }

    public void setNo(float no) {
        this.no = no;
    }

    public void evenodd () {
        System.out.println(no/2);
        if (no%2==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
