package com.ss.android.ugc.effectmanager.common.e;

import android.accounts.NetworkErrorException;
import com.ss.android.ugc.effectmanager.common.b;
import com.ss.android.ugc.effectmanager.common.c.a;
import com.ss.android.ugc.effectmanager.common.c.d;
import com.ss.android.ugc.effectmanager.common.model.NetException;
import java.io.IOException;
import org.json.JSONException;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f77315a;

    /* renamed from: b  reason: collision with root package name */
    public String f77316b;

    /* renamed from: c  reason: collision with root package name */
    public Exception f77317c;

    /* renamed from: d  reason: collision with root package name */
    private String f77318d;

    /* renamed from: e  reason: collision with root package name */
    private String f77319e;

    /* renamed from: f  reason: collision with root package name */
    private String f77320f;

    public String toString() {
        if (this.f77317c != null) {
            return "ExceptionResult{errorCode=" + this.f77315a + ", msg='" + this.f77316b + '\'' + ", requestUrl='" + this.f77318d + '\'' + ", selectedHost='" + this.f77319e + '\'' + ", remoteIp='" + this.f77320f + '\'' + ", exception=" + this.f77317c.getMessage() + '}';
        }
        return "ExceptionResult{errorCode=" + this.f77315a + ", msg='" + this.f77316b + ", requestUrl='" + this.f77318d + '\'' + ", selectedHost='" + this.f77319e + '\'' + ", remoteIp='" + this.f77320f + '\'' + '}';
    }

    public c(Exception exc) {
        this(exc, null, null, null);
    }

    public c(int i) {
        this.f77315a = -1;
        this.f77315a = i;
        this.f77316b = b.a(i);
        this.f77317c = null;
    }

    public final void a(String str, String str2, String str3) {
        this.f77318d = str;
        this.f77319e = str2;
        this.f77320f = str3;
    }

    private c(Exception exc, String str, String str2, String str3) {
        this.f77315a = -1;
        this.f77318d = null;
        this.f77319e = null;
        this.f77320f = null;
        this.f77317c = exc;
        if (exc instanceof NetException) {
            this.f77315a = ((NetException) exc).getStatus_code().intValue();
            this.f77316b = exc.getMessage();
        } else if (exc instanceof com.ss.android.ugc.effectmanager.common.c.b) {
            this.f77315a = ((com.ss.android.ugc.effectmanager.common.c.b) exc).getStatusCode();
            this.f77316b = exc.getMessage();
        } else if (exc instanceof JSONException) {
            this.f77315a = 10008;
            this.f77316b = exc.getMessage();
        } else if (exc instanceof NetworkErrorException) {
            this.f77315a = 10002;
            this.f77316b = exc.getMessage();
        } else if (exc instanceof d) {
            this.f77315a = 10015;
            this.f77316b = exc.getMessage();
        } else if (exc instanceof com.ss.android.ugc.effectmanager.common.c.c) {
            this.f77315a = 10013;
            this.f77316b = exc.getMessage();
        } else if (exc instanceof a) {
            this.f77315a = 10010;
            this.f77316b = exc.getMessage();
        } else if (exc instanceof IOException) {
            this.f77315a = 10012;
            this.f77316b = exc.getMessage();
        } else if (exc != null) {
            if ("network unavailable".equals(exc.getMessage())) {
                this.f77315a = 10011;
            } else {
                this.f77315a = 10005;
            }
            this.f77316b = exc.getMessage();
        } else {
            this.f77315a = 1;
            this.f77316b = b.a(this.f77315a);
        }
    }
}
