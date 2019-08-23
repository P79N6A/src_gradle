package com.bytedance.android.livesdk.gift;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14765a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftManager f14766b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14767c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference f14768d;

    /* renamed from: e  reason: collision with root package name */
    private final long f14769e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f14770f;

    d(GiftManager giftManager, boolean z, WeakReference weakReference, long j, boolean z2) {
        this.f14766b = giftManager;
        this.f14767c = z;
        this.f14768d = weakReference;
        this.f14769e = j;
        this.f14770f = z2;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14765a, false, 9257, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14765a, false, 9257, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14766b.lambda$syncGiftList$0$GiftManager(this.f14767c, this.f14768d, this.f14769e, this.f14770f, (com.bytedance.android.live.core.network.response.d) obj);
    }
}
