package view;

public enum Option {
    Main_ONE(1),
    Main_TWO(2),
    Main_THREE(3);

    private final int option;

    Option(int option) {
        this.option = option;
    }

    public int getOption() {
        return option;
    }
}
