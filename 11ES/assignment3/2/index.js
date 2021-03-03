var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var accounts = /** @class */ (function () {
    function accounts(id, name, balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
    return accounts;
}());
var savingaccount = /** @class */ (function (_super) {
    __extends(savingaccount, _super);
    function savingaccount(id, name, balance) {
        return _super.call(this, id, name, balance) || this;
    }
    savingaccount.prototype.interest = function () {
        console.log("intert is 5% of the " + this.name);
    };
    savingaccount.prototype.cash_credit = function (money) {
        this.balance = this.balance + money;
    };
    return savingaccount;
}(accounts));
var currentaccount = /** @class */ (function (_super) {
    __extends(currentaccount, _super);
    function currentaccount(id, name, balance) {
        return _super.call(this, id, name, balance) || this;
    }
    currentaccount.prototype.interest = function () {
        console.log("intert is 10% of the " + this.name);
    };
    currentaccount.prototype.cash_credit = function (money) {
        this.balance = this.balance + money;
    };
    return currentaccount;
}(accounts));
var allAccounts = [];
var a = new savingaccount(1, 'karthik', 15000);
allAccounts.push(a);
a.interest();
a.cash_credit(15000);
var b = new currentaccount(2, "siva", 10000);
b.interest();
b.cash_credit(5000);
allAccounts.push(b);
var i = 0;
var s = 0;
while (i < allAccounts.length) {
    s = s + allAccounts[i].balance;
    i = i + 1;
}
console.log("the amount in the bank is " + s);
