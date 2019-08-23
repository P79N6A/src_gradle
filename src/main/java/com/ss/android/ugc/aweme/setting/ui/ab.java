package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.AppContext;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.crossplatform.platform.rn.l;

public final /* synthetic */ class ab implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64404a;

    /* renamed from: b  reason: collision with root package name */
    private final EditText f64405b;

    ab(EditText editText) {
        this.f64405b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64404a, false, 72825, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64404a, false, 72825, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        EditText editText = this.f64405b;
        l a2 = l.a();
        String obj = editText.getText().toString();
        if (PatchProxy.isSupport(new Object[]{obj}, a2, l.f40882a, false, 34365, new Class[]{String.class}, Void.TYPE)) {
            l lVar = a2;
            PatchProxy.accessDispatch(new Object[]{obj}, lVar, l.f40882a, false, 34365, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a2.f40884b = obj;
        AppContext c2 = AwemeAppData.p().c();
        if (c2 != null) {
            Context context = c2.getContext();
            if (context != null) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                if (obj != null) {
                    defaultSharedPreferences.edit().putString("rn_debug_source_url_safe_host", obj).apply();
                    return;
                }
                defaultSharedPreferences.edit().remove("rn_debug_source_url_safe_host").apply();
            }
        }
    }
}
