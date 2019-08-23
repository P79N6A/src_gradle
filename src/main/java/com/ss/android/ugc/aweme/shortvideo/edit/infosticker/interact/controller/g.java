package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import a.i;
import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.e;
import java.io.File;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67272a;

    /* renamed from: b  reason: collision with root package name */
    private final e f67273b;

    /* renamed from: c  reason: collision with root package name */
    private final String f67274c;

    g(e eVar, String str) {
        this.f67273b = eVar;
        this.f67274c = str;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f67272a, false, 76976, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f67272a, false, 76976, new Class[]{i.class}, Object.class);
        }
        e eVar = this.f67273b;
        String str = this.f67274c;
        d dVar = null;
        if (e.a(((i) iVar.e()).f67280a, new File(str), 100, Bitmap.CompressFormat.PNG)) {
            dVar = new d(str, ((i) iVar.e()).f67281b.intValue());
        }
        e.a(((i) iVar.e()).f67280a);
        return dVar;
    }
}
