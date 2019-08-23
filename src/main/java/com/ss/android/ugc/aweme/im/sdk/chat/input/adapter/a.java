package com.ss.android.ugc.aweme.im.sdk.chat.input.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50346a;

    /* renamed from: b  reason: collision with root package name */
    private final SearchGifAdapter f50347b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.ViewHolder f50348c;

    a(SearchGifAdapter searchGifAdapter, RecyclerView.ViewHolder viewHolder) {
        this.f50347b = searchGifAdapter;
        this.f50348c = viewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f50346a, false, 50658, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f50346a, false, 50658, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        SearchGifAdapter searchGifAdapter = this.f50347b;
        RecyclerView.ViewHolder viewHolder = this.f50348c;
        if (searchGifAdapter.h != null) {
            searchGifAdapter.h.a(viewHolder.getAdapterPosition());
        }
    }
}
