package com.jk.controller.shop;

import com.jk.model.ShopBean;
import com.jk.service.shop.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * <pre>项目名称：workspace
 * 类名称：ShopController
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/11 20:53
 * 修改人：张利瑶
 * 修改时间：2019/4/11 20:53
 * 修改备注：
 * @version </pre>
 */
@Controller
@RequestMapping("shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    //查询
    @RequestMapping("findShopPage")
    @ResponseBody
    public HashMap<String,Object> findShopPage(Integer page, Integer rows, ShopBean shop){
        HashMap<String,Object> has=shopService.findShopPage(page,rows,shop);
        return has;
    }


    //新增
    @RequestMapping("saveShop")
    @ResponseBody
    public void saveShop(ShopBean shop){
        shop.setRiqi(new Date());
        shopService.saveShop(shop);
    }

    //删除
    @RequestMapping("deleteAll")
    @ResponseBody
    public Boolean deleteAll(String ids){
        try {
           String[] stuList = ids.split(",");
            // 将字符串数组转为List<Intger> 类型
            List<Integer> LString = new ArrayList<Integer>();
            for(String str : stuList){
                LString.add(new Integer(str));
            }
            shopService.deleteItem(LString);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //回显
    @RequestMapping("findShopById")
    @ResponseBody
    public ShopBean findShopById(Integer shopId){
        ShopBean shop=shopService.findShopById(shopId);
        return shop;
    }



}
