main ()
{
    copy -> name = "Seshasai"; -> object
    greet(name); -> here the value of the reference variable is passed
}
greet(daughter) { // here the copy is passed 
    print(daughter);
} 
// in java there is only pass by value only pass by reference is not present
                                             name
                                              |
                                              |
                                              |
                                              |
                            daughter ----- "Seshasai

pvsm() {
    name = "kunal";               name ------> kunal
                                // naam -----> kunal
    change(name)                   naam ------> Rahul

    //print(kunal);
    //print(name); 
}
change(naam) {
    naam = "Rahul Rana"; // here you are creating a new object
}

for swapping
1. primitives like int , short , char , byte -----> just passimg value
2. objects and stuff : passing value of the reference