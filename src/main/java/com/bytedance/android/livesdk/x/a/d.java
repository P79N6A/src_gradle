package com.bytedance.android.livesdk.x.a;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.a;
import com.bytedance.android.livesdkapi.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18596a;

    /* renamed from: b  reason: collision with root package name */
    public a f18597b;

    public final void a(f.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f18596a, false, 13336, new Class[]{f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f18596a, false, 13336, new Class[]{f.a.class}, Void.TYPE);
            return;
        }
        if (this.f18597b.isStreamingBackground) {
            Room a2 = TTLiveSDKContext.getLiveService().d().a();
            if (a2 != null && ((a2.isScreenshot && this.f18597b == a.SCREEN_RECORD) || (a2.isThirdParty && this.f18597b == a.THIRD_PARTY))) {
                com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.x.b.a(a2));
                return;
            }
        }
        aVar.a();
    }
}
