/**
 * 
 * @author GOKCE
 *
 */
public class Location {
	private double latitude;
	private double attidude;
	/**
	 * @param latitude location latitude
	 * @param longitude location longitude
	 */
	public Location(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.attidude = longitude;
	}
	/**
	 * 
	 * @return attidude
	 */
	public double getLongitude() {
		return attidude;
	}
	/**
	 * @param longitude the longitude to set make a attitude
	 */
	public void setLongitude(double longitude) {
		this.attidude = longitude;
	}

}
