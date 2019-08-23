package com.ss.android.ugc.aweme.story.comment.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.story.api.model.g;
import com.ss.android.ugc.aweme.story.comment.view.CommentFragment;

public class CommentListAdapter extends BaseAdapter<g> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72236a;

    /* renamed from: b  reason: collision with root package name */
    public CommentFragment f72237b;

    public long getItemId(int i) {
        return (long) i;
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f72236a, false, 82973, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f72236a, false, 82973, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        CommentListViewHolder commentListViewHolder = (CommentListViewHolder) viewHolder;
        g gVar = (g) getData().get(i2);
        if (PatchProxy.isSupport(new Object[]{gVar}, commentListViewHolder, CommentListViewHolder.f72247a, false, 82984, new Class[]{g.class}, Void.TYPE)) {
            CommentListViewHolder commentListViewHolder2 = commentListViewHolder;
            PatchProxy.accessDispatch(new Object[]{gVar}, commentListViewHolder2, CommentListViewHolder.f72247a, false, 82984, new Class[]{g.class}, Void.TYPE);
        } else {
            commentListViewHolder.f72251e = gVar;
            c.b(commentListViewHolder.f72249c, gVar.f71853c.getAvatarMedium());
            commentListViewHolder.f72250d.setComment(gVar);
            commentListViewHolder.itemView.setOnTouchListener(b.f72285b);
        }
        commentListViewHolder.itemView.setOnClickListener(new a(this, i2));
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f72236a, false, 82972, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f72236a, false, 82972, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, null, CommentListViewHolder.f72247a, true, 82983, new Class[]{ViewGroup.class}, CommentListViewHolder.class)) {
            return new CommentListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a1s, viewGroup2, false));
        }
        return (CommentListViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, null, CommentListViewHolder.f72247a, true, 82983, new Class[]{ViewGroup.class}, CommentListViewHolder.class);
    }
}
