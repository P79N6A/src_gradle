package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.ndk.CrashlyticsNdk;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.analysis.d;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.common.h.b;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FabricInitTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    @MeasureFunction
    private void initCustomConfig() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55257, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55257, new Class[0], Void.TYPE);
            return;
        }
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        Crashlytics.setString("git_sha", "70269d3c718");
        Crashlytics.setString("git_branch", "HEAD");
        Crashlytics.setString("process", ToolUtils.getCurProcessName(k.a()));
        Crashlytics.setString("ABI", System.getProperty("os.arch"));
        Crashlytics.setString("veSdk", iAVService.getVESDKVersion());
        Crashlytics.setString("effectSdk", iAVService.getEffectSDKVersion());
        try {
            Crashlytics.setString("device_id", AppLog.getServerDeviceId());
            Crashlytics.setString("channel", i.a().getChannel());
        } catch (Exception unused) {
        }
        if (c.d().isLogin()) {
            Crashlytics.setUserIdentifier(c.d().getCurUserId());
            Crashlytics.setUserName(c.d().getCurUser().getNickname());
        }
        Crashlytics.setUserEmail("");
    }

    @MeasureFunction
    private void initFabric(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 55256, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 55256, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Crashlytics.Builder builder = new Crashlytics.Builder();
        builder.answers(new Answers()).beta(new Beta());
        builder.disabled(a.a());
        try {
            io.fabric.sdk.android.c.a(context2, builder.build(), new CrashlyticsNdk());
            initCrashlyticsWrapper(context);
        } catch (Throwable unused) {
        }
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55255, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55255, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (b.a()) {
            initFabric(context);
            initCustomConfig();
            com.ss.android.ugc.aweme.framework.a.a.a("FabricInitTask");
        }
    }

    private void initCrashlyticsWrapper(Context context) {
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55258, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55258, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71937, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71937, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            AbTestModel d2 = a2.d();
            if (d2 == null || d2.isEnableFabric) {
                z = true;
            } else {
                z = false;
            }
        }
        arrayList.add(new d(z));
        AbTestManager a3 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a3, AbTestManager.f63777a, false, 71932, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a3, AbTestManager.f63777a, false, 71932, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            AbTestModel d3 = a3.d();
            if (d3 == null || !d3.isEnableALog) {
                z2 = false;
            }
        }
        arrayList.add(new com.ss.android.ugc.aweme.analysis.a(z2));
        com.ss.android.ugc.aweme.framework.a.a.a(context.getApplicationContext(), (List<com.ss.android.ugc.aweme.framework.a.b>) arrayList);
    }
}
