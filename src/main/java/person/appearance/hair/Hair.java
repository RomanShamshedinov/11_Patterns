package person.appearance.hair;

import java.util.HashMap;

public class Hair {
    private static final String[] colors = {
            "чёрные"
            , "каштановые"
            , "рыжие"
            ,"светлые"
            , "седые"
            , "розовые"
            , "зелёные"
            , "фиолетовые"
            , "синие"};

    private final String color;
    private final int longHair;

    public Hair(final String color, final int longHair) {
        this.color = color;
        this.longHair = longHair;
    }

    public static String getColor(int code){
        if (code > 0) {
            return colors[code-1];
        }
        return null;
    }

    @Override
    public final String toString() {
        String result = "";
        if (longHair > 0) {
            if (longHair > 4) {
                result += "длинные, ";
            } else{
                result += "короткие, ";
            }
            return result + color;
        }
        return "нет";
    }
}
