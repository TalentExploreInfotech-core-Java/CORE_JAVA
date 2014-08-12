package com.persistent;

public class HighTemp {
	private double temp;
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public HighTemp(double temp) {
		super();
		this.temp = temp;
	}
	public boolean sameTemp(HighTemp h)
	{
		return temp==h.temp;
	}
	public boolean lessTemp(HighTemp h)
	{
		return temp>h.temp;
	}
	@Override
	public String toString() {
		return "HighTemp [temp=" + temp + "]";
	}
}
