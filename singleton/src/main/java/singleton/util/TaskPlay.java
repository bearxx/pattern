package singleton.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import singleton.domain.Me;

public class TaskPlay extends GenerakTask<Map<Object, Object>> {

	private Map<Object, Object> data = new HashMap<Object, Object>();
	
	private static int id = 0;

	@Override
	protected Map<Object, Object> task() {
		id++;
		data.put("id-"+id, Me.getInstance().toString());
		return data;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("]");
		for(Entry<Object, Object> entry : data.entrySet()) {
			sb.append("{").append(entry.getKey())
				.append(":").append(entry.getValue())
				.append("}").append(System.lineSeparator());
		}
		sb.append("]");
		return sb.toString();
	}

}
