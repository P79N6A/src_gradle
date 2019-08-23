package com.ss.android.ugc.aweme.story.shootvideo;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73628a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnClickListener f73629b = new j();

    private j() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f73628a, false, 85153, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f73628a, false, 85153, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
        }
    }
}
