package com.ss.android.ugc.aweme.audio;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.audio.i;

public final /* synthetic */ class e implements i.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34413a;

    /* renamed from: b  reason: collision with root package name */
    private final c f34414b;

    e(c cVar) {
        this.f34414b = cVar;
    }

    public final boolean a(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34413a, false, 23900, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34414b.c(z);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34413a, false, 23900, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }
}
