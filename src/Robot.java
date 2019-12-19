public class Robot {
    int x;
    int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Direction getDirection() {
        // direction of current sight
        return direction;
    }

    public int getX() {
        // current x coordinate
        return x;
    }

    public int getY() {
        // current y coordinate
        return y;
    }

    public void turnLeft() {
        // rotate 90 degrees counterclockwise

        System.out.println("Counterclockwise");
        switch (getDirection()) {
            case UP:
                direction = Direction.LEFT;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
            default:
        }

    }

    public void turnRight() {
        // rotate 90 degrees clockwise

        System.out.println("clockwise rotation");
        switch (getDirection()) {
            case UP:
                direction = Direction.RIGHT;
                System.out.println("Up -> right");
                break;
            case RIGHT:
                direction = Direction.DOWN;
                System.out.println("Right -> down");
                break;
            case LEFT:
                direction = Direction.UP;
                System.out.println("Left -> up");
                break;
            case DOWN:
                direction = Direction.LEFT;
                System.out.println("Down -> left");
                break;
            default:
        }
    }

    public void stepForward() {
        // step towards the sight
        // in one step the robot changes one coordinate by one unit
        System.out.println("move");
        if (direction == Direction.DOWN){
            System.out.println("down");
            this.y--;
        }

        if (direction == Direction.UP){
            System.out.println("up");
            this.y++;
        }

        if (direction == Direction.LEFT){
            System.out.println("left");
            this.x--;
        }

        if (direction == Direction.RIGHT){
            System.out.println("right");
            this.x++;
        }
    }
}
