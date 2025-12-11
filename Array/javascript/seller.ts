const json:Array<Seller> = [
  {
    "name": "Barry Allen",
    "amount": 18196.0
  },
  {
    "name": "Logan",
    "amount": 4255.0
  },
  {
    "name": "Maria",
    "amount": 10298.0
  },
  {
    "name": "Ana",
    "amount": 26485.0
  },
  {
    "name": "Aurora",
    "amount": 19982.0
  },
  {
    "name": "Noah",
    "amount": 15820.0
  },
  {
    "name": "Leo",
    "amount": 21412.0
  },
  {
    "name": "Alex",
    "amount": 12000.0
  }
]

type Seller = {
    name:   String,
    amount: Number
}

function findMaxSellers(sellers:Array<Seller>):Seller {

    let bestSeller = sellers[0];

    for(const seller of sellers) {
        if(seller.amount > bestSeller.amount) bestSeller = seller;
    }

    return bestSeller;
}

console.log(findMaxSellers(json))