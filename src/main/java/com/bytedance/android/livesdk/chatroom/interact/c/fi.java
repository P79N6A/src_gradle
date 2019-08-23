package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.es;
import com.bytedance.android.livesdk.g;
import com.bytedance.android.livesdk.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fi implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10680a;

    /* renamed from: b  reason: collision with root package name */
    private final es.AnonymousClass2 f10681b;

    fi(es.AnonymousClass2 r1) {
        this.f10681b = r1;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10680a, false, 4929, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10680a, false, 4929, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        es.AnonymousClass2 r3 = this.f10681b;
        Integer num = (Integer) obj;
        if (num.equals(2)) {
            g.a().b();
            es.this.e();
        } else if (num.equals(1)) {
            ai.a((int) C0906R.string.diy);
        } else {
            ai.a((int) C0906R.string.dix);
        }
    }
}
