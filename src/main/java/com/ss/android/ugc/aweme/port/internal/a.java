package com.ss.android.ugc.aweme.port.internal;

import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.main.MainActivity;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61150a;

    /* renamed from: b  reason: collision with root package name */
    FragmentActivity f61151b;

    /* renamed from: c  reason: collision with root package name */
    com.ss.android.ugc.aweme.festival.christmas.d.a f61152c;

    /* renamed from: d  reason: collision with root package name */
    boolean f61153d;

    public a(FragmentActivity fragmentActivity) {
        boolean z;
        this.f61151b = fragmentActivity;
        if (!(fragmentActivity instanceof MainActivity)) {
            z = true;
        } else {
            z = false;
        }
        this.f61153d = z;
    }
}
