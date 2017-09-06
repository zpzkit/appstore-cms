package com.mobvoi.appstore.cms.dao;

import com.mobvoi.appstore.cms.model.AppListModel;
import com.mobvoi.appstore.cms.model.AppMap;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("AppMapMapper")
public interface AppMapMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppMap record);

    int insertSelective(AppMap record);

    AppMap selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppMap record);

    int updateByPrimaryKey(AppMap record);

    @Select("select * from app")
    @ResultMap("AppListResultMap")
    List<AppListModel> selectAll();

   String listAppSql = "SELECT " +
        "    app.name, " +
        "    app.alias_name, " +
        "    app.summary, " +
        "    app.id, " +
        "    app.is_deleted, " +
        "    app.show_in_wear_appstore, " +
        "    app.show_in_phone_appstore, " +
        "    app.apk_package_name, " +
        "    app.wear_standalone, " +
        "    app.download_count, " +
        "    app.app_from, " +
        "    app.support_hardware, " +
        "    app.hardware_tips, " +
        "    app.category_id, " +
        "    app.second_category_id, " +
        "    app.third_category_id, " +
        "    app.operate_note, " +
        "    app.create_date, " +
        "    app.score, " +
        "    app.rank_score, " +
        "    app.need_pay, " +
        "    app.price, " +
        "    support_watch_model.watch, " +
        "    ( " +
        "        SELECT " +
        "            apk.update_time " +
        "        FROM " +
        "            apk " +
        "        WHERE " +
        "            apk.appid = app.id " +
        "        ORDER BY " +
        "            apk.update_time DESC " +
        "        LIMIT 1 " +
        "    )AS last_update_time, " +
        "    ( " +
        "        SELECT " +
        "            apk.cpu " +
        "        FROM " +
        "            apk " +
        "        WHERE " +
        "            apk.appid = app.id " +
        "        ORDER BY " +
        "            apk.update_time DESC " +
        "        LIMIT 1 " +
        "    )AS cpu, " +
        "    ( " +
        "        SELECT " +
        "            COUNT(*) " +
        "        FROM " +
        "            comments " +
        "        WHERE " +
        "            comments.appid = app.id " +
        "    )AS comments_count " +
        "FROM " +
        "    app " +
        "INNER JOIN support_watch_model ON support_watch_model.appid = app.id";
    @Select(listAppSql)
    @ResultMap("BaseResultMap")
    List<AppMap> selectAppList();

}