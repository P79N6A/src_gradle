package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.a.q;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class hk implements k<VideoCreation> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68151a;

    /* renamed from: b  reason: collision with root package name */
    q f68152b = q.b();

    /* renamed from: c  reason: collision with root package name */
    File f68153c;

    public final void onFailure(Throwable th) {
    }

    public hk(String str) {
        this.f68153c = new File(str);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        VideoCreation videoCreation = (VideoCreation) obj;
        if (PatchProxy.isSupport(new Object[]{videoCreation}, this, f68151a, false, 74856, new Class[]{VideoCreation.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoCreation}, this, f68151a, false, 74856, new Class[]{VideoCreation.class}, Void.TYPE);
            return;
        }
        if (this.f68153c.exists()) {
            long a2 = this.f68152b.a(TimeUnit.MILLISECONDS);
            float f2 = (float) a2;
            float length = ((float) this.f68153c.length()) / f2;
            n.a("aweme_movie_publish", "upload_file_time", f2);
            n.a("aweme_movie_publish", "upload_file_speed", length);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", a2);
                jSONObject.put("fileSize", this.f68153c.length());
                jSONObject.put("speed", (double) length);
            } catch (JSONException unused) {
            }
            n.b("aweme_movie_publish_performance", "upload_time", jSONObject);
        }
    }
}
