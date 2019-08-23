package com.ss.android.ugc.aweme.share;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;

public final /* synthetic */ class bx implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64861a;

    /* renamed from: b  reason: collision with root package name */
    private final bv f64862b;

    bx(bv bvVar) {
        this.f64862b = bvVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64861a, false, 73265, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64861a, false, 73265, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        bv bvVar = this.f64862b;
        Intent intent = new Intent(bvVar.g, CrossPlatformActivity.class);
        intent.setData(Uri.parse(bvVar.m));
        bvVar.g.startActivity(intent);
    }
}
