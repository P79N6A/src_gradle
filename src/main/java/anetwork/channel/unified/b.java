package anetwork.channel.unified;

import android.text.TextUtils;
import anet.channel.RequestCb;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.util.StringUtils;
import anetwork.channel.cookie.CookieManager;

public class b implements IUnifiedTask {

    /* renamed from: a  reason: collision with root package name */
    volatile Cancelable f1557a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f1558b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public j f1559c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f1560d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f1561e;

    /* renamed from: f  reason: collision with root package name */
    private Request f1562f;

    public void cancel() {
        this.f1558b = true;
        if (this.f1557a != null) {
            this.f1557a.cancel();
        }
    }

    public void run() {
        if (!this.f1558b) {
            if (this.f1559c.f1591a.i()) {
                String cookie = CookieManager.getCookie(this.f1559c.f1591a.g());
                if (!TextUtils.isEmpty(cookie)) {
                    Request.Builder newBuilder = this.f1562f.newBuilder();
                    String str = this.f1562f.getHeaders().get("Cookie");
                    if (!TextUtils.isEmpty(str)) {
                        cookie = StringUtils.concatString(str, "; ", cookie);
                    }
                    newBuilder.addHeader("Cookie", cookie);
                    this.f1562f = newBuilder.build();
                }
            }
            this.f1562f.f1262a.degraded = 2;
            this.f1562f.f1262a.sendBeforeTime = System.currentTimeMillis() - this.f1562f.f1262a.reqStart;
            anet.channel.session.b.a(this.f1562f, (RequestCb) new c(this));
        }
    }

    public b(j jVar) {
        this.f1559c = jVar;
        this.f1562f = jVar.f1591a.a();
    }
}
