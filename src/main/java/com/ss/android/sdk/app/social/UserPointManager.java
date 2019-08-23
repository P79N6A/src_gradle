package com.ss.android.sdk.app.social;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakContainer;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.Url;
import java.util.Iterator;

public final class UserPointManager implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    private long f30678a;

    /* renamed from: b  reason: collision with root package name */
    private WeakContainer<b> f30679b;

    interface UserPointApi {
        @GET
        Call<String> getResponse(@Url String str, @MaxLength int i);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f30680a;

        /* renamed from: b  reason: collision with root package name */
        public int f30681b;

        /* renamed from: c  reason: collision with root package name */
        public long f30682c;
    }

    public interface b {
    }

    public final void handleMsg(Message message) {
        if (message.what == 10 && (message.obj instanceof a)) {
            a aVar = (a) message.obj;
            if (this.f30678a == aVar.f30680a) {
                long j = aVar.f30682c;
                int i = aVar.f30681b;
                Iterator it2 = this.f30679b.iterator();
                while (it2.hasNext()) {
                    b bVar = (b) it2.next();
                }
            }
        }
    }
}
