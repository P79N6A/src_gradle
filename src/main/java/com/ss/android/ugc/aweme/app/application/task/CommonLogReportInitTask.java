package com.ss.android.ugc.aweme.app.application.task;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.ae;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.statistic.a;
import com.ss.android.statistic.d;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import org.jetbrains.annotations.NotNull;

public class CommonLogReportInitTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;
    private a callback;

    public interface a {
        void a();
    }

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    private void doRealTask() {
        com.ss.android.statistic.a.C0392a aVar;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 23287, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 23287, new Class[0], Void.TYPE);
            return;
        }
        try {
            AppLog.setReportCrash(false);
            i a2 = i.a();
            com.ss.android.statistic.a.b bVar = new a.b();
            bVar.f31100a = "HEAD";
            bVar.f31101b = "70269d3c718";
            bVar.f31103d = a2.getChannel();
            if (com.ss.android.ugc.aweme.g.a.a()) {
                aVar = a.C0392a.DEBUG;
            } else {
                aVar = a.C0392a.RELEASE;
            }
            bVar.f31102c = aVar;
            bVar.f31104e = AppLog.getServerDeviceId();
            bVar.g = a2.getVersion();
            bVar.h = a2.getVersionCode();
            bVar.i = a2.getAid();
            com.ss.android.statistic.a aVar2 = new com.ss.android.statistic.a();
            if (!TextUtils.isEmpty(bVar.f31100a)) {
                aVar2.f2556a = bVar.f31100a;
            }
            if (!TextUtils.isEmpty(bVar.f31101b)) {
                aVar2.f2557b = bVar.f31101b;
            }
            if (bVar.f31102c != null) {
                aVar2.f2558c = bVar.f31102c;
            }
            if (!TextUtils.isEmpty(bVar.f31103d)) {
                aVar2.f2559d = bVar.f31103d;
            }
            if (!TextUtils.isEmpty(bVar.f31104e)) {
                aVar2.f2560e = bVar.f31104e;
            }
            if (!TextUtils.isEmpty(bVar.f31105f)) {
                aVar2.k = bVar.f31105f;
            }
            if (!TextUtils.isEmpty(bVar.g)) {
                aVar2.f2561f = bVar.g;
            }
            if (bVar.h != 0) {
                aVar2.g = bVar.h;
            }
            if (bVar.j == null) {
                bVar.j = ae.f28118b;
            }
            aVar2.i = bVar.j;
            aVar2.h = bVar.i;
            d.a().a((Application) k.a(), aVar2, ToolUtils.isMainProcess(k.a()));
            if (this.callback != null) {
                this.callback.a();
            }
        } catch (Exception unused) {
        }
    }

    public CommonLogReportInitTask(a aVar) {
        this.callback = aVar;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 23286, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 23286, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a("CommonLogReportInitTask");
        doRealTask();
    }
}
