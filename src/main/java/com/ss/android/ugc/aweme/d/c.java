package com.ss.android.ugc.aweme.d;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.d.a.a;
import com.ss.android.ugc.aweme.d.a.b;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41075a;

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f41075a, true, 25631, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f41075a, true, 25631, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a("bond_phone_alert_show", (Map) d.a().a("notify_type", str2).f34114b);
    }

    public static void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f41075a, true, 25632, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f41075a, true, 25632, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a("bond_phone_alert_bond", (Map) d.a().a("notify_type", str2).f34114b);
    }

    public static boolean a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f41075a, true, 25628, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f41075a, true, 25628, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (!a.a().a(false)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f41075a, true, 25629, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f41075a, true, 25629, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (!a.a().a(false)) {
            return false;
        } else {
            return a(context2, "launch_app");
        }
    }

    public static boolean a(Context context, String str) {
        int i;
        final Context context2 = context;
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f41075a, true, 25630, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f41075a, true, 25630, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 != null && (context2 instanceof Activity) && ((Activity) context2).isFinishing()) {
            return false;
        } else {
            b b2 = a.a().b();
            if (b2 == null) {
                return false;
            }
            a.C0185a a2 = new a.C0185a(context2).c(2130839233).a(b2.f41057a).b(b2.f41058b).a(context2.getString(C0906R.string.my), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41076a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f41076a, false, 25633, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f41076a, false, 25633, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    c.b(str2);
                    com.ss.android.ugc.aweme.account.c.c().bindMobile((Activity) context2, "", null, null);
                }
            });
            if (str2.equals("launch_app")) {
                i = C0906R.string.mv;
            } else {
                i = C0906R.string.pm;
            }
            a2.b(context2.getString(i), (DialogInterface.OnClickListener) null).a().b().setCanceledOnTouchOutside(false);
            a(str);
            if (str2.equals("launch_app")) {
                com.ss.android.ugc.aweme.d.a.a.a().b(false);
            }
            return true;
        }
    }
}
