package com.ss.android.ugc.aweme.qrcode.e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63464a;

    public static void a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f63464a, true, 70513, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f63464a, true, 70513, new Class[]{Context.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            File file = new File(str2);
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            context2.sendBroadcast(intent);
        }
    }
}
