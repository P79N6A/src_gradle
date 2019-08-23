package com.bytedance.android.livesdk.feed.i;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.live.core.viewholder.a;
import com.bytedance.android.livesdk.feed.live.LiveRankViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14203a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f14204b = new f();

    private f() {
    }

    public final BaseViewHolder a(ViewGroup viewGroup, Object[] objArr) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, objArr}, this, f14203a, false, 8818, new Class[]{ViewGroup.class, Object[].class}, BaseViewHolder.class)) {
            return new LiveRankViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.amc, viewGroup2, false));
        }
        return (BaseViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, objArr}, this, f14203a, false, 8818, new Class[]{ViewGroup.class, Object[].class}, BaseViewHolder.class);
    }
}
