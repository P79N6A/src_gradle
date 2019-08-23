package com.bytedance.android.livesdk.s;

import android.app.Activity;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.browser.jsbridge.a.d;
import com.bytedance.android.livesdk.chatroom.api.PackagePurchaseApi;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.ac;
import com.bytedance.android.livesdk.wallet.ad;
import com.bytedance.android.livesdk.wallet.g;
import com.bytedance.android.livesdkapi.depend.d.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17104a;

    /* renamed from: b  reason: collision with root package name */
    Disposable f17105b;

    /* renamed from: c  reason: collision with root package name */
    WeakReference<AppCompatActivity> f17106c;

    /* renamed from: d  reason: collision with root package name */
    BaseDialogFragment f17107d;

    /* renamed from: e  reason: collision with root package name */
    Disposable f17108e;

    /* renamed from: f  reason: collision with root package name */
    boolean f17109f;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static b f17114a = new b((byte) 0);
    }

    private b() {
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final void a(AppCompatActivity appCompatActivity) {
        if (PatchProxy.isSupport(new Object[]{appCompatActivity}, this, f17104a, false, 12859, new Class[]{AppCompatActivity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{appCompatActivity}, this, f17104a, false, 12859, new Class[]{AppCompatActivity.class}, Void.TYPE);
            return;
        }
        this.f17109f = false;
        if (((Boolean) LiveSettingKeys.LIVE_PACKAKGE_PURCHASE.a()).booleanValue() && !com.bytedance.android.livesdkapi.a.a.f18614b) {
            if (this.f17108e != null && !this.f17108e.isDisposed()) {
                this.f17108e.dispose();
            }
            if (this.f17106c != null) {
                this.f17106c.clear();
            }
            if (this.f17105b != null) {
                this.f17105b.dispose();
            }
        }
    }

    public final void onEvent(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f17104a, false, 12860, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f17104a, false, 12860, new Class[]{d.class}, Void.TYPE);
            return;
        }
        if (!(!"live".equals(dVar.f9428c) || this.f17106c == null || this.f17106c.get() == null)) {
            g gVar = new g((Activity) this.f17106c.get(), "feed");
            gVar.a(new ac(dVar.f9427b).a());
            gVar.j = new g.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17112a;

                public final void a(Dialog dialog, ad adVar) {
                    if (PatchProxy.isSupport(new Object[]{dialog, adVar}, this, f17112a, false, 12864, new Class[]{Dialog.class, ad.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialog, adVar}, this, f17112a, false, 12864, new Class[]{Dialog.class, ad.class}, Void.TYPE);
                        return;
                    }
                    if (adVar != null && adVar.b() == 10001) {
                        if (!(b.this.f17106c == null || b.this.f17106c.get() == null)) {
                            ai.a((int) C0906R.string.dge);
                        }
                        if (b.this.f17107d != null) {
                            b.this.f17107d.dismissAllowingStateLoss();
                            b.this.f17107d = null;
                        }
                    }
                }
            };
            if (gVar.a(dVar.f9426a)) {
                gVar.show();
            }
        }
    }

    public final void a(AppCompatActivity appCompatActivity, Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{appCompatActivity, map}, this, f17104a, false, 12858, new Class[]{AppCompatActivity.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{appCompatActivity, map}, this, f17104a, false, 12858, new Class[]{AppCompatActivity.class, Map.class}, Void.TYPE);
        } else if (!this.f17109f) {
            this.f17109f = true;
            String str = map.get("show_type");
            if (((Boolean) LiveSettingKeys.LIVE_PACKAKGE_PURCHASE.a()).booleanValue() && com.bytedance.android.live.uikit.a.a.d() && ((!((Boolean) com.bytedance.android.livesdk.w.b.am.a()).booleanValue() || "giftpack".equals(str)) && appCompatActivity != null)) {
                if (this.f17108e != null && !this.f17108e.isDisposed()) {
                    this.f17108e.dispose();
                }
                this.f17108e = com.bytedance.android.livesdk.u.a.a().a(d.class).subscribe((Consumer<? super T>) new Consumer<d>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f17110a;

                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        d dVar = (d) obj;
                        if (PatchProxy.isSupport(new Object[]{dVar}, this, f17110a, false, 12863, new Class[]{d.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dVar}, this, f17110a, false, 12863, new Class[]{d.class}, Void.TYPE);
                            return;
                        }
                        b.this.onEvent(dVar);
                    }
                });
                this.f17106c = new WeakReference<>(appCompatActivity);
                if (this.f17105b != null) {
                    this.f17105b.dispose();
                }
                this.f17105b = ((PackagePurchaseApi) j.q().d().a(PackagePurchaseApi.class)).getPackagePurchaseInfo().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new c(this, appCompatActivity), d.f17119b);
            }
        }
    }
}
