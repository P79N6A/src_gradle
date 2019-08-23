package com.bytedance.android.livesdk.widget;

import com.bytedance.android.live.core.network.response.c;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class o implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18527a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveTagPicker f18528b;

    o(LiveTagPicker liveTagPicker) {
        this.f18528b = liveTagPicker;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f18527a, false, 14507, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f18527a, false, 14507, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LiveTagPicker liveTagPicker = this.f18528b;
        c cVar = (c) obj;
        if (cVar != null && !Lists.isEmpty(cVar.f7867b)) {
            liveTagPicker.g = cVar.f7867b;
            if (liveTagPicker.isAdded()) {
                liveTagPicker.a();
            }
        }
    }
}
