package com.ss.android.ugc.aweme.flow.manager.impl;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.network.http.retrofit.converter.gson.GsonConverterFactory;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.client.Client;
import com.bytedance.ttnet.retrofit.SsRetrofitClient;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.net.a;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.Subscribe;

public class d implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3243a = null;

    /* renamed from: b  reason: collision with root package name */
    protected static final String f3244b = "d";

    /* renamed from: d  reason: collision with root package name */
    public static boolean f3245d;
    private static d l;

    /* renamed from: c  reason: collision with root package name */
    protected final String f3246c = "CMCC_PASS_CODE";

    /* renamed from: e  reason: collision with root package name */
    protected String f3247e = "";

    /* renamed from: f  reason: collision with root package name */
    protected Retrofit f3248f;
    protected IMobileFlowApi g;
    protected int h;
    protected Context i = k.a();
    protected WeakHandler j = new WeakHandler(Looper.getMainLooper(), this);
    protected final String k = "CMCC_SIM";
    private int m = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;

    private d() {
    }

    private boolean e() {
        if (!PatchProxy.isSupport(new Object[0], this, f3243a, false, 44482, new Class[0], Boolean.TYPE)) {
            return NetworkUtils.isMobile(this.i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3243a, false, 44482, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3243a, false, 44490, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3243a, false, 44490, new Class[0], Void.TYPE);
            return;
        }
        SharePrefCache.inst().getLastUploadPassCode().a(h());
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3243a, false, 44492, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3243a, false, 44492, new Class[0], Void.TYPE);
            return;
        }
        if (g()) {
            this.j.sendEmptyMessage(4);
        }
        if (f()) {
            bg.c(this);
        }
    }

    public static d a() {
        if (PatchProxy.isSupport(new Object[0], null, f3243a, true, 44480, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f3243a, true, 44480, new Class[0], d.class);
        }
        if (l == null) {
            synchronized (d.class) {
                if (l == null) {
                    l = new d();
                }
            }
        }
        return l;
    }

    private boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f3243a, false, 44486, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3243a, false, 44486, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String lowerCase = Build.BRAND.toLowerCase();
        String str = Build.MODEL;
        if (!TextUtils.equals(lowerCase, "coolpad") || !str.contains("A8-932") || Build.VERSION.SDK_INT != 21) {
            return ((Boolean) SharePrefCache.inst().getEnableUploadPC().c()).booleanValue();
        }
        return false;
    }

    private boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f3243a, false, 44488, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3243a, false, 44488, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (f3245d || (f() && e() && d())) {
            return true;
        } else {
            return false;
        }
    }

    private String h() {
        if (PatchProxy.isSupport(new Object[0], this, f3243a, false, 44491, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f3243a, false, 44491, new Class[0], String.class);
        }
        return com.ss.android.ugc.aweme.account.d.a().getCurUserId() + "#" + f.a(this.i) + "#" + AppLog.getServerDeviceId();
    }

    private boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f3243a, false, 44481, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3243a, false, 44481, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Context context = this.i;
        if (PatchProxy.isSupport(new Object[]{context}, null, f.f47700a, true, 44505, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f.f47700a, true, 44505, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        String a2 = f.a(context);
        if (TextUtils.isEmpty(a2) || (!a2.startsWith("46000") && !a2.startsWith("46002") && !a2.startsWith("46007"))) {
            return false;
        }
        return true;
    }

    @Subscribe
    public void onEvent(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3243a, false, 44487, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3243a, false, 44487, new Class[]{a.class}, Void.TYPE);
        } else if (this.m != aVar.f40269d) {
            this.m = aVar.f40269d;
            if (aVar.f40269d == a.f40267b && g()) {
                this.j.removeMessages(4);
                this.j.removeMessages(1);
                this.j.sendEmptyMessage(4);
            }
        }
    }

    public void handleMsg(Message message) {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{message}, this, f3243a, false, 44489, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f3243a, false, 44489, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message.what == 4) {
            this.j.removeMessages(4);
            if (PatchProxy.isSupport(new Object[0], this, f3243a, false, 44483, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3243a, false, 44483, new Class[0], Void.TYPE);
            } else if (g()) {
                if (PatchProxy.isSupport(new Object[0], this, f3243a, false, 44484, new Class[0], String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[0], this, f3243a, false, 44484, new Class[0], String.class);
                } else {
                    str = (String) SharePrefCache.inst().getLastUploadPassCode().c();
                }
                if (TextUtils.isEmpty(str) || !TextUtils.equals(h(), str)) {
                    if (this.f3248f == null) {
                        AnonymousClass1 r0 = new Client.Provider() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f47691a;

                            public final Client get() {
                                if (!PatchProxy.isSupport(new Object[0], this, f47691a, false, 44493, new Class[0], Client.class)) {
                                    return new SsRetrofitClient();
                                }
                                return (Client) PatchProxy.accessDispatch(new Object[0], this, f47691a, false, 44493, new Class[0], Client.class);
                            }
                        };
                        Retrofit.a aVar = new Retrofit.a();
                        if (f3245d) {
                            str3 = "http://121.15.167.251:30030";
                        } else {
                            str3 = "http://wap.cmpassport.com";
                        }
                        this.f3248f = aVar.a(str3).a((Client.Provider) r0).a((Executor) new com.bytedance.frameworks.baselib.network.http.retrofit.a()).a((Converter.Factory) GsonConverterFactory.create()).a();
                    }
                    if (this.g == null) {
                        this.g = (IMobileFlowApi) this.f3248f.create(IMobileFlowApi.class);
                    }
                    if (f3245d) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("expandParams", "phoneNum=15710066003");
                        str2 = c.a("/umcopenapi/wabpGetUseInfo?", hashMap);
                    } else {
                        str2 = c.a("/openapi/wabpGetUseInfo?", null);
                    }
                    this.g.getPassCode(str2).enqueue(new c<a>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f47693a;

                        public final void a(Call<a> call, Throwable th) {
                        }

                        public final void a(Call<a> call, SsResponse<a> ssResponse) {
                            q qVar;
                            if (PatchProxy.isSupport(new Object[]{call, ssResponse}, this, f47693a, false, 44494, new Class[]{Call.class, SsResponse.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{call, ssResponse}, this, f47693a, false, 44494, new Class[]{Call.class, SsResponse.class}, Void.TYPE);
                            } else if (ssResponse != null) {
                                a aVar = (a) ssResponse.body();
                                if (aVar != null && aVar.f47681e == 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("cmccCertify", aVar.toString());
                                    AppLogNewUtils.onEventV3Bundle("getPassCodeFromServerSuccess", bundle);
                                    d.this.f3247e = aVar.f47680d;
                                    String str = aVar.f47680d;
                                    if (PatchProxy.isSupport(new Object[]{str}, null, UpdateMobilePassCodeApiManager.f47675a, true, 44506, new Class[]{String.class}, q.class)) {
                                        qVar = (q) PatchProxy.accessDispatch(new Object[]{str}, null, UpdateMobilePassCodeApiManager.f47675a, true, 44506, new Class[]{String.class}, q.class);
                                    } else {
                                        qVar = UpdateMobilePassCodeApiManager.f47676b.upload(str);
                                    }
                                    l.a(qVar, new com.google.common.util.concurrent.k<BaseResponse>() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f47695a;

                                        public final void onFailure(Throwable th) {
                                        }

                                        public final /* synthetic */ void onSuccess(Object obj) {
                                            BaseResponse baseResponse = (BaseResponse) obj;
                                            if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f47695a, false, 44495, new Class[]{BaseResponse.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f47695a, false, 44495, new Class[]{BaseResponse.class}, Void.TYPE);
                                                return;
                                            }
                                            d.this.b();
                                        }
                                    });
                                    d.this.h = 0;
                                    d.this.j.sendEmptyMessage(1);
                                }
                            }
                        }
                    });
                }
            }
        }
    }
}
