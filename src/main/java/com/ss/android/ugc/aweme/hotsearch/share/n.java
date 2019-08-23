package com.ss.android.ugc.aweme.hotsearch.share;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.share.f;
import com.ss.android.ugc.aweme.share.cg;

public final /* synthetic */ class n implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49848a;

    /* renamed from: b  reason: collision with root package name */
    private final g f49849b;

    /* renamed from: c  reason: collision with root package name */
    private final String f49850c;

    n(g gVar, String str) {
        this.f49849b = gVar;
        this.f49850c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f49848a, false, 49787, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f49848a, false, 49787, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        g gVar = this.f49849b;
        cg.a(f.a().a(this.f49850c), (Context) gVar.f49830c);
    }
}
