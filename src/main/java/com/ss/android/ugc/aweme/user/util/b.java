package com.ss.android.ugc.aweme.user.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public class b implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75403a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f75404b;

    /* renamed from: c  reason: collision with root package name */
    private WeakHandler f75405c = new WeakHandler(Looper.getMainLooper(), this);

    private b() {
    }

    public static final b a() {
        if (PatchProxy.isSupport(new Object[0], null, f75403a, true, 87748, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f75403a, true, 87748, new Class[0], b.class);
        }
        if (f75404b == null) {
            synchronized (b.class) {
                if (f75404b == null) {
                    f75404b = new b();
                }
            }
        }
        return f75404b;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f75403a, false, 87750, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75403a, false, 87750, new Class[0], Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - ((Long) SharePrefCache.inst().getContactsUploadedLastTime().c()).longValue();
        if (((Boolean) SharePrefCache.inst().getConfirmUploadContacts().c()).booleanValue() && d.a().isLogin() && ap.b(k.a()) && currentTimeMillis > 518400000) {
            a(this.f75405c, 115);
        }
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f75403a, false, 87753, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f75403a, false, 87753, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message2.what == 115) {
            if (PatchProxy.isSupport(new Object[]{message2}, this, f75403a, false, 87752, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f75403a, false, 87752, new Class[]{Message.class}, Void.TYPE);
            } else if (!a.a()) {
                SharePrefCache.inst().getIsContactsUploaded().a(Boolean.TRUE);
                SharePrefCache.inst().getContactsUploadedLastTime().a(Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    @MeasureFunction
    public final void a(@NonNull Handler handler, int i) {
        Handler handler2 = handler;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{handler2, Integer.valueOf(i)}, this, f75403a, false, 87749, new Class[]{Handler.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, Integer.valueOf(i)}, this, f75403a, false, 87749, new Class[]{Handler.class, Integer.TYPE}, Void.TYPE);
        } else if (a.a()) {
            m.a().a(handler2, c.f75409b, i2);
        } else {
            m.a().a(handler2, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f75406a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f75406a, false, 87755, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f75406a, false, 87755, new Class[0], Object.class);
                    }
                    List a2 = ap.a(k.a());
                    if (CollectionUtils.isEmpty(a2)) {
                        return null;
                    }
                    if (PatchProxy.isSupport(new Object[]{a2}, null, UploadContactsApi.f48826a, true, 46378, new Class[]{List.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{a2}, null, UploadContactsApi.f48826a, true, 46378, new Class[]{List.class}, Void.TYPE);
                    } else {
                        HashMap hashMap = new HashMap();
                        if (!CollectionUtils.isEmpty(a2)) {
                            hashMap.put("contact", new Gson().toJson((Object) a2));
                        }
                        UploadContactsApi.f48827b.uploadContacts(PushConstants.PUSH_TYPE_NOTIFY, hashMap).execute();
                    }
                    return null;
                }
            }, i2);
        }
    }
}
