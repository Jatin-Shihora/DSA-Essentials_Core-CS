using System;
using System.Collections;
using System.Collections.Generic;

class BucketSort {

	public static void bucketSort(float []arr, int numOfBuckets)
	{
		if (numOfBuckets <= 0)
		return;

		// create empty buckets
		List<float>[] buckets = new List<float>[numOfBuckets];
    	for (int i = 0; i < numOfBuckets; i++) 
		{
		buckets[i] = new List<float>();
		}

		// distributing elements to different buckets
		for (int i = 0; i < numOfBuckets; i++) 
		{
		float temp = arr[i] * numOfBuckets;
		buckets[(int)temp].Add(arr[i]);
		}

		// Sorting is done here
		for (int i = 0; i < numOfBuckets; i++) 
		{
		buckets[i].Sort();
		}

		// Concatination is done here
		int index = 0;
		for (int i = 0; i < numOfBuckets; i++) 
		{
			for (int j = 0; j < buckets[i].Count; j++)
			{
				arr[index++] = buckets[i][j];
			}
		}
	}


	// Main method
	public static void Main()
	{
		float []arr = new float[] { 0.276F,  0.612F,0.119F, 0.7F,0.99F, 0.448F};

		int n = arr.Length;
		bucketSort(arr, n);

		Console.WriteLine("Sorted array is ");
		foreach(float element in arr) 
		{
			Console.Write(element + " ");
		}
	}
}

