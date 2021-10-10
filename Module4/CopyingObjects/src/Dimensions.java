public class Dimensions {

    private final double length;
    private final double width;
    private final double height;

    public Dimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public Dimensions() {
        length = 0.0;
        width = 0.0;
        height = 0.0;
    }

    public Dimensions setDimensions (double length, double width, double height)
    {
        return new Dimensions(length, width, height);
    }

    public String toString () {
        return "длина" + length + "ширина" + width + "высота" + height;
    }


    public double getVolume () {
        double volume = length*width*height;
        return volume;
    }

}
