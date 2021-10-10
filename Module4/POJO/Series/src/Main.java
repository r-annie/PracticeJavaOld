public class Main {
    public static void main(String[] args) {
        Series doctorWho = new Series("Doctor Who");
        doctorWho.setTitle("Doctor Who");
        doctorWho.setCriticsRating(8.0);
        doctorWho.setDescription("Space & time travels are cool!");
        doctorWho.setUsersRating(8.5);
        doctorWho.setYear(1963);

        System.out.println(doctorWho.getCriticsRating());
        System.out.println(doctorWho.getDescription());
        System.out.println(doctorWho.getTitle());
        System.out.println(doctorWho.getUsersRating());
        System.out.println(doctorWho.getYear());
    }
}
