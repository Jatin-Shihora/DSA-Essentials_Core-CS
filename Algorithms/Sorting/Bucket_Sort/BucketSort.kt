fun insertion_sort(A: ArrayList<Double>) {
    var n = A.size
    var i: Int
    for (j in 1 until n) {
        var key = A[j]
        i = j - 1
        while (i >= 0 && A[i] > key) {
            A[i + 1] = A[i]
            i--
        }
        A[i + 1] = key
    }
}

fun bucket_sort(A:Array<Double>){
    var n=A.size
    var bucket = Array<ArrayList<Double>>(n,{i-> ArrayList() })   // creating buckets with n size
    for(i in 0..A.size-1){
        bucket[Math.floor(n*A[i]).toInt()].add(A[i])             // adding element a[i] into position n*a[i]
    }
    for(i in 0..A.size-1){
        insertion_sort(bucket[i])                               // sorting a list using inserton sort
    }
    for (i in 1..A.size-1){
        bucket[0].addAll(bucket[i])                              // concatenate all the buckets
    }
    println("After sorting :")
    for (i in bucket[0])
    {
        print("$i ")                                            // print the sorted elements
    }
}
fun main(arg: Array<String>) {
    print("Enter no. of elements :")
    var n = readLine()!!.toInt()

    println("Enter elements : ")
    var A = Array(n, { 0.0 })
    for (i in 0 until n)
        A[i] = readLine()!!.toDouble()

    bucket_sort(A)

}
