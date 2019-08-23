package com.bytedance.android.livesdk.i18n;

import android.text.TextUtils;
import com.bytedance.android.livesdk.i18n.I18nUpdateManager;
import com.bytedance.android.livesdk.i18n.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15584a;
    private static b i;

    /* renamed from: b  reason: collision with root package name */
    public String f15585b = "";

    /* renamed from: c  reason: collision with root package name */
    public long f15586c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f15587d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public I18nUpdateManager f15588e;

    /* renamed from: f  reason: collision with root package name */
    public I18nUpdateManager.a f15589f = new I18nUpdateManager.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f15590a;

        public final void a(String str, long j, Map<String, String> map) {
            String str2 = str;
            long j2 = j;
            Map<String, String> map2 = map;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2), map2}, this, f15590a, false, 10160, new Class[]{String.class, Long.TYPE, Map.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, new Long(j2), map2}, this, f15590a, false, 10160, new Class[]{String.class, Long.TYPE, Map.class}, Void.TYPE);
            } else if (TextUtils.isEmpty(str) || !TextUtils.equals(str2, b.this.f15585b)) {
                TextUtils.isEmpty(str);
            } else if (j2 == b.this.f15586c) {
                if (b.this.f15587d != null && b.this.f15587d.isEmpty()) {
                    b.this.g.b();
                }
            } else if (map2 == null || map.isEmpty()) {
                if (b.this.f15587d != null && b.this.f15587d.isEmpty()) {
                    b.this.g.b();
                }
            } else {
                b.this.f15586c = j2;
                b.this.f15587d = map2;
                b.this.g.a(j2, map2);
            }
        }
    };
    public c g;
    public c.a h = new c.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f15592a;

        public final void a(String str, Exception exc) {
            if (PatchProxy.isSupport(new Object[]{str, exc}, this, f15592a, false, 10162, new Class[]{String.class, Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, exc}, this, f15592a, false, 10162, new Class[]{String.class, Exception.class}, Void.TYPE);
                return;
            }
            if (TextUtils.isEmpty(str) || !TextUtils.equals(b.this.f15585b, str)) {
                TextUtils.isEmpty(str);
            }
            b.this.f15588e.a(b.this.f15586c);
        }

        public final void a(String str, c.b bVar) {
            if (PatchProxy.isSupport(new Object[]{str, bVar}, this, f15592a, false, 10161, new Class[]{String.class, c.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, bVar}, this, f15592a, false, 10161, new Class[]{String.class, c.b.class}, Void.TYPE);
            } else if (TextUtils.isEmpty(str) || !TextUtils.equals(b.this.f15585b, str)) {
                TextUtils.isEmpty(str);
                b.this.f15588e.a(b.this.f15586c);
            } else if (bVar.f15601b != b.this.f15586c) {
                if (bVar.f15602c == null || bVar.f15602c.isEmpty()) {
                    b.this.f15588e.a(b.this.f15586c);
                    return;
                }
                b.this.f15586c = bVar.f15601b;
                b.this.f15587d = bVar.f15602c;
                b.this.f15588e.a(b.this.f15586c);
            }
        }
    };

    private b() {
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f15584a, true, 10157, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f15584a, true, 10157, new Class[0], b.class);
        }
        if (i == null) {
            i = new b();
        }
        return i;
    }

    public final String a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f15584a, false, 10158, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f15584a, false, 10158, new Class[]{String.class}, String.class);
        } else if (this.f15587d.containsKey(str)) {
            return this.f15587d.get(str);
        } else {
            if (this.f15588e != null) {
                this.f15588e.a(this.f15586c);
            }
            return null;
        }
    }
}
