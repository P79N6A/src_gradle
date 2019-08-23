package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Activity;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdk.share.b;
import com.bytedance.android.livesdkapi.depend.h.b;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dd implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12061a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveProfileDialogV2 f12062b;

    /* renamed from: c  reason: collision with root package name */
    private final b f12063c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12064d;

    dd(LiveProfileDialogV2 liveProfileDialogV2, b bVar, String str) {
        this.f12062b = liveProfileDialogV2;
        this.f12063c = bVar;
        this.f12064d = str;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12061a, false, 6171, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12061a, false, 6171, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LiveProfileDialogV2 liveProfileDialogV2 = this.f12062b;
        b bVar = this.f12063c;
        String str = this.f12064d;
        c cVar = (c) obj;
        liveProfileDialogV2.o = false;
        if (cVar != null && !CollectionUtils.isEmpty(cVar.f7867b)) {
            Activity activity = liveProfileDialogV2.z;
            b.a a2 = com.bytedance.android.livesdkapi.depend.h.b.a(liveProfileDialogV2.g);
            a2.z = cVar.f7867b;
            bVar.a(activity, a2.a(), str);
        }
    }
}
