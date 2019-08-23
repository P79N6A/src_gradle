package com.ss.android.ugc.aweme.feedback;

import a.i;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.z;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.utils.fd;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47174a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f47175b = "http://amfr.snssdk.com/file_report/upload";

    /* renamed from: c  reason: collision with root package name */
    private static final String f47176c = (b.e() + "/feedback_log");

    @Nullable
    public static String a() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], null, f47174a, true, 43791, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f47174a, true, 43791, new Class[0], String.class);
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long j = currentTimeMillis - 10800;
        if (PatchProxy.isSupport(new Object[]{new Long(j), new Long(currentTimeMillis)}, null, f47174a, true, 43792, new Class[]{Long.TYPE, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j), new Long(currentTimeMillis)}, null, f47174a, true, 43792, new Class[]{Long.TYPE, Long.TYPE}, String.class);
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71933, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71933, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            AbTestModel d2 = a2.d();
            if (d2 == null || !d2.isEnableALogUpload) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!z || ALog.sConfig == null || TextUtils.isEmpty(ALog.sConfig.f27862d)) {
            i iVar = new i(j, currentTimeMillis, "ame-log" + System.currentTimeMillis() + ".zip");
            i.a((Callable<TResult>) iVar, (Executor) i.f1051a);
            return String.format("http://tosv.byted.org/obj/toutiao-applog-files/%s/1/%s/%s", new Object[]{1128, z.a(), new File(f47176c + File.separator + r2).getName()});
        }
        i.a((Callable<TResult>) new h<TResult>(j, currentTimeMillis), (Executor) i.f1051a);
        return null;
    }

    static final /* synthetic */ Object a(long j, long j2, String str) throws Exception {
        ALog.flush();
        ALog.forceLogSharding();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException unused) {
        }
        List<String> aLogFiles = ALog.getALogFiles(j, j2);
        if (aLogFiles == null) {
            return null;
        }
        new File(f47176c).mkdirs();
        NetworkUtils.postFile(0, f47175b, "file", fd.a(f47176c, str, aLogFiles), null, null);
        new File(f47176c).delete();
        return null;
    }
}
