public class Dimension {
    private int feet;
    private int inches;
    int ret = 0;
   
    
    
    public Dimension(int inches) {
    if(inches < 0) {
        this.feet = -1;
        this.inches = -1;
    }
    else {
        this.feet = inches / 12;
        this.inches = inches % 12;
    }
}
    
  public int getFeet() {
    return feet;
}
 
public int getInches() {
    return inches;
}   
}