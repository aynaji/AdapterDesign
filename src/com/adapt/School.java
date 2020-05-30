package com.adapt;

import com.ammar.PilotPen;

public class School {

	public static void main(String[] args) {
		PenAdapter pp=new PenAdapter();
		AssignmentWork aw=new AssignmentWork();
		aw.setP(pp);
		aw.writeAssigment("Hate SChool");
	}
}
