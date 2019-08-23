package com.bytedance.android.livesdk.rank.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.e;
import com.bytedance.android.livesdk.chatroom.model.a.k;
import com.bytedance.android.livesdk.chatroom.widget.AvatarIconView;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public class LinkRankAdapter extends RecyclerView.Adapter<InteractRankViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16917a;

    /* renamed from: b  reason: collision with root package name */
    private List<k> f16918b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnClickListener f16919c = a.f16927b;

    static class InteractRankViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public ImageView f16920a;

        /* renamed from: b  reason: collision with root package name */
        public View f16921b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f16922c;

        /* renamed from: d  reason: collision with root package name */
        public AvatarIconView f16923d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f16924e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f16925f;

        InteractRankViewHolder(View view) {
            super(view);
            this.f16921b = view;
            this.f16920a = (ImageView) view.findViewById(C0906R.id.b49);
            this.f16922c = (TextView) view.findViewById(C0906R.id.c_a);
            this.f16923d = (AvatarIconView) view.findViewById(C0906R.id.hk);
            this.f16924e = (TextView) view.findViewById(C0906R.id.bpn);
            this.f16925f = (TextView) view.findViewById(C0906R.id.cjx);
        }
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f16917a, false, 13007, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f16917a, false, 13007, new Class[0], Integer.TYPE)).intValue();
        } else if (Lists.isEmpty(this.f16918b)) {
            return 0;
        } else {
            return this.f16918b.size();
        }
    }

    public LinkRankAdapter(List<k> list) {
        this.f16918b = list;
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f16917a, false, 13005, new Class[]{ViewGroup.class, Integer.TYPE}, InteractRankViewHolder.class)) {
            return new InteractRankViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.amr, null));
        }
        return (InteractRankViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f16917a, false, 13005, new Class[]{ViewGroup.class, Integer.TYPE}, InteractRankViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        InteractRankViewHolder interactRankViewHolder = (InteractRankViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{interactRankViewHolder, Integer.valueOf(i)}, this, f16917a, false, 13006, new Class[]{InteractRankViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{interactRankViewHolder, Integer.valueOf(i)}, this, f16917a, false, 13006, new Class[]{InteractRankViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!Lists.isEmpty(this.f16918b)) {
            k kVar = this.f16918b.get(i);
            if (kVar != null) {
                interactRankViewHolder.f16922c.setText(String.valueOf(kVar.f11056c));
                if (kVar.f11056c <= 3) {
                    interactRankViewHolder.f16922c.setVisibility(8);
                    interactRankViewHolder.f16920a.setVisibility(0);
                    if (kVar.f11056c == 1) {
                        interactRankViewHolder.f16920a.setImageResource(2130841189);
                    } else if (kVar.f11056c == 2) {
                        interactRankViewHolder.f16920a.setImageResource(2130841190);
                    } else if (kVar.f11056c == 3) {
                        interactRankViewHolder.f16920a.setImageResource(2130841191);
                    }
                } else {
                    interactRankViewHolder.f16922c.setVisibility(0);
                    interactRankViewHolder.f16920a.setVisibility(8);
                }
                User user = kVar.f11054a;
                if (user != null) {
                    interactRankViewHolder.f16921b.setTag(user);
                    interactRankViewHolder.f16921b.setOnClickListener(this.f16919c);
                    interactRankViewHolder.f16923d.setAvatar(user.getAvatarThumb());
                    if (user.getUserHonor() != null) {
                        interactRankViewHolder.f16923d.setIcon(user.getUserHonor().k());
                    }
                    interactRankViewHolder.f16924e.setText(user.getNickName());
                }
                interactRankViewHolder.f16925f.setText(e.c(kVar.f11055b));
            }
        }
    }
}
