package com.ss.android.ugc.aweme.photo.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58481a;

    public static void a(Context context, @NonNull String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f58481a, true, 63892, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f58481a, true, 63892, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(str2)));
        context2.sendBroadcast(intent);
    }
}
