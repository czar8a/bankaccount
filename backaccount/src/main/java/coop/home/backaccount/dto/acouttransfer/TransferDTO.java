package coop.home.backaccount.dto.acouttransfer;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import coop.home.backaccount.dto.accounts.AccountIDDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferDTO {
	
	@NotNull
	@ApiModelProperty(notes = "sourceAcount", required = true, position = 0)
	private AccountIDDTO sourceAcount;
	
	@NotNull
	@ApiModelProperty(notes = "recipientAcount", required = true, position = 1)
	private AccountIDDTO recipientAcount;
	
	@NotBlank
	@ApiModelProperty(notes = "transferSymbol", example = "USD", required = true, position = 2)
	private String transferSymbol;
	
	@Positive()
	@ApiModelProperty(notes = "transferAmount", example = "1236546", required = true, position = 3)
	private BigDecimal transferAmount;
	
	@NotBlank
	@ApiModelProperty(notes = "transferDescripcion", example = "pay 1", required = true, position = 4)
	private String transferDescripcion;

}