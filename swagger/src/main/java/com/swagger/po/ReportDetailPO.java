package com.swagger.po;

/**
 * 报表详细
 */
public class ReportDetailPO {
    private Long id;
    private String org;
    private String acctNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    @Override
    public String toString() {
        return "ReportDetailPO{" +
                "id=" + id +
                ", org='" + org + '\'' +
                ", acctNo='" + acctNo + '\'' +
                '}';
    }
}
