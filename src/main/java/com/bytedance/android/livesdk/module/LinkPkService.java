package com.bytedance.android.livesdk.module;

import android.arch.lifecycle.Observer;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.live.d.a;
import com.bytedance.android.live.d.b;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.j.c.f;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

@Keep
public class LinkPkService implements a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final PublishSubject<b> pkStateSubject = PublishSubject.create();

    @NonNull
    public Observable<b> observePkState() {
        return this.pkStateSubject;
    }

    public LinkPkService() {
        com.bytedance.android.live.utility.b.a(a.class, this);
        LinkCrossRoomDataHolder.a().observe("data_pk_state", new Observer<KVData>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f16717a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                KVData kVData = (KVData) obj;
                if (PatchProxy.isSupport(new Object[]{kVData}, this, f16717a, false, 12503, new Class[]{KVData.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{kVData}, this, f16717a, false, 12503, new Class[]{KVData.class}, Void.TYPE);
                    return;
                }
                LinkPkService.this.pkStateSubject.onNext(kVData.getData());
            }
        });
    }

    public b getCurrentPkState() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12501, new Class[0], b.class)) {
            return (b) LinkCrossRoomDataHolder.a().get("data_pk_state", b.DISABLED);
        }
        return (b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12501, new Class[0], b.class);
    }

    public f getLinkCrossRoomLog() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12502, new Class[0], f.class)) {
            return LinkCrossRoomDataHolder.a().b();
        }
        return (f) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12502, new Class[0], f.class);
    }
}
