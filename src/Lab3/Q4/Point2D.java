package Lab3.Q4;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    //Constructor
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    //Getters
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public float[] getXY(){
        float[] result = new float[2];
        result[0] = x;
        result[1] = y;
        return result;
    }

    //Setters
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    //toString() method
    @Override
    public String toString(){
        return String.format(" (%.2f, %.2f) ", x, y);
    }
}
