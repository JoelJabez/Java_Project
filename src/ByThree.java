public class ByThree implements Series2{
    int num = 0;
    @Override
    public int getNext() {
        return num+= 3;
    }

    public int getNum() {
        return num;
    }

    @Override
    public void printMessage() {
        System.out.println("This is from ByThree");
    }
}
