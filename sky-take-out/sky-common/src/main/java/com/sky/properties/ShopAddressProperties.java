package com.sky.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky")
@Data
public class ShopAddressProperties {

    private Shop shop = new Shop();
    private Baidu baidu = new Baidu();

    @Data
    public static class Shop {
        private String address;
    }

    @Data
    public static class Baidu {
        private String ak;
    }
}
