import java.util.*;

public class heightUsingComparator {
    static class Person  {
        String name;
        int height;
        int age;
        Person(String name,int height,int age){
            this.name=name;
            this.height=height;
            this.age=age;
        }

    }
    public static void main(String[] args) {
        ArrayList<Person> ll=new ArrayList<>();
        ll.add(new Person("bhumi",150,19));
        ll.add(new Person("bhumi",148,19));
        ll.add(new Person("bhumi",162,19));
        ll.add(new Person("bhumi",167,19));
        ll.add(new Person("bhumi",155,19));
        // Collections.sort(ll,new Comparator<Person>() {
        //     @Override
        //     public int compare(Person p1,Person p2){
        //         return p2.height-p1.height;
        //     }
        // });
        Collections.sort(ll,(a,b)-> Integer.compare(a.height,b.height));
        for(Person p : ll){
            System.out.println(p.name+" "+p.height+" "+p.age);
        }
    }
}
