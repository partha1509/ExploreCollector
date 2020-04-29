import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class ExploreCollector {
//    int a=10;
//    static CompletableFuture<String> supplier(){
//        return CompletableFuture.supplyAsync(()-> supply());
//    }
//    static String supply(){
//
//        return "Completable future";
//    }

public void myMethod(){

}
enum MYENUM{
    A,B,C
}
    public static void main(String[]args){
//        supplier().thenApplyAsync(data-> data.toUpperCase())
//                .thenAccept(System.out::println)
//                .thenRun(()-> System.out.println("We are done"))
//                .thenRun(()-> System.out.println("Not Yet"))
//                .thenRun(()-> supply());

//             String firstString= "G";
//             String secondString= "Geeks";
//
//                 String result="";
//            System.out.println(firstString.length());
//
//        for(int j=0; j<firstString.length(); j++){
//            for(int i=j; i<firstString.length()-j; i++){
//                String temp= firstString.substring(j,firstString.length()-i);
//            boolean flag= secondString.contains(temp);
//            if(flag){
//                if( result.length()<temp.length()){
//                    result=temp;
//                }
//            }
//
//            }
//        }
//
//        System.out.println(result);

//        String str= "1 3 4 6 67 7 75 5 5 5 5 5 6 6 6 7 8 8 8 89 9 9 9";
//
//        String[] array= {};
//        array= str.split(" ");
//        int flag=1;
//
//        for(int i=0; i< array.length; i++){
//            String first= array[i];
//            int j=i+1;
//            String second= array[j];
//
//            if(first.equals(second)){
//                flag++;
//            }else{
//                i++;
//                System.out.print(flag+ " "+ first +" ");
//            }
//        }


        String time= "label in (&quot;mssgcntr&quot;,&quot;powerplan_all&quot;,&quot;problem_all&quot;,&quot;education_all&quot;,&quot;orders_all&quot;,&quot;medrec_all&quot;,&quot;pc_inpatient&quot;,&quot;diagnosis_provider&quot;,&quot;histories_all&quot;,&quot;dyndoc_all&quot;,&quot;discharge_provider&quot;,&quot;handoff_phys&quot;,&quot;medrec_inpt&quot;,&quot;allhospitalproviders_nondragon&quot;,&quot;allprovidersvideo&quot;) and space = &quot;LRSMNH&quot; and type = &quot;page&quot;";
        String first= time.replace("&quot;)","").replaceAll("&quot;","").replaceAll("and"," ").replaceAll("space(.*)","").replace("label in (","").replaceAll("type =(.*)", "").replaceAll("'","");

        System.out.println(first);


    }
}
