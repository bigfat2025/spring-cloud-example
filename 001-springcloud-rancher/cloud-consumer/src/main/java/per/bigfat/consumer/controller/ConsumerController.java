package per.bigfat.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.bigfat.api.ProviderFeign;
import per.bigfat.api.dto.GoodsInfo;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource
    private ProviderFeign providerFeign;


    @GetMapping("/getGoodsInfo")
    public GoodsInfo getGoodsInfo() {
        return providerFeign.getGoodsInfo();
    }

}
