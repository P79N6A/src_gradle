package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.SearchMusicClusterViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.SearchMusicianCard;
import com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.ss.android.ugc.aweme.discover.model.CardType;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.util.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\u00020\u00042\u00020\u0005:\u0001,B\u001f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0014H\u0014J\u0018\u0010&\u001a\u00020\u001b2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(H\u0016J\u0018\u0010)\u001a\u00020\u001b2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(H\u0016J\b\u0010*\u001a\u00020\u001bH\u0016J\u0018\u0010+\u001a\u00020\u001b2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicAdapter;", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchBaseAdapter;", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "Lcom/bytedance/jedi/arch/ext/list/DiffableAdapter;", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicClusterViewHolder$IMusicClusterListener;", "Lcom/ss/android/ugc/aweme/discover/adapter/IPositionProvider;", "playHelper", "Lcom/ss/android/ugc/aweme/discover/helper/MusicPlayHelper;", "mobParam", "Lcom/ss/android/ugc/aweme/discover/adapter/MobParam;", "mKeyword", "", "(Lcom/ss/android/ugc/aweme/discover/helper/MusicPlayHelper;Lcom/ss/android/ugc/aweme/discover/adapter/MobParam;Ljava/lang/String;)V", "mClusterDelegate", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicClusterDelegate;", "mDiffer", "Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "getMDiffer", "()Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "getBasicItemViewType", "", "position", "getItemCount", "getMobPosition", "music", "Lcom/ss/android/ugc/aweme/music/model/Music;", "onBindBasicViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "onClusterExpand", "cluster", "Lcom/ss/android/ugc/aweme/discover/adapter/ClusterButtonData;", "onCreateFooterViewHolder", "parent", "Landroid/view/ViewGroup;", "onCreateItemViewHolder", "viewType", "setData", "list", "", "setDataAfterLoadMore", "showLoadMoreEmpty", "submitList", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMusicAdapter extends SearchBaseAdapter<SearchMusic> implements com.bytedance.jedi.arch.ext.list.a<SearchMusic>, SearchMusicClusterViewHolder.b, p {
    public static ChangeQuickRedirect i;
    public static final a j = new a((byte) 0);
    private final z k = new z();
    @NotNull
    private final com.bytedance.jedi.arch.ext.list.differ.b<SearchMusic> l = new com.bytedance.jedi.arch.ext.list.differ.b<>(this, new SearchMusicAdapter$mDiffer$1(), null, 4);
    private final MusicPlayHelper m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicAdapter$Companion;", "", "()V", "TYPE_CLUSTER_BUTTON", "", "TYPE_MUSICIAN_MUSIC", "TYPE_NORMAL_MUSIC", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/discover/adapter/SearchMusicAdapter$onCreateFooterViewHolder$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "textView", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41830a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f41831b;

        b(Ref.ObjectRef objectRef) {
            this.f41831b = objectRef;
        }

        public final void onClick(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f41830a, false, 35832, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f41830a, false, 35832, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "textView");
            f.a a2 = f.a((String) this.f41831b.element);
            a2.a("enter_from", "music_search_result");
            h.a().a(a2.a().toString());
            r.a("music_search_feedback_click", (Map) d.a().a("enter_from", "music_search_result").f34114b);
        }

        public final void updateDrawState(@NotNull TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f41830a, false, 35833, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f41830a, false, 35833, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(textPaint2, "ds");
            super.updateDrawState(textPaint);
            textPaint2.setUnderlineText(false);
        }
    }

    public final void a(@Nullable List<? extends SearchMusic> list) {
    }

    @NotNull
    public final com.bytedance.jedi.arch.ext.list.differ.b<SearchMusic> a() {
        return this.l;
    }

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, i, false, 35817, new Class[0], Integer.TYPE)) {
            return super.getItemCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, i, false, 35817, new Class[0], Integer.TYPE)).intValue();
    }

    public final void showLoadMoreEmpty() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 35826, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 35826, new Class[0], Void.TYPE);
            return;
        }
        super.showLoadMoreEmpty();
        r.a("music_search_feedback_show", (Map) d.a().a("enter_from", "music_search_result").f34114b);
    }

    public final int getBasicItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 35822, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 35822, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        z zVar = this.k;
        Object obj = this.mItems.get(i2);
        Intrinsics.checkExpressionValueIsNotNull(obj, "mItems[position]");
        if (zVar.a((SearchMusic) obj)) {
            return 17;
        }
        if (((SearchMusic) this.mItems.get(i2)).getCardType() == CardType.TYPE_MUSICIAN.getValue()) {
            return 18;
        }
        return 16;
    }

    public final void setData(@Nullable List<? extends SearchMusic> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, i, false, 35820, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, i, false, 35820, new Class[]{List.class}, Void.TYPE);
            return;
        }
        MusicPlayHelper musicPlayHelper = this.m;
        if (musicPlayHelper != null) {
            musicPlayHelper.a();
        }
        super.setData(this.k.a(list));
    }

    public final int a(@NotNull Music music) {
        if (PatchProxy.isSupport(new Object[]{music}, this, i, false, 35824, new Class[]{Music.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{music}, this, i, false, 35824, new Class[]{Music.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(music, "music");
        if (CollectionUtils.isEmpty(this.mItems)) {
            return -1;
        }
        if (this.g.f41972d >= 0) {
            return this.g.f41972d;
        }
        int i2 = -1;
        for (SearchMusic searchMusic : this.mItems) {
            if (music == searchMusic.getMusic()) {
                return i2 + 1;
            }
            if (searchMusic.getCardType() == CardType.TYPE_MUSICIAN.getValue() && !CollectionUtils.isEmpty(searchMusic.getMusicList())) {
                List musicList = searchMusic.getMusicList();
                if (musicList == null) {
                    Intrinsics.throwNpe();
                }
                if (music == ((Music) CollectionsKt.first(musicList))) {
                    return i2 + 1;
                }
            }
            z zVar = this.k;
            Intrinsics.checkExpressionValueIsNotNull(searchMusic, "searchMusic");
            if (!zVar.a(searchMusic)) {
                if (searchMusic.getCardType() == CardType.TYPE_MUSICIAN.getValue()) {
                    if (!CollectionUtils.isEmpty(searchMusic.getMusicList())) {
                        List musicList2 = searchMusic.getMusicList();
                        if (musicList2 == null) {
                            Intrinsics.throwNpe();
                        }
                        i2 += musicList2.size();
                    }
                    if (searchMusic.getHasMore()) {
                        i2++;
                    }
                } else {
                    i2++;
                }
            }
        }
        return -1;
    }

    public final void setDataAfterLoadMore(@Nullable List<? extends SearchMusic> list) {
        List<? extends SearchMusic> list2;
        boolean z;
        boolean z2;
        List<? extends SearchMusic> list3 = list;
        if (PatchProxy.isSupport(new Object[]{list3}, this, i, false, 35821, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3}, this, i, false, 35821, new Class[]{List.class}, Void.TYPE);
            return;
        }
        z zVar = this.k;
        List<? extends SearchMusic> list4 = this.mItems;
        if (PatchProxy.isSupport(new Object[]{list4, list3}, zVar, z.f42001a, false, 35835, new Class[]{List.class, List.class}, List.class)) {
            Object[] objArr = {list4, list3};
            Object[] objArr2 = objArr;
            z zVar2 = zVar;
            ChangeQuickRedirect changeQuickRedirect = z.f42001a;
            list2 = (List) PatchProxy.accessDispatch(objArr2, zVar2, changeQuickRedirect, false, 35835, new Class[]{List.class, List.class}, List.class);
        } else {
            Collection collection = list4;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Collection collection2 = list3;
                if (collection2 == null || collection2.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    int indexOf = list3.indexOf(CollectionsKt.last(zVar.f42002b));
                    if (indexOf < list.size() - 1) {
                        if (indexOf <= 0) {
                            zVar.b(list3);
                            list2 = list3;
                        } else {
                            list4 = zVar.a(list3.subList(indexOf + 1, list.size()));
                            list4.addAll(0, collection);
                            zVar.b(list3);
                        }
                    }
                    list2 = list4;
                }
            }
            if (list3 != null) {
                zVar.b(list3);
                list2 = list3;
            } else {
                list2 = null;
            }
        }
        super.setDataAfterLoadMore(list2);
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateFooterViewHolder(@NotNull ViewGroup viewGroup) {
        boolean z;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, i, false, 35825, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, i, false, 35825, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        RecyclerView.ViewHolder onCreateFooterViewHolder = super.onCreateFooterViewHolder(viewGroup);
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            Boolean bM = b2.bM();
            Intrinsics.checkExpressionValueIsNotNull(bM, "SettingsReader.get().showMusicFeedbackEntrance");
            z = bM.booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            try {
                com.ss.android.ugc.aweme.global.config.settings.pojo.a b3 = g.b();
                Intrinsics.checkExpressionValueIsNotNull(b3, "SettingsReader.get()");
                FeConfigCollection O = b3.O();
                Intrinsics.checkExpressionValueIsNotNull(O, "SettingsReader.get().feConfigCollection");
                FEConfig musicFaq = O.getMusicFaq();
                Intrinsics.checkExpressionValueIsNotNull(musicFaq, "SettingsReader.get().feConfigCollection.musicFaq");
                T schema = musicFaq.getSchema();
                Intrinsics.checkExpressionValueIsNotNull(schema, "SettingsReader.get().feC…ollection.musicFaq.schema");
                objectRef.element = schema;
            } catch (Exception unused2) {
            }
            SpannableString spannableString = new SpannableString(viewGroup.getContext().getString(C0906R.string.c2g));
            y.a(spannableString, new b(objectRef), 9, spannableString.length(), 33);
            y.a(spannableString, new ForegroundColorSpan(ContextCompat.getColor(viewGroup.getContext(), C0906R.color.zl)), 9, spannableString.length(), 33);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aqm, null);
            if (inflate != null) {
                TextView textView = (TextView) inflate;
                textView.setText(spannableString, TextView.BufferType.SPANNABLE);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setTextColor(ContextCompat.getColor(viewGroup.getContext(), C0906R.color.zx));
                textView.setPadding(0, 20, 0, 0);
                View view = onCreateFooterViewHolder.itemView;
                if (view != null) {
                    DmtStatusView dmtStatusView = (DmtStatusView) view;
                    dmtStatusView.setBuilder(dmtStatusView.a().b((View) textView));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
        }
        Intrinsics.checkExpressionValueIsNotNull(onCreateFooterViewHolder, "superFooterHolder");
        return onCreateFooterViewHolder;
    }

    public final void a(@NotNull d dVar) {
        List list;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, i, false, 35823, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, i, false, 35823, new Class[]{d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "cluster");
        List list2 = this.mItems;
        z zVar = this.k;
        if (PatchProxy.isSupport(new Object[]{dVar2}, zVar, z.f42001a, false, 35836, new Class[]{d.class}, List.class)) {
            z zVar2 = zVar;
            list = (List) PatchProxy.accessDispatch(new Object[]{dVar2}, zVar2, z.f42001a, false, 35836, new Class[]{d.class}, List.class);
        } else {
            Intrinsics.checkParameterIsNotNull(dVar2, "cluster");
            Iterable<Music> clusterList = dVar.getClusterList();
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(clusterList, 10));
            for (Music music : clusterList) {
                SearchMusic searchMusic = new SearchMusic();
                searchMusic.setMusic(music);
                arrayList.add(searchMusic);
            }
            list = CollectionsKt.toMutableList((Collection<? extends T>) (List) arrayList);
        }
        int indexOf = list2.indexOf(dVar2);
        list2.remove(dVar2);
        notifyItemRemoved(indexOf);
        list2.addAll(indexOf, list);
        notifyItemRangeInserted(indexOf, list.size());
    }

    @NotNull
    public final RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup, int i2) {
        SearchMusicClusterViewHolder searchMusicClusterViewHolder;
        SearchMusicianCard searchMusicianCard;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, i, false, 35818, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, i, false, 35818, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        switch (i2) {
            case 17:
                SearchMusicClusterViewHolder.a aVar = SearchMusicClusterViewHolder.f41834e;
                SearchMusicClusterViewHolder.b bVar = this;
                if (PatchProxy.isSupport(new Object[]{viewGroup2, bVar}, aVar, SearchMusicClusterViewHolder.a.f41841a, false, 35844, new Class[]{ViewGroup.class, SearchMusicClusterViewHolder.b.class}, SearchMusicClusterViewHolder.class)) {
                    Object[] objArr = {viewGroup2, bVar};
                    Object[] objArr2 = objArr;
                    SearchMusicClusterViewHolder.a aVar2 = aVar;
                    ChangeQuickRedirect changeQuickRedirect = SearchMusicClusterViewHolder.a.f41841a;
                    searchMusicClusterViewHolder = (SearchMusicClusterViewHolder) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect, false, 35844, new Class[]{ViewGroup.class, SearchMusicClusterViewHolder.b.class}, SearchMusicClusterViewHolder.class);
                } else {
                    Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
                    Intrinsics.checkParameterIsNotNull(bVar, "listener");
                    View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0b, viewGroup2, false);
                    Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
                    searchMusicClusterViewHolder = new SearchMusicClusterViewHolder(inflate, bVar);
                }
                return searchMusicClusterViewHolder;
            case 18:
                SearchMusicianCard.a aVar3 = SearchMusicianCard.f41851d;
                p pVar = this;
                if (PatchProxy.isSupport(new Object[]{viewGroup2, pVar}, aVar3, SearchMusicianCard.a.f41858a, false, 35862, new Class[]{ViewGroup.class, p.class}, SearchMusicianCard.class)) {
                    SearchMusicianCard.a aVar4 = aVar3;
                    searchMusicianCard = (SearchMusicianCard) PatchProxy.accessDispatch(new Object[]{viewGroup2, pVar}, aVar4, SearchMusicianCard.a.f41858a, false, 35862, new Class[]{ViewGroup.class, p.class}, SearchMusicianCard.class);
                } else {
                    Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
                    Intrinsics.checkParameterIsNotNull(pVar, "provider");
                    View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a8b, viewGroup2, false);
                    Intrinsics.checkExpressionValueIsNotNull(inflate2, "view");
                    searchMusicianCard = new SearchMusicianCard(inflate2, pVar);
                }
                return searchMusicianCard;
            default:
                SearchMusicViewHolder.a aVar5 = SearchMusicViewHolder.j;
                String str = this.h;
                Intrinsics.checkExpressionValueIsNotNull(str, "mKeyword");
                SearchMusicViewHolder a2 = aVar5.a(viewGroup2, str, null, this);
                a2.a("search_result");
                a2.a(this.g);
                return a2;
        }
    }

    public final void onBindBasicViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, i, false, 35819, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, i, false, 35819, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        if (viewHolder2 instanceof SearchMusicViewHolder) {
            Music music = ((SearchMusic) this.mItems.get(i3)).getMusic();
            String str = this.h;
            Intrinsics.checkExpressionValueIsNotNull(str, "mKeyword");
            ((SearchMusicViewHolder) viewHolder2).a(music, str);
            return;
        }
        if (viewHolder2 instanceof SearchMusicClusterViewHolder) {
            SearchMusicClusterViewHolder searchMusicClusterViewHolder = (SearchMusicClusterViewHolder) viewHolder2;
            SearchMusic searchMusic = (SearchMusic) this.mItems.get(i3);
            String str2 = this.h;
            Intrinsics.checkExpressionValueIsNotNull(str2, "mKeyword");
            if (PatchProxy.isSupport(new Object[]{searchMusic, str2}, searchMusicClusterViewHolder, SearchMusicClusterViewHolder.f41833a, false, 35839, new Class[]{SearchMusic.class, String.class}, Void.TYPE)) {
                SearchMusicClusterViewHolder searchMusicClusterViewHolder2 = searchMusicClusterViewHolder;
                PatchProxy.accessDispatch(new Object[]{searchMusic, str2}, searchMusicClusterViewHolder2, SearchMusicClusterViewHolder.f41833a, false, 35839, new Class[]{SearchMusic.class, String.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(str2, "keyword");
                if (searchMusic instanceof d) {
                    d dVar = (d) searchMusic;
                    int size = dVar.getClusterList().size();
                    View view = searchMusicClusterViewHolder.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    Context context = view.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
                    String string = context.getResources().getString(C0906R.string.c2d);
                    DmtTextView dmtTextView = searchMusicClusterViewHolder.f41835b;
                    Intrinsics.checkExpressionValueIsNotNull(string, "format");
                    String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                    Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                    dmtTextView.setText(format);
                    searchMusicClusterViewHolder.f41836c = dVar;
                    searchMusicClusterViewHolder.f41837d = str2;
                    if (!dVar.isMobShowSent()) {
                        searchMusicClusterViewHolder.a("matched_sounds_show", dVar);
                        dVar.setMobShowSent(true);
                    }
                }
            }
        } else if (viewHolder2 instanceof SearchMusicianCard) {
            String str3 = this.h;
            Intrinsics.checkExpressionValueIsNotNull(str3, "mKeyword");
            ((SearchMusicianCard) viewHolder2).a((SearchMusic) this.mItems.get(i3), str3);
        } else {
            super.onBindBasicViewHolder(viewHolder, i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchMusicAdapter(@Nullable MusicPlayHelper musicPlayHelper, @NotNull s sVar, @NotNull String str) {
        super(sVar, str);
        Intrinsics.checkParameterIsNotNull(sVar, "mobParam");
        Intrinsics.checkParameterIsNotNull(str, "mKeyword");
        this.m = musicPlayHelper;
    }
}
