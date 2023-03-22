package Interface_Shapes_Homework;

public class Shape implements Comparable<Shape>{

    private String displayName;

    public Shape(String displayName){
        this.displayName=displayName;
    }

    public double getArea(){
        return 0;
    }

    public String getDisplayName(){
        return displayName;
    }
    public int compareTo (Shape sh) {
        return Integer.compare((int) getArea(), (int) sh.getArea());
    }


    @Override
    public String toString() {
        return "\nShape{" +
                "displayName='" + displayName + '\'' +
                '}';
    }
}
