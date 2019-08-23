package com.ss.android.account;

import com.ss.android.account.a.a.a;
import com.ss.android.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile b f2421a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f2422b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile com.bytedance.sdk.account.utils.b f2423c;

    public static com.bytedance.sdk.account.utils.b b() {
        return f2423c;
    }

    public static b a() {
        if (f2421a != null) {
            return f2421a;
        }
        throw new IllegalStateException("not init TTAccount config");
    }
}
