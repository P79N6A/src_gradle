package com.ss.android.ugc.aweme.shortvideo.helper;

import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.a;

public final /* synthetic */ class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68129a;

    /* renamed from: b  reason: collision with root package name */
    private final VolumeHelper f68130b;

    g(VolumeHelper volumeHelper) {
        this.f68130b = volumeHelper;
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f68129a, false, 77501, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return this.f68130b.c(i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f68129a, false, 77501, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
    }
}
