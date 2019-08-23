package com.ss.android.ugc.aweme.shortvideo.sticker.ar;

import android.content.Context;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.port.in.ad;

public final /* synthetic */ class a implements ad.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69331a;

    /* renamed from: b  reason: collision with root package name */
    private final FaceMattingPresenter f69332b;

    a(FaceMattingPresenter faceMattingPresenter) {
        this.f69332b = faceMattingPresenter;
    }

    public final void a(String[] strArr, int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f69331a, false, 78838, new Class[]{String[].class, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f69331a, false, 78838, new Class[]{String[].class, int[].class}, Void.TYPE);
            return;
        }
        FaceMattingPresenter faceMattingPresenter = this.f69332b;
        if (faceMattingPresenter.f3984c != null && !faceMattingPresenter.f3984c.isFinishing()) {
            if (iArr[0] == 0) {
                faceMattingPresenter.c().a();
            } else {
                UIUtils.displayToast((Context) faceMattingPresenter.f3984c, (int) C0906R.string.bm4);
            }
        }
    }
}
