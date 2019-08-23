package com.bytedance.android.livesdk.live.data;

import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdk.live.model.a;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.HashMap;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15838a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomStatsViewModel f15839b;

    b(RoomStatsViewModel roomStatsViewModel) {
        this.f15839b = roomStatsViewModel;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15838a, false, 10314, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15838a, false, 10314, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        RoomStatsViewModel roomStatsViewModel = this.f15839b;
        c cVar = (c) obj;
        if (!Lists.isEmpty(cVar.f7867b)) {
            HashMap hashMap = new HashMap();
            for (a aVar : cVar.f7867b) {
                hashMap.put(String.valueOf(aVar.f15856a), aVar);
            }
            roomStatsViewModel.f15831b.setValue(hashMap);
        }
    }
}
