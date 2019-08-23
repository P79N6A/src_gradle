package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.e;
import com.ss.android.ugc.aweme.net.y;
import com.ss.android.ugc.aweme.qrcode.f.a;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.video.b;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.i;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final class bu {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64831a;

    /* renamed from: b  reason: collision with root package name */
    public a f64832b;

    /* renamed from: c  reason: collision with root package name */
    public Context f64833c;

    /* renamed from: d  reason: collision with root package name */
    private g f64834d;

    private boolean a() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f64831a, false, 73240, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f64831a, false, 73240, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[0], this, f64831a, false, 73243, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f64831a, false, 73243, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (!b.h()) {
                UIUtils.displayToast(this.f64833c, (int) C0906R.string.c1x);
            } else if (b.i() < 20971520) {
                UIUtils.displayToast(this.f64833c, (int) C0906R.string.c1y);
            } else {
                z = true;
            }
            z = false;
        }
        if (!z || !NetworkUtils.isNetworkAvailable(d.a())) {
            return false;
        }
        if (this.f64832b == null) {
            this.f64832b = a.a(this.f64833c, this.f64833c.getResources().getString(C0906R.string.a8b));
            this.f64832b.setIndeterminate(false);
        } else if ((this.f64833c instanceof Activity) && !((Activity) this.f64833c).isFinishing()) {
            this.f64832b.show();
            this.f64832b.a();
        }
        return true;
    }

    public bu(Context context) {
        this.f64833c = context;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f64831a, false, 73241, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f64831a, false, 73241, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (a() && !TextUtils.isEmpty(str)) {
            this.f64834d = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().createEffectPlatform(this.f64833c, e.b(), y.a().b());
            this.f64834d.a(str, "", (i) new i() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64835a;

                public final void b(Effect effect) {
                }

                public final void a(Effect effect) {
                    Effect effect2 = effect;
                    if (PatchProxy.isSupport(new Object[]{effect2}, this, f64835a, false, 73244, new Class[]{Effect.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effect2}, this, f64835a, false, 73244, new Class[]{Effect.class}, Void.TYPE);
                        return;
                    }
                    if (bu.this.f64832b != null) {
                        bc.b(bu.this.f64832b);
                    }
                    bu buVar = bu.this;
                    if (PatchProxy.isSupport(new Object[]{effect2}, buVar, bu.f64831a, false, 73242, new Class[]{Effect.class}, Void.TYPE)) {
                        bu buVar2 = buVar;
                        PatchProxy.accessDispatch(new Object[]{effect2}, buVar2, bu.f64831a, false, 73242, new Class[]{Effect.class}, Void.TYPE);
                        return;
                    }
                    if (effect2 != null) {
                        Intent intent = new Intent(buVar.f64833c, ((IAVService) ServiceManager.get().getService(IAVService.class)).getRecordPermissionActivity());
                        intent.putExtra("first_sticker", effect2);
                        intent.putExtra("reuse_mvtheme_enter", true);
                        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(buVar.f64833c, intent);
                    }
                }

                public final void a(@Nullable Effect effect, @NonNull c cVar) {
                    if (PatchProxy.isSupport(new Object[]{effect, cVar}, this, f64835a, false, 73245, new Class[]{Effect.class, c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effect, cVar}, this, f64835a, false, 73245, new Class[]{Effect.class, c.class}, Void.TYPE);
                        return;
                    }
                    int i = cVar.f77315a;
                    if (i == 2004 || i == 2002) {
                        com.bytedance.ies.dmt.ui.d.a.b(bu.this.f64833c, bu.this.f64833c.getResources().getString(C0906R.string.bfi)).a();
                    } else if (i == 2003) {
                        com.bytedance.ies.dmt.ui.d.a.b(bu.this.f64833c, bu.this.f64833c.getResources().getString(C0906R.string.bfh)).a();
                    } else if (i == 2006) {
                        com.bytedance.ies.dmt.ui.d.a.b(bu.this.f64833c, bu.this.f64833c.getResources().getString(C0906R.string.ac7)).a();
                    } else {
                        com.bytedance.ies.dmt.ui.d.a.b(bu.this.f64833c, bu.this.f64833c.getResources().getString(C0906R.string.bfg)).a();
                    }
                    if (bu.this.f64832b != null) {
                        bc.b(bu.this.f64832b);
                    }
                }
            });
        }
    }
}
