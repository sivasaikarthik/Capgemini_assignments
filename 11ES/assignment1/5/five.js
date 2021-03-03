function add(a, b) {
    if (a === void 0) { a = 5; }
    if (b === void 0) { b = 6; }
    return a + b;
}
console.log(add());
console.log(add(10, 50));
function userFriends(name, friendlist) {
    console.log("name:" + name + " friends list" + friendlist);
}
userFriends("karthik", ["siva", "sai"]);
function printCapitalNames() {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    var item = 0;
    while (item < 3) {
        document.write("<p style=\"text-transform:uppercase\"> " + names[item] + "</p>");
        item = item + 1;
    }
}
printCapitalNames("karthk", "siva", "sai");
