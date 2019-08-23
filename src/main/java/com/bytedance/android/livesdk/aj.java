package com.bytedance.android.livesdk;

import com.bytedance.android.live.uikit.d.a;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class aj implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9012a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomFragment.a f9013b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9014c;

    aj(LiveRoomFragment.a aVar, long j) {
        this.f9013b = aVar;
        this.f9014c = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9012a, false, 2745, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9012a, false, 2745, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LiveRoomFragment.a aVar = this.f9013b;
        LiveRoomFragment.this.j.a(this.f9014c);
        a.a(LiveRoomFragment.this.getContext(), (int) C0906R.string.cvd);
    }
}
