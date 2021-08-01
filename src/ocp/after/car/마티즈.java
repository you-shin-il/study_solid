package ocp.after.car;

public class 마티즈 implements 자동차 {

    @Override
    public void 창문개방() {
        System.out.println("마티즈.창문수동개방");
    }

    @Override
    public void 기어조작() {
        System.out.println("마티즈.기어수동조작");
    }
}
