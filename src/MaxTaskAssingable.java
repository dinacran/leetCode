//https://leetcode.com/problems/maximum-number-of-tasks-you-can-assign/

import java.util.Arrays;

void main(){

    System.out.println(maxTaskAssign(new int[]{5,9,8,5,9}, new int[]{1,6,4,2,6}, 1, 5));
}

public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {

    Arrays.sort(tasks);
    Arrays.sort(workers);

    // Arrays.

    int assignableTasksCount = 0;

    for (int i = 0, j = 0; i < tasks.length && i < workers.length; i++){
        if(tasks[j] <= workers[i]){

            assignableTasksCount++;
            j++;

        }
        else if(pills > 0 && workers[i] + strength >= tasks[j]){
            assignableTasksCount++;
            pills--;
            j++;
        }
    }

    return assignableTasksCount;
        
}
