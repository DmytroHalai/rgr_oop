package Editor;

import java.awt.*;

public class ShapeEditor extends Editor{
    protected boolean isDragging = false;
    protected int x1, y1, x2, y2;

    @Override
    public void onLBdown(Graphics g, int x, int y) {
        isDragging = true;
        x1 = x;
        y1 = y;
    }

    @Override
    public void onLBup(Graphics g) {
        isDragging = false;
    }

    @Override
    public void onMouseMove(Graphics g, int x, int y) {
        if (isDragging){
            x2 = x;
            y2 = y;
        }
    }

    @Override
    public void onPaint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (isDragging) {
            int x = Math.min(x1, x2);
            int y = Math.min(y1, y2);
            int width = Math.abs(x2 - x1);
            int height = Math.abs(y2 - y1);
            Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
                    0, new float[]{9}, 0);
            g2.setStroke(dashed);
            g2.drawRect(x, y, width, height);
        }
    }
}
