package com.ss.android.socialbase.downloader.depend;

import org.json.JSONObject;

public interface IDownloadMonitorDepend {
    String getEventPage();

    void monitorLogSend(JSONObject jSONObject);
}
