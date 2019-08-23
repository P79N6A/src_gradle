package com.ss.android.ugc.aweme.common;

import android.support.annotation.Keep;
import android.support.v4.util.Pools;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONObject;

@Keep
public class MobClick {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Pools.SynchronizedPool<MobClick> pool = new Pools.SynchronizedPool<>(5);
    private String category;
    private String eventName;
    private JSONObject ext_json;
    private long ext_value_long;
    private String ext_value_str;
    private String labelName;
    private String value;

    public String getCategory() {
        return this.category;
    }

    public String getEventName() {
        return this.eventName;
    }

    public JSONObject getExtJson() {
        return this.ext_json;
    }

    public long getExtValueLong() {
        return this.ext_value_long;
    }

    public String getExtValueStr() {
        return this.ext_value_str;
    }

    public String getLabelName() {
        return this.labelName;
    }

    public void clearState() {
        this.eventName = null;
        this.labelName = null;
        this.value = null;
        this.ext_value_str = null;
        this.ext_value_long = 0;
        this.category = null;
        this.ext_json = null;
    }

    public static MobClick obtain() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 33294, new Class[0], MobClick.class)) {
            return (MobClick) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 33294, new Class[0], MobClick.class);
        }
        MobClick mobClick = (MobClick) pool.acquire();
        if (mobClick != null) {
            return mobClick;
        }
        return new MobClick();
    }

    public String getValue() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33296, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33296, new Class[0], String.class);
        }
        if (TextUtils.isEmpty(this.value)) {
            this.value = PushConstants.PUSH_TYPE_NOTIFY;
        }
        return this.value;
    }

    public void recycle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33295, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33295, new Class[0], Void.TYPE);
            return;
        }
        clearState();
        pool.release(this);
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33297, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33297, new Class[0], String.class);
        }
        return "MobClick{eventName='" + this.eventName + '\'' + ", labelName='" + this.labelName + '\'' + ", value='" + this.value + '\'' + ", ext_value_str='" + this.ext_value_str + '\'' + ", ext_value_long=" + this.ext_value_long + ", category='" + this.category + '\'' + ", ext_json=" + this.ext_json + '}';
    }

    public MobClick setCategory(String str) {
        this.category = str;
        return this;
    }

    public MobClick setEventName(String str) {
        this.eventName = str;
        return this;
    }

    public MobClick setExtValueLong(long j) {
        this.ext_value_long = j;
        return this;
    }

    public MobClick setExtValueString(String str) {
        this.ext_value_str = str;
        return this;
    }

    public MobClick setJsonObject(JSONObject jSONObject) {
        this.ext_json = jSONObject;
        return this;
    }

    public MobClick setLabelName(String str) {
        this.labelName = str;
        return this;
    }

    public MobClick setValue(String str) {
        this.value = str;
        return this;
    }
}
