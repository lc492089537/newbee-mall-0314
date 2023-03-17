package ltd.newbee.mall.service;

import java.util.List;

import ltd.newbee.mall.entity.FindRecommendGoods;

public interface FindRecommendGoodsService {
    List<FindRecommendGoods> findRecommendGoods(Integer limit, String orderBy);
}
