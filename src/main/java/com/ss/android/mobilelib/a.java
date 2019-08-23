package com.ss.android.mobilelib;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.common.util.NetworkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Context> f30061a;

    /* renamed from: com.ss.android.mobilelib.a$a  reason: collision with other inner class name */
    static abstract class C0364a<T extends c> extends com.ss.android.newmedia.thread.a {

        /* renamed from: e  reason: collision with root package name */
        protected WeakReference<Context> f30062e;
        private WeakHandler g;
        private T h;
        private String i;

        /* access modifiers changed from: protected */
        public abstract String a(String str, Map<String, String> map) throws Exception;

        /* access modifiers changed from: protected */
        public abstract Map<String, String> a(T t);

        /* access modifiers changed from: protected */
        public abstract void a(JSONObject jSONObject, T t) throws Exception;

        public final void run() {
            int i2;
            boolean z = false;
            try {
                if (this.f30062e.get() == null) {
                    this.h.f30066a = 18;
                } else if (NetworkUtils.getNetworkType((Context) this.f30062e.get()) == NetworkUtils.h.NONE) {
                    this.h.f30066a = 12;
                } else {
                    String a2 = a(this.i, a(this.h));
                    if (StringUtils.isEmpty(a2)) {
                        this.h.f30066a = 18;
                    } else {
                        JSONObject jSONObject = new JSONObject(a2);
                        String string = jSONObject.getString("message");
                        if ("success".equals(string)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                            if (jSONObject2 != null) {
                                a(jSONObject2, this.h);
                            }
                            z = true;
                        } else if ("error".equals(string)) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                            if (jSONObject3 != null) {
                                if ("session_expired".equals(jSONObject3.optString("name"))) {
                                    this.h.f30066a = 105;
                                } else {
                                    this.h.f30066a = jSONObject3.optInt("error_code", this.h.f30066a);
                                    this.h.f30067b = jSONObject3.optString("description");
                                    this.h.f30068c = jSONObject3.optString("captcha");
                                    this.h.f30069d = jSONObject3.optString("alert_text");
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                this.h.f30066a = com.ss.android.newmedia.e.a((Context) this.f30062e.get(), th);
            }
            if (this.g != null) {
                WeakHandler weakHandler = this.g;
                if (z) {
                    i2 = 10;
                } else {
                    i2 = 11;
                }
                Message obtainMessage = weakHandler.obtainMessage(i2);
                obtainMessage.obj = this.h;
                this.g.sendMessage(obtainMessage);
            }
        }

        public C0364a(Context context, WeakHandler weakHandler, String str, T t) {
            this.f30062e = new WeakReference<>(context);
            this.g = weakHandler;
            this.h = t;
            this.i = str;
        }
    }

    static abstract class b<T extends c> extends C0364a<T> {
        /* access modifiers changed from: protected */
        public final String a(String str, Map<String, String> map) throws Exception {
            ArrayList arrayList = new ArrayList();
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) next.getKey()) && !TextUtils.isEmpty((CharSequence) next.getValue())) {
                        arrayList.add(new com.ss.android.http.a.b.e((String) next.getKey(), (String) next.getValue()));
                    }
                }
            }
            return NetworkUtils.executePost(204800, str, (List) arrayList);
        }

        public b(Context context, WeakHandler weakHandler, String str, T t) {
            super(context, weakHandler, str, t);
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public int f30066a;

        /* renamed from: b  reason: collision with root package name */
        public String f30067b;

        /* renamed from: c  reason: collision with root package name */
        public String f30068c;

        /* renamed from: d  reason: collision with root package name */
        public String f30069d;

        /* renamed from: e  reason: collision with root package name */
        public int f30070e;

        public c(int i) {
            this.f30070e = i;
        }
    }

    public static class d extends b<e> {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Map a(c cVar) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", String.valueOf(((e) cVar).f30070e));
            return hashMap;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void a(JSONObject jSONObject, c cVar) throws Exception {
            ((e) cVar).f30071f = jSONObject.optString("captcha");
        }

        public d(Context context, WeakHandler weakHandler, int i) {
            super(context, weakHandler, b.f30072a, new e(i));
        }
    }

    public static class e extends c {

        /* renamed from: f  reason: collision with root package name */
        public String f30071f;

        public e(int i) {
            super(i);
        }
    }

    public a(Context context) {
        this.f30061a = new WeakReference<>(context.getApplicationContext());
    }
}
