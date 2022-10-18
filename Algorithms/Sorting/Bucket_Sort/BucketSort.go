/*
Bucket sort, or bin sort, is a sorting algorithm that works by distributing the elements of an array into a number of buckets. Each bucket is then sorted individually, either using a different sorting algorithm, or by recursively applying the bucket sorting algorithm.
*/

package main

import (
	"fmt"
	"os"
	"strconv"
)

// Method for Insertion Sort containig array in Float
func insertionSort(array []float64) {
	for i := 0; i < len(array); i++ {
		temp := array[i]
		j := i - 1
		for ; j >= 0 && array[j] > temp; j-- {
			array[j+1] = array[j]
		}
		array[j+1] = temp
	}
}

// Method for bucketSort
func bucketSort(array []float64, bucketSize int) []float64 {
	var max, min float64
	for _, n := range array {
		if n < min {
			min = n
		}
		if n > max {
			max = n
		}
	}
	nBuckets := int(max-min)/bucketSize + 1
	buckets := make([][]float64, nBuckets)
	for i := 0; i < nBuckets; i++ {
		buckets[i] = make([]float64, 0)
	}
	// for loop to iterate the range of an array
	for _, n := range array {
		idx := int(n-min) / bucketSize
		buckets[idx] = append(buckets[idx], n)
	}

	sorted := make([]float64, 0)
	for _, bucket := range buckets {
		if len(bucket) > 0 {
			insertionSort(bucket)
			sorted = append(sorted, bucket...)
		}
	}
	// returns sorted array
	return sorted
}

// main method from where program starts execution
func main() {

	
	// static array
	array :=[]float64{4, 1, 1, 3, 2, 2, 7, -6, 0}
	for _, arg := range os.Args[1:] {
		if n, err := strconv.ParseFloat(arg, 64); err == nil {
			array = append(array, n)
		}
	}
	fmt.Printf("Before Bucket Sort %v\n", array)
	// calling method bucket sort
	array = bucketSort(array, 5)
	fmt.Printf("After Bucket Sort %v\n", array)
}
