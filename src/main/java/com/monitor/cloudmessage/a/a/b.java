package com.monitor.cloudmessage.a.a;

import com.monitor.cloudmessage.a.a;
import com.monitor.cloudmessage.callback.c;
import com.monitor.cloudmessage.entity.ConsumerResult;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class b extends a implements com.monitor.cloudmessage.d.a.a {

    /* renamed from: a  reason: collision with root package name */
    public c f27312a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f27313b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private long f27314c = 0;

    public final String a() {
        return "alog";
    }

    public final List<String> b() {
        return this.f27313b;
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        JSONObject jSONObject = new JSONObject(aVar.f27359a);
        if (this.f27312a == null) {
            return false;
        }
        if (a(jSONObject, aVar)) {
            return true;
        }
        if (System.currentTimeMillis() - this.f27314c < 180000) {
            return false;
        }
        this.f27314c = System.currentTimeMillis();
        List a2 = this.f27312a.a(jSONObject.optLong("fetch_start_time", (System.currentTimeMillis() / 1000) - 18000), jSONObject.optLong("fetch_end_time", System.currentTimeMillis() / 1000), jSONObject);
        ConsumerResult b2 = this.f27312a.b();
        if ((a2 == null || a2.size() == 0) && (this.f27312a instanceof com.monitor.cloudmessage.callback.b)) {
            a2 = ((com.monitor.cloudmessage.callback.b) this.f27312a).a();
            if (!(a2 == null || a2.size() == 0)) {
                b2 = ConsumerResult.build(true, "兜底策略数据", b2.getSpecificParams());
            }
        }
        ConsumerResult consumerResult = b2;
        if (a2 != null && a2.size() != 0 && consumerResult.isSuccess()) {
            this.f27313b.clear();
            this.f27313b.addAll(a2);
            com.monitor.cloudmessage.d.b.a aVar2 = new com.monitor.cloudmessage.d.b.a("log_agile", 0, false, aVar.f27362d, this, consumerResult.getSpecificParams());
            aVar2.f27346d = true;
            aVar2.f27348f = false;
            aVar2.f27347e = true;
            aVar2.l = 2;
            aVar2.m = consumerResult.getErrMsg();
            com.monitor.cloudmessage.d.a.a(aVar2);
        } else if (!consumerResult.isSuccess()) {
            a(consumerResult.getErrMsg(), consumerResult.getSpecificParams(), aVar);
        }
        return true;
    }
}
