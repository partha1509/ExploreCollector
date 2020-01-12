import java.util.Objects;
@FunctionalInterface
public interface PersonUtilities<T extends Object> {
    public void getResult();
    default boolean checkEquality(T t, T t1){
        return Objects.isNull(t) || Objects.isNull(t1) ? false
                :Objects.deepEquals(t,t1)? true
                :false;
    }

   static String greet(){
      final String greetMessage = "Let start the Collectors Exploration in Java 8+";
       return greetMessage;
    }
}
