package Leet;

import java.util.*;

/**
 * Created by B0200901 on 6/13/2018
 */
public class Itinerary {

    public List<String> findItinerary(String[][] tickets) {
        LinkedList<String> result = new LinkedList<>();
        Map<String, PriorityQueue<String>> adj = new HashMap<>();

        for(int i=0; i<tickets.length; i++){
            if(adj.containsKey(tickets[i][0])){
                PriorityQueue<String> list = adj.get(tickets[i][0]);
                list.add(tickets[i][1]);
                adj.put(tickets[i][0], list);
            }
            else {
                PriorityQueue<String> list = new PriorityQueue<>();
                list.add(tickets[i][1]);
                adj.put(tickets[i][0], list);
            }
        }

        findItineraryUtil("JFK", adj, result);
        return result;
    }

    void findItineraryUtil(String source, Map<String, PriorityQueue<String>> adj, LinkedList<String> list){

        PriorityQueue<String> destinations = adj.get(source);

        while ((destinations != null) && (!destinations.isEmpty())){
            findItineraryUtil(destinations.poll(), adj, list);
        }
        list.addFirst(source);
    }

}
