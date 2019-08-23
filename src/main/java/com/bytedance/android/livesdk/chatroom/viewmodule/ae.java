package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class ae implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12967a;

    /* renamed from: b  reason: collision with root package name */
    private final GameQuizWidget f12968b;

    ae(GameQuizWidget gameQuizWidget) {
        this.f12968b = gameQuizWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12967a, false, 6827, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12967a, false, 6827, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GameQuizWidget gameQuizWidget = this.f12968b;
        d dVar = (d) obj;
        if (gameQuizWidget.isViewValid() && dVar != null && dVar.f7870a == 0 && dVar.f7871b != null && ((List) dVar.f7871b).size() > 0) {
            for (o oVar : (List) dVar.f7871b) {
                if (oVar.f11146c == 1) {
                    gameQuizWidget.a();
                    return;
                }
            }
        }
    }
}
