package bankaccount

/**
  * Created by alfonso777 on 31/05/2017.
  */
object BankMessages {

  // Input messages
  case class NewAccount(accountName: String, accountId: String)
  case class GetBalance(accountId: String)

  // Output messages
  case class Balance(accountId: String, amount:BigDecimal)

  //TODO: add the operation type: deposits, salaries, credits
  case class Deposit(accountId: String, amount: BigDecimal) {
    require(amount > BigDecimal(0),"The deposit amount must be greater than 0")
  }

  //TODO: add the operation type: purchases, withdrawals, debits
  case class Withdraw(accountId: String, amount: BigDecimal){
    require(amount > BigDecimal(0),"The deposit amount must be greater than 0")
  }

}
