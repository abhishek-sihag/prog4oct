//variables
//let, var, const
let x = 10;
let y = 20;

let name = "Ram";
let isMinor = false;
let salary = 45000.50;

//read
console.log(x);
console.log(typeof x); //number
console.log(typeof name); //string
console.log(typeof isMinor); //boolean
console.log(typeof salary); //number
console.log(typeof null); //null
console.log(typeof 10 / 0); //NaN

//
let z = x + y;
console.log(z);

//ctrl+Alt+n

for (let i = 0; i < 5; i++) {
    console.log(i); //0-4
}
//console.log(i); // i not defined

for (var i = 0; i < 5; i++) {
    console.log(i);
}
console.log(i);

const j = 100;
console.log(j);
//j = 200; //Assignment to constant variable.
//console.log(j);

//Data types in  ES6
//Number
//String
//boolean - true/false
//object - null, object, array
//NaN

//create object
const person = {
    name: "Ram",
    age: 21,
    salary: 45000,
    contactNos: [9999999999, 9999999998, 9999999997],
    address: [{
        dNo: "123A",
        city: "Bengaluru",
        state: "Karnataka",
    },
    {
        dNo: "123B",
        city: "Chennai",
        state: "TamilNadu",
    },
    ]
}
console.log(typeof person);
console.log();
//read person object
console.log(person.name);
console.log(person.age);
console.log(person.contactNos);
console.log(person.contactNos[0]);
console.log(person.contactNos[1]);
console.log(person.salary);
console.log(person.address);
console.log("1st Address is: ");
console.log(person.address[0]); //print 1st address info
console.log("2nd Address is: ");
console.log(person.address[1]);
console.log("2nd Address' city is: ");
console.log(person.address[1].city);
console.log("Detail:");
console.log(person); // print person object
console.log();

//update person
person.age = 22;
person.contactNos[0] = 9191919191;
person.address[0] = {
    dNo: 345,
    city: "Pune",
    state: "Maharashtra",
};
console.log("After updating details: ")
console.log(person);

// person={}; //TypeError: Assignment to constant variable.
// person = {
//     name: "Sam",
//     age: 23,
// };

//Arrays- can take var, let, const
const colorArr = ["Red", "Orange", "Green"];

//read arrays
console.log(colorArr);
console.log(colorArr[1]);
for (let i = 0; i < colorArr.length; i++) {
    console.log(i); //0, 1, 2
    console.log(colorArr[i]); //"Red", "Orange", "Green"
}

//update array
colorArr[1] = "White";
colorArr[2] = "Pink";

console.log("After updating array: ");
console.log(colorArr);


//colorArr = ["Yellow", "Black"]; //TypeError: Assignment to constant variable.
//console.log(colorArr);

//remove - pop()
//remove last element from array
console.log("Before pop(): " + colorArr);
colorArr.pop();
console.log("After pop(): " + colorArr);

//add new colors- push()
colorArr.push("Violet", "Brown");
console.log("After push(): " + colorArr);
console.log("Sort: " + colorArr.sort());
console.log(colorArr);

//copy one array elements into another array- spread operator(...)
const newColorArr = [...colorArr];
console.log("newColorArr: ");
console.log(newColorArr);


const newColorArr1 = ["Red", "Silver", ...colorArr, "Gold"];
console.log("newColorArr1: ");
console.log(newColorArr1);

//Functions
//function<function-name>(){//code}
//function with no input param
function greet() {
    console.log("Hello World!");
}
greet();

//function with 1 input param
function isEven(num) {
    if (num % 2 == 0) {
        return true;
    } else {
        return false;
    }
}

console.log(isEven(10)); //true
console.log(isEven(5)); //false

//functions with 2 input params
function add(num1, num2) {
    return num1 + num2;
}
console.log(add(15, 25));//40


//default value parameter function
function sub(num1, num2 = 10) {
    return num1 - num2;
}
console.log(sub(10));//0
console.log(sub(20, 5));//15

//Rest parameters - ...
function mul(num1, ...nums) {
    let result = num1;
    if (nums.length != 0) {
        for (let i = 0; i < nums.length; i++) {
            result = result * nums[i];
        }
    } else {
        return 0;
    }
    return result;
};
console.log(mul(2));
console.log(mul(2, 3));
console.log(mul(2, 3, 4));
console.log(mul(2, 3, 4, 5));

//Arrow functions
// greet function
// function greet() {
//     console.log("Hello World!");
// }
let greet1 = () => {
    console.log("Hello World!");
};
greet1();

// function isEven(num) {
//     if (num % 2 == 0) {
//         return true;
//     } else {
//         return false;
//     }
// }

const isEven1 = (num) => {
    if (num % 2 == 0) {
        return true;
    } else {
        return false;
    }
}

console.log(isEven1(10)); // true

//function with one return statement
// function isEven(num) {
//     return num%2==0?true:false;
// }

let isEven2 = (num) => (num % 2 == 0 ? true : false);
console.log(isEven2(9));//false

//Arrow function with two input arguments
//funtion add(num1, num2){
//   return num1+num2; 
//}
let add1 = (num1, num2) => (num1 + num2);
console.log(add1(10, 20)); // 30

//Destructuring - ES6 / Ecma Script 6
// 1. Object Destructuring
// 2. Arrays Destructuring

// 1. Object Destructuring
// const person = {
//     name: "Ram",
//     age: 21,
//     salary: 45000,
//     contactNos: [9999999999, 9999999998, 9999999997],
//     address: [{
//         dNo: "123A",
//         city: "Bengaluru",
//         state: "Karnataka",
//     },
//     {
//         dNo: "123B",
//         city: "Chennai",
//         state: "TamilNadu",
//     },
//     ]
// }
console.log("Destructuring :");

person.name;
person.address.dNo;
person.address.city;
person.address.state;

//object destructuring
const { dNo, city, state } = person.address[0];
console.log(dNo);
console.log(state);
console.log(city);

//array destructuring
person.contactNos[0];
person.contactNos[1];
person.contactNos[2];

const [num1, num2] = person.contactNos;
console.log(num1);
console.log(num2);

//map(), filter, class, import, export
console.log("map(), filter, class, import, export: ");
//map()
const numArr = [10, 15, 20, 30, 40];
const sq = numArr.map((num) => num * num);
console.log(sq);

//filter()
const result = numArr.filter((num) => num > 20);
console.log(result);
const result1 = numArr.filter((num) => num < 20);
console.log(result1);
const result2 = numArr.filter((num) => num % 2 == 0);
console.log(result2);

//class
class Employee {
    constructor(empId, empName) {
        this.empId = empId;
        this.empName = empName;
    }
    setEmpId(empId) {
        this.empId = empId;
    }
    getEmpId() {
        return this.empId;
    }
    setEmpName(empName) {
        this.empName = empName;
    }
    getEmpName() {
        return this.empName;
    }
}

//create objects
const emp1 = new Employee(1001, "Ram");
const emp2 = new Employee(1002, "Sam");

//read object properties
console.log(emp1.empId);
console.log(emp1.empName);
console.log(emp2.empId);
console.log(emp2.empName);


