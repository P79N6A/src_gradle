package com.ss.ttm.utils;

import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TestSurface {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static final native int _testSurfaceLocker(Surface surface);

    public static int testSurfaceLoked(Surface surface) {
        if (!PatchProxy.isSupport(new Object[]{surface}, null, changeQuickRedirect, true, 91162, new Class[]{Surface.class}, Integer.TYPE)) {
            return _testSurfaceLocker(surface);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{surface}, null, changeQuickRedirect, true, 91162, new Class[]{Surface.class}, Integer.TYPE)).intValue();
    }
}
