package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12277a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment f12278b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12279c;

    /* renamed from: d  reason: collision with root package name */
    private final long f12280d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12281e;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f12282f;

    l(AbsInteractionFragment absInteractionFragment, long j, long j2, String str, Runnable runnable) {
        this.f12278b = absInteractionFragment;
        this.f12279c = j;
        this.f12280d = j2;
        this.f12281e = str;
        this.f12282f = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12277a, false, 5566, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12277a, false, 5566, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f12278b.a(this.f12279c, this.f12280d, this.f12281e, this.f12282f, dialogInterface);
    }
}
