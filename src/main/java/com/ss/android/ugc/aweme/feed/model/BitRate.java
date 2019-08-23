package com.ss.android.ugc.aweme.feed.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.lib.video.bitrate.regulator.a.c;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Keep
public class BitRate implements c, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4166900069421013042L;
    @SerializedName("bit_rate")
    public int bitRate;
    @SerializedName("gear_name")
    public String gearName;
    @SerializedName("is_h265")
    public int isH265;
    @SerializedName("play_addr")
    public UrlModel playAddr;
    @SerializedName("quality_type")
    public int qualityType;

    public static class ExcludeStrategy implements ExclusionStrategy {
        public static ChangeQuickRedirect changeQuickRedirect;

        public boolean shouldSkipClass(Class<?> cls) {
            return false;
        }

        public boolean shouldSkipField(FieldAttributes fieldAttributes) {
            if (PatchProxy.isSupport(new Object[]{fieldAttributes}, this, changeQuickRedirect, false, 41449, new Class[]{FieldAttributes.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{fieldAttributes}, this, changeQuickRedirect, false, 41449, new Class[]{FieldAttributes.class}, Boolean.TYPE)).booleanValue();
            } else if (fieldAttributes.getDeclaringClass() != BitRate.class || (!fieldAttributes.getName().equals("playAddr") && !fieldAttributes.getName().equals("playAddrH265") && !fieldAttributes.getName().equals("gear_name"))) {
                return false;
            } else {
                return true;
            }
        }
    }

    public int getBitRate() {
        return this.bitRate;
    }

    public String getGearName() {
        return this.gearName;
    }

    public UrlModel getPlayAddr() {
        return this.playAddr;
    }

    public int getQualityType() {
        return this.qualityType;
    }

    public int isH265() {
        return this.isH265;
    }

    public String getUrlKey() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41446, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41446, new Class[0], String.class);
        }
        String str = null;
        if (this.playAddr != null && !TextUtils.isEmpty(this.playAddr.getUrlKey())) {
            str = this.playAddr.getUrlKey();
        }
        return str;
    }

    public List<String> urlList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41447, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41447, new Class[0], List.class);
        } else if (getPlayAddr() != null) {
            return getPlayAddr().getUrlList();
        } else {
            return Collections.emptyList();
        }
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41448, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41448, new Class[0], String.class);
        }
        return "BitRate{bitRate=" + this.bitRate + ", gearName='" + this.gearName + '\'' + ", qualityType=" + this.qualityType + ", isH265=" + this.isH265 + '}';
    }

    public void setBitRate(int i) {
        this.bitRate = i;
    }

    public void setGearName(String str) {
        this.gearName = str;
    }

    public void setH265(int i) {
        this.isH265 = i;
    }

    public void setPlayAddr(UrlModel urlModel) {
        this.playAddr = urlModel;
    }

    public void setQualityType(int i) {
        this.qualityType = i;
    }
}
