package exmplesChap10;

public class pair<T ,U> {
    //variables
      T first;
      U second;

      //constrictor with parameters
      public pair(T first, U second) {
          this.first = first;
          this.second = second;

      }

//two methods of get(read only)
    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    //to_string method
    public String toString() {
        return "pair{" +
                "first=" + first +
                ", second=" + second +'}';
    }

// main method
    public static void main(String[] args) {
          pair<String,Integer> pair = new pair<>("Sabrine", 20);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);



    }
}
