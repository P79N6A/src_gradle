package com.ss.android.ugc.aweme.story.shootvideo.friends.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.shootvideo.friends.a.k;
import java.util.ArrayList;
import java.util.List;

public class PublishSelectFriendAdapter extends LoadMoreRecyclerViewAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73560a;

    /* renamed from: b  reason: collision with root package name */
    public List<k> f73561b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public a f73562c;

    /* renamed from: d  reason: collision with root package name */
    public int f73563d = 1;

    /* renamed from: e  reason: collision with root package name */
    public String f73564e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f73565f;
    private PublishSelectFriendViewHolder g;

    public interface a {
        void a();

        boolean a(int i, boolean z);
    }

    public int getBasicItemViewType(int i) {
        return 0;
    }

    public int getBasicItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f73560a, false, 85308, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f73560a, false, 85308, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f73561b == null) {
            return 0;
        } else {
            return this.f73561b.size();
        }
    }

    public final void a(List<k> list) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{list}, this, f73560a, false, 85306, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f73560a, false, 85306, new Class[]{List.class}, Void.TYPE);
        } else if (list != null && list.size() != 0) {
            this.f73561b = list;
            if (PatchProxy.isSupport(new Object[0], this, f73560a, false, 85304, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73560a, false, 85304, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                ((Boolean) com.ss.android.ugc.aweme.port.in.a.o.h().a()).booleanValue();
            }
            this.f73565f = z;
            if (this.g != null) {
                this.g.j = this.f73565f;
            }
            notifyDataSetChanged();
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f73560a, false, 85307, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new PublishSelectFriendViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a10, viewGroup, false), this.f73562c, this.f73564e, this.f73563d);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f73560a, false, 85307, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int i2;
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f73560a, false, 85305, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f73560a, false, 85305, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i3 == 0) {
            this.g = (PublishSelectFriendViewHolder) viewHolder;
            this.g.j = this.f73565f;
        }
        PublishSelectFriendViewHolder publishSelectFriendViewHolder = (PublishSelectFriendViewHolder) viewHolder;
        k kVar = this.f73561b.get(i3);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f73560a, false, 85309, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f73560a, false, 85309, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f73561b == null || this.f73561b.size() == 0 || (this.f73561b.size() - 1 == i3 && this.f73561b.size() <= 7)) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {kVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)};
        ChangeQuickRedirect changeQuickRedirect = PublishSelectFriendViewHolder.f73566a;
        k kVar2 = kVar;
        if (PatchProxy.isSupport(objArr, publishSelectFriendViewHolder, changeQuickRedirect, false, 85311, new Class[]{k.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PublishSelectFriendViewHolder publishSelectFriendViewHolder2 = publishSelectFriendViewHolder;
            PatchProxy.accessDispatch(new Object[]{kVar2, Integer.valueOf(i), Byte.valueOf(z)}, publishSelectFriendViewHolder2, PublishSelectFriendViewHolder.f73566a, false, 85311, new Class[]{k.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (kVar2 != null) {
            if (i3 == 0) {
                publishSelectFriendViewHolder.f73570e.setVisibility(0);
            } else {
                publishSelectFriendViewHolder.f73570e.setVisibility(8);
            }
            if (publishSelectFriendViewHolder.i == 1) {
                TextView textView = publishSelectFriendViewHolder.f73571f;
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                textView.setVisibility(i2);
                publishSelectFriendViewHolder.f73571f.setOnClickListener(new e(publishSelectFriendViewHolder));
                if (i3 != 0 || !publishSelectFriendViewHolder.j) {
                    publishSelectFriendViewHolder.g.setVisibility(8);
                } else if (com.ss.android.ugc.aweme.port.in.a.A.a()) {
                    publishSelectFriendViewHolder.g.setVisibility(0);
                    com.ss.android.ugc.aweme.utils.a.f75468b.a("duoshan_banner_show", d.a().a("creation_id", publishSelectFriendViewHolder.k).a("shoot_way", "story").a("enter_from", "edit_post_page").f34114b);
                } else {
                    publishSelectFriendViewHolder.g.setVisibility(8);
                }
                if (!com.ss.android.ugc.aweme.port.in.a.A.a()) {
                    publishSelectFriendViewHolder.f73570e.setVisibility(8);
                }
            }
            if (kVar2.f73553c) {
                publishSelectFriendViewHolder.f73569d.setAlpha(0.5f);
            } else {
                publishSelectFriendViewHolder.f73569d.setAlpha(1.0f);
            }
            if (kVar2.f73551a != null) {
                User user = kVar2.f73551a;
                String remarkName = user.getRemarkName();
                if (TextUtils.isEmpty(remarkName)) {
                    publishSelectFriendViewHolder.f73567b.setText(user.getNickname());
                } else {
                    publishSelectFriendViewHolder.f73567b.setText(remarkName);
                }
                publishSelectFriendViewHolder.f73568c.setData(user);
                publishSelectFriendViewHolder.itemView.setOnClickListener(new f(publishSelectFriendViewHolder, i3, kVar2));
            }
            publishSelectFriendViewHolder.a(kVar2.f73552b);
        }
    }
}
