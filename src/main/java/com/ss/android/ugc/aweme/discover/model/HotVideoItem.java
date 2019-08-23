package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

public class HotVideoItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme_info")
    private Aweme aweme;
    @SerializedName("hot_value")
    private String hotValue;
    @SerializedName("label")
    private int label;

    public Aweme getAweme() {
        return this.aweme;
    }

    public String getHotValue() {
        return this.hotValue;
    }

    public int getLabel() {
        return this.label;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37068, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37068, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.aweme != null) {
            i = this.aweme.hashCode();
        } else {
            i = 0;
        }
        int i3 = ((i * 31) + this.label) * 31;
        if (this.hotValue != null) {
            i2 = this.hotValue.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37065, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37065, new Class[0], String.class);
        }
        return "HotVideoItem{aweme=" + this.aweme + ", label=" + this.label + ", hotValue=" + this.hotValue + '}';
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setHotValue(String str) {
        this.hotValue = str;
    }

    public void setLabel(int i) {
        this.label = i;
    }

    public void setRequestId(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 37066, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 37066, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.aweme != null) {
            this.aweme.setRequestId(str);
        }
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37067, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37067, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            HotVideoItem hotVideoItem = (HotVideoItem) obj;
            if (this.label != hotVideoItem.label) {
                return false;
            }
            if (this.aweme == null ? hotVideoItem.aweme != null : !this.aweme.equals(hotVideoItem.aweme)) {
                return false;
            }
            if (this.hotValue != null) {
                return this.hotValue.equals(hotVideoItem.hotValue);
            }
            if (hotVideoItem.hotValue == null) {
                return true;
            }
            return false;
        }
    }
}
