package com.ss.android.ugc.aweme.discover.hotspot.viewmodel;

import android.text.TextUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.aa;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.discover.model.HotSearchEntity;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u0002H\u0014JB\u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001c0\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0012J\b\u0010&\u001a\u00020\u0012H\u0014J\u000e\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u001fJ&\u0010,\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010/\u001a\u00020\u001fR#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainState;", "()V", "listMiddleware", "Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/SpotAwemesPayLoad;", "getListMiddleware", "()Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "param", "Lcom/ss/android/ugc/aweme/feed/param/FeedParam;", "getParam", "()Lcom/ss/android/ugc/aweme/feed/param/FeedParam;", "setParam", "(Lcom/ss/android/ugc/aweme/feed/param/FeedParam;)V", "refresh", "Lkotlin/Function0;", "", "getRefresh", "()Lkotlin/jvm/functions/Function0;", "setRefresh", "(Lkotlin/jvm/functions/Function0;)V", "repo", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/HotSpotRepo;", "defaultState", "doRequest", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "isRefresh", "", "state", "curSpot", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "curSpotWord", "", "getAllSpots", "onStart", "saveIndex", "index", "", "setDialogShowing", "showing", "switch", "hotword", "hotSearchItem", "forceRefresh", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HotSpotMainViewModel extends JediViewModel<HotSpotMainState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f42486d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.hotspot.a.b f42487e = new com.ss.android.ugc.aweme.discover.hotspot.a.b();
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.feed.param.b f42488f = new com.ss.android.ugc.aweme.feed.param.b();
    @NotNull
    public final ListMiddleware<HotSpotMainState, Aweme, com.ss.android.ugc.aweme.discover.hotspot.a.f> g;
    @NotNull
    public Function0<Unit> h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/SpotAwemesPayLoad;", "it", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/HotSpotAwemes;", "apply"}, k = 3, mv = {1, 1, 15})
    static final class a<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42489a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f42490b;

        a(String str) {
            this.f42490b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.discover.hotspot.a.a aVar = (com.ss.android.ugc.aweme.discover.hotspot.a.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f42489a, false, 36642, new Class[]{com.ss.android.ugc.aweme.discover.hotspot.a.a.class}, Pair.class)) {
                return (Pair) PatchProxy.accessDispatch(new Object[]{aVar}, this, f42489a, false, 36642, new Class[]{com.ss.android.ugc.aweme.discover.hotspot.a.a.class}, Pair.class);
            }
            Intrinsics.checkParameterIsNotNull(aVar, AdvanceSetting.NETWORK_TYPE);
            List<? extends Aweme> list = aVar.f42425a;
            com.ss.android.ugc.aweme.discover.hotspot.a.f fVar = new com.ss.android.ugc.aweme.discover.hotspot.a.f(null, aVar.f42426b, aVar.f42427c, this.f42490b, 0, 17);
            return TuplesKt.to(list, fVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function1<HotSpotMainState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ HotSpotMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(HotSpotMainViewModel hotSpotMainViewModel) {
            super(1);
            this.this$0 = hotSpotMainViewModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HotSpotMainState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull HotSpotMainState hotSpotMainState) {
            Single single;
            HotSpotMainState hotSpotMainState2 = hotSpotMainState;
            if (PatchProxy.isSupport(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36643, new Class[]{HotSpotMainState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36643, new Class[]{HotSpotMainState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(hotSpotMainState2, AdvanceSetting.NETWORK_TYPE);
            if (!(hotSpotMainState.getHotSpotsList() instanceof aa)) {
                HotSpotMainViewModel hotSpotMainViewModel = this.this$0;
                com.ss.android.ugc.aweme.discover.hotspot.a.b bVar = this.this$0.f42487e;
                if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.discover.hotspot.a.b.f42428a, false, 36570, new Class[0], Single.class)) {
                    single = (Single) PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.discover.hotspot.a.b.f42428a, false, 36570, new Class[0], Single.class);
                } else {
                    single = bVar.a(bVar.f42429b.a(""));
                }
                hotSpotMainViewModel.a(single, AnonymousClass1.INSTANCE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/SpotAwemesPayLoad;", "state", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<HotSpotMainState, Observable<Pair<? extends List<? extends Aweme>, ? extends com.ss.android.ugc.aweme.discover.hotspot.a.f>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ HotSpotMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(HotSpotMainViewModel hotSpotMainViewModel) {
            super(1);
            this.this$0 = hotSpotMainViewModel;
        }

        @NotNull
        public final Observable<Pair<List<Aweme>, com.ss.android.ugc.aweme.discover.hotspot.a.f>> invoke(@NotNull HotSpotMainState hotSpotMainState) {
            HotSpotMainState hotSpotMainState2 = hotSpotMainState;
            if (PatchProxy.isSupport(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36645, new Class[]{HotSpotMainState.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36645, new Class[]{HotSpotMainState.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(hotSpotMainState2, "state");
            HotSpotMainViewModel hotSpotMainViewModel = this.this$0;
            HotSearchItem curSpot = hotSpotMainState.getCurSpot();
            String curSpotWord = hotSpotMainState.getCurSpotWord();
            if (curSpotWord == null) {
                Intrinsics.throwNpe();
            }
            return hotSpotMainViewModel.a(false, hotSpotMainState2, curSpot, curSpotWord);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/SpotAwemesPayLoad;", "state", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<HotSpotMainState, Observable<Pair<? extends List<? extends Aweme>, ? extends com.ss.android.ugc.aweme.discover.hotspot.a.f>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ HotSpotMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(HotSpotMainViewModel hotSpotMainViewModel) {
            super(1);
            this.this$0 = hotSpotMainViewModel;
        }

        @NotNull
        public final Observable<Pair<List<Aweme>, com.ss.android.ugc.aweme.discover.hotspot.a.f>> invoke(@NotNull HotSpotMainState hotSpotMainState) {
            HotSpotMainState hotSpotMainState2 = hotSpotMainState;
            if (PatchProxy.isSupport(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36646, new Class[]{HotSpotMainState.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36646, new Class[]{HotSpotMainState.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(hotSpotMainState2, "state");
            HotSpotMainViewModel hotSpotMainViewModel = this.this$0;
            HotSearchItem curSpot = hotSpotMainState.getCurSpot();
            String curSpotWord = hotSpotMainState.getCurSpotWord();
            if (curSpotWord == null) {
                Intrinsics.throwNpe();
            }
            return hotSpotMainViewModel.a(true, hotSpotMainState2, curSpot, curSpotWord);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<HotSearchListResponse, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ HotSpotMainViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(HotSpotMainViewModel hotSpotMainViewModel) {
            super(1);
            this.this$0 = hotSpotMainViewModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HotSearchListResponse) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull final HotSearchListResponse hotSearchListResponse) {
            if (PatchProxy.isSupport(new Object[]{hotSearchListResponse}, this, changeQuickRedirect, false, 36649, new Class[]{HotSearchListResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hotSearchListResponse}, this, changeQuickRedirect, false, 36649, new Class[]{HotSearchListResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(hotSearchListResponse, "response");
            this.this$0.b(new Function1<HotSpotMainState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ e this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((HotSpotMainState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull HotSpotMainState hotSpotMainState) {
                    Object obj;
                    if (PatchProxy.isSupport(new Object[]{hotSpotMainState}, this, changeQuickRedirect, false, 36650, new Class[]{HotSpotMainState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{hotSpotMainState}, this, changeQuickRedirect, false, 36650, new Class[]{HotSpotMainState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(hotSpotMainState, "spotMainState");
                    HotSearchEntity data = hotSearchListResponse.getData();
                    Intrinsics.checkExpressionValueIsNotNull(data, "response.data");
                    List list = data.getList();
                    Intrinsics.checkExpressionValueIsNotNull(list, "response.data.list");
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (TextUtils.equals(((HotSearchItem) obj).getWord(), hotSpotMainState.getCurSpotWord())) {
                            break;
                        }
                    }
                    final HotSearchItem hotSearchItem = (HotSearchItem) obj;
                    if (hotSpotMainState.getCurSpot() == null) {
                        this.this$0.this$0.c(new Function1<HotSpotMainState, HotSpotMainState>() {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @NotNull
                            public final HotSpotMainState invoke(@NotNull HotSpotMainState hotSpotMainState) {
                                HotSpotMainState hotSpotMainState2 = hotSpotMainState;
                                if (PatchProxy.isSupport(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36651, new Class[]{HotSpotMainState.class}, HotSpotMainState.class)) {
                                    return (HotSpotMainState) PatchProxy.accessDispatch(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36651, new Class[]{HotSpotMainState.class}, HotSpotMainState.class);
                                }
                                Intrinsics.checkParameterIsNotNull(hotSpotMainState2, "$receiver");
                                return HotSpotMainState.copy$default(hotSpotMainState, hotSearchItem, null, null, null, null, false, null, null, 254, null);
                            }
                        });
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<Unit> {
        public static final f INSTANCE = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class g extends Lambda implements Function1<HotSpotMainState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ int $index;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(int i) {
            super(1);
            this.$index = i;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HotSpotMainState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull HotSpotMainState hotSpotMainState) {
            HotSpotMainState hotSpotMainState2 = hotSpotMainState;
            if (PatchProxy.isSupport(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36652, new Class[]{HotSpotMainState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36652, new Class[]{HotSpotMainState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(hotSpotMainState2, AdvanceSetting.NETWORK_TYPE);
            HashMap lastIndexMap = hotSpotMainState.getLastIndexMap();
            String curSpotWord = hotSpotMainState.getCurSpotWord();
            if (curSpotWord == null) {
                curSpotWord = "known";
            }
            lastIndexMap.put(curSpotWord, Integer.valueOf(this.$index));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function1<HotSpotMainState, HotSpotMainState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $showing;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(boolean z) {
            super(1);
            this.$showing = z;
        }

        @NotNull
        public final HotSpotMainState invoke(@NotNull HotSpotMainState hotSpotMainState) {
            HotSpotMainState hotSpotMainState2 = hotSpotMainState;
            if (PatchProxy.isSupport(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36653, new Class[]{HotSpotMainState.class}, HotSpotMainState.class)) {
                return (HotSpotMainState) PatchProxy.accessDispatch(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36653, new Class[]{HotSpotMainState.class}, HotSpotMainState.class);
            }
            Intrinsics.checkParameterIsNotNull(hotSpotMainState2, "$receiver");
            return HotSpotMainState.copy$default(hotSpotMainState, null, null, null, null, null, this.$showing, null, null, 223, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainState;", "it", "Lcom/bytedance/jedi/arch/Async;", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function2<HotSpotMainState, com.bytedance.jedi.arch.a<? extends HotSearchListResponse>, HotSpotMainState> {
        public static final i INSTANCE = new i();
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
            super(2);
        }

        @NotNull
        public final HotSpotMainState invoke(@NotNull HotSpotMainState hotSpotMainState, @NotNull com.bytedance.jedi.arch.a<? extends HotSearchListResponse> aVar) {
            HotSpotMainState hotSpotMainState2 = hotSpotMainState;
            com.bytedance.jedi.arch.a<? extends HotSearchListResponse> aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{hotSpotMainState2, aVar2}, this, changeQuickRedirect, false, 36654, new Class[]{HotSpotMainState.class, com.bytedance.jedi.arch.a.class}, HotSpotMainState.class)) {
                return (HotSpotMainState) PatchProxy.accessDispatch(new Object[]{hotSpotMainState2, aVar2}, this, changeQuickRedirect, false, 36654, new Class[]{HotSpotMainState.class, com.bytedance.jedi.arch.a.class}, HotSpotMainState.class);
            }
            Intrinsics.checkParameterIsNotNull(hotSpotMainState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(aVar2, AdvanceSetting.NETWORK_TYPE);
            return HotSpotMainState.copy$default(hotSpotMainState, null, null, aVar, null, null, false, null, null, 251, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function1<HotSpotMainState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $forceRefresh;
        final /* synthetic */ HotSearchItem $hotSearchItem;
        final /* synthetic */ String $hotword;
        final /* synthetic */ HotSpotMainViewModel this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainState;", "invoke", "com/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainViewModel$switch$2$1$1"}, k = 3, mv = {1, 1, 15})
        static final class a extends Lambda implements Function1<HotSpotMainState, HotSpotMainState> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ ListState $listState;
            final /* synthetic */ j this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(ListState listState, j jVar) {
                super(1);
                this.$listState = listState;
                this.this$0 = jVar;
            }

            @NotNull
            public final HotSpotMainState invoke(@NotNull HotSpotMainState hotSpotMainState) {
                HotSpotMainState hotSpotMainState2 = hotSpotMainState;
                if (PatchProxy.isSupport(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36656, new Class[]{HotSpotMainState.class}, HotSpotMainState.class)) {
                    return (HotSpotMainState) PatchProxy.accessDispatch(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36656, new Class[]{HotSpotMainState.class}, HotSpotMainState.class);
                }
                Intrinsics.checkParameterIsNotNull(hotSpotMainState2, "$receiver");
                ListState listState = this.$listState;
                Intrinsics.checkExpressionValueIsNotNull(listState, "listState");
                return HotSpotMainState.copy$default(hotSpotMainState, null, this.this$0.$hotword, null, null, null, false, listState, null, 189, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainState;", "invoke", "com/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainViewModel$switch$2$1$2"}, k = 3, mv = {1, 1, 15})
        static final class b extends Lambda implements Function1<HotSpotMainState, HotSpotMainState> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ ListState $listState;
            final /* synthetic */ j this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(ListState listState, j jVar) {
                super(1);
                this.$listState = listState;
                this.this$0 = jVar;
            }

            @NotNull
            public final HotSpotMainState invoke(@NotNull HotSpotMainState hotSpotMainState) {
                HotSpotMainState hotSpotMainState2 = hotSpotMainState;
                if (PatchProxy.isSupport(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36657, new Class[]{HotSpotMainState.class}, HotSpotMainState.class)) {
                    return (HotSpotMainState) PatchProxy.accessDispatch(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36657, new Class[]{HotSpotMainState.class}, HotSpotMainState.class);
                }
                Intrinsics.checkParameterIsNotNull(hotSpotMainState2, "$receiver");
                ListState listState = this.$listState;
                Intrinsics.checkExpressionValueIsNotNull(listState, "listState");
                return HotSpotMainState.copy$default(hotSpotMainState, this.this$0.$hotSearchItem, this.this$0.$hotword, null, null, null, false, listState, null, 188, null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(HotSpotMainViewModel hotSpotMainViewModel, boolean z, String str, HotSearchItem hotSearchItem) {
            super(1);
            this.this$0 = hotSpotMainViewModel;
            this.$forceRefresh = z;
            this.$hotword = str;
            this.$hotSearchItem = hotSearchItem;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HotSpotMainState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull HotSpotMainState hotSpotMainState) {
            if (PatchProxy.isSupport(new Object[]{hotSpotMainState}, this, changeQuickRedirect, false, 36655, new Class[]{HotSpotMainState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hotSpotMainState}, this, changeQuickRedirect, false, 36655, new Class[]{HotSpotMainState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(hotSpotMainState, AdvanceSetting.NETWORK_TYPE);
            if (!this.$forceRefresh) {
                ListState listState = (ListState) hotSpotMainState.getStateMap().get(this.$hotword);
                if (listState != null) {
                    if (this.$hotSearchItem == null) {
                        this.this$0.c(new a(listState, this));
                        return;
                    } else {
                        this.this$0.c(new b(listState, this));
                        return;
                    }
                }
            }
            if (this.$hotSearchItem != null) {
                this.this$0.c(new Function1<HotSpotMainState, HotSpotMainState>(this) {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ j this$0;

                    {
                        this.this$0 = r1;
                    }

                    @NotNull
                    public final HotSpotMainState invoke(@NotNull HotSpotMainState hotSpotMainState) {
                        HotSpotMainState hotSpotMainState2 = hotSpotMainState;
                        if (PatchProxy.isSupport(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36658, new Class[]{HotSpotMainState.class}, HotSpotMainState.class)) {
                            return (HotSpotMainState) PatchProxy.accessDispatch(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36658, new Class[]{HotSpotMainState.class}, HotSpotMainState.class);
                        }
                        Intrinsics.checkParameterIsNotNull(hotSpotMainState2, "$receiver");
                        return HotSpotMainState.copy$default(hotSpotMainState, this.this$0.$hotSearchItem, this.this$0.$hotword, null, null, null, false, null, null, 252, null);
                    }
                });
            } else {
                this.this$0.c(new Function1<HotSpotMainState, HotSpotMainState>(this) {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ j this$0;

                    {
                        this.this$0 = r1;
                    }

                    @NotNull
                    public final HotSpotMainState invoke(@NotNull HotSpotMainState hotSpotMainState) {
                        HotSpotMainState hotSpotMainState2 = hotSpotMainState;
                        if (PatchProxy.isSupport(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36659, new Class[]{HotSpotMainState.class}, HotSpotMainState.class)) {
                            return (HotSpotMainState) PatchProxy.accessDispatch(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36659, new Class[]{HotSpotMainState.class}, HotSpotMainState.class);
                        }
                        Intrinsics.checkParameterIsNotNull(hotSpotMainState2, "$receiver");
                        return HotSpotMainState.copy$default(hotSpotMainState, null, this.this$0.$hotword, null, null, null, false, null, null, 253, null);
                    }
                });
            }
            this.this$0.h.invoke();
        }
    }

    public HotSpotMainViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new d(this), new c(this), null, null, 12);
        this.g = listMiddleware;
        this.h = f.INSTANCE;
    }

    public final /* synthetic */ x c() {
        HotSpotMainState hotSpotMainState;
        if (PatchProxy.isSupport(new Object[0], this, f42486d, false, 36633, new Class[0], HotSpotMainState.class)) {
            hotSpotMainState = (HotSpotMainState) PatchProxy.accessDispatch(new Object[0], this, f42486d, false, 36633, new Class[0], HotSpotMainState.class);
        } else {
            hotSpotMainState = new HotSpotMainState(null, null, null, null, null, false, null, null, 255, null);
        }
        return hotSpotMainState;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f42486d, false, 36635, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42486d, false, 36635, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        new HotSpotMainViewModelMiddlewareBinding().binding(this);
        JediViewModel.a(this, b.INSTANCE, false, null, null, new e(this), 14, null);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42486d, false, 36641, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42486d, false, 36641, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        c(new h(z));
    }

    public final void a(@Nullable String str, @Nullable HotSearchItem hotSearchItem, boolean z) {
        String str2 = str;
        HotSearchItem hotSearchItem2 = hotSearchItem;
        if (PatchProxy.isSupport(new Object[]{str2, hotSearchItem2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42486d, false, 36640, new Class[]{String.class, HotSearchItem.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, hotSearchItem2, Byte.valueOf(z)}, this, f42486d, false, 36640, new Class[]{String.class, HotSearchItem.class, Boolean.TYPE}, Void.TYPE);
        } else if (str2 != null) {
            a(this.f42487e.a(str), i.INSTANCE);
            b(new j(this, z, str, hotSearchItem2));
        }
    }

    @NotNull
    public final Observable<Pair<List<Aweme>, com.ss.android.ugc.aweme.discover.hotspot.a.f>> a(boolean z, @NotNull HotSpotMainState hotSpotMainState, @Nullable HotSearchItem hotSearchItem, @NotNull String str) {
        boolean isAd;
        com.ss.android.ugc.aweme.discover.hotspot.a.f fVar;
        Single single;
        HotSpotMainState hotSpotMainState2 = hotSpotMainState;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), hotSpotMainState2, hotSearchItem, str2}, this, f42486d, false, 36636, new Class[]{Boolean.TYPE, HotSpotMainState.class, HotSearchItem.class, String.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), hotSpotMainState2, hotSearchItem, str2}, this, f42486d, false, 36636, new Class[]{Boolean.TYPE, HotSpotMainState.class, HotSearchItem.class, String.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(hotSpotMainState2, "state");
        Intrinsics.checkParameterIsNotNull(str2, "curSpotWord");
        if (hotSpotMainState.getCurSpot() == null) {
            isAd = this.f42488f.isAdSpot();
        } else {
            if (hotSearchItem == null) {
                Intrinsics.throwNpe();
            }
            isAd = hotSearchItem.isAd();
        }
        boolean z2 = isAd;
        if (z) {
            fVar = new com.ss.android.ugc.aweme.discover.hotspot.a.f(null, false, 0, null, 0, 31);
        } else {
            fVar = (com.ss.android.ugc.aweme.discover.hotspot.a.f) hotSpotMainState.getCurAwemeList().getPayload();
        }
        com.ss.android.ugc.aweme.discover.hotspot.a.b bVar = this.f42487e;
        String curSpotWord = hotSpotMainState.getCurSpotWord();
        if (curSpotWord == null) {
            Intrinsics.throwNpe();
        }
        String eventType = this.f42488f.getEventType();
        Intrinsics.checkExpressionValueIsNotNull(eventType, "param.eventType");
        com.ss.android.ugc.aweme.discover.hotspot.a.g gVar = new com.ss.android.ugc.aweme.discover.hotspot.a.g(fVar, curSpotWord, z2, eventType);
        if (PatchProxy.isSupport(new Object[]{gVar}, bVar, com.ss.android.ugc.aweme.discover.hotspot.a.b.f42428a, false, 36567, new Class[]{com.ss.android.ugc.aweme.discover.hotspot.a.g.class}, Single.class)) {
            com.ss.android.ugc.aweme.discover.hotspot.a.b bVar2 = bVar;
            single = (Single) PatchProxy.accessDispatch(new Object[]{gVar}, bVar2, com.ss.android.ugc.aweme.discover.hotspot.a.b.f42428a, false, 36567, new Class[]{com.ss.android.ugc.aweme.discover.hotspot.a.g.class}, Single.class);
        } else {
            Intrinsics.checkParameterIsNotNull(gVar, "payload");
            single = bVar.a(bVar.f42430c.a(gVar));
        }
        Observable<Pair<List<Aweme>, com.ss.android.ugc.aweme.discover.hotspot.a.f>> map = single.toObservable().map(new a(str2));
        Intrinsics.checkExpressionValueIsNotNull(map, "repo.getAwemesBySpot(Spo…otWord)\n                }");
        return map;
    }

    public static /* synthetic */ void a(HotSpotMainViewModel hotSpotMainViewModel, String str, HotSearchItem hotSearchItem, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            hotSearchItem = null;
        }
        hotSpotMainViewModel.a(str, hotSearchItem, false);
    }
}
