package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.setting.model.IVerifyActionCache;

public final class ah implements IVerifyActionCache {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34550a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34551b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34552c = c.a(this.f34551b, "VerifyActionManager", 0);

    public final String getVerifyAction() {
        if (!PatchProxy.isSupport(new Object[0], this, f34550a, false, 24400, new Class[0], String.class)) {
            return this.f34552c.getString("verify_action", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f34550a, false, 24400, new Class[0], String.class);
    }

    public ah(Context context) {
        this.f34551b = context;
    }

    public final void setVerifyAction(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34550a, false, 24401, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34550a, false, 24401, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34552c.edit();
        edit.putString("verify_action", str2);
        edit.apply();
    }
}
