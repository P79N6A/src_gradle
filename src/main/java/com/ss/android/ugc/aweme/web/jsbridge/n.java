package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatDialog;
import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.festival.christmas.b.a;
import com.ss.android.ugc.aweme.festival.christmas.c.g;
import com.ss.android.ugc.aweme.festival.christmas.d.c;
import com.ss.android.ugc.aweme.festival.christmas.view.b;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class n implements d, a, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76798a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<Context> f76799b;

    /* renamed from: c  reason: collision with root package name */
    private int f76800c = -1;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.view.d f76801d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.ies.f.a.a f76802e;

    /* renamed from: f  reason: collision with root package name */
    private String f76803f;

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f76798a, false, 89953, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76798a, false, 89953, new Class[0], Void.TYPE);
            return;
        }
        if (this.f76801d != null) {
            this.f76801d.dismiss();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76798a, false, 89955, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76798a, false, 89955, new Class[0], Void.TYPE);
            return;
        }
        b();
        com.bytedance.ies.dmt.ui.d.a.b(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.bga).a();
    }

    private boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f76798a, false, 89957, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76798a, false, 89957, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f76799b == null || this.f76799b.get() == null || !(this.f76799b.get() instanceof Activity)) {
            return false;
        } else {
            Activity activity = (Activity) this.f76799b.get();
            if (activity != null && !activity.isFinishing()) {
                z = true;
            }
            return z;
        }
    }

    public final void a(g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f76798a, false, 89954, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f76798a, false, 89954, new Class[]{g.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f76798a, false, 89951, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f76798a, false, 89951, new Class[]{g.class}, Void.TYPE);
            return;
        }
        b();
        if (gVar != null && c()) {
            AppCompatDialog createShareDonationDialog = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createShareDonationDialog((Activity) this.f76799b.get(), gVar, this.f76800c, this, "h5");
            if (createShareDonationDialog != null) {
                try {
                    createShareDonationDialog.show();
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void a(String str) {
        boolean z;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f76798a, false, 89956, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f76798a, false, 89956, new Class[]{String.class}, Void.TYPE);
            return;
        }
        b();
        if (c()) {
            Activity activity = (Activity) this.f76799b.get();
            if (PatchProxy.isSupport(new Object[]{activity, str2}, null, com.ss.android.ugc.aweme.festival.christmas.a.f47225a, true, 43893, new Class[]{Activity.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity, str2}, null, com.ss.android.ugc.aweme.festival.christmas.a.f47225a, true, 43893, new Class[]{Activity.class, String.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[]{activity}, null, com.ss.android.ugc.aweme.festival.christmas.a.f47225a, true, 43894, new Class[]{Activity.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{activity}, null, com.ss.android.ugc.aweme.festival.christmas.a.f47225a, true, 43894, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
            } else if (activity == null || activity.isFinishing()) {
                z = false;
            } else {
                z = true;
            }
            if (z && !TextUtils.isEmpty(str)) {
                String[] split = str2.split("\\*");
                if (split != null && split.length >= 2) {
                    new a.C0185a(activity).a(split[0]).b(split[1]).a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) null).a().a();
                    SharePrefCache.inst().getFestivalShareDonationTime().a(Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
    }

    public n(WeakReference<Context> weakReference, com.bytedance.ies.f.a.a aVar) {
        this.f76799b = weakReference;
        this.f76802e = aVar;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76798a, false, 89949, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76798a, false, 89949, new Class[]{h.class, JSONObject.class}, Void.TYPE);
        } else if (hVar != null) {
            JSONObject jSONObject2 = hVar.f20623d;
            if (jSONObject2 != null) {
                String optString = jSONObject2.optString("item_id");
                this.f76800c = jSONObject2.optInt("type");
                this.f76803f = hVar.f20621b;
                hVar.f20625f = false;
                c cVar = new c();
                cVar.a(this);
                cVar.a(optString, Integer.valueOf(this.f76800c));
                if (PatchProxy.isSupport(new Object[0], this, f76798a, false, 89952, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f76798a, false, 89952, new Class[0], Void.TYPE);
                    return;
                }
                if (c()) {
                    if (this.f76801d == null) {
                        this.f76801d = com.ss.android.ugc.aweme.shortvideo.view.d.b((Context) this.f76799b.get(), ((Context) this.f76799b.get()).getString(C0906R.string.b79));
                        this.f76801d.setIndeterminate(true);
                    }
                    this.f76801d.show();
                }
            }
        }
    }
}
