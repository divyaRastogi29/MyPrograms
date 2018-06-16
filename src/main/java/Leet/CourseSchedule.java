package Leet;

import java.util.*;

/**
 * Created by b0200901 on 6/6/2018
 */
public class CourseSchedule {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int[] result = new int[numCourses];
        Deque<Integer> stack = new ArrayDeque<>();
        Set<Integer> white = new HashSet<>();
        Set<Integer> grey = new HashSet<>();
        Set<Integer> black = new HashSet<>();

        LinkedList<Integer>[] adj = new LinkedList[numCourses];

        for(int i=0; i<numCourses; i++){
            adj[i] = new LinkedList<>();
            white.add(i);
        }

        for(int i=0; i<prerequisites.length; i++){
            adj[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        while(white.size()>0){
            int course = white.iterator().next();
            boolean isCycle =  canFinishUtil(course, white, grey, black, adj, stack);
            if(!isCycle) {
                return new int[0];
            }
        }
        int i=0;
        while(!stack.isEmpty()){
            result[i++]=stack.removeLast();
        }
        return result;
    }

    private boolean canFinishUtil(int course, Set<Integer> white, Set<Integer> grey, Set<Integer> black,
                                  LinkedList<Integer>[] adj, Deque<Integer> stack){
        moveBetweenSets(course, white, grey);

        Iterator<Integer> pre$requisites = adj[course].iterator();
        while (pre$requisites.hasNext()){
            int preRequisite = pre$requisites.next();

            if(black.contains(preRequisite))
                continue;

            if(grey.contains(preRequisite))
                return false;

            if(!canFinishUtil(preRequisite, white, grey, black, adj, stack))
                return false;
        }
        moveBetweenSets(course, grey, black);
        stack.offerFirst(course);
        return true;
    }

    private void moveBetweenSets(int course, Set<Integer> source, Set<Integer> destination){
        source.remove(course);
        destination.add(course);
    }
}
