package com.ss.android.ugc.aweme.story.comment.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.api.f;
import com.ss.android.ugc.aweme.story.comment.model.c;
import com.ss.android.ugc.aweme.story.comment.view.CommentFragment;

public class ViewerListAdapter extends BaseAdapter<c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72260a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f72261b;

    /* renamed from: c  reason: collision with root package name */
    private CommentFragment f72262c;

    public long getItemId(int i) {
        return (long) i;
    }

    public ViewerListAdapter(CommentFragment commentFragment) {
        this.mTextColor = C0906R.color.iz;
        this.f72262c = commentFragment;
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f72260a, false, 82991, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f72260a, false, 82991, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, null, ViewerListViewHolder.f72263a, true, 82994, new Class[]{ViewGroup.class}, ViewerListViewHolder.class)) {
            return new ViewerListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a1z, viewGroup2, false));
        }
        return (ViewerListViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, null, ViewerListViewHolder.f72263a, true, 82994, new Class[]{ViewGroup.class}, ViewerListViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f72260a, false, 82992, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f72260a, false, 82992, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ViewerListViewHolder viewerListViewHolder = (ViewerListViewHolder) viewHolder;
        c cVar = (c) getData().get(i);
        CommentFragment commentFragment = this.f72262c;
        if (PatchProxy.isSupport(new Object[]{cVar, commentFragment}, viewerListViewHolder, ViewerListViewHolder.f72263a, false, 82995, new Class[]{c.class, CommentFragment.class}, Void.TYPE)) {
            Object[] objArr = {cVar, commentFragment};
            ViewerListViewHolder viewerListViewHolder2 = viewerListViewHolder;
            PatchProxy.accessDispatch(objArr, viewerListViewHolder2, ViewerListViewHolder.f72263a, false, 82995, new Class[]{c.class, CommentFragment.class}, Void.TYPE);
            return;
        }
        viewerListViewHolder.m = cVar;
        viewerListViewHolder.n = cVar.getUser();
        viewerListViewHolder.r = viewerListViewHolder.n.getFollowStatus();
        viewerListViewHolder.f72264b = commentFragment;
        com.ss.android.ugc.aweme.base.c.b(viewerListViewHolder.f72265c, viewerListViewHolder.m.getUser().getAvatarMedium());
        String recommendReason = viewerListViewHolder.m.getRecommendReason();
        if (recommendReason != null) {
            viewerListViewHolder.h.setText(Html.fromHtml(recommendReason));
        }
        if (!TextUtils.isEmpty(viewerListViewHolder.m.getUser().getRemarkName())) {
            str = viewerListViewHolder.m.getUser().getRemarkName();
        } else {
            str = viewerListViewHolder.m.getUser().getNickname();
        }
        viewerListViewHolder.f72266d.setText(str);
        viewerListViewHolder.f72266d.requestLayout();
        viewerListViewHolder.a(viewerListViewHolder.a(cVar.getUser()), false);
        viewerListViewHolder.f72267e.setOnClickListener(new d(viewerListViewHolder, cVar));
        if (viewerListViewHolder.m.getIsFriend()) {
            if (viewerListViewHolder.m.isFirstFriend().booleanValue()) {
                viewerListViewHolder.f72268f.setVisibility(8);
                viewerListViewHolder.g.setVisibility(0);
                viewerListViewHolder.g.setText(viewerListViewHolder.itemView.getContext().getString(C0906R.string.vp));
            } else {
                viewerListViewHolder.f72268f.setVisibility(8);
                viewerListViewHolder.g.setVisibility(8);
            }
            viewerListViewHolder.h.setVisibility(8);
            viewerListViewHolder.i.setVisibility(4);
            viewerListViewHolder.j.setVisibility(8);
        } else {
            if (!viewerListViewHolder.m.isFirstPartyFriend().booleanValue() || viewerListViewHolder.m.isFirstPartyFriendWithoutFriend()) {
                viewerListViewHolder.f72268f.setVisibility(8);
                viewerListViewHolder.g.setVisibility(8);
            } else {
                viewerListViewHolder.f72268f.setVisibility(0);
                viewerListViewHolder.g.setVisibility(0);
                viewerListViewHolder.g.setText(viewerListViewHolder.itemView.getContext().getString(C0906R.string.vv));
            }
            viewerListViewHolder.j.setVisibility(0);
            viewerListViewHolder.h.setVisibility(0);
            viewerListViewHolder.i.setVisibility(0);
            viewerListViewHolder.a(viewerListViewHolder.n, viewerListViewHolder.i, viewerListViewHolder.n.getFollowStatus());
            viewerListViewHolder.i.setOnClickListener(new e(viewerListViewHolder));
        }
        if (TextUtils.isEmpty(recommendReason)) {
            viewerListViewHolder.j.setVisibility(8);
            viewerListViewHolder.h.setVisibility(8);
        }
        viewerListViewHolder.f72265c.setOnClickListener(new f(viewerListViewHolder));
        viewerListViewHolder.k.setOnClickListener(new g(viewerListViewHolder));
        View.OnTouchListener onTouchListener = h.f72299b;
        viewerListViewHolder.f72267e.setOnTouchListener(onTouchListener);
        viewerListViewHolder.t.a(viewerListViewHolder.n, false, viewerListViewHolder.n.getUid());
        viewerListViewHolder.l.setOnTouchListener(onTouchListener);
        f fVar = (f) ServiceManager.get().getService(f.class);
        if (fVar.e()) {
            fVar.a(viewerListViewHolder.l, 13);
        } else {
            com.ss.android.ugc.aweme.base.c.a(viewerListViewHolder.l, 2130839121);
        }
        if (!viewerListViewHolder.a()) {
            viewerListViewHolder.l.setVisibility(8);
        } else {
            viewerListViewHolder.l.setVisibility(0);
        }
        viewerListViewHolder.l.setOnClickListener(new i(viewerListViewHolder));
    }
}
