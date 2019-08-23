package com.ss.android.ugc.aweme.shortvideo.ar.text;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FaceBeautyInvoker;

public final /* synthetic */ class i implements FaceBeautyInvoker.OnARTextCountCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65703a;

    /* renamed from: b  reason: collision with root package name */
    private final g f65704b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f65705c;

    /* renamed from: d  reason: collision with root package name */
    private final int f65706d;

    /* renamed from: e  reason: collision with root package name */
    private final String f65707e;

    i(g gVar, Activity activity, int i, String str) {
        this.f65704b = gVar;
        this.f65705c = activity;
        this.f65706d = i;
        this.f65707e = str;
    }

    public final void onResult(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65703a, false, 75154, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65703a, false, 75154, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        g gVar = this.f65704b;
        Activity activity = this.f65705c;
        j jVar = new j(gVar, i, this.f65706d, activity, this.f65707e);
        activity.runOnUiThread(jVar);
    }
}
