package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class ai {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17579a;

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f17579a, true, 13746, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f17579a, true, 13746, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str2, 0);
    }

    public static void a(String str, int i) {
        String str2 = str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f17579a, true, 13748, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f17579a, true, 13748, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Context e2 = ac.e();
        if (e2 != null && !TextUtils.isEmpty(str)) {
            if (a.l()) {
                TextView textView = (TextView) ((LayoutInflater) e2.getSystemService("layout_inflater")).inflate(C0906R.layout.an8, null);
                if (textView != null) {
                    Toast toast = new Toast(e2);
                    toast.setGravity(17, 0, 0);
                    toast.setView(textView);
                    toast.setDuration(i2);
                    textView.setText(str2);
                    aj.a(toast);
                    return;
                }
                return;
            }
            ((IHostApp) b.a(IHostApp.class)).a(e2, str2, i2);
        }
    }

    public static void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f17579a, true, 13745, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f17579a, true, 13745, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i, 0);
    }

    public static void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f17579a, true, 13747, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f17579a, true, 13747, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Context e2 = ac.e();
        if (e2 != null) {
            a(e2.getString(i), i2);
        }
    }

    public static void a(Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, null, f17579a, true, 13741, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, null, f17579a, true, 13741, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(context2, i, 0);
    }

    public static void a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f17579a, true, 13742, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f17579a, true, 13742, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        a(context2, str2, 0);
    }

    private static void a(Context context, int i, int i2) {
        Context context2;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), 0}, null, f17579a, true, 13743, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), 0}, null, f17579a, true, 13743, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (context == null) {
            context2 = ac.e();
        } else {
            context2 = context;
        }
        a(context2, context2.getString(i), 0);
    }

    private static void a(Context context, String str, int i) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, Integer.valueOf(i)}, null, f17579a, true, 13744, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, Integer.valueOf(i)}, null, f17579a, true, 13744, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
        } else if (context2 != null && !TextUtils.isEmpty(str)) {
            ((IHostApp) b.a(IHostApp.class)).b(context2, str2, i);
        }
    }
}
