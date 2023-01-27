// Declaring a public class for the algorith to be solved
let reverseInt = (str) =>{
    // initializing the variable text toString of the integer str
    let text = str.toString()
    // spliting the string with ''
    let split_word = text.split('')
    // now using the reverse keyword in js to reverse the splited word
    split_word.reverse()
    // and finally converting it back to an integer
    let final = parseInt(split_word.join(''))
    // print the reversed value back to the console
    console.log(final)
}
reverseInt(1000)

//done