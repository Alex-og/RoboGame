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
        if (direction == Direction.DOWN){
            this.direction = Direction.RIGHT;
            return;
        }

        if (direction == Direction.UP){
            this.direction = Direction.LEFT;
            return;
        }

        if (direction == Direction.LEFT){
            this.direction = Direction.DOWN;
            return;
        }

        if (direction == Direction.RIGHT){
            this.direction = Direction.UP;
            return;
        }
    }

    public void turnRight() {
        // rotate 90 degrees clockwise
        System.out.println("clockwise rotation");
        if (this.direction == Direction.DOWN){
            System.out.println("Down -> left");
            this.direction = Direction.LEFT;
            return;
        }

        if (this.direction == Direction.UP){
            System.out.println("Up -> right");
            this.direction = Direction.RIGHT;
            return;
        }

        if (this.direction == Direction.LEFT){
            System.out.println("Left -> up");
            this.direction = Direction.UP;
            return;
        }

        if (this.direction == Direction.RIGHT){
            System.out.println("Right -> down");
            this.direction = Direction.DOWN;
            return;
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
