package ltd.newbee.mall.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.dao.AirbnbLodgingSearchMapper;
import ltd.newbee.mall.entity.AirbnbLodgingSearcheEntity;
import ltd.newbee.mall.service.AirbnbLodgingSearchService;


@Service
public class AirbnbLodgingSearchServiceImpl implements  AirbnbLodgingSearchService{
	@Autowired
	private AirbnbLodgingSearchMapper airbnbLodgingSearchMapper;
	

	@Override
    public List<AirbnbLodgingSearcheEntity> getLodgingSearchHotelRoomInfo(Map<String, Object> filterlist) {
        List<AirbnbLodgingSearcheEntity> lodgingSearchResults = airbnbLodgingSearchMapper.getLodgingSearchHotelRoomInfo(filterlist);
        return lodgingSearchResults;
    }
	
	

}


