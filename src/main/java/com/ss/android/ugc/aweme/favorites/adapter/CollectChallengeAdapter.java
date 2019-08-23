package com.ss.android.ugc.aweme.favorites.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.favorites.viewholder.ChallengeCollectViewHolder;
import com.ss.android.ugc.aweme.i18n.b;

public class CollectChallengeAdapter extends BaseAdapter<Challenge> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44235a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f44236b;

    public CollectChallengeAdapter(Activity activity) {
        this.f44236b = activity;
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44235a, false, 39392, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new ChallengeCollectViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ss, viewGroup2, false));
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44235a, false, 39392, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f44235a, false, 39391, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f44235a, false, 39391, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Challenge challenge = (Challenge) getData().get(i);
        ChallengeCollectViewHolder challengeCollectViewHolder = (ChallengeCollectViewHolder) viewHolder;
        Activity activity = this.f44236b;
        if (PatchProxy.isSupport(new Object[]{challenge, activity}, challengeCollectViewHolder, ChallengeCollectViewHolder.f44363a, false, 39687, new Class[]{Challenge.class, Activity.class}, Void.TYPE)) {
            ChallengeCollectViewHolder challengeCollectViewHolder2 = challengeCollectViewHolder;
            PatchProxy.accessDispatch(new Object[]{challenge, activity}, challengeCollectViewHolder2, ChallengeCollectViewHolder.f44363a, false, 39687, new Class[]{Challenge.class, Activity.class}, Void.TYPE);
            return;
        }
        if (challenge != null) {
            challengeCollectViewHolder.f44365c = activity;
            challengeCollectViewHolder.f44364b = challenge;
            if (challenge.getCoverItem() != null) {
                c.b(challengeCollectViewHolder.mCoverView, challenge.getCoverItem());
            } else {
                c.a(challengeCollectViewHolder.mCoverView, 2130840133);
            }
            challengeCollectViewHolder.mNameView.setText(challengeCollectViewHolder.f44364b.getChallengeName());
            if (challenge.getViewCount() >= 0) {
                i2 = C0906R.string.rp;
            } else {
                i2 = C0906R.string.b3x;
            }
            challengeCollectViewHolder.txtUserCount.setText(challengeCollectViewHolder.itemView.getResources().getString(i2, new Object[]{b.a(challenge.getDisplayCount())}));
            challengeCollectViewHolder.a();
        }
    }
}
