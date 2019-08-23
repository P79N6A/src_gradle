package com.bytedance.android.live.core.rxutils.autodispose;

import com.meituan.robust.ChangeQuickRedirect;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8088a;

    /* renamed from: b  reason: collision with root package name */
    static final Throwable f8089b = new a();

    static final class a extends Throwable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final synchronized Throwable fillInStackTrace() {
            return this;
        }

        a() {
            super("No further exceptions");
        }
    }
}
