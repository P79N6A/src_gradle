package com.ss.android.ugc.aweme.shortvideo.mvtemplate;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.b;

public final /* synthetic */ class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68501a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68502b;

    c(a aVar) {
        this.f68502b = aVar;
    }

    public final boolean a(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f68501a, false, 77858, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)) {
            return this.f68502b.a(i, i2, intent2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f68501a, false, 77858, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)).booleanValue();
    }
}
