package com.ss.android.ugc.aweme.story.base.api;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import okhttp3.OkHttpClient;
import retrofit2.a.b.h;
import retrofit2.c;
import retrofit2.e;
import retrofit2.n;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71918a;

    /* renamed from: b  reason: collision with root package name */
    public static final Gson f71919b = JSON.createAdapterGsonFromGsonBuilder(JSON.createAdapterGsonBuilder().registerTypeAdapterFactory(new StoryModelCheckerTypeAdapterFactory()).registerTypeAdapterFactory(new StoryCollectionTypeAdapterFactory()).registerTypeAdapterFactory(new StoryBaseResponseObjectTypeAdapterFactory()));

    /* renamed from: c  reason: collision with root package name */
    static final OkHttpClient f71920c = new OkHttpClient().newBuilder().build();

    public static n a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f71918a, true, 82211, new Class[]{String.class}, n.class)) {
            return new n.a().a((e.a) retrofit2.b.a.a.a(f71919b)).a((c.a) h.a()).a(str2).a(f71920c).a();
        }
        return (n) PatchProxy.accessDispatch(new Object[]{str2}, null, f71918a, true, 82211, new Class[]{String.class}, n.class);
    }
}
