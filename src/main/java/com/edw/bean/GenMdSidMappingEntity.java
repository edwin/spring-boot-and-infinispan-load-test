package com.edw.bean;

import org.infinispan.api.annotations.indexing.Basic;
import org.infinispan.api.annotations.indexing.Indexed;
import org.infinispan.protostream.annotations.ProtoField;

import java.io.Serializable;

import java.util.Date;

/**
 * <pre>
 *  com.edw.bean.GenMdSidMappingEntity
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 22 Feb 2025 16:16
 */
@Indexed
public class GenMdSidMappingEntity implements Serializable {

    private Long mappingId;

    private Long accountId;

    private String sidCode;

    private String tradingId;

    private Long memberId;

    private Character recordStatus;

    private Long uploadId;

    private String createdBy;

    private Date createdOn;

    private String modifiedBy;

    private Date modifiedOn;

    private String checkedBy;

    private Date checkedOn;

    private String approvedBy;

    private Date approvedOn;

    private String sidBuyerSeller;

    public GenMdSidMappingEntity() {
    }

    public GenMdSidMappingEntity(String sidBuyerSeller, Date approvedOn, String approvedBy, Date checkedOn, String checkedBy, Date modifiedOn, String modifiedBy,
                                 Date createdOn, String createdBy, Long uploadId, Character recordStatus, Long memberId, String tradingId, String sidCode,
                                 Long accountId, Long mappingId) {
        this.sidBuyerSeller = sidBuyerSeller;
        this.approvedOn = approvedOn;
        this.approvedBy = approvedBy;
        this.checkedOn = checkedOn;
        this.checkedBy = checkedBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.uploadId = uploadId;
        this.recordStatus = recordStatus;
        this.memberId = memberId;
        this.tradingId = tradingId;
        this.sidCode = sidCode;
        this.accountId = accountId;
        this.mappingId = mappingId;
    }

    @ProtoField(number = 1)
    @Basic(sortable = true, projectable = true)
    public Long getMappingId() {
        return mappingId;
    }

    public void setMappingId(Long mappingId) {
        this.mappingId = mappingId;
    }

    @Basic(sortable = true, projectable = true)
    @ProtoField(number = 2)
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @ProtoField(number = 3)
    @Basic(sortable = true, projectable = true)
    public String getSidCode() {
        return sidCode;
    }

    public void setSidCode(String sidCode) {
        this.sidCode = sidCode;
    }

    @Basic(sortable = true, projectable = true)
    @ProtoField(number = 4)
    public String getTradingId() {
        return tradingId;
    }

    public void setTradingId(String tradingId) {
        this.tradingId = tradingId;
    }

    @Basic(sortable = true, projectable = true)
    @ProtoField(number = 5)
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Basic(sortable = true, projectable = true)
    @ProtoField(number = 6)
    public Character getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Character recordStatus) {
        this.recordStatus = recordStatus;
    }

    @Basic(sortable = true, projectable = true)
    @ProtoField(number = 7)
    public Long getUploadId() {
        return uploadId;
    }

    public void setUploadId(Long uploadId) {
        this.uploadId = uploadId;
    }

    @ProtoField(number = 8)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @ProtoField(number = 9)
    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @ProtoField(number = 10)
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @ProtoField(number = 11)
    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    @ProtoField(number = 12)
    public String getCheckedBy() {
        return checkedBy;
    }

    public void setCheckedBy(String checkedBy) {
        this.checkedBy = checkedBy;
    }

    @ProtoField(number = 13)
    public Date getCheckedOn() {
        return checkedOn;
    }

    public void setCheckedOn(Date checkedOn) {
        this.checkedOn = checkedOn;
    }

    @ProtoField(number = 14)
    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    @ProtoField(number = 15)
    public Date getApprovedOn() {
        return approvedOn;
    }

    public void setApprovedOn(Date approvedOn) {
        this.approvedOn = approvedOn;
    }

    @ProtoField(number = 16)
    public String getSidBuyerSeller() {
        return sidBuyerSeller;
    }

    public void setSidBuyerSeller(String sidBuyerSeller) {
        this.sidBuyerSeller = sidBuyerSeller;
    }

    @Override
    public String toString() {
        return "GenMdSidMappingEntity{" +
                "mappingId=" + mappingId +
                ", accountId=" + accountId +
                ", sidCode='" + sidCode + '\'' +
                ", tradingId='" + tradingId + '\'' +
                ", memberId=" + memberId +
                ", recordStatus=" + recordStatus +
                ", uploadId=" + uploadId +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", modifiedOn=" + modifiedOn +
                ", checkedBy='" + checkedBy + '\'' +
                ", checkedOn=" + checkedOn +
                ", approvedBy='" + approvedBy + '\'' +
                ", approvedOn=" + approvedOn +
                ", sidBuyerSeller='" + sidBuyerSeller + '\'' +
                '}';
    }
}
