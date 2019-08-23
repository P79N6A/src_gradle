package com.ss.android.ugc.aweme.antiaddic.lock.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.ag.d;
import com.ss.android.ugc.aweme.ag.k;
import com.ss.android.ugc.aweme.antiaddic.lock.b;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33472a;

    private String b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f33472a, false, 21884, new Class[]{String.class}, String.class)) {
            return k.b(str2, "type");
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f33472a, false, 21884, new Class[]{String.class}, String.class);
    }

    private String c(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f33472a, false, 21885, new Class[]{String.class}, String.class)) {
            return k.b(str2, "user_id");
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f33472a, false, 21885, new Class[]{String.class}, String.class);
    }

    private int d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f33472a, false, 21886, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f33472a, false, 21886, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        String b2 = k.b(str2, "chat_privacy");
        if (TextUtils.isEmpty(b2)) {
            return 0;
        }
        try {
            return Integer.parseInt(b2);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f33472a, false, 21881, new Class[]{String.class}, Boolean.TYPE)) {
            return a(null, str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f33472a, false, 21881, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(Activity activity, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{activity2, str2}, this, f33472a, false, 21882, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return a(activity2, str2, null);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2}, this, f33472a, false, 21882, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(Activity activity, String str, View view) {
        Context context;
        String str2 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{activity, str2, view}, this, f33472a, false, 21883, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity, str2, view}, this, f33472a, false, 21883, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)).booleanValue();
        }
        if (activity == null) {
            context = com.ss.android.ugc.aweme.framework.core.a.b().a();
        } else {
            context = activity;
        }
        if (context == null) {
            context = GlobalContext.getContext();
        }
        if (TextUtils.isEmpty(b(str)) || !TextUtils.equals(b(str), "chat_privacy") || TextUtils.isEmpty(c(str))) {
            return false;
        }
        c a2 = b.a();
        if (a2 != null) {
            z = a2.t;
        }
        ChatControlSettingActivity.a(context, d(str), z, c(str));
        return true;
    }
}
