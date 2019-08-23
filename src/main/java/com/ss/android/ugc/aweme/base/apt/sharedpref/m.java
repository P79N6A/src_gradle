package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.b.a;
import com.ss.android.ugc.aweme.q.c;

public final class m implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34592a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34593b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34594c = c.a(this.f34593b, "ShowDiscoveryGuide", 0);

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34592a, false, 24203, new Class[0], Integer.TYPE)) {
            return this.f34594c.getInt("normalWordShowTimes", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f34592a, false, 24203, new Class[0], Integer.TYPE)).intValue();
    }

    public final long b() {
        if (!PatchProxy.isSupport(new Object[0], this, f34592a, false, 24205, new Class[0], Long.TYPE)) {
            return this.f34594c.getLong("lastNormalShowTime", 0);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f34592a, false, 24205, new Class[0], Long.TYPE)).longValue();
    }

    public final int c() {
        if (!PatchProxy.isSupport(new Object[0], this, f34592a, false, 24207, new Class[0], Integer.TYPE)) {
            return this.f34594c.getInt("operationWordShowTimes", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f34592a, false, 24207, new Class[0], Integer.TYPE)).intValue();
    }

    public final String d() {
        if (!PatchProxy.isSupport(new Object[0], this, f34592a, false, 24212, new Class[0], String.class)) {
            return this.f34594c.getString("lastShowOperationWord", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f34592a, false, 24212, new Class[0], String.class);
    }

    public m(Context context) {
        this.f34593b = context;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34592a, false, 24204, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34592a, false, 24204, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34594c.edit();
        edit.putInt("normalWordShowTimes", i);
        edit.apply();
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34592a, false, 24208, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34592a, false, 24208, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34594c.edit();
        edit.putInt("operationWordShowTimes", i);
        edit.apply();
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f34592a, false, 24206, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f34592a, false, 24206, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34594c.edit();
        edit.putLong("lastNormalShowTime", j2);
        edit.apply();
    }

    public final void b(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f34592a, false, 24210, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f34592a, false, 24210, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34594c.edit();
        edit.putLong("lastOperationShowTime", j2);
        edit.apply();
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34592a, false, 24211, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34592a, false, 24211, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34594c.edit();
        edit.putString("lastShowOperationWord", str2);
        edit.apply();
    }
}
