package ocp.after.car;

public class 쏘나타 implements 자동차 {

    @Override
    public void 창문개방() {
        System.out.println("쏘나타.창문자동개방");
    }

    @Override
    public void 기어조작() {
        System.out.println("쏘나타.기어자동조작");
    }
}
