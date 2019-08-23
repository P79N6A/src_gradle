package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.bytedance.android.livesdk.widget.PKProgressBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cf implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13071a;

    /* renamed from: b  reason: collision with root package name */
    static final c.b f13072b = new cf();

    private cf() {
    }

    public final void a(View view, Object obj) {
        if (PatchProxy.isSupport(new Object[]{view, obj}, this, f13071a, false, 7153, new Class[]{View.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, obj}, this, f13071a, false, 7153, new Class[]{View.class, Object.class}, Void.TYPE);
            return;
        }
        PKProgressBar pKProgressBar = (PKProgressBar) view;
        Integer num = (Integer) obj;
        if (pKProgressBar.getRightValue() != num.intValue()) {
            pKProgressBar.setRightValue(num.intValue());
        }
    }
}
