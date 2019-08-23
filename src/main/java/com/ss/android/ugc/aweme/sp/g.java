package com.ss.android.ugc.aweme.sp;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class g extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4103a;

    public g(Context context) {
        super(context);
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f4103a, false, 81771, new Class[]{String.class, Integer.TYPE}, SharedPreferences.class)) {
            return SharedPreferencesManager.getInstance().getSharedPreferences((Context) this, str2);
        }
        return (SharedPreferences) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f4103a, false, 81771, new Class[]{String.class, Integer.TYPE}, SharedPreferences.class);
    }
}
