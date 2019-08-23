package com.ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import android.webkit.DownloadListener;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.download.api.b.d;
import com.ss.android.downloadad.api.a.a;
import com.ss.android.downloadad.api.a.b;
import com.ss.android.ugc.aweme.crossplatform.view.h;

public final /* synthetic */ class f implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40775a;

    /* renamed from: b  reason: collision with root package name */
    private final DownloadBusiness f40776b;

    /* renamed from: c  reason: collision with root package name */
    private final h f40777c;

    /* renamed from: d  reason: collision with root package name */
    private final Activity f40778d;

    /* renamed from: e  reason: collision with root package name */
    private final b f40779e;

    /* renamed from: f  reason: collision with root package name */
    private final a f40780f;
    private final d g;
    private final FrameLayout h;

    f(DownloadBusiness downloadBusiness, h hVar, Activity activity, b bVar, a aVar, d dVar, FrameLayout frameLayout) {
        this.f40776b = downloadBusiness;
        this.f40777c = hVar;
        this.f40778d = activity;
        this.f40779e = bVar;
        this.f40780f = aVar;
        this.g = dVar;
        this.h = frameLayout;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4, new Long(j2)}, this, f40775a, false, 34257, new Class[]{String.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str3, str4, new Long(j2)}, this, f40775a, false, 34257, new Class[]{String.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        this.f40776b.a(this.f40777c, this.f40778d, this.f40779e, this.f40780f, this.g, this.h, str, str2, str4);
    }
}
