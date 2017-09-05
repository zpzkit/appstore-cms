package com.mobvoi.appstore.cms.service.cms;

import java.util.List;

/**
 * Created by watson on 2017/9/5.
 */
public interface AppInfoService<T> {

  List<T> getAppInfoDetail(int pageNum, int pageSize, boolean count);
}
