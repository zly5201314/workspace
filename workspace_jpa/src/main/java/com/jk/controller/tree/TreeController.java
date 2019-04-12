package com.jk.controller.tree;

import com.jk.model.TreeBean;
import com.jk.service.tree.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <pre>项目名称：workspace
 * 类名称：TreeController
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/11 16:38
 * 修改人：张利瑶
 * 修改时间：2019/4/11 16:38
 * 修改备注：
 * @version </pre>
 */
@Controller
@RequestMapping("tree")
public class TreeController {

    @Autowired
    private TreeService treeService;

    //左侧树
    @RequestMapping("findTree")
    @ResponseBody
    public List<TreeBean> findTree(){
        List<TreeBean> list=treeService.findTree();
        return list;
    }

}
