package person.appearance;

public final class EyesColor {
    private static final String BLUE = "голубые";
    private static final String GREEN = "зелёные";
    private static final String BROWN = "карие";
    private static final String GRAY = "серые";
    private static final String DIFF = "разные";

    public static String getColorEyes(int i){
        switch (i / 2) {
            case 0:
                return EyesColor.BLUE;
            case 1:
                return EyesColor.GREEN;
            case 2:
                return EyesColor.BROWN;
            case 3:
                return EyesColor.GRAY;
            case 4:
                return EyesColor.DIFF;
            default:
                throw new IllegalStateException("Unexpected value: " + i / 2);
        }
    }
}
