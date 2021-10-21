package ansi;


public enum Color {
    WHITE(255),
    BLACK(0),
    RED(124),
    GREEN(46),
    BLUE(63),
    YELLOW(179),
    PINK(213),
    CYAN(123);

    private int ind;

    Color(int ind) {
        this.ind = ind;
    }

    public int getInd() {
        return ind;
    }

}
