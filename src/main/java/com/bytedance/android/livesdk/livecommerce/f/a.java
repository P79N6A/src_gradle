package com.bytedance.android.livesdk.livecommerce.f;

import android.arch.core.util.Function;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livecommerce.b;
import com.bytedance.android.livesdk.livecommerce.c;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.bytedance.android.livesdk.livecommerce.d.g;
import com.bytedance.android.livesdk.livecommerce.d.j;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16195a;

    public static void a(Context context, String str) {
        if (PatchProxy.isSupport(new Object[]{context, str}, null, f16195a, true, 10720, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str}, null, f16195a, true, 10720, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        c.a(context, str);
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f16195a, true, 10723, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f16195a, true, 10723, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return c.d();
    }

    public static int b() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], null, f16195a, true, 10728, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f16195a, true, 10728, new Class[0], Integer.TYPE)).intValue();
        }
        if (b.a().c()) {
            i = 1;
        }
        return i;
    }

    public static e a(g gVar) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, null, f16195a, true, 10718, new Class[]{g.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{gVar2}, null, f16195a, true, 10718, new Class[]{g.class}, e.class);
        }
        e eVar = new e();
        eVar.m = gVar2.f16159a;
        eVar.n = gVar2.f16161c;
        eVar.f16126a = gVar2.f16160b;
        eVar.o = a(gVar2.f16162d);
        eVar.k = gVar2.j;
        if (gVar2.h == 1) {
            eVar.f16130e = 4;
        } else if (gVar2.h != 2) {
            eVar.f16130e = 3;
        } else if (gVar2.i) {
            eVar.f16130e = 1;
        } else {
            eVar.f16130e = 2;
        }
        eVar.l = "normal";
        eVar.f16127b = gVar2.k;
        Context c2 = c.c();
        if (c2 != null) {
            Resources resources = c2.getResources();
            eVar.f16128c = resources.getColor(C0906R.color.le);
            eVar.f16129d = resources.getString(C0906R.string.a9l, new Object[]{""});
        }
        eVar.f16131f = gVar2.g;
        if (gVar2.l != null) {
            eVar.g = gVar2.l.f16165a;
        }
        List<com.bytedance.android.livesdk.livecommerce.d.b> list = gVar2.f16164f;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            j jVar = new j();
            jVar.f16174a = list.get(0).f16134a;
            arrayList.add(jVar);
            if (list.size() > 1) {
                j jVar2 = new j();
                jVar2.f16174a = list.get(1).f16134a;
                arrayList.add(jVar2);
            }
            eVar.j = arrayList;
        }
        eVar.i = gVar2.f16163e;
        return eVar;
    }

    private static String a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f16195a, true, 10717, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f16195a, true, 10717, new Class[]{Integer.TYPE}, String.class);
        } else if (i2 % 100 == 0) {
            return String.valueOf(i2 / 100);
        } else {
            if (i2 % 10 == 0) {
                return String.format(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(((float) i2) / 100.0f)});
            }
            return String.format(Locale.getDefault(), "%.2f", new Object[]{Float.valueOf(((float) i2) / 100.0f)});
        }
    }

    public static float a(Context context, int i) {
        if (!PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, null, f16195a, true, 10727, new Class[]{Context.class, Integer.TYPE}, Float.TYPE)) {
            return (float) context.getResources().getDimensionPixelSize(i);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, null, f16195a, true, 10727, new Class[]{Context.class, Integer.TYPE}, Float.TYPE)).floatValue();
    }

    private static float b(Context context, float f2) {
        if (!PatchProxy.isSupport(new Object[]{context, Float.valueOf(f2)}, null, f16195a, true, 10724, new Class[]{Context.class, Float.TYPE}, Float.TYPE)) {
            return UIUtils.dip2Px(context, f2);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{context, Float.valueOf(f2)}, null, f16195a, true, 10724, new Class[]{Context.class, Float.TYPE}, Float.TYPE)).floatValue();
    }

    public static int a(Context context, float f2) {
        if (!PatchProxy.isSupport(new Object[]{context, Float.valueOf(f2)}, null, f16195a, true, 10725, new Class[]{Context.class, Float.TYPE}, Integer.TYPE)) {
            return (int) b(context, f2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context, Float.valueOf(f2)}, null, f16195a, true, 10725, new Class[]{Context.class, Float.TYPE}, Integer.TYPE)).intValue();
    }

    public static void b(Context context, String str) {
        if (PatchProxy.isSupport(new Object[]{context, str}, null, f16195a, true, 10721, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str}, null, f16195a, true, 10721, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        c.b(context, str);
    }

    public static <T> String a(List<T> list, Function<T, String> function) {
        Function<T, String> function2 = function;
        if (PatchProxy.isSupport(new Object[]{list, function2}, null, f16195a, true, 10722, new Class[]{List.class, Function.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list, function2}, null, f16195a, true, 10722, new Class[]{List.class, Function.class}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            for (T apply : list) {
                String str = (String) function2.apply(apply);
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}
