package com.bytedance.ttnet.retrofit;

import com.bytedance.frameworks.baselib.network.http.c;
import com.bytedance.retrofit2.client.Client;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.a;
import com.bytedance.ttnet.b;
import java.io.IOException;

public class SsRetrofitClient implements Client {
    public a newSsCall(Request request) throws IOException {
        c cVar;
        request.getUrl();
        if (b.a()) {
            cVar = b.f22545b.a();
        } else {
            cVar = b.f22544a.a();
        }
        if (cVar != null) {
            return cVar.newSsCall(request);
        }
        return null;
    }
}
