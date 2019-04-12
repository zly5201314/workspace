package com.jk.service.tree;

import com.jk.model.TreeBean;

import java.util.List;

/**
 * <pre>项目名称：workspace
 * 类名称：TreeService
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/11 17:18
 * 修改人：张利瑶
 * 修改时间：2019/4/11 17:18
 * 修改备注：
 * @version </pre>
 */
public interface TreeService {

    //左侧树
    List<TreeBean> findTree();
}
