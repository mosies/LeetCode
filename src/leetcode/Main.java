package leetcode;

import java.util.Arrays;

import ordenamiento.QuickSort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//456
		ListNode node1 = new ListNode(5, new ListNode(6, new ListNode(4)));
		//321
		ListNode node6 = new ListNode(3, new ListNode(2, new ListNode(1)));
		SolutionAddTwoNumbers sn = new SolutionAddTwoNumbers();
		ListNode res = sn.addTwoNumbers(node1, node6);
		while(res != null) {
			System.out.println(res.val);
			res = res.next;
		}
		*/
		
		/*
		//Most frequent elements on an array
		MostFrequentKElements mostFE = new MostFrequentKElements();
		String[] array = {"hola", "adios", "hola", "hola", "saludos", "adios","otro"};
		int k = 3;
		//deberia de imprimir hola y adios
		System.out.println(mostFE.mostFElements(array, k));
		System.out.println("-----con lambda-------");
		System.out.println(mostFE.mostFElementsLamda(array, k));
		*/
		
		/*
		// sum 3 numbers
		Sum3numbers s3 = new Sum3numbers();
		int[] nums = {-1,0,1,2,-1,-4};
		QuickSort quickSort = new QuickSort();
		quickSort.sort(nums);
		System.out.println(Arrays.toString(nums));
		//System.out.println(s3.threeSum(nums));
		*/
		
		
		//longest common prefix
		String[] words = {"ab","a"};
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		System.out.println(lcp.longestCommonPrefix(words));
		
		/*
		//Sum 3 closes
		int target = 1;
		int[] numArr = {-1,2,1,-4};
		Sum3Closest sum3Closest = new Sum3Closest();
		System.out.println(sum3Closest.threeSumClosest(numArr, target));
		*/

		/*
		//Merge 2 sorted list
		Merge2SortedLists merge2SortedLists = new Merge2SortedLists();
		ListNode res = merge2SortedLists.mergeTwoList(node6, node1);
		while(res.next != null) {
			System.out.println(res.val);
			res = res.next;
		}
		*/
		
		/*
		//Pow implementation
		Pow pow = new Pow();
		System.out.println(pow.myPow(2.00000, -2));
		*/
		
		
		/*
		Divide2Numbers d2n = new Divide2Numbers();
		int res = d2n.divide(-2147483648, 2);
		System.out.println(res);
		*/

/*
		//Find First and Last Position of Element in Sorted Array
		int[] nums = {5,7,7,8,8,10};
		FirstAndLastPositionSortedArray flpa = new FirstAndLastPositionSortedArray();
		int[] res =  flpa.searchRange(nums, 8);
		for(int n : res) {
			System.out.println(n);
		}
		*/
		
		/*
		//SwapNodesInPairs
		SwapNodesInPairs swap = new SwapNodesInPairs();
		ListNode res = swap.swapPairs(node1);
		while(res != null) {
			System.out.println(res);
			res = res.next;
		}
		*/
		
		/*
		//Longest SubsTring without repeting characters
		LongestSubstringWithoutRepetingCharacters ls = new LongestSubstringWithoutRepetingCharacters();
		System.out.println(ls.lengthOfLongestSubstring("abcabcbb"));
		*/

		
		//Last Stone Weigth II
		LastStoneWeigthII lswII = new LastStoneWeigthII();
		System.out.println(lswII.lastStoneWeightII(new int[]{1,1,2,3,5,8,13,21,34,55,89,14,23,37,61,98}));
	}
}
