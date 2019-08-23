package com.ss.android.ugc.aweme.share;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.option.share.OnShareEventListener;

public final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65215a;

    /* renamed from: b  reason: collision with root package name */
    private final e f65216b;

    /* renamed from: c  reason: collision with root package name */
    private final OnShareEventListener f65217c;

    m(e eVar, OnShareEventListener onShareEventListener) {
        this.f65216b = eVar;
        this.f65217c = onShareEventListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f65215a, false, 72944, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f65215a, false, 72944, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        e eVar = this.f65216b;
        OnShareEventListener onShareEventListener = this.f65217c;
        eVar.dismiss();
        if (onShareEventListener != null) {
            onShareEventListener.onCancel(null);
        }
    }
}
