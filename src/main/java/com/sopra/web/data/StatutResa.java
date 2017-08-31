package com.sopra.web.data;

public class StatutResa {

	private String aeroportdepart, aeroportarrivee, datedepart;

	/**
	 * @param aeroportdepart
	 * @param aeroportarrivee
	 * @param datedepart
	 */
	public StatutResa(String aeroportdepart, String aeroportarrivee, String datedepart) {
		super();
		this.aeroportdepart = aeroportdepart;
		this.aeroportarrivee = aeroportarrivee;
		this.datedepart = datedepart;
	}

	public StatutResa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the aeroportdepart
	 */
	public String getAeroportdepart() {
		return aeroportdepart;
	}

	/**
	 * @param aeroportdepart
	 *            the aeroportdepart to set
	 */
	public void setAeroportdepart(String aeroportdepart) {
		this.aeroportdepart = aeroportdepart;
	}

	/**
	 * @return the aeroportarrivee
	 */
	public String getAeroportarrivee() {
		return aeroportarrivee;
	}

	/**
	 * @param aeroportarrivee
	 *            the aeroportarrivee to set
	 */
	public void setAeroportarrivee(String aeroportarrivee) {
		this.aeroportarrivee = aeroportarrivee;
	}

	/**
	 * @return the datedepart
	 */
	public String getDatedepart() {
		return datedepart;
	}

	/**
	 * @param datedepart
	 *            the datedepart to set
	 */
	public void setDatedepart(String datedepart) {
		this.datedepart = datedepart;
	}

}
