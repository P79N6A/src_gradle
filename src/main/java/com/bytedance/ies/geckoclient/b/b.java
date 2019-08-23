package com.bytedance.ies.geckoclient.b;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f20719b = new b();

    /* renamed from: a  reason: collision with root package name */
    public Gson f20720a;

    public static b a() {
        return f20719b;
    }

    private b() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Boolean.class, new a());
        gsonBuilder.registerTypeAdapter(Boolean.TYPE, new a());
        this.f20720a = gsonBuilder.create();
    }
}
