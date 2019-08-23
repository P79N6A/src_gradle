package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.download.api.b.d;
import com.ss.android.download.api.c.e;
import com.ss.android.downloadlib.c.k;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.c.a.c;
import com.ss.android.ugc.aweme.app.c.c.a;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.d.s;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bl;
import com.ss.android.ugc.aweme.utils.j;
import java.io.File;

public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62972a;

    /* renamed from: b  reason: collision with root package name */
    private final EnterpriseTransformLayout f62973b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62974c;

    /* renamed from: d  reason: collision with root package name */
    private final String f62975d;

    t(EnterpriseTransformLayout enterpriseTransformLayout, String str, String str2) {
        this.f62973b = enterpriseTransformLayout;
        this.f62974c = str;
        this.f62975d = str2;
    }

    public final void onClick(View view) {
        Uri uri;
        if (PatchProxy.isSupport(new Object[]{view}, this, f62972a, false, 68043, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62972a, false, 68043, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f62973b;
        String str = this.f62974c;
        String str2 = this.f62975d;
        enterpriseTransformLayout.a(str);
        Context context = enterpriseTransformLayout.j;
        if (PatchProxy.isSupport(new Object[]{str2, context}, enterpriseTransformLayout, EnterpriseTransformLayout.f61840a, false, 68036, new Class[]{String.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, context}, enterpriseTransformLayout, EnterpriseTransformLayout.f61840a, false, 68036, new Class[]{String.class, Context.class}, Void.TYPE);
        } else {
            c.a().a(k.c(context), (d) null, (com.ss.android.download.api.b.c) com.ss.android.ugc.aweme.app.c.d.d.a(str2, new MobClick().setValue(enterpriseTransformLayout.h.getUid()).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("homepage_type", s.a(enterpriseTransformLayout.h) ? "personal_homepage" : "others_homepage").b())));
            a a2 = a.a();
            if (PatchProxy.isSupport(new Object[]{str2}, a2, a.f34051a, false, 23439, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, a2, a.f34051a, false, 23439, new Class[]{String.class}, Void.TYPE);
            } else if (!TextUtils.isEmpty(str2)) {
                a2.f34053b.add(str2);
            } else {
                a2.f34053b.remove(str2);
            }
        }
        Context context2 = enterpriseTransformLayout.j;
        User user = enterpriseTransformLayout.h;
        if (PatchProxy.isSupport(new Object[]{context2, str2, user}, null, com.ss.android.ugc.aweme.profile.d.c.f61385a, true, 69888, new Class[]{Context.class, String.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, user}, null, com.ss.android.ugc.aweme.profile.d.c.f61385a, true, 69888, new Class[]{Context.class, String.class, User.class}, Void.TYPE);
            return;
        }
        if (context2 != null) {
            e a3 = c.b().a(str2);
            if (a3 != null && a3.f28492b == 2) {
                com.bytedance.ies.dmt.ui.d.a.c(context2, (int) C0906R.string.ew).a();
            } else if (c.b().a(a3)) {
                com.bytedance.ies.dmt.ui.d.a.c(context2, (int) C0906R.string.aeq).a();
            } else if (a3 == null || !j.a(context2, a3.f28495e)) {
                c.a().f29058b.a(str2, 0);
                r.onEvent(MobClick.obtain().setEventName("homepage_ad").setLabelName("download_start").setValue(user.getUid()).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("homepage_type", s.a(user) ? "personal_homepage" : "others_homepage").b()));
            } else {
                String str3 = a3.f28495e;
                if (PatchProxy.isSupport(new Object[]{str3}, null, j.f75899a, true, 87885, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str3}, null, j.f75899a, true, 87885, new Class[]{String.class}, Void.TYPE);
                } else {
                    Activity e2 = p.a().e();
                    if (e2 != null) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setFlags(268435456);
                        if (PatchProxy.isSupport(new Object[]{e2, str3}, null, bl.f75620a, true, 88303, new Class[]{Context.class, String.class}, Uri.class)) {
                            uri = (Uri) PatchProxy.accessDispatch(new Object[]{e2, str3}, null, bl.f75620a, true, 88303, new Class[]{Context.class, String.class}, Uri.class);
                        } else if (TextUtils.isEmpty(str3)) {
                            uri = Uri.parse("android.resource://" + e2.getResources().getResourcePackageName(C0906R.mipmap.f4514a) + "/" + e2.getResources().getResourceTypeName(C0906R.mipmap.f4514a) + "/" + e2.getResources().getResourceEntryName(C0906R.mipmap.f4514a));
                        } else {
                            uri = bl.a(e2, new File(str3));
                        }
                        intent.setDataAndType(uri, "application/vnd.android.package-archive");
                        e2.startActivity(intent);
                    }
                }
                r.onEvent(MobClick.obtain().setEventName("homepage_ad").setLabelName("click_install").setValue(user.getUid()).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("homepage_type", s.a(user) ? "personal_homepage" : "others_homepage").b()));
            }
        }
    }
}
