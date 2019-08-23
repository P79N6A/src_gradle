package com.ss.android.ugc.aweme.app.c;

import a.g;
import a.i;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.app.c.e;

public final /* synthetic */ class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34078a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f34079b;

    /* renamed from: c  reason: collision with root package name */
    private final DownloadInfo f34080c;

    f(Context context, DownloadInfo downloadInfo) {
        this.f34079b = context;
        this.f34080c = downloadInfo;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f34078a, false, 23361, new Class[]{i.class}, Object.class)) {
            return e.AnonymousClass1.a(this.f34079b, this.f34080c);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f34078a, false, 23361, new Class[]{i.class}, Object.class);
    }
}
