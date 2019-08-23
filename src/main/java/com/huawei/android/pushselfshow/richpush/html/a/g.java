package com.huawei.android.pushselfshow.richpush.html.a;

import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.richpush.html.a.f;
import com.huawei.android.pushselfshow.richpush.html.api.d;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONObject;

public class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f25300a;

    g(f fVar) {
        this.f25300a = fVar;
    }

    public void run() {
        try {
            e.e("PushSelfShowLog", "getPlayingStatusRb getPlayingStatus this.state = " + this.f25300a.f25292e);
            if (f.a.MEDIA_RUNNING.ordinal() == this.f25300a.f25292e.ordinal()) {
                long i = this.f25300a.i();
                float b2 = this.f25300a.k();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("current_postion", i);
                    jSONObject.put("duration", (double) b2);
                    jSONObject.put(PushConstants.WEB_URL, this.f25300a.f25293f);
                    this.f25300a.j.a(this.f25300a.f25288a, d.a.OK, "status", jSONObject);
                } catch (Exception e2) {
                    e.d("PushSelfShowLog", "getPlayingStatus error", e2);
                }
            }
        } catch (Exception e3) {
            e.d("PushSelfShowLog", "getPlayingStatusRb run error", e3);
        }
        if (f.a.MEDIA_NONE.ordinal() != this.f25300a.f25292e.ordinal() && f.a.MEDIA_STOPPED.ordinal() != this.f25300a.f25292e.ordinal()) {
            this.f25300a.f25289b.postDelayed(this, (long) this.f25300a.g);
        }
    }
}
