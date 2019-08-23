package com.ss.ttm.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AVUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static class ScaleInfo {
        public int h;
        public int w;
        public int x;
        public int y;
    }

    public static final ScaleInfo getScaleInfoFromSize(float f2, float f3, float f4, float f5) {
        float f6 = f4;
        float f7 = f5;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, null, changeQuickRedirect, true, 91147, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, ScaleInfo.class)) {
            return (ScaleInfo) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, null, changeQuickRedirect, true, 91147, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, ScaleInfo.class);
        }
        ScaleInfo scaleInfo = new ScaleInfo();
        float f8 = f2 / f3;
        scaleInfo.w = (int) f6;
        scaleInfo.h = (int) (f6 / f8);
        if (((float) scaleInfo.h) < f7) {
            scaleInfo.h = (int) f7;
            scaleInfo.w = (int) (f8 * f7);
        }
        scaleInfo.y = ((int) (((float) scaleInfo.h) - f7)) >> 1;
        scaleInfo.x = ((int) (((float) scaleInfo.w) - f6)) >> 1;
        if (((float) scaleInfo.h) > f7) {
            scaleInfo.y = 0 - scaleInfo.y;
        }
        if (((float) scaleInfo.w) > f6) {
            scaleInfo.x = 0 - scaleInfo.x;
        }
        return scaleInfo;
    }
}
