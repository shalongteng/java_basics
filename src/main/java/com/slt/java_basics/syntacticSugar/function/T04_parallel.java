package com.slt.java_basics.syntacticSugar.function;

import com.slt.java_basics.syntacticSugar.pstream.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

/**
 * 数据并行化操作
 *   数据并行化会先对数据进行分块，然后对每块数据开辟线程进行运算，这些地方会花费额外的时间。
 *   并行化操作只有在 数据规模比较大 或者 数据的处理时间比较长 的时候才能体现出优势，
 *   所以并不是每个地方都需要让数据并行化，应该具体问题具体分析。
 */
public class T04_parallel {
    public List<Integer> list;
    @Before
    public void list(){
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }

    /**
     * Stream.parallel
     */
    @Test
    public void testParallel01(){
        int sumSize = Stream.of("Apple", "Banana", "Orange", "Pear")
                .parallel()
                .map(s -> s.length())
                .reduce(Integer::sum)
                .get();
        System.out.println(sumSize);
    }

    /**
     * list.parallelStream()
     */
    @Test
    public void testParallel02(){
        List<Student> list = new ArrayList<Student>();
        for(int i=1;i<1000000;i++){
            list.add(new Student(Integer.toString(i),(int)(Math.random()*100)+20));
        }
        long b=System.currentTimeMillis();
//		double ave=list.parallelStream().mapToInt(s->s.score).average().getAsDouble();
        double ave=list.stream().mapToInt(s->s.score).average().getAsDouble();

        long e=System.currentTimeMillis();
        System.out.println("cal spend time:"+(e-b)+"ms");
        System.out.println(ave);
    }

    /**
     * Arrays.parallelSetAll
     * Arrays.parallelSort(arr);
     */
    @Test
    public void testParallel03(){
        Random r=new Random();
        int[] arr=new int[10000000];


        long b=System.currentTimeMillis();
        Arrays.setAll(arr, (i)->r.nextInt());
        Arrays.parallelSetAll(arr, (i)->r.nextInt());
        long e=System.currentTimeMillis();
        System.out.println("set spend time:"+(e-b)+"ms");

        b=System.currentTimeMillis();
        Arrays.parallelSort(arr);
        Arrays.sort(arr);
        e=System.currentTimeMillis();

        System.out.println("sort spend time:"+(e-b)+"ms");
    }

}
