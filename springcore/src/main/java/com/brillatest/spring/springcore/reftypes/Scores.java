package com.brillatest.spring.springcore.reftypes;

public class Scores {
	private Double mat;
	private Double fisica;
	private Double quimica;

	public Double getMat() {
		return mat;
	}

	public void setMat(Double mat) {
		this.mat = mat;
	}

	public Double getFisica() {
		return fisica;
	}

	public void setFisica(Double fisica) {
		this.fisica = fisica;
	}

	public Double getQuimica() {
		return quimica;
	}

	public void setQuimica(Double quimica) {
		this.quimica = quimica;
	}

	@Override
	public String toString() {
		return "Scores [mat=" + mat + ", fisica=" + fisica + ", quimica=" + quimica + "]";
	}
}
