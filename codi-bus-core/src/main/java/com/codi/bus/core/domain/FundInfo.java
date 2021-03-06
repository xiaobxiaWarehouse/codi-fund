package com.codi.bus.core.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class FundInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fi_fund_info.fi_fund_id
     *
     * @mbggenerated Fri Sep 30 11:33:27 CST 2016
     */
    private Long fundId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fi_fund_info.fi_fund_code
     *
     * @mbggenerated Fri Sep 30 11:33:27 CST 2016
     */
    private String fundCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fi_fund_info.fi_fund_name
     *
     * @mbggenerated Fri Sep 30 11:33:27 CST 2016
     */
    private String fundName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fi_fund_info.fi_short_name
     *
     * @mbggenerated Fri Sep 30 11:33:27 CST 2016
     */
    private String shortName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fi_fund_info.fi_fund_status
     *
     * @mbggenerated Fri Sep 30 11:33:27 CST 2016
     */
    private String fundStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fi_fund_info.fi_ta_no
     *
     * @mbggenerated Fri Sep 30 11:33:27 CST 2016
     */
    private String taNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fi_fund_info.fi_ofund_type
     *
     * @mbggenerated Fri Sep 30 11:33:27 CST 2016
     */
    private String fundType;

    /**
     * 基金类型名称（聚源取得）
     */
    private String fundTypeName;

    /**
     * 基金类型code（聚源取得）
     */
    private Integer fundTypeCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fi_fund_info.fi_total_count
     *
     * @mbggenerated Fri Sep 30 11:33:27 CST 2016
     */
    private Integer totalCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fi_fund_info.fi_rowcount
     *
     * @mbggenerated Fri Sep 30 11:33:27 CST 2016
     */
    private Integer rowCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fi_fund_info.fi_e_contract_flag
     *
     * @mbggenerated Fri Sep 30 11:33:27 CST 2016
     */
    private String eContractFlag;

    private Integer riskLevel;

    public Integer getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fi_fund_info.fi_create_date
     *
     * @mbggenerated Fri Sep 30 11:33:27 CST 2016
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fi_fund_info.fi_last_updated_date
     *
     * @mbggenerated Fri Sep 30 11:33:27 CST 2016
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdatedDate;

	public Long getFundId() {
		return fundId;
	}

	public void setFundId(Long fundId) {
		this.fundId = fundId;
	}

	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getFundStatus() {
		return fundStatus;
	}

	public void setFundStatus(String fundStatus) {
		this.fundStatus = fundStatus;
	}

	public String getTaNo() {
		return taNo;
	}

	public void setTaNo(String taNo) {
		this.taNo = taNo;
	}


	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getFundType() {
		return fundType;
	}

	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public Integer getRowCount() {
		return rowCount;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}

	public String geteContractFlag() {
		return eContractFlag;
	}

	public void seteContractFlag(String eContractFlag) {
		this.eContractFlag = eContractFlag;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getFundTypeName() {
		return fundTypeName;
	}

	public void setFundTypeName(String fundTypeName) {
		this.fundTypeName = fundTypeName;
	}

	public Integer getFundTypeCode() {
		return fundTypeCode;
	}

	public void setFundTypeCode(Integer fundTypeCode) {
		this.fundTypeCode = fundTypeCode;
	}
}
