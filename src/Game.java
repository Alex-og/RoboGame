public class Game {

    public static void main(String[] args) {
        moveRobot(new Robot(3, 2, Direction.UP), 4, 2); //This method I can use in other blocks where created personage with moving skills
    }


    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) robot.turnRight(); // turn to need side
            while (robot.getY() < toY) robot.stepForward(); // do one step until will reach toY
        }
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) robot.turnRight(); // turn to need side
            while (robot.getY() > toY) robot.stepForward(); // do one step until will reach toY
        }
        if(robot.getX() < toX){
            while ((robot.getDirection() != Direction.RIGHT)) robot.turnRight();
            while (robot.getX() < toX) robot.stepForward();
        }
        if(robot.getX() > toX){
            while ((robot.getDirection() != Direction.LEFT)) robot.turnRight();
            while (robot.getX() > toX) robot.stepForward();
        }
    }
}