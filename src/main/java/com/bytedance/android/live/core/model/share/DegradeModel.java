package com.bytedance.android.live.core.model.share;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class DegradeModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("desc")
    private String desc;
    @SerializedName("weixin")
    private int weiXin;
    @SerializedName("weixin_timeline")
    private int weiXinMoment;

    public String getDesc() {
        return this.desc;
    }

    public int getWeiXin() {
        return this.weiXin;
    }

    public int getWeiXinMoment() {
        return this.weiXinMoment;
    }

    public boolean isWeixinDegrade() {
        if (this.weiXin == 1) {
            return true;
        }
        return false;
    }

    public boolean isWeixinTimelineDegrade() {
        if (this.weiXinMoment == 1) {
            return true;
        }
        return false;
    }

    public String toJsonString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 329, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 329, new Class[0], String.class);
        }
        return "{" + "\"weixin" + "\":" + this.weiXin + "," + "\"weixin_timeline" + "\":" + this.weiXinMoment + "}";
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setWeiXin(int i) {
        this.weiXin = i;
    }

    public void setWeiXinMoment(int i) {
        this.weiXinMoment = i;
    }
}
