package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.graphics.Bitmap;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.i;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13005a;

    /* renamed from: b  reason: collision with root package name */
    private final BarrageWidget f13006b;

    b(BarrageWidget barrageWidget) {
        this.f13006b = barrageWidget;
    }

    public final void accept(Object obj) {
        Consumer consumer;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13005a, false, 6568, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13005a, false, 6568, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        BarrageWidget barrageWidget = this.f13006b;
        d dVar = (d) obj;
        if (Lists.isEmpty(((i) dVar.f7871b).f11125a)) {
            barrageWidget.g = false;
            return;
        }
        barrageWidget.g = true;
        for (i.a aVar : ((i) dVar.f7871b).f11125a) {
            Observable compose = com.bytedance.android.livesdk.chatroom.f.b.a(aVar.f11126a).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).compose(barrageWidget.getAutoUnbindTransformer());
            List<Bitmap> list = barrageWidget.f12353b;
            list.getClass();
            if (PatchProxy.isSupport(new Object[]{list}, null, d.f13140a, true, 6570, new Class[]{List.class}, Consumer.class)) {
                consumer = (Consumer) PatchProxy.accessDispatch(new Object[]{list}, null, d.f13140a, true, 6570, new Class[]{List.class}, Consumer.class);
            } else {
                consumer = new d(list);
            }
            compose.subscribe(consumer, new e(barrageWidget));
        }
    }
}
