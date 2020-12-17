package view;

public class Selection {
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;

    private final int option;

    public Selection(int option) {
        this.option = option;
    }

    public boolean isAvailableOption() {
        return option == ONE || option == ONE || option ==ONE;
    }

    public int getOption() {
        return option;
    }
}
