  class order {
      constructor(id, title, price) {
          this.id = id;
          this.title = title;
          this.price = price;
      }
      printOrder() {
          console.log(" the order deatils are  " + this.id + "," + this.title + "," + this.price);
      }
      getprice() {
          return this.price;
      }

  }
  let s1 = new order(101, 'Sachin', 45);
  s1.printOrder();
  document.write("<p> the price of the product is  " + s1.getprice());
