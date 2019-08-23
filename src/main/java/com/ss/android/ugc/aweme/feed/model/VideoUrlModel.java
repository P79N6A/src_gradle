package com.ss.android.ugc.aweme.feed.model;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.lib.video.bitrate.regulator.a.c;
import java.util.Collections;
import java.util.List;

public class VideoUrlModel extends UrlModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4566748102483196885L;
    @SerializedName("bit_rate")
    public List<BitRate> bitRate;
    public long createTime = SystemClock.elapsedRealtime();
    @SerializedName("duration")
    public double duration;
    @SuppressLint({"SerializableImplementsRule"})
    public transient c hitBitrate;
    public boolean isH265;
    public boolean mVr;
    public String ratio;
    public String ratioUri;
    public String sourceId;

    public long getCreateTime() {
        return this.createTime;
    }

    public double getDuration() {
        return this.duration;
    }

    public c getHitBitrate() {
        return this.hitBitrate;
    }

    public String getRatio() {
        return this.ratio;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public boolean isH265() {
        return this.isH265;
    }

    public boolean isVr() {
        return this.mVr;
    }

    public List<BitRate> getBitRate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41495, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41495, new Class[0], List.class);
        } else if (this.bitRate == null) {
            return Collections.emptyList();
        } else {
            return this.bitRate;
        }
    }

    public String getUri() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41493, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41493, new Class[0], String.class);
        } else if (!TextUtils.isEmpty(getUrlKey())) {
            return getUrlKey();
        } else {
            return getRatioUri();
        }
    }

    private String getRatioUri() {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41494, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41494, new Class[0], String.class);
        }
        if (this.ratioUri == null) {
            if (isH265()) {
                str = "h265";
            } else {
                str = "";
            }
            if (this.uri == null) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.uri);
                if (this.ratio == null) {
                    str3 = "";
                } else {
                    str3 = this.ratio;
                }
                sb.append(str3);
                sb.append(str);
                str2 = sb.toString();
            }
            this.ratioUri = str2;
        }
        return this.ratioUri;
    }

    @NonNull
    public String getBitRatedRatioUri() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41492, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41492, new Class[0], String.class);
        }
        c cVar = this.hitBitrate;
        if (cVar != null) {
            str = cVar.getUrlKey();
            if (TextUtils.isEmpty(str)) {
                if (cVar.isH265() == 1) {
                    str2 = "h265";
                } else {
                    str2 = "";
                }
                str = getUri() + str2 + "T" + cVar.getBitRate();
            }
        } else {
            str = getUri();
        }
        return str;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41496, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41496, new Class[0], String.class);
        }
        return "VideoUrlModel{uri='" + this.uri + '\'' + ", urlList=" + this.urlList + "sourceId='" + this.sourceId + '\'' + ", ratio='" + this.ratio + '\'' + ", mVr=" + this.mVr + ", duration=" + this.duration + ", bitRate=" + this.bitRate + ", createTime=" + this.createTime + ", ish265=" + this.isH265 + '}';
    }

    public void setBitRate(List<BitRate> list) {
        this.bitRate = list;
    }

    public void setDuration(double d2) {
        this.duration = d2;
    }

    public void setH265(boolean z) {
        this.isH265 = z;
    }

    public void setHitBitrate(c cVar) {
        this.hitBitrate = cVar;
    }

    public VideoUrlModel setRatio(String str) {
        this.ratio = str;
        return this;
    }

    public VideoUrlModel setSourceId(String str) {
        this.sourceId = str;
        return this;
    }

    public void setVr(boolean z) {
        this.mVr = z;
    }
}
