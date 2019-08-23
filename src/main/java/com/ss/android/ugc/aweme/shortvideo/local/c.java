package com.ss.android.ugc.aweme.shortvideo.local;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.b;
import com.ss.android.ugc.aweme.shortvideo.local.a;

public final /* synthetic */ class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68346a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68347b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C0718a f68348c;

    c(a aVar, a.C0718a aVar2) {
        this.f68347b = aVar;
        this.f68348c = aVar2;
    }

    public final boolean a(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f68346a, false, 77546, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f68346a, false, 77546, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)).booleanValue();
        }
        int i3 = i;
        int i4 = i2;
        return this.f68347b.a(this.f68348c, i, i2, intent2);
    }
}
