package view.frame;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[] solution(int region, int num, int[][] info) {
        int[] answer = {};
        int rank = 0;
        int rankIdx = 0;
        int total[] = new int[info.length];
        int score[] = new int[info.length];
        for (int i = 0; i < info.length; i++) {
            score[i] = (info[i][1] + 1) * 2 + (info[i][2] + 2) + (info[i][3] + 1) * 5;
        }
        for (int i = 1; i < info.length; i++) {
            if (region == info[i][0]) {
                if (score[i] > score[rankIdx]) {
                    total[i] = rank;
                    rank++;
                total[rankIdx] =rank;
                }else if(score[i] == score[rankIdx]){
                    score[i] = rank;

                }
            } else if
        }
        return answer;
    }

    public static void main(String[] args) {
//        solution(2, 4, Arrays.asList(new int[]{1, 0, 2, 1}, Arrays.asList(2, 6, 5, 2), Arrays.asList(3, 10, 2, 4), Arrays.asList(1, 1, 5, 6), Arrays.asList(2, 7, 10, 2), Arrays.asList(3, 8, 6, 3)),List.of(
//        -1, 2, 3, 4, 1, -1));
    }
}
