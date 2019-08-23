package com.bytedance.android.livesdk.utils;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class ah {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17576a;
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: b  reason: collision with root package name */
    private static final SimpleDateFormat f17577b = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: c  reason: collision with root package name */
    private static volatile long f17578c = 0;

    @Deprecated
    public static long a() {
        return System.currentTimeMillis() + f17578c;
    }

    public static void c(long j) {
        f17578c = j;
    }

    public static int a(int i) {
        boolean z;
        if (i <= 0) {
            return 1;
        }
        if (i % 60 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return (i / 60) + 1;
        }
        return i / 60;
    }

    public static String a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f17576a, true, 13737, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f17576a, true, 13737, new Class[]{Long.TYPE}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        long j3 = j2 / 60;
        long j4 = j2 - (60 * j3);
        if (j3 < 10) {
            sb.append(PushConstants.PUSH_TYPE_NOTIFY);
        }
        sb.append(j3);
        sb.append(":");
        if (j4 < 10) {
            sb.append(PushConstants.PUSH_TYPE_NOTIFY);
        }
        sb.append(j4);
        return sb.toString();
    }

    public static String b(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f17576a, true, 13738, new Class[]{Long.TYPE}, String.class)) {
            return f17577b.format(new Date(j2));
        }
        return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f17576a, true, 13738, new Class[]{Long.TYPE}, String.class);
    }
}
