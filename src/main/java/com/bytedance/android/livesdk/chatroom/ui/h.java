package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.live.model.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12261a;

    /* renamed from: b  reason: collision with root package name */
    private final b f12262b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f12263c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f12264d;

    h(b bVar, Runnable runnable, Map map) {
        this.f12262b = bVar;
        this.f12263c = runnable;
        this.f12264d = map;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12261a, false, 5562, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12261a, false, 5562, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        AbsInteractionFragment.a(this.f12262b, this.f12263c, this.f12264d, dialogInterface);
    }
}
