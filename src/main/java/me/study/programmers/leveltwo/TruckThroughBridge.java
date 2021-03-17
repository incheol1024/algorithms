package me.study.programmers.leveltwo;

import java.util.ArrayDeque;
import java.util.Queue;

public class TruckThroughBridge {

    public static void main(String[] args) {
        TruckThroughBridge bridge = new TruckThroughBridge();

//        int bridgeLength = 2;
        int bridgeLength = 100;
//        int weight = 10;
        int weight = 100;
//        int[] truckWeights = {7, 4, 5, 6};
        int[] truckWeights = {10,10,10,10,10,10,10,10,10,10};
        int solution = bridge.solution(bridgeLength, weight, truckWeights);
        System.out.println(solution);
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new ArrayDeque<>();
        int index = 0;
        int remainWeight = weight;
        int time = 0;

        while (index < truck_weights.length) {
            time++;

            if(queue.size() == bridge_length) {
                Integer poll = queue.poll();
                remainWeight = remainWeight + poll;
            }

            if (remainWeight >= truck_weights[index]) {
                queue.add(truck_weights[index]);
                remainWeight = remainWeight - truck_weights[index];
                index++;
                continue;
            }

            if (remainWeight < truck_weights[index]) {
                queue.add(0);
            }

        }

        time = time + bridge_length;


        return time;
    }

}
