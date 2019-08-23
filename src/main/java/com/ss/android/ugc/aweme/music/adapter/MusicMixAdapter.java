package com.ss.android.ugc.aweme.music.adapter;

import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.adapter.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.a.f;
import com.ss.android.ugc.aweme.music.adapter.a.h;
import com.ss.android.ugc.aweme.music.adapter.a.i;
import com.ss.android.ugc.aweme.music.adapter.type.d;
import com.ss.android.ugc.aweme.music.adapter.type.e;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.music.presenter.g;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class MusicMixAdapter extends LoadMoreRecyclerViewAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56190a;

    /* renamed from: b  reason: collision with root package name */
    public String f56191b;

    /* renamed from: c  reason: collision with root package name */
    public g f56192c;

    /* renamed from: d  reason: collision with root package name */
    public c f56193d;

    /* renamed from: e  reason: collision with root package name */
    public Challenge f56194e;

    /* renamed from: f  reason: collision with root package name */
    public List<d> f56195f = new ArrayList();
    public List<d> g = new ArrayList();
    public Map<String, List<d>> h;
    public List<MusicCollectionItem> i = new ArrayList();
    public boolean j = true;
    int k = 0;
    int l = -1;
    public int m = -1;
    RecyclerView n;
    public f<f> o;
    public a p;
    public int q;
    public h r;
    private List<d> s = new ArrayList();
    private int t = 1;
    private b<List<d>> u;
    private com.ss.android.ugc.aweme.music.adapter.a.a v;
    private d w = new d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56198a;

        public final void a(RecyclerView.ViewHolder viewHolder, View view, MusicModel musicModel) {
            String str;
            MusicModel musicModel2 = musicModel;
            if (PatchProxy.isSupport(new Object[]{viewHolder, view, musicModel2}, this, f56198a, false, 59896, new Class[]{RecyclerView.ViewHolder.class, View.class, MusicModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder, view, musicModel2}, this, f56198a, false, 59896, new Class[]{RecyclerView.ViewHolder.class, View.class, MusicModel.class}, Void.TYPE);
            } else if (musicModel2 != null) {
                if (view.getId() == C0906R.id.cg2) {
                    if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL && MusicMixAdapter.this.q == 5) {
                        if (MusicMixAdapter.this.o != null) {
                            f fVar = new f(musicModel2, "upload_local_music");
                            fVar.f56172a = musicModel2;
                            MusicMixAdapter.this.o.a(fVar);
                        }
                    } else if (com.ss.android.ugc.aweme.music.util.d.a(musicModel2, view.getContext(), true)) {
                        if (!(MusicMixAdapter.this.f56192c == null || viewHolder == null)) {
                            MusicMixAdapter.this.f56192c.a(musicModel2, viewHolder.getLayoutPosition() - MusicMixAdapter.this.a());
                        }
                        if (musicModel.isChallengeMusic()) {
                            r.a("click_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("music_id", musicModel.getMusicId()).a("enter_from", "challenge_bonding").f34114b);
                        }
                    }
                } else if (view.getId() == C0906R.id.bid) {
                    if (!NetworkUtils.isNetworkAvailable(view.getContext())) {
                        com.bytedance.ies.dmt.ui.d.a.b(view.getContext(), (int) C0906R.string.bgf).a();
                    } else if (MusicMixAdapter.this.l != viewHolder.getAdapterPosition()) {
                        if (MusicMixAdapter.this.f56192c != null) {
                            MusicMixAdapter.this.b();
                            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                                MusicMixAdapter musicMixAdapter = MusicMixAdapter.this;
                                MusicUnitViewHolder musicUnitViewHolder = (MusicUnitViewHolder) viewHolder;
                                if (PatchProxy.isSupport(new Object[]{musicUnitViewHolder, musicModel2}, musicMixAdapter, MusicMixAdapter.f56190a, false, 59887, new Class[]{MusicUnitViewHolder.class, MusicModel.class}, Void.TYPE)) {
                                    MusicMixAdapter musicMixAdapter2 = musicMixAdapter;
                                    PatchProxy.accessDispatch(new Object[]{musicUnitViewHolder, musicModel2}, musicMixAdapter2, MusicMixAdapter.f56190a, false, 59887, new Class[]{MusicUnitViewHolder.class, MusicModel.class}, Void.TYPE);
                                } else {
                                    MediaPlayer a2 = com.ss.android.ugc.aweme.music.util.b.a();
                                    try {
                                        a2.reset();
                                        a2.setDataSource(musicModel.getPath());
                                        a2.setAudioStreamType(3);
                                        a2.prepareAsync();
                                        a2.setOnPreparedListener(new MediaPlayer.OnPreparedListener(musicUnitViewHolder) {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f56200a;

                                            /* renamed from: b  reason: collision with root package name */
                                            final /* synthetic */ MusicUnitViewHolder f56201b;

                                            public final void onPrepared(MediaPlayer mediaPlayer) {
                                                if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, f56200a, false, 59897, new Class[]{MediaPlayer.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, f56200a, false, 59897, new Class[]{MediaPlayer.class}, Void.TYPE);
                                                    return;
                                                }
                                                mediaPlayer.start();
                                                this.f56201b.a(true);
                                            }

                                            {
                                                this.f56201b = r2;
                                            }
                                        });
                                        a2.setOnErrorListener(new MediaPlayer.OnErrorListener() {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f56203a;

                                            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                                                if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f56203a, false, 59898, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                                                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f56203a, false, 59898, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                                                }
                                                com.ss.android.ugc.aweme.music.util.b.b();
                                                return false;
                                            }
                                        });
                                    } catch (IOException unused) {
                                    }
                                }
                            } else {
                                MusicMixAdapter.this.f56192c.a(musicModel2);
                            }
                            ((MusicUnitViewHolder) viewHolder).a(true);
                            MusicMixAdapter.this.l = viewHolder.getAdapterPosition();
                        }
                        JSONObject jSONObject = null;
                        String searchKeyWords = musicModel.getSearchKeyWords();
                        musicModel.getName();
                        if (MusicMixAdapter.this.q == 2) {
                            jSONObject = c.a().a("search_keyword", searchKeyWords).a("song_position", "search_result").b();
                        }
                        if (!StringUtils.isEmpty(musicModel.getSongId())) {
                            r.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("success").setValue(musicModel.getSongId()).setJsonObject(jSONObject));
                            r.a(view.getContext(), "music_play", "music_library_homepage", musicModel.getSongId(), 0);
                        } else if (!StringUtils.isEmpty(musicModel.getMusicId())) {
                            r.a(view.getContext(), "music_play", "music_library_homepage", musicModel.getMusicId(), 0);
                            r.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("success").setValue(musicModel.getMusicId()).setJsonObject(jSONObject));
                        }
                        if (musicModel.getMusicType() != MusicModel.MusicType.LOCAL) {
                            switch (MusicMixAdapter.this.q) {
                                case 0:
                                    str = "songchart";
                                    break;
                                case 1:
                                    str = "favorite_song";
                                    break;
                                case 2:
                                    str = "search_music";
                                    break;
                                case 3:
                                    str = "album";
                                    break;
                                default:
                                    str = "";
                                    break;
                            }
                        } else {
                            str = "local_music";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            r.a("click_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", str).a("music_id", musicModel.getMusicId()).f34114b);
                        }
                    } else if (MusicMixAdapter.this.f56192c != null) {
                        MusicMixAdapter.this.b();
                    }
                }
            }
        }
    };
    private b x = new b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56205a;

        public final void a(RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f56205a, false, 59899, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f56205a, false, 59899, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
                return;
            }
            MusicMixAdapter.this.a(MusicMixAdapter.this.i, false);
            MusicMixAdapter.this.h.put("showless_data", new ArrayList());
            MusicMixAdapter.this.a(MusicMixAdapter.this.h, MusicMixAdapter.this.q);
        }
    };
    private a y = new a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56207a;

        public final void a(RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f56207a, false, 59900, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f56207a, false, 59900, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
                return;
            }
            MusicMixAdapter.this.a(MusicMixAdapter.this.i, true);
            MusicMixAdapter.this.g.clear();
            MusicMixAdapter.this.g.add(new com.ss.android.ugc.aweme.music.adapter.type.f());
            MusicMixAdapter.this.h.put("showless_data", MusicMixAdapter.this.g);
            MusicMixAdapter.this.a(MusicMixAdapter.this.h, MusicMixAdapter.this.q);
        }

        public final void a(RecyclerView.ViewHolder viewHolder, MusicCollectionItem musicCollectionItem) {
            if (PatchProxy.isSupport(new Object[]{viewHolder, musicCollectionItem}, this, f56207a, false, 59901, new Class[]{RecyclerView.ViewHolder.class, MusicCollectionItem.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder, musicCollectionItem}, this, f56207a, false, 59901, new Class[]{RecyclerView.ViewHolder.class, MusicCollectionItem.class}, Void.TYPE);
                return;
            }
            if (MusicMixAdapter.this.f56193d != null) {
                MusicMixAdapter.this.f56193d.a(musicCollectionItem);
            }
        }
    };

    public enum a {
        BtnConfirmAndShoot,
        BtnConfirm;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    private a c() {
        if (this.p != null) {
            return this.p;
        }
        return a.BtnConfirmAndShoot;
    }

    public int getBasicItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f56190a, false, 59886, new Class[0], Integer.TYPE)) {
            return this.f56195f.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f56190a, false, 59886, new Class[0], Integer.TYPE)).intValue();
    }

    private void d() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f56190a, false, 59890, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56190a, false, 59890, new Class[0], Void.TYPE);
            return;
        }
        for (d dVar : this.f56195f) {
            if (dVar instanceof com.ss.android.ugc.aweme.music.adapter.type.g) {
                this.m = i2;
                return;
            }
            i2++;
        }
    }

    public final int a() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f56190a, false, 59888, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f56190a, false, 59888, new Class[0], Integer.TYPE)).intValue();
        } else if (this.h == null) {
            return 0;
        } else {
            List list = this.h.get("tab_data");
            if (!CollectionUtils.isEmpty(list)) {
                i2 = list.size();
            }
            return (this.f56195f.size() - i2) + 1;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f56190a, false, 59889, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56190a, false, 59889, new Class[0], Void.TYPE);
            return;
        }
        MediaPlayer a2 = com.ss.android.ugc.aweme.music.util.b.a();
        if (this.l != -1) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.n.findViewHolderForAdapterPosition(this.l);
            if (findViewHolderForAdapterPosition instanceof MusicUnitViewHolder) {
                ((MusicUnitViewHolder) findViewHolderForAdapterPosition).a(false);
            }
            this.l = -1;
        }
        if (a2 != null && a2.isPlaying()) {
            a2.pause();
        }
        this.f56192c.b(null);
    }

    public int getBasicItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f56190a, false, 59882, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f56190a, false, 59882, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f56195f.size() > i2) {
            return this.u.a(this.f56195f, i2);
        } else {
            return super.getBasicItemViewType(i2);
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f56190a, false, 59883, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f56190a, false, 59883, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        if (this.u != null) {
            this.u.a(recyclerView);
        }
        this.n = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f56190a, false, 59884, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f56190a, false, 59884, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        if (this.u != null) {
            this.u.b(recyclerView);
        }
        this.n = null;
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f56190a, false, 59880, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f56190a, false, 59880, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.v != null) {
            this.v.f56270d = this.l;
        }
        if (this.r != null) {
            this.r.f56285d = this.l;
        }
        this.u.a(this.f56195f, i2, viewHolder);
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f56190a, false, 59881, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return this.u.a(viewGroup2, i2);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f56190a, false, 59881, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public final void a(List<MusicModel> list, int i2) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i2)}, this, f56190a, false, 59877, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i2)}, this, f56190a, false, 59877, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f56195f.clear();
        this.f56195f.addAll(list);
        this.q = i2;
        if (this.r != null) {
            this.r.a(this.q);
        }
        if (this.v != null) {
            this.v.a(this.q);
        }
        d();
        notifyDataSetChanged();
    }

    public final void a(List<MusicCollectionItem> list, boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f56190a, false, 59879, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f56190a, false, 59879, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (list == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        this.k = i2;
        this.i = list;
        this.s.clear();
        this.s.addAll(list);
        if (!z) {
            this.s = this.s.subList(0, 7);
        }
        e eVar = new e();
        eVar.f56293a = this.k - this.s.size();
        if (this.k - this.s.size() > 0) {
            this.s.add(eVar);
        }
    }

    public final void a(Map<String, List<d>> map, int i2) {
        if (PatchProxy.isSupport(new Object[]{map, Integer.valueOf(i2)}, this, f56190a, false, 59878, new Class[]{Map.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map, Integer.valueOf(i2)}, this, f56190a, false, 59878, new Class[]{Map.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h = map;
        map.put("collection", this.s);
        this.f56195f = com.ss.android.ugc.aweme.music.util.d.a(map);
        this.q = i2;
        if (this.r != null) {
            this.r.a(this.q);
        }
        if (this.v != null) {
            this.v.a(this.q);
        }
        d();
        notifyDataSetChanged();
    }

    public MusicMixAdapter(g gVar, c cVar, f<f> fVar, int i2) {
        this.f56192c = gVar;
        this.f56193d = cVar;
        this.o = fVar;
        this.u = new b<>();
        this.t = i2;
        if (PatchProxy.isSupport(new Object[0], this, f56190a, false, 59876, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56190a, false, 59876, new Class[0], Void.TYPE);
        } else {
            this.u.a((com.ss.android.ugc.aweme.common.adapter.a<T>) new com.ss.android.ugc.aweme.music.adapter.a.b<T>(this.f56194e));
            com.ss.android.ugc.aweme.music.adapter.a.a aVar = new com.ss.android.ugc.aweme.music.adapter.a.a(this.w, this.q, c(), this.o, this.t);
            this.v = aVar;
            this.u.a((com.ss.android.ugc.aweme.common.adapter.a<T>) this.v);
            this.u.a((com.ss.android.ugc.aweme.common.adapter.a<T>) new com.ss.android.ugc.aweme.music.adapter.a.c<T>(this.y));
            this.u.a((com.ss.android.ugc.aweme.common.adapter.a<T>) new com.ss.android.ugc.aweme.music.adapter.a.d<T>(this.y));
            this.u.a((com.ss.android.ugc.aweme.common.adapter.a<T>) new i<T>(this.x));
            this.u.a((com.ss.android.ugc.aweme.common.adapter.a<T>) new com.ss.android.ugc.aweme.music.adapter.a.g<T>());
            this.u.a((com.ss.android.ugc.aweme.common.adapter.a<T>) new com.ss.android.ugc.aweme.music.adapter.a.e<T>());
            h hVar = new h(this.w, this.q, c(), this.o, this.t);
            this.r = hVar;
            this.u.a((com.ss.android.ugc.aweme.common.adapter.a<T>) this.r);
            this.u.a((com.ss.android.ugc.aweme.common.adapter.a<T>) new com.ss.android.ugc.aweme.music.adapter.a.f<T>(16.0f));
        }
        registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56196a;

            public void onChanged() {
            }

            public void onItemRangeChanged(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56196a, false, 59891, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56196a, false, 59891, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                MusicMixAdapter.this.b();
            }

            public void onItemRangeInserted(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56196a, false, 59893, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56196a, false, 59893, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                MusicMixAdapter.this.b();
            }

            public void onItemRangeRemoved(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56196a, false, 59894, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56196a, false, 59894, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                MusicMixAdapter.this.b();
            }

            public void onItemRangeMoved(int i, int i2, int i3) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f56196a, false, 59895, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f56196a, false, 59895, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                MusicMixAdapter.this.b();
            }

            public void onItemRangeChanged(int i, int i2, Object obj) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}, this, f56196a, false, 59892, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}, this, f56196a, false, 59892, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
                    return;
                }
                MusicMixAdapter.this.b();
            }
        });
    }
}
