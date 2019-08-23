package com.ss.android.ugc.aweme.shortvideo.q.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.vesdk.an;
import java.io.Serializable;

public class n implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public an position;
    public int xOffset;
    public int yOffset;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81187, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81187, new Class[0], String.class);
        }
        return "WaterMarkPositionConfig{xOffset=" + this.xOffset + ", yOffset=" + this.yOffset + ", position=" + this.position + '}';
    }
}
