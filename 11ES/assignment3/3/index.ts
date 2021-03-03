interface printable
{
    print();
}
class circle implements printable
{
    print()
    {
    console.log("inside circle print");
    }
}
class employee implements printable
{
    print()
    {
    console.log("inside employee print");
    }
}


var allobjects=[];
    var a=new circle();
    var b=new employee();
    allobjects.push(a);
 allobjects.push(b);
var i=0;
    while(i<allobjects.length)
    {
        
    allobjects[i].print();
        i=i+1;
    }