var Ans = document.getElementById("Ans");

var arr = [5, 6];

var res = arr.push(7);
var rest = arr.unshift(4)

Ans.innerHTML = arr

// console.log(arr);

var Ans2 = document.getElementById('Ans2')

function ArrayP() {
  var arr2 = [1, 2, 3, 4, 5, 6, 7];
  arr2.splice(2, 3);
  console.log(arr2);
  console.log("This is the second value ");
  Ans2.innerHTML = "Answer :" + " " + arr2;


}
ArrayP();


const Ans3 = document.getElementById("Ans3")

var arr3 = [4, 5, 6, 7, 8, 9];
console.log("Given " + arr3);

var Earr3 = [];
var res3 = arr3.slice(0, arr3.length);

console.log("Copyed Here " + res3);


function arrCopy(arr3) {
  return arr3.slice(0, arr3.length);
}
console.log("This is return Empty Array" + arrCopy(arr3));



