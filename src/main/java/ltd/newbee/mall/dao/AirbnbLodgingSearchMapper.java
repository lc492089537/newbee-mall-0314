package ltd.newbee.mall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.entity.AirbnbLodgingSearcheEntity;

public interface AirbnbLodgingSearchMapper {
	List<AirbnbLodgingSearcheEntity> getLodgingSearchHotelRoomInfo(Map<String, Object> filterlist);


	
}
