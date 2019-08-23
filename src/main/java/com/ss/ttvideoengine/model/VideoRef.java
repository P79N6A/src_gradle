package com.ss.ttvideoengine.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoRef {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String mAutoDefinition;
    public boolean mEnableSSL;
    public int mStatus;
    public String mUserId;
    public String mValidate;
    public VideoInfo mVideo1;
    public VideoInfo mVideo2;
    public VideoInfo mVideo3;
    public int mVideoDuration;
    public String mVideoId;
    public String mVideoName;

    public VideoInfo getVideoInfoWithClarity(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91548, new Class[]{String.class}, VideoInfo.class)) {
            return (VideoInfo) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91548, new Class[]{String.class}, VideoInfo.class);
        } else if (TextUtils.isEmpty(str)) {
            return this.mVideo1;
        } else {
            VideoInfo[] videoInfoArr = {this.mVideo1, this.mVideo2, this.mVideo3};
            for (int i = 0; i < 3; i++) {
                if (videoInfoArr[i] != null && videoInfoArr[i].mDefinition != null && videoInfoArr[i].mDefinition.equals(str)) {
                    return videoInfoArr[i];
                }
            }
            return null;
        }
    }

    public void extractFields(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 91549, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 91549, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video_list");
            this.mVideoDuration = jSONObject.optInt("video_duration");
            this.mStatus = jSONObject.optInt("status");
            if (optJSONObject != null) {
                try {
                    if (optJSONObject.has("video_1")) {
                        this.mVideo1 = new VideoInfo();
                        this.mVideo1.extractFields(optJSONObject.getJSONObject("video_1"));
                        this.mVideo1.mVideoDuration = this.mVideoDuration;
                    }
                    if (optJSONObject.has("video_2")) {
                        this.mVideo2 = new VideoInfo();
                        this.mVideo2.extractFields(optJSONObject.getJSONObject("video_2"));
                        this.mVideo2.mVideoDuration = this.mVideoDuration;
                    }
                    if (optJSONObject.has("video_3")) {
                        this.mVideo3 = new VideoInfo();
                        this.mVideo3.extractFields(optJSONObject.getJSONObject("video_3"));
                        this.mVideo3.mVideoDuration = this.mVideoDuration;
                    }
                } catch (JSONException unused) {
                }
            }
            this.mValidate = jSONObject.optString("validate");
            this.mAutoDefinition = jSONObject.optString("auto_definition");
            this.mEnableSSL = jSONObject.optBoolean("enable_ssl");
            this.mUserId = jSONObject.optString("user_id");
            this.mVideoId = jSONObject.optString("video_id");
            this.mVideoName = jSONObject.optString("video_name");
        }
    }
}
