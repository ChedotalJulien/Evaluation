package co.simplon.entities;
import java.sql.Date;

public class Counts {
	private int NumCounts;
	private Date DateCreation;
	private double Balance;
	private int IdCust;

	public Counts(int NumCounts, Date DateCreation, double Balance, int IdCust) {
		this.NumCounts = NumCounts;
		this.DateCreation = DateCreation;
		this.Balance = Balance;
		this.IdCust = IdCust;
	}

	public int getNumCounts() {
		return NumCounts;
	}

	public void setNumCounts(int numCounts) {
		NumCounts = numCounts;
	}

	public Date getDateCreation() {
		return DateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public int getIdCust() {
		return IdCust;
	}

	public void setIdCust(int idCust) {
		IdCust = idCust;
	}

	@Override
	public String toString() {
		return "Counts [NumCounts=" + NumCounts + ", DateCreation=" + DateCreation + ", Balance=" + Balance
				+ ", IdCust=" + IdCust + "]";
	}


}