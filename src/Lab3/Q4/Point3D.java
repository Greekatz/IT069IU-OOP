package Lab3.Q4;

public class Point3D extends Point2D{
    private float z;

    //Constructor
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    //Getters
    public float getX(){
        return z;
    }
    public float[] getXYZ(){
        return new float[]{super.getX(), super.getY(), z};
    }

    //Setters
    public void setZ(float z){
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x, y);
        this.z = z;
    }

    //toString() method
    @Override
    public String toString(){
        return String.format(" (%.2f, %.2f, %.2f) ", super.getX(), super.getY(), z);
    }
}
