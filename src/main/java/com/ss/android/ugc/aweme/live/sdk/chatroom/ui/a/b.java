package com.ss.android.ugc.aweme.live.sdk.chatroom.ui.a;

import com.bytedance.android.livesdkapi.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class b implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53511a;

    /* renamed from: b  reason: collision with root package name */
    private final a f53512b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a f53513c;

    b(a aVar, f.a aVar2) {
        this.f53512b = aVar;
        this.f53513c = aVar2;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f53511a, false, 55927, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f53511a, false, 55927, new Class[]{Object.class}, Object.class);
        }
        a aVar = this.f53512b;
        f.a aVar2 = this.f53513c;
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            aVar.f53509b = true;
            aVar2.b().f18762c.put("has_commerce_goods", "true");
            aVar2.a();
        } else {
            num.intValue();
        }
        return null;
    }
}
