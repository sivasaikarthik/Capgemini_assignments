function add(a = 5, b = 6) {
        return a + b;
    }
    console.log(add());
    console.log(add(10,50));
    function userFriends(name,friendlist)
    {
    console.log("name:"+name+" friends list"+friendlist);
    }


    userFriends("karthik",["siva","sai"]);
function printCapitalNames(...names)
{       var item=0;
        while(item<3)
        {
            document.write(`<p style="text-transform:uppercase"> ${names[item]}</p>`);
            item=item+1;
        }
        
        
}
    printCapitalNames("karthk","siva","sai");
