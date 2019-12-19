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
        // ������� ����������� �������
        return direction;
    }

    public int getX() {
        // ������� ���������� X
        return x;
    }

    public int getY() {
        // ������� ���������� Y
        return y;
    }

    public void turnLeft() {
        // ����������� �� 90 �������� ������ ������� �������
        System.out.println("������� ������ ������� �������");
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
        // ����������� �� 90 �������� �� ������� �������
        System.out.println("������� �� ������� �������");
        if (this.direction == Direction.DOWN){
            System.out.println("���� -> �����");
            this.direction = Direction.LEFT;
            return;
        }

        if (this.direction == Direction.UP){
            System.out.println("����� -> ������");
            this.direction = Direction.RIGHT;
            return;
        }

        if (this.direction == Direction.LEFT){
            System.out.println("����� -> �����");
            this.direction = Direction.UP;
            return;
        }

        if (this.direction == Direction.RIGHT){
            System.out.println("������ -> ����");
            this.direction = Direction.DOWN;
            return;
        }
    }

    public void stepForward() {
        // ��� � ����������� �������
        // �� ���� ��� ����� �������� ���� ���� ���������� �� �������
        System.out.println("��������");
        if (direction == Direction.DOWN){
            System.out.println("����");
            this.y--;
        }

        if (direction == Direction.UP){
            System.out.println("�����");
            this.y++;
        }

        if (direction == Direction.LEFT){
            System.out.println("������");
            this.x--;
        }

        if (direction == Direction.RIGHT){
            System.out.println("�������");
            this.x++;
        }
    }
}