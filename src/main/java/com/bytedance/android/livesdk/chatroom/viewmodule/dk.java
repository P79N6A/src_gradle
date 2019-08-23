package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.Context;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdk.chatroom.model.w;
import com.bytedance.android.livesdk.chatroom.presenter.au;
import com.bytedance.android.livesdk.chatroom.ui.dy;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class dk implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13166a;

    /* renamed from: b  reason: collision with root package name */
    private final LuckyBoxWidget f13167b;

    dk(LuckyBoxWidget luckyBoxWidget) {
        this.f13167b = luckyBoxWidget;
    }

    public final void accept(Object obj) {
        dy dyVar;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13166a, false, 7280, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13166a, false, 7280, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LuckyBoxWidget luckyBoxWidget = this.f13167b;
        Context context = luckyBoxWidget.context;
        DataCenter dataCenter = luckyBoxWidget.dataCenter;
        au auVar = luckyBoxWidget.f12670b;
        List<w> list = ((c) obj).f7867b;
        if (PatchProxy.isSupport(new Object[]{context, dataCenter, auVar, list}, null, dy.f12118a, true, 6255, new Class[]{Context.class, DataCenter.class, au.class, List.class}, dy.class)) {
            Object[] objArr = {context, dataCenter, auVar, list};
            Object[] objArr2 = objArr;
            dyVar = (dy) PatchProxy.accessDispatch(objArr2, null, dy.f12118a, true, 6255, new Class[]{Context.class, DataCenter.class, au.class, List.class}, dy.class);
        } else {
            dy dyVar2 = new dy(context);
            dyVar2.f12120c = auVar;
            dyVar2.f12119b = list;
            dyVar2.f12123f = ((Boolean) dataCenter.get("data_is_portrait")).booleanValue();
            dyVar = dyVar2;
        }
        luckyBoxWidget.i = dyVar;
        luckyBoxWidget.i.setOnDismissListener(luckyBoxWidget);
        luckyBoxWidget.i.show();
    }
}
