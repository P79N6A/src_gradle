package com.ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.a.b;
import com.ss.android.ugc.aweme.app.e;

public final class m extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47197a;

    /* renamed from: b  reason: collision with root package name */
    private String f47198b;

    public m(String str) {
        this.f47198b = str;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f47197a, false, 43825, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f47197a, false, 43825, new Class[]{View.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(this.f47198b)) {
            Uri parse = Uri.parse(this.f47198b);
            Context context = view.getContext();
            if (context != null && parse != null) {
                String scheme = parse.getScheme();
                if (e.f34152b.equals(scheme)) {
                    String a2 = b.a();
                    if (e.f34152b.equals(scheme) || e.f34154d.equals(scheme)) {
                        this.f47198b = this.f47198b.replaceFirst(e.f34152b, a2);
                    }
                    parse = Uri.parse(this.f47198b);
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.putExtra("com.android.browser.application_id", context.getPackageName());
                    context.startActivity(intent);
                } catch (Exception unused) {
                }
            }
        }
    }
}
