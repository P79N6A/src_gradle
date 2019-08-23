package com.ss.android.ugc.aweme.im.sdk.chat.input.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.c.a.a;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50349a;

    /* renamed from: b  reason: collision with root package name */
    private final SearchGifAdapter f50350b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b f50351c;

    b(SearchGifAdapter searchGifAdapter, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b bVar) {
        this.f50350b = searchGifAdapter;
        this.f50351c = bVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f50349a, false, 50659, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f50349a, false, 50659, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        SearchGifAdapter searchGifAdapter = this.f50350b;
        com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b bVar = this.f50351c;
        if (searchGifAdapter.h != null && !a.a(view, 500)) {
            searchGifAdapter.h.a(bVar);
        }
    }
}
