package com.ss.android.ugc.aweme.im.sdk.chat.net;

import com.bytedance.common.utility.io.FileUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.utils.av;
import com.ss.android.ugc.aweme.im.sdk.utils.aw;
import com.ss.android.ugc.aweme.im.sdk.utils.g;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class l extends ab implements k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50942a;

    /* renamed from: c  reason: collision with root package name */
    private static int f50943c;

    /* renamed from: b  reason: collision with root package name */
    public String f50944b;

    /* renamed from: d  reason: collision with root package name */
    private aw f50945d;

    /* renamed from: e  reason: collision with root package name */
    private k f50946e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50942a, false, 51268, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50942a, false, 51268, new Class[0], Void.TYPE);
            return;
        }
        if (this.f50946e != null) {
            this.f50946e.a();
        }
        b();
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f50942a, false, 51262, new Class[0], Integer.TYPE)) {
            return this.i.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50942a, false, 51262, new Class[0], Integer.TYPE)).intValue();
    }

    public void run() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f50942a, false, 51263, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50942a, false, 51263, new Class[0], Void.TYPE);
            return;
        }
        String str = this.f50944b;
        if (PatchProxy.isSupport(new Object[]{str}, this, f50942a, false, 51269, new Class[]{String.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f50942a, false, 51269, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f50945d == null) {
            a((Throwable) new IllegalStateException("uploader is null"));
        } else {
            this.f50945d.a((av.a) this);
            if (!FileUtils.exists(str)) {
                a((Throwable) new IllegalStateException(" file not exist"));
            } else {
                z = true;
            }
        }
        if (z) {
            aw awVar = this.f50945d;
            String str2 = this.f50944b;
            Response a2 = awVar.a(str2, g.f52586b + "upload/file/");
            if (a2 == null) {
                a((Throwable) new RuntimeException("response is null"));
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(a2.body().string());
                int i = -1;
                if (jSONObject.has("status_code")) {
                    i = jSONObject.optInt("status_code");
                }
                if (i == 0) {
                    a(this.f50944b, (UrlModel) com.ss.android.ugc.aweme.im.sdk.utils.l.a(jSONObject.getString("data"), UrlModel.class));
                    a();
                    return;
                }
                a(jSONObject.toString());
            } catch (JSONException e2) {
                a((Throwable) e2);
            } catch (IOException e3) {
                a((Throwable) e3);
            } catch (Exception e4) {
                a((Throwable) e4);
            }
        }
    }

    public l(OkHttpClient okHttpClient) {
        this.f50945d = new aw(okHttpClient, 1);
        f50943c++;
        this.i = String.valueOf(f50943c);
    }

    public final void a(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, f50942a, false, 51265, new Class[]{Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, f50942a, false, 51265, new Class[]{Double.TYPE}, Void.TYPE);
            return;
        }
        if (this.f50946e != null) {
            this.f50946e.a(d2);
        }
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f50942a, false, 51261, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f50942a, false, 51261, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof l) || this.f50944b == null) {
                return false;
            }
            return this.i.equals(((l) obj).i);
        }
    }

    public void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f50942a, false, 51267, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f50942a, false, 51267, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f50946e != null) {
            this.f50946e.a(str);
        }
        b();
    }

    public void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f50942a, false, 51266, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f50942a, false, 51266, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (this.f50946e != null) {
            this.f50946e.a(th);
        }
        b();
    }

    public void a(String str, UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f50942a, false, 51264, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f50942a, false, 51264, new Class[]{String.class, UrlModel.class}, Void.TYPE);
            return;
        }
        if (this.f50946e != null) {
            this.f50946e.a(str, urlModel);
        }
        b();
    }
}
