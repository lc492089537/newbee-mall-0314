package ltd.newbee.mall.controller.mall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ltd.newbee.mall.entity.FindRecommendGoods;
import ltd.newbee.mall.service.FindRecommendGoodsService;

@Controller
public class FindRecommendGoodsController {
    
    @Autowired
    private FindRecommendGoodsService findRecommendGoodsService;

    
  
    @GetMapping("/recommend-goods")
    public ModelAndView getRecommendGoods(@RequestParam(defaultValue= "8" ) Integer limit) {
        List<FindRecommendGoods> recommendGoodsList = findRecommendGoodsService.findRecommendGoods(limit);
        ModelAndView modelAndView = new ModelAndView("recommend-goods");
        modelAndView.addObject("recommendGoodsList", recommendGoodsList);
        return modelAndView;
    }
}
