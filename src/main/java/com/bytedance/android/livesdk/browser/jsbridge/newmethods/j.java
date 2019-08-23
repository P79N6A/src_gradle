package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import com.bytedance.android.live.base.model.e;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.jsbridge.b.a;
import com.bytedance.android.livesdkapi.i.d;
import com.bytedance.ies.f.b.c;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.i;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class j extends c<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9593a;

    /* renamed from: b  reason: collision with root package name */
    public Disposable f9594b;

    public final void d_() {
        if (PatchProxy.isSupport(new Object[0], this, f9593a, false, 3672, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9593a, false, 3672, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9594b != null) {
            this.f9594b.dispose();
        }
    }

    static List<e> a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f9593a, true, 3676, new Class[]{JSONObject.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f9593a, true, 3676, new Class[]{JSONObject.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                arrayList.add(new e(next, jSONObject2.optString(next, "")));
            }
        }
        return arrayList;
    }

    static String a(String str, JSONObject jSONObject) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject}, null, f9593a, true, 3675, new Class[]{String.class, JSONObject.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, jSONObject}, null, f9593a, true, 3675, new Class[]{String.class, JSONObject.class}, String.class);
        }
        i iVar = new i(str2);
        for (e next : a(jSONObject)) {
            iVar.a(next.getName(), next.getValue());
        }
        return iVar.a();
    }

    public final /* synthetic */ void a(@NonNull Object obj, @NonNull f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        if (PatchProxy.isSupport(new Object[]{jSONObject, fVar}, this, f9593a, false, 3671, new Class[]{JSONObject.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, fVar}, this, f9593a, false, 3671, new Class[]{JSONObject.class, f.class}, Void.TYPE);
            return;
        }
        String optString = jSONObject.optString(PushConstants.WEB_URL, "");
        Single.just(jSONObject.optString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "get").toLowerCase()).subscribeOn(Schedulers.io()).map(new k(optString, jSONObject.optJSONObject("headers"), jSONObject.optJSONObject("params"), jSONObject.optJSONObject("data"))).observeOn(AndroidSchedulers.mainThread()).subscribe((SingleObserver<? super T>) new SingleObserver<JSONObject>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f9595a;

            public final void onSubscribe(Disposable disposable) {
                j.this.f9594b = disposable;
            }

            public final void onError(Throwable th) {
                Throwable th2 = th;
                if (PatchProxy.isSupport(new Object[]{th2}, this, f9595a, false, 3679, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th2}, this, f9595a, false, 3679, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                j.this.b(th2);
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f9595a, false, 3678, new Class[]{JSONObject.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f9595a, false, 3678, new Class[]{JSONObject.class}, Void.TYPE);
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("raw", jSONObject);
                    j.this.a(jSONObject2);
                } catch (JSONException e2) {
                    j.this.b(e2);
                }
            }
        });
    }

    static JSONObject a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws IOException, JSONException {
        String str2;
        String str3;
        String str4 = str;
        JSONObject jSONObject4 = jSONObject2;
        JSONObject jSONObject5 = jSONObject3;
        if (PatchProxy.isSupport(new Object[]{str4, jSONObject, jSONObject4, jSONObject5}, null, f9593a, true, 3673, new Class[]{String.class, JSONObject.class, JSONObject.class, JSONObject.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{str4, jSONObject, jSONObject4, jSONObject5}, null, f9593a, true, 3673, new Class[]{String.class, JSONObject.class, JSONObject.class, JSONObject.class}, JSONObject.class);
        }
        String a2 = a(str4, jSONObject4);
        ArrayList<com.ss.android.http.a.b.e> arrayList = new ArrayList<>();
        if (jSONObject5 != null) {
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                arrayList.add(new com.ss.android.http.a.b.e(next, jSONObject5.optString(next, "")));
            }
        }
        if (PatchProxy.isSupport(new Object[]{a2}, null, a.f9441a, true, 3615, new Class[]{String.class}, String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[]{a2}, null, a.f9441a, true, 3615, new Class[]{String.class}, String.class);
        } else {
            if (a2.indexOf("?") > 0) {
                str3 = "&";
            } else {
                str3 = "?";
            }
            str2 = a2 + str3 + "live_sdk_version=" + TTLiveSDKContext.getHostService().a().b();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (com.ss.android.http.a.b.e eVar : arrayList) {
            if (byteArrayOutputStream.size() > 0) {
                byteArrayOutputStream.write(38);
            }
            try {
                String encode = URLEncoder.encode(eVar.a(), "UTF-8");
                String encode2 = URLEncoder.encode(eVar.b(), "UTF-8");
                byteArrayOutputStream.write(encode.getBytes(Charset.forName("UTF-8")));
                byteArrayOutputStream.write(61);
                byteArrayOutputStream.write(encode2.getBytes(Charset.forName("UTF-8")));
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        return new JSONObject(new String(((d) TTLiveSDKContext.getHostService().h().a(str2, a(jSONObject), "application/x-www-form-urlencoded; charset=UTF-8", byteArrayOutputStream.toByteArray()).a()).f18821e));
    }
}
