/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coop.home.bankaccount.dto.accounttransfer.consult;

import java.math.BigInteger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountConsultDTO  {

	private BigInteger usersidfinancialcompany;
	
	private String idaccount;

	private FinancialUsersAcauntDTO financialUsers;
}
