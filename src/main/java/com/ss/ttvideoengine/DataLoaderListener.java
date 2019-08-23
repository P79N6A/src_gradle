package com.ss.ttvideoengine;

import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.DataLoaderCDNLog;
import com.ss.ttvideoengine.utils.Error;
import org.json.JSONObject;

public interface DataLoaderListener {
    void dataLoaderError(String str, int i, Error error);

    void onLogInfo(int i, String str, JSONObject jSONObject);

    void onNotify(int i, long j, long j2, String str);

    void onNotifyCDNLog(DataLoaderCDNLog dataLoaderCDNLog);

    void onTaskProgress(DataLoaderHelper.DataLoaderTaskProgressInfo dataLoaderTaskProgressInfo);
}
