package srp.case3.before;

public class 강아지 {
    final static boolean 수컷 = true;
    final static boolean 암컷 = false;
    boolean 성별;

    void 소변보다() {
        if (this.성별 == 수컷) {
            System.out.println("한쪽 다리를 들고 소변을 본다");
        } else {
            System.out.println("뒷다리 두 개를 굽혀 앉은 자세로 소변을 본다");
        }
    }
}