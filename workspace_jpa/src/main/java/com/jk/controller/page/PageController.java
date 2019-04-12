package com.jk.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>项目名称：workspace
 * 类名称：PageController
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/11 16:37
 * 修改人：张利瑶
 * 修改时间：2019/4/11 16:37
 * 修改备注：
 * @version </pre>
 */
@Controller
@RequestMapping("page")
public class PageController {

   //左侧树
    @RequestMapping("easyui")
    public String easyui(){
        System.out.println("111");

        return  "main";
    }

    //商品查询
    @RequestMapping("queryShop")
    public String queryShop(){
        System.out.println("111");

        return "shop";
    }

    //跳转新增页面
    @RequestMapping("toAddShop")
    public String toAddShop(){
        return "toAddShop";
    }

    @RequestMapping("toUpdateShop")
    public String toUpdateShop(){
        return "toUpdateShop";
    }

}
