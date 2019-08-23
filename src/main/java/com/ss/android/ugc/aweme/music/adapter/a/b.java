package com.ss.android.ugc.aweme.music.adapter.a;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.adapter.ChallengeTitleViewHolder;
import com.ss.android.ugc.aweme.music.adapter.type.d;
import java.util.List;

public final class b extends a<List<d>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56273a;

    /* renamed from: b  reason: collision with root package name */
    private Challenge f56274b;

    public b(Challenge challenge) {
        this.f56274b = challenge;
    }

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f56273a, false, 59963, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new ChallengeTitleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.h7, viewGroup2, false));
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f56273a, false, 59963, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        if (!PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f56273a, false, 59962, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return list.get(i) instanceof com.ss.android.ugc.aweme.music.adapter.type.a;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f56273a, false, 59962, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
        List list2 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f56273a, false, 59964, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f56273a, false, 59964, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        ChallengeTitleViewHolder challengeTitleViewHolder = (ChallengeTitleViewHolder) viewHolder;
        Challenge challenge = this.f56274b;
        if (PatchProxy.isSupport(new Object[]{challenge}, challengeTitleViewHolder, ChallengeTitleViewHolder.f56177a, false, 59869, new Class[]{Challenge.class}, Void.TYPE)) {
            ChallengeTitleViewHolder challengeTitleViewHolder2 = challengeTitleViewHolder;
            PatchProxy.accessDispatch(new Object[]{challenge}, challengeTitleViewHolder2, ChallengeTitleViewHolder.f56177a, false, 59869, new Class[]{Challenge.class}, Void.TYPE);
        } else if (challenge == null || challenge.getConnectMusics() == null || challenge.getConnectMusics().isEmpty()) {
            challengeTitleViewHolder.a(false);
            challengeTitleViewHolder.rootLayout.setVisibility(8);
            challengeTitleViewHolder.itemView.setVisibility(8);
        } else {
            challengeTitleViewHolder.a(true);
            challengeTitleViewHolder.rootLayout.setVisibility(0);
            challengeTitleViewHolder.title.setText(challenge.getChallengeName());
        }
    }
}
