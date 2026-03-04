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
    public static void main(String[]args){
        prepareData();
        System.out.println("Load\tOpen\tChained");
        or(int load = 75; load<=95; load+=5){
            int n = Data_SIZE *load/100;

            long open = testOpen(n);
            long chained = testChained(n);
            System.out.println(load + "%\t" + open + "\t" + chained);
        }
    }
    static long testOpe(int n){
        long total =0;
        for(int r=0; r<RUNS; r++){
            OpenHash = new OpenHash(M);
            for(int i =0; int<n; i++)
            h.insert(data[i].key, data[i].value)

            long start = System.nanoTime();

            for(int i =0; i<1000; i++)
            h.lookup(data[i].key);
            long end = System.nanoTime();
            total = (end-start);
            urn total/RUNS;
            //comment 4
            static long testChained(int n){
                long total =0;
                for(int r =0; r<RUNS; r++){
                    ChainedHash h =new ChainedHash(M);

                    for(int i=0; i<n; i++)
                    h.insert(data[i].key, data[i].value);
                    
                    long start= System.nanoTime();

                    for(int i =0; i<1000; i++)
                    h.lookup(data[i].key);

                    long end = System.nanoime();

                    total += (end - start);
                }
                return total/Runs;
                //comment 6
                }
            }
        }
    }

        }

    }
    }
}