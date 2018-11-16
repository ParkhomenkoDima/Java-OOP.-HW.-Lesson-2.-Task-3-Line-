package OopHomeWork2.Line;

public class Line {
    private final Point startPoint;
    private final Point endPoint;

    public Line (Point startPoint, Point endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public final double lengthCalc(){
       // return = √ ((X2-X1)²+(Y2-Y1)²)
        return Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(),2) + Math.pow(endPoint.getY() - startPoint.getY(),2));
    }

    @Override
    public String toString() {
        return "Line{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }
}
