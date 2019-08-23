package com.ss.android.ugc.aweme.fe.base;

import android.arch.lifecycle.LifecycleObserver;
import android.content.Context;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.base.e;
import com.ss.android.ugc.aweme.fe.b.c;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseCommonJavaMethod implements LifecycleObserver, d, com.ss.android.ugc.aweme.framework.bridge.a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f3121c;

    /* renamed from: d  reason: collision with root package name */
    protected WeakReference<ReactContext> f3122d;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<Context> f3123e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.ies.f.a.a f3124f;

    public interface a {
        void a(int i, String str);

        void a(Object obj);

        void a(Object obj, int i, String str);

        void a(JSONObject jSONObject);
    }

    public abstract void a(JSONObject jSONObject, a aVar) throws JSONException;

    public BaseCommonJavaMethod() {
    }

    public BaseCommonJavaMethod a(WeakReference<Context> weakReference) {
        this.f3123e = weakReference;
        return this;
    }

    public BaseCommonJavaMethod(com.bytedance.ies.f.a.a aVar) {
        this.f3124f = aVar;
    }

    public BaseCommonJavaMethod(ReactContext reactContext) {
        this.f3122d = new WeakReference<>(reactContext);
    }

    public final void call(h hVar, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f3121c, false, 39713, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f3121c, false, 39713, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            e.a().b();
            JSONObject jSONObject2 = hVar.f20623d;
            if (jSONObject2 != null) {
                jSONObject2.put("func", hVar.f20622c);
            }
            final String str = hVar.f20621b;
            hVar.f20625f = false;
            a(jSONObject2, new a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44421a;

                public final void a(Object obj) {
                    if (PatchProxy.isSupport(new Object[]{obj}, this, f44421a, false, 39719, new Class[]{Object.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj}, this, f44421a, false, 39719, new Class[]{Object.class}, Void.TYPE);
                        return;
                    }
                    if (BaseCommonJavaMethod.this.f3124f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", 1);
                            jSONObject.put("data", obj);
                        } catch (JSONException unused) {
                        }
                        BaseCommonJavaMethod.this.f3124f.a(str, jSONObject);
                    }
                }

                public final void a(JSONObject jSONObject) {
                    if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f44421a, false, 39721, new Class[]{JSONObject.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f44421a, false, 39721, new Class[]{JSONObject.class}, Void.TYPE);
                        return;
                    }
                    if (BaseCommonJavaMethod.this.f3124f != null) {
                        BaseCommonJavaMethod.this.f3124f.a(str, jSONObject);
                    }
                }

                public final void a(int i, String str) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f44421a, false, 39722, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f44421a, false, 39722, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("code", i);
                        jSONObject.put("msg", str);
                    } catch (JSONException unused) {
                    }
                    BaseCommonJavaMethod.this.f3124f.a(str, jSONObject);
                }

                public final void a(Object obj, int i, String str) {
                    Object obj2 = obj;
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{obj2, Integer.valueOf(i), str2}, this, f44421a, false, 39720, new Class[]{Object.class, Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj2, Integer.valueOf(i), str2}, this, f44421a, false, 39720, new Class[]{Object.class, Integer.TYPE, String.class}, Void.TYPE);
                        return;
                    }
                    if (BaseCommonJavaMethod.this.f3124f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", i);
                            jSONObject.put("msg", str2);
                            jSONObject.put("data", obj);
                        } catch (JSONException unused) {
                        }
                        BaseCommonJavaMethod.this.f3124f.a(str, jSONObject);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public final void a(String str, ReadableMap readableMap, Callback callback) {
        String str2 = str;
        final Callback callback2 = callback;
        if (PatchProxy.isSupport(new Object[]{str2, readableMap, callback2}, this, f3121c, false, 39712, new Class[]{String.class, ReadableMap.class, Callback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, readableMap, callback2}, this, f3121c, false, 39712, new Class[]{String.class, ReadableMap.class, Callback.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject a2 = c.a(readableMap);
            if (a2 != null) {
                a2.put("func", str);
            }
            a(a2, new a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44418a;

                public final void a(Object obj) {
                    Object obj2 = obj;
                    if (PatchProxy.isSupport(new Object[]{obj2}, this, f44418a, false, 39715, new Class[]{Object.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj2}, this, f44418a, false, 39715, new Class[]{Object.class}, Void.TYPE);
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", 1);
                        jSONObject.put("data", obj2);
                        try {
                            callback2.invoke(c.a(jSONObject));
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                    }
                }

                public final void a(JSONObject jSONObject) {
                    if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f44418a, false, 39717, new Class[]{JSONObject.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f44418a, false, 39717, new Class[]{JSONObject.class}, Void.TYPE);
                        return;
                    }
                    try {
                        callback2.invoke(c.a(jSONObject));
                    } catch (JSONException unused) {
                    }
                }

                public final void a(int i, String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f44418a, false, 39718, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f44418a, false, 39718, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", i);
                        jSONObject.put("msg", str2);
                        try {
                            callback2.invoke(c.a(jSONObject));
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                    }
                }

                public final void a(Object obj, int i, String str) {
                    Object obj2 = obj;
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{obj2, Integer.valueOf(i), str2}, this, f44418a, false, 39716, new Class[]{Object.class, Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj2, Integer.valueOf(i), str2}, this, f44418a, false, 39716, new Class[]{Object.class, Integer.TYPE, String.class}, Void.TYPE);
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", i);
                        jSONObject.put("msg", str2);
                        jSONObject.put("data", obj2);
                        try {
                            callback2.invoke(c.a(jSONObject));
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public final void a(String str, JSONObject jSONObject, int i) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject2, Integer.valueOf(i)}, this, f3121c, false, 39714, new Class[]{String.class, JSONObject.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject2, Integer.valueOf(i)}, this, f3121c, false, 39714, new Class[]{String.class, JSONObject.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == 2 || i2 == 3) {
            try {
                if (this.f3122d.get() != null) {
                    com.ss.android.ugc.aweme.framework.e.a((ReactContext) this.f3122d.get(), str2, c.a(jSONObject));
                }
            } catch (JSONException unused) {
            }
        }
        if ((i2 == 1 || i2 == 3) && this.f3124f != null) {
            this.f3124f.b(str2, jSONObject2);
        }
    }
}
