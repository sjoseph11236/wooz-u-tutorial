let myString: string;
let myNum: number;
let myBool: boolean; 
let myOtherNum: number;
let myHexNum: number; 
let myAny: any;

/*
let booleanArr: boolean[];
let numArr: number[];
let strArr: string[];
*/

let otherStrArr: Array<string>;
let otherNumArr: Array<number>;
let otherboolArr: Array<boolean>; 

let strNumTuple: [string, number];
// let otherStrNumTuple: [string, number];

let myVoid: void =  undefined;
let myNull: null =  null;
let myUndfined: undefined  =  undefined;
console.log("This is myVoid: ", myVoid);
console.log("This is myNull: ", myNull);
console.log("This is myundefined: ", myUndfined);

myString = "Hello World".slice(0,3);
console.log("This is myString: " ,myString);

myNum = 22;
console.log("This is myNum: " , myNum);

myBool = true; 
console.log("This is myBool: ", myBool);

myOtherNum = 5 + 5; 
console.log("This is myOtherNum: ", myOtherNum);

myHexNum = 0xf00d;
console.log("This is myHexNum: ", myHexNum);

myAny = {};
console.log("This is myAny: ", myAny);


// strArr = ["Hello", "World"];
// numArr = [1, 2, 3];
// booleanArr = [true, false, true];


// console.log("This is strArr: ", strArr);
// console.log("This is numArr: ", numArr);
// console.log("This is booleanArr: ", booleanArr);


otherStrArr = ["Hello", "World"];
otherNumArr = [1, 2, 3];
otherboolArr = [true, false, true];

strNumTuple = ["Hello", 4];
// otherStrNumTuple = ["Hello", 4, 5 ];

console.log("This is strArr: ", otherStrArr);
console.log("This is numArr: ", otherNumArr);
console.log("This is booleanArr: ", otherboolArr);
console.log("This is strNumTuple: ", strNumTuple);
// console.log("This is otherStrNumTuple: ", otherStrNumTuple);