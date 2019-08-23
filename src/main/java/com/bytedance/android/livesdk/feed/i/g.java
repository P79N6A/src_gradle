package com.bytedance.android.livesdk.feed.i;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.live.core.viewholder.a;
import com.bytedance.android.livesdk.feed.live.LiveGapViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14205a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f14206b = new g();

    private g() {
    }

    public final BaseViewHolder a(ViewGroup viewGroup, Object[] objArr) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, objArr}, this, f14205a, false, 8819, new Class[]{ViewGroup.class, Object[].class}, BaseViewHolder.class)) {
            return new LiveGapViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.amb, viewGroup2, false));
        }
        return (BaseViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, objArr}, this, f14205a, false, 8819, new Class[]{ViewGroup.class, Object[].class}, BaseViewHolder.class);
    }
}
