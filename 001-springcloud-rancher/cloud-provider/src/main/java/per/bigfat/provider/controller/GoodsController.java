package per.bigfat.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.bigfat.api.dto.GoodsInfo;

@RestController
@RequestMapping("/provider")
@Slf4j
public class GoodsController {

    @GetMapping("/goods/info")
    public GoodsInfo getGoodsInfo(){
        log.info("getGoodsInfo 开始调用...");
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setGoodsId("1");
        goodsInfo.setGoodsName("商品1");
        goodsInfo.setGoodsPrice("1.00");
        log.info("getGoodsInfo 调用结束...， goodsInfo is {}", goodsInfo);
        return goodsInfo;
    }
}
