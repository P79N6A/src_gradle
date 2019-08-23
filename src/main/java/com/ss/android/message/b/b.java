package com.ss.android.message.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29966a;

    public static void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f29966a, true, 18133, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, f29966a, true, 18133, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        e<Long> b2 = b(applicationContext);
        long currentTimeMillis = System.currentTimeMillis();
        b2.a(Long.valueOf(currentTimeMillis));
        if (b2.a() < 5 || currentTimeMillis - ((Long) b2.a(0)).longValue() > 7000) {
            Logger.debug();
            a(applicationContext, b2);
            c.a(Process.myPid());
        }
    }

    private static e<Long> b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f29966a, true, 18134, new Class[]{Context.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{context}, null, f29966a, true, 18134, new Class[]{Context.class}, e.class);
        }
        SharedPreferences a2 = c.a(context.getApplicationContext(), "kill_process_sp", 0);
        e<Long> eVar = new e<>(5);
        String string = a2.getString("last_kill_times", "");
        if (TextUtils.isEmpty(string)) {
            return eVar;
        }
        String[] split = string.split("\\|");
        for (int i = 0; i < split.length; i++) {
            try {
                eVar.a(Long.valueOf(Long.parseLong(split[i])));
            } catch (Exception unused) {
            }
        }
        return eVar;
    }

    @SuppressLint({"ApplySharedPref"})
    private static void a(Context context, e<Long> eVar) {
        e<Long> eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{context, eVar2}, null, f29966a, true, 18135, new Class[]{Context.class, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, eVar2}, null, f29966a, true, 18135, new Class[]{Context.class, e.class}, Void.TYPE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < eVar.a(); i++) {
            sb.append(eVar2.a(i));
            sb.append("|");
        }
        SharedPreferences a2 = c.a(context.getApplicationContext(), "kill_process_sp", 0);
        Logger.debug();
        a2.edit().putString("last_kill_times", sb.toString()).commit();
    }
}
