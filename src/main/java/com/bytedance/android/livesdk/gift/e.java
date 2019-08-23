package com.bytedance.android.livesdk.gift;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14775a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14776b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference f14777c;

    e(boolean z, WeakReference weakReference) {
        this.f14776b = z;
        this.f14777c = weakReference;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14775a, false, 9258, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14775a, false, 9258, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftManager.lambda$syncGiftList$1$GiftManager(this.f14776b, this.f14777c, (Throwable) obj);
    }
}
