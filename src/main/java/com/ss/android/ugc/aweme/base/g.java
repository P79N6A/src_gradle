package com.ss.android.ugc.aweme.base;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONObject;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34741a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageRequest f34742b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f34743c;

    g(ImageRequest imageRequest, Throwable th) {
        this.f34742b = imageRequest;
        this.f34743c = th;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f34741a, false, 24002, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34741a, false, 24002, new Class[0], Void.TYPE);
            return;
        }
        ImageRequest imageRequest = this.f34742b;
        Throwable th = this.f34743c;
        Uri sourceUri = imageRequest.getSourceUri();
        Application application = a.b().f3307e;
        String uri = sourceUri != null ? sourceUri.toString() : null;
        if (PatchProxy.isSupport(new Object[]{application, uri, th}, null, e.f34731a, true, 23994, new Class[]{Context.class, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application, uri, th}, null, e.f34731a, true, 23994, new Class[]{Context.class, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        if (NetworkUtils.isNetworkAvailable(application)) {
            JSONObject jSONObject = new JSONObject();
            try {
                String th2 = th.toString();
                jSONObject.put("errorDesc", th2);
                jSONObject.put(PushConstants.WEB_URL, uri);
                jSONObject.put("userId", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
                jSONObject.put("networkType", NetworkUtils.getNetworkAccessType((Context) application));
                n.b("aweme_image_load_log", "image_error", jSONObject);
                n.a("aweme_image_load_error_rate", e.a(th2), jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
