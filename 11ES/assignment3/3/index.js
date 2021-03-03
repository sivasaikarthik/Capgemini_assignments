var circle = /** @class */ (function () {
    function circle() {
    }
    circle.prototype.print = function () {
        console.log("inside circle print");
    };
    return circle;
}());
var employee = /** @class */ (function () {
    function employee() {
    }
    employee.prototype.print = function () {
        console.log("inside employee print");
    };
    return employee;
}());
var allobjects = [];
var a = new circle();
var b = new employee();
allobjects.push(a);
allobjects.push(b);
var i = 0;
while (i < allobjects.length) {
    allobjects[i].print();
    i = i + 1;
}
