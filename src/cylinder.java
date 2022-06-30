 class cylinder {
    private int radius;
    private int height;
    public cylinder(){
        this.radius = 4;
        this.height = 5;
    }
     public cylinder(int radius, int height) {
         this.radius = radius;
         this.height = height;
     }
     public int getRadius(){
         return radius;
     }
     public int getHeight() {
         return height;
     }
     public double volume(){
        return Math.PI*radius*radius*height;
     }
     public double area(){
        return Math.PI*radius*radius+2*Math.PI*radius*height;
     }
     public class cyld{
         public static void main(String[] args) {
             cylinder cy = new cylinder();
             System.out.println(cy.getHeight());
             System.out.println(cy.getRadius());
             System.out.println(cy.volume());
             System.out.println(cy.area());

         }
     }
 }
