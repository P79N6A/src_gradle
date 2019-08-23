package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.CheckAnchorMemorialResult;
import com.bytedance.android.livesdk.utils.b.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class q implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12293a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f12294b = new q();

    private q() {
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12293a, false, 5571, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f12293a, false, 5571, new Class[]{Object.class}, Object.class);
        }
        d dVar = (d) obj;
        if (((CheckAnchorMemorialResult) dVar.f7871b).isMemorial) {
            return b.a((long) ((CheckAnchorMemorialResult) dVar.f7871b).interval, TimeUnit.SECONDS).take(2147483647L);
        }
        return Observable.empty();
    }
}
