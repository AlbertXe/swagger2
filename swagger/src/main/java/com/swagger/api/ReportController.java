package com.swagger.api;

import com.swagger.po.AmsReportPO;
import com.swagger.po.AmsReportReq;
import com.swagger.po.ReportDetailPO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags="报表接口")
public class ReportController {
    Logger logger = LoggerFactory.getLogger(ReportController.class);

    @RequestMapping(value="/list", method= RequestMethod.GET)
    @ApiOperation(value = "查询报表", notes = "查询报表", httpMethod = "Get")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "req",value = "请求参数", required = true, paramType = "path"),
            @ApiImplicitParam(name = "pageno",value = "分页参数", required = true, paramType = "query"),
    })
    public List<AmsReportPO> pageAmsReportPOList(AmsReportReq req,int pageno){
        logger.info("req = {}", req);
        ArrayList<AmsReportPO> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            AmsReportPO po = new AmsReportPO();
            po.setId(00000L+i);
            po.setOrg("242");
            po.setAcctNo("000485489998777415445");
            list.add(po);
        }
        return list;
    }

    @RequestMapping(value="/getReportDetailPO", method= RequestMethod.GET)
    @ApiOperation(value = "查询报表详细", notes = "查询报表详细", httpMethod = "Get")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "数据id", required = true, paramType = "query"),
    })
    ReportDetailPO getReportDetailPO(String id){
        ReportDetailPO reportDetailPO = new ReportDetailPO();
        reportDetailPO.setId(Long.valueOf(id));
        reportDetailPO.setOrg("242");
        reportDetailPO.setAcctNo("000485489998777415445");
        return reportDetailPO;
    }

    @RequestMapping(value="/down", method= RequestMethod.GET)
    @ApiOperation(value = "报表下载", notes = "报表下载", httpMethod = "Get")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "filepath",value = "文件地址", required = true, paramType = "query"),
            @ApiImplicitParam(name = "downpath",value = "下载地址", required = true, paramType = "query"),
            @ApiImplicitParam(name = "processDate",value = "处理日期", required = true, paramType = "query"),
    })
    boolean amsReportDownload(@RequestParam(name = "filepath") String filepath, String downpath, String processDate){
        logger.info("filepath:{},downpath:{},processDate:{}",filepath,downpath,processDate);
        return true;
    }
}
