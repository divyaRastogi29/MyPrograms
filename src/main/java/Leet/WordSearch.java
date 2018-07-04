package Leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by B0200901 on 6/20/2018
 */
public class WordSearch {
    private final TrieNode root;

    public WordSearch() {
        root = new TrieNode();
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> resultList = new ArrayList<>();
        boolean[][] visited = new boolean[board.length][board[0].length];

        for(int i=0; i<words.length; i++)
            insert(words[i]);

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; i++){
                wordSearchDfs(board, i, j, visited,"", resultList);
            }
        }
        return resultList;
    }

    private void wordSearchDfs(char[][] board, int i, int j,boolean[][] visited, String toSearch, List<String> resultList) {

        if(i<0 || i>=board.length || j<0 || j>=board[0].length)
            return;
        if(visited[i][j])
            return;

       char c = board[i][j];
        toSearch += c;

        if(!startsWith(toSearch))
            return;

        if(search(toSearch)){
            resultList.add(toSearch);
        }
        visited[i][j]=true;
      if(i>0)
          wordSearchDfs(board, i-1, j,visited, toSearch, resultList);
        if(j>0)
            wordSearchDfs(board, i,j-1,visited, toSearch, resultList);
        if(i<board.length)
            wordSearchDfs(board, i+1, j,visited, toSearch, resultList);
        if(j<board.length)
            wordSearchDfs(board, i, j+1,visited, toSearch, resultList);
        visited[i][j]=false;
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode current = root;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null){
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.word = word;
        current.endOfWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {

        TrieNode current = root;
        for(int i=0;i <word.length(); i++){
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null)
                return false;
            current = node;
        }
        return current.endOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for(int i=0; i<prefix.length(); i++){
            char ch = prefix.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null){
                return false;
            }
            current = node;
        }

        return true;
    }


    private class TrieNode{
        Map<Character, TrieNode> children;
        boolean endOfWord;
        String word;

        public TrieNode(){
            children = new HashMap<>();
            endOfWord = false;
        }
    }

}
