package com.ss.android.ugc.aweme.live.authentication.b.a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.live.authentication.b.a;
import com.ss.android.ugc.aweme.live.model.LiveVerifyChecklist;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53302a;

    public final void a(a.C0618a aVar) {
        a.C0618a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f53302a, false, 55647, new Class[]{a.C0618a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f53302a, false, 55647, new Class[]{a.C0618a.class}, Void.TYPE);
            return;
        }
        LiveVerifyChecklist liveVerifyChecklist = aVar.a().f53308a;
        if (liveVerifyChecklist.realname_verify != 1 || !liveVerifyChecklist.is_phone_binded || !liveVerifyChecklist.live_agreement || !com.ss.android.ugc.aweme.utils.permission.a.a((Activity) aVar.a().f53309b, "android.permission.READ_CONTACTS")) {
            aVar2.a(aVar.a());
        } else {
            UIUtils.displayToast((Context) aVar.a().f53309b, (int) C0906R.string.bw1);
        }
    }
}
