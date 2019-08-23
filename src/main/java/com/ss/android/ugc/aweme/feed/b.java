package com.ss.android.ugc.aweme.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.feed.h.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45075a;

    /* renamed from: b  reason: collision with root package name */
    private static c f45076b;

    public static void a(int i, String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2)}, null, f45075a, true, 39945, new Class[]{Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2)}, null, f45075a, true, 39945, new Class[]{Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (f45076b == null) {
            f45076b = new c();
        }
        switch (i) {
            case 0:
                f45076b.sendRequest(str, 0, 1, 0, Integer.valueOf(i2), 0);
                return;
            case 1:
                f45076b.sendRequest(str, 0, 1, 0, Integer.valueOf(i2), 1);
                return;
            case 2:
                f45076b.sendRequest(str, 0, 1, 0, Integer.valueOf(i2), 2);
                return;
            case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE:
            case 2000:
                f45076b.sendRequest(str, 0, 1, 0, Integer.valueOf(i2), 3);
                return;
            case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST:
            case 2001:
                f45076b.sendRequest(str, 0, 1, 0, Integer.valueOf(i2), 4);
                return;
            case 3002:
                f45076b.sendRequest(str, 0, 1, 0, Integer.valueOf(i2), 5);
                return;
            case 3003:
                f45076b.sendRequest(str, 0, 1, 0, Integer.valueOf(i2), 9);
                return;
            case 4000:
                f45076b.sendRequest(str, 0, 1, 0, Integer.valueOf(i2), 6);
                return;
            case 4001:
                f45076b.sendRequest(str, 0, 1, 0, Integer.valueOf(i2), 8);
                return;
            case 5000:
                f45076b.sendRequest(str, 0, 1, 0, Integer.valueOf(i2), 7);
                return;
            case 8000:
                f45076b.sendRequest(str, 0, 1, 0, Integer.valueOf(i2), 20);
                return;
            default:
                f45076b.sendRequest(str, 0, 1, 0, Integer.valueOf(i2));
                return;
        }
    }
}
