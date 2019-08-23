package com.ss.android.ugc.aweme.livewallpaper.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class q extends r {
    public static ChangeQuickRedirect i;
    private int k;

    public final float[] d() {
        float[] fArr;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 56193, new Class[0], float[].class)) {
            return (float[]) PatchProxy.accessDispatch(new Object[0], this, i, false, 56193, new Class[0], float[].class);
        }
        int i2 = this.k;
        if (i2 == 90) {
            fArr = p.f53660f;
        } else if (i2 == 180) {
            fArr = p.g;
        } else if (i2 != 270) {
            fArr = p.f53659e;
        } else {
            fArr = p.h;
        }
        return fArr;
    }
}
