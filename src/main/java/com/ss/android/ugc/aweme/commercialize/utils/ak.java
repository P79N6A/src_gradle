package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.commercialize.utils.a.d;
import java.net.URLEncoder;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39701a;

    public static void a(Activity activity, Fragment fragment) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{activity, fragment2}, null, f39701a, true, 32579, new Class[]{Activity.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, fragment2}, null, f39701a, true, 32579, new Class[]{Activity.class, Fragment.class}, Void.TYPE);
        } else if (activity != null && fragment2 != null) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("trigger_by");
                if (stringExtra != null) {
                    Bundle arguments = fragment.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                        fragment2.setArguments(arguments);
                    }
                    arguments.putString("trigger_by", stringExtra);
                }
            }
        }
    }

    public static void a(Context context, String str) {
        String str2;
        String str3;
        Context context2 = context;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str4}, null, f39701a, true, 32577, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str4}, null, f39701a, true, 32577, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        d.a(str);
        f.a aVar = f.f34171e;
        if (PatchProxy.isSupport(new Object[]{str4, "trigger_by", "splash"}, null, f39701a, true, 32583, new Class[]{String.class, String.class, String.class}, String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[]{str4, "trigger_by", "splash"}, null, f39701a, true, 32583, new Class[]{String.class, String.class, String.class}, String.class);
        } else {
            Object[] objArr = new Object[4];
            objArr[0] = str4;
            if (str4.contains("?")) {
                str3 = "&";
            } else {
                str3 = "?";
            }
            objArr[1] = str3;
            objArr[2] = URLEncoder.encode("trigger_by");
            objArr[3] = URLEncoder.encode("splash");
            str2 = String.format("%s%s%s=%s", objArr);
        }
        aVar.a(context2, str2, null);
    }
}
