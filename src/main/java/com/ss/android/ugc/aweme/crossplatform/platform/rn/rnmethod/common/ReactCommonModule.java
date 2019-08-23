package com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common;

import a.g;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Header;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.AppContext;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.platform.rn.a.b;
import com.ss.android.ugc.aweme.framework.ReactInstance;
import com.ss.android.ugc.aweme.framework.activity.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.util.j;
import com.ss.android.ugc.aweme.utils.cu;
import com.ss.android.ugc.aweme.web.jsbridge.ai;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public class ReactCommonModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final CommonApi sApi = ((CommonApi) m.a("https://aweme.snssdk.com").create(CommonApi.class));

    public String getName() {
        return "brn";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.Object> getConstants() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            r4 = 0
            r5 = 34381(0x864d, float:4.8178E-41)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 34381(0x864d, float:4.8178E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.util.Map> r8 = java.util.Map.class
            r3 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L_0x0028:
            java.util.HashMap r1 = new java.util.HashMap
            r2 = 16
            r1.<init>(r2)
            java.lang.String r2 = "appName"
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.fe.b.b.f44409a
            r6 = 1
            r7 = 39882(0x9bca, float:5.5887E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0058
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.fe.b.b.f44409a
            r8 = 1
            r9 = 39882(0x9bca, float:5.5887E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0068
        L_0x0058:
            com.ss.android.ugc.aweme.app.AwemeAppData r3 = com.ss.android.ugc.aweme.app.AwemeAppData.p()
            com.ss.android.common.AppContext r3 = r3.c()
            if (r3 != 0) goto L_0x0064
            r3 = r4
            goto L_0x0068
        L_0x0064:
            java.lang.String r3 = r3.getAppName()
        L_0x0068:
            r1.put(r2, r3)
            java.lang.String r2 = "appVersion"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.fe.b.b.f44409a
            r8 = 1
            r9 = 39883(0x9bcb, float:5.5888E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r3 == 0) goto L_0x0095
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.fe.b.b.f44409a
            r8 = 1
            r9 = 39883(0x9bcb, float:5.5888E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x00a4
        L_0x0095:
            com.ss.android.ugc.aweme.app.AwemeAppData r0 = com.ss.android.ugc.aweme.app.AwemeAppData.p()
            com.ss.android.common.AppContext r0 = r0.c()
            if (r0 != 0) goto L_0x00a0
            goto L_0x00a4
        L_0x00a0:
            java.lang.String r4 = r0.getVersion()
        L_0x00a4:
            r1.put(r2, r4)
            java.lang.String r0 = "language"
            java.util.Locale r2 = com.ss.android.ugc.aweme.utils.cf.b()
            java.lang.String r2 = r2.toString()
            r1.put(r0, r2)
            java.lang.String r0 = "region"
            java.lang.String r2 = com.ss.android.ugc.aweme.language.e.b()
            r1.put(r0, r2)
            java.lang.String r0 = "channel"
            com.ss.android.ugc.aweme.framework.core.a r2 = com.ss.android.ugc.aweme.framework.core.a.b()
            java.lang.String r2 = r2.f3304b
            r1.put(r0, r2)
            com.ss.android.newmedia.BaseAppData r0 = com.ss.android.newmedia.BaseAppData.a()
            com.ss.android.sdk.c.g r0 = r0.o()
            if (r0 == 0) goto L_0x00db
            java.lang.String r2 = "assetSource"
            java.lang.String r0 = r0.a()
            r1.put(r2, r0)
        L_0x00db:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.ReactCommonModule.getConstants():java.util.Map");
    }

    static final /* synthetic */ void lambda$componentDidMount$3$ReactCommonModule(String str) {
        a reactViewById = ReactInstance.getReactViewById(str);
        if (reactViewById != null) {
            reactViewById.e();
        }
    }

    public ReactCommonModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void componentDidMount(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 34391, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 34391, new Class[]{String.class}, Void.TYPE);
            return;
        }
        UiThreadUtil.runOnUiThread(new d(str2));
    }

    @ReactMethod
    public void showToast(@Nullable String str) {
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 34382, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 34382, new Class[]{String.class}, Void.TYPE);
            return;
        }
        UiThreadUtil.runOnUiThread(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40920a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f40920a, false, 34396, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40920a, false, 34396, new Class[0], Void.TYPE);
                    return;
                }
                com.bytedance.ies.dmt.ui.d.a.c((Context) com.ss.android.ugc.aweme.framework.core.a.b().a(), str2).a();
            }
        });
    }

    @ReactMethod
    public void getUserInfo(Callback callback) {
        Callback callback2 = callback;
        if (PatchProxy.isSupport(new Object[]{callback2}, this, changeQuickRedirect, false, 34386, new Class[]{Callback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{callback2}, this, changeQuickRedirect, false, 34386, new Class[]{Callback.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (d.a().isLogin()) {
                User curUser = d.a().getCurUser();
                jSONObject.put("login", true);
                jSONObject.put("openid", curUser.getUid());
                jSONObject.put("bindPhone", curUser.getBindPhone());
                callback2.invoke(com.ss.android.ugc.aweme.framework.c.a.f48477a, jSONObject.toString());
                return;
            }
            jSONObject.put("login", false);
            callback2.invoke(com.ss.android.ugc.aweme.framework.c.a.f48477a, jSONObject.toString());
        } catch (Exception unused) {
            callback2.invoke("service get error", com.ss.android.ugc.aweme.framework.c.a.f48478b);
        }
    }

    @ReactMethod
    public void getAppInfo(Callback callback) {
        WritableMap writableMap;
        Callback callback2 = callback;
        if (PatchProxy.isSupport(new Object[]{callback2}, this, changeQuickRedirect, false, 34385, new Class[]{Callback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{callback2}, this, changeQuickRedirect, false, 34385, new Class[]{Callback.class}, Void.TYPE);
            return;
        }
        try {
            Object[] objArr = new Object[2];
            objArr[0] = com.ss.android.ugc.aweme.framework.c.a.f48477a;
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.crossplatform.platform.rn.a.a.f40831a, true, 34412, new Class[0], WritableMap.class)) {
                writableMap = (WritableMap) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.crossplatform.platform.rn.a.a.f40831a, true, 34412, new Class[0], WritableMap.class);
            } else {
                writableMap = Arguments.createMap();
                AppContext c2 = AwemeAppData.p().c();
                if (c2 == null) {
                    writableMap = null;
                } else {
                    writableMap.putString("appName", c2.getAppName());
                    writableMap.putInt("aid", c2.getAid());
                    writableMap.putString("appVersion", c2.getVersion());
                    writableMap.putInt("versionCode", c2.getVersionCode());
                    writableMap.putString("netType", NetworkUtils.getNetworkAccessType(c2.getContext()));
                    writableMap.putString("device_id", c2.getDeviceId());
                    writableMap.putString("user_id", c.d().getCurUserId());
                    writableMap.putString("channel", com.ss.android.ugc.aweme.framework.core.a.b().f3304b);
                    if (c2.getContext() != null) {
                        writableMap.putBoolean("ironManSupported", ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).checkMiniAppEnable(c2.getContext()));
                    }
                }
            }
            objArr[1] = writableMap;
            callback2.invoke(objArr);
        } catch (Exception e2) {
            callback2.invoke(e2.getMessage(), com.ss.android.ugc.aweme.framework.c.a.f48478b);
        }
    }

    static final /* synthetic */ void lambda$darkMode$2$ReactCommonModule(String str, Boolean bool) {
        a reactViewById = ReactInstance.getReactViewById(str);
        if (reactViewById != null) {
            reactViewById.a(bool.booleanValue());
        }
    }

    static final /* synthetic */ void lambda$close$0$ReactCommonModule(String str, Callback callback) {
        a reactViewById = ReactInstance.getReactViewById(str);
        if (reactViewById == null) {
            callback.invoke("illegal state to finish page.", com.ss.android.ugc.aweme.framework.c.a.f48478b);
            return;
        }
        reactViewById.d();
        callback.invoke(com.ss.android.ugc.aweme.framework.c.a.f48477a, com.ss.android.ugc.aweme.framework.c.a.f48478b);
    }

    @ReactMethod
    public void close(String str, Callback callback) {
        String str2 = str;
        Callback callback2 = callback;
        if (PatchProxy.isSupport(new Object[]{str2, callback2}, this, changeQuickRedirect, false, 34388, new Class[]{String.class, Callback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, callback2}, this, changeQuickRedirect, false, 34388, new Class[]{String.class, Callback.class}, Void.TYPE);
            return;
        }
        UiThreadUtil.runOnUiThread(new a(str2, callback2));
    }

    @ReactMethod
    public void darkMode(String str, Boolean bool) {
        String str2 = str;
        Boolean bool2 = bool;
        if (PatchProxy.isSupport(new Object[]{str2, bool2}, this, changeQuickRedirect, false, 34390, new Class[]{String.class, Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, bool2}, this, changeQuickRedirect, false, 34390, new Class[]{String.class, Boolean.class}, Void.TYPE);
            return;
        }
        UiThreadUtil.runOnUiThread(new c(str2, bool2));
    }

    @ReactMethod
    public void share(@Nullable ReadableMap readableMap, Callback callback) {
        ReadableMap readableMap2 = readableMap;
        Callback callback2 = callback;
        if (PatchProxy.isSupport(new Object[]{readableMap2, callback2}, this, changeQuickRedirect, false, 34389, new Class[]{ReadableMap.class, Callback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{readableMap2, callback2}, this, changeQuickRedirect, false, 34389, new Class[]{ReadableMap.class, Callback.class}, Void.TYPE);
        } else if (readableMap2 != null) {
            UiThreadUtil.runOnUiThread(new b(readableMap2, callback2));
        }
    }

    static final /* synthetic */ void lambda$share$1$ReactCommonModule(@Nullable ReadableMap readableMap, Callback callback) {
        int i;
        JSONObject jSONObject;
        boolean z;
        WeakReference weakReference = new WeakReference(p.a().e());
        boolean z2 = false;
        try {
            ai aiVar = new ai(new WeakReference(com.ss.android.ugc.aweme.framework.core.a.b().a()), null);
            if (PatchProxy.isSupport(new Object[]{readableMap}, null, j.f75436a, true, 87817, new Class[]{ReadableMap.class}, JSONObject.class)) {
                jSONObject = (JSONObject) PatchProxy.accessDispatch(new Object[]{readableMap}, null, j.f75436a, true, 87817, new Class[]{ReadableMap.class}, JSONObject.class);
            } else {
                jSONObject = new JSONObject(readableMap.toHashMap());
            }
            if (PatchProxy.isSupport(new Object[]{weakReference, jSONObject}, aiVar, ai.f76692a, false, 90028, new Class[]{WeakReference.class, JSONObject.class}, Boolean.TYPE)) {
                ai aiVar2 = aiVar;
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{weakReference, jSONObject}, aiVar2, ai.f76692a, false, 90028, new Class[]{WeakReference.class, JSONObject.class}, Boolean.TYPE)).booleanValue();
            } else {
                z = aiVar.a(weakReference, jSONObject, null);
            }
            z2 = z;
        } catch (Exception unused) {
        }
        if (z2) {
            i = com.ss.android.ugc.aweme.framework.c.a.f48479c;
        } else {
            i = com.ss.android.ugc.aweme.framework.c.a.f48480d;
        }
        j.a(callback, i);
    }

    @ReactMethod
    public void logEventV3(String str, @NonNull ReadableMap readableMap) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, readableMap}, this, changeQuickRedirect, false, 34384, new Class[]{String.class, ReadableMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, readableMap}, this, changeQuickRedirect, false, 34384, new Class[]{String.class, ReadableMap.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : readableMap.toHashMap().entrySet()) {
            hashMap.put(next.getKey(), String.valueOf(next.getValue()));
        }
        Activity a2 = com.ss.android.ugc.aweme.framework.core.a.b().a();
        if (PatchProxy.isSupport(new Object[]{a2, str2, hashMap}, null, b.f40833a, true, 34427, new Class[]{Context.class, String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{a2, str2, hashMap}, null, b.f40833a, true, 34427, new Class[]{Context.class, String.class, Map.class}, Void.TYPE);
            return;
        }
        if (a2 != null) {
            try {
                r.a(str2, (Map) hashMap);
            } catch (Exception unused) {
            }
        }
    }

    @ReactMethod
    public void openSchema(String str, String str2, Callback callback) {
        if (PatchProxy.isSupport(new Object[]{str, str2, callback}, this, changeQuickRedirect, false, 34387, new Class[]{String.class, String.class, Callback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, callback}, this, changeQuickRedirect, false, 34387, new Class[]{String.class, String.class, Callback.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.a.a.a(str, str2, callback);
    }

    @ReactMethod
    public void request(String str, ReadableMap readableMap, Callback callback) {
        final ArrayList arrayList;
        final String str2;
        ReadableMap readableMap2 = readableMap;
        final Callback callback2 = callback;
        if (PatchProxy.isSupport(new Object[]{str, readableMap2, callback2}, this, changeQuickRedirect, false, 34383, new Class[]{String.class, ReadableMap.class, Callback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, readableMap2, callback2}, this, changeQuickRedirect, false, 34383, new Class[]{String.class, ReadableMap.class, Callback.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(str) || readableMap2 == null) {
        } else if (readableMap2.getString(PushConstants.MZ_PUSH_MESSAGE_METHOD) != null) {
            String str3 = null;
            if (readableMap2.hasKey("header") && readableMap2.getType("header") == ReadableType.Map) {
                ReadableMap map = readableMap2.getMap("header");
                if (map != null) {
                    ArrayList arrayList2 = new ArrayList();
                    ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                    while (keySetIterator.hasNextKey()) {
                        String nextKey = keySetIterator.nextKey();
                        String a2 = com.ss.android.ugc.aweme.crossplatform.platform.rn.a.a.a(nextKey, map);
                        if (!TextUtils.isEmpty(a2)) {
                            arrayList2.add(new Header(nextKey, a2));
                            if ("content-type".equalsIgnoreCase(nextKey)) {
                                str3 = a2;
                            }
                        }
                    }
                    str2 = str3;
                    arrayList = arrayList2;
                    final ReadableMap map2 = readableMap2.getMap("params");
                    final String str4 = str;
                    final ReadableMap readableMap3 = readableMap;
                    AnonymousClass3 r0 = new Callable<Pair<String, com.ss.android.ugc.aweme.hybrid.monitor.b>>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f40926a;

                        public final /* synthetic */ Object call() throws Exception {
                            String str;
                            String str2;
                            com.ss.android.ugc.aweme.hybrid.monitor.b bVar;
                            String str3;
                            if (PatchProxy.isSupport(new Object[0], this, f40926a, false, 34398, new Class[0], Pair.class)) {
                                return (Pair) PatchProxy.accessDispatch(new Object[0], this, f40926a, false, 34398, new Class[0], Pair.class);
                            }
                            i iVar = new i(str4);
                            String upperCase = readableMap3.getString(PushConstants.MZ_PUSH_MESSAGE_METHOD).toUpperCase();
                            JSONObject jSONObject = null;
                            char c2 = 65535;
                            int hashCode = upperCase.hashCode();
                            if (hashCode != 70454) {
                                if (hashCode != 79599) {
                                    if (hashCode != 2461856) {
                                        if (hashCode == 2012838315 && upperCase.equals("DELETE")) {
                                            c2 = 3;
                                        }
                                    } else if (upperCase.equals("POST")) {
                                        c2 = 1;
                                    }
                                } else if (upperCase.equals("PUT")) {
                                    c2 = 2;
                                }
                            } else if (upperCase.equals("GET")) {
                                c2 = 0;
                            }
                            switch (c2) {
                                case 0:
                                    if (map2 != null) {
                                        ReadableMapKeySetIterator keySetIterator = map2.keySetIterator();
                                        while (keySetIterator.hasNextKey()) {
                                            String nextKey = keySetIterator.nextKey();
                                            String a2 = com.ss.android.ugc.aweme.crossplatform.platform.rn.a.a.a(nextKey, map2);
                                            if (a2 != null) {
                                                iVar.a(nextKey, a2);
                                            }
                                        }
                                    }
                                    str = iVar.toString();
                                    str2 = (String) ReactCommonModule.this.sApi.doGet(str, 0).execute().body();
                                    break;
                                case 1:
                                    jSONObject = com.ss.android.ugc.aweme.crossplatform.platform.rn.a.a.a(map2);
                                    if (str2 == null) {
                                        HashMap hashMap = new HashMap();
                                        if (jSONObject != null) {
                                            Iterator<String> keys = jSONObject.keys();
                                            while (keys.hasNext()) {
                                                String next = keys.next();
                                                String optString = jSONObject.optString(next);
                                                if (optString != null) {
                                                    hashMap.put(next, optString);
                                                }
                                            }
                                        }
                                        str = iVar.toString();
                                        NetUtil.putCommonParams(hashMap, true);
                                        str2 = (String) ReactCommonModule.this.sApi.doPost(str, 0, (Map<String, String>) hashMap).execute().body();
                                        break;
                                    } else {
                                        str = iVar.toString();
                                        str2 = cu.f75699b.b(str, com.ss.android.ugc.aweme.crossplatform.platform.rn.a.a.a(map2), str2, arrayList);
                                        break;
                                    }
                                case 2:
                                    jSONObject = com.ss.android.ugc.aweme.crossplatform.platform.rn.a.a.a(map2);
                                    if (str2 == null) {
                                        str = iVar.toString();
                                        str2 = cu.f75699b.a(str, jSONObject, "application/x-www-form-urlencoded", arrayList);
                                        break;
                                    } else {
                                        str = iVar.toString();
                                        str2 = cu.f75699b.a(str, jSONObject, str2, arrayList);
                                        break;
                                    }
                                case 3:
                                    ArrayList arrayList = new ArrayList();
                                    if (map2 != null) {
                                        ReadableMapKeySetIterator keySetIterator2 = map2.keySetIterator();
                                        if (!com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) arrayList)) {
                                            for (Header header : arrayList) {
                                                arrayList.add(new Header(header.getName(), header.getValue()));
                                            }
                                        }
                                        while (keySetIterator2.hasNextKey()) {
                                            String nextKey2 = keySetIterator2.nextKey();
                                            String a3 = com.ss.android.ugc.aweme.crossplatform.platform.rn.a.a.a(nextKey2, map2);
                                            if (a3 != null) {
                                                iVar.a(nextKey2, a3);
                                            }
                                        }
                                    }
                                    str = iVar.toString();
                                    str2 = (String) ReactCommonModule.this.sApi.doDelete(str, 0, arrayList).execute().body();
                                    break;
                                default:
                                    throw new Exception("method should be in [GET, POST, PUT, DELETE]");
                            }
                            if (str != null) {
                                String lowerCase = upperCase.toLowerCase();
                                if (jSONObject == null) {
                                    str3 = "";
                                } else {
                                    str3 = jSONObject.toString();
                                }
                                new com.ss.android.ugc.aweme.hybrid.monitor.b(str, lowerCase, str3);
                            } else {
                                bVar = new com.ss.android.ugc.aweme.hybrid.monitor.b("", "", "");
                            }
                            return new Pair(str2, bVar);
                        }
                    };
                    a.i.a((Callable<TResult>) r0).a((g<TResult, TContinuationResult>) new g<Pair<String, com.ss.android.ugc.aweme.hybrid.monitor.b>, Void>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f40923a;

                        /* access modifiers changed from: private */
                        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e0, code lost:
                            if (r2 != 0) goto L_0x00b0;
                         */
                        /* JADX WARNING: Removed duplicated region for block: B:35:0x00e6  */
                        /* JADX WARNING: Removed duplicated region for block: B:36:0x00f3  */
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public java.lang.Void then(a.i<android.support.v4.util.Pair<java.lang.String, com.ss.android.ugc.aweme.hybrid.monitor.b>> r18) throws java.lang.Exception {
                            /*
                                r17 = this;
                                r7 = r17
                                r8 = 1
                                java.lang.Object[] r0 = new java.lang.Object[r8]
                                r9 = 0
                                r0[r9] = r18
                                com.meituan.robust.ChangeQuickRedirect r2 = f40923a
                                java.lang.Class[] r5 = new java.lang.Class[r8]
                                java.lang.Class<a.i> r1 = a.i.class
                                r5[r9] = r1
                                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                                r3 = 0
                                r4 = 34397(0x865d, float:4.82E-41)
                                r1 = r17
                                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                                if (r0 == 0) goto L_0x0039
                                java.lang.Object[] r0 = new java.lang.Object[r8]
                                r0[r9] = r18
                                com.meituan.robust.ChangeQuickRedirect r2 = f40923a
                                r3 = 0
                                r4 = 34397(0x865d, float:4.82E-41)
                                java.lang.Class[] r5 = new java.lang.Class[r8]
                                java.lang.Class<a.i> r1 = a.i.class
                                r5[r9] = r1
                                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                                r1 = r17
                                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                                java.lang.Void r0 = (java.lang.Void) r0
                                return r0
                            L_0x0039:
                                java.lang.Object r0 = r18.e()
                                android.support.v4.util.Pair r0 = (android.support.v4.util.Pair) r0
                                boolean r1 = r18.d()
                                r2 = 2
                                r3 = 0
                                if (r1 == 0) goto L_0x0080
                                java.lang.Exception r1 = r18.f()
                                boolean r4 = r1 instanceof com.ss.android.http.a.a.b
                                if (r4 == 0) goto L_0x0057
                                r4 = r1
                                com.ss.android.http.a.a.b r4 = (com.ss.android.http.a.a.b) r4
                                int r4 = r4.getStatusCode()
                                goto L_0x0058
                            L_0x0057:
                                r4 = 1
                            L_0x0058:
                                com.facebook.react.bridge.WritableMap r5 = com.facebook.react.bridge.Arguments.createMap()
                                java.lang.String r6 = "statusCode"
                                r5.putInt(r6, r4)
                                java.lang.String r4 = "statusMessage"
                                java.lang.String r6 = r1.getMessage()
                                r5.putString(r4, r6)
                                com.facebook.react.bridge.Callback r4 = r7
                                java.lang.Object[] r2 = new java.lang.Object[r2]
                                r2[r9] = r5
                                java.lang.Object r5 = com.ss.android.ugc.aweme.framework.c.a.f48478b
                                r2[r8] = r5
                                r4.invoke(r2)
                                com.ss.android.ugc.aweme.hybrid.monitor.c r2 = new com.ss.android.ugc.aweme.hybrid.monitor.c
                                java.lang.String r4 = "network_error"
                                r2.<init>(r4, r1)
                                goto L_0x00f4
                            L_0x0080:
                                F r1 = r0.first
                                java.lang.String r1 = (java.lang.String) r1
                                com.facebook.react.bridge.Callback r4 = r7
                                java.lang.Object[] r2 = new java.lang.Object[r2]
                                java.lang.Object r5 = com.ss.android.ugc.aweme.framework.c.a.f48477a
                                r2[r9] = r5
                                r2[r8] = r1
                                r4.invoke(r2)
                                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0097 }
                                r2.<init>(r1)     // Catch:{ JSONException -> 0x0097 }
                                goto L_0x0098
                            L_0x0097:
                                r2 = r3
                            L_0x0098:
                                if (r2 == 0) goto L_0x00e3
                                java.lang.String r4 = "message"
                                boolean r4 = r2.has(r4)
                                if (r4 == 0) goto L_0x00b2
                                java.lang.String r4 = "success"
                                java.lang.String r5 = "message"
                                java.lang.String r5 = r2.optString(r5)
                                boolean r4 = r4.equals(r5)
                                if (r4 != 0) goto L_0x00b2
                            L_0x00b0:
                                r2 = 1
                                goto L_0x00e4
                            L_0x00b2:
                                java.lang.String r4 = "code"
                                boolean r4 = r2.has(r4)
                                if (r4 == 0) goto L_0x00c1
                                java.lang.String r4 = "code"
                                int r2 = r2.optInt(r4)
                                goto L_0x00e0
                            L_0x00c1:
                                java.lang.String r4 = "status_code"
                                boolean r4 = r2.has(r4)
                                if (r4 == 0) goto L_0x00d0
                                java.lang.String r4 = "status_code"
                                int r2 = r2.optInt(r4)
                                goto L_0x00e0
                            L_0x00d0:
                                java.lang.String r4 = "statusCode"
                                boolean r4 = r2.has(r4)
                                if (r4 == 0) goto L_0x00df
                                java.lang.String r4 = "statusCode"
                                int r2 = r2.optInt(r4)
                                goto L_0x00e0
                            L_0x00df:
                                r2 = 0
                            L_0x00e0:
                                if (r2 == 0) goto L_0x00e3
                                goto L_0x00b0
                            L_0x00e3:
                                r2 = 0
                            L_0x00e4:
                                if (r2 == 0) goto L_0x00f3
                                com.ss.android.ugc.aweme.hybrid.monitor.c r2 = new com.ss.android.ugc.aweme.hybrid.monitor.c
                                java.lang.String r4 = "api_error"
                                java.lang.Exception r5 = new java.lang.Exception
                                r5.<init>(r1)
                                r2.<init>(r4, r5)
                                goto L_0x00f4
                            L_0x00f3:
                                r2 = r3
                            L_0x00f4:
                                com.ss.android.ugc.aweme.crossplatform.a$a r1 = com.ss.android.ugc.aweme.crossplatform.a.f40658f
                                com.ss.android.ugc.aweme.crossplatform.a r1 = r1.a()
                                java.lang.String r1 = r1.f40659b
                                if (r1 == 0) goto L_0x014f
                                com.ss.android.ugc.aweme.crossplatform.a$a r4 = com.ss.android.ugc.aweme.crossplatform.a.f40658f
                                com.ss.android.ugc.aweme.crossplatform.a r4 = r4.a()
                                java.lang.Object[] r10 = new java.lang.Object[r8]
                                r10[r9] = r1
                                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.crossplatform.a.f40656a
                                r13 = 0
                                r14 = 34095(0x852f, float:4.7777E-41)
                                java.lang.Class[] r5 = new java.lang.Class[r8]
                                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                                r5[r9] = r6
                                java.lang.Class<com.ss.android.ugc.aweme.hybrid.monitor.f> r16 = com.ss.android.ugc.aweme.hybrid.monitor.f.class
                                r11 = r4
                                r15 = r5
                                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                                if (r5 == 0) goto L_0x0139
                                java.lang.Object[] r10 = new java.lang.Object[r8]
                                r10[r9] = r1
                                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.crossplatform.a.f40656a
                                r13 = 0
                                r14 = 34095(0x852f, float:4.7777E-41)
                                java.lang.Class[] r1 = new java.lang.Class[r8]
                                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                                r1[r9] = r5
                                java.lang.Class<com.ss.android.ugc.aweme.hybrid.monitor.f> r16 = com.ss.android.ugc.aweme.hybrid.monitor.f.class
                                r11 = r4
                                r15 = r1
                                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                                com.ss.android.ugc.aweme.hybrid.monitor.f r1 = (com.ss.android.ugc.aweme.hybrid.monitor.f) r1
                                goto L_0x0146
                            L_0x0139:
                                java.lang.String r5 = "sessionId"
                                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r5)
                                java.util.Map<java.lang.String, com.ss.android.ugc.aweme.hybrid.monitor.f> r4 = r4.f40660c
                                java.lang.Object r1 = r4.get(r1)
                                com.ss.android.ugc.aweme.hybrid.monitor.f r1 = (com.ss.android.ugc.aweme.hybrid.monitor.f) r1
                            L_0x0146:
                                if (r1 == 0) goto L_0x014f
                                S r0 = r0.second
                                com.ss.android.ugc.aweme.hybrid.monitor.b r0 = (com.ss.android.ugc.aweme.hybrid.monitor.b) r0
                                r1.a(r0, r2)
                            L_0x014f:
                                return r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.ReactCommonModule.AnonymousClass2.then(a.i):java.lang.Void");
                        }
                    }, a.i.f1052b);
                }
            }
            str2 = null;
            arrayList = null;
            final ReadableMap map22 = readableMap2.getMap("params");
            final String str42 = str;
            final ReadableMap readableMap32 = readableMap;
            AnonymousClass3 r02 = new Callable<Pair<String, com.ss.android.ugc.aweme.hybrid.monitor.b>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f40926a;

                public final /* synthetic */ Object call() throws Exception {
                    String str;
                    String str2;
                    com.ss.android.ugc.aweme.hybrid.monitor.b bVar;
                    String str3;
                    if (PatchProxy.isSupport(new Object[0], this, f40926a, false, 34398, new Class[0], Pair.class)) {
                        return (Pair) PatchProxy.accessDispatch(new Object[0], this, f40926a, false, 34398, new Class[0], Pair.class);
                    }
                    i iVar = new i(str42);
                    String upperCase = readableMap32.getString(PushConstants.MZ_PUSH_MESSAGE_METHOD).toUpperCase();
                    JSONObject jSONObject = null;
                    char c2 = 65535;
                    int hashCode = upperCase.hashCode();
                    if (hashCode != 70454) {
                        if (hashCode != 79599) {
                            if (hashCode != 2461856) {
                                if (hashCode == 2012838315 && upperCase.equals("DELETE")) {
                                    c2 = 3;
                                }
                            } else if (upperCase.equals("POST")) {
                                c2 = 1;
                            }
                        } else if (upperCase.equals("PUT")) {
                            c2 = 2;
                        }
                    } else if (upperCase.equals("GET")) {
                        c2 = 0;
                    }
                    switch (c2) {
                        case 0:
                            if (map22 != null) {
                                ReadableMapKeySetIterator keySetIterator = map22.keySetIterator();
                                while (keySetIterator.hasNextKey()) {
                                    String nextKey = keySetIterator.nextKey();
                                    String a2 = com.ss.android.ugc.aweme.crossplatform.platform.rn.a.a.a(nextKey, map22);
                                    if (a2 != null) {
                                        iVar.a(nextKey, a2);
                                    }
                                }
                            }
                            str = iVar.toString();
                            str2 = (String) ReactCommonModule.this.sApi.doGet(str, 0).execute().body();
                            break;
                        case 1:
                            jSONObject = com.ss.android.ugc.aweme.crossplatform.platform.rn.a.a.a(map22);
                            if (str2 == null) {
                                HashMap hashMap = new HashMap();
                                if (jSONObject != null) {
                                    Iterator<String> keys = jSONObject.keys();
                                    while (keys.hasNext()) {
                                        String next = keys.next();
                                        String optString = jSONObject.optString(next);
                                        if (optString != null) {
                                            hashMap.put(next, optString);
                                        }
                                    }
                                }
                                str = iVar.toString();
                                NetUtil.putCommonParams(hashMap, true);
                                str2 = (String) ReactCommonModule.this.sApi.doPost(str, 0, (Map<String, String>) hashMap).execute().body();
                                break;
                            } else {
                                str = iVar.toString();
                                str2 = cu.f75699b.b(str, com.ss.android.ugc.aweme.crossplatform.platform.rn.a.a.a(map22), str2, arrayList);
                                break;
                            }
                        case 2:
                            jSONObject = com.ss.android.ugc.aweme.crossplatform.platform.rn.a.a.a(map22);
                            if (str2 == null) {
                                str = iVar.toString();
                                str2 = cu.f75699b.a(str, jSONObject, "application/x-www-form-urlencoded", arrayList);
                                break;
                            } else {
                                str = iVar.toString();
                                str2 = cu.f75699b.a(str, jSONObject, str2, arrayList);
                                break;
                            }
                        case 3:
                            ArrayList arrayList = new ArrayList();
                            if (map22 != null) {
                                ReadableMapKeySetIterator keySetIterator2 = map22.keySetIterator();
                                if (!com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) arrayList)) {
                                    for (Header header : arrayList) {
                                        arrayList.add(new Header(header.getName(), header.getValue()));
                                    }
                                }
                                while (keySetIterator2.hasNextKey()) {
                                    String nextKey2 = keySetIterator2.nextKey();
                                    String a3 = com.ss.android.ugc.aweme.crossplatform.platform.rn.a.a.a(nextKey2, map22);
                                    if (a3 != null) {
                                        iVar.a(nextKey2, a3);
                                    }
                                }
                            }
                            str = iVar.toString();
                            str2 = (String) ReactCommonModule.this.sApi.doDelete(str, 0, arrayList).execute().body();
                            break;
                        default:
                            throw new Exception("method should be in [GET, POST, PUT, DELETE]");
                    }
                    if (str != null) {
                        String lowerCase = upperCase.toLowerCase();
                        if (jSONObject == null) {
                            str3 = "";
                        } else {
                            str3 = jSONObject.toString();
                        }
                        new com.ss.android.ugc.aweme.hybrid.monitor.b(str, lowerCase, str3);
                    } else {
                        bVar = new com.ss.android.ugc.aweme.hybrid.monitor.b("", "", "");
                    }
                    return new Pair(str2, bVar);
                }
            };
            a.i.a((Callable<TResult>) r02).a((g<TResult, TContinuationResult>) new g<Pair<String, com.ss.android.ugc.aweme.hybrid.monitor.b>, Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f40923a;

                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Void then(a.i r18) {
                    /*
                        r17 = this;
                        r7 = r17
                        r8 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        r9 = 0
                        r0[r9] = r18
                        com.meituan.robust.ChangeQuickRedirect r2 = f40923a
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class<a.i> r1 = a.i.class
                        r5[r9] = r1
                        java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                        r3 = 0
                        r4 = 34397(0x865d, float:4.82E-41)
                        r1 = r17
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x0039
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        r0[r9] = r18
                        com.meituan.robust.ChangeQuickRedirect r2 = f40923a
                        r3 = 0
                        r4 = 34397(0x865d, float:4.82E-41)
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class<a.i> r1 = a.i.class
                        r5[r9] = r1
                        java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                        r1 = r17
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        java.lang.Void r0 = (java.lang.Void) r0
                        return r0
                    L_0x0039:
                        java.lang.Object r0 = r18.e()
                        android.support.v4.util.Pair r0 = (android.support.v4.util.Pair) r0
                        boolean r1 = r18.d()
                        r2 = 2
                        r3 = 0
                        if (r1 == 0) goto L_0x0080
                        java.lang.Exception r1 = r18.f()
                        boolean r4 = r1 instanceof com.ss.android.http.a.a.b
                        if (r4 == 0) goto L_0x0057
                        r4 = r1
                        com.ss.android.http.a.a.b r4 = (com.ss.android.http.a.a.b) r4
                        int r4 = r4.getStatusCode()
                        goto L_0x0058
                    L_0x0057:
                        r4 = 1
                    L_0x0058:
                        com.facebook.react.bridge.WritableMap r5 = com.facebook.react.bridge.Arguments.createMap()
                        java.lang.String r6 = "statusCode"
                        r5.putInt(r6, r4)
                        java.lang.String r4 = "statusMessage"
                        java.lang.String r6 = r1.getMessage()
                        r5.putString(r4, r6)
                        com.facebook.react.bridge.Callback r4 = r7
                        java.lang.Object[] r2 = new java.lang.Object[r2]
                        r2[r9] = r5
                        java.lang.Object r5 = com.ss.android.ugc.aweme.framework.c.a.f48478b
                        r2[r8] = r5
                        r4.invoke(r2)
                        com.ss.android.ugc.aweme.hybrid.monitor.c r2 = new com.ss.android.ugc.aweme.hybrid.monitor.c
                        java.lang.String r4 = "network_error"
                        r2.<init>(r4, r1)
                        goto L_0x00f4
                    L_0x0080:
                        F r1 = r0.first
                        java.lang.String r1 = (java.lang.String) r1
                        com.facebook.react.bridge.Callback r4 = r7
                        java.lang.Object[] r2 = new java.lang.Object[r2]
                        java.lang.Object r5 = com.ss.android.ugc.aweme.framework.c.a.f48477a
                        r2[r9] = r5
                        r2[r8] = r1
                        r4.invoke(r2)
                        org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0097 }
                        r2.<init>(r1)     // Catch:{ JSONException -> 0x0097 }
                        goto L_0x0098
                    L_0x0097:
                        r2 = r3
                    L_0x0098:
                        if (r2 == 0) goto L_0x00e3
                        java.lang.String r4 = "message"
                        boolean r4 = r2.has(r4)
                        if (r4 == 0) goto L_0x00b2
                        java.lang.String r4 = "success"
                        java.lang.String r5 = "message"
                        java.lang.String r5 = r2.optString(r5)
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L_0x00b2
                    L_0x00b0:
                        r2 = 1
                        goto L_0x00e4
                    L_0x00b2:
                        java.lang.String r4 = "code"
                        boolean r4 = r2.has(r4)
                        if (r4 == 0) goto L_0x00c1
                        java.lang.String r4 = "code"
                        int r2 = r2.optInt(r4)
                        goto L_0x00e0
                    L_0x00c1:
                        java.lang.String r4 = "status_code"
                        boolean r4 = r2.has(r4)
                        if (r4 == 0) goto L_0x00d0
                        java.lang.String r4 = "status_code"
                        int r2 = r2.optInt(r4)
                        goto L_0x00e0
                    L_0x00d0:
                        java.lang.String r4 = "statusCode"
                        boolean r4 = r2.has(r4)
                        if (r4 == 0) goto L_0x00df
                        java.lang.String r4 = "statusCode"
                        int r2 = r2.optInt(r4)
                        goto L_0x00e0
                    L_0x00df:
                        r2 = 0
                    L_0x00e0:
                        if (r2 == 0) goto L_0x00e3
                        goto L_0x00b0
                    L_0x00e3:
                        r2 = 0
                    L_0x00e4:
                        if (r2 == 0) goto L_0x00f3
                        com.ss.android.ugc.aweme.hybrid.monitor.c r2 = new com.ss.android.ugc.aweme.hybrid.monitor.c
                        java.lang.String r4 = "api_error"
                        java.lang.Exception r5 = new java.lang.Exception
                        r5.<init>(r1)
                        r2.<init>(r4, r5)
                        goto L_0x00f4
                    L_0x00f3:
                        r2 = r3
                    L_0x00f4:
                        com.ss.android.ugc.aweme.crossplatform.a$a r1 = com.ss.android.ugc.aweme.crossplatform.a.f40658f
                        com.ss.android.ugc.aweme.crossplatform.a r1 = r1.a()
                        java.lang.String r1 = r1.f40659b
                        if (r1 == 0) goto L_0x014f
                        com.ss.android.ugc.aweme.crossplatform.a$a r4 = com.ss.android.ugc.aweme.crossplatform.a.f40658f
                        com.ss.android.ugc.aweme.crossplatform.a r4 = r4.a()
                        java.lang.Object[] r10 = new java.lang.Object[r8]
                        r10[r9] = r1
                        com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.crossplatform.a.f40656a
                        r13 = 0
                        r14 = 34095(0x852f, float:4.7777E-41)
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class<java.lang.String> r6 = java.lang.String.class
                        r5[r9] = r6
                        java.lang.Class<com.ss.android.ugc.aweme.hybrid.monitor.f> r16 = com.ss.android.ugc.aweme.hybrid.monitor.f.class
                        r11 = r4
                        r15 = r5
                        boolean r5 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                        if (r5 == 0) goto L_0x0139
                        java.lang.Object[] r10 = new java.lang.Object[r8]
                        r10[r9] = r1
                        com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.crossplatform.a.f40656a
                        r13 = 0
                        r14 = 34095(0x852f, float:4.7777E-41)
                        java.lang.Class[] r1 = new java.lang.Class[r8]
                        java.lang.Class<java.lang.String> r5 = java.lang.String.class
                        r1[r9] = r5
                        java.lang.Class<com.ss.android.ugc.aweme.hybrid.monitor.f> r16 = com.ss.android.ugc.aweme.hybrid.monitor.f.class
                        r11 = r4
                        r15 = r1
                        java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                        com.ss.android.ugc.aweme.hybrid.monitor.f r1 = (com.ss.android.ugc.aweme.hybrid.monitor.f) r1
                        goto L_0x0146
                    L_0x0139:
                        java.lang.String r5 = "sessionId"
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r5)
                        java.util.Map<java.lang.String, com.ss.android.ugc.aweme.hybrid.monitor.f> r4 = r4.f40660c
                        java.lang.Object r1 = r4.get(r1)
                        com.ss.android.ugc.aweme.hybrid.monitor.f r1 = (com.ss.android.ugc.aweme.hybrid.monitor.f) r1
                    L_0x0146:
                        if (r1 == 0) goto L_0x014f
                        S r0 = r0.second
                        com.ss.android.ugc.aweme.hybrid.monitor.b r0 = (com.ss.android.ugc.aweme.hybrid.monitor.b) r0
                        r1.a(r0, r2)
                    L_0x014f:
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.ReactCommonModule.AnonymousClass2.then(a.i):java.lang.Void");
                }
            }, a.i.f1052b);
        }
    }
}
