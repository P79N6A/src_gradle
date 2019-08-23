package com.ss.android.ugc.aweme.framework.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48507a;

    public static <T> T a(T t) {
        if (PatchProxy.isSupport(new Object[]{t}, null, f48507a, true, 45979, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{t}, null, f48507a, true, 45979, new Class[]{Object.class}, Object.class);
        } else if (t != null) {
            return t;
        } else {
            throw new NullPointerException();
        }
    }

    public static void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f48507a, true, 45981, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f48507a, true, 45981, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T a(T t, String str, Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{t, str, objArr}, null, f48507a, true, 45980, new Class[]{Object.class, String.class, Object[].class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{t, str, objArr}, null, f48507a, true, 45980, new Class[]{Object.class, String.class, Object[].class}, Object.class);
        } else if (t != null) {
            return t;
        } else {
            throw new NullPointerException(String.format(str, objArr));
        }
    }

    public static void a(boolean z, String str, Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str, objArr}, null, f48507a, true, 45982, new Class[]{Boolean.TYPE, String.class, Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str, objArr}, null, f48507a, true, 45982, new Class[]{Boolean.TYPE, String.class, Object[].class}, Void.TYPE);
        } else if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }
}
