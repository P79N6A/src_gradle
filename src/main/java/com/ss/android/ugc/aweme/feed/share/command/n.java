package com.ss.android.ugc.aweme.feed.share.command;

import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.share.a.a;

public final class n extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46016a;

    public final boolean a(String str, String str2, int i) {
        final String str3 = str;
        final String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i)}, this, f46016a, false, 42262, new Class[]{String.class, String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i)}, this, f46016a, false, 42262, new Class[]{String.class, String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).isAppBrandSchema(str3) || TextUtils.equals(str4, "group_chat")) {
            return false;
        } else {
            final int i2 = i;
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46017a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f46017a, false, 42263, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f46017a, false, 42263, new Class[0], Void.TYPE);
                        return;
                    }
                    Intent intent = new Intent(k.a(), ShareCommandActivity.class);
                    intent.putExtra("command_code", str3);
                    intent.putExtra("command_type", str4);
                    intent.putExtra("qr_code_type", i2);
                    intent.addFlags(268435456);
                    k.a().startActivity(intent);
                }
            }, 100);
            return true;
        }
    }
}
