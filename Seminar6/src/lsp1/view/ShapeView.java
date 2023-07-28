package lsp1.view;

import lsp1.shape.Qudrilateral;
import lsp1.shape.Rectangle;

public class ShapeView {
    private final Qudrilateral qudrilateral;

    public ShapeView(Qudrilateral  qudrilateral) {
        this.qudrilateral = qudrilateral;
    }

    public void showArea() {
        System.out.print("Area of qudrilateral equal:");
        System.out.println(qudrilateral.getArea());
    }
}
