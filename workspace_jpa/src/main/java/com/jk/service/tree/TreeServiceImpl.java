package com.jk.service.tree;

import com.jk.mapper.tree.TreeMapper;
import com.jk.model.TreeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <pre>项目名称：workspace
 * 类名称：TreeServiceImpl
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/11 17:19
 * 修改人：张利瑶
 * 修改时间：2019/4/11 17:19
 * 修改备注：
 * @version </pre>
 */
@Service
public class TreeServiceImpl implements TreeService {

    @Autowired
    private TreeMapper treeMapper;


    //左侧树
    public List<TreeBean> findTree() {
        Integer pid=0;
        List<TreeBean> list = getTreeBeans(pid);
        return list;
    }

    private List<TreeBean> getTreeBeans(Integer pid) {
        List<TreeBean> list2 =treeMapper.findTree(pid);
        for (TreeBean treeBean : list2) {
            Integer id = treeBean.getId();
            List<TreeBean> nodes = getTreeBeans(id);
            if(nodes.size()<=0){
                //无子节点
                treeBean.setSelectable(true);
            }else{
                //                //有子节点
                treeBean.setSelectable(false);
                treeBean.setNodes(nodes);
            }
        }
        return list2;
    }


}
