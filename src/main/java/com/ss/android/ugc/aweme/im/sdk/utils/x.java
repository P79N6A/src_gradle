package com.ss.android.ugc.aweme.im.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52668a;

    public static void a(Context context, Intent intent) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, intent}, null, f52668a, true, 53540, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent}, null, f52668a, true, 53540, new Class[]{Context.class, Intent.class}, Void.TYPE);
        } else if (context2 != null) {
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                UIUtils.displayToast(context2, (int) C0906R.string.ayx);
            }
        }
    }

    public static void a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f52668a, true, 53537, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f52668a, true, 53537, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + str2));
        intent.addFlags(268435456);
        a(context2, intent);
    }
}
