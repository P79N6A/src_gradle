package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.chatroom.widget.CommonToastLayout;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class CommonToastWidget extends LiveWidget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12418a;

    /* renamed from: b  reason: collision with root package name */
    public CommonToastLayout.a f12419b = o.f13285b;

    @NonNull
    public String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f12418a, false, 6655, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f12418a, false, 6655, new Class[]{String.class}, String.class);
        }
        if (str.length() == 9) {
            str2 = "#" + str2.substring(7, 9) + str2.substring(1, 7);
        }
        return str2;
    }
}
