package Acc;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Account {
	private String accno;
	private AccountType acctype;
	private double amount;
	private LocalDate openingdate;
	private static Account account;

	static {
		account = new Account();

	}

	public static Account createAccount(AccountType accType, double amount) {
		account.setAccno(UUID.randomUUID().toString());
		account.setAcctype(accType);
		account.setAmount(amount);
		account.setOpeningdate(LocalDate.now());
		return account;
	}

	public String displayAccount()
	{
		return "account number"+getAccno()+"acccounttype"+getAcctype()+"amount:"+getAmount();
	}
}
