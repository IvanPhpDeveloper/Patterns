package Pattern.Iterator;



public class JavaDebeloperRunner {
    public static void main(String[] args) {
        String [] skills={"Java","Spring","Hibbernate","Maven","PostgraceSQL"};
         JavaDeveloper javaDeveloper=new JavaDeveloper("Taranenko Ivan",skills);

         Iterator iterator=javaDeveloper.getIterator();
        System.out.println("Developer "+javaDeveloper.getName());
        System.out.println("Skills: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString()+" ");
        }
    }
}
