public interface Series {
    public int getNext();

   default void printMessage(){
       System.out.println("This is from Series");
   }
}
