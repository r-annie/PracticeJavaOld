public class Cargo {
    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private final boolean canOverturn;
    private final String registerNumber;
    private final boolean fragile;

    public Cargo(Dimensions dimensions, double weight, String address, boolean canOverturn, String registerNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.canOverturn = canOverturn;
        this.registerNumber = registerNumber;
        this.fragile = fragile;
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions, weight, address, canOverturn, registerNumber, fragile);
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, address, canOverturn, registerNumber, fragile);
    }



    public double getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean isCanOverturn() {
        return canOverturn;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public boolean isFragile() {
        return fragile;
    }
    public String toString () {
        return dimensions + "\n" + weight + "\n" +  address + "\n" +  canOverturn + "\n" +  registerNumber + "\n" +  fragile;
    }
}
