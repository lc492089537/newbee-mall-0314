package ltd.newbee.mall.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AirbnbLodgingSearcheEntity {
	private String hotelName;
	private int pricePerNight;
	@JsonIgnore
	private int hotelId;
	@JsonIgnore
	private int roomId;
	@JsonIgnore
	private String roomName;
	private String hotelImage;
	private int totalPrice;
	@JsonIgnore
	private Date checkInDate;
	@JsonIgnore
	private Date checkOutDate;
	private float avgPoint;
	@JsonIgnore
	private double weightedScore;

	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * @return the pricePerNight
	 */
	public int getPricePerNight() {
		return pricePerNight;
	}

	/**
	 * @param pricePerNight the pricePerNight to set
	 */
	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}


	/**
	 * @return the hotelId
	 */
	public int getHotelId() {
		return hotelId;
	}

	/**
	 * @param hotelId the hotelId to set
	 */
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	/**
	 * @return the roomId
	 */
	public int getRoomId() {
		return roomId;
	}

	/**
	 * @param roomId the roomId to set
	 */
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	/**
	 * @return the roomName
	 */
	public String getRoomName() {
		return roomName;
	}

	/**
	 * @param roomName the roomName to set
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	/**
	 * @return the hotelImage
	 */
	public String getHotelImage() {
		return hotelImage;
	}

	/**
	 * @param hotelImage the hotelImage to set
	 */
	public void setHotelImage(String hotelImage) {
		this.hotelImage = hotelImage;
	}

	/**
	 * @param checkOutDate
	 * @param checkInDate
	 * @return the totalPrice
	 */
	public int getTotalPrice(Date checkOutDate, Date checkInDate) {
		return (int) (checkOutDate.getTime() - checkInDate.getTime() * pricePerNight);
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return the avgPoint
	 */
	public float getAvgPoint() {
		return avgPoint;
	}

	/**
	 * @param avgPoint the avgPoint to set
	 */
	public void setAvgPoint(float avgPoint) {
		this.avgPoint = avgPoint;
	}
	@Override
	public String toString() {
		return "AirbnbLodgingSearcheEntity [hotelName=" + hotelName + ", pricePerNight=" + pricePerNight + ", hotelId="
				+ hotelId + ", roomId=" + roomId + ", roomName=" + roomName + ", hotelImage=" + hotelImage
				+ ", totalPrice=" + totalPrice + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate
				+ ", avgPoint=" + avgPoint + "]";
	}
	
}
