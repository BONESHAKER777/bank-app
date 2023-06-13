var array = [78, 708 ,90, 1, 2300, 90, 27]
let largest = 0;
secondLargest = 0;
for (let i = 0; i < array.length; i++) {

    if (array[i] > largest){
        largest = array[i];
    }

        }
for (let i = 0; i < array.length; i++) {
    if (array[i] >  secondLargest &&    largest !== array[i] ){
        secondLargest = array[i];
    }
}
console.log(largest, "  ()->  ", secondLargest)