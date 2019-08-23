package com.ss.android.ugc.aweme.im.sdk.utils;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.a.a;

public final /* synthetic */ class bg implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52575a;

    /* renamed from: b  reason: collision with root package name */
    private final int f52576b;

    /* renamed from: c  reason: collision with root package name */
    private final a f52577c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f52578d;

    bg(int i, a aVar, Runnable runnable) {
        this.f52576b = i;
        this.f52577c = aVar;
        this.f52578d = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52575a, false, 53844, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52575a, false, 53844, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        int i2 = this.f52576b;
        a aVar = this.f52577c;
        Runnable runnable = this.f52578d;
        o.a().b(i2);
        if (aVar != null) {
            aVar.a(dialogInterface, i);
        }
        if (runnable != null && i == -1) {
            runnable.run();
        }
    }
}
