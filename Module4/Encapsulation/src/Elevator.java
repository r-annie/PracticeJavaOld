public class Elevator {

    private int currentFloor = 1;
    private int minFloor;
    private int  maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor () {
        return this.currentFloor;
    }

    public void moveDown () {
        this.currentFloor = this.currentFloor - 1;
    }

    public void moveUp() {
        this.currentFloor = this.currentFloor + 1;
    }

    public void move (int Floor)  {
        if (Floor < this.minFloor || Floor > this.maxFloor) {
            System.out.println("Ошибка, этаж задан неверно.");
        } else {
                while (Floor != this.currentFloor) {
                    while (Floor > this.currentFloor) {
                        moveUp();
                        System.out.println("Поднимаемся... Текущий этаж: " + this.currentFloor + ".");
                    }
                    while (Floor < this.currentFloor) {
                        moveDown();
                        System.out.println("Опускаемся... Текущий этаж: " + this.currentFloor + ".");
                    }
                }
                        System.out.println("Вы приехали на заданный этаж: " + getCurrentFloor() + ".");
                }
            }
        }
