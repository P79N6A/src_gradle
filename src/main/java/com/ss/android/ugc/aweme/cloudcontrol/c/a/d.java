package com.ss.android.ugc.aweme.cloudcontrol.c.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36238a;

    /* renamed from: b  reason: collision with root package name */
    private final String f36239b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f36240c;

    d(String str, Context context) {
        this.f36239b = str;
        this.f36240c = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f36238a, false, 27070, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f36238a, false, 27070, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f36240c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f36239b)));
    }
}
