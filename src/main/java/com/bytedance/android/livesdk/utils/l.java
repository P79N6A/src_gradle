package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.live.uikit.dialog.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17618a;

    public static void a(Context context, Throwable th) {
        Context context2 = context;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{context2, th2}, null, f17618a, true, 13648, new Class[]{Context.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, th2}, null, f17618a, true, 13648, new Class[]{Context.class, Throwable.class}, Void.TYPE);
        } else if (th2 != null && context2 != null) {
            if (th2 instanceof a) {
                a aVar = (a) th2;
                String alert = aVar.getAlert();
                String prompt = aVar.getPrompt();
                if (!TextUtils.isEmpty(alert)) {
                    a(context2, alert, context.getResources().getString(C0906R.string.crx));
                } else {
                    if (!TextUtils.isEmpty(prompt)) {
                        com.bytedance.android.live.uikit.d.a.a(context2, prompt);
                    }
                }
            } else {
                com.bytedance.android.live.uikit.d.a.a(context2, (int) C0906R.string.ctq);
            }
        }
    }

    public static void a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, null, f17618a, true, 13651, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, null, f17618a, true, 13651, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
        } else if (context2 != null) {
            b.a aVar = new b.a(context2);
            aVar.a((CharSequence) context.getResources().getString(C0906R.string.cu2));
            aVar.b((CharSequence) str3);
            aVar.a((CharSequence) str4, (DialogInterface.OnClickListener) null);
            aVar.a().show();
        }
    }

    public static void a(Context context, Throwable th, int i) {
        Context context2 = context;
        Throwable th2 = th;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context2, th2, Integer.valueOf(i)}, null, f17618a, true, 13649, new Class[]{Context.class, Throwable.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, th2, Integer.valueOf(i)}, null, f17618a, true, 13649, new Class[]{Context.class, Throwable.class, Integer.TYPE}, Void.TYPE);
        } else if (th2 != null && context2 != null) {
            if (th2 instanceof a) {
                a aVar = (a) th2;
                String prompt = aVar.getPrompt();
                String alert = aVar.getAlert();
                if (!TextUtils.isEmpty(alert)) {
                    a(context2, alert, context.getResources().getString(C0906R.string.crx));
                } else if (TextUtils.isEmpty(prompt)) {
                    com.bytedance.android.live.uikit.d.a.a(context2, i2);
                } else if (com.bytedance.android.live.uikit.a.a.f()) {
                    ai.a(prompt);
                } else {
                    com.bytedance.android.live.uikit.d.a.a(context2, prompt);
                }
            } else {
                com.bytedance.android.live.uikit.d.a.a(context2, i2);
            }
        }
    }
}
