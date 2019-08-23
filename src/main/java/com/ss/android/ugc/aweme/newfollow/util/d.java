package com.ss.android.ugc.aweme.newfollow.util;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newfollow.g.a;
import com.ss.android.ugc.aweme.utils.bo;
import com.ss.android.ugc.aweme.video.o;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57410a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f57411b;

    /* renamed from: c  reason: collision with root package name */
    public int f57412c;

    /* renamed from: d  reason: collision with root package name */
    public bo f57413d = new bo(1);

    /* renamed from: e  reason: collision with root package name */
    public int f57414e;

    /* renamed from: f  reason: collision with root package name */
    public int f57415f;
    public long g = -1;
    public boolean h;
    public o i;
    public String j;
    public boolean k = false;
    private long l = -1;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57410a, false, 61891, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57410a, false, 61891, new Class[0], Void.TYPE);
            return;
        }
        if (this.g == -1) {
            this.g = System.currentTimeMillis();
        }
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f57410a, false, 61890, new Class[0], Integer.TYPE)) {
            return this.j.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f57410a, false, 61890, new Class[0], Integer.TYPE)).intValue();
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f57410a, false, 61896, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f57410a, false, 61896, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.l != -1) {
            a.a(this.f57411b, System.currentTimeMillis() - this.l, str);
            this.l = -1;
        }
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f57410a, false, 61889, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f57410a, false, 61889, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj || ((obj instanceof d) && this.j.equals(((d) obj).j))) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f57410a, false, 61895, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f57410a, false, 61895, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.l == -1) {
            this.l = System.currentTimeMillis();
            a.a(this.f57411b, str);
        }
    }

    public static String a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f57410a, true, 61887, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f57410a, true, 61887, new Class[]{String.class, String.class}, String.class);
        }
        return str3 + "_" + str4;
    }

    public d(@NonNull Aweme aweme, bo boVar, String str) {
        this.f57411b = aweme;
        this.f57413d = boVar;
        this.j = str;
    }

    public final void a(boolean z, String str, String str2, String str3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str, str2, str3}, this, f57410a, false, 61894, new Class[]{Boolean.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str, str2, str3}, this, f57410a, false, 61894, new Class[]{Boolean.TYPE, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (this.g != -1) {
            a.a(this.f57411b, System.currentTimeMillis() - this.g, z, str, str2, str3);
            this.g = -1;
        }
    }

    public final void a(String str, String str2, String str3, boolean z, String str4) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, Byte.valueOf(z ? (byte) 1 : 0), str4}, this, f57410a, false, 61897, new Class[]{String.class, String.class, String.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str3, Byte.valueOf(z), str4}, this, f57410a, false, 61897, new Class[]{String.class, String.class, String.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (!this.h) {
            this.h = true;
            a.a(this.f57411b, str, str2, str3, z, str4);
        }
    }
}
