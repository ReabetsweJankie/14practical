//comment 1
import java.util.*;

public class HashExperiment{

    static final int N=1<<20;
    static final int DATA SIZE = 950 000;
    static final int M 1_000_003;
    static final int RUNS =30;
    
    static KeyValue[] data =new KeyValue[DATA_SIZE];
    //comment 2
    
    static void prepareData(){
        Integer[] keys = new Integer[N];

        for(int i =0; i<N; i++)
        keys[i] = i+1;

        List<Intgers> list = Array.asList(keys);
        Collections.shuffle(list);

        for(int i =0; i<DATA SIZE; i++)
        data[i] = new KeyValue(String.valueOf(list.get(i)), String.valueOf(i+1));
    }
    //comment 3
    }
}