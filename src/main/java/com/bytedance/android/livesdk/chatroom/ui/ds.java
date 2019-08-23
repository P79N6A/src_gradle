package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.android.livesdk.message.model.aq;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ds implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12106a;

    /* renamed from: b  reason: collision with root package name */
    private final dl f12107b;

    /* renamed from: c  reason: collision with root package name */
    private final aq f12108c;

    ds(dl dlVar, aq aqVar) {
        this.f12107b = dlVar;
        this.f12108c = aqVar;
    }

    public final void accept(Object obj) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12106a, false, 6237, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12106a, false, 6237, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        dl dlVar = this.f12107b;
        a aVar = (a) obj;
        this.f12108c.f16477b.setFollowStatus(aVar.a());
        View view = dlVar.f12089f;
        if (aVar.a() != 0) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
