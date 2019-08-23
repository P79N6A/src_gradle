package com.ss.android.newmedia;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.image.b;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import org.jetbrains.annotations.NotNull;

public abstract class BaseMainHelper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30089a;
    private static boolean j;

    /* renamed from: b  reason: collision with root package name */
    protected Activity f30090b;

    /* renamed from: c  reason: collision with root package name */
    protected NotificationManager f30091c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f30092d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f30093e;

    /* renamed from: f  reason: collision with root package name */
    protected BaseAppData f30094f;
    protected boolean g;
    protected final Handler h = new Handler();
    protected long i = 0;

    /* renamed from: com.ss.android.newmedia.BaseMainHelper$1  reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30095a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseMainHelper f30096b;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f30095a, false, 18379, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f30095a, false, 18379, new Class[0], Void.TYPE);
                return;
            }
            BaseMainHelper baseMainHelper = this.f30096b;
            if (PatchProxy.isSupport(new Object[0], baseMainHelper, BaseMainHelper.f30089a, false, 18372, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], baseMainHelper, BaseMainHelper.f30089a, false, 18372, new Class[0], Void.TYPE);
            } else {
                AppLog.onQuit();
            }
            this.f30096b.g();
            int myPid = Process.myPid();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(myPid)}, null, h.f30208a, true, 18380, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(myPid)}, null, h.f30208a, true, 18380, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            String str = a.b().f3304b;
            if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                Process.killProcess(myPid);
                return;
            }
            throw new RuntimeException("Process killed, pid is " + myPid);
        }
    }

    class ClearCacheTask implements LegoTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        @NotNull
        public f type() {
            return f.BOOT_FINISH;
        }

        private ClearCacheTask() {
        }

        public void run(@NotNull Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 18382, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 18382, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.framework.a.a.a("ClearCacheTask");
            new b(context2).c();
        }

        /* synthetic */ ClearCacheTask(BaseMainHelper baseMainHelper, AnonymousClass1 r2) {
            this();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f30089a, false, 18369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30089a, false, 18369, new Class[0], Void.TYPE);
        } else if (!this.f30092d && !this.f30093e) {
            b();
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f30089a, false, 18370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30089a, false, 18370, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.lego.a.i.a().a(new ClearCacheTask(this, null)).a();
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f30089a, false, 18371, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30089a, false, 18371, new Class[0], Void.TYPE);
        } else if (this.f30090b != null) {
            this.f30094f.g();
            try {
                CookieSyncManager.getInstance().sync();
            } catch (Throwable unused) {
            }
        }
    }

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f30089a, false, 18377, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30089a, false, 18377, new Class[0], Void.TYPE);
            return;
        }
        c();
        this.f30094f.f(this.f30090b);
        this.g = true;
        this.f30090b.finish();
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f30089a, false, 18378, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30089a, false, 18378, new Class[0], Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("com.ss.android.newmedia.killApplication");
        this.f30090b.sendBroadcast(intent);
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f30089a, false, 18376, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30089a, false, 18376, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (j) {
            f();
            return true;
        } else if (System.currentTimeMillis() - this.i <= 2000) {
            f();
            this.i = 0;
            return true;
        } else {
            this.i = System.currentTimeMillis();
            if (this.f30090b != null) {
                UIUtils.displayToast((Context) this.f30090b, (int) C0906R.string.ks, 48);
            }
            return false;
        }
    }

    public boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f30089a, false, 18374, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30089a, false, 18374, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f30089a, false, 18375, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f30089a, false, 18375, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        a.C0185a aVar = new a.C0185a(this.f30090b);
        aVar.b((int) C0906R.string.b19);
        aVar.a((int) C0906R.string.clc);
        aVar.a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f30097a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f30097a, false, 18381, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f30097a, false, 18381, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                BaseMainHelper.this.f();
            }
        });
        aVar.b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null);
        aVar.a().a();
        return false;
    }

    public BaseMainHelper(Activity activity) {
        this.f30090b = activity;
        this.f30091c = (NotificationManager) activity.getSystemService("notification");
        this.f30094f = BaseAppData.a();
        this.f30092d = false;
        this.f30093e = false;
    }
}
