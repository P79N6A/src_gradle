package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicianCard;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/ugc/aweme/discover/adapter/IPositionProvider;", "itemView", "Landroid/view/View;", "provider", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/discover/adapter/IPositionProvider;)V", "bottomGap", "Landroid/widget/Space;", "content", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "keyword", "", "searchMusic", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "title", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "topDivider", "viewMore", "bind", "", "data", "buildMusicIdList", "getMobPosition", "", "music", "Lcom/ss/android/ugc/aweme/music/model/Music;", "sendArtistCardShowEvent", "sendEnterArtistCardDetailEvent", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMusicianCard extends RecyclerView.ViewHolder implements p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41850a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f41851d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final Context f41852b;

    /* renamed from: c  reason: collision with root package name */
    public SearchMusic f41853c;

    /* renamed from: e  reason: collision with root package name */
    private final DmtTextView f41854e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewGroup f41855f;
    private final View g;
    private final View h;
    private final Space i;
    private String j;
    private final p k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicianCard$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicianCard;", "parent", "Landroid/view/ViewGroup;", "provider", "Lcom/ss/android/ugc/aweme/discover/adapter/IPositionProvider;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41858a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f41850a, false, 35859, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41850a, false, 35859, new Class[0], Void.TYPE);
            return;
        }
        d a2 = d.a().a("enter_from", "search_result");
        SearchMusic searchMusic = this.f41853c;
        if (searchMusic == null) {
            Intrinsics.throwNpe();
        }
        List musicList = searchMusic.getMusicList();
        if (musicList == null) {
            Intrinsics.throwNpe();
        }
        d a3 = a2.a("music_num", musicList.size());
        SearchMusic searchMusic2 = this.f41853c;
        if (searchMusic2 == null) {
            Intrinsics.throwNpe();
        }
        d a4 = a3.a("music_list", a(searchMusic2)).a("search_keyword", this.j);
        ai a5 = ai.a();
        SearchMusic searchMusic3 = this.f41853c;
        if (searchMusic3 == null) {
            Intrinsics.throwNpe();
        }
        List musicList2 = searchMusic3.getMusicList();
        if (musicList2 == null) {
            Intrinsics.throwNpe();
        }
        r.a("enter_artist_card_detail", (Map) a4.a("log_pb", a5.a(((Music) musicList2.get(0)).getRequestId())).f34114b);
    }

    private final String a(SearchMusic searchMusic) {
        if (PatchProxy.isSupport(new Object[]{searchMusic}, this, f41850a, false, 35857, new Class[]{SearchMusic.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{searchMusic}, this, f41850a, false, 35857, new Class[]{SearchMusic.class}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        List<Music> musicList = searchMusic.getMusicList();
        if (musicList == null) {
            Intrinsics.throwNpe();
        }
        for (Music mid : musicList) {
            sb.append(mid.getMid());
            sb.append(",");
        }
        StringsKt.removeSuffix((CharSequence) sb, (CharSequence) ",");
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "musicIdList.toString()");
        return sb2;
    }

    public final int a(@NotNull Music music) {
        if (PatchProxy.isSupport(new Object[]{music}, this, f41850a, false, 35856, new Class[]{Music.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{music}, this, f41850a, false, 35856, new Class[]{Music.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(music, "music");
        p pVar = this.k;
        SearchMusic searchMusic = this.f41853c;
        if (searchMusic == null) {
            Intrinsics.throwNpe();
        }
        List musicList = searchMusic.getMusicList();
        if (musicList == null) {
            Intrinsics.throwNpe();
        }
        int a2 = pVar.a((Music) CollectionsKt.first(musicList));
        SearchMusic searchMusic2 = this.f41853c;
        if (searchMusic2 == null) {
            Intrinsics.throwNpe();
        }
        List musicList2 = searchMusic2.getMusicList();
        if (musicList2 == null) {
            Intrinsics.throwNpe();
        }
        return a2 + musicList2.indexOf(music);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchMusicianCard(@NotNull View view, @NotNull p pVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(pVar, "provider");
        this.k = pVar;
        View findViewById = view.findViewById(C0906R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.title)");
        this.f41854e = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.yp);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.content)");
        this.f41855f = (ViewGroup) findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.dtg);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.viewMore)");
        this.g = findViewById3;
        View findViewById4 = view.findViewById(C0906R.id.d4p);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.topDivider)");
        this.h = findViewById4;
        View findViewById5 = view.findViewById(C0906R.id.m2);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.bottomGap)");
        this.i = (Space) findViewById5;
        this.f41852b = view.getContext();
        this.g.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41856a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SearchMusicianCard f41857b;

            {
                this.f41857b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f41856a, false, 35861, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41856a, false, 35861, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                SearchMusic searchMusic = this.f41857b.f41853c;
                if (searchMusic != null) {
                    List musicList = searchMusic.getMusicList();
                    if (musicList != null && !CollectionUtils.isEmpty(musicList)) {
                        int a2 = this.f41857b.a((Music) CollectionsKt.last(musicList)) + 1;
                        MusicianMusicListActivity.a aVar = MusicianMusicListActivity.f41519b;
                        Context context = this.f41857b.f41852b;
                        Intrinsics.checkExpressionValueIsNotNull(context, "context");
                        String authorName = ((Music) CollectionsKt.first(musicList)).getAuthorName();
                        Intrinsics.checkExpressionValueIsNotNull(authorName, "musicList.first().authorName");
                        if (PatchProxy.isSupport(new Object[]{context, authorName, Integer.valueOf(a2)}, aVar, MusicianMusicListActivity.a.f41520a, false, 35468, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
                            MusicianMusicListActivity.a aVar2 = aVar;
                            PatchProxy.accessDispatch(new Object[]{context, authorName, Integer.valueOf(a2)}, aVar2, MusicianMusicListActivity.a.f41520a, false, 35468, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull(context, "context");
                            Intrinsics.checkParameterIsNotNull(authorName, "author");
                            Intent intent = new Intent(context, MusicianMusicListActivity.class);
                            intent.putExtra("param_music_author", authorName);
                            intent.putExtra("param_holder_postion", a2);
                            context.startActivity(intent);
                        }
                        this.f41857b.a();
                    }
                }
            }
        });
    }

    public final void a(@Nullable SearchMusic searchMusic, @NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{searchMusic, str}, this, f41850a, false, 35855, new Class[]{SearchMusic.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchMusic, str}, this, f41850a, false, 35855, new Class[]{SearchMusic.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "keyword");
        if (searchMusic != null) {
            List<Music> musicList = searchMusic.getMusicList();
            if (musicList != null && !CollectionUtils.isEmpty(musicList)) {
                DmtTextView dmtTextView = this.f41854e;
                String string = this.f41852b.getString(C0906R.string.bek, new Object[]{((Music) CollectionsKt.first(musicList)).getAuthorName()});
                Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…cList.first().authorName)");
                String format = String.format(string, Arrays.copyOf(new Object[0], 0));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                dmtTextView.setText(format);
                this.f41855f.removeAllViews();
                s sVar = new s(false);
                sVar.f41973e = "artist_card";
                for (Music a2 : musicList) {
                    SearchMusicViewHolder a3 = SearchMusicViewHolder.j.a(this.f41855f, str, null, this);
                    a3.a("search_result");
                    a3.a(sVar);
                    a3.a(a2, str);
                    this.f41855f.addView(a3.a());
                }
                int i2 = 8;
                if (searchMusic.getHasMore()) {
                    this.g.setVisibility(0);
                    this.i.setVisibility(8);
                } else {
                    this.g.setVisibility(8);
                    this.i.setVisibility(0);
                }
                View view = this.h;
                if (getAdapterPosition() != 0) {
                    i2 = 0;
                }
                view.setVisibility(i2);
                this.f41853c = searchMusic;
                this.j = str;
                if (!searchMusic.getHasMobShow()) {
                    if (PatchProxy.isSupport(new Object[0], this, f41850a, false, 35858, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f41850a, false, 35858, new Class[0], Void.TYPE);
                    } else {
                        d a4 = d.a().a("enter_from", "search_result");
                        SearchMusic searchMusic2 = this.f41853c;
                        if (searchMusic2 == null) {
                            Intrinsics.throwNpe();
                        }
                        List musicList2 = searchMusic2.getMusicList();
                        if (musicList2 == null) {
                            Intrinsics.throwNpe();
                        }
                        d a5 = a4.a("music_num", musicList2.size());
                        SearchMusic searchMusic3 = this.f41853c;
                        if (searchMusic3 == null) {
                            Intrinsics.throwNpe();
                        }
                        d a6 = a5.a("music_list", a(searchMusic3));
                        SearchMusic searchMusic4 = this.f41853c;
                        if (searchMusic4 == null) {
                            Intrinsics.throwNpe();
                        }
                        d a7 = a6.a("is_more_sounds", searchMusic4.getHasMore() ? 1 : 0).a("search_keyword", this.j);
                        ai a8 = ai.a();
                        SearchMusic searchMusic5 = this.f41853c;
                        if (searchMusic5 == null) {
                            Intrinsics.throwNpe();
                        }
                        List musicList3 = searchMusic5.getMusicList();
                        if (musicList3 == null) {
                            Intrinsics.throwNpe();
                        }
                        r.a("artist_card_show", (Map) a7.a("log_pb", a8.a(((Music) musicList3.get(0)).getRequestId())).f34114b);
                    }
                    searchMusic.setHasMobShow(true);
                }
            }
        }
    }
}
