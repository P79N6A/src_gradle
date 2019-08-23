package com.ss.android.ugc.aweme.shortvideo.ar.text;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FaceBeautyInvoker;

public final /* synthetic */ class c implements FaceBeautyInvoker.OnARTextCountCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65681a;

    /* renamed from: b  reason: collision with root package name */
    private final b f65682b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f65683c;

    /* renamed from: d  reason: collision with root package name */
    private final int f65684d;

    /* renamed from: e  reason: collision with root package name */
    private final String f65685e;

    c(b bVar, Activity activity, int i, String str) {
        this.f65682b = bVar;
        this.f65683c = activity;
        this.f65684d = i;
        this.f65685e = str;
    }

    public final void onResult(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65681a, false, 75131, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65681a, false, 75131, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        b bVar = this.f65682b;
        Activity activity = this.f65683c;
        d dVar = new d(bVar, i, this.f65684d, activity, this.f65685e);
        activity.runOnUiThread(dVar);
    }
}
