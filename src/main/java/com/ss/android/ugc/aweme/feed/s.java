package com.ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.p;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45792a;

    /* renamed from: b  reason: collision with root package name */
    private final d f45793b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f45794c;

    /* renamed from: d  reason: collision with root package name */
    private final p f45795d;

    /* renamed from: e  reason: collision with root package name */
    private final IShareService.ShareStruct f45796e;

    s(d dVar, Aweme aweme, p pVar, IShareService.ShareStruct shareStruct) {
        this.f45793b = dVar;
        this.f45794c = aweme;
        this.f45795d = pVar;
        this.f45796e = shareStruct;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45792a, false, 40035, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45792a, false, 40035, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        d dVar = this.f45793b;
        Aweme aweme = this.f45794c;
        p pVar = this.f45795d;
        IShareService.ShareStruct shareStruct = this.f45796e;
        if (!a.a(view) && !d.c(aweme) && !TimeLockRuler.isEnableShowTeenageTip(C0906R.string.cij) && dVar.f(aweme)) {
            if (pVar.checkStatus("copy") && !TextUtils.isEmpty("copy")) {
                pVar.onAction(shareStruct, "copy");
            }
            dVar.l.dismiss();
        }
    }
}
