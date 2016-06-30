package inheritance;

public class Rectangle extends Object {
        int width, height;
  
        public Rectangle(int w, int h) {
               width = w;            
               height = h;             
        }
        
        public int calcArea() {
                return width * height;
        }
}