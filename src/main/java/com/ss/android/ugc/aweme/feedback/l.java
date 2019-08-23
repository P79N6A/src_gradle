package com.ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class l implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47195a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f47196b;

    public l(Context context) {
        this.f47196b = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f47195a, false, 43816, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f47195a, false, 43816, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Context context = this.f47196b;
        r.a("feedback_reply_view", (Map) d.a().a("uid", com.ss.android.ugc.aweme.account.d.a().getCurUserId()).f34114b);
        context.startActivity(new Intent(context, FeedbackActivity.class));
    }
}
