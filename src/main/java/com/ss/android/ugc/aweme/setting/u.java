package com.ss.android.ugc.aweme.setting;

import a.i;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.feed.share.f;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;
import com.ss.android.ugc.aweme.share.cl;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class u implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64069a;

    /* renamed from: e  reason: collision with root package name */
    private static u f64070e;

    /* renamed from: b  reason: collision with root package name */
    protected ShareSettingApi f64071b = ((ShareSettingApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(ShareSettingApi.class));

    /* renamed from: c  reason: collision with root package name */
    protected WeakHandler f64072c = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: d  reason: collision with root package name */
    public ShareSettings f64073d;

    public u() {
        c();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f64069a, false, 72087, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64069a, false, 72087, new Class[0], Void.TYPE);
            return;
        }
        m.a().a(this.f64072c, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64074a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f64074a, false, 72092, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f64074a, false, 72092, new Class[0], Object.class);
                }
                try {
                    return (ShareSettings) u.this.f64071b.queryRawSetting().get();
                } catch (ExecutionException e2) {
                    throw com.ss.android.ugc.aweme.app.api.m.a(e2);
                }
            }
        }, 0);
    }

    public final i<Boolean> c() {
        if (!PatchProxy.isSupport(new Object[0], this, f64069a, false, 72089, new Class[0], i.class)) {
            return i.a((Callable<TResult>) new Callable<Boolean>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64076a;

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Boolean call() throws Exception {
                    String str;
                    if (PatchProxy.isSupport(new Object[0], this, f64076a, false, 72093, new Class[0], Boolean.class)) {
                        return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f64076a, false, 72093, new Class[0], Boolean.class);
                    }
                    if (PatchProxy.isSupport(new Object[0], null, v.f64463a, true, 72095, new Class[0], String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[0], null, v.f64463a, true, 72095, new Class[0], String.class);
                    } else {
                        str = v.f64464b.getString("share_setting_key", "");
                    }
                    if (TextUtils.isEmpty(str)) {
                        return Boolean.FALSE;
                    }
                    try {
                        ShareSettings shareSettings = (ShareSettings) new Gson().fromJson(str, ShareSettings.class);
                        t tVar = new t();
                        List<cl> list = shareSettings.sharePlatforms;
                        if (PatchProxy.isSupport(new Object[]{list}, tVar, t.f64068a, false, 72084, new Class[]{List.class}, Void.TYPE)) {
                            t tVar2 = tVar;
                            PatchProxy.accessDispatch(new Object[]{list}, tVar2, t.f64068a, false, 72084, new Class[]{List.class}, Void.TYPE);
                        } else {
                            f.a().f46049b = list;
                        }
                        List<Object> list2 = shareSettings.shareOrderList;
                        if (PatchProxy.isSupport(new Object[]{list2}, tVar, t.f64068a, false, 72085, new Class[]{List.class}, Void.TYPE)) {
                            t tVar3 = tVar;
                            PatchProxy.accessDispatch(new Object[]{list2}, tVar3, t.f64068a, false, 72085, new Class[]{List.class}, Void.TYPE);
                        } else {
                            f.a().f46050c = list2;
                        }
                        u.this.f64073d = shareSettings;
                    } catch (Exception unused) {
                    }
                    return Boolean.TRUE;
                }
            });
        }
        return (i) PatchProxy.accessDispatch(new Object[0], this, f64069a, false, 72089, new Class[0], i.class);
    }

    public static u a() {
        if (PatchProxy.isSupport(new Object[0], null, f64069a, true, 72086, new Class[0], u.class)) {
            return (u) PatchProxy.accessDispatch(new Object[0], null, f64069a, true, 72086, new Class[0], u.class);
        }
        if (f64070e == null) {
            synchronized (u.class) {
                if (f64070e == null) {
                    f64070e = new u();
                }
            }
        }
        return f64070e;
    }

    @MeasureFunction
    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f64069a, false, 72090, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f64069a, false, 72090, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        a(message2.obj);
    }

    public final void a(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f64069a, false, 72088, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2}, this, f64069a, false, 72088, new Class[]{Object.class}, Void.TYPE);
        } else if (obj2 instanceof Exception) {
            c();
            w.a(((Exception) obj2).getMessage());
        } else {
            if (obj2 instanceof ShareSettings) {
                final ShareSettings shareSettings = (ShareSettings) obj2;
                if (PatchProxy.isSupport(new Object[]{shareSettings}, this, f64069a, false, 72091, new Class[]{ShareSettings.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{shareSettings}, this, f64069a, false, 72091, new Class[]{ShareSettings.class}, Void.TYPE);
                } else if (shareSettings == null) {
                    w.a("null");
                } else {
                    if (CollectionUtils.isEmpty(shareSettings.sharePlatforms)) {
                        w.a("size0");
                    }
                    a.a(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f64078a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f64078a, false, 72094, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f64078a, false, 72094, new Class[0], Void.TYPE);
                                return;
                            }
                            String json = new Gson().toJson((Object) shareSettings);
                            if (PatchProxy.isSupport(new Object[]{json}, null, v.f64463a, true, 72097, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{json}, null, v.f64463a, true, 72097, new Class[]{String.class}, Void.TYPE);
                            } else {
                                v.f64464b.edit().putString("share_setting_key", json).commit();
                                v.f64464b.edit().putBoolean("key_has_setting", !TextUtils.isEmpty(json)).commit();
                            }
                            u.this.c();
                        }
                    });
                }
            }
        }
    }
}
