package com.ss.android.ugc.aweme.video;

import a.i;
import android.content.Context;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.io.IOUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.language.e;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.requestcombine.b;
import com.ss.android.ugc.aweme.requestcombine.model.RateSettingCombineModel;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.r;
import com.ss.android.ugc.aweme.video.api.BitRateSettingsApi;
import com.ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

public final class VideoBitRateABManager implements b, r.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75999a;

    /* renamed from: e  reason: collision with root package name */
    private static final VideoBitRateABManager f76000e = new VideoBitRateABManager();

    /* renamed from: b  reason: collision with root package name */
    public RateSettingsResponse f76001b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f76002c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f76003d;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f76004f;

    class RequestConfigTask implements LegoTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        @NotNull
        public f type() {
            return f.BOOT_FINISH;
        }

        private RequestConfigTask() {
        }

        public void run(@NotNull Context context) {
            if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 89056, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 89056, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            a.a("RequestConfigTask");
            synchronized (VideoBitRateABManager.this) {
                if (!VideoBitRateABManager.this.f76003d) {
                    try {
                        VideoBitRateABManager.this.a(BitRateSettingsApi.a());
                    } catch (Exception e2) {
                        a.a(e2);
                    }
                }
            }
        }
    }

    public static VideoBitRateABManager a() {
        return f76000e;
    }

    private VideoBitRateABManager() {
        r.a().a(r.f64010c, (r.a) this);
        if (AbTestManager.a().aa()) {
            i.a((Callable<TResult>) new x<TResult>(this));
        }
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f75999a, false, 89046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75999a, false, 89046, new Class[0], Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.requestcombine.a.f63567e.a() || com.ss.android.ugc.aweme.requestcombine.a.f63567e.a("/aweme/v1/rate/settings/") == null) {
            g();
        } else {
            f();
        }
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f75999a, false, 89049, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75999a, false, 89049, new Class[0], Void.TYPE);
            return;
        }
        a(((RateSettingCombineModel) com.ss.android.ugc.aweme.requestcombine.a.f63567e.a("/aweme/v1/rate/settings/")).getRateSetting());
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f75999a, false, 89051, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75999a, false, 89051, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.lego.a.i.a().a(new RequestConfigTask()).a();
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f75999a, false, 89054, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f75999a, false, 89054, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (AbTestManager.a().aa() && this.f76002c) {
            z = true;
        }
        return z;
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f75999a, false, 89047, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75999a, false, 89047, new Class[0], Void.TYPE);
            return;
        }
        e();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f75999a, false, 89052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75999a, false, 89052, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f75999a, false, 89045, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75999a, false, 89045, new Class[0], Void.TYPE);
            return;
        }
        boolean aa = AbTestManager.a().aa();
        if (this.f76004f == null || aa != this.f76004f.booleanValue()) {
            this.f76004f = Boolean.valueOf(aa);
            if (aa) {
                e();
            }
            return;
        }
        if (aa && !this.f76003d) {
            e();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object d() throws Exception {
        String str;
        String str2;
        String str3;
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f75999a, false, 89043, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75999a, false, 89043, new Class[0], Void.TYPE);
        } else {
            try {
                str = c.a(d.a(), "bitrate_manager_sp_rate_setting", 0).getString("bitrate_manager_sp_rate_setting", null);
                if (str == null) {
                    try {
                        if (com.ss.android.g.a.b()) {
                            if (PatchProxy.isSupport(new Object[0], null, e.f53002a, true, 55064, new Class[0], Boolean.TYPE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, e.f53002a, true, 55064, new Class[0], Boolean.TYPE)).booleanValue();
                            } else {
                                z = "IN".equalsIgnoreCase(e.b());
                            }
                            if (!z) {
                                str3 = "us";
                                str2 = a(d.a(), "rate_settings/" + str3 + ".json");
                            }
                        }
                        str3 = e.b().toLowerCase();
                        str2 = a(d.a(), "rate_settings/" + str3 + ".json");
                    } catch (Throwable th) {
                        th = th;
                        ExceptionMonitor.ensureNotReachHere(th, str);
                        com.ss.android.ugc.aweme.requestcombine.a.f63567e.a((b) this);
                        return null;
                    }
                } else {
                    str2 = str;
                }
                try {
                    b((RateSettingsResponse) new Gson().fromJson(str2, RateSettingsResponse.class));
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    str = str2;
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                str = null;
                ExceptionMonitor.ensureNotReachHere(th, str);
                com.ss.android.ugc.aweme.requestcombine.a.f63567e.a((b) this);
                return null;
            }
            com.ss.android.ugc.aweme.requestcombine.a.f63567e.a((b) this);
        }
        return null;
    }

    public final void a(@NotNull Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f75999a, false, 89048, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f75999a, false, 89048, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        g();
    }

    private void b(RateSettingsResponse rateSettingsResponse) {
        if (PatchProxy.isSupport(new Object[]{rateSettingsResponse}, this, f75999a, false, 89044, new Class[]{RateSettingsResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rateSettingsResponse}, this, f75999a, false, 89044, new Class[]{RateSettingsResponse.class}, Void.TYPE);
        } else if (rateSettingsResponse != null && rateSettingsResponse.isValid()) {
            try {
                synchronized (this) {
                    this.f76001b = rateSettingsResponse;
                    c.a(d.a(), "bitrate_manager_sp_rate_setting", 0).edit().putString("bitrate_manager_sp_rate_setting", new Gson().toJson((Object) rateSettingsResponse)).apply();
                }
                this.f76002c = true;
            } catch (Exception unused) {
            }
        }
    }

    public final void a(RateSettingsResponse rateSettingsResponse) {
        if (PatchProxy.isSupport(new Object[]{rateSettingsResponse}, this, f75999a, false, 89050, new Class[]{RateSettingsResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rateSettingsResponse}, this, f75999a, false, 89050, new Class[]{RateSettingsResponse.class}, Void.TYPE);
            return;
        }
        if (rateSettingsResponse != null) {
            try {
                if (rateSettingsResponse.isValid()) {
                    b(rateSettingsResponse);
                    try {
                        this.f76003d = true;
                        r.a().a(r.f64010c, true);
                        return;
                    } catch (Exception e2) {
                        e = e2;
                        a.a(e);
                        return;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                a.a(e);
                return;
            }
        }
        r.a().a(r.f64010c, false);
    }

    private static String a(Context context, String str) {
        InputStream inputStream;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f75999a, true, 89042, new Class[]{Context.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f75999a, true, 89042, new Class[]{Context.class, String.class}, String.class);
        }
        try {
            inputStream = context.getAssets().open(str2);
            try {
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                String str3 = new String(bArr, "UTF-8");
                IOUtils.close((Closeable) inputStream);
                return str3;
            } catch (IOException unused) {
                IOUtils.close((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                IOUtils.close((Closeable) inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            IOUtils.close((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            IOUtils.close((Closeable) inputStream);
            throw th;
        }
    }
}
