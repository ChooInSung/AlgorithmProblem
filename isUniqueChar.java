import java.util.HashMap;

public class isUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	public boolean isUnique(String s) {
		HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();
		
		for(int i=0;i<s.length();i++) {
			int key = s.charAt(i);
			if(hashMap.containsKey(key)) {
				return false;
			}
			hashMap.put(key, true);
		}
		
		return true;
	}

}
