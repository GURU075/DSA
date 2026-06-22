package Queuee;

import java.util.ArrayList;
import java.util.List;

public class DequeImpl {
   int[] array ;
    int size = 0;
    int capacity ;
    int front = 0;

    public DequeImpl(int s) {
        this.array = new int[s];
        this.capacity = s;
    }
    public void insertFront(int num){
        if(size==capacity){
            return;
        }
           array[front++] =num;
           size++;
    }
    public void insertRear(int num){
        if(size==capacity){
            return;
        }
//        array[]

    }
}
