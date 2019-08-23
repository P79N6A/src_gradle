package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.livewallpaper.c.d;

public final class u implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34615a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34616b;

    /* renamed from: c  reason: collision with root package name */
    private Keva f34617c = Keva.getRepoFromSp(this.f34616b, "LiveWallPaper", 0);

    public u(Context context) {
        this.f34616b = context;
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34615a, false, 24235, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34615a, false, 24235, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f34617c.storeString("live_wall_paper_list", str2);
    }

    public final void d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34615a, false, 24237, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34615a, false, 24237, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f34617c.storeString("current_video_path", str2);
    }

    public final void f(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34615a, false, 24243, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34615a, false, 24243, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f34617c.storeString("source", str2);
    }

    public final int a(int i) {
        if (!PatchProxy.isSupport(new Object[]{0}, this, f34615a, false, 24238, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f34617c.getInt("current_video_width", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{0}, this, f34615a, false, 24238, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34615a, false, 24239, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34615a, false, 24239, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f34617c.storeInt("current_video_width", i);
    }

    public final int c(int i) {
        if (!PatchProxy.isSupport(new Object[]{0}, this, f34615a, false, 24240, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f34617c.getInt("current_video_height", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{0}, this, f34615a, false, 24240, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final void d(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34615a, false, 24241, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34615a, false, 24241, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f34617c.storeInt("current_video_height", i);
    }

    public final String e(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34615a, false, 24242, new Class[]{String.class}, String.class)) {
            return this.f34617c.getString("source", str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34615a, false, 24242, new Class[]{String.class}, String.class);
    }

    public final String a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34615a, false, 24234, new Class[]{String.class}, String.class)) {
            return this.f34617c.getString("live_wall_paper_list", str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34615a, false, 24234, new Class[]{String.class}, String.class);
    }

    public final String c(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34615a, false, 24236, new Class[]{String.class}, String.class)) {
            return this.f34617c.getString("current_video_path", str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34615a, false, 24236, new Class[]{String.class}, String.class);
    }
}
