package coop.home.bankaccount.dto.accounttransfer;

import java.util.Date;
import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RatesDTO {
	private Date date;
	private String base;
	private HashMap<String ,Double> rates;
}
