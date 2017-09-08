/**
 * Created by pengzhang@mobvoi.com (Zhang Peng)on 2017/9/7.
 */

var appid = T.p("appid");

var vm = new Vue({
    el: '#rrapp',
    data:{
        title: appid,
        appInfo: {},
        categoryList: {},
    },
    created: function () {
        this.getAppInfo(appid);
        this.getCategoryList();
    },
    methods: {
        getAppInfo: function (appid) {
            console.log("appid: "+appid);
            this.$http.get("../appstore/cms/appInfo/"+appid).then((r) => {
                this.appInfo = r.body.appInfo;
            });
        },
        getCategoryList: function () {
            this.$http.get("../appstore/cms/category_info").then((r) => {
                this.categoryList = r.body.category;
            });
        },
        update: function (event) {
            var url = "../appstore/cms/update_category";
            vm.appInfo.categoryId = $("#categoryId").val();
            vm.appInfo.secondCategoryId = $("#secondCategoryId").val();
            vm.appInfo.thirdCategoryId = $("#thirdCategoryId").val();
            vm.appInfo.cpu = $("#cpu").val();
            vm.appInfo.isDeleted = $("#isDeleted").val();
            vm.appInfo.showInWearAppstore = $("#showInWearAppstore").val();
            vm.appInfo.showInPhoneAppstore = $("#showInPhoneAppstore").val();
            vm.appInfo.needPay = $("#needPay").val();
            vm.appInfo.wearStandalone = $("#wearStandalone").val();
            this.$http.post(url, vm.appInfo).then((r) => {
                if(r.body.code == 0) {
                    alert('保存成功', function (index) {
                        vm.back();
                    })
                }else {
                    alert(r.body.msg);
                }
            })
        },
        back: function (event) {
            history.go(-1);
        }
    }
});

