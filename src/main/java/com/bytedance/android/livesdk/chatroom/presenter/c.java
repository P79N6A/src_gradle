package com.bytedance.android.livesdk.chatroom.presenter;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.i.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11336a;

    /* renamed from: b  reason: collision with root package name */
    private final b f11337b;

    c(b bVar) {
        this.f11337b = bVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11336a, false, 5138, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11336a, false, 5138, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f11337b;
        a aVar = (a) obj;
        if (!(bVar.b() == null || aVar == null || aVar.f15544a == null)) {
            String str = aVar.f15544a;
            if (PatchProxy.isSupport(new Object[]{str, "", 1}, bVar, b.f11261a, false, 5131, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
                b bVar2 = bVar;
                PatchProxy.accessDispatch(new Object[]{str, "", 1}, bVar2, b.f11261a, false, 5131, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
            } else if (!TextUtils.isEmpty(str) && bVar.f11263c) {
                bVar.f11263c = false;
                bVar.f11266f = 1;
                h.a().a(bVar.f11264d, bVar.f11265e.getRequestId(), "", bVar.f11265e.getId(), str, bVar.f11265e.getLabels());
            }
        }
    }
}
