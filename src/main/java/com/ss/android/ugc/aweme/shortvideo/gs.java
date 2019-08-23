package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public final class gs implements k<SynthetiseResult> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67957a;

    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
        SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
        if (PatchProxy.isSupport(new Object[]{synthetiseResult}, this, f67957a, false, 74756, new Class[]{SynthetiseResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{synthetiseResult}, this, f67957a, false, 74756, new Class[]{SynthetiseResult.class}, Void.TYPE);
            return;
        }
        n.a("aweme_synthesis_error_rate_vesdk", 0, bi.a(synthetiseResult).b());
    }

    public final void onFailure(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f67957a, false, 74757, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f67957a, false, 74757, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        int i = 10038;
        SynthetiseResult synthetiseResult = null;
        if (th2 instanceof gq) {
            gq gqVar = (gq) th2;
            int code = gqVar.getCode();
            SynthetiseResult result = gqVar.getResult();
            String synthetiseResult2 = result.toString();
            if (PatchProxy.isSupport(new Object[]{synthetiseResult2}, null, f67957a, true, 74758, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{synthetiseResult2}, null, f67957a, true, 74758, new Class[]{String.class}, Void.TYPE);
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("fileInfo", synthetiseResult2);
                } catch (JSONException unused) {
                }
                n.b("aweme_movie_publish_log", "synthesis_error", jSONObject);
            }
            int i2 = code;
            synthetiseResult = result;
            i = i2;
        }
        n.a("aweme_synthesis_error_rate_vesdk", i, bi.a(synthetiseResult).a("exception", com.facebook.common.internal.k.c(th)).b());
    }
}
