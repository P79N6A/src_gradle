package com.ss.android.ugc.aweme.discover.alading;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/alading/SearchMusicCardViewHolder;", "Lcom/ss/android/ugc/aweme/discover/alading/SearchAbsAladingCard;", "Lcom/ss/android/ugc/aweme/music/model/Music;", "itemView", "Landroid/view/View;", "cardlist", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/discover/model/SearchUser;)V", "getCardlist", "()Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "setCardlist", "(Lcom/ss/android/ugc/aweme/discover/model/SearchUser;)V", "onScrollToEnd", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMusicCardViewHolder extends SearchAbsAladingCard<Music> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f42065b;

    /* renamed from: d  reason: collision with root package name */
    public static final a f42066d = new a((byte) 0);
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public SearchUser f42067c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/alading/SearchMusicCardViewHolder$Companion;", "", "()V", "createViewHolder", "Lcom/ss/android/ugc/aweme/discover/alading/SearchMusicCardViewHolder;", "viewGroup", "Landroid/view/ViewGroup;", "cardlist", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42068a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f42065b, false, 36034, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42065b, false, 36034, new Class[0], Void.TYPE);
            return;
        }
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        UserProfileActivity.a(view.getContext(), this.f42067c.user, "general_search", "", "main_head");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchMusicCardViewHolder(@org.jetbrains.annotations.NotNull android.view.View r5, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.discover.model.SearchUser r6) {
        /*
            r4 = this;
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.lang.String r0 = "cardlist"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            java.util.List<com.ss.android.ugc.aweme.music.model.Music> r0 = r6.musicCards
            java.lang.String r1 = "cardlist.musicCards"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r4.<init>(r5, r0)
            r4.f42067c = r6
            android.support.v7.widget.RecyclerView r6 = r4.f3030a
            com.ss.android.ugc.aweme.discover.alading.MusicCardListAdapter r0 = new com.ss.android.ugc.aweme.discover.alading.MusicCardListAdapter
            com.ss.android.ugc.aweme.discover.model.SearchUser r1 = r4.f42067c
            android.content.Context r2 = r5.getContext()
            java.lang.String r3 = "itemView.context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r0.<init>(r1, r2)
            android.support.v7.widget.RecyclerView$Adapter r0 = (android.support.v7.widget.RecyclerView.Adapter) r0
            r6.setAdapter(r0)
            com.ss.android.ugc.aweme.discover.model.SearchUser r6 = r4.f42067c
            java.util.List<com.ss.android.ugc.aweme.music.model.Music> r6 = r6.musicCards
            int r6 = r6.size()
            r0 = 16
            r1 = 2131170294(0x7f0713f6, float:1.7954942E38)
            r2 = 0
            r3 = 10
            if (r6 != r3) goto L_0x004b
            android.view.View r5 = r5.findViewById(r1)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 110(0x6e, float:1.54E-43)
            r5.setPadding(r0, r6, r2, r2)
            return
        L_0x004b:
            android.view.View r5 = r5.findViewById(r1)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 120(0x78, float:1.68E-43)
            r5.setPadding(r0, r6, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.alading.SearchMusicCardViewHolder.<init>(android.view.View, com.ss.android.ugc.aweme.discover.model.SearchUser):void");
    }

    @JvmStatic
    @NotNull
    public static final SearchMusicCardViewHolder a(@NotNull ViewGroup viewGroup, @NotNull SearchUser searchUser) {
        Object accessDispatch;
        ViewGroup viewGroup2 = viewGroup;
        SearchUser searchUser2 = searchUser;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, searchUser2}, null, f42065b, true, 36036, new Class[]{ViewGroup.class, SearchUser.class}, SearchMusicCardViewHolder.class)) {
            accessDispatch = PatchProxy.accessDispatch(new Object[]{viewGroup2, searchUser2}, null, f42065b, true, 36036, new Class[]{ViewGroup.class, SearchUser.class}, SearchMusicCardViewHolder.class);
        } else {
            a aVar = f42066d;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, searchUser2}, aVar, a.f42068a, false, 36037, new Class[]{ViewGroup.class, SearchUser.class}, SearchMusicCardViewHolder.class)) {
                Object[] objArr = {viewGroup2, searchUser2};
                Object[] objArr2 = objArr;
                a aVar2 = aVar;
                ChangeQuickRedirect changeQuickRedirect = a.f42068a;
                accessDispatch = PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect, false, 36037, new Class[]{ViewGroup.class, SearchUser.class}, SearchMusicCardViewHolder.class);
            } else {
                Intrinsics.checkParameterIsNotNull(viewGroup2, "viewGroup");
                Intrinsics.checkParameterIsNotNull(searchUser2, "cardlist");
                return new SearchMusicCardViewHolder(viewGroup2, searchUser2);
            }
        }
        return (SearchMusicCardViewHolder) accessDispatch;
    }
}
