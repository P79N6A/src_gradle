package com.ss.android.ugc.aweme.feed.panel;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.f.d;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.utils.bg;

public final /* synthetic */ class z implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45757a;

    /* renamed from: b  reason: collision with root package name */
    private final u f45758b;

    /* renamed from: c  reason: collision with root package name */
    private final NearbyCities.CityBean f45759c;

    z(u uVar, NearbyCities.CityBean cityBean) {
        this.f45758b = uVar;
        this.f45759c = cityBean;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45757a, false, 41935, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45757a, false, 41935, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        u uVar = this.f45758b;
        NearbyCities.CityBean cityBean = this.f45759c;
        uVar.v = false;
        bg.a(new d(cityBean, true));
        dialogInterface.dismiss();
    }
}
