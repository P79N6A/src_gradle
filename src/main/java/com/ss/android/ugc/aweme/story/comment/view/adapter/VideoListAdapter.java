package com.ss.android.ugc.aweme.story.comment.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import com.ss.android.ugc.aweme.story.comment.discretescrollview.DiscreteScrollLayoutManager;

public class VideoListAdapter extends BaseAdapter<LifeStory> implements DiscreteScrollLayoutManager.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72256a;

    /* renamed from: b  reason: collision with root package name */
    public a f72257b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f72258c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f72259d;

    public interface a {
        void a(int i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f72256a, false, 82989, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f72256a, false, 82989, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        CoverListViewHolder coverListViewHolder = (CoverListViewHolder) viewHolder2;
        LifeStory lifeStory = (LifeStory) getData().get(i2);
        if (PatchProxy.isSupport(new Object[]{lifeStory}, coverListViewHolder, CoverListViewHolder.f72252a, false, 82987, new Class[]{LifeStory.class}, Void.TYPE)) {
            CoverListViewHolder coverListViewHolder2 = coverListViewHolder;
            PatchProxy.accessDispatch(new Object[]{lifeStory}, coverListViewHolder2, CoverListViewHolder.f72252a, false, 82987, new Class[]{LifeStory.class}, Void.TYPE);
        } else {
            coverListViewHolder.f72254c = lifeStory;
            if (lifeStory.getImageInfo() != null) {
                c.b(coverListViewHolder.f72255d, lifeStory.getImageInfo().getLabelLarge());
            } else if (lifeStory.getVideo() != null) {
                c.b(coverListViewHolder.f72255d, lifeStory.getVideo().getCover());
            }
        }
        viewHolder2.itemView.setOnClickListener(new c(this, i2));
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f72256a, false, 82988, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f72256a, false, 82988, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, null, CoverListViewHolder.f72252a, true, 82986, new Class[]{ViewGroup.class}, CoverListViewHolder.class)) {
            return new CoverListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a1t, viewGroup2, false));
        }
        return (CoverListViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, null, CoverListViewHolder.f72252a, true, 82986, new Class[]{ViewGroup.class}, CoverListViewHolder.class);
    }
}
