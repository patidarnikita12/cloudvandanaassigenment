let a = new Array(13, 15, 82, 72, 88, 98, 100)
document.getElementById("arr1").innerHTML += a;
a.sort((a, b) => {
    return b - a;
});
document.getElementById("arr2").innerHTML += a;