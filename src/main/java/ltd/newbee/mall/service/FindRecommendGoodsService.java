package ltd.newbee.mall.service;

import ltd.newbee.mall.entity.FindRecommendGoods;

import java.util.List;

public interface FindRecommendGoodsService {
    /**
     * 查询推荐商品信息
     *
     * @paramlimit 返回结果数量限制
     * @return 推荐商品信息列表
     */
    List<FindRecommendGoods> findRecommendGoods(Integer limit);
}
