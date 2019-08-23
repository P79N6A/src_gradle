package com.bytedance.crash.b;

import android.content.Context;
import android.support.annotation.NonNull;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f19363b;

    /* renamed from: a  reason: collision with root package name */
    public final b f19364a;

    private d(@NonNull Context context) {
        this.f19364a = new b(context);
    }

    public static d a(Context context) {
        if (f19363b == null) {
            synchronized (d.class) {
                if (f19363b == null) {
                    f19363b = new d(context);
                }
            }
        }
        return f19363b;
    }
}
