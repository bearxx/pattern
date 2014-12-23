package singleton.util;

import java.util.Map;

import singleton.domain.Me;

public class TaskPlay extends GenerakTask<Map<Object, Object>> {

	private Map<Object, Object> data;
	
	private static int id = 0;

	@Override
	protected Map<Object, Object> task() {
		id++;
		data.put("id-"+id, Me.getInstance().toString());
		return data;
	}

}
