package com.kh.run;

import com.kh.operator.A_LogicalLegation;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Arithmetic;
import com.kh.operator.D_Comparison;
import com.kh.operator.E_Logical;
import com.kh.operator.F_Compound;
import com.kh.operator.G_Triple;

public class OperatorRun {

	public static void main(String[] args) {

		A_LogicalLegation a = new A_LogicalLegation();
		// a.method1();

		B_InDecrease b = new B_InDecrease();
		// b.method1();
		// b.method2();
		// b.method3();
		// b.method4();

		C_Arithmetic c = new C_Arithmetic();
		// c.method1();
		// c.quiz1();
		D_Comparison d = new D_Comparison();
		// d.method1();
		// d.method2();
		E_Logical e = new E_Logical();
		// e.method1();
		// e.method2();
		// e.method3();
		// e.method4();
		// e.method5();
		F_Compound f = new F_Compound();
		// f.method1();
		G_Triple g = new G_Triple();
		// g.method1();
		// g.method2();
		// g.method3();
		// g.method4();
		// g.method5();
		g.method6();
	}

}
