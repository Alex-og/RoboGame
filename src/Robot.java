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
        // текущее направление взгляда
        return direction;
    }

    public int getX() {
        // текущая координата X
        return x;
    }

    public int getY() {
        // текущая координата Y
        return y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        System.out.println("Поворот против часовой стрелки");
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
        // повернуться на 90 градусов по часовой стрелке
        System.out.println("поворот по часовой стрелке");
        if (this.direction == Direction.DOWN){
            System.out.println("Вниз -> влево");
            this.direction = Direction.LEFT;
            return;
        }

        if (this.direction == Direction.UP){
            System.out.println("Вверх -> вправо");
            this.direction = Direction.RIGHT;
            return;
        }

        if (this.direction == Direction.LEFT){
            System.out.println("Влево -> вверх");
            this.direction = Direction.UP;
            return;
        }

        if (this.direction == Direction.RIGHT){
            System.out.println("Вправо -> вниз");
            this.direction = Direction.DOWN;
            return;
        }
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
        System.out.println("движение");
        if (direction == Direction.DOWN){
            System.out.println("вниз");
            this.y--;
        }

        if (direction == Direction.UP){
            System.out.println("вверх");
            this.y++;
        }

        if (direction == Direction.LEFT){
            System.out.println("налево");
            this.x--;
        }

        if (direction == Direction.RIGHT){
            System.out.println("направо");
            this.x++;
        }
    }
}