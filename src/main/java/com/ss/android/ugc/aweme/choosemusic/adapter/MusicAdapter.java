package com.ss.android.ugc.aweme.choosemusic.adapter;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.choosemusic.a;
import com.ss.android.ugc.aweme.choosemusic.b.b;
import com.ss.android.ugc.aweme.choosemusic.c.c;
import com.ss.android.ugc.aweme.choosemusic.f.d;
import com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.music.ui.p;
import com.ss.android.ugc.aweme.music.util.f;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ad;
import java.io.IOException;
import java.util.Map;

public class MusicAdapter extends BaseAdapter<MusicModel> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35763a;

    /* renamed from: b  reason: collision with root package name */
    public b f35764b;

    /* renamed from: c  reason: collision with root package name */
    RecyclerView f35765c;

    /* renamed from: d  reason: collision with root package name */
    public int f35766d = -1;

    /* renamed from: e  reason: collision with root package name */
    public String f35767e;

    /* renamed from: f  reason: collision with root package name */
    public a f35768f;
    public boolean g;
    public boolean h = true;
    public int i;
    String j = "";
    private f<com.ss.android.ugc.aweme.choosemusic.a.b> k;
    private boolean l;
    private com.ss.android.ugc.aweme.choosemusic.view.f m = new com.ss.android.ugc.aweme.choosemusic.view.f() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35771a;

        public final void a(MusicItemViewHolder musicItemViewHolder, View view, MusicModel musicModel, int i) {
            String str;
            Bundle bundle;
            MusicItemViewHolder musicItemViewHolder2 = musicItemViewHolder;
            MusicModel musicModel2 = musicModel;
            if (PatchProxy.isSupport(new Object[]{musicItemViewHolder2, view, musicModel2, Integer.valueOf(i)}, this, f35771a, false, 26482, new Class[]{MusicItemViewHolder.class, View.class, MusicModel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{musicItemViewHolder2, view, musicModel2, Integer.valueOf(i)}, this, f35771a, false, 26482, new Class[]{MusicItemViewHolder.class, View.class, MusicModel.class, Integer.TYPE}, Void.TYPE);
            } else if (musicModel2 != null && view != null && view.getContext() != null) {
                if (!TextUtils.isEmpty(musicModel.getSearchKeyWords())) {
                    c.c().b(new MusicSearchHistory(musicModel.getSearchKeyWords()));
                }
                if (!NetworkUtils.isNetworkAvailable(view.getContext())) {
                    com.bytedance.ies.dmt.ui.d.a.b(view.getContext(), (int) C0906R.string.bgf).a();
                    return;
                }
                int id = view.getId();
                if (id == C0906R.id.b3e) {
                    Activity a2 = com.ss.android.ugc.aweme.framework.core.a.b().a();
                    if (a2 == null) {
                        str = "";
                    } else {
                        str = a2.getString(C0906R.string.ads);
                    }
                    if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isLogin()) {
                        Activity a3 = com.ss.android.ugc.aweme.framework.core.a.b().a();
                        String a4 = d.a(i);
                        if (com.ss.android.ugc.aweme.i18n.c.a() || TextUtils.isEmpty(str)) {
                            bundle = null;
                        } else {
                            bundle = ad.a().a("login_title", str).f75487b;
                        }
                        e.a(a3, a4, "click_favorite_music", bundle);
                        return;
                    }
                    musicItemViewHolder.d();
                    com.ss.android.ugc.aweme.choosemusic.f.c.a(musicItemViewHolder2.f36100b, musicModel.getMusicId(), MusicAdapter.this.f35768f, musicItemViewHolder2.f36103e, musicModel.getLogPb());
                    return;
                }
                if (id == C0906R.id.b3g) {
                    if (musicModel2 != null && musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                        String offlineDesc = musicModel.getMusic().getOfflineDesc();
                        if (TextUtils.isEmpty(offlineDesc)) {
                            offlineDesc = view.getContext().getString(C0906R.string.bel);
                        }
                        com.bytedance.ies.dmt.ui.d.a.c(view.getContext(), offlineDesc).a();
                    } else if (musicModel2 != null && com.ss.android.ugc.aweme.music.util.d.a(musicModel2, view.getContext(), true)) {
                        h a5 = h.a();
                        a5.a("aweme://music/detail/" + musicModel.getMusicId());
                        com.ss.android.ugc.aweme.choosemusic.f.c.a(MusicAdapter.this.f35768f, musicModel.getMusicId(), false);
                    }
                } else if (id == C0906R.id.bif) {
                    if (com.ss.android.ugc.aweme.music.util.d.a(musicModel2, view.getContext(), true) && MusicAdapter.this.f35764b != null) {
                        MusicAdapter.this.f35764b.b(musicModel2);
                        com.ss.android.ugc.aweme.choosemusic.f.c.a(MusicAdapter.this.f35768f, musicModel.getMusicId(), musicItemViewHolder.getLayoutPosition(), musicModel.getLogPb());
                    }
                } else if (id == C0906R.id.bha) {
                    if (MusicAdapter.this.f35766d == musicItemViewHolder.getPosition()) {
                        if (MusicAdapter.this.f35764b != null) {
                            MusicAdapter.this.a();
                        }
                    } else if (MusicAdapter.this.f35764b != null) {
                        MusicAdapter.this.a();
                        if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                            MusicAdapter musicAdapter = MusicAdapter.this;
                            if (PatchProxy.isSupport(new Object[]{musicItemViewHolder2, musicModel2}, musicAdapter, MusicAdapter.f35763a, false, 26471, new Class[]{MusicItemViewHolder.class, MusicModel.class}, Void.TYPE)) {
                                Object[] objArr = {musicItemViewHolder2, musicModel2};
                                MusicAdapter musicAdapter2 = musicAdapter;
                                PatchProxy.accessDispatch(objArr, musicAdapter2, MusicAdapter.f35763a, false, 26471, new Class[]{MusicItemViewHolder.class, MusicModel.class}, Void.TYPE);
                            } else {
                                MediaPlayer a6 = com.ss.android.ugc.aweme.music.util.b.a();
                                try {
                                    a6.reset();
                                    a6.setDataSource(musicModel.getPath());
                                    a6.setAudioStreamType(3);
                                    a6.prepareAsync();
                                    a6.setOnPreparedListener(new a(musicItemViewHolder2));
                                    a6.setOnErrorListener(b.f35788b);
                                } catch (IOException unused) {
                                }
                            }
                        } else {
                            musicItemViewHolder2.a(true);
                            musicItemViewHolder2.a(true, true);
                            MusicAdapter.this.f35764b.a((p.a) new d(this));
                            MusicAdapter.this.f35764b.a(musicModel2, MusicAdapter.this.f35768f);
                            com.ss.android.ugc.aweme.choosemusic.f.c.a(musicItemViewHolder.getPosition());
                        }
                        MusicAdapter.this.f35766d = musicItemViewHolder.getPosition();
                    }
                }
            }
        }
    };

    public void showLoadMoreEmpty() {
        if (PatchProxy.isSupport(new Object[0], this, f35763a, false, 26476, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35763a, false, 26476, new Class[0], Void.TYPE);
            return;
        }
        super.showLoadMoreEmpty();
        r.a("music_search_feedback_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "video_shoot_page").f34114b);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f35763a, false, 26472, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35763a, false, 26472, new Class[0], Void.TYPE);
        } else if (this.f35766d >= 0) {
            MediaPlayer a2 = com.ss.android.ugc.aweme.music.util.b.a();
            if (this.f35766d != -1) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.f35765c.findViewHolderForAdapterPosition(this.f35766d);
                if (findViewHolderForAdapterPosition instanceof MusicItemViewHolder) {
                    ((MusicItemViewHolder) findViewHolderForAdapterPosition).a(false);
                }
                this.f35766d = -1;
            }
            if (a2 != null && a2.isPlaying()) {
                a2.pause();
            }
            if (this.f35764b != null) {
                this.f35764b.a((MusicModel) null);
            }
        }
    }

    public MusicAdapter(f<com.ss.android.ugc.aweme.choosemusic.a.b> fVar) {
        this.k = fVar;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f35763a, false, 26474, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f35763a, false, 26474, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.f35765c = recyclerView2;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f35763a, false, 26475, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f35763a, false, 26475, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        this.f35765c = null;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f35763a, false, 26473, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f35763a, false, 26473, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f35766d >= 0) {
            this.f35765c.post(new c(this, false));
        }
    }

    public RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f35763a, false, 26470, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f35763a, false, 26470, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        try {
            z = g.b().bM().booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        if (!this.l || !z) {
            return super.onCreateFooterViewHolder(viewGroup);
        }
        RecyclerView.ViewHolder onCreateFooterViewHolder = super.onCreateFooterViewHolder(viewGroup);
        try {
            this.j = g.b().O().getMusicFaq().getSchema();
        } catch (Exception unused2) {
        }
        SpannableString spannableString = new SpannableString(viewGroup.getContext().getString(C0906R.string.c2g));
        e.a(spannableString, new ClickableSpan() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35769a;

            public final void updateDrawState(TextPaint textPaint) {
                TextPaint textPaint2 = textPaint;
                if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f35769a, false, 26481, new Class[]{TextPaint.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f35769a, false, 26481, new Class[]{TextPaint.class}, Void.TYPE);
                    return;
                }
                super.updateDrawState(textPaint);
                textPaint2.setUnderlineText(false);
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f35769a, false, 26480, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f35769a, false, 26480, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                f.a a2 = com.ss.android.ugc.aweme.music.util.f.a(MusicAdapter.this.j);
                a2.a("enter_from", "video_shoot_page");
                h.a().a(a2.a().toString());
                r.a("music_search_feedback_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "video_shoot_page").f34114b);
            }
        }, 9, spannableString.length(), 33);
        e.a(spannableString, new ForegroundColorSpan(ContextCompat.getColor(viewGroup.getContext(), C0906R.color.zm)), 9, spannableString.length(), 33);
        TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aqm, null);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setTextColor(ContextCompat.getColor(viewGroup.getContext(), C0906R.color.p3));
        textView.setPadding(0, 20, 0, 0);
        DmtStatusView dmtStatusView = (DmtStatusView) onCreateFooterViewHolder.itemView;
        dmtStatusView.setBuilder(dmtStatusView.a().b((View) textView));
        return onCreateFooterViewHolder;
    }

    public MusicAdapter(com.ss.android.ugc.aweme.music.adapter.f<com.ss.android.ugc.aweme.choosemusic.a.b> fVar, boolean z) {
        this.k = fVar;
        this.l = true;
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f35763a, false, 26469, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f35763a, false, 26469, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        MusicItemViewHolder musicItemViewHolder = new MusicItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.xp, viewGroup, false), this.i);
        musicItemViewHolder.a(this.m, this.k);
        return musicItemViewHolder;
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f35763a, false, 26468, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f35763a, false, 26468, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        MusicModel musicModel = (MusicModel) getData().get(i3);
        MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) viewHolder;
        String str = this.f35767e;
        boolean z2 = this.g;
        if (i3 == this.f35766d) {
            z = true;
        } else {
            z = false;
        }
        musicItemViewHolder.a(musicModel, str, z2, z, false, 0, 0, i2, this.f35768f);
        com.ss.android.ugc.aweme.choosemusic.f.c.a(this.f35768f, musicModel.getMusicId(), i3, this.h);
    }
}
