package com.ss.android.ugc.aweme.photo;

import android.app.Application;
import android.support.annotation.NonNull;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.cu;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.ss.ttuploader.UploadEventManager;
import org.json.JSONArray;
import org.json.JSONException;

public final class u implements k<VideoCreation> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58793a;

    private void a(JSONArray jSONArray) {
        JSONArray jSONArray2 = jSONArray;
        if (PatchProxy.isSupport(new Object[]{jSONArray2}, this, f58793a, false, 63609, new Class[]{JSONArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONArray2}, this, f58793a, false, 63609, new Class[]{JSONArray.class}, Void.TYPE);
            return;
        }
        if (jSONArray2 != null) {
            Application application = a.f61119b;
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    AppLog.recordMiscLog(application, "image_upload", jSONArray2.getJSONObject(i));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        VideoCreation videoCreation = (VideoCreation) obj;
        if (PatchProxy.isSupport(new Object[]{videoCreation}, this, f58793a, false, 63607, new Class[]{VideoCreation.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoCreation}, this, f58793a, false, 63607, new Class[]{VideoCreation.class}, Void.TYPE);
            return;
        }
        a(UploadEventManager.instance.popAllImageEvents());
    }

    public final void onFailure(@NonNull Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f58793a, false, 63608, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f58793a, false, 63608, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        int a2 = cu.a(12, th2);
        String b2 = com.google.common.a.u.b(th);
        JSONArray popAllImageEvents = UploadEventManager.instance.popAllImageEvents();
        n.b("aweme_photo_publish_log", "upload_error_sdk", c.a().a("events", popAllImageEvents.toString()).a("exception", b2).b());
        n.a("aweme_photo_publish_error_rate", a2, c.a().a("events", popAllImageEvents.toString()).a("exception", b2).b());
        a(popAllImageEvents);
    }
}
