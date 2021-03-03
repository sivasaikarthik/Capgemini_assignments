  class account {

      constructor(id, name, balance) {
          this.id = id;
          this.name = name;
          this.balance = balance;
      }
  }
  class savingaccount extends account {

      constructor(id, name, balance) {
          super(id, name, balance);

      }
      interest() {
          console.log(`intert is 5% of the ${this.name}`);
      }
      cash_credit(money) {
          this.balance = this.balance + money;
      }
  }
  class currentaccount extends account {

      constructor(id, name, balance) {
          super(id, name, balance);

      }
      interest() {
          console.log(`intert is 10% of the ${this.name}`);
      }
      cash_credit(money) {
          this.balance = this.balance + money;
      }
  }
