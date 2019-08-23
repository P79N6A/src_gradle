package com.ss.android.ugc.aweme.legoImp.service;

import android.content.Context;
import android.os.Build;
import android.os.FileObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.app.e;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.lego.LegoService;
import com.ss.android.ugc.aweme.lego.f;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

public class AOTOptimizeService implements LegoService {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static int triggerAOTCount;
    public a profileListener;

    class a extends FileObserver {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53108a;

        /* renamed from: b  reason: collision with root package name */
        Context f53109b;

        public final void onEvent(int i, String str) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f53108a, false, 55212, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f53108a, false, 55212, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            if (i == 2) {
                if (AOTOptimizeService.this.profileListener == null || AOTOptimizeService.triggerAOTCount < 2) {
                    AOTOptimizeService.this.execOptCommand(this.f53109b);
                } else {
                    AOTOptimizeService.this.profileListener.stopWatching();
                    AOTOptimizeService.this.profileListener = null;
                    AOTOptimizeService.this.updateReleaseVersion();
                }
            }
        }

        a(Context context, String str) {
            super(str);
            this.f53109b = context;
        }
    }

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    private boolean isDoOptimizeEnabled() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55209, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55209, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (Build.VERSION.SDK_INT >= 24 && releaseVersionChange() && triggerAOTCount < 2) {
            return true;
        } else {
            return false;
        }
    }

    private boolean releaseVersionChange() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55207, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55207, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Context context = i.a().getContext();
        if (!b.b().a(context, "aot_release_build_version").equals(e.a(context).a("release_build", ""))) {
            z = true;
        }
        return z;
    }

    public void updateReleaseVersion() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55208, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55208, new Class[0], Void.TYPE);
            return;
        }
        Context context = i.a().getContext();
        b.b().a(context, "aot_release_build_version", e.a(context).a("release_build", ""));
    }

    public void init(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55205, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55205, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        startWatchingForOptimize(context);
    }

    private void execCommand(String str) throws IOException {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 55211, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 55211, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Process exec = Runtime.getRuntime().exec(str2);
        try {
            exec.waitFor();
            exec.exitValue();
        } catch (InterruptedException unused) {
            System.err.println("execCommand InterruptedException");
        }
    }

    private void startWatchingForOptimize(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55206, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55206, new Class[]{Context.class}, Void.TYPE);
        } else if (isDoOptimizeEnabled()) {
            com.ss.android.ugc.aweme.framework.a.a.a("startWatchingForOptimize");
            if (this.profileListener == null) {
                this.profileListener = new a(context, String.format("%s/%s/%s", new Object[]{"/data/misc/profiles/cur/0", context.getPackageName(), "primary.prof"}));
            }
            this.profileListener.startWatching();
        }
    }

    public void execOptCommand(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55210, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55210, new Class[]{Context.class}, Void.TYPE);
        } else if (isDoOptimizeEnabled()) {
            try {
                try {
                    execCommand("cmd package compile -m speed-profile -f " + context.getPackageName());
                    triggerAOTCount++;
                } catch (IOException unused) {
                    System.err.println("execOptCommand IOException");
                }
            } catch (IOException unused2) {
                System.err.println("execOptCommand IOException");
            }
        }
    }
}
