package view;

public enum  Prefix {
    SHARP("## "),
    ONE("1 - "),
    TWO("2 - "),
    THREE("3 - ");

    private String prefix;

    Prefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}
