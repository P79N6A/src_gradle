package com.bytedance.android.livesdk.app.dataholder;

import com.meituan.robust.ChangeQuickRedirect;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9043a;

    /* renamed from: b  reason: collision with root package name */
    private static Object[] f9044b = new Object[0];

    /* renamed from: c  reason: collision with root package name */
    private static Object[] f9045c = new Object[73];

    public static int a(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }
}
