public class Square extends Rectangle{

    Square(int x){
      setLength(x);
      setWidth(x);
    }
    @Override
    public String toString(int length, int width){
        return "this is a square, with a side length of; "+ length;
    }
}
