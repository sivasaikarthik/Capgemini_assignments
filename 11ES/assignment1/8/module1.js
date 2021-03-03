import {
    savingaccount,
    currentaccount
} from './module2.js'

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
