package com.jk.mapper.tree;

import com.jk.model.TreeBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <pre>项目名称：workspace
 * 类名称：TreeMapper
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/11 17:28
 * 修改人：张利瑶
 * 修改时间：2019/4/11 17:28
 * 修改备注：
 * @version </pre>
 */
@Repository
public interface TreeMapper extends JpaRepository<TreeBean,Integer> {
      //左侧树
     @Query(nativeQuery = true,value=" SELECT id,pid,text,href from t_tree2 where pid=:pid")
     List<TreeBean> findTree(@Param("pid") Integer pid);
}
