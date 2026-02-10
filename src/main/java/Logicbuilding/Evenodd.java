package Logicbuilding;

public class Evenodd {
    public int no;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void evenodd () {
        System.out.println(no%2);
        if (no%2==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
