package com.bytedance.android.livesdk.viewmodel;

import android.support.annotation.NonNull;
import android.util.Pair;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.paging.b.b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.chatroom.api.FansClubApi;
import com.bytedance.android.livesdk.chatroom.model.k;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import java.util.List;

public class FansClubAutoLightViewModel extends PagingViewModel<k.a> implements b<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17720a;
    int l;
    private FansClubApi m = ((FansClubApi) j.q().d().a(FansClubApi.class));

    @NonNull
    public final Observable<Pair<List<k.a>, Extra>> a(boolean z, Long l2, int i) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), l2, Integer.valueOf(i)}, this, f17720a, false, 13859, new Class[]{Boolean.TYPE, Long.class, Integer.TYPE}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), l2, Integer.valueOf(i)}, this, f17720a, false, 13859, new Class[]{Boolean.TYPE, Long.class, Integer.TYPE}, Observable.class);
        }
        if (z) {
            this.l = 0;
        }
        return this.m.getAutoLightList(this.l, 20).doOnNext(new c(this)).map(d.f17751b);
    }
}
