package cn.bevol.statics.dao.mapper;

import cn.bevol.statics.dao.Config;
import cn.bevol.statics.dao.ConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    long countByExample(ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    int deleteByExample(ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    int insert(Config record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    int insertSelective(Config record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    List<Config> selectByExampleWithBLOBsWithRowbounds(ConfigExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    List<Config> selectByExampleWithBLOBs(ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    List<Config> selectByExampleWithRowbounds(ConfigExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    List<Config> selectByExample(ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    Config selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Config record, @Param("example") ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Config record, @Param("example") ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Config record, @Param("example") ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Config record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Config record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Config record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<Config> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<Config> list, @Param("selective") Config.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Config selectOneByExample(ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_config
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Config selectOneByExampleWithBLOBs(ConfigExample example);
}