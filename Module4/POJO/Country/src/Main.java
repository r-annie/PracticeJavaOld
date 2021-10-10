public class Main {
    public static void main(String[] args) {
        Country japan = new Country("Japan");
        japan.setAccessSea(true);
        japan.setAreaSqKm(377000);
        japan.setNameCapital("Tokyo");
        japan.setPopulation(125000000);
        japan.setNameCountry("Japan");
        System.out.println(japan.getAreaSqKm());
        System.out.println(japan.getNameCapital());
        System.out.println(japan.getNameCountry());
        System.out.println(japan.getPopulation());
        System.out.println(japan.isAccessSea());
    }
}