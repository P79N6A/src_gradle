package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ck implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70873a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f70874b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f70875c;

    ck(Context context, Intent intent) {
        this.f70874b = context;
        this.f70875c = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f70873a, false, 80729, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f70873a, false, 80729, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f70874b.startActivity(this.f70875c);
    }
}
