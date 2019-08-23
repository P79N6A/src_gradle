package com.ss.android.excitingvideo.model;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.excitingvideo.utils.JsonUtils;
import com.ss.android.excitingvideo.utils.SSLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class ImageInfo {
    private int height;
    private String type;
    private String uri;
    private String url;
    private List<String> urlList = new ArrayList();
    private int width;

    public int getHeight() {
        return this.height;
    }

    public String getType() {
        return this.type;
    }

    public String getUri() {
        return this.uri;
    }

    public String getUrl() {
        return this.url;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isValid(long j) {
        if (TextUtils.isEmpty(this.url)) {
            SSLog.error(j, "image url is empty");
            return false;
        } else if (this.width > 0 && this.height > 0) {
            return true;
        } else {
            SSLog.error(j, "image width or height less zero");
            return false;
        }
    }

    public ImageInfo(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.urlList.addAll(JsonUtils.jsonArrayToList(jSONObject.optJSONArray("url_list")));
            this.url = jSONObject.optString(PushConstants.WEB_URL);
            this.uri = jSONObject.optString("uri");
            this.width = jSONObject.optInt("width");
            this.height = jSONObject.optInt("height");
            this.type = jSONObject.optString("type");
        }
    }
}
