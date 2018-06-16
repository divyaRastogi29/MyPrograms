package Leet;

import java.util.*;

/**
 * Created by B0200901 on 5/31/2018
 */

public class CourseScheduleTwo {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int[] result = new int[numCourses];

        Set<Integer> visited = new HashSet<>();

        Deque<Integer> stack = new ArrayDeque<>();

        LinkedList<Integer>[] adj = new LinkedList[numCourses];
        for(int i=0; i<numCourses; i++){
            adj[i] = new LinkedList<>();
        }

        for(int i=0; i<prerequisites.length; i++){
            adj[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        for(int i=0; i<numCourses; i++){
            if(visited.contains(i))
                continue;
            findOrderUtil(i, visited, adj, stack);
        }
        int i=0;
        while(!stack.isEmpty()){
            result[i++]=stack.removeLast();
        }
        return result;

    }

    private void findOrderUtil(int i, Set<Integer> visited, LinkedList<Integer>[] adj, Deque<Integer> stack) {
        visited.add(i);

        Iterator<Integer> iterator = adj[i].iterator();

        while (iterator.hasNext()){
            int preRequisite = iterator.next();
             if(visited.contains(preRequisite))
                 continue;
             findOrderUtil(preRequisite, visited, adj, stack);
        }
      stack.offerFirst(i);
    }
}
