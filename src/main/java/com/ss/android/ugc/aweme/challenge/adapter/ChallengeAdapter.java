package com.ss.android.ugc.aweme.challenge.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.i18n.b;

public class ChallengeAdapter extends BaseAdapter<Challenge> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35321a;

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f35321a, false, 25774, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new ChallengeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.s6, viewGroup2, false));
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f35321a, false, 25774, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f35321a, false, 25773, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f35321a, false, 25773, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ChallengeViewHolder challengeViewHolder = (ChallengeViewHolder) viewHolder;
        Challenge challenge = (Challenge) this.mItems.get(i);
        if (PatchProxy.isSupport(new Object[]{challenge}, challengeViewHolder, ChallengeViewHolder.f35322a, false, 25775, new Class[]{Challenge.class}, Void.TYPE)) {
            ChallengeViewHolder challengeViewHolder2 = challengeViewHolder;
            PatchProxy.accessDispatch(new Object[]{challenge}, challengeViewHolder2, ChallengeViewHolder.f35322a, false, 25775, new Class[]{Challenge.class}, Void.TYPE);
            return;
        }
        if (challenge != null) {
            challengeViewHolder.f35323b = challenge;
            challengeViewHolder.mTitleView.setText(challengeViewHolder.f35323b.getChallengeName());
            if (TextUtils.isEmpty(challengeViewHolder.f35323b.getDesc())) {
                challengeViewHolder.mTitleView.setPadding(0, 0, 0, challengeViewHolder.margin);
                challengeViewHolder.mDescView.setVisibility(8);
            } else {
                challengeViewHolder.mTitleView.setPadding(0, 0, 0, 0);
                challengeViewHolder.mDescView.setVisibility(0);
                challengeViewHolder.mDescView.setText(challengeViewHolder.f35323b.getDesc());
            }
            challengeViewHolder.mJoinCountView.setText(challengeViewHolder.itemView.getResources().getString(C0906R.string.b3w, new Object[]{b.a((long) challengeViewHolder.f35323b.getUserCount())}));
        }
    }
}
