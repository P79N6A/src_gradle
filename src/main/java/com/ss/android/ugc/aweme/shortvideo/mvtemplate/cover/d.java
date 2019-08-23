package com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.e;
import java.io.File;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68702a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68703b;

    /* renamed from: c  reason: collision with root package name */
    private final String f68704c;

    d(a aVar, String str) {
        this.f68703b = aVar;
        this.f68704c = str;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f68702a, false, 78065, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f68702a, false, 78065, new Class[0], Object.class);
        }
        a aVar = this.f68703b;
        String str = this.f68704c;
        Bitmap a2 = aVar.a();
        if (a2 != null) {
            e.a(a2, new File(str), 60, Bitmap.CompressFormat.PNG);
            e.a(a2);
        }
        return null;
    }
}
