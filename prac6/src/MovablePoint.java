public class MovablePoint implements Movable {
    private final int xSpeed;
    private final int ySpeed;
    private int x;
    private int y;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}