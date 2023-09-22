package org.example.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBoarder(decoratedShape);
    }

    private void setRedBoarder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
