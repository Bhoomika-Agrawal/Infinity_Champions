
import java.util.*;

public class Person_Sorting {
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
        ll.add(new Person("bhumi",150,18));
        ll.add(new Person("bhumi",162,19));
        ll.add(new Person("bhumi",167,19));
        ll.add(new Person("bhumi",155,19));
        Collections.sort(ll,new Comparator<Person>() {
            @Override
            public int compare(Person p1,Person p2){
                if(p1.age!=p2.age){
                    return p2.age-p1.age;
                }
                else if(p1.height!=p2.height){
                    return p2.height-p1.height;
                }
                else{
                    return p1.name.compareTo(p2.name);
                }
            }
        });
        Collections.sort(ll,(a,b)-> Integer.compare(a.height,b.height));
        for(Person p : ll){
            System.out.println(p.name+" "+p.height+" "+p.age);
        }
    }

}
