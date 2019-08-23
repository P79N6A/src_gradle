package com.ss.android.ugc.aweme.cloudcontrol.a;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.monitor.cloudmessage.callback.c;
import com.monitor.cloudmessage.entity.ConsumerResult;
import com.ss.android.agilelogger.ALog;
import java.util.List;
import org.json.JSONObject;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36213a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f36214b;

    @NonNull
    public final ConsumerResult b() {
        String str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f36213a, false, 27039, new Class[0], ConsumerResult.class)) {
            return (ConsumerResult) PatchProxy.accessDispatch(new Object[0], this, f36213a, false, 27039, new Class[0], ConsumerResult.class);
        }
        if (this.f36214b != null && this.f36214b.size() > 0) {
            z = true;
        }
        if (z) {
            str = "";
        } else {
            str = "alog file not get";
        }
        return ConsumerResult.build(z, str, null);
    }

    public final List<String> a(long j, long j2, JSONObject jSONObject) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), jSONObject}, this, f36213a, false, 27038, new Class[]{Long.TYPE, Long.TYPE, JSONObject.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), jSONObject}, this, f36213a, false, 27038, new Class[]{Long.TYPE, Long.TYPE, JSONObject.class}, List.class);
        }
        if (j3 < j4) {
            ALog.flush();
            ALog.forceLogSharding();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException unused) {
            }
            this.f36214b = ALog.getALogFiles(j, j2);
        }
        return this.f36214b;
    }
}
