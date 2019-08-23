package com.ss.android.ugc.aweme.follow.presenter;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.live.model.LiveVerifyChecklist;
import java.util.ArrayList;
import java.util.HashMap;

@Keep
public class CreateRoomResponse extends BaseResponse implements h {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity")
    public RoomBuilding activity;
    @SerializedName("checklist")
    public LiveVerifyChecklist checklist;
    private String requestId;
    @SerializedName("room")
    public RoomStruct room;

    @Keep
    public static class StreamUrlStruct {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("candidate_resolution")
        public ArrayList<String> mCandidateResolutionList;
        @SerializedName("default_resolution")
        public String mDefaultResolution;
        @SerializedName("flv_pull_url")
        public HashMap<String, String> mFlvPullUrlMap;
        @SerializedName("provider")
        public int provider;
        @SerializedName("rtmp_pull_url")
        public String rtmp_pull_url;
        @SerializedName("rtmp_push_url")
        public String rtmp_push_url;
        @SerializedName("sid")
        public long sid;

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44631, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44631, new Class[0], String.class);
            }
            return "StreamUrlStruct{sid=" + this.sid + ", rtmp_pull_url='" + this.rtmp_pull_url + '\'' + ", rtmp_push_url='" + this.rtmp_push_url + '\'' + ", provider=" + this.provider + '}';
        }
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
