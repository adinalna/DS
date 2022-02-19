package DS_Test;
/**
 *
 * @author adina
 */
import java.util.PriorityQueue;

public class Q4main {
    public static void main(String[] args) {
        PriorityQueue<Passenger> p = new PriorityQueue<>();

        p.add(new Passenger("Susan","Road 0.9"));
        p.add(new Passenger("Jack","Road 5.5"));
        p.add(new Passenger("Benjamin","Road 1.6"));
        p.add(new Passenger("Rachel","Road 3.8"));
        p.add(new Passenger("Samuel","Road 4.1"));
        p.add(new Passenger("Kenneth","Road 2.6"));

        System.out.println("Passenger Drop-off List");
        dropPassenger(p);
        

    }

    public static void dropPassenger(PriorityQueue<Passenger> a){
        double current;
        Passenger drop = a.peek();
        while((drop=a.poll())!=null){
            current = drop.distance;
            if(current>=0.2&&current<1.7)
                System.out.print("Stop A: ");
            else if(current>=1.7&&current<2.7)
                System.out.print("Stop B: ");
            else if(current>=2.7&&current<3.7)
                System.out.print("Stop C: ");
            else if(current>=3.7&&current<4.7)
                System.out.print("Stop D: ");
            else
                System.out.print("Stop E: ");
            System.out.println(drop.name);
        }
    }


}
