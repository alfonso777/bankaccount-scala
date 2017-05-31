package bankaccount

import akka.actor.Actor
import bankaccount.BankMessages._

/**
  * Created by alfonso777 on 31/05/2017.
  */
class Bank extends Actor{
  var accounts = Map.empty[String, Int]

  override def receive: Receive = {
    //TODO: implement the handling of NewAccount message
    case account: NewAccount => {}
  }
}

class BankAccount extends Actor{
  var balance: BigDecimal = BigDecimal(0)
  override def receive: Receive = {
    //TODO: implement the withdrawals and deposist operations
    case operation => {}
  }
}