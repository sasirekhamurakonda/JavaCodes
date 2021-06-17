package Flipkart;

import java.util.*;
import java.lang.*;
import java.io.*;

class Trie {
    //Assuming only lowercase letters
    private String charset = "abcdefghijklmnopqrstuvwxyz";

    private class TrieNode {
        TrieNode[] children = new TrieNode[charset.length()];
        boolean isEndOfWord = false;
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    private int getIndex (char c) {
        for (int i = 0; i < charset.length(); i++) {
            if (charset.charAt(i) == c) {
                return i;
            }
        }

        return -1;
    }

    public void insert (String key) {
        //Iterate over the key
        TrieNode trieNode = root;
        for (int i = 0; i < key.length(); i++) {
            int index = getIndex(key.charAt(i));
            if (trieNode.children[index] == null) {
                //Create trieNode if child not in use
                trieNode.children[index] = new TrieNode();
            }

            //Move down to next node
            trieNode = trieNode.children[index];
        }
        //Mark end of word
        trieNode.isEndOfWord = true;
    }

    public boolean search (String key) {
        //Iterate over the key
        TrieNode trieNode = root;
        for (int i = 0; i < key.length(); i++) {
            int index = getIndex(key.charAt(i));
            if (trieNode.children[index] == null) {
                //No child with given character
                return false;
            }

            //Move down to next node
            trieNode = trieNode.children[index];
        }

        //Mark end of word
        return trieNode != null && trieNode.isEndOfWord;
    }

    private boolean isEmpty(TrieNode trieNode) {
        if (trieNode == null) {
            return true;
        }

        for (int i = 0; i < charset.length(); i++) {
            if (trieNode.children[i] != null) {
                return false;
            }
        }

        return true;
    }

    private TrieNode removeUtil (TrieNode trieNode, String key, int depth) {
        if (trieNode == null) {
            return trieNode;
        }

        if (depth == key.length()) {
            trieNode.isEndOfWord = false;
        } else {
            int index = getIndex(key.charAt(depth));
            trieNode.children[index] = removeUtil(trieNode.children[index], key, depth + 1);
        }

        if (isEmpty(trieNode) && trieNode.isEndOfWord == false) {
            trieNode = null;
        }

        return trieNode;
    }

    public void remove (String key) {
        TrieNode trieNode = root;
        removeUtil (trieNode, key, 0);
    }

    private void keysUtil (TrieNode trieNode, char currString[], int level, List<String> keySet) {
        if (trieNode.isEndOfWord) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < level; i++) {
                sb.append(currString[i]);
            }
            keySet.add(sb.toString());
        }

        for (int i = 0; i < charset.length(); i++) {
            if (trieNode.children[i] != null) {
                currString[level] = charset.charAt(i);
                keysUtil (trieNode.children[i], currString, level + 1, keySet);
            }
        }

    }

    public List<String> keys () {
        TrieNode trieNode = root;
        List<String> keySet = new ArrayList<String>();

        if (trieNode == null) {
            return keySet;
        }

        char[] currString = new char[100];

        keysUtil(trieNode, currString, 0, keySet);

        return keySet;
    }
}

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class WorkAtTech
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Trie trie = new Trie();

        trie.insert("bye");
        trie.insert("their");
        trie.insert("any");
        trie.insert("a");
        trie.insert("there");
        trie.insert("answer");
        trie.insert("by");
        trie.insert("the");

        System.out.println(trie.search("a") ? 1 : 0);
        System.out.println(trie.search("answer") ? 1 : 0);
        System.out.println(trie.search("any") ? 1 : 0);
        System.out.println(trie.search("by") ? 1 : 0);
        System.out.println(trie.search("bye") ? 1 : 0);
        System.out.println(trie.search("the") ? 1 : 0);
        System.out.println(trie.search("their") ? 1 : 0);
        System.out.println(trie.search("there") ? 1 : 0);


        trie.remove("bye");
        trie.remove("their");
        trie.remove("any");
        trie.remove("a");

        System.out.println("After removing few keys");
        System.out.println(trie.search("a") ? 1 : 0);
        System.out.println(trie.search("answer") ? 1 : 0);
        System.out.println(trie.search("any") ? 1 : 0);
        System.out.println(trie.search("by") ? 1 : 0);
        System.out.println(trie.search("bye") ? 1 : 0);
        System.out.println(trie.search("the") ? 1 : 0);
        System.out.println(trie.search("their") ? 1 : 0);
        System.out.println(trie.search("there") ? 1 : 0);

        System.out.println("Printing key set");
        List<String> keySet = trie.keys();
        for (int i = 0; i < keySet.size(); i++) {
            System.out.println(keySet.get(i));
        }
    }
}