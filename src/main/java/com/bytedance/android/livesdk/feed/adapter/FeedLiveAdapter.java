package com.bytedance.android.livesdk.feed.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.paging.adapter.PagingAdapter;
import com.bytedance.android.live.core.viewholder.a;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.g;
import com.bytedance.android.livesdk.feed.l.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Map;

public class FeedLiveAdapter extends BaseFeedAdapter {
    public static ChangeQuickRedirect z;
    private final FeedLiveFragment A;

    public final int b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, z, false, 8491, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, z, false, 8491, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        switch (i) {
            case 0:
                return C0906R.layout.ama;
            case 1:
                if (this.A.o()) {
                    return C0906R.layout.aj6;
                }
                return C0906R.layout.aj5;
            case 22:
                return C0906R.layout.ama;
            case 23:
                return C0906R.layout.amc;
            case 25:
                return C0906R.layout.amd;
            case 1003:
                return C0906R.layout.aj9;
            default:
                return super.b(i);
        }
    }

    public final RecyclerView.ViewHolder c(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, z, false, 8489, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new PagingAdapter.EndViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.af6, viewGroup2, false));
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, z, false, 8489, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public final RecyclerView.ViewHolder b(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, z, false, 8490, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, z, false, 8490, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        if (!c.b()) {
            int i2 = i;
        } else if (i == -1091576149) {
            if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(C0906R.layout.af3)}, this, PagingAdapter.f7898b, false, 462, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
                return new PagingAdapter.ErrorViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.af3, viewGroup2, false), this.f7900c);
            }
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(C0906R.layout.af3)}, this, PagingAdapter.f7898b, false, 462, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        return super.b(viewGroup, i);
    }

    public FeedLiveAdapter(Map<Integer, a> map, g gVar, FeedLiveFragment feedLiveFragment) {
        super(map, gVar);
        this.A = feedLiveFragment;
    }
}
