package Prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


// Registry class will register attributes 
public class Registry {
	private Map<String, Target> map = new HashMap<>();

    public void register(String key, Target target) {
        map.put(key, target);
    }

    public Target get(String key) {
        return map.get(key);
    }

}
