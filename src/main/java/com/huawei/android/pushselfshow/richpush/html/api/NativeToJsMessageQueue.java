package com.huawei.android.pushselfshow.richpush.html.api;

import android.app.Activity;
import android.webkit.WebView;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.richpush.html.api.d;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NativeToJsMessageQueue {

    /* renamed from: a  reason: collision with root package name */
    public WebView f25315a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedList f25316b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    private final a f25317c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Activity f25318d;

    /* renamed from: e  reason: collision with root package name */
    private String f25319e;

    class OnlineEventsBridgeMode implements a {

        /* renamed from: a  reason: collision with root package name */
        boolean f25320a = true;

        /* renamed from: b  reason: collision with root package name */
        final Runnable f25321b = new a(this);

        OnlineEventsBridgeMode() {
            e.a("PushSelfShowLog", "OnlineEventsBridgeMode() the webview is " + r5.f25315a);
            NativeToJsMessageQueue.this.f25315a.setNetworkAvailable(true);
        }

        public void onNativeToJsMessageAvailable() {
            NativeToJsMessageQueue.this.f25318d.runOnUiThread(this.f25321b);
        }
    }

    interface a {
        void onNativeToJsMessageAvailable();
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final String f25323a;

        /* renamed from: b  reason: collision with root package name */
        final d f25324b;

        b(d dVar, String str) {
            this.f25323a = str;
            this.f25324b = dVar;
        }

        /* access modifiers changed from: package-private */
        public JSONObject a() {
            if (this.f25324b == null) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", this.f25324b.a());
                if (this.f25324b.b() != null) {
                    jSONObject.put("message", this.f25324b.b());
                }
                jSONObject.put("callbackId", this.f25323a);
                return jSONObject;
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    public NativeToJsMessageQueue(Activity activity, WebView webView, String str) {
        e.a("PushSelfShowLog", "activity is " + activity);
        e.a("PushSelfShowLog", "webView is " + webView);
        e.a("PushSelfShowLog", "localPath is " + str);
        this.f25318d = activity;
        this.f25315a = webView;
        this.f25319e = str;
        this.f25317c = new OnlineEventsBridgeMode();
        b();
    }

    /* access modifiers changed from: private */
    public boolean d() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.f25316b.isEmpty();
        }
        return isEmpty;
    }

    public String a() {
        return this.f25319e;
    }

    public void a(String str, d.a aVar, String str2, JSONObject jSONObject) {
        try {
            e.a("PushSelfShowLog", "addPluginResult status is " + d.c()[aVar.ordinal()]);
            if (str == null) {
                e.e("JsMessageQueue", "Got plugin result with no callbackId");
                return;
            }
            b bVar = new b(jSONObject == null ? new d(str2, aVar) : new d(str2, aVar, jSONObject), str);
            synchronized (this) {
                this.f25316b.add(bVar);
                if (this.f25317c != null) {
                    this.f25317c.onNativeToJsMessageAvailable();
                }
            }
        } catch (Exception e2) {
            e.d("PushSelfShowLog", "addPluginResult failed", e2);
        }
    }

    public void b() {
        synchronized (this) {
            this.f25316b.clear();
        }
    }

    public String c() {
        synchronized (this) {
            if (this.f25316b.isEmpty()) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            int size = this.f25316b.size();
            for (int i = 0; i < size; i++) {
                JSONObject a2 = ((b) this.f25316b.removeFirst()).a();
                if (a2 != null) {
                    jSONArray.put(a2);
                }
            }
            String jSONArray2 = jSONArray.toString();
            return jSONArray2;
        }
    }
}
