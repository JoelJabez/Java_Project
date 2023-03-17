import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Name {

//    String first_name, last_name;
//
//    public Name(){
//    }
//
//    public Name(String first_name, String last_name){
//       this.first_name = first_name;
//        this.last_name = last_name;
//    }
//
//    public String toString(){
//        return first_name + " " + last_name;
//    }

    private String name;
    private int age;


    public void copy(Name n) {
       setAge(n.getAge());
       setName(n.getName());
    }

    Name() {}

    Name (Name n){
        this.copy(n);
    }

    //   public void hello()
//   {
//       System.out.printf("Hello %s\n", name);
//   }
}
