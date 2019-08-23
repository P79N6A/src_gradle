package com.ss.android.ugc.aweme.live;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53327a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f53328b;

    /* renamed from: c  reason: collision with root package name */
    private final long f53329c;

    /* renamed from: d  reason: collision with root package name */
    private final Bundle f53330d;

    /* renamed from: e  reason: collision with root package name */
    private final String f53331e;

    /* renamed from: f  reason: collision with root package name */
    private final List f53332f;

    b(Context context, long j, Bundle bundle, String str, List list) {
        this.f53328b = context;
        this.f53329c = j;
        this.f53330d = bundle;
        this.f53331e = str;
        this.f53332f = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53327a, false, 55365, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53327a, false, 55365, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a.a(this.f53328b, this.f53329c, this.f53330d, this.f53331e, this.f53332f, dialogInterface);
    }
}
