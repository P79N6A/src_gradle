package com.ss.android.ugc.aweme.shortvideo.upload;

import com.google.common.a.q;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.aweme.shortvideo.gq;
import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public final class n implements k<SynthetiseResult> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71026a;

    /* renamed from: b  reason: collision with root package name */
    private File f71027b;

    /* renamed from: c  reason: collision with root package name */
    private long f71028c;

    /* renamed from: d  reason: collision with root package name */
    private q f71029d = q.b();

    /* renamed from: e  reason: collision with root package name */
    private boolean f71030e;

    public final void onFailure(Throwable th) {
        int i;
        SynthetiseResult synthetiseResult;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f71026a, false, 80788, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f71026a, false, 80788, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (th2 instanceof gq) {
            gq gqVar = (gq) th2;
            i = gqVar.getCode();
            synthetiseResult = gqVar.getResult();
            String synthetiseResult2 = synthetiseResult.toString();
            if (PatchProxy.isSupport(new Object[]{synthetiseResult2}, null, f71026a, true, 80789, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{synthetiseResult2}, null, f71026a, true, 80789, new Class[]{String.class}, Void.TYPE);
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("fileInfo", synthetiseResult2);
                } catch (JSONException unused) {
                }
                com.ss.android.ugc.aweme.base.n.b("aweme_movie_publish_log", "synthesis_error", jSONObject);
            }
        } else {
            synthetiseResult = null;
            i = 10038;
        }
        JSONObject b2 = bi.a(synthetiseResult).a("exception", com.facebook.common.internal.k.c(th)).a("event", o.a().b().toString()).b();
        if (this.f71030e) {
            com.ss.android.ugc.aweme.base.n.a("aweme_mv_edit_error_rate", i, b2);
        }
        com.ss.android.ugc.aweme.base.n.a("aweme_synthesis_error_rate_parallel", i, b2);
    }

    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
        SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
        if (PatchProxy.isSupport(new Object[]{synthetiseResult}, this, f71026a, false, 80787, new Class[]{SynthetiseResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{synthetiseResult}, this, f71026a, false, 80787, new Class[]{SynthetiseResult.class}, Void.TYPE);
            return;
        }
        bi a2 = bi.a();
        if (this.f71027b.exists()) {
            long a3 = this.f71029d.a(TimeUnit.MILLISECONDS);
            a2.a("speed", Float.valueOf(((float) this.f71028c) / ((float) a3))).a("duration", Long.valueOf(a3));
        }
        if (synthetiseResult != null) {
            a2.a("is_fast_import", Boolean.valueOf(synthetiseResult.isFastImport)).a("support_max_resolution", synthetiseResult.fastImportResolution).a("is_new_framework", Boolean.valueOf(synthetiseResult.isNewFramework));
        }
        JSONObject b2 = a2.b();
        if (this.f71030e) {
            com.ss.android.ugc.aweme.base.n.a("aweme_mv_edit_error_rate", 0, b2);
        }
        com.ss.android.ugc.aweme.base.n.a("aweme_synthesis_error_rate_parallel", 0, b2);
    }

    public n(String str, long j, boolean z) {
        this.f71027b = new File(str);
        this.f71028c = j;
        this.f71030e = z;
    }
}
