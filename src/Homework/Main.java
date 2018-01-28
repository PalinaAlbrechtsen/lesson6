package Homework;


public class Main {

    public static void main(String[] args) {
        Rectangle bigRoom = new Rectangle(new Point(2,2), new Point(7,7));
        System.out.println("Big room's square is: "
                            + bigRoom.getSquare(bigRoom.getUpperLeft(), bigRoom.getLowerRight()));
        System.out.println("Big room's diagonal is: "
                            + bigRoom.getDiagonal(bigRoom.getUpperLeft(), bigRoom.getLowerRight()));

        Rectangle smallRoom = new Rectangle(new Point(3, 4), new Point(5, 6));
        System.out.println("Small room's square: "
                            + smallRoom.getSquare(smallRoom.getUpperLeft(), smallRoom.getLowerRight()));
        System.out.println("Small room's diagonal is: "
                            + smallRoom.getDiagonal(smallRoom.getUpperLeft(), smallRoom.getLowerRight()));
    }
}
