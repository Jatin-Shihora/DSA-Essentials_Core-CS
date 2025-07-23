import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    // Ask user how many elements they want to sort
    print("Enter the number of elements: ")
    val n = input.nextInt()

    // Handle case when user enters 0 or negative
    if (n <= 0) {
        println("Array must contain at least one element.")
        return
    }

    // Create an array to store the input numbers
    val arr = IntArray(n)
    println("Enter $n space-separated integers:")
    for (i in 0 until n) {
        arr[i] = input.nextInt()
    }
    input.close()

    // Sort the array using Binary Insertion Sort
    insertionSort(arr, n)

    // Print the sorted array
    println("Sorted array:")
    println(arr.joinToString(", "))
}

// This function finds the correct position to insert the element
// using binary search in the sorted part of the array
fun binarySearch(arr: IntArray, target: Int, low: Int, high: Int): Int {
    var l = low
    var h = high

    while (l <= h) {
        val mid = l + (h - l) / 2

        // If element matches, insert after it
        if (target == arr[mid]) return mid + 1

        // If element is greater, search right side
        else if (target > arr[mid]) l = mid + 1

        // Else search left side
        else h = mid - 1
    }

    // Final insert position
    return l
}

// This function sorts the array using binary insertion sort logic
fun insertionSort(arr: IntArray, n: Int) {
    for (i in 1 until n) {
        val current = arr[i]

        // Find position to insert current element
        val pos = binarySearch(arr, current, 0, i - 1)

        // Shift all bigger elements to the right
        var j = i - 1
        while (j >= pos) {
            arr[j + 1] = arr[j]
            j--
        }

        // Insert current element at its position
        arr[j + 1] = current
    }
}
