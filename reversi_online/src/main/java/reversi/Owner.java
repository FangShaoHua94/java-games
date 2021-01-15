package reversi;

import javafx.scene.paint.Color;

public enum Owner {

    NONE, WHITE, BLACK;

    public Owner opposite() {
        return this == WHITE ? BLACK : this == BLACK ? WHITE : NONE;
    }

    public Color getColor() {
        return this == Owner.WHITE ? Color.WHITE : Color.BLACK;
    }

    public String getColorStyle() {
        return this == Owner.WHITE ? "white" : "black";
    }

}
