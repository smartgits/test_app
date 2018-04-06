package cn.bevol.statics.dao;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table hq_goods_ext
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class GoodsExtWithBLOBs extends GoodsExt implements Serializable {
    /**
     * Database Column Remarks:
     *   药监局顺序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods_ext.def_cps
     *
     * @mbg.generated
     */
    private String defCps;

    /**
     * Database Column Remarks:
     *   手动排序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods_ext.gc_cps
     *
     * @mbg.generated
     */
    private String gcCps;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods_ext.mfj_cps
     *
     * @mbg.generated
     */
    private String mfjCps;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods_ext.def_ext_cps
     *
     * @mbg.generated
     */
    private String defExtCps;

    /**
     * Database Column Remarks:
     *   默认def_cps
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods_ext.cps_type
     *
     * @mbg.generated
     */
    private String cpsType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hq_goods_ext.cps
     *
     * @mbg.generated
     */
    private String cps;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hq_goods_ext
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods_ext.def_cps
     *
     * @return the value of hq_goods_ext.def_cps
     *
     * @mbg.generated
     */
    public String getDefCps() {
        return defCps;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_ext
     *
     * @mbg.generated
     */
    public GoodsExtWithBLOBs withDefCps(String defCps) {
        this.setDefCps(defCps);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods_ext.def_cps
     *
     * @param defCps the value for hq_goods_ext.def_cps
     *
     * @mbg.generated
     */
    public void setDefCps(String defCps) {
        this.defCps = defCps == null ? null : defCps.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods_ext.gc_cps
     *
     * @return the value of hq_goods_ext.gc_cps
     *
     * @mbg.generated
     */
    public String getGcCps() {
        return gcCps;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_ext
     *
     * @mbg.generated
     */
    public GoodsExtWithBLOBs withGcCps(String gcCps) {
        this.setGcCps(gcCps);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods_ext.gc_cps
     *
     * @param gcCps the value for hq_goods_ext.gc_cps
     *
     * @mbg.generated
     */
    public void setGcCps(String gcCps) {
        this.gcCps = gcCps == null ? null : gcCps.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods_ext.mfj_cps
     *
     * @return the value of hq_goods_ext.mfj_cps
     *
     * @mbg.generated
     */
    public String getMfjCps() {
        return mfjCps;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_ext
     *
     * @mbg.generated
     */
    public GoodsExtWithBLOBs withMfjCps(String mfjCps) {
        this.setMfjCps(mfjCps);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods_ext.mfj_cps
     *
     * @param mfjCps the value for hq_goods_ext.mfj_cps
     *
     * @mbg.generated
     */
    public void setMfjCps(String mfjCps) {
        this.mfjCps = mfjCps == null ? null : mfjCps.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods_ext.def_ext_cps
     *
     * @return the value of hq_goods_ext.def_ext_cps
     *
     * @mbg.generated
     */
    public String getDefExtCps() {
        return defExtCps;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_ext
     *
     * @mbg.generated
     */
    public GoodsExtWithBLOBs withDefExtCps(String defExtCps) {
        this.setDefExtCps(defExtCps);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods_ext.def_ext_cps
     *
     * @param defExtCps the value for hq_goods_ext.def_ext_cps
     *
     * @mbg.generated
     */
    public void setDefExtCps(String defExtCps) {
        this.defExtCps = defExtCps == null ? null : defExtCps.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods_ext.cps_type
     *
     * @return the value of hq_goods_ext.cps_type
     *
     * @mbg.generated
     */
    public String getCpsType() {
        return cpsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_ext
     *
     * @mbg.generated
     */
    public GoodsExtWithBLOBs withCpsType(String cpsType) {
        this.setCpsType(cpsType);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods_ext.cps_type
     *
     * @param cpsType the value for hq_goods_ext.cps_type
     *
     * @mbg.generated
     */
    public void setCpsType(String cpsType) {
        this.cpsType = cpsType == null ? null : cpsType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hq_goods_ext.cps
     *
     * @return the value of hq_goods_ext.cps
     *
     * @mbg.generated
     */
    public String getCps() {
        return cps;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hq_goods_ext
     *
     * @mbg.generated
     */
    public GoodsExtWithBLOBs withCps(String cps) {
        this.setCps(cps);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hq_goods_ext.cps
     *
     * @param cps the value for hq_goods_ext.cps
     *
     * @mbg.generated
     */
    public void setCps(String cps) {
        this.cps = cps == null ? null : cps.trim();
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table hq_goods_ext
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        goodsId("goods_id"),
        allowComment("allow_comment"),
        defCps("def_cps"),
        gcCps("gc_cps"),
        mfjCps("mfj_cps"),
        defExtCps("def_ext_cps"),
        cpsType("cps_type"),
        cps("cps");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table hq_goods_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_goods_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_goods_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_goods_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_goods_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table hq_goods_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}