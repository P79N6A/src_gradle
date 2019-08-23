package com.ss.android.ugc.aweme.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63982a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f63983b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static int f63984c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static int f63985d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static int f63986e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static int f63987f = 1;
    public static int g;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f63982a, true, 72056, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f63982a, true, 72056, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.a()) {
            return true;
        }
        return false;
    }

    private static boolean c(BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext == null || baseShortVideoContext.mVideoLength <= 0 || ((long) baseShortVideoContext.mVideoLength) > 60500) {
            return false;
        }
        return true;
    }

    private static boolean b(BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext instanceof cb) {
            if ((baseShortVideoContext == null || baseShortVideoContext.mVideoLength <= 0 || ((long) baseShortVideoContext.mVideoLength) > 60500) && ((cb) baseShortVideoContext).recordMode != 1) {
                return false;
            }
            return true;
        } else if (baseShortVideoContext == null || baseShortVideoContext.mVideoLength <= 0 || ((long) baseShortVideoContext.mVideoLength) > 60500) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean a(BaseShortVideoContext baseShortVideoContext) {
        if (PatchProxy.isSupport(new Object[]{baseShortVideoContext}, null, f63982a, true, 72058, new Class[]{BaseShortVideoContext.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{baseShortVideoContext}, null, f63982a, true, 72058, new Class[]{BaseShortVideoContext.class}, Boolean.TYPE)).booleanValue();
        } else if (b(baseShortVideoContext) || c(baseShortVideoContext)) {
            return true;
        } else {
            return false;
        }
    }
}
