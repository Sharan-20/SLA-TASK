// using concatenate method

let fruits=['orange','pomograte','apple','bananan'];
newfruits=fruits.concat('berry');
console.log(newfruits);

//usig splice method

let num=[1,2,4,5,6];
num.splice(2,0,3)
console.log(num);




//2.remove last element in array without using pop method

//using slice method

let fruit=['orange','pomograte','apple','bananan'];
fruit=fruit.slice(0,-1);
console.log(fruit);

//using splice method
let numb=[10,20,30,50,60];
numb.splice(4,1);
console.log(numb);

//3.add special character between two element

let veg=['orange','pomograte'];
let character="&";
veg.splice(1,0,character);
console.log(veg);


let fru=["apple","banana"];
fru.splice(1,0,"&");
console.log(fru);

//4.array of object

var employee=[
    {
        empid:1,
        empname:"john",
        empsalary:14000,
        empdesignation:"team leader"
    },
    {
        empid:2,
        empname:"maxi",
        empsalary:12000,
        empdesignation:"project manager"
    },
    {
        empid:3,
        empname:"durga",
        empsalary:114000,
        empdesignation:"HR"
    },
    {
        empid:4,
        empname:"mathwee",
        empsalary:24000,
        empdesignation:"developer"
    }

];

console.log(employee[0].empid);
console.log(employee[1].empname);
console.log(employee[2].empdesignation);





