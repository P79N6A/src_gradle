package com.mapbox.android.telemetry;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class bj {

    /* renamed from: d  reason: collision with root package name */
    private static final MediaType f26064d = MediaType.parse("application/json; charset=utf-8");

    /* renamed from: a  reason: collision with root package name */
    public String f26065a;

    /* renamed from: b  reason: collision with root package name */
    public String f26066b;

    /* renamed from: c  reason: collision with root package name */
    public bm f26067c;

    /* renamed from: e  reason: collision with root package name */
    private final ag f26068e;

    /* renamed from: f  reason: collision with root package name */
    private e f26069f;

    private boolean a() {
        if (this.f26067c.f26084d || this.f26067c.f26082b.equals(o.STAGING)) {
            return true;
        }
        return false;
    }

    private static GsonBuilder b() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(an.class, new ArriveEventSerializer());
        gsonBuilder.registerTypeAdapter(aq.class, new DepartEventSerializer());
        gsonBuilder.registerTypeAdapter(ap.class, new CancelEventSerializer());
        gsonBuilder.registerTypeAdapter(as.class, new FeedbackEventSerializer());
        gsonBuilder.registerTypeAdapter(ax.class, new RerouteEventSerializer());
        gsonBuilder.registerTypeAdapter(ar.class, new FasterRouteEventSerializer());
        return gsonBuilder;
    }

    private static RequestBody a(MultipartBody.Builder builder) {
        MultipartBody build = builder.build();
        MultipartBody.Builder type = new MultipartBody.Builder("--01ead4a5-7a67-4703-ad02-589886e00923").setType(MultipartBody.FORM);
        for (int size = build.size() - 1; size >= 0; size--) {
            type.addPart(build.part(size));
        }
        return type.build();
    }

    /* access modifiers changed from: package-private */
    public final void a(List<r> list, Callback callback) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        b(arrayList, callback);
    }

    private void b(List<r> list, Callback callback) {
        String json = b().create().toJson((Object) list);
        RequestBody create = RequestBody.create(f26064d, json);
        HttpUrl build = this.f26067c.f26083c.newBuilder("/events/v2").addQueryParameter("access_token", this.f26065a).build();
        if (a()) {
            String.format(Locale.US, "Sending POST to %s with %d event(s) (user agent: %s) with payload: %s", new Object[]{build, Integer.valueOf(list.size()), this.f26066b, json});
        }
        this.f26067c.a(this.f26069f).newCall(new Request.Builder().url(build).header("User-Agent", this.f26066b).post(create).build()).enqueue(callback);
    }

    /* access modifiers changed from: package-private */
    public final void a(c cVar, final CopyOnWriteArraySet<Object> copyOnWriteArraySet) {
        List<x> list = cVar.f26103a;
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        MultipartBody.Builder type = new MultipartBody.Builder("--01ead4a5-7a67-4703-ad02-589886e00923").setType(MultipartBody.FORM);
        for (x next : list) {
            y a2 = next.a();
            d dVar = next.f26139a;
            arrayList.add(dVar);
            type.addFormDataPart("file", dVar.f26105a, RequestBody.create(a2.f26143b, new File(a2.f26142a)));
            arrayList2.add(dVar.f26106b);
        }
        type.addFormDataPart("attachments", new Gson().toJson((Object) arrayList));
        RequestBody a3 = a(type);
        HttpUrl build = this.f26067c.f26083c.newBuilder("/attachments/v1").addQueryParameter("access_token", this.f26065a).build();
        if (a()) {
            String.format(Locale.US, "Sending POST to %s with %d event(s) (user agent: %s) with payload: %s", new Object[]{build, Integer.valueOf(list.size()), this.f26066b, arrayList});
        }
        this.f26067c.b(this.f26069f).newCall(new Request.Builder().url(build).header("User-Agent", this.f26066b).post(a3).build()).enqueue(new Callback() {
            public final void onFailure(Call call, IOException iOException) {
                Iterator it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    it2.next();
                    iOException.getMessage();
                }
            }

            public final void onResponse(Call call, Response response) {
                Iterator it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    it2.next();
                    response.message();
                    response.code();
                }
            }
        });
    }

    bj(String str, String str2, bm bmVar, ag agVar, e eVar) {
        this.f26065a = str;
        this.f26066b = str2;
        this.f26067c = bmVar;
        this.f26068e = agVar;
        this.f26069f = eVar;
    }
}
