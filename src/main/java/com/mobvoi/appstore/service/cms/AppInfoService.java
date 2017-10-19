package com.mobvoi.appstore.service.cms;

import java.util.List;

/**
 * Created by watson on 2017/9/5.
 */
public interface AppInfoService<T> {

  List<T> getAppInfoListDetail(int pageNum, int pageSize, boolean count);
}
