package com.ss.android.ugc.aweme.commercialize.feed;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.g.b.c;
import com.bytedance.g.b.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.utils.am;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38837a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38838b;

    k(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38838b = commerceVideoDelegate;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38837a, false, 30690, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38837a, false, 30690, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommerceVideoDelegate commerceVideoDelegate = this.f38838b;
        c b2 = am.b(commerceVideoDelegate.f38688e);
        if (b2 != null && !CollectionUtils.isEmpty(b2.clickList)) {
            for (g next : b2.clickList) {
                if (next.clickTracking != null && !next.clickTracking.isEmpty()) {
                    for (String next2 : next.clickTracking) {
                        if (!TextUtils.isEmpty(next2)) {
                            am.a(next2, commerceVideoDelegate.f38688e);
                        }
                    }
                }
                if (!TextUtils.isEmpty(next.clickThrough)) {
                    com.ss.android.ugc.aweme.commercialize.utils.g.a(commerceVideoDelegate.k, commerceVideoDelegate.f38688e, next.clickThrough, (String) null);
                    return;
                }
            }
        }
    }
}
