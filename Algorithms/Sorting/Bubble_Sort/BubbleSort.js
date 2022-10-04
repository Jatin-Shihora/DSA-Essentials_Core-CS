//JavaScript BubbleSort Algorithm

//The sorting algorith which basically bubbles the largest element to the last on each iteration

function bubbleSort(arr) {          //bubble sort function definition takes in array as parameter

    for (let i = 0; i < arr.length; i++) {     

        for (let j = 0; j < arr.length - i - 1; j++) {    //Decrease j iteration by 1 on every ith iteration 
                                                            //since the largest elements are already bubbled to the last

            if (arr[j] > arr[j + 1]) {              // swap if j greater than j+1 to push the larger elements to the last
                let temp = arr[j]                   //swaping using a temp variable.
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
            
        }
    }   

    return arr;                    //returns the sorted array
}

let arr = [0002, -265, 3, 0];        //unsorted array
arr = bubbleSort(arr);         //returns sorted array
console.log(arr);    //[ -265, 0, 2, 3]

// i = 0 , j = 0   [0002, -265, 3, 0]  ==>  [ -265 ,2 , 3 , 0]
// i = 0 , j = 1   [ -265 ,2 , 3 , 0]  ==>  [ -265 ,2 , 3 , 0]
// i = 0 , j = 2   [ -265 ,2 , 3 , 0]  ==>  [ -265 ,2 , 0 , 3]
// i = 1 , j = 0   [ -265 ,2 , 0 , 3]  ==>  [ -265 ,2 , 0 , 3]
// i = 1 , j = 1   [ -265 ,2 , 0 , 3]  ==>  [ -265 ,0 , 2 , 3]
// i = 1 , j = 2   [ -265 ,0 , 2 , 3]  ==>  [ -265 ,0 , 2 , 3]


arr = [2, 265, 3, 22, 90, -2, 0, 5];  //unsorted array
arr = bubbleSort(arr);                    //returns sorted array
console.log(arr);      //[ -2, 0, 2, 3, 5, 22, 90, 265]

arr = [5, 8773, 12123, 2, 9, -092, 111, 1];  //unsorted array
arr = bubbleSort(arr);                           //returns sorted array
console.log(arr);    //[-92, 1, 2, 5, 9, 111, 8773, 12123]
