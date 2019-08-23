package com.ss.android.ugc.aweme.friends.recommendlist.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.x;
import com.bytedance.jedi.codegen.anno.Bind;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.friends.recommendlist.adapter.RecommendListWidgetAdapter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012J:\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010 \u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0012J\b\u0010!\u001a\u00020\rH\u0002J\b\u0010\"\u001a\u00020\rH\u0014J\b\u0010#\u001a\u00020\rH\u0014J\u000e\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u001fJ\u000e\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0012J\u000e\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0012J\u001e\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u001fJ\"\u00100\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u001c0\u000f2\u0006\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u001fH\u0002R(\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "()V", "recommendListMiddleware", "Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendPayload;", "getRecommendListMiddleware", "()Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "recommendRepository", "Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/RecommendListRepository;", "addHeaderView", "", "list", "", "recommendListState", "showError", "", "addHeaderViewForError", "defaultState", "dislike", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "followBackData", "filterWrapperUserList", "", "recentFanList", "Lcom/ss/android/ugc/aweme/user/repository/UserWrapper;", "recommendList", "newRecommendCount", "", "hideRecommendMask", "observeRecommendList", "onCleared", "onStart", "setContactNoticeCount", "count", "setReportId", "reportId", "", "showContactDot", "show", "showGuide", "updateState", "puid", "yellowPointCount", "recommendUserType", "swap", "index1", "index2", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecommendListViewModel extends JediViewModel<RecommendListState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f49017d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.friends.recommendlist.repository.d f49018e = new com.ss.android.ugc.aweme.friends.recommendlist.repository.d();
    @NotNull
    @Bind
    public final ListMiddleware<RecommendListState, Object, d> recommendListMiddleware;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\u0004\"\b\b\u0003\u0010\u0005*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\u0007H\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "T", "P", "kotlin.jvm.PlatformType", "S", "Lcom/bytedance/jedi/arch/State;", "RESP", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "state", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lio/reactivex/Observable;", "com/bytedance/jedi/arch/ext/list/ListMiddlewareLegeciesKt$ListMiddleware$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<RecommendListState, Observable<Pair<? extends List<? extends Object>, ? extends d>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $listMapper;
        final /* synthetic */ Function2 $payloadMapper;
        final /* synthetic */ RecommendListViewModel this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Resp;", "recentFanRecommend", "Lcom/ss/android/ugc/aweme/friends/model/RecommendList;", "recommendList", "apply", "com/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel$recommendListMiddleware$1$1"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel$a$a  reason: collision with other inner class name */
        static final class C0585a<T1, T2, R> implements BiFunction<RecommendList, RecommendList, e> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49022a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ RecommendListState f49023b;

            C0585a(RecommendListState recommendListState) {
                this.f49023b = recommendListState;
            }

            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                RecommendList recommendList = (RecommendList) obj;
                RecommendList recommendList2 = (RecommendList) obj2;
                if (PatchProxy.isSupport(new Object[]{recommendList, recommendList2}, this, f49022a, false, 46826, new Class[]{RecommendList.class, RecommendList.class}, e.class)) {
                    return (e) PatchProxy.accessDispatch(new Object[]{recommendList, recommendList2}, this, f49022a, false, 46826, new Class[]{RecommendList.class, RecommendList.class}, e.class);
                }
                Intrinsics.checkParameterIsNotNull(recommendList, "recentFanRecommend");
                Intrinsics.checkParameterIsNotNull(recommendList2, "recommendList");
                e eVar = new e(0, null, null, null, 15);
                return eVar.a(8, this.f49023b, recommendList, recommendList2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Function2 function2, RecommendListViewModel recommendListViewModel) {
            super(1);
            this.$listMapper = function1;
            this.$payloadMapper = function2;
            this.this$0 = recommendListViewModel;
        }

        public final Observable<Pair<List<Object>, d>> invoke(@NotNull RecommendListState recommendListState) {
            Observable observable;
            final RecommendListState recommendListState2 = recommendListState;
            if (PatchProxy.isSupport(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46824, new Class[]{x.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46824, new Class[]{x.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(recommendListState2, "state");
            RecommendListState recommendListState3 = recommendListState2;
            Observable a2 = this.this$0.f49018e.a(20, 0, null, 8, Integer.valueOf(recommendListState3.getYellowPointCount()), Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.a()), recommendListState3.getReportId(), null, Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.b()));
            if (TextUtils.isEmpty(recommendListState3.getPuid())) {
                observable = this.this$0.f49018e.a(30, 0, null, 3, Integer.valueOf(recommendListState3.getYellowPointCount()), Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.a()), recommendListState3.getReportId(), null, Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.b()));
            } else {
                observable = this.this$0.f49018e.a(30, 0, null, 3, 1, Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.a()), recommendListState3.getReportId(), recommendListState3.getPuid(), Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.b()));
            }
            Single fromObservable = Single.fromObservable(Observable.zip(a2, observable, new C0585a(recommendListState3)).subscribeOn(AndroidSchedulers.mainThread()).doAfterNext(h.f49035b));
            Intrinsics.checkExpressionValueIsNotNull(fromObservable, "Single.fromObservable(Ob…                       })");
            Observable<Pair<List<Object>, d>> map = fromObservable.toObservable().map(new Function<T, R>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49019a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f49020b;

                {
                    this.f49020b = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    if (!PatchProxy.isSupport(new Object[]{obj}, this, f49019a, false, 46825, new Class[]{Object.class}, Pair.class)) {
                        return TuplesKt.to(this.f49020b.$listMapper.invoke(obj), this.f49020b.$payloadMapper.invoke(recommendListState2, obj));
                    }
                    return (Pair) PatchProxy.accessDispatch(new Object[]{obj}, this, f49019a, false, 46825, new Class[]{Object.class}, Pair.class);
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(map, "actualRefresh(state).toO…yloadMapper(state, it)) }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\u0004\"\b\b\u0003\u0010\u0005*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\u0007H\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "T", "P", "kotlin.jvm.PlatformType", "S", "Lcom/bytedance/jedi/arch/State;", "RESP", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "state", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lio/reactivex/Observable;", "com/bytedance/jedi/arch/ext/list/ListMiddlewareLegeciesKt$ListMiddleware$3$1", "com/bytedance/jedi/arch/ext/list/ListMiddlewareLegeciesKt$ListMiddleware$$inlined$let$lambda$6"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function1<RecommendListState, Observable<Pair<? extends List<? extends Object>, ? extends d>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $listMapper$inlined;
        final /* synthetic */ Function1 $loadMore;
        final /* synthetic */ Function2 $payloadMapper$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, Function1 function12, Function2 function2) {
            super(1);
            this.$loadMore = function1;
            this.$listMapper$inlined = function12;
            this.$payloadMapper$inlined = function2;
        }

        public final Observable<Pair<List<Object>, d>> invoke(@NotNull final RecommendListState recommendListState) {
            if (PatchProxy.isSupport(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46827, new Class[]{x.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46827, new Class[]{x.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(recommendListState, "state");
            return ((Single) this.$loadMore.invoke(recommendListState)).toObservable().map(new Function<T, R>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49024a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f49025b;

                {
                    this.f49025b = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    if (!PatchProxy.isSupport(new Object[]{obj}, this, f49024a, false, 46828, new Class[]{Object.class}, Pair.class)) {
                        return TuplesKt.to(this.f49025b.$listMapper$inlined.invoke(obj), this.f49025b.$payloadMapper$inlined.invoke(recommendListState, obj));
                    }
                    return (Pair) PatchProxy.accessDispatch(new Object[]{obj}, this, f49024a, false, 46828, new Class[]{Object.class}, Pair.class);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class c extends Lambda implements Function1<RecommendListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(RecommendListViewModel recommendListViewModel) {
            super(1);
            this.this$0 = recommendListViewModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RecommendListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RecommendListState recommendListState) {
            if (PatchProxy.isSupport(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46829, new Class[]{RecommendListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46829, new Class[]{RecommendListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(recommendListState, "state");
            final ArrayList arrayList = new ArrayList();
            this.this$0.a(arrayList, recommendListState, true);
            this.this$0.c(new Function1<RecommendListState, RecommendListState>() {
                public static ChangeQuickRedirect changeQuickRedirect;

                @NotNull
                public final RecommendListState invoke(@NotNull RecommendListState recommendListState) {
                    RecommendListState recommendListState2 = recommendListState;
                    if (PatchProxy.isSupport(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46830, new Class[]{RecommendListState.class}, RecommendListState.class)) {
                        return (RecommendListState) PatchProxy.accessDispatch(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46830, new Class[]{RecommendListState.class}, RecommendListState.class);
                    }
                    Intrinsics.checkParameterIsNotNull(recommendListState2, "$receiver");
                    return RecommendListState.copy$default(recommendListState, false, null, 0, 0, false, 0, 0, false, 0, false, null, null, ListState.copy$default(recommendListState.getRecommendListState(), null, arrayList, null, null, null, 29, null), 4095, null);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class d extends Lambda implements Function1<RecommendListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $followBackData;
        final /* synthetic */ User $user;
        final /* synthetic */ RecommendListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(RecommendListViewModel recommendListViewModel, boolean z, User user) {
            super(1);
            this.this$0 = recommendListViewModel;
            this.$followBackData = z;
            this.$user = user;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RecommendListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RecommendListState recommendListState) {
            if (PatchProxy.isSupport(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46831, new Class[]{RecommendListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46831, new Class[]{RecommendListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(recommendListState, AdvanceSetting.NETWORK_TYPE);
            if (this.$followBackData) {
                this.this$0.c(AnonymousClass1.INSTANCE);
            } else if (this.$user.isNewRecommend()) {
                this.this$0.c(AnonymousClass2.INSTANCE);
            }
            com.ss.android.ugc.aweme.friends.recommendlist.repository.d dVar = this.this$0.f49018e;
            String uid = this.$user.getUid();
            Intrinsics.checkExpressionValueIsNotNull(uid, "user.uid");
            dVar.a(uid).subscribe(AnonymousClass3.f49027a, AnonymousClass4.f49029b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class e extends Lambda implements Function1<RecommendListState, RecommendListState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $hideRecommendMask;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(1);
            this.$hideRecommendMask = z;
        }

        @NotNull
        public final RecommendListState invoke(@NotNull RecommendListState recommendListState) {
            RecommendListState recommendListState2 = recommendListState;
            if (PatchProxy.isSupport(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46835, new Class[]{RecommendListState.class}, RecommendListState.class)) {
                return (RecommendListState) PatchProxy.accessDispatch(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46835, new Class[]{RecommendListState.class}, RecommendListState.class);
            }
            Intrinsics.checkParameterIsNotNull(recommendListState2, "$receiver");
            return RecommendListState.copy$default(recommendListState, false, null, 0, 0, this.$hideRecommendMask, 0, 0, false, 0, false, null, null, null, 8175, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/bytedance/jedi/model/datasource/Optional;", "", "Lcom/ss/android/ugc/aweme/user/repository/UserWrapper;", "recent", "recommend", "apply"}, k = 3, mv = {1, 1, 15})
    static final class f<T1, T2, R> implements BiFunction<com.bytedance.jedi.model.c.f<? extends List<? extends com.ss.android.ugc.aweme.user.repository.l>>, com.bytedance.jedi.model.c.f<? extends List<? extends com.ss.android.ugc.aweme.user.repository.l>>, Pair<? extends com.bytedance.jedi.model.c.f<? extends List<? extends com.ss.android.ugc.aweme.user.repository.l>>, ? extends com.bytedance.jedi.model.c.f<? extends List<? extends com.ss.android.ugc.aweme.user.repository.l>>>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49030a;

        /* renamed from: b  reason: collision with root package name */
        public static final f f49031b = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            com.bytedance.jedi.model.c.f fVar = (com.bytedance.jedi.model.c.f) obj;
            com.bytedance.jedi.model.c.f fVar2 = (com.bytedance.jedi.model.c.f) obj2;
            if (PatchProxy.isSupport(new Object[]{fVar, fVar2}, this, f49030a, false, 46836, new Class[]{com.bytedance.jedi.model.c.f.class, com.bytedance.jedi.model.c.f.class}, Pair.class)) {
                return (Pair) PatchProxy.accessDispatch(new Object[]{fVar, fVar2}, this, f49030a, false, 46836, new Class[]{com.bytedance.jedi.model.c.f.class, com.bytedance.jedi.model.c.f.class}, Pair.class);
            }
            Intrinsics.checkParameterIsNotNull(fVar, "recent");
            Intrinsics.checkParameterIsNotNull(fVar2, "recommend");
            return TuplesKt.to(fVar, fVar2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012V\u0010\u0002\u001aR\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004 \u0007*(\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "result", "Lkotlin/Pair;", "Lcom/bytedance/jedi/model/datasource/Optional;", "", "Lcom/ss/android/ugc/aweme/user/repository/UserWrapper;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class g<T> implements Consumer<Pair<? extends com.bytedance.jedi.model.c.f<? extends List<? extends com.ss.android.ugc.aweme.user.repository.l>>, ? extends com.bytedance.jedi.model.c.f<? extends List<? extends com.ss.android.ugc.aweme.user.repository.l>>>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49032a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendListViewModel f49033b;

        g(RecommendListViewModel recommendListViewModel) {
            this.f49033b = recommendListViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            final Pair pair = (Pair) obj;
            if (PatchProxy.isSupport(new Object[]{pair}, this, f49032a, false, 46837, new Class[]{Pair.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pair}, this, f49032a, false, 46837, new Class[]{Pair.class}, Void.TYPE);
                return;
            }
            this.f49033b.b(new Function1<RecommendListState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ g this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((RecommendListState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull final RecommendListState recommendListState) {
                    if (PatchProxy.isSupport(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46838, new Class[]{RecommendListState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46838, new Class[]{RecommendListState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(recommendListState, "state");
                    this.this$0.f49033b.c(new Function1<RecommendListState, RecommendListState>(this) {
                        public static ChangeQuickRedirect changeQuickRedirect;
                        final /* synthetic */ AnonymousClass1 this$0;

                        {
                            this.this$0 = r1;
                        }

                        @NotNull
                        public final RecommendListState invoke(@NotNull RecommendListState recommendListState) {
                            RecommendListState recommendListState2 = recommendListState;
                            if (PatchProxy.isSupport(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46839, new Class[]{RecommendListState.class}, RecommendListState.class)) {
                                return (RecommendListState) PatchProxy.accessDispatch(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46839, new Class[]{RecommendListState.class}, RecommendListState.class);
                            }
                            Intrinsics.checkParameterIsNotNull(recommendListState2, "$receiver");
                            List arrayList = new ArrayList();
                            List list = (List) ((com.bytedance.jedi.model.c.f) pair.getFirst()).a();
                            if (list != null && recommendListState.getFollowBackRecommend() > 0) {
                                arrayList.addAll(CollectionsKt.toMutableList((Collection<? extends T>) list).subList(0, Math.min(recommendListState.getFollowBackRecommend(), list.size())));
                            }
                            List arrayList2 = new ArrayList();
                            List list2 = (List) ((com.bytedance.jedi.model.c.f) pair.getSecond()).a();
                            if (list2 != null) {
                                Collection collection = list2;
                                HashMap hashMap = new HashMap(CollectionsKt.toMutableList(collection).size());
                                for (com.ss.android.ugc.aweme.user.repository.l lVar : CollectionsKt.toMutableList(collection)) {
                                    String uid = lVar.f75398b.getUid();
                                    Intrinsics.checkExpressionValueIsNotNull(uid, "item.user.uid");
                                    hashMap.put(uid, lVar);
                                }
                                Collection arrayList3 = new ArrayList();
                                for (Object next : CollectionsKt.toMutableList((Collection<? extends T>) ((d) recommendListState.getRecommendListState().getPayload()).f49057d)) {
                                    if (hashMap.containsKey(((User) next).getUid())) {
                                        arrayList3.add(next);
                                    }
                                }
                                for (User uid2 : (List) arrayList3) {
                                    com.ss.android.ugc.aweme.user.repository.l lVar2 = (com.ss.android.ugc.aweme.user.repository.l) hashMap.get(uid2.getUid());
                                    if (lVar2 != null) {
                                        Intrinsics.checkExpressionValueIsNotNull(lVar2, "this");
                                        arrayList2.add(lVar2);
                                    }
                                }
                            }
                            return RecommendListState.copy$default(recommendListState, false, null, 0, 0, false, 0, 0, false, 0, false, null, null, ListState.copy$default(recommendListState.getRecommendListState(), null, this.this$0.this$0.f49033b.a(arrayList, arrayList2, recommendListState, recommendListState.getNewRecommendCount()), null, null, null, 29, null), 4095, null);
                        }
                    });
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "resp", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Resp;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class h<T> implements Consumer<e> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49034a;

        /* renamed from: b  reason: collision with root package name */
        public static final h f49035b = new h();

        h() {
        }

        public final /* synthetic */ void accept(Object obj) {
            e eVar = (e) obj;
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f49034a, false, 46840, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f49034a, false, 46840, new Class[]{e.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.newfollow.util.k.a().c();
            ai.a().a(eVar.f49062e.rid, eVar.f49062e.logPb);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Resp;", "kotlin.jvm.PlatformType", "state", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function1<RecommendListState, Single<e>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(RecommendListViewModel recommendListViewModel) {
            super(1);
            this.this$0 = recommendListViewModel;
        }

        public final Single<e> invoke(@NotNull RecommendListState recommendListState) {
            final RecommendListState recommendListState2 = recommendListState;
            if (PatchProxy.isSupport(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46841, new Class[]{RecommendListState.class}, Single.class)) {
                return (Single) PatchProxy.accessDispatch(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46841, new Class[]{RecommendListState.class}, Single.class);
            }
            Intrinsics.checkParameterIsNotNull(recommendListState2, "state");
            Single<e> doAfterSuccess = Single.fromObservable(this.this$0.f49018e.a(30, Integer.valueOf(((d) recommendListState.getRecommendListState().getPayload()).f21388b), null, 3, Integer.valueOf(recommendListState.getYellowPointCount()), Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.a()), recommendListState.getReportId(), null, Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.b())).map(new Function<T, R>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49036a;

                public final /* synthetic */ Object apply(Object obj) {
                    RecommendList recommendList = (RecommendList) obj;
                    if (PatchProxy.isSupport(new Object[]{recommendList}, this, f49036a, false, 46842, new Class[]{RecommendList.class}, e.class)) {
                        return (e) PatchProxy.accessDispatch(new Object[]{recommendList}, this, f49036a, false, 46842, new Class[]{RecommendList.class}, e.class);
                    }
                    Intrinsics.checkParameterIsNotNull(recommendList, "recommendList");
                    e eVar = new e(0, null, null, null, 15);
                    return eVar.a(9, recommendListState2, eVar.f49061d, recommendList);
                }
            })).subscribeOn(AndroidSchedulers.mainThread()).doAfterSuccess(AnonymousClass2.f49039b);
            Intrinsics.checkExpressionValueIsNotNull(doAfterSuccess, "Single.fromObservable(\n ….logPb)\n                }");
            return doAfterSuccess;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "resp", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Resp;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function1<e, List<? extends Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(RecommendListViewModel recommendListViewModel) {
            super(1);
            this.this$0 = recommendListViewModel;
        }

        @NotNull
        public final List<Object> invoke(@NotNull e eVar) {
            boolean z;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{eVar}, this, changeQuickRedirect, false, 46844, new Class[]{e.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{eVar}, this, changeQuickRedirect, false, 46844, new Class[]{e.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(eVar, "resp");
            if (eVar.f49059b == 8) {
                final int min = Math.min(eVar.f49061d.getUserList().size(), 3);
                final int min2 = Math.min(Math.max(eVar.f49062e.newUserCount, 0), 5);
                this.this$0.c(new Function1<RecommendListState, RecommendListState>() {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @NotNull
                    public final RecommendListState invoke(@NotNull RecommendListState recommendListState) {
                        RecommendListState recommendListState2 = recommendListState;
                        if (PatchProxy.isSupport(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46845, new Class[]{RecommendListState.class}, RecommendListState.class)) {
                            return (RecommendListState) PatchProxy.accessDispatch(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46845, new Class[]{RecommendListState.class}, RecommendListState.class);
                        }
                        Intrinsics.checkParameterIsNotNull(recommendListState2, "$receiver");
                        return RecommendListState.copy$default(recommendListState, false, null, 0, 0, false, min2, min, false, 0, false, null, null, null, 8095, null);
                    }
                });
                List arrayList = new ArrayList();
                RecommendList recommendList = eVar.f49061d;
                List<User> userList = recommendList.getUserList();
                Intrinsics.checkExpressionValueIsNotNull(userList, "it.userList");
                Collection arrayList2 = new ArrayList();
                int i2 = 0;
                for (Object next : userList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (i2 < min) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList2.add(next);
                    }
                    i2 = i3;
                }
                for (User user : (List) arrayList2) {
                    Intrinsics.checkExpressionValueIsNotNull(user, AllStoryActivity.f73306b);
                    String str = recommendList.rid;
                    Intrinsics.checkExpressionValueIsNotNull(str, "it.rid");
                    arrayList.add(new com.ss.android.ugc.aweme.user.repository.l(user, str, 0, 4));
                }
                List arrayList3 = new ArrayList();
                RecommendList recommendList2 = eVar.f49062e;
                List<User> userList2 = recommendList2.getUserList();
                Intrinsics.checkExpressionValueIsNotNull(userList2, "it.userList");
                for (User user2 : userList2) {
                    Intrinsics.checkExpressionValueIsNotNull(user2, AllStoryActivity.f73306b);
                    String str2 = recommendList2.rid;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "it.rid");
                    arrayList3.add(new com.ss.android.ugc.aweme.user.repository.l(user2, str2, 0, 4));
                }
                List<Object> a2 = this.this$0.a(arrayList, arrayList3, eVar.f49060c, min2);
                final Map linkedHashMap = new LinkedHashMap();
                for (Object next2 : a2) {
                    if (next2 instanceof com.ss.android.ugc.aweme.user.repository.l) {
                        String uid = ((com.ss.android.ugc.aweme.user.repository.l) next2).f75398b.getUid();
                        Intrinsics.checkExpressionValueIsNotNull(uid, "it.user.uid");
                        linkedHashMap.put(uid, Integer.valueOf(i));
                        i++;
                    }
                }
                this.this$0.c(new Function1<RecommendListState, RecommendListState>() {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @NotNull
                    public final RecommendListState invoke(@NotNull RecommendListState recommendListState) {
                        RecommendListState recommendListState2 = recommendListState;
                        if (PatchProxy.isSupport(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46846, new Class[]{RecommendListState.class}, RecommendListState.class)) {
                            return (RecommendListState) PatchProxy.accessDispatch(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46846, new Class[]{RecommendListState.class}, RecommendListState.class);
                        }
                        Intrinsics.checkParameterIsNotNull(recommendListState2, "$receiver");
                        return RecommendListState.copy$default(recommendListState, false, null, 0, 0, false, 0, 0, false, 0, false, null, linkedHashMap, null, 6143, null);
                    }
                });
                return a2;
            } else if (eVar.f49059b != 9) {
                return CollectionsKt.emptyList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                int size = eVar.f49062e.getUserList().size();
                for (int i4 = 0; i4 < size; i4++) {
                    User user3 = eVar.f49062e.getUserList().get(i4);
                    Intrinsics.checkExpressionValueIsNotNull(user3, "resp.recommendList.userList[j]");
                    String str3 = eVar.f49062e.rid;
                    Intrinsics.checkExpressionValueIsNotNull(str3, "resp.recommendList.rid");
                    arrayList4.add(new com.ss.android.ugc.aweme.user.repository.l(user3, str3, 0, 4));
                }
                return arrayList4;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendPayload;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "resp", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Resp;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function2<RecommendListState, e, d> {
        public static final k INSTANCE = new k();
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
            super(2);
        }

        @NotNull
        public final d invoke(@NotNull RecommendListState recommendListState, @NotNull e eVar) {
            RecommendListState recommendListState2 = recommendListState;
            e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{recommendListState2, eVar2}, this, changeQuickRedirect, false, 46847, new Class[]{RecommendListState.class, e.class}, d.class)) {
                return (d) PatchProxy.accessDispatch(new Object[]{recommendListState2, eVar2}, this, changeQuickRedirect, false, 46847, new Class[]{RecommendListState.class, e.class}, d.class);
            }
            Intrinsics.checkParameterIsNotNull(recommendListState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(eVar2, "resp");
            List<User> userList = eVar2.f49062e.getUserList();
            Intrinsics.checkExpressionValueIsNotNull(userList, "resp.recommendList.userList");
            return new d(CollectionsKt.plus((Collection<? extends T>) ((d) recommendListState.getRecommendListState().getPayload()).f49057d, (Iterable<? extends T>) userList), eVar2.f49062e.hasMore, eVar2.f49062e.cursor);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "list", "", "loadMore", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function2<List<? extends Object>, List<? extends Object>, List<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(RecommendListViewModel recommendListViewModel) {
            super(2);
            this.this$0 = recommendListViewModel;
        }

        @NotNull
        public final List<Object> invoke(@NotNull List<? extends Object> list, @NotNull List<? extends Object> list2) {
            List<? extends Object> list3 = list;
            List<? extends Object> list4 = list2;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{list3, list4}, this, changeQuickRedirect, false, 46848, new Class[]{List.class, List.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{list3, list4}, this, changeQuickRedirect, false, 46848, new Class[]{List.class, List.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(list3, "list");
            Intrinsics.checkParameterIsNotNull(list4, "loadMore");
            HashSet hashSet = new HashSet();
            final Map linkedHashMap = new LinkedHashMap();
            List<Object> mutableList = CollectionsKt.toMutableList((Collection<? extends T>) list3);
            for (Object next : mutableList) {
                if (next instanceof com.ss.android.ugc.aweme.user.repository.l) {
                    com.ss.android.ugc.aweme.user.repository.l lVar = (com.ss.android.ugc.aweme.user.repository.l) next;
                    hashSet.add(lVar.f75398b.getUid());
                    String uid = lVar.f75398b.getUid();
                    Intrinsics.checkExpressionValueIsNotNull(uid, "item.user.uid");
                    linkedHashMap.put(uid, Integer.valueOf(i));
                    i++;
                }
            }
            for (Object next2 : list4) {
                if (next2 != null) {
                    com.ss.android.ugc.aweme.user.repository.l lVar2 = (com.ss.android.ugc.aweme.user.repository.l) next2;
                    if (hashSet.add(lVar2.f75398b.getUid())) {
                        mutableList.add(lVar2);
                        String uid2 = lVar2.f75398b.getUid();
                        Intrinsics.checkExpressionValueIsNotNull(uid2, "item.user.uid");
                        linkedHashMap.put(uid2, Integer.valueOf(i));
                        i++;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.repository.UserWrapper");
                }
            }
            this.this$0.c(new Function1<RecommendListState, RecommendListState>() {
                public static ChangeQuickRedirect changeQuickRedirect;

                @NotNull
                public final RecommendListState invoke(@NotNull RecommendListState recommendListState) {
                    RecommendListState recommendListState2 = recommendListState;
                    if (PatchProxy.isSupport(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46849, new Class[]{RecommendListState.class}, RecommendListState.class)) {
                        return (RecommendListState) PatchProxy.accessDispatch(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46849, new Class[]{RecommendListState.class}, RecommendListState.class);
                    }
                    Intrinsics.checkParameterIsNotNull(recommendListState2, "$receiver");
                    return RecommendListState.copy$default(recommendListState, false, null, 0, 0, false, 0, 0, false, 0, false, null, linkedHashMap, null, 6143, null);
                }
            });
            return mutableList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function1<RecommendListState, RecommendListState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ int $count;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(int i) {
            super(1);
            this.$count = i;
        }

        @NotNull
        public final RecommendListState invoke(@NotNull RecommendListState recommendListState) {
            RecommendListState recommendListState2 = recommendListState;
            if (PatchProxy.isSupport(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46850, new Class[]{RecommendListState.class}, RecommendListState.class)) {
                return (RecommendListState) PatchProxy.accessDispatch(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46850, new Class[]{RecommendListState.class}, RecommendListState.class);
            }
            Intrinsics.checkParameterIsNotNull(recommendListState2, "$receiver");
            return RecommendListState.copy$default(recommendListState, false, null, 0, 0, false, 0, 0, false, this.$count, false, null, null, null, 7935, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class n extends Lambda implements Function1<RecommendListState, RecommendListState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $reportId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(1);
            this.$reportId = str;
        }

        @NotNull
        public final RecommendListState invoke(@NotNull RecommendListState recommendListState) {
            RecommendListState recommendListState2 = recommendListState;
            if (PatchProxy.isSupport(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46851, new Class[]{RecommendListState.class}, RecommendListState.class)) {
                return (RecommendListState) PatchProxy.accessDispatch(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46851, new Class[]{RecommendListState.class}, RecommendListState.class);
            }
            Intrinsics.checkParameterIsNotNull(recommendListState2, "$receiver");
            return RecommendListState.copy$default(recommendListState, false, null, 0, 0, false, 0, 0, false, 0, false, this.$reportId, null, null, 7167, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class o extends Lambda implements Function1<RecommendListState, RecommendListState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $show;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(boolean z) {
            super(1);
            this.$show = z;
        }

        @NotNull
        public final RecommendListState invoke(@NotNull RecommendListState recommendListState) {
            RecommendListState recommendListState2 = recommendListState;
            if (PatchProxy.isSupport(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46852, new Class[]{RecommendListState.class}, RecommendListState.class)) {
                return (RecommendListState) PatchProxy.accessDispatch(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46852, new Class[]{RecommendListState.class}, RecommendListState.class);
            }
            Intrinsics.checkParameterIsNotNull(recommendListState2, "$receiver");
            return RecommendListState.copy$default(recommendListState, false, null, 0, 0, false, 0, 0, false, 0, this.$show, null, null, null, 7679, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class p extends Lambda implements Function1<RecommendListState, RecommendListState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $show;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(boolean z) {
            super(1);
            this.$show = z;
        }

        @NotNull
        public final RecommendListState invoke(@NotNull RecommendListState recommendListState) {
            RecommendListState recommendListState2 = recommendListState;
            if (PatchProxy.isSupport(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46853, new Class[]{RecommendListState.class}, RecommendListState.class)) {
                return (RecommendListState) PatchProxy.accessDispatch(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46853, new Class[]{RecommendListState.class}, RecommendListState.class);
            }
            Intrinsics.checkParameterIsNotNull(recommendListState2, "$receiver");
            return RecommendListState.copy$default(recommendListState, this.$show, null, 0, 0, false, 0, 0, false, 0, false, null, null, null, 8190, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class q extends Lambda implements Function1<RecommendListState, RecommendListState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $puid;
        final /* synthetic */ int $recommendUserType;
        final /* synthetic */ int $yellowPointCount;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(String str, int i, int i2) {
            super(1);
            this.$puid = str;
            this.$recommendUserType = i;
            this.$yellowPointCount = i2;
        }

        @NotNull
        public final RecommendListState invoke(@NotNull RecommendListState recommendListState) {
            RecommendListState recommendListState2 = recommendListState;
            if (PatchProxy.isSupport(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46854, new Class[]{RecommendListState.class}, RecommendListState.class)) {
                return (RecommendListState) PatchProxy.accessDispatch(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46854, new Class[]{RecommendListState.class}, RecommendListState.class);
            }
            Intrinsics.checkParameterIsNotNull(recommendListState2, "$receiver");
            return RecommendListState.copy$default(recommendListState, false, this.$puid, this.$yellowPointCount, this.$recommendUserType, false, 0, 0, false, 0, false, null, null, null, 8177, null);
        }
    }

    public RecommendListViewModel() {
        Function1 jVar = new j(this);
        Function2 function2 = k.INSTANCE;
        Function2 a2 = com.bytedance.jedi.arch.ext.list.j.a();
        this.recommendListMiddleware = new ListMiddleware<>(new a(jVar, function2, this), new b(new i(this), jVar, function2), a2, new l(this));
    }

    public final void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f49017d, false, 46818, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49017d, false, 46818, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
        this.f49018e.a();
    }

    public final /* synthetic */ x c() {
        RecommendListState recommendListState;
        if (PatchProxy.isSupport(new Object[0], this, f49017d, false, 46809, new Class[0], RecommendListState.class)) {
            recommendListState = (RecommendListState) PatchProxy.accessDispatch(new Object[0], this, f49017d, false, 46809, new Class[0], RecommendListState.class);
        } else {
            recommendListState = new RecommendListState(false, null, 0, 0, false, 0, 0, false, 0, false, null, null, null, 8191, null);
        }
        return recommendListState;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f49017d, false, 46810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49017d, false, 46810, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (PatchProxy.isSupport(new Object[0], this, f49017d, false, 46819, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49017d, false, 46819, new Class[0], Void.TYPE);
        } else {
            Observable.combineLatest((ObservableSource<? extends T1>) this.f49018e.a(8).startWith((ObservableSource<? extends T>) this.f49018e.b(8).take(1)), (ObservableSource<? extends T2>) this.f49018e.a(3).startWith((ObservableSource<? extends T>) this.f49018e.b(3).take(1)), (BiFunction<? super T1, ? super T2, ? extends R>) f.f49031b).skip(1).subscribe((Consumer<? super T>) new g<Object>(this));
        }
        new RecommendListViewModelMiddlewareBinding().binding(this);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f49017d, false, 46815, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f49017d, false, 46815, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        c(new m(i2));
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f49017d, false, 46816, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f49017d, false, 46816, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        c(new o(z));
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f49017d, false, 46811, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f49017d, false, 46811, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        c(new p(false));
    }

    public final void a(List<Object> list, RecommendListState recommendListState, boolean z) {
        List<Object> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, recommendListState, Byte.valueOf(z ? (byte) 1 : 0)}, this, f49017d, false, 46822, new Class[]{List.class, RecommendListState.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, recommendListState, Byte.valueOf(z)}, this, f49017d, false, 46822, new Class[]{List.class, RecommendListState.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        boolean showContactDot = recommendListState.getShowContactDot();
        boolean enableFace2Face = recommendListState.getEnableFace2Face();
        if (z || !list.isEmpty()) {
            List arrayList = new ArrayList();
            Context context = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
            String string = context.getResources().getString(C0906R.string.cy);
            Intrinsics.checkExpressionValueIsNotNull(string, "GlobalContext.getContext…tring.add_friend_contact)");
            arrayList.add(new com.ss.android.ugc.aweme.friends.recommendlist.adapter.a(0, string, showContactDot ? 1 : 0, 0));
            Context context2 = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "GlobalContext.getContext()");
            String string2 = context2.getResources().getString(C0906R.string.cx);
            Intrinsics.checkExpressionValueIsNotNull(string2, "GlobalContext.getContext…ing.add_friend_command_b)");
            com.ss.android.ugc.aweme.friends.recommendlist.adapter.a aVar = new com.ss.android.ugc.aweme.friends.recommendlist.adapter.a(1, string2, 0, 1, 4);
            arrayList.add(aVar);
            if (enableFace2Face) {
                Context context3 = GlobalContext.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "GlobalContext.getContext()");
                String string3 = context3.getResources().getString(C0906R.string.d1);
                Intrinsics.checkExpressionValueIsNotNull(string3, "GlobalContext.getContext…R.string.add_friend_scan)");
                com.ss.android.ugc.aweme.friends.recommendlist.adapter.a aVar2 = new com.ss.android.ugc.aweme.friends.recommendlist.adapter.a(2, string3, 0, 2, 4);
                arrayList.add(aVar2);
                Context context4 = GlobalContext.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context4, "GlobalContext.getContext()");
                String string4 = context4.getResources().getString(C0906R.string.cz);
                Intrinsics.checkExpressionValueIsNotNull(string4, "GlobalContext.getContext…R.string.add_friend_face)");
                com.ss.android.ugc.aweme.friends.recommendlist.adapter.a aVar3 = new com.ss.android.ugc.aweme.friends.recommendlist.adapter.a(3, string4, 0, 3, 4);
                arrayList.add(aVar3);
            }
            list2.add(0, new a(7, arrayList));
            return;
        }
        list2.add(0, new a(6, null, 2));
    }

    public final List<Object> a(List<com.ss.android.ugc.aweme.user.repository.l> list, List<com.ss.android.ugc.aweme.user.repository.l> list2, RecommendListState recommendListState, int i2) {
        boolean z;
        List<com.ss.android.ugc.aweme.user.repository.l> list3;
        boolean z2;
        List<com.ss.android.ugc.aweme.user.repository.l> list4;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        List<com.ss.android.ugc.aweme.user.repository.l> list5;
        boolean z6;
        boolean z7;
        List<com.ss.android.ugc.aweme.user.repository.l> list6 = list;
        List<com.ss.android.ugc.aweme.user.repository.l> list7 = list2;
        RecommendListState recommendListState2 = recommendListState;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{list6, list7, recommendListState2, Integer.valueOf(i2)}, this, f49017d, false, 46820, new Class[]{List.class, List.class, RecommendListState.class, Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list6, list7, recommendListState2, Integer.valueOf(i2)}, this, f49017d, false, 46820, new Class[]{List.class, List.class, RecommendListState.class, Integer.TYPE}, List.class);
        }
        int recommendUserType = recommendListState.getRecommendUserType();
        if (!list2.isEmpty()) {
            int size = list2.size();
            int i5 = 1;
            for (int i6 = 1; i6 < size; i6++) {
                if (!Intrinsics.areEqual((Object) list7.get(0).f75398b.getUid(), (Object) list7.get(i6).f75398b.getUid())) {
                    if (i5 != i6) {
                        if (PatchProxy.isSupport(new Object[]{list7, Integer.valueOf(i5), Integer.valueOf(i6)}, this, f49017d, false, 46823, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{list7, Integer.valueOf(i5), Integer.valueOf(i6)}, this, f49017d, false, 46823, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        } else {
                            list7.set(i5, list7.get(i6));
                            list7.set(i6, list7.get(i5));
                        }
                    }
                    i5++;
                }
            }
            int size2 = list2.size() - 1;
            if (size2 >= i5) {
                while (true) {
                    list7.remove(size2);
                    if (size2 == i5) {
                        break;
                    }
                    size2--;
                }
            }
        }
        HashSet hashSet = new HashSet();
        if (!list.isEmpty()) {
            int size3 = list.size();
            for (int i7 = 0; i7 < size3; i7++) {
                hashSet.add(list6.get(i7).f75398b.getUid());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.ugc.aweme.user.repository.l next : list2) {
            if (hashSet.add(next.f75398b.getUid())) {
                arrayList.add(next);
            }
        }
        list2.clear();
        list7.addAll(arrayList);
        ArrayList arrayList2 = new ArrayList();
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (a2.l() == 1) {
            int size4 = list2.size();
            if (1 <= i4 && size4 >= i4) {
                i3 = 3;
                z5 = true;
                h hVar = new h(2, recommendUserType, true, i2, false);
                arrayList2.add(hVar);
                list5 = list7;
            } else {
                z5 = true;
                i3 = 3;
                list5 = CollectionsKt.emptyList();
            }
            Collection arrayList3 = new ArrayList();
            int i8 = 0;
            for (Object next2 : list5) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (i8 < i4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    arrayList3.add(next2);
                }
                i8 = i9;
            }
            for (com.ss.android.ugc.aweme.user.repository.l lVar : (List) arrayList3) {
                lVar.f75398b.setNewRecommend(z5);
                lVar.f75400d = RecommendListWidgetAdapter.a.a();
                arrayList2.add(lVar);
            }
            if (list6.isEmpty() ^ z5) {
                h hVar2 = new h(4, recommendUserType, true, i2, true);
                arrayList2.add(hVar2);
            } else {
                list6 = CollectionsKt.emptyList();
            }
            Collection arrayList4 = new ArrayList();
            int i10 = 0;
            for (Object next3 : list6) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (i10 < i3) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    arrayList4.add(next3);
                }
                i10 = i11;
            }
            for (com.ss.android.ugc.aweme.user.repository.l lVar2 : (List) arrayList4) {
                lVar2.f75400d = 0;
                arrayList2.add(lVar2);
            }
            z = false;
        } else {
            z = false;
            if (!list6.isEmpty()) {
                h hVar3 = new h(4, recommendUserType, true, i2, true);
                arrayList2.add(hVar3);
            } else {
                list6 = CollectionsKt.emptyList();
            }
            Collection arrayList5 = new ArrayList();
            int i12 = 0;
            for (Object next4 : list6) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (i12 < 3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    arrayList5.add(next4);
                }
                i12 = i13;
            }
            for (com.ss.android.ugc.aweme.user.repository.l lVar3 : (List) arrayList5) {
                lVar3.f75400d = 0;
                arrayList2.add(lVar3);
            }
            int size5 = list2.size();
            if (1 <= i4 && size5 >= i4) {
                h hVar4 = new h(2, recommendUserType, true, i2, false);
                arrayList2.add(hVar4);
                list4 = list7;
            } else {
                list4 = CollectionsKt.emptyList();
            }
            Collection arrayList6 = new ArrayList();
            int i14 = 0;
            for (Object next5 : list4) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (i14 < i4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    arrayList6.add(next5);
                }
                i14 = i15;
            }
            for (com.ss.android.ugc.aweme.user.repository.l lVar4 : (List) arrayList6) {
                lVar4.f75398b.setNewRecommend(true);
                lVar4.f75400d = RecommendListWidgetAdapter.a.a();
                arrayList2.add(lVar4);
            }
        }
        if (i4 != list2.size()) {
            h hVar5 = new h(3, recommendUserType, false, i2, false);
            arrayList2.add(hVar5);
            list3 = list7;
        } else {
            list3 = CollectionsKt.emptyList();
        }
        Collection arrayList7 = new ArrayList();
        int i16 = 0;
        for (Object next6 : list3) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (i16 >= i4 || i4 > list2.size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList7.add(next6);
            }
            i16 = i17;
        }
        for (com.ss.android.ugc.aweme.user.repository.l lVar5 : (List) arrayList7) {
            lVar5.f75400d = RecommendListWidgetAdapter.i;
            arrayList2.add(lVar5);
        }
        List<Object> list8 = arrayList2;
        a(list8, recommendListState2, z);
        return list8;
    }
}
