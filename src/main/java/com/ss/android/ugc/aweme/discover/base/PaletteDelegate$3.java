package com.ss.android.ugc.aweme.discover.base;

import android.support.v7.graphics.Palette;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class PaletteDelegate$3 implements Palette.Filter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42129a;

    PaletteDelegate$3() {
    }

    public final boolean isAllowed(int i, float[] fArr) {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), fArr}, this, f42129a, false, 36165, new Class[]{Integer.TYPE, float[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), fArr}, this, f42129a, false, 36165, new Class[]{Integer.TYPE, float[].class}, Boolean.TYPE)).booleanValue();
        }
        if (fArr[2] >= 0.99f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (fArr[2] <= 0.05f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }
}
