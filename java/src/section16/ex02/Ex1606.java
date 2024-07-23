package section16.ex02;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex1606 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // 추가
        long startTime = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        long endTime = System.nanoTime();

        long duration = endTime - startTime;
        System.out.println("arrayList 추가 소요시간: " + duration);


        startTime = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }

        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("linkedList 추가 소요시간: " + duration);


        // 반환
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }

        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("arrayList 반환 소요시간: " + duration);


        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }

        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("linkedList 반환 소요시간: " + duration);


         // 산입
         startTime = System.nanoTime();

         for (int i = 0; i < 10000; i++) {
             arrayList.add(i, i);;
         }
 
         endTime = System.nanoTime();
 
         duration = endTime - startTime;
         System.out.println("arrayList 산입 소요시간: " + duration);
 
 
         startTime = System.nanoTime();
 
         for (int i = 0; i < 10000; i++) {
             linkedList.add(i, i);
         }
 
         endTime = System.nanoTime();
 
         duration = endTime - startTime;
         System.out.println("linkedList 산입 소요시간: " + duration);



          // 삭제
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            arrayList.remove(i);
        }

        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("arrayList 삭제 소요시간: " + duration);


        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            linkedList.remove(i);
        }

        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("linkedList 삭제 소요시간: " + duration);
    }
}
