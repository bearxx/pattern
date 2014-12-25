package adapter.object.adapter;

import adapter.object.adaptee.Theaf;
import adapter.object.policeman.Police;

public class PolicemanAdapter implements Police{
	Theaf theaf;
	
	public PolicemanAdapter(Theaf theaf) {
		this.theaf = theaf;
	}

	@Override
	public void bePoliceman() {
		theaf.pretendAsPoliceman();
	}

}
