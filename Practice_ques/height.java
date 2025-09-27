import java.util.*;


public class height {
    static class Person implements Comparable<Person> {
        String name;
        int height;
        int age;
        Person(String name,int height,int age){
            this.name=name;
            this.height=height;
            this.age=age;
        }
        @Override
        public int compareTo(Person o){
            return this.height-o.height;
        }
    }
    public static void main(String[] args) {
        ArrayList<Person> ll=new ArrayList<>();
        ll.add(new Person("bhumi",150,19));
        ll.add(new Person("bhumi",148,19));
        ll.add(new Person("bhumi",162,19));
        ll.add(new Person("bhumi",167,19));
        ll.add(new Person("bhumi",155,19));
        Collections.sort(ll);
        for(Person p : ll){
            System.out.println(p.name+" "+p.height+" "+p.age);
        }
    }
}
