package com.bytedance.android.livesdk.live.data;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.HashMap;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15840a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomStatsViewModel f15841b;

    c(RoomStatsViewModel roomStatsViewModel) {
        this.f15841b = roomStatsViewModel;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15840a, false, 10315, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15840a, false, 10315, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f15841b.f15831b.setValue(new HashMap());
    }
}
