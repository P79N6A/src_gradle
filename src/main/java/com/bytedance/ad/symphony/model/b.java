package com.bytedance.ad.symphony.model;

import com.bytedance.ad.symphony.g.e;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f7645a;

    /* renamed from: b  reason: collision with root package name */
    public String f7646b;

    /* renamed from: c  reason: collision with root package name */
    public int f7647c;

    /* renamed from: d  reason: collision with root package name */
    public long f7648d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f7649e;

    /* renamed from: f  reason: collision with root package name */
    public ConcurrentHashMap<String, Object> f7650f;
    public String g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f7651a;

        /* renamed from: b  reason: collision with root package name */
        String f7652b;

        /* renamed from: c  reason: collision with root package name */
        int f7653c;
    }

    public final ConcurrentHashMap<String, Object> a() {
        if (this.f7650f == null) {
            this.f7650f = new e(32);
        }
        return this.f7650f;
    }

    private b(a aVar) {
        this.f7645a = aVar.f7651a;
        this.f7646b = aVar.f7652b;
        this.f7647c = aVar.f7653c;
    }

    public /* synthetic */ b(a aVar, byte b2) {
        this(aVar);
    }
}
