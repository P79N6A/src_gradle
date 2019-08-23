package com.ss.android.ugc.aweme.login;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.AmeActivity;

@Deprecated
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53755a;

    /* renamed from: b  reason: collision with root package name */
    private static a f53756b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Class<?> f53757a;

        /* renamed from: b  reason: collision with root package name */
        public int f53758b = 1;

        /* renamed from: c  reason: collision with root package name */
        public b f53759c;

        /* renamed from: d  reason: collision with root package name */
        public String f53760d;
    }

    public interface b {
    }

    public static void a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, null, f53755a, true, 56341, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, null, f53755a, true, 56341, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        a(activity, null, null, null, 1, false);
    }

    private static void a(Class<?> cls, b bVar, String str, int i) {
        Class<?> cls2 = cls;
        b bVar2 = bVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{cls2, bVar2, str2, Integer.valueOf(i)}, null, f53755a, true, 56340, new Class[]{Class.class, b.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls2, bVar2, str2, Integer.valueOf(i)}, null, f53755a, true, 56340, new Class[]{Class.class, b.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (f53756b == null) {
            f53756b = new a();
        } else {
            a aVar = f53756b;
            aVar.f53757a = null;
            aVar.f53758b = 1;
            aVar.f53759c = null;
            aVar.f53760d = null;
        }
        f53756b.f53758b = i;
        f53756b.f53757a = cls2;
        f53756b.f53760d = str2;
        f53756b.f53759c = bVar2;
    }

    private static void a(Activity activity, Class<?> cls, b bVar, String str, int i, boolean z) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, null, null, null, 1, (byte) 0}, null, f53755a, true, 56347, new Class[]{Activity.class, Class.class, b.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {activity2, null, null, null, 1, (byte) 0};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f53755a, true, 56347, new Class[]{Activity.class, Class.class, b.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(null, null, null, 1);
        if (activity2 instanceof AmeActivity) {
            ((AmeActivity) activity2).showLoginDialog();
        }
    }
}
