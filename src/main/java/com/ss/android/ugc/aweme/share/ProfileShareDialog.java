package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.profile.q;

public class ProfileShareDialog extends SimpleShareDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64535a;

    public final void a(final a aVar) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f64535a, false, 73217, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f64535a, false, 73217, new Class[]{a.class}, Void.TYPE);
            return;
        }
        ca.a(aVar);
        if (aVar.a()) {
            if (this.mActionHandler != null) {
                z = this.mActionHandler.onAction(this.mShareStruct, aVar.d());
            } else {
                z = false;
            }
            if (!z) {
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f64535a, false, 73218, new Class[]{a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f64535a, false, 73218, new Class[]{a.class}, Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.qrcode.f.a a2 = com.ss.android.ugc.aweme.qrcode.f.a.a(this.h, this.h.getResources().getString(C0906R.string.a8b));
                    a2.a();
                    com.ss.android.b.a.a.a.a(new bq(this, aVar, a2));
                }
            }
            dismiss();
        } else if (q.a(aVar.d())) {
            ca.a(this.h, this.mShareStruct, new com.ss.android.ugc.aweme.base.a<Boolean>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64536a;

                public final /* synthetic */ void run(Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (PatchProxy.isSupport(new Object[]{bool}, this, f64536a, false, 73221, new Class[]{Boolean.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bool}, this, f64536a, false, 73221, new Class[]{Boolean.class}, Void.TYPE);
                        return;
                    }
                    IShareService.ShareResult shareResult = new IShareService.ShareResult();
                    shareResult.success = bool.booleanValue();
                    shareResult.type = aVar.d();
                    ProfileShareDialog.this.onShareComplete(shareResult);
                }
            });
            dismiss();
        } else {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.h, aVar.c(), 0).a();
        }
    }

    public ProfileShareDialog(Activity activity, ck ckVar) {
        super(activity, ckVar);
    }
}
