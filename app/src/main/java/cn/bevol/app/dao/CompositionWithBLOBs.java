package cn.bevol.app.dao;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table hq_composition
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class CompositionWithBLOBs extends Composition implements Serializable {
    /**
     * Database Column Remarks:
     *   成分概述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_composition.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * Database Column Remarks:
     *   日文名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_composition.namejp
     *
     * @mbg.generated
     */
    private String namejp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_composition.remark
     *
     * @return the value of hq_composition.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    public CompositionWithBLOBs withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_composition.remark
     *
     * @param remark the value for hq_composition.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_composition.namejp
     *
     * @return the value of hq_composition.namejp
     *
     * @mbg.generated
     */
    public String getNamejp() {
        return namejp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_composition
     *
     * @mbg.generated
     */
    public CompositionWithBLOBs withNamejp(String namejp) {
        this.setNamejp(namejp);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_composition.namejp
     *
     * @param namejp the value for hq_composition.namejp
     *
     * @mbg.generated
     */
    public void setNamejp(String namejp) {
        this.namejp = namejp == null ? null : namejp.trim();
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table hq_composition
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        tstamp("tstamp"),
        crdate("crdate"),
        cruserId("cruser_id"),
        deleted("deleted"),
        hidden("hidden"),
        sorting("sorting"),
        hit("hit"),
        hot("hot"),
        top("top"),
        name("name"),
        efficacy("efficacy"),
        english("english"),
        frequency("frequency"),
        active("active"),
        safety("safety"),
        acneRisk("acne_risk"),
        cas("cas"),
        otherTitle("other_title"),
        usedNum("used_num"),
        shenyong("shenyong"),
        used("used"),
        usedName("used_name"),
        pid("pid"),
        likecount("likecount"),
        commentcount("commentcount"),
        ospw("OSPW"),
        ospt("OSPT"),
        osnw("OSNW"),
        osnt("OSNT"),
        orpw("ORPW"),
        ornw("ORNW"),
        ornt("ORNT"),
        dspw("DSPW"),
        dspt("DSPT"),
        dsnw("DSNW"),
        dsnt("DSNT"),
        drpw("DRPW"),
        drpt("DRPT"),
        drnw("DRNW"),
        drnt("DRNT"),
        orpt("ORPT"),
        mid("mid"),
        mpid("mpid"),
        namelength("namelength"),
        u1("u1"),
        reserve("reserve"),
        cmName("cm_name"),
        cmEnglish("cm_english"),
        remark("remark"),
        namejp("namejp");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table hq_composition
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_composition
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_composition
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_composition
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_composition
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_composition
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}