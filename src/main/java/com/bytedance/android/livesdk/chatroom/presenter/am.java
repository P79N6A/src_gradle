package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Message;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class am implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11225a;

    /* renamed from: b  reason: collision with root package name */
    private final af f11226b;

    am(af afVar) {
        this.f11226b = afVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11225a, false, 5238, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11225a, false, 5238, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        af afVar = this.f11226b;
        d dVar = (d) obj;
        if (!(dVar == null || dVar.f7871b == null || ((m) dVar.f7871b).f11139b == null)) {
            List<m.a> list = ((m) dVar.f7871b).f11139b;
            if (list.size() > 0) {
                Observable.fromIterable(list).filter(ai.f11218b).map(aj.f11220b).toList().observeOn(AndroidSchedulers.mainThread()).subscribeOn(AndroidSchedulers.mainThread()).subscribe(new ak(afVar), al.f11224b);
                if (((m) dVar.f7871b).f11138a) {
                    afVar.f11212f += afVar.g;
                    Message message = new Message();
                    message.what = 100;
                    afVar.f11209c.sendMessageDelayed(message, 1000);
                }
            }
        }
    }
}
