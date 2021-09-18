let person = [{
    fName: "b",
    lName: "mohmmad",
    age : 21,
    dept: "software"

},
{
    fName: "c",
    lName: "singh",
    age : 15,
    dept: "Hr"
},
{
    fName: "a",
    lName: "singh",
    age : 50,
    dept: "manager"
}
]

for (const key of person) {
    console.log(key);
    
}

let AnotherPerson = person.sort((x,y)=>{
   return x.fName.localeCompare(y.fName);
});

console.log('=================');



for (const key of AnotherPerson) {
    console.log(key);
    
}

let fil = person.filter((key)=>{
    return key.age >18 && key.age <40;
})

console.log('====================');


for (const key of fil) {
    console.log(key);
    
}

