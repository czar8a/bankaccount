package coop.home.bankaccount.dto.transaction;

import java.math.BigDecimal;
import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionDTO {

	private BigInteger idfinancialcompany;
	
	private String idaccount;
	
	private String transactionname;
	
	private String transactiondate;
	
	private BigDecimal amount;
}
