package com.ss.android.ugc.aweme.feed;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46062a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f46063b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f46064c;

    /* renamed from: d  reason: collision with root package name */
    private final IShareService.SharePage f46065d;

    /* renamed from: e  reason: collision with root package name */
    private final IShareService.IActionHandler f46066e;

    /* renamed from: f  reason: collision with root package name */
    private final IShareService.ShareStruct f46067f;

    public t(Aweme aweme, Context context, IShareService.SharePage sharePage, IShareService.IActionHandler iActionHandler, IShareService.ShareStruct shareStruct) {
        this.f46063b = aweme;
        this.f46064c = context;
        this.f46065d = sharePage;
        this.f46066e = iActionHandler;
        this.f46067f = shareStruct;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f46062a, false, 40036, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46062a, false, 40036, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Aweme aweme = this.f46063b;
        Context context = this.f46064c;
        IShareService.SharePage sharePage = this.f46065d;
        IShareService.IActionHandler iActionHandler = this.f46066e;
        IShareService.ShareStruct shareStruct = this.f46067f;
        if (!a.a(view) && !d.c(aweme) && !TimeLockRuler.isEnableShowTeenageTip(C0906R.string.cij)) {
            if (c.L(aweme)) {
                com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.ca).a();
            } else if (iActionHandler.checkStatus("copy") && !TextUtils.isEmpty("copy")) {
                iActionHandler.onAction(shareStruct, "copy");
            }
            sharePage.dismiss();
        }
    }
}
