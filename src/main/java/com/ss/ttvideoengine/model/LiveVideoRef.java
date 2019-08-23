package com.ss.ttvideoengine.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveVideoRef {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int mBackupStatus;
    public long mEndTime;
    public String mLiveId;
    public int mLiveStatus;
    public LiveVideoInfo mLiveVideo1;
    public LiveVideoInfo mLiveVideo2;
    public long mStartTime;
    public int mStatus;
    public String mUserId;

    public LiveVideoInfo getLiveVideoInfo() {
        if (this.mLiveVideo1 != null) {
            return this.mLiveVideo1;
        }
        if (this.mLiveVideo2 != null) {
            return this.mLiveVideo2;
        }
        return null;
    }

    public void extractFields(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 91538, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 91538, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("live_info");
            try {
                if (optJSONObject.has("live_0")) {
                    this.mLiveVideo1 = new LiveVideoInfo();
                    this.mLiveVideo1.extractFields(optJSONObject.getJSONObject("live_0"));
                }
                if (optJSONObject.has("live_1")) {
                    this.mLiveVideo2 = new LiveVideoInfo();
                    this.mLiveVideo2.extractFields(optJSONObject.getJSONObject("live_1"));
                }
                this.mBackupStatus = optJSONObject.optInt("backup_status");
                this.mLiveStatus = optJSONObject.optInt("live_status");
                this.mStatus = optJSONObject.optInt("status");
                this.mStartTime = optJSONObject.optLong("start_time");
                this.mEndTime = optJSONObject.optLong("end_time");
            } catch (JSONException unused) {
            }
            this.mUserId = jSONObject.optString("user_id");
            this.mLiveId = jSONObject.optString("live_id");
        }
    }
}
