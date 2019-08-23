package com.bytedance.android.livesdk.utils;

import android.telephony.PhoneStateListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class x extends PhoneStateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17643a;

    /* renamed from: b  reason: collision with root package name */
    private a f17644b;

    public interface a {
        void a(int i);
    }

    public x(a aVar) {
        this.f17644b = aVar;
    }

    public final void onCallStateChanged(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f17643a, false, 13695, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f17643a, false, 13695, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        super.onCallStateChanged(i, str);
        if (this.f17644b != null) {
            this.f17644b.a(i);
        }
    }
}
