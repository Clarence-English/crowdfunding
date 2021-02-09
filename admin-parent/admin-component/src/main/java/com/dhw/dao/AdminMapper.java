package com.dhw.dao;

import com.dhw.entity.Admin;
import com.dhw.entity.AdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 管理员数据操作
 *
 * @author dhw
 */
public interface AdminMapper {
    /**
     * 按照条件进行统计
     *
     * @param example 条件
     * @return 总数
     */
    int countByExample(AdminExample example);

    /**
     * 按照条件删除
     *
     * @param example 条件
     * @return 执行行数
     */
    int deleteByExample(AdminExample example);

    /**
     * 按照主键删除
     *
     * @param id 主键
     * @return 执行行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入数据
     *
     * @param record 管理员对象
     * @return 执行行数
     */
    int insert(Admin record);

    /**
     * 按照有选择的进行插入
     *
     * @param record 管理员对象
     * @return 执行行数
     */
    int insertSelective(Admin record);

    /**
     * 按照条件的查询
     *
     * @param example 条件
     * @return 执行结果
     */
    List<Admin> selectByExample(AdminExample example);

    /**
     * 按照主键的查询
     *
     * @param id 主键
     * @return 执行结果
     */
    Admin selectByPrimaryKey(Integer id);

    /**
     * 按照条件、有选择的更新
     *
     * @param record  管理员对象
     * @param example 条件
     * @return 执行行数
     */
    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    /**
     * 按照条件更新，全字段的
     *
     * @param record  员工对象
     * @param example 条件
     * @return 执行行数
     */
    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    /**
     * 按照主键、有选择的更新
     *
     * @param record 管理员对象
     * @return 执行行数
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     * 按照主键、全字段的更新
     *
     * @param record 管理员对象
     * @return 执行行数
     */
    int updateByPrimaryKey(Admin record);
}