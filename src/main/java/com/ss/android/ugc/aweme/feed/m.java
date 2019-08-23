package com.ss.android.ugc.aweme.feed;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45621a;

    /* renamed from: b  reason: collision with root package name */
    private final d f45622b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f45623c;

    m(d dVar, Aweme aweme) {
        this.f45622b = dVar;
        this.f45623c = aweme;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45621a, false, 40029, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45621a, false, 40029, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f45622b.f45163f.a(this.f45623c.getAuthorUid());
        dialogInterface.dismiss();
    }
}
