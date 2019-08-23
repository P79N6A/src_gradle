package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.bytedance.android.livesdk.widget.PKProgressBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cc implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13065a;

    /* renamed from: b  reason: collision with root package name */
    static final c.b f13066b = new cc();

    private cc() {
    }

    public final void a(View view, Object obj) {
        if (PatchProxy.isSupport(new Object[]{view, obj}, this, f13065a, false, 7150, new Class[]{View.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, obj}, this, f13065a, false, 7150, new Class[]{View.class, Object.class}, Void.TYPE);
            return;
        }
        PKProgressBar pKProgressBar = (PKProgressBar) view;
        Integer num = (Integer) obj;
        if (pKProgressBar.getLeftValue() != num.intValue()) {
            pKProgressBar.setLeftValue(num.intValue());
        }
    }
}
