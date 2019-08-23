package com.ss.android.ugc.aweme.crossplatform.activity;

import android.view.View;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;

public final /* synthetic */ class c implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40690a;

    /* renamed from: b  reason: collision with root package name */
    private final b f40691b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewStub f40692c;

    c(b bVar, ViewStub viewStub) {
        this.f40691b = bVar;
        this.f40692c = viewStub;
    }

    public final boolean onLongClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f40690a, false, 34123, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f40690a, false, 34123, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        }
        b bVar = this.f40691b;
        this.f40692c.setVisibility(8);
        bVar.f40689c.getCrossPlatformParams().f40808d.s = false;
        SharePrefCache.inst().getDebugWebBar().a(Boolean.FALSE);
        return true;
    }
}
