package exercises.java;
import exercises.java.DataObject;
        
public class Exercise3 {
    public static void main(String[] args) {
        DataObject[] numeMerge = new DataObject[3];
        int sum = 0;
        DataObject object1 = new DataObject();
        DataObject object2 = new DataObject();
        DataObject object3 = new DataObject();
        object1.count = 5;
        object2.count = 7;
        object3.count = 10;
        numeMerge[0] = object1;
        numeMerge[1] = object2;
        numeMerge[2] = object3;

        for (int i = 0; i <numeMerge.length ; i++) {
            sum += numeMerge[i].count;

        }
        System.out.println(sum);
    }
}
