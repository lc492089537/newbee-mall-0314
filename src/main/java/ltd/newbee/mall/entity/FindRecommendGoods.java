package ltd.newbee.mall.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FindRecommendGoods {
	private Integer good_id;    
	public Integer getGood_id() {
		return good_id;
	}
	public void setGood_id(Integer good_id) {
		this.good_id = good_id;
	}
	public Integer getGood_rank() {
		return good_rank;
	}
	public void setGood_rank(Integer good_rank) {
		this.good_rank = good_rank;
	}
	private Integer good_rank;
	@Override
	public String toString() {
		return "FindRecommendGoods [good_id=" + good_id + ", good_rank=" + good_rank + "]";
	}
	public List<FindRecommendGoods> findRecommendGoods(Integer limit) {
		// TODO Auto-generated method stub
		return null;
	}  
}
