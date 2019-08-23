package com.ss.android.ugc.aweme.im.sdk.chat.net;

import android.support.annotation.WorkerThread;
import com.bytedance.common.utility.io.FileUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.utils.av;
import com.ss.android.ugc.aweme.im.sdk.utils.aw;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.im.sdk.utils.g;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class y extends ab implements x {

    /* renamed from: a  reason: collision with root package name */
    private static int f51010a;

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f51011d;

    /* renamed from: b  reason: collision with root package name */
    private aw f51012b;

    /* renamed from: c  reason: collision with root package name */
    private x f51013c;

    /* renamed from: e  reason: collision with root package name */
    public String f51014e;

    public void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f51011d, false, 51318, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f51011d, false, 51318, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (this.f51013c != null) {
            this.f51013c.a(th);
        }
        b();
        a((Object) th, true);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51011d, false, 51319, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51011d, false, 51319, new Class[0], Void.TYPE);
            return;
        }
        if (this.f51013c != null) {
            this.f51013c.a();
        }
        b();
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f51011d, false, 51313, new Class[0], Integer.TYPE)) {
            return this.i.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f51011d, false, 51313, new Class[0], Integer.TYPE)).intValue();
    }

    @WorkerThread
    public void run() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f51011d, false, 51314, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51011d, false, 51314, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f51011d, false, 51315, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f51011d, false, 51315, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f51012b == null) {
            a((Throwable) new IllegalStateException("uploader is null"));
        } else {
            this.f51012b.a((av.a) this);
            if (!FileUtils.exists(this.f51014e)) {
                a((Throwable) new RuntimeException("compress failed"));
            } else {
                z = true;
            }
        }
        if (z) {
            aw awVar = this.f51012b;
            String str = this.f51014e;
            Response a2 = awVar.a(str, g.f52586b + "upload/image/");
            if (a2 == null) {
                a((Throwable) new RuntimeException("response null"));
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(a2.body().string());
                boolean has = jSONObject.has("status_code");
                int i = -1;
                if (has) {
                    i = jSONObject.optInt("status_code");
                }
                if (!has || i != 0) {
                    a((Throwable) new a(i).setErrorMsg(jSONObject.toString()));
                    return;
                }
                UrlModel urlModel = (UrlModel) l.a(jSONObject.getString("data"), UrlModel.class);
                if (!(urlModel == null || urlModel.getUrlList() == null)) {
                    if (!urlModel.getUrlList().isEmpty()) {
                        b(this.f51014e, urlModel);
                        return;
                    }
                }
                a((Throwable) new RuntimeException("Code=" + i + " Response=" + jSONObject.toString()));
            } catch (JSONException e2) {
                a((Throwable) e2);
            } catch (IOException e3) {
                a((Throwable) e3);
            } catch (Exception e4) {
                a((Throwable) e4);
            }
        }
    }

    public y(OkHttpClient okHttpClient) {
        this.f51012b = new aw(okHttpClient, 0);
        f51010a++;
        this.i = String.valueOf(f51010a);
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f51011d, false, 51312, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f51011d, false, 51312, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof y) || this.f51014e == null) {
                return false;
            }
            return this.i.equals(((y) obj).i);
        }
    }

    public final void a(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, f51011d, false, 51317, new Class[]{Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, f51011d, false, 51317, new Class[]{Double.TYPE}, Void.TYPE);
            return;
        }
        if (this.f51013c != null) {
            this.f51013c.a(d2);
        }
    }

    public final void a(x xVar) {
        if (PatchProxy.isSupport(new Object[]{xVar}, this, f51011d, false, 51311, new Class[]{x.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{xVar}, this, f51011d, false, 51311, new Class[]{x.class}, Void.TYPE);
            return;
        }
        this.f51013c = xVar;
        if (this.f51012b != null) {
            this.f51012b.a((av.a) this);
        }
    }

    public void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f51011d, false, 51321, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f51011d, false, 51321, new Class[]{String.class}, Void.TYPE);
            return;
        }
        b();
        a((Object) str2, true);
    }

    private void a(Object obj, boolean z) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f51011d, false, 51322, new Class[]{Object.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2, Byte.valueOf(z)}, this, f51011d, false, 51322, new Class[]{Object.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "PhotoUploadItem");
        if (obj2 != null) {
            if (z) {
                hashMap.put("error", obj2);
            } else {
                hashMap.put("success", obj2);
            }
        }
        d.a("message_upload_image", hashMap);
    }

    public void b(String str, UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f51011d, false, 51316, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f51011d, false, 51316, new Class[]{String.class, UrlModel.class}, Void.TYPE);
            return;
        }
        a(str, urlModel);
    }

    public final void a(String str, UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f51011d, false, 51320, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f51011d, false, 51320, new Class[]{String.class, UrlModel.class}, Void.TYPE);
            return;
        }
        if (this.f51013c != null) {
            this.f51013c.a(str, urlModel);
        }
        b();
        a((Object) str, false);
    }
}
