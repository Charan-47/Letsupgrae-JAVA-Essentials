console.log(1 + "2" + "2"); //122
console.log(1 + +"2" + "2"); //32
console.log(1 + -"1" + "2"); //02
console.log(+"1" + "1" + "2"); //112
console.log( "A" - "B" + "2"); //NaN 
console.log( "A" - "B" + 2); //NaN2



var marks = 90;

if(marks > 90)
    console.log("AA");
else if(marks > 80  && marks <= 90)
    console.log("AB");
else if(marks > 70 && marks <=80)
    console.log("BB");
else if(marks > 60 && marks <=70)
    console.log("BC");
else if(marks > 50 && marks <=60)
    console.log("CC");
else if(marks > 40 && marks <=50)
    console.log("CD");
else if(marks > 30 && marks <=40)
    console.log("DD");
else
    console.log("FF");