package com.ss.android.ugc.awemepushlib.di;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.MultiProcessSharedProvider;
import com.ss.android.ugc.awemepushapi.d;
import com.ss.android.ugc.awemepushlib.interaction.j;
import java.util.Map;

public class a implements com.ss.android.newmedia.message.localpush.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76979a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f76980c;

    /* renamed from: b  reason: collision with root package name */
    public d f76981b;

    private a() {
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f76979a, false, 90173, new Class[0], String.class)) {
            return j.a().getBaseHost();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f76979a, false, 90173, new Class[0], String.class);
    }

    public static a a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f76979a, true, 90168, new Class[]{Context.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context}, null, f76979a, true, 90168, new Class[]{Context.class}, a.class);
        }
        if (f76980c == null) {
            synchronized (a.class) {
                if (f76980c == null) {
                    f76980c = new a();
                }
            }
        }
        return f76980c;
    }

    public final void a(Context context, Map<String, ?> map) {
        if (PatchProxy.isSupport(new Object[]{context, map}, this, f76979a, false, 90172, new Class[]{Context.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, map}, this, f76979a, false, 90172, new Class[]{Context.class, Map.class}, Void.TYPE);
            return;
        }
        try {
            MultiProcessSharedProvider.a a2 = MultiProcessSharedProvider.a(context);
            for (Map.Entry next : map.entrySet()) {
                Object value = next.getValue();
                if (value instanceof Integer) {
                    a2.a((String) next.getKey(), ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    a2.a((String) next.getKey(), ((Long) value).longValue());
                } else if (value instanceof Float) {
                    a2.a((String) next.getKey(), ((Float) value).floatValue());
                } else if (value instanceof Boolean) {
                    a2.a((String) next.getKey(), ((Boolean) value).booleanValue());
                } else if (value instanceof String) {
                    a2.a((String) next.getKey(), (String) value);
                }
            }
            a2.a();
        } catch (Throwable unused) {
        }
    }

    public final long a(Context context, String str, long j) {
        String str2 = str;
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{context, str2, new Long(j2)}, this, f76979a, false, 90169, new Class[]{Context.class, String.class, Long.TYPE}, Long.TYPE)) {
            return MultiProcessSharedProvider.b(context).a(str2, j2);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{context, str2, new Long(j2)}, this, f76979a, false, 90169, new Class[]{Context.class, String.class, Long.TYPE}, Long.TYPE)).longValue();
    }

    public final Boolean a(Context context, String str, Boolean bool) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{context, str2, bool}, this, f76979a, false, 90171, new Class[]{Context.class, String.class, Boolean.class}, Boolean.class)) {
            return Boolean.valueOf(MultiProcessSharedProvider.b(context).a(str2, bool.booleanValue()));
        }
        return (Boolean) PatchProxy.accessDispatch(new Object[]{context, str2, bool}, this, f76979a, false, 90171, new Class[]{Context.class, String.class, Boolean.class}, Boolean.class);
    }

    public final String a(Context context, String str, String str2) {
        String str3 = str;
        if (!PatchProxy.isSupport(new Object[]{context, str3, null}, this, f76979a, false, 90170, new Class[]{Context.class, String.class, String.class}, String.class)) {
            return MultiProcessSharedProvider.b(context).a(str3, (String) null);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context, str3, null}, this, f76979a, false, 90170, new Class[]{Context.class, String.class, String.class}, String.class);
    }
}
