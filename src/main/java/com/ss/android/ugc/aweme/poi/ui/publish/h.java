package com.ss.android.ugc.aweme.poi.ui.publish;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.u.b;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60870a;

    /* renamed from: b  reason: collision with root package name */
    private final b f60871b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f60872c;

    h(b bVar, boolean z) {
        this.f60871b = bVar;
        this.f60872c = z;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60870a, false, 66666, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60870a, false, 66666, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        b bVar = this.f60871b;
        boolean z = this.f60872c;
        if (!bVar.f60850b.i) {
            if (bVar.f60852d.f70735b) {
                UIUtils.displayToast(bVar.b(), bVar.a((int) C0906R.string.yj));
            }
            if (z) {
                UIUtils.displayToast(bVar.b(), bVar.a((int) C0906R.string.bbg));
            }
            if (bVar.i() || bVar.j() || bVar.k()) {
                UIUtils.displayToast(bVar.b(), bVar.a((int) C0906R.string.cct));
            }
            return;
        }
        if (!bVar.m()) {
            bVar.q();
            new b().a("video_post_page").b(bVar.r() ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY).c(bVar.l).e();
        }
    }
}
