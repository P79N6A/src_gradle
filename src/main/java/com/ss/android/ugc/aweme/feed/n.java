package com.ss.android.ugc.aweme.feed;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class n implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45624a;

    /* renamed from: b  reason: collision with root package name */
    private final d f45625b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f45626c;

    n(d dVar, Aweme aweme) {
        this.f45625b = dVar;
        this.f45626c = aweme;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45624a, false, 40030, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45624a, false, 40030, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f45625b.g.a(this.f45626c.getAid());
        dialogInterface.dismiss();
    }
}
