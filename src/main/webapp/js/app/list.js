/**
 * Created by watson pengzhang@mobvoi.com on 2017/8/30.
 */


$(function () {
    var query_url = "../appstore/cms/list"
    $('#jqGrid').jqGrid({
        postData: {},
        url: query_url,
        datatype: "json",
        colModel: [
            { label: 'id', name: 'id', key:true, hidden:true},
            { label: '修改日志', name: 'id', width: 80},
            { label: 'name', name: 'name', sortable: true, width: 200},
            { label: '分类1', name: 'category1', width: 80},
            { label: '是否下线', name: 'isDeleted', width: 80,
                formatter: 'checkbox', formatoptions: {disabled:false}},
            { label: '是否手表展示', name: 'showInWearAppstore', width: 80,
                formatter: 'checkbox', formatoptions: {disabled:false}},
            { label: '是否手机展示', name: 'showInPhoneAppstore', width: 80,
                formatter: 'checkbox', formatoptions: {disabled:false}},
            { label: '是否需要支付', name: 'needPay', width: 80,
                formatter: 'checkbox', formatoptions: {disabled:false}},
            { label: '是否手表独立', name: 'wearStandalone', width: 80,
                formatter: 'checkbox', formatoptions: {disabled:false}},
            { label: '最后更新时间', name: 'lastUpdateTime', width: 150,
                editable:false,formatter:"date",formatoptions: {srcformat:'u',newformat:'Y-m-d H:i:s'}},
            { label: '下载次数', name: 'downloadCount', width: 80},
            { label: '评论数', name: 'commentsCount', width: 80},
            { label: '价格', name: 'price', width: 80},
            { label: '别名', name: 'aliasName', width: 120},
            { label: '包名', name: 'apkPackageName', width: 80},
            { label: '总结', name: 'summary', width: 80},
            { label: 'operate_note', name: 'operateNote', width: 80},
            { label: '创建时间', name: 'createDate', width: 150,
                editable:false,formatter:"date",formatoptions: {srcformat:'u',newformat:'Y-m-d H:i:s'}},
            { label: 'score', name: 'score', width: 80},
            { label: 'rank-score', name: 'rankScore', width: 80},
            { label: 'app来源', name: 'appFrom', width: 80},
            { label: 'support-hardware', name: 'supportHardware', width: 80},
            { label: 'hardware-tips', name: 'hardwareTips', width: 80},
            { label: 'cpu', name: 'cpu', width: 80},
            { label: 'watch', name: 'watch', width: 80},
            { label: '修复apk', name: 'summary', width: 80},   //这是一个button
            { label: '分类2', name: 'category2', width: 80},
            { label: '分类3', name: 'category3', width: 80}
        ],
        viewrecords: true,
        autowidth: true,
        height: '100%',
        rowNum: 30,
        rowList : [10,30,50],
        rownumbers: true,
        rownumWidth: 50,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.pageNum",
            total: "page.pages",
            records: "page.total"
        },
        prmNames : {
            page:"pageNum",
            rows:"pageSize",
            order: "order"
        },
        shrinkToFit:false,  //自适应宽度
        autoScroll: false   //左右滚动
    })
    $("#btn_query").click(function(){
        //传入查询条件参数
        $("#jqGrid").jqGrid("setGridParam",{page:1,url:queryUrl + "?" + $("#query-form").serialize()}).trigger("reloadGrid");
        Console.log($("#query-form").serialize());
    });


    //初始化日期选择控件 common.js
    initDaterangepicker("daterangepicker","startTime","endTime","searchDateRange");
})

var vm = new Vue({
    el:'#rrapp',
    data:{

    },
    methods: {
        update: function (event) {
            var id = getSelectedRow();
            if(id == null){
                return ;
            }
            location.href = "appEdit.html?appid="+id;
        },
    }
})