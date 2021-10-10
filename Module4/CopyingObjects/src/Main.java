public class Main {
    public static void main(String[] args) {
        Dimensions dimension = new Dimensions();
        dimension.setDimensions(34.0, 22.0, 10.0);
        Cargo cargo = new Cargo(dimension, 44.0, "Red Square", true, "1234", true);
        System.out.println(cargo);
        cargo.setAddress("Allies");
        cargo.setWeight(55);
        System.out.println(cargo);



    }
}
