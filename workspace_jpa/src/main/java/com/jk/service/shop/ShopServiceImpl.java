package com.jk.service.shop;

import com.jk.mapper.shop.ShopMapper;
import com.jk.model.ShopBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * <pre>项目名称：workspace
 * 类名称：ShopServiceImpl
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/11 20:54
 * 修改人：张利瑶
 * 修改时间：2019/4/11 20:54
 * 修改备注：
 * @version </pre>
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;


    //查询
    @Override
    public HashMap<String, Object> findShopPage(Integer page, Integer rows, ShopBean shop) {
        HashMap<String,Object> hashMap = new HashMap();
        int count=shopMapper.queryShopCount(shop);
        int start=(page-1)*rows;
        List<ShopBean> list=shopMapper.queryShopList(start,rows,shop);
        hashMap.put("total",count);
        hashMap.put("rows",list);
        return hashMap;
    }

    //新增
    @Override
    public void saveShop(ShopBean shop) {
        shopMapper.save(shop);
    }

    @Override
    public void deleteItem(List<Integer> ids) {
/*
        shopMapper.deleteById(ids);
*/
       shopMapper.deleteItem(ids);
    }

    //回显
    @Override
    public ShopBean findShopById(Integer shopId) { ;
       return  shopMapper.findShopById(shopId);
    }


}
