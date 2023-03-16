package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.entity.FindRecommendGoods;
import ltd.newbee.mall.service.FindRecommendGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindRecommendGoodsServiceImpl implements FindRecommendGoodsService {

    @Autowired
    private FindRecommendGoods findRecommendGoodsMapper;

    @Override
    public List<FindRecommendGoods> findRecommendGoods(Integer limit) {
        return findRecommendGoodsMapper.findRecommendGoods(limit);
    }
}
