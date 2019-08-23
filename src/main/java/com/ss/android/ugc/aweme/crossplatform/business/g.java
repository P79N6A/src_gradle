package com.ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.downloadad.api.a.a;
import com.ss.android.downloadad.api.a.b;
import com.ss.android.downloadlib.h;

public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40781a;

    /* renamed from: b  reason: collision with root package name */
    private final DownloadBusiness f40782b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f40783c;

    /* renamed from: d  reason: collision with root package name */
    private final b f40784d;

    /* renamed from: e  reason: collision with root package name */
    private final a f40785e;

    g(DownloadBusiness downloadBusiness, Activity activity, b bVar, a aVar) {
        this.f40782b = downloadBusiness;
        this.f40783c = activity;
        this.f40784d = bVar;
        this.f40785e = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f40781a, false, 34258, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f40781a, false, 34258, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        DownloadBusiness downloadBusiness = this.f40782b;
        Activity activity = this.f40783c;
        h.a((Context) activity).a(downloadBusiness.f40742c.f30645f, 2, (com.ss.android.download.api.b.b) this.f40784d, (com.ss.android.download.api.b.a) this.f40785e);
    }
}
