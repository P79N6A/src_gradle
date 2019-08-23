package com.ss.android.ugc.aweme.music.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.a.b.d;
import com.ss.android.ugc.a.c;
import com.ss.android.ugc.aweme.u.m;

public final class o implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56719a;

    /* renamed from: b  reason: collision with root package name */
    private String f56720b;

    /* renamed from: c  reason: collision with root package name */
    private String f56721c;

    public final void onCancel() {
    }

    public final void onDownloadPause() {
    }

    public final void onDownloadProgress(int i, long j, long j2) {
    }

    public final void onDownloadSuccess(String str) {
    }

    public final void onError(c cVar) {
    }

    public final void onDownloadStart(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f56719a, false, 60330, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f56719a, false, 60330, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        m mVar = new m();
        mVar.f75136b = this.f56721c;
        mVar.f75137c = this.f56720b;
        mVar.e();
    }

    public o(String str, String str2) {
        this.f56720b = str;
        this.f56721c = str2;
    }
}
