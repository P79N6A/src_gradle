package com.ss.android.ugc.effectmanager.d;

import android.accounts.NetworkErrorException;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.d.b;
import com.ss.android.ugc.effectmanager.common.d.c;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.link.LinkSelector;
import java.io.InputStream;
import org.json.JSONException;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public b f77347a;

    /* renamed from: b  reason: collision with root package name */
    public LinkSelector f77348b;

    public a(b bVar) {
        this.f77347a = bVar;
    }

    @NonNull
    public final InputStream a(com.ss.android.ugc.effectmanager.common.a aVar) throws Exception {
        InputStream a2 = this.f77347a.a(aVar);
        if (a2 != null) {
            return a2;
        }
        this.f77348b.a(aVar.f77265a);
        if (!this.f77348b.d()) {
            throw new Exception("network unavailable");
        } else if (TextUtils.isEmpty(aVar.g)) {
            throw new NetworkErrorException("Download error");
        } else {
            throw new NetworkErrorException(aVar.g);
        }
    }

    public final <T extends BaseNetResponse> BaseNetResponse a(com.ss.android.ugc.effectmanager.common.a aVar, c cVar, Class<T> cls) throws Exception {
        InputStream a2 = this.f77347a.a(aVar);
        if (a2 == null) {
            this.f77348b.a(aVar.f77265a);
            if (!this.f77348b.d()) {
                throw new Exception("network unavailable");
            }
            throw new NetworkErrorException("Download error");
        }
        BaseNetResponse baseNetResponse = (BaseNetResponse) cVar.a(a2, cls);
        if (baseNetResponse != null) {
            int i = baseNetResponse.status_code;
            if (i == 0) {
                return baseNetResponse;
            }
            this.f77348b.a(aVar.f77265a);
            throw new com.ss.android.ugc.effectmanager.common.c.b(i, baseNetResponse.message);
        }
        this.f77348b.a(aVar.f77265a);
        throw new JSONException("Json convert fail");
    }

    public final <T extends BaseNetResponse> BaseNetResponse a(com.ss.android.ugc.effectmanager.common.a aVar, InputStream inputStream, c cVar, Class<T> cls) throws Exception {
        BaseNetResponse baseNetResponse = (BaseNetResponse) cVar.a(inputStream, cls);
        if (baseNetResponse != null) {
            int i = baseNetResponse.status_code;
            if (i == 0) {
                return baseNetResponse;
            }
            this.f77348b.a(aVar.f77265a);
            throw new com.ss.android.ugc.effectmanager.common.c.b(i, baseNetResponse.message);
        }
        this.f77348b.a(aVar.f77265a);
        throw new JSONException("Json convert fail");
    }
}
