package com.codi.bus.core.domain;

import java.util.Date;

public class UserProfile {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uf_user_profile.uf_profile_id
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    private Long profileId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uf_user_profile.ur_user_id
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uf_user_profile.uf_user_address
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    private String userAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uf_user_profile.uf_address_code
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    private String addressCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uf_user_profile.uf_user_occupation
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    private String userOccupation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uf_user_profile.uf_occupation_code
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    private String occupationCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uf_user_profile.uf_self_sustain
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    private Boolean selfSustain;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uf_user_profile.uf_beneficiary
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    private String beneficiary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uf_user_profile.uf_owner
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    private String owner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uf_user_profile.uf_test_expired_date
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    private Date testExpiredDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uf_user_profile.uf_create_date
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uf_user_profile.uf_create_user_id
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    private String createUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uf_user_profile.uf_last_updated_date
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    private Date lastUpdatedDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uf_user_profile.uf_last_updated_user_id
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    private String lastUpdatedUserId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uf_user_profile.uf_profile_id
     *
     * @return the value of uf_user_profile.uf_profile_id
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public Long getProfileId() {
        return profileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uf_user_profile.uf_profile_id
     *
     * @param profileId the value for uf_user_profile.uf_profile_id
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uf_user_profile.ur_user_id
     *
     * @return the value of uf_user_profile.ur_user_id
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uf_user_profile.ur_user_id
     *
     * @param userId the value for uf_user_profile.ur_user_id
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uf_user_profile.uf_user_address
     *
     * @return the value of uf_user_profile.uf_user_address
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uf_user_profile.uf_user_address
     *
     * @param userAddress the value for uf_user_profile.uf_user_address
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uf_user_profile.uf_address_code
     *
     * @return the value of uf_user_profile.uf_address_code
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public String getAddressCode() {
        return addressCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uf_user_profile.uf_address_code
     *
     * @param addressCode the value for uf_user_profile.uf_address_code
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode == null ? null : addressCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uf_user_profile.uf_user_occupation
     *
     * @return the value of uf_user_profile.uf_user_occupation
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public String getUserOccupation() {
        return userOccupation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uf_user_profile.uf_user_occupation
     *
     * @param userOccupation the value for uf_user_profile.uf_user_occupation
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public void setUserOccupation(String userOccupation) {
        this.userOccupation = userOccupation == null ? null : userOccupation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uf_user_profile.uf_occupation_code
     *
     * @return the value of uf_user_profile.uf_occupation_code
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public String getOccupationCode() {
        return occupationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uf_user_profile.uf_occupation_code
     *
     * @param occupationCode the value for uf_user_profile.uf_occupation_code
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public void setOccupationCode(String occupationCode) {
        this.occupationCode = occupationCode == null ? null : occupationCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uf_user_profile.uf_self_sustain
     *
     * @return the value of uf_user_profile.uf_self_sustain
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public Boolean getSelfSustain() {
        return selfSustain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uf_user_profile.uf_self_sustain
     *
     * @param selfSustain the value for uf_user_profile.uf_self_sustain
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public void setSelfSustain(Boolean selfSustain) {
        this.selfSustain = selfSustain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uf_user_profile.uf_beneficiary
     *
     * @return the value of uf_user_profile.uf_beneficiary
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public String getBeneficiary() {
        return beneficiary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uf_user_profile.uf_beneficiary
     *
     * @param beneficiary the value for uf_user_profile.uf_beneficiary
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary == null ? null : beneficiary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uf_user_profile.uf_owner
     *
     * @return the value of uf_user_profile.uf_owner
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public String getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uf_user_profile.uf_owner
     *
     * @param owner the value for uf_user_profile.uf_owner
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uf_user_profile.uf_test_expired_date
     *
     * @return the value of uf_user_profile.uf_test_expired_date
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public Date getTestExpiredDate() {
        return testExpiredDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uf_user_profile.uf_test_expired_date
     *
     * @param testExpiredDate the value for uf_user_profile.uf_test_expired_date
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public void setTestExpiredDate(Date testExpiredDate) {
        this.testExpiredDate = testExpiredDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uf_user_profile.uf_create_date
     *
     * @return the value of uf_user_profile.uf_create_date
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uf_user_profile.uf_create_date
     *
     * @param createDate the value for uf_user_profile.uf_create_date
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uf_user_profile.uf_create_user_id
     *
     * @return the value of uf_user_profile.uf_create_user_id
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uf_user_profile.uf_create_user_id
     *
     * @param createUserId the value for uf_user_profile.uf_create_user_id
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uf_user_profile.uf_last_updated_date
     *
     * @return the value of uf_user_profile.uf_last_updated_date
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uf_user_profile.uf_last_updated_date
     *
     * @param lastUpdatedDate the value for uf_user_profile.uf_last_updated_date
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uf_user_profile.uf_last_updated_user_id
     *
     * @return the value of uf_user_profile.uf_last_updated_user_id
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public String getLastUpdatedUserId() {
        return lastUpdatedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uf_user_profile.uf_last_updated_user_id
     *
     * @param lastUpdatedUserId the value for uf_user_profile.uf_last_updated_user_id
     *
     * @mbggenerated Wed Jun 21 15:32:48 CST 2017
     */
    public void setLastUpdatedUserId(String lastUpdatedUserId) {
        this.lastUpdatedUserId = lastUpdatedUserId == null ? null : lastUpdatedUserId.trim();
    }
}