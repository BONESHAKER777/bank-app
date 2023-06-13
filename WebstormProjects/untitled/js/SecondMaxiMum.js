let array = [5, 7, 900 , 12 , 700, 1200]
var firstLargest = 0;
let secondLargest = 0;

    for (let i = 0; i < array.length; i++) {
        if (array[i] > firstLargest) firstLargest = array[i]

    }
    console.log(firstLargest)
    for (let j = 0; array.length > j ; j++){
        if ( array[j]  > secondLargest && firstLargest !== array[j] ) secondLargest = array[j]
    }
    console.log("()->  ",secondLargest)