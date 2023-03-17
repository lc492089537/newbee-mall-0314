package ltd.newbee.mall.entity;

import org.springframework.stereotype.Component;

@Component
public class FindRecommendGoods {
	private Integer goodId;
	private String goodsName;
	private Integer goodRank;
	
	public Integer getGoodId() {
		return goodId;
	}
	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Integer getGoodRank() {
		return goodRank;
	}
	public void setGoodRank(Integer goodRank) {
		this.goodRank = goodRank;
	}
	@Override
	public String toString() {
		return "FindRecommendGoods [goodId=" + goodId + ", goodsName=" + goodsName + ", goodRank=" + goodRank + "]";
	}

}
