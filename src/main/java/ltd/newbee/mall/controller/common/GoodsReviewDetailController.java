package ltd.newbee.mall.controller.common;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import ltd.newbee.mall.entity.GoodsReviewDetail;
import ltd.newbee.mall.service.GoodsReviewDetailService;

@RestController
@RequestMapping("/review-detail")
public class GoodsReviewDetailController {
    @Autowired
    private GoodsReviewDetailService goodsReviewDetailService;

    @GetMapping("/{goodsId}")
    public ResponseEntity<List<GoodsReviewDetail>> getGoodsReviewsByGoodsId(@PathVariable Integer goodsId) {
        List<GoodsReviewDetail> goodsReviews = goodsReviewDetailService.getGoodsReviewsByGoodsId(goodsId);
        return new ResponseEntity<>(goodsReviews, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> addGoodsReviewDetail(@RequestBody GoodsReviewDetail reviewDetail) {
        try {
            goodsReviewDetailService.addGoodsReviewDetail(reviewDetail);
            return new ResponseEntity<>("Review detail added successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

