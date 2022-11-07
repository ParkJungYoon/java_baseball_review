package baseball.view;

public class OutputView {
    private final static String INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private final static String GAME_RESTART_OR_END_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void printInputMessage() {
        System.out.println(INPUT_MESSAGE);
    }

    public static void printResult(String result) {
        System.out.println(result);
    }

    public static void printRestartOrEnd() {
        System.out.println(GAME_RESTART_OR_END_MESSAGE);
    }
}
