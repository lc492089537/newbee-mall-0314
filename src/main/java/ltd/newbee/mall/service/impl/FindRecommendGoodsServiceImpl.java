package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.dao.IndexConfigMapper;
import ltd.newbee.mall.entity.FindRecommendGoods;
import ltd.newbee.mall.service.FindRecommendGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class FindRecommendGoodsServiceImpl implements FindRecommendGoodsService {
	@Autowired(required = false)
	private IndexConfigMapper findRecommendGoodsMapper1;

    @Override
    public List<FindRecommendGoods> findRecommendGoods(Integer limit) {
        return findRecommendGoodsMapper1.findRecommendGoods();
    }
}
