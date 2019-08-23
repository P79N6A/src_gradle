package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.v;
import com.bytedance.android.livesdk.chatroom.model.w;
import com.bytedance.android.livesdk.chatroom.model.x;
import com.bytedance.android.livesdk.chatroom.presenter.au;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.b.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.functions.Consumer;
import java.util.HashMap;

public final /* synthetic */ class bf implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11280a;

    /* renamed from: b  reason: collision with root package name */
    private final au f11281b;

    /* renamed from: c  reason: collision with root package name */
    private final x f11282c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11283d;

    /* renamed from: e  reason: collision with root package name */
    private final w f11284e;

    public bf(au auVar, x xVar, boolean z, w wVar) {
        this.f11281b = auVar;
        this.f11282c = xVar;
        this.f11283d = z;
        this.f11284e = wVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11280a, false, 5275, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11280a, false, 5275, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        au auVar = this.f11281b;
        x xVar = this.f11282c;
        boolean z = this.f11283d;
        w wVar = this.f11284e;
        d dVar = (d) obj;
        auVar.f11246f = false;
        if (((v) dVar.f7871b).f11172a) {
            j.q().n().a(((v) dVar.f7871b).f11173b);
            TTLiveSDKContext.getHostService().k().a(true);
            HashMap hashMap = new HashMap();
            hashMap.put("money", String.valueOf(xVar.f11183c));
            hashMap.put("redpackage_type", z ? "countdown_five" : "immediate");
            if (wVar.f11174a <= 1) {
                hashMap.put("redpackage_content", wVar.f11174a == 1 ? "gift_redpackage" : "lucky_redpackage");
            }
            hashMap.put("is_anchor", auVar.f11243c ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
            hashMap.put("is_first_consume", String.valueOf(b.a(TTLiveSDKContext.getHostService().k().a())));
            a a2 = a.a();
            Object[] objArr = new Object[3];
            objArr[0] = new com.bytedance.android.livesdk.j.c.j().b("live_function").a(auVar.f11243c ? "live_take_detail" : "live_detail").c("bottom_tab");
            objArr[1] = new k();
            objArr[2] = Room.class;
            a2.a("redpackage_send", hashMap, objArr);
            return;
        }
        ((au.b) auVar.b()).b(new com.bytedance.android.live.a.a.b.a(40001));
    }
}
