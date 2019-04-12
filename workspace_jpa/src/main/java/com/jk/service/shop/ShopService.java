package com.jk.service.shop;

import com.jk.model.ShopBean;

import java.util.HashMap;
import java.util.List;

/**
 * <pre>项目名称：workspace
 * 类名称：ShopService
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/11 20:54
 * 修改人：张利瑶
 * 修改时间：2019/4/11 20:54
 * 修改备注：
 * @version </pre>
 */
public interface ShopService {
    //查询
    HashMap<String, Object> findShopPage(Integer page, Integer rows, ShopBean shop);


    void saveShop(ShopBean shop);


    void deleteItem(List<Integer> ids);

    ShopBean findShopById(Integer shopId);
}
