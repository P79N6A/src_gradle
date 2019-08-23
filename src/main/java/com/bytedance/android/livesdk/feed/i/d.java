package com.bytedance.android.livesdk.feed.i;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.live.core.viewholder.a;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.live.LiveTabViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14199a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedLiveFragment f14200b;

    public d(FeedLiveFragment feedLiveFragment) {
        this.f14200b = feedLiveFragment;
    }

    public final BaseViewHolder a(ViewGroup viewGroup, Object[] objArr) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, objArr}, this, f14199a, false, 8816, new Class[]{ViewGroup.class, Object[].class}, BaseViewHolder.class)) {
            return (BaseViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, objArr}, this, f14199a, false, 8816, new Class[]{ViewGroup.class, Object[].class}, BaseViewHolder.class);
        }
        return new LiveTabViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.amd, viewGroup2, false), this.f14200b);
    }
}
