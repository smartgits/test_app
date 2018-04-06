package cn.bevol.app.dao.mapper;

import cn.bevol.app.dao.Composition;
import cn.bevol.app.dao.CompositionExample;
import cn.bevol.app.dao.CompositionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CompositionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    long countByExample(CompositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    int insert(CompositionWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    int insertSelective(CompositionWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    List<CompositionWithBLOBs> selectByExampleWithBLOBsWithRowbounds(CompositionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    List<CompositionWithBLOBs> selectByExampleWithBLOBs(CompositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    List<Composition> selectByExampleWithRowbounds(CompositionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    List<Composition> selectByExample(CompositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    CompositionWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CompositionWithBLOBs record, @Param("example") CompositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") CompositionWithBLOBs record, @Param("example") CompositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Composition record, @Param("example") CompositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CompositionWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(CompositionWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Composition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<CompositionWithBLOBs> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<CompositionWithBLOBs> list, @Param("selective") CompositionWithBLOBs.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Composition selectOneByExample(CompositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CompositionWithBLOBs selectOneByExampleWithBLOBs(CompositionExample example);
}