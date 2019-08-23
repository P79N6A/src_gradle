package com.ss.android.ugc.aweme.shortvideo.i;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class m implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int defaultHeightDP;
    public int defaultWidthDP;
    @SerializedName("react_window_resource_path")
    public String mImagePath;
    @SerializedName("react_is_circle_shape")
    public boolean mIsCircle;
    @SerializedName("react_window_min_height")
    public int minHeight;
    public int minHeightDP;
    @SerializedName("react_window_min_width")
    public int minWidth;
    public int minWidthDP;
    public int outputVideoHeight;
    public int outputVideoWidth;

    public int convertDpToHeight(int i) {
        return 0;
    }

    public int convertDpToWidth(int i) {
        return 0;
    }

    public int convertHeightToDp(int i) {
        return 0;
    }

    public int convertWidthToDp(int i) {
        return 0;
    }

    public float getWidthHeightRatio() {
        return ((float) this.defaultWidthDP) / ((float) this.defaultHeightDP);
    }

    public int getDefaultHeight() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 78308, new Class[0], Integer.TYPE)) {
            return convertDpToHeight(this.defaultHeightDP);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 78308, new Class[0], Integer.TYPE)).intValue();
    }

    public int getDefaultWidth() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 78307, new Class[0], Integer.TYPE)) {
            return convertDpToWidth(this.defaultWidthDP);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 78307, new Class[0], Integer.TYPE)).intValue();
    }

    public int getMinHeight() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 78310, new Class[0], Integer.TYPE)) {
            return convertDpToWidth(this.minHeightDP);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 78310, new Class[0], Integer.TYPE)).intValue();
    }

    public int getMinWidth() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 78309, new Class[0], Integer.TYPE)) {
            return convertDpToWidth(this.minWidthDP);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 78309, new Class[0], Integer.TYPE)).intValue();
    }

    public m(String str, int i, int i2) {
        this.mImagePath = str;
        this.outputVideoHeight = i2;
        this.outputVideoWidth = i;
    }
}
