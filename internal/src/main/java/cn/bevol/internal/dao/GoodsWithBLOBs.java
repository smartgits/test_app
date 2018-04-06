package cn.bevol.internal.dao;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table hq_goods
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class GoodsWithBLOBs extends Goods implements Serializable {
    /**
     * Database Column Remarks:
     *   产品备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * Database Column Remarks:
     *   特别说明 注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods.explainz
     *
     * @mbg.generated
     */
    private String explainz;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods.gcsort
     *
     * @mbg.generated
     */
    private String gcsort;

    /**
     * Database Column Remarks:
     *   成分列表说明
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods.tips
     *
     * @mbg.generated
     */
    private String tips;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods.doyencomment
     *
     * @mbg.generated
     */
    private String doyencomment;

    /**
     * Database Column Remarks:
     *   成分id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods.cps
     *
     * @mbg.generated
     */
    private String cps;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hq_goods
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods.content
     *
     * @return the value of hq_goods.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods
     *
     * @mbg.generated
     */
    public GoodsWithBLOBs withContent(String content) {
        this.setContent(content);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods.content
     *
     * @param content the value for hq_goods.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods.explainz
     *
     * @return the value of hq_goods.explainz
     *
     * @mbg.generated
     */
    public String getExplainz() {
        return explainz;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods
     *
     * @mbg.generated
     */
    public GoodsWithBLOBs withExplainz(String explainz) {
        this.setExplainz(explainz);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods.explainz
     *
     * @param explainz the value for hq_goods.explainz
     *
     * @mbg.generated
     */
    public void setExplainz(String explainz) {
        this.explainz = explainz == null ? null : explainz.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods.gcsort
     *
     * @return the value of hq_goods.gcsort
     *
     * @mbg.generated
     */
    public String getGcsort() {
        return gcsort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods
     *
     * @mbg.generated
     */
    public GoodsWithBLOBs withGcsort(String gcsort) {
        this.setGcsort(gcsort);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods.gcsort
     *
     * @param gcsort the value for hq_goods.gcsort
     *
     * @mbg.generated
     */
    public void setGcsort(String gcsort) {
        this.gcsort = gcsort == null ? null : gcsort.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods.tips
     *
     * @return the value of hq_goods.tips
     *
     * @mbg.generated
     */
    public String getTips() {
        return tips;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods
     *
     * @mbg.generated
     */
    public GoodsWithBLOBs withTips(String tips) {
        this.setTips(tips);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods.tips
     *
     * @param tips the value for hq_goods.tips
     *
     * @mbg.generated
     */
    public void setTips(String tips) {
        this.tips = tips == null ? null : tips.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods.doyencomment
     *
     * @return the value of hq_goods.doyencomment
     *
     * @mbg.generated
     */
    public String getDoyencomment() {
        return doyencomment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods
     *
     * @mbg.generated
     */
    public GoodsWithBLOBs withDoyencomment(String doyencomment) {
        this.setDoyencomment(doyencomment);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods.doyencomment
     *
     * @param doyencomment the value for hq_goods.doyencomment
     *
     * @mbg.generated
     */
    public void setDoyencomment(String doyencomment) {
        this.doyencomment = doyencomment == null ? null : doyencomment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods.cps
     *
     * @return the value of hq_goods.cps
     *
     * @mbg.generated
     */
    public String getCps() {
        return cps;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods
     *
     * @mbg.generated
     */
    public GoodsWithBLOBs withCps(String cps) {
        this.setCps(cps);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods.cps
     *
     * @param cps the value for hq_goods.cps
     *
     * @mbg.generated
     */
    public void setCps(String cps) {
        this.cps = cps == null ? null : cps.trim();
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table hq_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        brandId("brand_id"),
        tstamp("tstamp"),
        crdate("crdate"),
        startdate("startdate"),
        overdate("overdate"),
        cruserId("cruser_id"),
        deleted("deleted"),
        hidden("hidden"),
        mergeId("merge_id"),
        sorting("sorting"),
        hit("hit"),
        hot("hot"),
        top("top"),
        title("title"),
        alias("alias"),
        alias2("alias_2"),
        image("image"),
        category("category"),
        company("company"),
        companyEnglish("company_english"),
        address("address"),
        approval("approval"),
        state("state"),
        approvalDate("approval_date"),
        validityDate("validity_date"),
        license("license"),
        remark3("remark3"),
        skills("skills"),
        keywords("keywords"),
        likeNum("like_num"),
        usedNum("used_num"),
        fromz("fromz"),
        flag("flag"),
        recordNum("record_num"),
        recordDate("record_date"),
        isRecord("is_record"),
        actualCompany("actual_company"),
        actualCompanyAddress("actual_company_address"),
        dataType("data_type"),
        chinaCompany("china_company"),
        chinaAddress("china_address"),
        country("country"),
        instruction("instruction"),
        brand("brand"),
        cname("cname"),
        remark("remark"),
        processid("processid"),
        ishas("ishas"),
        iscag("iscag"),
        skillsurl("skillsUrl"),
        categorystr("categoryStr"),
        likecount("likecount"),
        commentcount("commentcount"),
        notlikecount("notlikecount"),
        mid("mid"),
        ismodify("ismodify"),
        newGoodsTitle("new_goods_title"),
        doyenid("doyenid"),
        isdoyenmodify("isdoyenmodify"),
        price("price"),
        capacity("capacity"),
        sellPrice("sell_price"),
        sellCapacity("sell_capacity"),
        hiddenSkin("hidden_skin"),
        cpsType("cps_type"),
        priceUnit("price_unit"),
        content("content"),
        explainz("explainz"),
        gcsort("gcsort"),
        tips("tips"),
        doyencomment("doyencomment"),
        cps("cps");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table hq_goods
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_goods
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_goods
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_goods
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_goods
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_goods
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}