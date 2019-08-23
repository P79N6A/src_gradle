package com.ss.android.ugc.aweme.plugin.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.plugin.a.a;
import com.ss.android.ugc.aweme.plugin.a.b;
import com.ss.android.ugc.aweme.plugin.b.f;
import com.ss.android.ugc.aweme.plugin.d.e;
import com.ss.android.ugc.aweme.plugin.e.b;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONObject;

public final class b implements a.C0664a, b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59379a;

    /* renamed from: b  reason: collision with root package name */
    public Context f59380b;

    /* renamed from: c  reason: collision with root package name */
    public String f59381c;

    /* renamed from: d  reason: collision with root package name */
    public c f59382d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f59383e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f59384f;
    public boolean g;
    public boolean h;
    private String i;
    private IPluginService.a j;
    private com.ss.android.ugc.aweme.plugin.a.a k;
    private com.ss.android.ugc.aweme.plugin.a.b l;

    static class a implements IPluginService.a {
        public final void a(String str) {
        }

        public final void b(String str) {
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f59379a, false, 64692, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f59379a, false, 64692, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
        } else if (TextUtils.equals(str, this.i)) {
            if (z) {
                this.g = true;
                this.j.a(str);
                dismiss();
                return;
            }
            e(this.k.b(str));
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f59379a, false, 64695, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59379a, false, 64695, new Class[0], Void.TYPE);
            return;
        }
        if (this.f59382d != null && this.f59382d.isShowing()) {
            a();
            try {
                if (!(this.f59380b instanceof Activity)) {
                    this.f59382d.dismiss();
                } else if (a((Activity) this.f59380b)) {
                    this.f59382d.dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59379a, false, 64696, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59379a, false, 64696, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.b((a.C0664a) this);
        }
        if (this.l != null) {
            this.l.b(this);
        }
        if (!this.g && this.j != null) {
            this.j.b(this.i);
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f59379a, false, 64690, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59379a, false, 64690, new Class[0], Void.TYPE);
            return;
        }
        if (this.h) {
            this.f59382d = new c(this.f59380b);
            this.f59382d.setCancelable(true);
            this.f59382d.setIndeterminate(false);
            this.f59382d.setMax(100);
            this.f59382d.setMessage(this.f59380b.getString(C0906R.string.bnp));
            this.f59382d.setOnDismissListener(new DialogInterface.OnDismissListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f59385a;

                public final void onDismiss(DialogInterface dialogInterface) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f59385a, false, 64703, new Class[]{DialogInterface.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f59385a, false, 64703, new Class[]{DialogInterface.class}, Void.TYPE);
                        return;
                    }
                    b.this.a();
                }
            });
        }
        com.ss.android.ugc.aweme.plugin.e.b b2 = this.k.b(this.i);
        if (b2 == null) {
            this.f59384f = true;
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("reason", "user found api failed");
                if (!TextUtils.isEmpty(AppLog.getServerDeviceId())) {
                    hashMap.put("device_id", AppLog.getServerDeviceId());
                } else {
                    hashMap.put("device_id", "device_id_is_empty");
                }
                hashMap.put("check_type", this.f59381c);
            } catch (Exception unused) {
            }
            r.a("plugin_bug_track", (Map) hashMap);
            MonitorUtils.monitorStatusRate("plugin_dialog_show", 2, new JSONObject(hashMap));
        } else if (b2.f59320c.isFailed()) {
            this.k.a(b2.f59319b.f59324a);
            b2.g = b.a.Entrance;
            HashMap hashMap2 = new HashMap();
            try {
                hashMap2.put("reason", "click entrance failed retry");
                hashMap2.put("check_type", this.f59381c);
                hashMap2.put("package_name", b2.f59319b.f59324a);
                hashMap2.put("version", String.valueOf(b2.f59319b.f59325b));
            } catch (Exception unused2) {
            }
            r.a("plugin_bug_track", (Map) hashMap2);
            MonitorUtils.monitorStatusRate("plugin_dialog_show", 3, new JSONObject(hashMap2));
        } else if (b2.f59320c.isPaused()) {
            this.k.a(b2.f59319b.f59324a, false);
            HashMap hashMap3 = new HashMap();
            try {
                hashMap3.put("reason", "download is paused by status is " + b2.f59320c.toString());
                hashMap3.put("check_type", this.f59381c);
                hashMap3.put("package_name", b2.f59319b.f59324a);
                hashMap3.put("version", String.valueOf(b2.f59319b.f59325b));
            } catch (Exception unused3) {
            }
            r.a("plugin_bug_track", (Map) hashMap3);
            MonitorUtils.monitorStatusRate("plugin_dialog_show", 4, new JSONObject(hashMap3));
        } else if (!b2.f59320c.isSucceed()) {
            d(b2);
            HashMap hashMap4 = new HashMap();
            try {
                hashMap4.put("reason", "still downloading");
                hashMap4.put("check_type", this.f59381c);
                hashMap4.put("package_name", b2.f59319b.f59324a);
                hashMap4.put("version", String.valueOf(b2.f59319b.f59325b));
            } catch (Exception unused4) {
            }
            r.a("plugin_bug_track", (Map) hashMap4);
            MonitorUtils.monitorStatusRate("plugin_dialog_show", 5, new JSONObject(hashMap4));
        } else if (!com.ss.android.ugc.aweme.plugin.g.b.a(this.i)) {
            if (com.ss.android.ugc.aweme.plugin.g.b.b(this.i) == 3) {
                this.k.a(b2.f59319b.f59324a);
            } else {
                d(b2);
            }
            HashMap hashMap5 = new HashMap();
            try {
                hashMap5.put("reason", "success but not installed, maybe installed failed");
                hashMap5.put("check_type", this.f59381c);
                hashMap5.put("package_name", b2.f59319b.f59324a);
                hashMap5.put("version", String.valueOf(b2.f59319b.f59325b));
            } catch (Exception unused5) {
            }
            r.a("plugin_bug_track", (Map) hashMap5);
            MonitorUtils.monitorStatusRate("plugin_dialog_show", 6, new JSONObject(hashMap5));
        } else {
            this.g = true;
            this.j.a(this.i);
            a();
            dismiss();
            HashMap hashMap6 = new HashMap();
            try {
                hashMap6.put("reason", "success");
                hashMap6.put("check_type", this.f59381c);
                hashMap6.put("package_name", b2.f59319b.f59324a);
                hashMap6.put("version", String.valueOf(b2.f59319b.f59325b));
            } catch (Exception unused6) {
            }
            MonitorUtils.monitorStatusRate("plugin_dialog_show", 1, new JSONObject(hashMap6));
        }
    }

    private boolean a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f59379a, false, 64701, new Class[]{Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity}, this, f59379a, false, 64701, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        } else if (activity == null || activity.isFinishing() || (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed())) {
            return false;
        } else {
            return true;
        }
    }

    private int c(com.ss.android.ugc.aweme.plugin.e.b bVar) {
        int i2;
        com.ss.android.ugc.aweme.plugin.e.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f59379a, false, 64697, new Class[]{com.ss.android.ugc.aweme.plugin.e.b.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f59379a, false, 64697, new Class[]{com.ss.android.ugc.aweme.plugin.e.b.class}, Integer.TYPE)).intValue();
        }
        if (bVar2 == null || bVar2.f59323f <= 0 || bVar2.f59322e <= 0) {
            i2 = 0;
        } else if (bVar2.f59320c.isSucceed()) {
            i2 = 100;
        } else {
            i2 = (int) Math.ceil((double) ((((float) bVar2.f59323f) * 100.0f) / ((float) bVar2.f59322e)));
        }
        return Math.max(0, Math.min(i2, 100));
    }

    private void d(com.ss.android.ugc.aweme.plugin.e.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f59379a, false, 64698, new Class[]{com.ss.android.ugc.aweme.plugin.e.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f59379a, false, 64698, new Class[]{com.ss.android.ugc.aweme.plugin.e.b.class}, Void.TYPE);
            return;
        }
        if (this.h && this.f59380b != null) {
            this.f59382d.setMessage(this.f59380b.getString(C0906R.string.bnp));
            this.f59382d.setProgress(c(bVar));
        }
    }

    public final void b(com.ss.android.ugc.aweme.plugin.e.b bVar) {
        com.ss.android.ugc.aweme.plugin.e.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f59379a, false, 64694, new Class[]{com.ss.android.ugc.aweme.plugin.e.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f59379a, false, 64694, new Class[]{com.ss.android.ugc.aweme.plugin.e.b.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(bVar2.f59319b.f59324a, this.i)) {
            d(bVar);
        }
    }

    private static boolean a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, null, f59379a, true, 64702, new Class[]{Exception.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{exc2}, null, f59379a, true, 64702, new Class[]{Exception.class}, Boolean.TYPE)).booleanValue();
        } else if (exc2 == null || !(exc2 instanceof SSLHandshakeException)) {
            return false;
        } else {
            try {
                if (exc.getMessage().indexOf("compared to") > 0) {
                    return true;
                }
                return false;
            } catch (Throwable unused) {
            }
        }
    }

    private void e(com.ss.android.ugc.aweme.plugin.e.b bVar) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f59379a, false, 64699, new Class[]{com.ss.android.ugc.aweme.plugin.e.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f59379a, false, 64699, new Class[]{com.ss.android.ugc.aweme.plugin.e.b.class}, Void.TYPE);
        } else if (this.h) {
            if (bVar != null) {
                if (bVar.f59320c.isPaused()) {
                    i2 = C0906R.string.bnr;
                } else if (bVar.f59320c.isInSufficientStorage()) {
                    i2 = C0906R.string.bnm;
                } else if (a(bVar.k)) {
                    i2 = C0906R.string.bns;
                } else {
                    int i3 = bVar.j;
                }
                UIUtils.displayToast(this.f59380b, i2);
                a();
                dismiss();
                HashMap hashMap = new HashMap();
                hashMap.put("message", this.f59380b.getResources().getString(i2));
                hashMap.put("check_type", this.f59381c);
                r.a("plugin_toast_show", (Map) hashMap);
                MonitorUtils.monitorStatusRate("plugin_toast_show", 3, new JSONObject(hashMap));
            }
            i2 = C0906R.string.bno;
            UIUtils.displayToast(this.f59380b, i2);
            a();
            dismiss();
            try {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("message", this.f59380b.getResources().getString(i2));
                hashMap2.put("check_type", this.f59381c);
                r.a("plugin_toast_show", (Map) hashMap2);
                MonitorUtils.monitorStatusRate("plugin_toast_show", 3, new JSONObject(hashMap2));
            } catch (Exception unused) {
            }
        }
    }

    public void a(Dialog dialog) {
        if (PatchProxy.isSupport(new Object[]{dialog}, this, f59379a, false, 64700, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialog}, this, f59379a, false, 64700, new Class[]{Dialog.class}, Void.TYPE);
            return;
        }
        if (dialog != null) {
            try {
                if (!(this.f59380b instanceof Activity) || a((Activity) this.f59380b)) {
                    dialog.show();
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.plugin.e.b bVar) {
        com.ss.android.ugc.aweme.plugin.e.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f59379a, false, 64693, new Class[]{com.ss.android.ugc.aweme.plugin.e.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f59379a, false, 64693, new Class[]{com.ss.android.ugc.aweme.plugin.e.b.class}, Void.TYPE);
        } else if (TextUtils.equals(bVar2.f59319b.f59324a, this.i)) {
            b.C0667b bVar3 = bVar2.f59320c;
            if (bVar3.isSucceed() || (!bVar3.isFailed() && !bVar3.isPaused() && !bVar3.isCanceled())) {
                d(bVar);
            } else {
                e(bVar);
            }
        }
    }

    public b(Context context, String str, String str2, boolean z, IPluginService.a aVar) {
        this.f59380b = context;
        this.f59381c = str;
        this.i = str2;
        this.h = z;
        this.j = aVar == null ? new a((byte) 0) : aVar;
        if (PatchProxy.isSupport(new Object[0], this, f59379a, false, 64689, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59379a, false, 64689, new Class[0], Void.TYPE);
            return;
        }
        if (this.f59380b != null) {
            if (!this.h || NetworkUtils.isNetworkAvailable(this.f59380b)) {
                this.k = f.a(this.f59380b);
                this.l = e.a();
                this.k.a((a.C0664a) this);
                this.l.a(this);
                b();
            } else {
                this.f59383e = true;
            }
        }
    }
}
