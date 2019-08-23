package com.ss.android.message;

import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30010a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f30011b = "h";

    public static Class a() {
        return NotifyService.class;
    }

    public static Intent a(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, null, f30010a, true, 17899, new Class[]{Context.class}, Intent.class)) {
            return new Intent(context.getApplicationContext(), a());
        }
        return (Intent) PatchProxy.accessDispatch(new Object[]{context}, null, f30010a, true, 17899, new Class[]{Context.class}, Intent.class);
    }

    public static Intent b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f30010a, true, 17900, new Class[]{Context.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context}, null, f30010a, true, 17900, new Class[]{Context.class}, Intent.class);
        }
        Intent a2 = a(context);
        a2.setAction("pull_do_schedule");
        a2.putExtra("from_schedule", true);
        return a2;
    }

    public static Intent c(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f30010a, true, 17901, new Class[]{Context.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context}, null, f30010a, true, 17901, new Class[]{Context.class}, Intent.class);
        }
        Intent a2 = a(context);
        a2.setAction("push_heart_beat");
        a2.putExtra("push_heart_beat", true);
        return a2;
    }

    public static void d(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f30010a, true, 17905, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f30010a, true, 17905, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            Intent a2 = a(context);
            a2.putExtra("do_schedule_start", true);
            a2.putExtra("do_schedule_start_type", 1);
            context2.startService(a2);
        } catch (Exception unused) {
        }
    }
}
