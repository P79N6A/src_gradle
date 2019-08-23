package com.ss.android.ugc.aweme.app.application.initialization;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.a.a.a;
import com.ss.android.ugc.a.d;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.a.f;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import okhttp3.Call;
import okhttp3.OkHttpClient;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33955a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33956b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.a.b.c f33957c;

    c(String str, com.ss.android.ugc.a.b.c cVar) {
        this.f33956b = str;
        this.f33957c = cVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f33955a, false, 23260, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33955a, false, 23260, new Class[0], Void.TYPE);
            return;
        }
        String str = this.f33956b;
        com.ss.android.ugc.a.b.c cVar = this.f33957c;
        a.a();
        d a2 = d.a();
        if (!d.a(str)) {
            cVar.onError(com.ss.android.ugc.a.c.a().a(2));
            return;
        }
        if (a2.f31523c == null) {
            a2.f31523c = new f(d.f31521a, a2.f31522b, a.a(d.f31521a));
        }
        f fVar = a2.f31523c;
        OkHttpClient okHttpClient = fVar.f31538a;
        if (okHttpClient != null && !TextUtils.isEmpty(str)) {
            Iterator<Call> it2 = okHttpClient.dispatcher().queuedCalls().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Call next = it2.next();
                if (str.equals(next.request().tag()) && !next.isCanceled()) {
                    next.cancel();
                    break;
                }
            }
            Iterator<Call> it3 = okHttpClient.dispatcher().runningCalls().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Call next2 = it3.next();
                if (str.equals(next2.request().tag()) && !next2.isCanceled()) {
                    next2.cancel();
                    break;
                }
            }
        }
        if (fVar.f31540c != null) {
            List a3 = fVar.f31540c.a(PushConstants.WEB_URL, str);
            if (a3.size() > 0) {
                e eVar = (e) a3.get(0);
                if (eVar.f31528c != null) {
                    fVar.f31539b = eVar;
                    new File(fVar.f31539b.f31528c).delete();
                }
            }
            fVar.f31540c.b(PushConstants.WEB_URL, str);
            cVar.onCancel();
        }
    }
}
