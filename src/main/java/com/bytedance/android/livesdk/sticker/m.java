package com.bytedance.android.livesdk.sticker;

import com.bytedance.android.livesdk.gift.effect.b.b;
import com.bytedance.android.livesdk.sticker.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class m implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17303a;

    /* renamed from: b  reason: collision with root package name */
    private final i.AnonymousClass1 f17304b;

    m(i.AnonymousClass1 r1) {
        this.f17304b = r1;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17303a, false, 13384, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17303a, false, 13384, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        i.this.a((b) obj);
    }
}
