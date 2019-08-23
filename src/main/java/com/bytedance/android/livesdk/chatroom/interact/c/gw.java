package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class gw implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10775a;

    /* renamed from: b  reason: collision with root package name */
    private final gs f10776b;

    gw(gs gsVar) {
        this.f10776b = gsVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10775a, false, 5011, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10775a, false, 5011, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        gs gsVar = this.f10776b;
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{str}, gsVar, gs.f10766a, false, 5006, new Class[]{String.class}, Void.TYPE)) {
            gs gsVar2 = gsVar;
            PatchProxy.accessDispatch(new Object[]{str}, gsVar2, gs.f10766a, false, 5006, new Class[]{String.class}, Void.TYPE);
            return;
        }
        List list = (List) gsVar.f10767b.get("data_banner_pending_data");
        if (list == null) {
            list = new ArrayList();
        }
        list.add(str);
        gsVar.f10767b.lambda$put$1$DataCenter("data_banner_pending_data", list);
    }
}
