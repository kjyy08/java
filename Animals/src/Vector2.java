public class Vector2 {
    public float x;
    public float y;

    public Vector2(){
        x = 0;
        y = 0;
    }

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2 up(float scalar) {
        this.y = y + scalar;
        return new Vector2(this.x, this.y + scalar);
    }

    public Vector2 down(float scalar) {
        this.y = y - scalar;
        return new Vector2(this.x, this.y - scalar);
    }

    public Vector2 right(float scalar) {
        this.x = x + scalar;
        return new Vector2(this.x + scalar, this.y);
    }

    public Vector2 left(float scalar) {
        this.x = x - scalar;
        return new Vector2(this.x - scalar, this.y);
    }
}
