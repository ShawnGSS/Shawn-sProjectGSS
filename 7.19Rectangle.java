public class Rectangle {
    private int length;
    private int width;
    public void setLength(int length) {this.length = length;}
    public void setWidth(int width) {this.width = width;}
    public int getLength() {return length; }
    public int getWidth() {return width; }

    //The toString method that's over written
    public String toString(int length, int width){
        
            return "this is a rectangle, with a side length of; "+ length +" and a side width of: "+ width;
    }

}

