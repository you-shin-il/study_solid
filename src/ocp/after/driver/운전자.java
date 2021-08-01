package ocp.after.driver;

import ocp.after.car.자동차;

public class 운전자 {

    private 자동차 자동차;

    public 운전자(자동차 자동차) {
        this.자동차 = 자동차;
    }

    public void 창문개방() {
        자동차.창문개방();
    }

    public void 기어조작() {
        자동차.창문개방();
    }
}
