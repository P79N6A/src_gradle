package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.detail.e.h;
import com.ss.android.ugc.aweme.detail.e.i;
import com.ss.android.ugc.aweme.detail.e.k;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.longvideo.e;
import com.ss.android.ugc.aweme.qrcode.f.a;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public class OpenLongVideoMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76655a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<Context> f76656b;
    a g;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76655a, false, 90002, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76655a, false, 90002, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null && this.g.isShowing()) {
            this.g.dismiss();
        }
    }

    public OpenLongVideoMethod(WeakReference<Context> weakReference) {
        this.f76656b = weakReference;
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) throws JSONException {
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar}, this, f76655a, false, 89999, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar}, this, f76655a, false, 89999, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        Context context = (Context) this.f76656b.get();
        if (!(context == null || jSONObject == null || !jSONObject.has("aweme_id"))) {
            String string = jSONObject.getString("aweme_id");
            if (!TextUtils.isEmpty(string)) {
                this.g = a.a(context, context.getResources().getString(C0906R.string.b75));
                this.g.setIndeterminate(false);
                if (PatchProxy.isSupport(new Object[]{string}, this, f76655a, false, 90000, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{string}, this, f76655a, false, 90000, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                final i iVar = new i();
                iVar.a(new k() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f76657a;

                    public final void a(Aweme aweme) {
                        if (PatchProxy.isSupport(new Object[]{aweme}, this, f76657a, false, 90005, new Class[]{Aweme.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{aweme}, this, f76657a, false, 90005, new Class[]{Aweme.class}, Void.TYPE);
                            return;
                        }
                        OpenLongVideoMethod.this.a();
                        if (((Context) OpenLongVideoMethod.this.f76656b.get()) != null) {
                            e.a((Context) OpenLongVideoMethod.this.f76656b.get(), aweme, "poi_mba", 0);
                        }
                        iVar.j();
                        iVar.k();
                    }

                    public final void a(Exception exc) {
                        if (PatchProxy.isSupport(new Object[]{exc}, this, f76657a, false, 90004, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc}, this, f76657a, false, 90004, new Class[]{Exception.class}, Void.TYPE);
                            return;
                        }
                        OpenLongVideoMethod.this.a();
                        iVar.j();
                        iVar.k();
                    }
                });
                iVar.a(new h());
                iVar.a(string);
            }
        }
    }
}
