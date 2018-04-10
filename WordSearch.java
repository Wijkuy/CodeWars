import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WordSearch {
  	
    	static String[] findWord(String x, String[] y) {
		String cap = x.substring(0, 1).toUpperCase() + x.substring(1);
		Pattern regex = Pattern.compile(".*" + x + ".*|.*" + cap + ".*");
		List<String> temp = new ArrayList<>();
		for (int i = 0; i < y.length; i++) {
			Matcher m = regex.matcher(y[i]);
			String s = (m.matches()) ? y[i] : null;
			if (s != null)
				temp.add(s);
		}
		if(temp.size() < 1){
			temp.add("Empty");
		}
		String[] output = temp.toArray(new String[temp.size()]);
		return output;
	}

}