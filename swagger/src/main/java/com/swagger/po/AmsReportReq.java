package com.swagger.po;

/**
 * 请求对象
 */
public class AmsReportReq {
    private String memerId;
    private String processDate;



    public String getMemerId() {
        return memerId;
    }

    public void setMemerId(String memerId) {
        this.memerId = memerId;
    }

    public String getProcessDate() {
        return processDate;
    }

    public void setProcessDate(String processDate) {
        this.processDate = processDate;
    }

    @Override
    public String toString() {
        return "AmsReportReq{" +
                "memerId='" + memerId + '\'' +
                ", processDate=" + processDate +
                '}';
    }
}
