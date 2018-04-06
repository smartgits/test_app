package cn.bevol.statics.dao;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table hq_goods_poly_category
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class GoodsPolyCategory implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods_poly_category.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods_poly_category.goods_id
     *
     * @mbg.generated
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods_poly_category.category_id
     *
     * @mbg.generated
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods_poly_category.made_category_id
     *
     * @mbg.generated
     */
    private Integer madeCategoryId;

    /**
     * Database Column Remarks:
     *   是否存在多个分类,0不存在,1存在
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods_poly_category.exist_category_ids
     *
     * @mbg.generated
     */
    private Boolean existCategoryIds;

    /**
     * Database Column Remarks:
     *   类型更改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods_poly_category.update_time
     *
     * @mbg.generated
     */
    private Integer updateTime;

    /**
     * Database Column Remarks:
     *   多个分类的id,逗号隔开
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods_poly_category.category_ids
     *
     * @mbg.generated
     */
    private String categoryIds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hq_goods_poly_category
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods_poly_category.id
     *
     * @return the value of hq_goods_poly_category.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_poly_category
     *
     * @mbg.generated
     */
    public GoodsPolyCategory withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods_poly_category.id
     *
     * @param id the value for hq_goods_poly_category.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods_poly_category.goods_id
     *
     * @return the value of hq_goods_poly_category.goods_id
     *
     * @mbg.generated
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_poly_category
     *
     * @mbg.generated
     */
    public GoodsPolyCategory withGoodsId(Integer goodsId) {
        this.setGoodsId(goodsId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods_poly_category.goods_id
     *
     * @param goodsId the value for hq_goods_poly_category.goods_id
     *
     * @mbg.generated
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods_poly_category.category_id
     *
     * @return the value of hq_goods_poly_category.category_id
     *
     * @mbg.generated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_poly_category
     *
     * @mbg.generated
     */
    public GoodsPolyCategory withCategoryId(Integer categoryId) {
        this.setCategoryId(categoryId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods_poly_category.category_id
     *
     * @param categoryId the value for hq_goods_poly_category.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods_poly_category.made_category_id
     *
     * @return the value of hq_goods_poly_category.made_category_id
     *
     * @mbg.generated
     */
    public Integer getMadeCategoryId() {
        return madeCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_poly_category
     *
     * @mbg.generated
     */
    public GoodsPolyCategory withMadeCategoryId(Integer madeCategoryId) {
        this.setMadeCategoryId(madeCategoryId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods_poly_category.made_category_id
     *
     * @param madeCategoryId the value for hq_goods_poly_category.made_category_id
     *
     * @mbg.generated
     */
    public void setMadeCategoryId(Integer madeCategoryId) {
        this.madeCategoryId = madeCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods_poly_category.exist_category_ids
     *
     * @return the value of hq_goods_poly_category.exist_category_ids
     *
     * @mbg.generated
     */
    public Boolean getExistCategoryIds() {
        return existCategoryIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_poly_category
     *
     * @mbg.generated
     */
    public GoodsPolyCategory withExistCategoryIds(Boolean existCategoryIds) {
        this.setExistCategoryIds(existCategoryIds);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods_poly_category.exist_category_ids
     *
     * @param existCategoryIds the value for hq_goods_poly_category.exist_category_ids
     *
     * @mbg.generated
     */
    public void setExistCategoryIds(Boolean existCategoryIds) {
        this.existCategoryIds = existCategoryIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods_poly_category.update_time
     *
     * @return the value of hq_goods_poly_category.update_time
     *
     * @mbg.generated
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_poly_category
     *
     * @mbg.generated
     */
    public GoodsPolyCategory withUpdateTime(Integer updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods_poly_category.update_time
     *
     * @param updateTime the value for hq_goods_poly_category.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods_poly_category.category_ids
     *
     * @return the value of hq_goods_poly_category.category_ids
     *
     * @mbg.generated
     */
    public String getCategoryIds() {
        return categoryIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_poly_category
     *
     * @mbg.generated
     */
    public GoodsPolyCategory withCategoryIds(String categoryIds) {
        this.setCategoryIds(categoryIds);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods_poly_category.category_ids
     *
     * @param categoryIds the value for hq_goods_poly_category.category_ids
     *
     * @mbg.generated
     */
    public void setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds == null ? null : categoryIds.trim();
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table hq_goods_poly_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        goodsId("goods_id"),
        categoryId("category_id"),
        madeCategoryId("made_category_id"),
        existCategoryIds("exist_category_ids"),
        updateTime("update_time"),
        categoryIds("category_ids");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table hq_goods_poly_category
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_goods_poly_category
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_goods_poly_category
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_goods_poly_category
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_goods_poly_category
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_goods_poly_category
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}