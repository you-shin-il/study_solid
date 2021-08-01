package ocp.after;

import ocp.after.car.마티즈;
import ocp.after.car.쏘나타;
import ocp.after.driver.운전자;

public class 테스트 {
    public static void main(String[] args) {
        운전자 마티즈운전자 = new 운전자(new 마티즈());
        운전자 쏘나타운전자 = new 운전자(new 쏘나타());

        마티즈운전자.기어조작();// 마티즈.창문수동개방
        쏘나타운전자.기어조작();// 쏘나타.창문자동개방
        마티즈운전자.창문개방();// 마티즈.창문수동개방
        쏘나타운전자.창문개방();// 쏘나타.창문자동개방
    }
}