package com.jk.mapper.shop;

import com.jk.model.ShopBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * <pre>项目名称：workspace
 * 类名称：ShopMapper
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/11 20:55
 * 修改人：张利瑶
 * 修改时间：2019/4/11 20:55
 * 修改备注：
 * @version </pre>
 */
@Repository
public interface ShopMapper extends JpaRepository<ShopBean,Integer> {


    //总条数
    @Query(nativeQuery = true,value=" SELECT count(1) from t_shop")
    int queryShopCount(@Param("shop") ShopBean shop);


    //查询
    @Query(nativeQuery = true,value=" SELECT id,`name`,price,riqi,statue from t_shop")
    List<ShopBean> queryShopList(@Param("start")int start,@Param("rows")Integer rows,@Param("shop")ShopBean shop);


    @Query(nativeQuery = true,value=" SELECT id,`name`,price,riqi,statue from t_shop where id=(?1)")
    ShopBean findShopById(Integer shopId);

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value=" delete from t_shop where id in (?1)")
    void deleteItem( List<Integer> ids);


}
