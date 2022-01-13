package com.hillel.lesson_06.task;

public class PusUp {
    public static void main(String[] args) {
        int numberOfRepetition = 4;

        int work = 5;
        int pause = 60;
        int totalTime = 0;
        int countPushUp = 0;

        for (int i = 1; i <= numberOfRepetition; i++){
            System.out.println("Repetition : " + i);
            for (int j = 1; j <=i; j ++){
                countPushUp++;
                System.out.print("#");
                totalTime +=work;
            }
            System.out.println();

            if (i == 1) {
                totalTime +=pause;
                System.out.println("pause time " + pause);
            } else if (i == numberOfRepetition) {
                continue;
            } else {
                pause *= 1.2;
                totalTime +=pause;
                System.out.println("pause time " + pause);
            }
        }

        System.out.println("total number pushUp : " + countPushUp);
        System.out.println("total time pushUp : " + totalTime + " s");
        System.out.println("total time pushUp (mm:ss) : " + totalTime / 60 + ":" + totalTime % 60);


    }
}
