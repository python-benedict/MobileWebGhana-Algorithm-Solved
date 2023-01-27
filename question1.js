
let Centered = (val) =>{
    // Giving a condition to if the inputed array lenght is an even number or a zero
    if(val.length %2 ==0 || val==0){
        // Returing 0 because the array is not even
        return 0
    }
    midIndex = val.length/2  // a variable to store the middle index 
    midItem = val[midIndex]  // a variable to store the modele index value of the array

    // doing a for loop to return the middle number
    for (let i of val){
        // if the value of the array if not equal to the mideIndex and midItem is also greater than the value
        if(i != midIndex && midItem >= val[i]){
            // we should return 0
            return 0
        }else{
            // else returning 1
            return 1
        }
    }
}
// 
val = [3,2,1,4,5]
console.log(Centered(val))

//done