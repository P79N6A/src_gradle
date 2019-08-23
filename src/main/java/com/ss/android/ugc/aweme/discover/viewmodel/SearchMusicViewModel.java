package com.ss.android.ugc.aweme.discover.viewmodel;

import android.text.TextUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchMusicViewModel_MiddlewareBinding;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.e;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.f;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.discover.model.SearchMusicList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0002H\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011R#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchMusicViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchMusicListState;", "()V", "listMiddleware", "Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchPayLoad;", "getListMiddleware", "()Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "defaultState", "onStart", "", "searchMusic", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusicList;", "param", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchRequestParam;", "searchId", "", "cursor", "", "setRequestId", "data", "updateState", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMusicViewModel extends JediViewModel<SearchMusicListState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f43250d;

    /* renamed from: f  reason: collision with root package name */
    public static final a f43251f = new a((byte) 0);
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final ListMiddleware<SearchMusicListState, SearchMusic, e> f43252e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchMusicViewModel$Companion;", "", "()V", "LOAD_MORE_COUNT", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchPayLoad;", "kotlin.jvm.PlatformType", "state", "Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchMusicListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<SearchMusicListState, Observable<Pair<? extends List<? extends SearchMusic>, ? extends e>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchMusicViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SearchMusicViewModel searchMusicViewModel) {
            super(1);
            this.this$0 = searchMusicViewModel;
        }

        public final Observable<Pair<List<SearchMusic>, e>> invoke(@NotNull SearchMusicListState searchMusicListState) {
            if (PatchProxy.isSupport(new Object[]{searchMusicListState}, this, changeQuickRedirect, false, 38194, new Class[]{SearchMusicListState.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{searchMusicListState}, this, changeQuickRedirect, false, 38194, new Class[]{SearchMusicListState.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(searchMusicListState, "state");
            Observable<Pair<List<SearchMusic>, e>> map = this.this$0.a(searchMusicListState.getSearchParam(), ((e) searchMusicListState.getListState().getPayload()).f42532c, 0).map(new Function<T, R>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43253a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f43254b;

                {
                    this.f43254b = r1;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:7:0x0055, code lost:
                    if (r4 == null) goto L_0x0057;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ java.lang.Object apply(java.lang.Object r18) {
                    /*
                        r17 = this;
                        r0 = r18
                        com.ss.android.ugc.aweme.discover.model.SearchMusicList r0 = (com.ss.android.ugc.aweme.discover.model.SearchMusicList) r0
                        r1 = 1
                        java.lang.Object[] r2 = new java.lang.Object[r1]
                        r9 = 0
                        r2[r9] = r0
                        com.meituan.robust.ChangeQuickRedirect r4 = f43253a
                        java.lang.Class[] r7 = new java.lang.Class[r1]
                        java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchMusicList> r3 = com.ss.android.ugc.aweme.discover.model.SearchMusicList.class
                        r7[r9] = r3
                        java.lang.Class<kotlin.Pair> r8 = kotlin.Pair.class
                        r5 = 0
                        r6 = 38195(0x9533, float:5.3523E-41)
                        r3 = r17
                        boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                        if (r2 == 0) goto L_0x003b
                        java.lang.Object[] r10 = new java.lang.Object[r1]
                        r10[r9] = r0
                        com.meituan.robust.ChangeQuickRedirect r12 = f43253a
                        r13 = 0
                        r14 = 38195(0x9533, float:5.3523E-41)
                        java.lang.Class[] r15 = new java.lang.Class[r1]
                        java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchMusicList> r0 = com.ss.android.ugc.aweme.discover.model.SearchMusicList.class
                        r15[r9] = r0
                        java.lang.Class<kotlin.Pair> r16 = kotlin.Pair.class
                        r11 = r17
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                        kotlin.Pair r0 = (kotlin.Pair) r0
                        return r0
                    L_0x003b:
                        java.lang.String r1 = "data"
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
                        r1 = r17
                        com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$b r2 = r1.f43254b
                        com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel r2 = r2.this$0
                        r2.a((com.ss.android.ugc.aweme.discover.model.SearchMusicList) r0)
                        java.util.List<com.ss.android.ugc.aweme.discover.model.SearchMusic> r2 = r0.searchMusicList
                        com.ss.android.ugc.aweme.discover.jedi.viewmodel.e r3 = new com.ss.android.ugc.aweme.discover.jedi.viewmodel.e
                        com.ss.android.ugc.aweme.feed.model.LogPbBean r4 = r0.logPb
                        if (r4 == 0) goto L_0x0057
                        java.lang.String r4 = r4.getImprId()
                        if (r4 != 0) goto L_0x0059
                    L_0x0057:
                        java.lang.String r4 = ""
                    L_0x0059:
                        boolean r5 = r0.hasMore
                        int r6 = r0.cursor
                        com.ss.android.ugc.aweme.discover.model.SearchApiResult r0 = (com.ss.android.ugc.aweme.discover.model.SearchApiResult) r0
                        r3.<init>(r4, r5, r6, r0)
                        kotlin.Pair r0 = kotlin.TuplesKt.to(r2, r3)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel.b.AnonymousClass1.apply(java.lang.Object):java.lang.Object");
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(map, "searchMusic(state.search…                        }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchPayLoad;", "kotlin.jvm.PlatformType", "state", "Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchMusicListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<SearchMusicListState, Observable<Pair<? extends List<? extends SearchMusic>, ? extends e>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchMusicViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SearchMusicViewModel searchMusicViewModel) {
            super(1);
            this.this$0 = searchMusicViewModel;
        }

        public final Observable<Pair<List<SearchMusic>, e>> invoke(@NotNull SearchMusicListState searchMusicListState) {
            if (PatchProxy.isSupport(new Object[]{searchMusicListState}, this, changeQuickRedirect, false, 38196, new Class[]{SearchMusicListState.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{searchMusicListState}, this, changeQuickRedirect, false, 38196, new Class[]{SearchMusicListState.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(searchMusicListState, "state");
            Observable<Pair<List<SearchMusic>, e>> map = this.this$0.a(searchMusicListState.getSearchParam(), ((e) searchMusicListState.getListState().getPayload()).f42532c, ((e) searchMusicListState.getListState().getPayload()).f21388b).map(new Function<T, R>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43255a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f43256b;

                {
                    this.f43256b = r1;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:7:0x0055, code lost:
                    if (r4 == null) goto L_0x0057;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ java.lang.Object apply(java.lang.Object r18) {
                    /*
                        r17 = this;
                        r0 = r18
                        com.ss.android.ugc.aweme.discover.model.SearchMusicList r0 = (com.ss.android.ugc.aweme.discover.model.SearchMusicList) r0
                        r1 = 1
                        java.lang.Object[] r2 = new java.lang.Object[r1]
                        r9 = 0
                        r2[r9] = r0
                        com.meituan.robust.ChangeQuickRedirect r4 = f43255a
                        java.lang.Class[] r7 = new java.lang.Class[r1]
                        java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchMusicList> r3 = com.ss.android.ugc.aweme.discover.model.SearchMusicList.class
                        r7[r9] = r3
                        java.lang.Class<kotlin.Pair> r8 = kotlin.Pair.class
                        r5 = 0
                        r6 = 38197(0x9535, float:5.3525E-41)
                        r3 = r17
                        boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                        if (r2 == 0) goto L_0x003b
                        java.lang.Object[] r10 = new java.lang.Object[r1]
                        r10[r9] = r0
                        com.meituan.robust.ChangeQuickRedirect r12 = f43255a
                        r13 = 0
                        r14 = 38197(0x9535, float:5.3525E-41)
                        java.lang.Class[] r15 = new java.lang.Class[r1]
                        java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchMusicList> r0 = com.ss.android.ugc.aweme.discover.model.SearchMusicList.class
                        r15[r9] = r0
                        java.lang.Class<kotlin.Pair> r16 = kotlin.Pair.class
                        r11 = r17
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                        kotlin.Pair r0 = (kotlin.Pair) r0
                        return r0
                    L_0x003b:
                        java.lang.String r1 = "data"
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
                        r1 = r17
                        com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$c r2 = r1.f43256b
                        com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel r2 = r2.this$0
                        r2.a((com.ss.android.ugc.aweme.discover.model.SearchMusicList) r0)
                        java.util.List<com.ss.android.ugc.aweme.discover.model.SearchMusic> r2 = r0.searchMusicList
                        com.ss.android.ugc.aweme.discover.jedi.viewmodel.e r3 = new com.ss.android.ugc.aweme.discover.jedi.viewmodel.e
                        com.ss.android.ugc.aweme.feed.model.LogPbBean r4 = r0.logPb
                        if (r4 == 0) goto L_0x0057
                        java.lang.String r4 = r4.getImprId()
                        if (r4 != 0) goto L_0x0059
                    L_0x0057:
                        java.lang.String r4 = ""
                    L_0x0059:
                        boolean r5 = r0.hasMore
                        int r6 = r0.cursor
                        com.ss.android.ugc.aweme.discover.model.SearchApiResult r0 = (com.ss.android.ugc.aweme.discover.model.SearchApiResult) r0
                        r3.<init>(r4, r5, r6, r0)
                        kotlin.Pair r0 = kotlin.TuplesKt.to(r2, r3)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel.c.AnonymousClass1.apply(java.lang.Object):java.lang.Object");
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(map, "searchMusic(state.search…                        }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchMusicListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<SearchMusicListState, SearchMusicListState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ f $param;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(1);
            this.$param = fVar;
        }

        @NotNull
        public final SearchMusicListState invoke(@NotNull SearchMusicListState searchMusicListState) {
            SearchMusicListState searchMusicListState2 = searchMusicListState;
            if (PatchProxy.isSupport(new Object[]{searchMusicListState2}, this, changeQuickRedirect, false, 38198, new Class[]{SearchMusicListState.class}, SearchMusicListState.class)) {
                return (SearchMusicListState) PatchProxy.accessDispatch(new Object[]{searchMusicListState2}, this, changeQuickRedirect, false, 38198, new Class[]{SearchMusicListState.class}, SearchMusicListState.class);
            }
            Intrinsics.checkParameterIsNotNull(searchMusicListState2, "$receiver");
            return SearchMusicListState.copy$default(searchMusicListState2, null, this.$param, 1, null);
        }
    }

    public SearchMusicViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new b(this), new c(this), null, null, 12);
        this.f43252e = listMiddleware;
    }

    public final /* synthetic */ x c() {
        SearchMusicListState searchMusicListState;
        if (PatchProxy.isSupport(new Object[0], this, f43250d, false, 38189, new Class[0], SearchMusicListState.class)) {
            searchMusicListState = (SearchMusicListState) PatchProxy.accessDispatch(new Object[0], this, f43250d, false, 38189, new Class[0], SearchMusicListState.class);
        } else {
            searchMusicListState = new SearchMusicListState(null, null, 3, null);
        }
        return searchMusicListState;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f43250d, false, 38190, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43250d, false, 38190, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        new SearchMusicViewModel_MiddlewareBinding().binding(this);
    }

    public final void a(@NotNull f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f43250d, false, 38193, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f43250d, false, 38193, new Class[]{f.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fVar2, "param");
        c(new d(fVar2));
    }

    public final void a(SearchMusicList searchMusicList) {
        String str;
        SearchMusicList searchMusicList2 = searchMusicList;
        if (PatchProxy.isSupport(new Object[]{searchMusicList2}, this, f43250d, false, 38192, new Class[]{SearchMusicList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchMusicList2}, this, f43250d, false, 38192, new Class[]{SearchMusicList.class}, Void.TYPE);
            return;
        }
        if (searchMusicList2 != null) {
            List<SearchMusic> list = searchMusicList2.searchMusicList;
            if (list != null) {
                for (SearchMusic searchMusic : list) {
                    if (!TextUtils.isEmpty(searchMusicList.getRequestId())) {
                        str = searchMusicList.getRequestId();
                    } else {
                        LogPbBean logPbBean = searchMusicList2.logPb;
                        if (logPbBean != null) {
                            str = logPbBean.getImprId();
                            if (str != null) {
                            }
                        }
                        str = "";
                    }
                    searchMusic.setRequestId(str);
                }
            }
        }
    }

    public final Observable<SearchMusicList> a(f fVar, String str, int i) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2, str, Integer.valueOf(i)}, this, f43250d, false, 38191, new Class[]{f.class, String.class, Integer.TYPE}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{fVar2, str, Integer.valueOf(i)}, this, f43250d, false, 38191, new Class[]{f.class, String.class, Integer.TYPE}, Observable.class);
        }
        Observable<SearchMusicList> subscribeOn = SearchApiNew.f42085c.a(fVar2.f42535b, (long) i, 20, fVar2.f42536c, fVar2.f42538e, str, fVar2.f42539f, SearchApiNew.f42084b).subscribeOn(Schedulers.io());
        Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "SearchApiNew.searchMusic…scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
