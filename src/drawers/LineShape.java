package drawers;

import java.awt.*;

public class LineShape extends Shape {
    @Override
    public void show(Graphics2D g, boolean isMark, boolean isHighlight) {
        g.setColor(isHighlight ? Color.RED : Color.BLACK);
        new StrokeSetter(g, 3, isMark, 10);
        g.drawLine(xs1, ys1, xs2, ys2);
    }

    @Override
    public String getType() {
        return "Line";
    }
}
