public class Square extends Rectangle implements Colorable {
    public Square(){

    }
    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
       super(color, filled, side, side);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double width){
        setSide(width);
    }

    public void setLength(double length){
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public String howToColor() {
        return "Color all four side";
    }
}
