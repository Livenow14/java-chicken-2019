package view;

public class MainView {
    private static final String MAIN = "메인화면";
    private static final String ORDER_SAVE = "주문등록";
    private static final String PAYMENT = "주문하기";
    private static final String EXIT = "프로그램 종료";

    public static void print() {
        OutputView.printSharp(MAIN);
        OutputView.println(Prefix.ONE.getPrefix() + ORDER_SAVE);
        OutputView.println(Prefix.TWO.getPrefix() + PAYMENT);
        OutputView.println(Prefix.THREE.getPrefix() + EXIT);
        OutputView.printSharp("원하는 기능을 선택하세요");
    }
}
