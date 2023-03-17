package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.dao.IndexConfigMapper;
import ltd.newbee.mall.entity.FindRecommendGoods;
import ltd.newbee.mall.service.FindRecommendGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class FindRecommendGoodsServiceImpl implements FindRecommendGoodsService{
    private final IndexConfigMapper findRecommendGoodsMapper;

    @Autowired
    public FindRecommendGoodsServiceImpl(IndexConfigMapper findRecommendGoodsMapper) {
        this.findRecommendGoodsMapper = findRecommendGoodsMapper;
    }

    public List<FindRecommendGoods> findRecommendGoods(Integer limit, String orderBy) {
        Map<String, Object> params = new HashMap<>();
        params.put("limit", limit);
        params.put("orderBy", orderBy);
        return findRecommendGoodsMapper.findRecommendGoods(limit,orderBy);
    }
}
