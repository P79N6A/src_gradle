package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.google.common.a.u;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.upload.a.b;
import com.ss.ttuploader.UploadEventManager;
import java.io.File;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class hj implements k<VideoCreation> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68147a;

    /* renamed from: b  reason: collision with root package name */
    final String f68148b;

    /* renamed from: c  reason: collision with root package name */
    String f68149c;

    /* renamed from: d  reason: collision with root package name */
    private b f68150d;

    private void a(JSONArray jSONArray) {
        if (PatchProxy.isSupport(new Object[]{jSONArray}, this, f68147a, false, 74855, new Class[]{JSONArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONArray}, this, f68147a, false, 74855, new Class[]{JSONArray.class}, Void.TYPE);
            return;
        }
        if (jSONArray != null) {
            Context context = GlobalContext.getContext();
            ArrayList<String> b2 = l.a().b();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    jSONObject.put("aweme_sdkextra", b2);
                    jSONObject.put("aweme_upload_speed", this.f68150d.getSpeed());
                    jSONObject.put("aweme_speed_start", this.f68150d.getStartTime());
                    jSONObject.put("aweme_speed_end", this.f68150d.getEndTime());
                    jSONObject.put("aweme_video_resolution", this.f68149c);
                    AppLog.recordMiscLog(context, "video_upload", jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
        VideoCreation videoCreation = (VideoCreation) obj;
        if (PatchProxy.isSupport(new Object[]{videoCreation}, this, f68147a, false, 74853, new Class[]{VideoCreation.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoCreation}, this, f68147a, false, 74853, new Class[]{VideoCreation.class}, Void.TYPE);
            return;
        }
        JSONArray popAllEvents = UploadEventManager.instance.popAllEvents();
        n.a("upload_error_sdk", 0, bi.a().a("events", popAllEvents.toString()).b());
        a(popAllEvents);
    }

    public final void onFailure(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f68147a, false, 74854, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f68147a, false, 74854, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        int a2 = cu.a(12, th);
        String b2 = u.b(th);
        JSONArray popAllEvents = UploadEventManager.instance.popAllEvents();
        n.a("upload_error_sdk", 1, bi.a().a("events", popAllEvents.toString()).a("exception", b2).b());
        n.a("aweme_movie_publish_error_rate_sdk", a2, bi.a().a("exception", b2).b());
        l a3 = l.a();
        a3.a("output file: " + this.f68148b);
        if (this.f68148b != null) {
            l a4 = l.a();
            a4.a(" size: " + new File(this.f68148b).length());
        } else {
            l.a().a("output file == null");
        }
        a(popAllEvents);
    }

    public hj(String str, String str2, b bVar) {
        this.f68148b = str;
        this.f68149c = str2;
        this.f68150d = bVar;
    }
}
