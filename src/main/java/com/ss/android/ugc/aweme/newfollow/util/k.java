package com.ss.android.ugc.aweme.newfollow.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57431a;

    /* renamed from: b  reason: collision with root package name */
    public volatile List<String> f57432b;

    /* renamed from: c  reason: collision with root package name */
    private List<String> f57433c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final k f57434a = new k();
    }

    public static k a() {
        return a.f57434a;
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f57431a, false, 61947, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57431a, false, 61947, new Class[0], Void.TYPE);
            return;
        }
        e.g().b("to_report_rec_user_ids", "");
    }

    private String f() {
        if (!PatchProxy.isSupport(new Object[0], this, f57431a, false, 61948, new Class[0], String.class)) {
            return e.g().a("to_report_rec_user_ids", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f57431a, false, 61948, new Class[0], String.class);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f57431a, false, 61945, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57431a, false, 61945, new Class[0], Void.TYPE);
            return;
        }
        if (this.f57432b != null) {
            this.f57432b.clear();
        }
        if (this.f57433c != null) {
            this.f57433c.clear();
        }
        e();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f57431a, false, 61946, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57431a, false, 61946, new Class[0], Void.TYPE);
            return;
        }
        e.g().b("to_report_rec_user_ids", b());
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f57431a, false, 61949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57431a, false, 61949, new Class[0], Void.TYPE);
        } else if (!f().isEmpty()) {
            for (String str : Arrays.asList(f().split(","))) {
                if (this.f57432b.contains(str)) {
                    this.f57432b.remove(str);
                }
            }
        }
    }

    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f57431a, false, 61943, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f57431a, false, 61943, new Class[0], String.class);
        }
        String f2 = f();
        if (this.f57432b == null || this.f57432b.size() == 0) {
            return f2;
        }
        StringBuilder sb = new StringBuilder();
        if (!f2.isEmpty()) {
            sb.append(f2);
            sb.append(",");
        }
        g();
        ArrayList arrayList = new ArrayList(this.f57432b);
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append((String) arrayList.get(i));
            sb.append(",");
        }
        String sb2 = sb.toString();
        if (sb2.endsWith(",")) {
            sb2 = sb2.substring(0, sb2.length() - 1);
        }
        return sb2;
    }

    public final void a(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f57431a, false, 61944, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f57431a, false, 61944, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (this.f57433c == null) {
            this.f57433c = new ArrayList();
        }
        if (this.f57432b == null) {
            this.f57432b = new ArrayList();
        }
        String str2 = i + ":" + str;
        if (!this.f57433c.contains(str2)) {
            this.f57432b.add(str2);
            this.f57433c.add(str2);
        }
    }
}
