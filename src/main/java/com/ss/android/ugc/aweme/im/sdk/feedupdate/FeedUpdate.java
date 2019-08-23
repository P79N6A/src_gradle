package com.ss.android.ugc.aweme.im.sdk.feedupdate;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

@Keep
public class FeedUpdate {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cursor")
    long cursor;
    @SerializedName("data")
    public List<d> items;
    @SerializedName("status_code")
    int statusCode;
    @SerializedName("status_msg")
    String statusMsg;

    class a implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("aweme_id")
        String aid;
        final /* synthetic */ FeedUpdate this$0;
        @SerializedName("create_time")
        long timeStamp;

        public final String getAid() {
            return this.aid;
        }

        public final long getTimeStamp() {
            return this.timeStamp;
        }

        public final void setAid(String str) {
            this.aid = str;
        }

        public final void setTimeStamp(long j) {
            this.timeStamp = j;
        }
    }

    class b {
        @SerializedName("label_thumb")

        /* renamed from: a  reason: collision with root package name */
        public UrlModel f51448a;
    }

    public class c {
        @SerializedName("aweme_id")

        /* renamed from: a  reason: collision with root package name */
        public String f51449a;
        @SerializedName("create_time")

        /* renamed from: b  reason: collision with root package name */
        public long f51450b;
        @SerializedName("desc")

        /* renamed from: c  reason: collision with root package name */
        public String f51451c;
        @SerializedName("video")

        /* renamed from: d  reason: collision with root package name */
        public e f51452d;
        @SerializedName("image_infos")

        /* renamed from: e  reason: collision with root package name */
        public List<b> f51453e;
        @SerializedName("aweme_type")

        /* renamed from: f  reason: collision with root package name */
        public int f51454f;
    }

    public class d implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("aweme_list")
        List<a> awemeSubsets;
        @SerializedName("last_aweme_info")
        c lastAweme;
        @SerializedName("author_user_id")
        long uid;

        public List<a> getAwemeSubsets() {
            return this.awemeSubsets;
        }

        public c getLastAweme() {
            return this.lastAweme;
        }

        public long getUid() {
            return this.uid;
        }

        public void setAwemeSubsets(List<a> list) {
            this.awemeSubsets = list;
        }

        public void setLastAweme(c cVar) {
            this.lastAweme = cVar;
        }

        public void setUid(long j) {
            this.uid = j;
        }

        public d() {
        }
    }

    class e {
        @SerializedName("cover")

        /* renamed from: a  reason: collision with root package name */
        public UrlModel f51455a;
    }

    public long getCursor() {
        return this.cursor;
    }

    public List<d> getItems() {
        return this.items;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMsg() {
        return this.statusMsg;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setItems(List<d> list) {
        this.items = list;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
