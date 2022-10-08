const bucketSort = (arr, n = arr.length) => {
    //Create a bucket array
    let bucket = new Array(n);
    
    //Add bucket group
    for(let i = 0; i < n; i++){
      bucket[i] = [];
    }
    
    //Add the elements in a same range in bucket
    for(let i = 0; i < n; i++){
      let bucketIndex = Math.floor(arr[i]) * n;
      bucket[bucketIndex].push(arr[i]);
    }
    
    //Sort each bucket separately
    for(let i = 0; i < n; i++){
      bucket[i].sort();
    }
    
    // Get the sorted array
    let index = 0;
    for (let i = 0; i < n; i++) {
      for (let j = 0, size = bucket[i].length; j < size; j++) {
          arr[index++] = bucket[i][j];
      }
    }
  }