package com.ss.android.ugc.aweme.poi.e;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.c;

public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59797a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f59798b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f59799c;

    /* renamed from: d  reason: collision with root package name */
    private final String f59800d;

    /* renamed from: e  reason: collision with root package name */
    private final String f59801e;

    /* renamed from: f  reason: collision with root package name */
    private final c f59802f;

    j(Context context, String[] strArr, String str, String str2, c cVar) {
        this.f59798b = context;
        this.f59799c = strArr;
        this.f59800d = str;
        this.f59801e = str2;
        this.f59802f = cVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f59797a, false, 66853, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f59797a, false, 66853, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Context context = this.f59798b;
        String[] strArr = this.f59799c;
        h.b(context, strArr[i], this.f59800d, this.f59801e, this.f59802f);
    }
}
