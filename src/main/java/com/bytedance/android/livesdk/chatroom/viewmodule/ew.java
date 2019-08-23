package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.text.TextUtils;
import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.livesdk.chatroom.event.s;
import com.bytedance.android.livesdk.j.c;
import com.bytedance.android.livesdk.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ew implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13251a;

    /* renamed from: b  reason: collision with root package name */
    private final UserPermissionCheckWidget f13252b;

    ew(UserPermissionCheckWidget userPermissionCheckWidget) {
        this.f13252b = userPermissionCheckWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13251a, false, 7550, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13251a, false, 7550, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        UserPermissionCheckWidget userPermissionCheckWidget = this.f13252b;
        Throwable th = (Throwable) obj;
        if (PatchProxy.isSupport(new Object[]{th}, userPermissionCheckWidget, UserPermissionCheckWidget.f12853a, false, 7546, new Class[]{Throwable.class}, Void.TYPE)) {
            UserPermissionCheckWidget userPermissionCheckWidget2 = userPermissionCheckWidget;
            PatchProxy.accessDispatch(new Object[]{th}, userPermissionCheckWidget2, UserPermissionCheckWidget.f12853a, false, 7546, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (th instanceof a) {
            a aVar = (a) th;
            int errorCode = aVar.getErrorCode();
            String prompt = aVar.getPrompt();
            if (errorCode >= 30001 && errorCode <= 30006) {
                if (!TextUtils.isEmpty(prompt)) {
                    ai.a(prompt, 1);
                }
                com.bytedance.android.livesdk.u.a.a().a((Object) new s(35));
                return;
            }
        }
        c.b().a(6, th.getStackTrace());
    }
}
