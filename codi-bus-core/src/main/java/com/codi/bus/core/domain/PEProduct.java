package com.codi.bus.core.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class PEProduct {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pp_peproduct.pp_product_id
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    private Long productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pp_peproduct.pp_product_name
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    private String productName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pp_peproduct.pp_product_duration
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    private String productDuration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pp_peproduct.pp_product_status
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    private Integer productStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pp_peproduct.pp_product_thumbnail
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    private String productThumbnail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pp_peproduct.pp_product_url
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    private String productUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pp_peproduct.pp_is_valid
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    private Boolean isValid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pp_peproduct.pp_create_date
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pp_peproduct.pp_create_user_id
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    private String createUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pp_peproduct.pp_last_update_date
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    private Date lastUpdateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pp_peproduct.pp_last_update_user_id
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    private String lastUpdateUserId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pp_peproduct.pp_product_id
     *
     * @return the value of pp_peproduct.pp_product_id
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pp_peproduct.pp_product_id
     *
     * @param productId the value for pp_peproduct.pp_product_id
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pp_peproduct.pp_product_name
     *
     * @return the value of pp_peproduct.pp_product_name
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pp_peproduct.pp_product_name
     *
     * @param productName the value for pp_peproduct.pp_product_name
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pp_peproduct.pp_product_duration
     *
     * @return the value of pp_peproduct.pp_product_duration
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public String getProductDuration() {
        return productDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pp_peproduct.pp_product_duration
     *
     * @param productDuration the value for pp_peproduct.pp_product_duration
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public void setProductDuration(String productDuration) {
        this.productDuration = productDuration == null ? null : productDuration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pp_peproduct.pp_product_status
     *
     * @return the value of pp_peproduct.pp_product_status
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public Integer getProductStatus() {
        return productStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pp_peproduct.pp_product_status
     *
     * @param productStatus the value for pp_peproduct.pp_product_status
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pp_peproduct.pp_product_thumbnail
     *
     * @return the value of pp_peproduct.pp_product_thumbnail
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public String getProductThumbnail() {
        return productThumbnail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pp_peproduct.pp_product_thumbnail
     *
     * @param productThumbnail the value for pp_peproduct.pp_product_thumbnail
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public void setProductThumbnail(String productThumbnail) {
        this.productThumbnail = productThumbnail == null ? null : productThumbnail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pp_peproduct.pp_product_url
     *
     * @return the value of pp_peproduct.pp_product_url
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public String getProductUrl() {
        return productUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pp_peproduct.pp_product_url
     *
     * @param productUrl the value for pp_peproduct.pp_product_url
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl == null ? null : productUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pp_peproduct.pp_is_valid
     *
     * @return the value of pp_peproduct.pp_is_valid
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    @JSONField(serialize = false)
    public Boolean getIsValid() {
        return isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pp_peproduct.pp_is_valid
     *
     * @param isValid the value for pp_peproduct.pp_is_valid
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pp_peproduct.pp_create_date
     *
     * @return the value of pp_peproduct.pp_create_date
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    @JSONField(serialize = false)
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pp_peproduct.pp_create_date
     *
     * @param createDate the value for pp_peproduct.pp_create_date
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pp_peproduct.pp_create_user_id
     *
     * @return the value of pp_peproduct.pp_create_user_id
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pp_peproduct.pp_create_user_id
     *
     * @param createUserId the value for pp_peproduct.pp_create_user_id
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pp_peproduct.pp_last_update_date
     *
     * @return the value of pp_peproduct.pp_last_update_date
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pp_peproduct.pp_last_update_date
     *
     * @param lastUpdateDate the value for pp_peproduct.pp_last_update_date
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pp_peproduct.pp_last_update_user_id
     *
     * @return the value of pp_peproduct.pp_last_update_user_id
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pp_peproduct.pp_last_update_user_id
     *
     * @param lastUpdateUserId the value for pp_peproduct.pp_last_update_user_id
     *
     * @mbggenerated Mon Jan 09 22:22:28 CST 2017
     */
    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId == null ? null : lastUpdateUserId.trim();
    }
}