package Trie;
import java.util.*;

public class Trie {
	
	public static class TrieNode {
		// map will have trienode mapped to the character
		Map<Character, TrieNode> children; // declare a children map
		boolean endOfWord = false;
		
		public TrieNode () {
			this.children = new HashMap<>();
			this.endOfWord = false;
		}
		
	}
	
	// declare  a trie root here make it a private static
	public TrieNode root = new TrieNode();
	
	
	// lets insert a word in the trie iteratively
	
	public void insert (String word) {
		// point to the root and we will traverse to know if we can go to the word
		TrieNode current = root;
		
		for (int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			System.out.print(ch + " ");
			// check if we have ch in children of the map
			// key:val character:trinode
			TrieNode temp = current.children.get(ch);
			// temp will be null if we dont have entry fot ch
			if (temp == null) {
				// we add this to trie
				temp = new TrieNode();
				current.children.put(ch, temp);
			}
			current = temp;
		}
		current.endOfWord = true;
	}
	
	public boolean search (String word) {
		TrieNode current = root;
		
		for (int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			TrieNode temp = current.children.get(ch);
			
			if (temp == null) {
				return false;
			}
			current = temp;
		}
		
		return current.endOfWord;
		// return false;
	}
	
	public void deleteWord (String word) {
		TrieNode current = root;
		int pos  = 0;
		delete(current, word, pos);
	}
	
	public void delete (TrieNode root, String word, int pos) {
		// check if the position if == length of word
		if (pos == word.length()) {
			
		}
	}
	
	public static void main(String[] args) {
		Trie node = new Trie();
		String word = "nachiket";
		node.insert(word);
		System.out.println(node.search(word));
		node.deleteWord(word);
	}

}