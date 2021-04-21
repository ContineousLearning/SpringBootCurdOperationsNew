package com.example.demo.util;

import com.example.demo.model.Student;

public interface StudentUtil {

	public static void calculateDtls(Student s) {
		Double fee = s.getStdFee();
		Double disc = fee*10/100.0;
		Double gst = fee*12/100.0;
		
		s.setStdFeeDisc(disc);
		s.setStdFeeGst(gst);		
	}

}
