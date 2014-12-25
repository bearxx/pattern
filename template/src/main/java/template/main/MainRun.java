package template.main;

import template.process.CrazyProcess;
import template.process.HuntProcess;
import template.process.PlanProcess;

public class MainRun {
	public static void main(String[] args) {
		// ************ CrazyProcess does not use hook ************
		HuntProcess crazyOne = new CrazyProcess();
		crazyOne.produce();
		
		System.out.println("---------");
		
		// ************ PlanProcess uses hook ************
		HuntProcess planProcess = new PlanProcess();
		planProcess.produce();
	}
}
