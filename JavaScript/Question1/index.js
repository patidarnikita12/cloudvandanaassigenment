let string = prompt("Enter a string")
let splitedString = string.split(' ')

// document.writeln()

splitedString.forEach((e, ind) => {
    let reversedString = ""
    for (let a = 0; a < e.length; a++) {
        reversedString = e.charAt(a) + reversedString;
    }
    splitedString[ind] = reversedString;
});
let result = splitedString.join(" ");

document.writeln("string: " + string + "<br> reverse string: " + result)
    /*document.getElementById("str1").innerHTML += ""+string;
    document.getElementById("str2").innerHTML += ""+result;*/