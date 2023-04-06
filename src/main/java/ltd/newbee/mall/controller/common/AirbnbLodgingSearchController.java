package ltd.newbee.mall.controller.common;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ltd.newbee.mall.entity.AirbnbLodgingSearcheEntity;
import ltd.newbee.mall.service.AirbnbLodgingSearchService;

@RestController
@RequestMapping("/lodging_Info")
public class AirbnbLodgingSearchController {
	@Autowired
	private AirbnbLodgingSearchService airbnbLodgingSearchService;
	
    @PostMapping("/filter_detail")
    public List<AirbnbLodgingSearcheEntity> getFilterDetails(@RequestBody Map<String, Object> filterlist) {
        return airbnbLodgingSearchService.getLodgingSearchHotelRoomInfo(filterlist);
    }
   
    
}
