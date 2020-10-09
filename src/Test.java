import java.util.ArrayList;
public class Test {

    public static void main(String [] args) {

        ArrayList<ImmutableCat>myImmutableCat = new ArrayList<>();

        ImmutableCat first = new ImmutableCat("Bengal", "green");
        ImmutableCat second = first.setBreed("Sphynx");
        first.setBreed("sybirian");

        System.out.println("-----");

        myImmutableCat.add(first);
        myImmutableCat.add(second);

        for (ImmutableCat imu : myImmutableCat) {
        System.out.println(imu);
    }

    /*за допомогою об'єкту класу StringBuffer і ArrayList в який я помістив об'єкти - довів що перший
    * об'єкт (first) залишається не змінний*/

    }
}



