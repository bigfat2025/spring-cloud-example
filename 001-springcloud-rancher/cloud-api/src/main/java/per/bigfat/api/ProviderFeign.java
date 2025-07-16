package per.bigfat.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import per.bigfat.api.dto.GoodsInfo;

@FeignClient(name = "cloud-provider", path = "provider") // 服务名
public interface ProviderFeign {

    @GetMapping("/goods/info")
    GoodsInfo getGoodsInfo() ;
}
