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
import com.ss.android.ugc.aweme.commerce.e;
import com.ss.android.ugc.aweme.commercialize.utils.af;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.profile.model.User;

public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62965a;

    /* renamed from: b  reason: collision with root package name */
    private final EnterpriseTransformLayout f62966b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62967c;

    /* renamed from: d  reason: collision with root package name */
    private final String f62968d;

    r(EnterpriseTransformLayout enterpriseTransformLayout, String str, String str2) {
        this.f62966b = enterpriseTransformLayout;
        this.f62967c = str;
        this.f62968d = str2;
    }

    public final void onClick(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f62965a, false, 68041, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62965a, false, 68041, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f62966b;
        String str2 = this.f62967c;
        String str3 = this.f62968d;
        e a2 = c.a(enterpriseTransformLayout.h);
        User user = enterpriseTransformLayout.h;
        if (PatchProxy.isSupport(new Object[]{user}, null, c.f39774a, true, 32299, new Class[]{User.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{user}, null, c.f39774a, true, 32299, new Class[]{User.class}, String.class);
        } else {
            e a3 = c.a(user);
            str = a3 == null ? null : a3.getEncryptKey();
        }
        if (!(enterpriseTransformLayout.j instanceof Activity) || TextUtils.isEmpty(str)) {
            Context context = enterpriseTransformLayout.getContext();
            if (PatchProxy.isSupport(new Object[]{context, str2}, null, com.ss.android.ugc.aweme.profile.d.c.f61385a, true, 69889, new Class[]{Context.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, str2}, null, com.ss.android.ugc.aweme.profile.d.c.f61385a, true, 69889, new Class[]{Context.class, String.class}, Void.TYPE);
            } else if (context != null && !TextUtils.isEmpty(str2)) {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str2));
                intent.setFlags(268435456);
                context.startActivity(intent);
            }
        } else {
            af.a().a((Activity) enterpriseTransformLayout.j, a2.getPhoneNumber(), a2.getPhoneId(), a2.getEncryptKey(), "homepage_ad");
        }
        enterpriseTransformLayout.a(str3);
    }
}
