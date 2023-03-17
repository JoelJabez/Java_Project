public class ByTwo implements Series2{
    int num = 0;
    @Override
    public int getNext() {
        return num+= 2;
    }

    public int getNum() {
        return num;
    }
}
