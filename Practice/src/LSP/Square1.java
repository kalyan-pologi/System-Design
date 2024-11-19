package LSP;

public class Square1 extends Rectangle1 {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Ensure width and height are always equal
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height); // Ensure width and height are always equal
    }
}
