package com.ss.android.ugc.aweme.video.hashtag;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.i18n.c;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76113a;

    public static int a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f76113a, true, 89106, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f76113a, true, 89106, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i2 == 2) {
            if (c.a()) {
                return 2130839594;
            }
            return 2130839593;
        } else if (i2 != 3) {
            return -1;
        } else {
            if (c.a()) {
                return 2130839592;
            }
            return 2130839591;
        }
    }
}
