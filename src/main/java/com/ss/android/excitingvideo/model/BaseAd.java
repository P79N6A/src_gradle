package com.ss.android.excitingvideo.model;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.excitingvideo.utils.JsonUtils;
import com.ss.android.excitingvideo.utils.SSLog;
import com.ss.android.ugc.aweme.app.f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class BaseAd {
    private int adLandingPageStye;
    private String appName;
    private String avatarUrl;
    private String buttonText;
    private final List<String> clickTrackUrl = new ArrayList();
    private String downloadUrl;
    private long id;
    private ImageInfo imageInfo;
    private int interceptFlag;
    private String label;
    private String logExtra;
    private ExcitingDownloadAdEventModel mDownloadEvent;
    private ShareInfo mShareInfo;
    private String openUrl;
    private String packageName;
    private int showClose;
    private String source;
    private String title;
    private final List<String> trackUrl = new ArrayList();
    private String type;
    private String webTitle;
    private String webUrl;

    public int getAdLandingPageStye() {
        return this.adLandingPageStye;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public List<String> getClickTrackUrl() {
        return this.clickTrackUrl;
    }

    public ExcitingDownloadAdEventModel getDownloadEvent() {
        return this.mDownloadEvent;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public long getId() {
        return this.id;
    }

    public ImageInfo getImageInfo() {
        return this.imageInfo;
    }

    public int getInterceptFlag() {
        return this.interceptFlag;
    }

    public String getLabel() {
        return this.label;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public ShareInfo getShareInfo() {
        return this.mShareInfo;
    }

    public String getSource() {
        return this.source;
    }

    public String getTitle() {
        return this.title;
    }

    public List<String> getTrackUrl() {
        return this.trackUrl;
    }

    public String getType() {
        return this.type;
    }

    public String getWebTitle() {
        return this.webTitle;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public boolean isShowClose() {
        if (this.showClose == 1) {
            return true;
        }
        return false;
    }

    public boolean isDownload() {
        return PushConstants.EXTRA_APPLICATION_PENDING_INTENT.equals(this.type);
    }

    public boolean isWeb() {
        return "web".equals(this.type);
    }

    public boolean isValid() {
        if (this.id < 0) {
            SSLog.error("广告id错误");
            return false;
        } else if (!"web".equals(this.type) || !TextUtils.isEmpty(this.openUrl) || !TextUtils.isEmpty(this.webUrl)) {
            if (PushConstants.EXTRA_APPLICATION_PENDING_INTENT.equals(this.type)) {
                if (TextUtils.isEmpty(this.downloadUrl)) {
                    SSLog.error(this.id, "download url is empty");
                }
                if (TextUtils.isEmpty(this.packageName)) {
                    SSLog.error(this.id, "packageName is empty");
                }
            }
            if (this.imageInfo == null || this.imageInfo.isValid(this.id)) {
                return true;
            }
            return false;
        } else {
            SSLog.error(this.id, "openUrl or webUrl is empty");
            return false;
        }
    }

    public BaseAd setDownloadEvent(ExcitingDownloadAdEventModel excitingDownloadAdEventModel) {
        this.mDownloadEvent = excitingDownloadAdEventModel;
        return this;
    }

    public BaseAd(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.id = jSONObject.optLong("id");
            this.source = jSONObject.optString("source");
            this.logExtra = jSONObject.optString("log_extra");
            this.title = jSONObject.optString(PushConstants.TITLE);
            JSONObject optJSONObject = jSONObject.optJSONObject("label");
            if (optJSONObject != null) {
                this.label = optJSONObject.optString("text");
            }
            this.showClose = jSONObject.optInt("show_close");
            this.buttonText = jSONObject.optString("button_text");
            this.avatarUrl = jSONObject.optString("avatar_url");
            this.trackUrl.addAll(JsonUtils.jsonArrayToList(jSONObject.optJSONArray("track_url_list")));
            this.clickTrackUrl.addAll(JsonUtils.jsonArrayToList(jSONObject.optJSONArray("click_track_url_list")));
            this.type = jSONObject.optString("type");
            this.openUrl = jSONObject.optString(f.f34168b);
            this.webUrl = jSONObject.optString("web_url");
            this.webTitle = jSONObject.optString("web_title");
            if (PushConstants.EXTRA_APPLICATION_PENDING_INTENT.equals(this.type)) {
                this.packageName = jSONObject.optString("package");
                this.appName = this.source;
                this.downloadUrl = jSONObject.optString("download_url");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("image_list");
            if (!(optJSONArray == null || optJSONArray.length() == 0)) {
                this.imageInfo = new ImageInfo(optJSONArray.optJSONObject(0));
            }
            if (jSONObject.has("share_info")) {
                this.mShareInfo = new ShareInfo(jSONObject.optJSONObject("share_info"));
            }
            this.interceptFlag = jSONObject.optInt("intercept_flag");
            this.adLandingPageStye = jSONObject.optInt("ad_lp_style");
        }
    }
}
