package com.dgit.domain;

//비만 지수
public class BMICalculator {
	private double normal; //정상
	private double overWeight; //과체중
	private double lowWeight; //저체중
	private double obesity; //비만지수
	
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getOverWeight() {
		return overWeight;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public double getLowWeight() {
		return lowWeight;
	}
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public double getObesity() {
		return obesity;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	/*method*/
	public String bmiCalculator(double weight, double height){
		double h = height * 0.01;
		double result = weight / (h*h);
		
		System.out.println("비만 지수 : "+result);
		
		String myResult = "";
		
		if (result > obesity){
			myResult = "비만입니다."; 
		}else if (result > overWeight){
			myResult = "과체중입니다."; 
		}else if (result > normal) {
			myResult = "정상입니다."; 
		}else {
			myResult = "저체중입니다."; 
		}
		
		return myResult;
	}
}
