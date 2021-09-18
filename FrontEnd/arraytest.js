var array = [11,22,33,44];
for(let i =0;i<array.length;i++)
    console.log(array[i]);

    console.log(".....................................")
var array2 = ["Rahul","raj","junaid","ram"];
for(let i =0;i<array2.length;i++)
    console.log(array2[i]);
    console.log(".....................")


    let person = [{
        fName : "Junaid",
        lName : "mohmmad",
        dept : "software"

    },
    {
        fName : "Ram",
        lName:"singh",
        dept:"Hr"
    }

]

    for( key of person){
        // console.log(person[k);
        console.log(key);
        
        
    }

    console.log('****************');
    

    let person2 = {
        fName : "satpreet",
        lName : "singh",
        dept : "manager"
    }
    person.push(person2);
    person.push({
        fName : "xyz",
        lName : "abc",
        dept : "HR"
    });

 
    for( key of person){
        // console.log(person[k);
        console.log(key);
        
        
    }
    
    person.pop()
    console.log('=============');
    
    for( key of person){
        // console.log(person[k);
        console.log(key);
        
        
    }


    let arr3  = [5, 8 ,1 , 2 , 0, 9];
    // console.log(arr3.sort());
    
  let arr4 =  arr3.filter(function(value){
        return value>5;
    })

    console.log(arr4);
    
    let arr5 = person.filter((key)=>{
        return key.dept == "Hr";
    })

    console.log(arr5);
    