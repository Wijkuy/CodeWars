public class Circle {
	@SuppressWarnings({ "boxing", "unchecked" })
	public static <T> T area(double radius) {
		T type = (radius > 0) ? (T) new Double(Double.parseDouble(String.format("%.2f", Math.PI * Math.pow(radius, 2)))) : (T) Boolean.FALSE;
		if (type == Boolean.FALSE) {
			throw new IllegalArgumentException("");
		}
		return type;
	}

}