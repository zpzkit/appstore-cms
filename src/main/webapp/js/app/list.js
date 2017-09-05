/**
 * Created by watson pengzhang@mobvoi.com on 2017/8/30.
 */


$(function () {
    var query_url = "../appstore/cms/list"
    $('#jqGrid').jqGrid({
        url: query_url,
        datatype: "json",
        colModel: [
            { label: 'id', name: 'id', key:true, hidden:true},
            { label: 'name', name: 'name', width: 80},
            { label: '描述', name: 'name', width: 80},
            { label: '开发者ID', name: 'name', width: 80, hidden: true},
            { label: '下载次数', name: 'downloadCount', width: 80},
            { label: '分类', name: 'categoryId', width: 80},
            { label: '总结', name: 'summary', width: 80},
            { label: '是否上线', name: 'isDeleted', width: 80},
            { label: '别名', name: 'aliasName', width: 80}
        ],
        viewrecords: true,
        autowidth: true,
        height: 400,
        rowNum: 10,
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
            page:"page",
            rows:"limit",
            order: "order"
        },
    })

})