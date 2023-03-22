package Interface_Shapes_Homework;

public abstract class Shape implements Comparable<Shape>{

    private String displayName;

    public Shape(String displayName){
        this.displayName=displayName;
    }

    public abstract double getArea();


    public String getDisplayName(){
        return displayName;
    }
    public int compareTo (Shape sh) {
       // return Double.compare (getArea(), sh.getArea());
       // return (int) (getArea() -sh.getArea());
        // getArea = 0,2
        // sh.getArea = 0,1
        if(getArea() - sh.getArea()>0) {
            return 1;
        }
        else if (getArea() - sh.getArea()<0){
            return -1;

        }else return 0;
    }


    @Override
    public String toString() {
        return "\nShape{" +
                "displayName='" + displayName + " " +getArea()+ '\'' +
                '}';
    }
}
