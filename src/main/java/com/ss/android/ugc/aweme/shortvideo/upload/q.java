package com.ss.android.ugc.aweme.shortvideo.upload;

import android.content.Context;
import com.google.common.a.u;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.aweme.shortvideo.cu;
import com.ss.android.ugc.aweme.shortvideo.l;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.upload.b.b;
import com.ss.ttuploader.UploadEventManager;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class q implements k<VideoCreation> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71034a;

    /* renamed from: b  reason: collision with root package name */
    final String f71035b;

    /* renamed from: c  reason: collision with root package name */
    String f71036c;

    /* renamed from: d  reason: collision with root package name */
    private com.google.common.a.q f71037d = com.google.common.a.q.b();

    /* renamed from: e  reason: collision with root package name */
    private b f71038e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.upload.a.b f71039f;

    public final void onFailure(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f71034a, false, 80793, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f71034a, false, 80793, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        int a2 = cu.a(12, th);
        if (th instanceof p) {
            p pVar = (p) th;
            if (pVar.getErrorCode() != 0) {
                a2 = (int) pVar.getErrorCode();
            }
        }
        String b2 = u.b(th);
        JSONArray popAllEvents = UploadEventManager.instance.popAllEvents();
        n.a("upload_error_parallel", a2, bi.a().a("events", popAllEvents.toString()).a("exception", b2).b());
        String arrayList = o.a().b().toString();
        n.a("aweme_movie_publish_error_rate_parallel", a2, bi.a().a("exception", b2).a("event", arrayList).b());
        l a3 = l.a();
        a3.a("output file: " + this.f71035b);
        if (this.f71035b != null) {
            l a4 = l.a();
            a4.a(" size: " + new File(this.f71035b).length());
        } else {
            l.a().a("output file == null");
        }
        a(popAllEvents, arrayList);
    }

    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
        VideoCreation videoCreation = (VideoCreation) obj;
        if (PatchProxy.isSupport(new Object[]{videoCreation}, this, f71034a, false, 80792, new Class[]{VideoCreation.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoCreation}, this, f71034a, false, 80792, new Class[]{VideoCreation.class}, Void.TYPE);
            return;
        }
        JSONArray popAllEvents = UploadEventManager.instance.popAllEvents();
        bi a2 = bi.a().a("events", popAllEvents.toString());
        if (new File(this.f71035b).exists()) {
            long a3 = this.f71037d.a(TimeUnit.MILLISECONDS);
            a2.a("speed", Float.valueOf(((float) new File(this.f71035b).length()) / ((float) a3))).a("duration", Long.valueOf(a3));
        }
        n.a("upload_error_parallel", 0, a2.b());
        a(popAllEvents, "");
    }

    private void a(JSONArray jSONArray, String str) {
        if (PatchProxy.isSupport(new Object[]{jSONArray, str}, this, f71034a, false, 80794, new Class[]{JSONArray.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONArray, str}, this, f71034a, false, 80794, new Class[]{JSONArray.class, String.class}, Void.TYPE);
            return;
        }
        if (jSONArray != null) {
            Context context = GlobalContext.getContext();
            ArrayList b2 = l.a().b();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    jSONObject.put("aweme_sdkextra", b2);
                    jSONObject.put("aweme_video_resolution", this.f71036c);
                    jSONObject.put("aweme_parallel_log", str);
                    jSONObject.put("aweme_upload_speed", this.f71039f.getSpeed());
                    jSONObject.put("aweme_speed_start", this.f71039f.getStartTime());
                    jSONObject.put("aweme_speed_end", this.f71039f.getEndTime());
                    jSONObject.put("aweme_synthetic_start", this.f71038e.f71007b);
                    jSONObject.put("aweme_synthetic_end", this.f71038e.f71008c);
                    jSONObject.put("aweme_upload_offset_size_when_synthetic_end", this.f71038e.f71009d);
                    jSONObject.put("aweme_to_upload_size_when_synthetic_end", this.f71038e.f71010e);
                    AppLog.recordMiscLog(context, "video_upload", jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public q(String str, String str2, com.ss.android.ugc.aweme.shortvideo.upload.a.b bVar, b bVar2) {
        this.f71035b = str;
        this.f71036c = str2;
        this.f71039f = bVar;
        this.f71038e = bVar2;
    }
}
