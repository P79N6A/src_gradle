package com.ss.android.ugc.aweme.challenge.ui;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicDetailActivity;
import com.ss.android.ugc.aweme.music.util.c;
import com.ss.android.ugc.aweme.music.util.d;
import java.util.List;

public class RelatedMusicChallengeAdapter extends RecyclerView.Adapter<TagViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35568a;

    /* renamed from: b  reason: collision with root package name */
    List<RelatedChallengeMusic> f35569b;

    /* renamed from: c  reason: collision with root package name */
    public String f35570c;

    /* renamed from: d  reason: collision with root package name */
    public Context f35571d;

    /* renamed from: e  reason: collision with root package name */
    public String f35572e;

    static class TagViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131496685)
        LinearLayout llRelated;
        @BindView(2131495863)
        TextView txtName;

        TagViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    public class TagViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35577a;

        /* renamed from: b  reason: collision with root package name */
        private TagViewHolder f35578b;

        @CallSuper
        public void unbind() {
            if (PatchProxy.isSupport(new Object[0], this, f35577a, false, 26302, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f35577a, false, 26302, new Class[0], Void.TYPE);
                return;
            }
            TagViewHolder tagViewHolder = this.f35578b;
            if (tagViewHolder != null) {
                this.f35578b = null;
                tagViewHolder.txtName = null;
                tagViewHolder.llRelated = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        @UiThread
        public TagViewHolder_ViewBinding(TagViewHolder tagViewHolder, View view) {
            this.f35578b = tagViewHolder;
            tagViewHolder.txtName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bps, "field 'txtName'", TextView.class);
            tagViewHolder.llRelated = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.ccy, "field 'llRelated'", LinearLayout.class);
        }
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f35568a, false, 26300, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f35568a, false, 26300, new Class[0], Integer.TYPE)).intValue();
        } else if (CollectionUtils.isEmpty(this.f35569b)) {
            return 0;
        } else {
            return this.f35569b.size();
        }
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35568a, false, 26299, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35568a, false, 26299, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        RelatedChallengeMusic relatedChallengeMusic = this.f35569b.get(i);
        if (relatedChallengeMusic != null) {
            int i2 = relatedChallengeMusic.categoryType;
            if (i2 == 1) {
                return 1;
            }
            if (i2 == 2) {
                return 2;
            }
        }
        return super.getItemViewType(i);
    }

    public RelatedMusicChallengeAdapter(List<RelatedChallengeMusic> list, Context context) {
        this.f35569b = list;
        this.f35571d = context;
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TagViewHolder tagViewHolder = (TagViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{tagViewHolder, Integer.valueOf(i)}, this, f35568a, false, 26298, new Class[]{TagViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tagViewHolder, Integer.valueOf(i)}, this, f35568a, false, 26298, new Class[]{TagViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        final int itemViewType = getItemViewType(i);
        final RelatedChallengeMusic relatedChallengeMusic = this.f35569b.get(i);
        if (relatedChallengeMusic != null) {
            if (itemViewType == 2) {
                Challenge challenge = relatedChallengeMusic.challenge;
                if (challenge != null) {
                    tagViewHolder.txtName.setText(challenge.getChallengeName());
                }
            } else if (itemViewType == 1) {
                Music music = relatedChallengeMusic.music;
                if (music != null) {
                    tagViewHolder.txtName.setText(music.getMusicName());
                }
            }
            tagViewHolder.llRelated.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35573a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f35573a, false, 26301, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f35573a, false, 26301, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (itemViewType == 1) {
                        Music music = relatedChallengeMusic.music;
                        if ((!a.a() || music == null || d.a(c.f56796b.a(music), RelatedMusicChallengeAdapter.this.f35571d, true)) && music != null) {
                            r.onEvent(MobClick.obtain().setEventName("choose_music").setLabelName(RelatedMusicChallengeAdapter.this.f35572e).setValue(music.getMid()).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("host", RelatedMusicChallengeAdapter.this.f35570c).b()));
                            MusicDetailActivity.a(RelatedMusicChallengeAdapter.this.f35571d, music.getMid(), "from_related_tag");
                        }
                        return;
                    }
                    if (itemViewType == 2) {
                        Challenge challenge = relatedChallengeMusic.challenge;
                        if (challenge != null) {
                            com.ss.android.ugc.aweme.commercialize.utils.r.a(challenge);
                            r.onEvent(MobClick.obtain().setEventName("choose_challenge").setLabelName(RelatedMusicChallengeAdapter.this.f35572e).setValue(challenge.getCid()).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("host", RelatedMusicChallengeAdapter.this.f35570c).b()));
                            if (a.a()) {
                                ChallengeDetailActivity.a(RelatedMusicChallengeAdapter.this.f35571d, challenge.getCid(), "from_related_tag");
                                return;
                            }
                            Context context = RelatedMusicChallengeAdapter.this.f35571d;
                            String cid = challenge.getCid();
                            int subType = challenge.getSubType();
                            Object[] objArr = {context, cid, "from_related_tag", Integer.valueOf(subType), (byte) 0};
                            if (PatchProxy.isSupport(objArr, null, ChallengeDetailActivity.f35486b, true, 26035, new Class[]{Context.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                                Object[] objArr2 = {context, cid, "from_related_tag", Integer.valueOf(subType), (byte) 0};
                                Object[] objArr3 = objArr2;
                                PatchProxy.accessDispatch(objArr3, null, ChallengeDetailActivity.f35486b, true, 26035, new Class[]{Context.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                                return;
                            }
                            ChallengeDetailActivity.f35487c.a(context, cid, "from_related_tag", subType, false);
                        }
                    }
                }
            });
        }
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f35568a, false, 26297, new Class[]{ViewGroup.class, Integer.TYPE}, TagViewHolder.class)) {
            return (TagViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f35568a, false, 26297, new Class[]{ViewGroup.class, Integer.TYPE}, TagViewHolder.class);
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 2) {
            view = from.inflate(C0906R.layout.h6, viewGroup2, false);
        } else {
            view = from.inflate(C0906R.layout.aan, viewGroup2, false);
        }
        return new TagViewHolder(view);
    }
}
