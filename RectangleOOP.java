public class Rectangle {
    double height;
    double weight;
    
    public Rectangle() {
    	this.height = 5.0;
    	this.weight = 10.0;
    }
    public Rectangle(double a,double b) {
        this.height = a;
        this.weight = b;
    } 
    public double calculateArea(){
    	double area = this.height * this.weight;
    	System.out.println(area);
    	return area;
    	
    }
    public static void main(String[] args) {                
	   Rectangle rec1 = new Rectangle(); 
	   Rectangle rec2 = new Rectangle(6.0,10.0); 
	   rec1.calculateArea();
	   rec2.calculateArea();
	  }
}
