public class Series {
    private String title;
    private String description;
    private int year;
    private double criticsRating;
    private double usersRating;

    public Series(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCriticsRating() {
        return criticsRating;
    }

    public void setCriticsRating(double criticsRating) {
        this.criticsRating = criticsRating;
    }

    public double getUsersRating() {
        return usersRating;
    }

    public void setUsersRating(double usersRating) {
        this.usersRating = usersRating;
    }
}
