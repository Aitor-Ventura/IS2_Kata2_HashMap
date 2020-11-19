import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) throws Exception {
        int[] array = {1,2,3,4,5,6,1,2,3,1,1,2,3};
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++){
            if (hashMap.containsKey(array[i])) hashMap.put(array[i], hashMap.get(array[i])+1);
            else hashMap.put(array[i], 1);
        }

        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
