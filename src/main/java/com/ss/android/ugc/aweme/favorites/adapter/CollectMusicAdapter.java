package com.ss.android.ugc.aweme.favorites.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.viewholder.MusicCollectViewHolder;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.music.a.f;
import com.ss.android.ugc.aweme.music.adapter.d;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.presenter.g;
import com.ss.android.ugc.aweme.music.ui.a.b;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Map;

public class CollectMusicAdapter extends BaseAdapter<Music> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44237a;

    /* renamed from: b  reason: collision with root package name */
    public g f44238b;

    /* renamed from: c  reason: collision with root package name */
    public int f44239c = -1;

    /* renamed from: d  reason: collision with root package name */
    private aa<f> f44240d;

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView f44241e;

    /* renamed from: f  reason: collision with root package name */
    private d f44242f = new d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44243a;

        public final void a(RecyclerView.ViewHolder viewHolder, View view, MusicModel musicModel) {
            MusicModel musicModel2 = musicModel;
            if (PatchProxy.isSupport(new Object[]{viewHolder, view, musicModel2}, this, f44243a, false, 39398, new Class[]{RecyclerView.ViewHolder.class, View.class, MusicModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder, view, musicModel2}, this, f44243a, false, 39398, new Class[]{RecyclerView.ViewHolder.class, View.class, MusicModel.class}, Void.TYPE);
            } else if (musicModel2 != null && view != null && view.getContext() != null) {
                if (!NetworkUtils.isNetworkAvailable(view.getContext())) {
                    a.b(view.getContext(), (int) C0906R.string.bgf).a();
                    return;
                }
                int id = view.getId();
                if (id == C0906R.id.cg2) {
                    if (!(!com.ss.android.ugc.aweme.music.util.d.a(musicModel2, view.getContext(), true) || CollectMusicAdapter.this.f44238b == null || viewHolder == null)) {
                        CollectMusicAdapter.this.f44238b.a(musicModel2, viewHolder.getLayoutPosition());
                    }
                } else if (id == C0906R.id.bid) {
                    if (CollectMusicAdapter.this.f44239c == viewHolder.getAdapterPosition()) {
                        if (CollectMusicAdapter.this.f44238b != null) {
                            CollectMusicAdapter.this.a();
                        }
                    } else if (CollectMusicAdapter.this.f44238b != null) {
                        CollectMusicAdapter.this.a();
                        CollectMusicAdapter.this.f44238b.a(musicModel2);
                        ((MusicCollectViewHolder) viewHolder).a(true);
                        CollectMusicAdapter.this.f44239c = viewHolder.getAdapterPosition();
                    }
                    r.a("click_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "collection_music").a("music_id", musicModel.getMusicId()).f34114b);
                }
            }
        }
    };

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44237a, false, 39395, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44237a, false, 39395, new Class[0], Void.TYPE);
            return;
        }
        if (this.f44239c != -1) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.f44241e.findViewHolderForAdapterPosition(this.f44239c);
            if (findViewHolderForAdapterPosition instanceof MusicCollectViewHolder) {
                ((MusicCollectViewHolder) findViewHolderForAdapterPosition).a(false);
            }
            this.f44239c = -1;
        }
        this.f44238b.b(null);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f44237a, false, 39396, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f44237a, false, 39396, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.f44241e = recyclerView2;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f44237a, false, 39397, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f44237a, false, 39397, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        this.f44241e = null;
    }

    public CollectMusicAdapter(g gVar, aa<f> aaVar) {
        this.f44238b = gVar;
        this.f44240d = null;
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44237a, false, 39394, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new MusicCollectViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.st, viewGroup2, false), this.f44242f);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44237a, false, 39394, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        String str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f44237a, false, 39393, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f44237a, false, 39393, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Music music = (Music) getData().get(i2);
        MusicCollectViewHolder musicCollectViewHolder = (MusicCollectViewHolder) viewHolder;
        if (i2 == this.f44239c) {
            z = true;
        } else {
            z = false;
        }
        if (PatchProxy.isSupport(new Object[]{music, Byte.valueOf(z ? (byte) 1 : 0)}, musicCollectViewHolder, MusicCollectViewHolder.f44372a, false, 39695, new Class[]{Music.class, Boolean.TYPE}, Void.TYPE)) {
            MusicCollectViewHolder musicCollectViewHolder2 = musicCollectViewHolder;
            PatchProxy.accessDispatch(new Object[]{music, Byte.valueOf(z)}, musicCollectViewHolder2, MusicCollectViewHolder.f44372a, false, 39695, new Class[]{Music.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (music != null) {
            musicCollectViewHolder.f44373b = music;
            if (music.getCoverMedium() != null && music.getCoverMedium().getUrlList() != null && music.getCoverMedium().getUrlList().size() > 0) {
                c.a(musicCollectViewHolder.mCoverView, musicCollectViewHolder.f44373b.getCoverMedium().getUrlList().get(0));
            } else if (music.getCoverThumb() != null && music.getCoverThumb().getUrlList() != null && music.getCoverThumb().getUrlList().size() > 0) {
                c.a(musicCollectViewHolder.mCoverView, musicCollectViewHolder.f44373b.getCoverThumb().getUrlList().get(0));
            } else if (music.getCoverLarge() == null || music.getCoverLarge().getUrlList() == null || music.getCoverLarge().getUrlList().size() <= 0) {
                c.a(musicCollectViewHolder.mCoverView, 2130840135);
            } else {
                c.a(musicCollectViewHolder.mCoverView, musicCollectViewHolder.f44373b.getCoverLarge().getUrlList().get(0));
            }
            TextView textView = musicCollectViewHolder.mSingerView;
            if (TextUtils.isEmpty(musicCollectViewHolder.f44373b.getAuthorName())) {
                str = musicCollectViewHolder.itemView.getResources().getString(C0906R.string.do3);
            } else {
                str = musicCollectViewHolder.f44373b.getAuthorName();
            }
            textView.setText(str);
            musicCollectViewHolder.mNameView.setText(musicCollectViewHolder.f44373b.getMusicName());
            if (TextUtils.isEmpty(musicCollectViewHolder.f44373b.getMusicName()) || !music.isOriginMusic()) {
                musicCollectViewHolder.mOriginalTag.setVisibility(8);
            } else {
                musicCollectViewHolder.mOriginalTag.setVisibility(0);
            }
            b.f56658c.a(musicCollectViewHolder.mNameView, music, com.ss.android.g.a.b());
            musicCollectViewHolder.mMusicDuration.setText(com.ss.android.ugc.aweme.music.util.d.a(musicCollectViewHolder.f44373b.getDuration() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
            musicCollectViewHolder.mProgressBarView.setVisibility(8);
            musicCollectViewHolder.b(z);
            musicCollectViewHolder.a();
        }
    }
}
