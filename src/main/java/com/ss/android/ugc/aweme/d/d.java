package com.ss.android.ugc.aweme.d;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.annotation.StringRes;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41079a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f41079a, true, 25634, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f41079a, true, 25634, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a.a() && com.ss.android.ugc.aweme.account.d.a().getCurUser() != null && com.ss.android.ugc.aweme.account.d.a().getCurUser().getBindPhone() != null && com.ss.android.ugc.aweme.account.d.a().getCurUser().getBindPhone().isEmpty()) {
            return true;
        }
        return false;
    }

    private static float a(Resources resources, float f2) {
        if (PatchProxy.isSupport(new Object[]{resources, Float.valueOf(f2)}, null, f41079a, true, 25640, new Class[]{Resources.class, Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{resources, Float.valueOf(f2)}, null, f41079a, true, 25640, new Class[]{Resources.class, Float.TYPE}, Float.TYPE)).floatValue();
        }
        return TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
    }

    public static TextView a(Context context, @StringRes int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, null, f41079a, true, 25639, new Class[]{Context.class, Integer.TYPE}, TextView.class)) {
            return (TextView) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, null, f41079a, true, 25639, new Class[]{Context.class, Integer.TYPE}, TextView.class);
        }
        SpannableString spannableString = new SpannableString(context.getString(i));
        e.a(spannableString, new ForegroundColorSpan(context.getResources().getColor(C0906R.color.ry)), 1, 16, 33);
        DmtTextView dmtTextView = new DmtTextView(context2);
        dmtTextView.setTextSize(18.0f);
        dmtTextView.setText(spannableString);
        dmtTextView.setPadding((int) a(context.getResources(), 30.0f), (int) a(context.getResources(), 20.0f), (int) a(context.getResources(), 30.0f), (int) a(context.getResources(), 10.0f));
        dmtTextView.setTextColor(-16777216);
        dmtTextView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41085a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f41085a, false, 25644, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41085a, false, 25644, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                Context context = view.getContext();
                if (PatchProxy.isSupport(new Object[]{context}, null, d.f41079a, true, 25641, new Class[]{Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context}, null, d.f41079a, true, 25641, new Class[]{Context.class}, Void.TYPE);
                    return;
                }
                Intent intent = new Intent(context, CrossPlatformActivity.class);
                intent.putExtra("bundle_webview_background", context.getResources().getColor(C0906R.color.anp));
                intent.putExtra("hide_status_bar", true);
                intent.setData(Uri.parse("http://www.cac.gov.cn/2017-08/25/c_1121541842.htm"));
                context.startActivity(intent);
            }
        });
        return dmtTextView;
    }

    public static void a(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f41079a, true, 25638, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2}, null, f41079a, true, 25638, new Class[]{Context.class, String.class}, Void.TYPE);
        } else if (context != null) {
            r.a("phone_bundling_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", str2).f34114b);
            c.c().bindMobile((Activity) context, str2, null, null);
        }
    }

    public static void b(Context context, @StringRes int i, Runnable runnable) {
        Context context2 = context;
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(C0906R.string.mr), runnable2}, null, f41079a, true, 25636, new Class[]{Context.class, Integer.TYPE, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(C0906R.string.mr), runnable2}, null, f41079a, true, 25636, new Class[]{Context.class, Integer.TYPE, Runnable.class}, Void.TYPE);
            return;
        }
        a(context2, C0906R.string.mr, runnable2, "post");
    }

    public static void a(Context context, @StringRes int i, Runnable runnable) {
        Context context2 = context;
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(C0906R.string.mq), runnable2}, null, f41079a, true, 25635, new Class[]{Context.class, Integer.TYPE, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(C0906R.string.mq), runnable2}, null, f41079a, true, 25635, new Class[]{Context.class, Integer.TYPE, Runnable.class}, Void.TYPE);
            return;
        }
        a(context2, C0906R.string.mq, runnable2, "comment");
    }

    private static void a(Context context, @StringRes int i, Runnable runnable, String str) {
        final Context context2 = context;
        final Runnable runnable2 = runnable;
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), runnable2, str2}, null, f41079a, true, 25637, new Class[]{Context.class, Integer.TYPE, Runnable.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), runnable2, str2}, null, f41079a, true, 25637, new Class[]{Context.class, Integer.TYPE, Runnable.class, String.class}, Void.TYPE);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context2);
        builder.setCustomTitle(a(context, i)).setNegativeButton(C0906R.string.m2, new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41083a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f41083a, false, 25643, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f41083a, false, 25643, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                runnable2.run();
            }
        }).setPositiveButton(C0906R.string.m5, new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41080a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f41080a, false, 25642, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f41080a, false, 25642, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                d.a(context2, str2);
            }
        }).setCancelable(false);
        AlertDialog create = builder.create();
        create.show();
        r.a("phone_bundling_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", str2).f34114b);
        create.getButton(-1).setTextColor(context.getResources().getColor(C0906R.color.ry));
        create.getButton(-2).setTextColor(context.getResources().getColor(C0906R.color.a6z));
    }
}
