package com.ss.android.ugc.aweme.shortvideo.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.shortvideo.ek;

public final /* synthetic */ class ap implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70774a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishFragment f70775b;

    ap(VideoPublishFragment videoPublishFragment) {
        this.f70775b = videoPublishFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70774a, false, 80480, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f70774a, false, 80480, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ek ekVar = this.f70775b.l;
        int intValue = ((Integer) obj).intValue();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue)}, ekVar, ek.f67534a, false, 74449, new Class[]{Integer.TYPE}, Void.TYPE)) {
            ek ekVar2 = ekVar;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue)}, ekVar2, ek.f67534a, false, 74449, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (c.a()) {
            ekVar.f67535b.a(intValue);
        }
    }
}
