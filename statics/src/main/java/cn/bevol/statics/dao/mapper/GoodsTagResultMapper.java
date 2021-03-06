package cn.bevol.statics.dao.mapper;

import cn.bevol.statics.dao.GoodsTagResult;
import cn.bevol.statics.dao.GoodsTagResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsTagResultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_tag_result
     *
     * @mbg.generated
     */
    long countByExample(GoodsTagResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_tag_result
     *
     * @mbg.generated
     */
    int insert(GoodsTagResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_tag_result
     *
     * @mbg.generated
     */
    int insertSelective(GoodsTagResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_tag_result
     *
     * @mbg.generated
     */
    List<GoodsTagResult> selectByExampleWithRowbounds(GoodsTagResultExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_tag_result
     *
     * @mbg.generated
     */
    List<GoodsTagResult> selectByExample(GoodsTagResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_tag_result
     *
     * @mbg.generated
     */
    GoodsTagResult selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_tag_result
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") GoodsTagResult record, @Param("example") GoodsTagResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_tag_result
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") GoodsTagResult record, @Param("example") GoodsTagResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_tag_result
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GoodsTagResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_tag_result
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GoodsTagResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_tag_result
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<GoodsTagResult> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_tag_result
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<GoodsTagResult> list, @Param("selective") GoodsTagResult.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_tag_result
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    GoodsTagResult selectOneByExample(GoodsTagResultExample example);
}