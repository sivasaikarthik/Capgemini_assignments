class accounts {
  id:number;
  name: string;
  balance:number;
constructor(id:number,name: string,balance:number) {
    this.name = name;
    this.id=id;
    this.balance=balance;
  }

  
}
 class savingaccount extends accounts {

      constructor(id:number,name: string,balance:number) {
          super(id, name, balance);

      }
      interest() {
          console.log(`intert is 5% of the ${this.name}`);
      }
      cash_credit(money) {
          this.balance = this.balance + money;
      }
  }
   class currentaccount extends accounts {

      constructor(id:number,name: string,balance:number) {
         super(id, name, balance);

      }
      interest() {
          console.log(`intert is 10% of the ${this.name}`);
      }
      cash_credit(money) {
          this.balance = this.balance + money;
      }
  }





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
