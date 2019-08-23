package com.ss.optimizer.live.sdk.dns;

import com.ss.optimizer.live.sdk.a.a.a;
import com.ss.optimizer.live.sdk.a.d;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class c implements Callable<a> {

    /* renamed from: a  reason: collision with root package name */
    private final String f78448a;

    public final /* synthetic */ Object call() throws Exception {
        com.ss.optimizer.live.sdk.a.a aVar = d.a().f78405b;
        String str = this.f78448a;
        return new a(new JSONObject(aVar.f78386b.a(com.ss.optimizer.live.sdk.a.a.a(aVar.f78385a + "/video/live/qos/v2/ipSettings", aVar.f78387c), str.toString().getBytes("UTF-8"), "gzip", "application/json; charset=utf-8")));
    }

    c(String str) {
        this.f78448a = str;
    }
}
