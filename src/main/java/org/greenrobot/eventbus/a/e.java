package org.greenrobot.eventbus.a;

import org.greenrobot.eventbus.ThreadMode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    final String f84086a;

    /* renamed from: b  reason: collision with root package name */
    final ThreadMode f84087b;

    /* renamed from: c  reason: collision with root package name */
    final Class<?> f84088c;

    /* renamed from: d  reason: collision with root package name */
    final int f84089d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f84090e;

    public e(String str, Class<?> cls) {
        this(str, cls, ThreadMode.POSTING, 0, false);
    }

    public e(String str, Class<?> cls, ThreadMode threadMode) {
        this(str, cls, threadMode, 0, false);
    }

    public e(String str, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f84086a = str;
        this.f84087b = threadMode;
        this.f84088c = cls;
        this.f84089d = i;
        this.f84090e = z;
    }
}
