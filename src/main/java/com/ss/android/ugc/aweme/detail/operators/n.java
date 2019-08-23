package com.ss.android.ugc.aweme.detail.operators;

import android.support.v4.app.Fragment;
import android.view.View;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.widget.Widget;
import com.bytedance.widget.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.detail.operators.s;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainState;
import com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainViewModel;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/operators/DetailHotSpotJediOperator;", "Lcom/ss/android/ugc/aweme/detail/operators/DetailOperateFactory$OnOperator;", "viewModel", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainViewModel;", "(Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainViewModel;)V", "isLoading", "", "jediView", "Lcom/bytedance/jedi/arch/JediView;", "bindView", "", "panel", "Lcom/ss/android/ugc/aweme/detail/panel/DetailFragmentPanel;", "deleteItem", "aid", "", "getPageType", "", "videoType", "init", "owner", "Landroid/support/v4/app/Fragment;", "isDataEmpty", "request", "queryType", "feedParam", "Lcom/ss/android/ugc/aweme/feed/param/FeedParam;", "poiType", "isHashTag", "unInit", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class n implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41241a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f41242b;

    /* renamed from: c  reason: collision with root package name */
    public final HotSpotMainViewModel f41243c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.jedi.arch.h f41244d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class a implements com.bytedance.jedi.arch.ext.list.c<Aweme, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f41245a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f41246b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f41247c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f41248d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f41249e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends Aweme>, Unit> f41250f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f41248d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f41249e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends Aweme>, Unit> c() {
            return this.f41250f;
        }

        public a(Function1 function1, Function2 function2, Function2 function22) {
            this.f41245a = function1;
            this.f41246b = function2;
            this.f41247c = function22;
            this.f41248d = function1;
            this.f41249e = function2;
            this.f41250f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.bytedance.jedi.arch.ext.list.c<Aweme, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f41251a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f41252b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f41253c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f41254d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f41255e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends Aweme>, Unit> f41256f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f41254d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f41255e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends Aweme>, Unit> c() {
            return this.f41256f;
        }

        public b(Function1 function1, Function2 function2, Function2 function22) {
            this.f41251a = function1;
            this.f41252b = function2;
            this.f41253c = function22;
            this.f41254d = function1;
            this.f41255e = function2;
            this.f41256f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/detail/operators/DetailHotSpotJediOperator$bindView$1", "Lcom/bytedance/jedi/arch/ext/list/DiffableAdapter;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mDiffer", "Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "getMDiffer", "()Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "submitList", "", "list", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements com.bytedance.jedi.arch.ext.list.a<Aweme> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41257a;

        public final void a(@Nullable List<? extends Aweme> list) {
        }

        c() {
        }

        @NotNull
        public final com.bytedance.jedi.arch.ext.list.differ.b<Aweme> a() {
            if (!PatchProxy.isSupport(new Object[0], this, f41257a, false, 34786, new Class[0], com.bytedance.jedi.arch.ext.list.differ.b.class)) {
                return new com.bytedance.jedi.arch.ext.list.differ.b<>(new DetailHotSpotJediOperator$bindView$1$mDiffer$1(), new DetailHotSpotJediOperator$bindView$1$mDiffer$2(), null, 4);
            }
            return (com.bytedance.jedi.arch.ext.list.differ.b) PatchProxy.accessDispatch(new Object[0], this, f41257a, false, 34786, new Class[0], com.bytedance.jedi.arch.ext.list.differ.b.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.common.f.c $listView;
        final /* synthetic */ n this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(n nVar, com.ss.android.ugc.aweme.common.f.c cVar) {
            super(1);
            this.this$0 = nVar;
            this.$listView = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            if (PatchProxy.isSupport(new Object[]{fVar}, this, changeQuickRedirect, false, 34795, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar}, this, changeQuickRedirect, false, 34795, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            fVar.a(this.this$0.f41243c, new Function1<HotSpotMainState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ d this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((HotSpotMainState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull HotSpotMainState hotSpotMainState) {
                    HotSpotMainState hotSpotMainState2 = hotSpotMainState;
                    if (PatchProxy.isSupport(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 34796, new Class[]{HotSpotMainState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 34796, new Class[]{HotSpotMainState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(hotSpotMainState2, AdvanceSetting.NETWORK_TYPE);
                    if (hotSpotMainState.getCurAwemeList().getList().isEmpty()) {
                        this.this$0.$listView.n_();
                    }
                }
            });
            this.this$0.f41242b = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "list", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends Aweme>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.common.f.c $listView;
        final /* synthetic */ n this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(n nVar, com.ss.android.ugc.aweme.common.f.c cVar) {
            super(2);
            this.this$0 = nVar;
            this.$listView = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends Aweme> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 34797, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 34797, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, "list");
            fVar.a(this.this$0.f41243c, new Function1<HotSpotMainState, Unit>(this) {
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
                    int i = 0;
                    if (PatchProxy.isSupport(new Object[]{hotSpotMainState}, this, changeQuickRedirect, false, 34798, new Class[]{HotSpotMainState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{hotSpotMainState}, this, changeQuickRedirect, false, 34798, new Class[]{HotSpotMainState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(hotSpotMainState, AdvanceSetting.NETWORK_TYPE);
                    com.bytedance.jedi.arch.ext.list.b bVar = ((com.ss.android.ugc.aweme.discover.hotspot.a.f) hotSpotMainState.getCurAwemeList().getPayload()).f21387a;
                    List list = hotSpotMainState.getCurAwemeList().getList();
                    com.ss.android.ugc.aweme.common.f.c cVar = this.this$0.$listView;
                    if (cVar != null) {
                        com.ss.android.ugc.aweme.discover.hotspot.a aVar = (com.ss.android.ugc.aweme.discover.hotspot.a) cVar;
                        Integer num = (Integer) hotSpotMainState.getLastIndexMap().get(hotSpotMainState.getCurSpotWord());
                        if (num != null) {
                            i = num.intValue();
                        }
                        aVar.s = i;
                        this.this$0.$listView.a(list, bVar.f21351a);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailFragmentPanel");
                }
            });
            this.this$0.f41242b = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "throwable", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.common.f.c $listView;
        final /* synthetic */ n this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(n nVar, com.ss.android.ugc.aweme.common.f.c cVar) {
            super(2);
            this.this$0 = nVar;
            this.$listView = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            Throwable th2;
            if (PatchProxy.isSupport(new Object[]{fVar, th}, this, changeQuickRedirect, false, 34799, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, th}, this, changeQuickRedirect, false, 34799, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            com.ss.android.ugc.aweme.common.f.c cVar = this.$listView;
            if (!(th instanceof Exception)) {
                th2 = null;
            } else {
                th2 = th;
            }
            cVar.b((Exception) th2);
            this.this$0.f41242b = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.common.f.c $listView;
        final /* synthetic */ n this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(n nVar, com.ss.android.ugc.aweme.common.f.c cVar) {
            super(1);
            this.this$0 = nVar;
            this.$listView = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            if (PatchProxy.isSupport(new Object[]{fVar}, this, changeQuickRedirect, false, 34800, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar}, this, changeQuickRedirect, false, 34800, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            this.$listView.s_();
            this.this$0.f41242b = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "list", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends Aweme>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.common.f.c $listView;
        final /* synthetic */ n this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(n nVar, com.ss.android.ugc.aweme.common.f.c cVar) {
            super(2);
            this.this$0 = nVar;
            this.$listView = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends Aweme> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 34801, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 34801, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, "list");
            fVar.a(this.this$0.f41243c, new Function1<HotSpotMainState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ h this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((HotSpotMainState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull HotSpotMainState hotSpotMainState) {
                    int i = 0;
                    if (PatchProxy.isSupport(new Object[]{hotSpotMainState}, this, changeQuickRedirect, false, 34802, new Class[]{HotSpotMainState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{hotSpotMainState}, this, changeQuickRedirect, false, 34802, new Class[]{HotSpotMainState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(hotSpotMainState, AdvanceSetting.NETWORK_TYPE);
                    com.bytedance.jedi.arch.ext.list.b bVar = ((com.ss.android.ugc.aweme.discover.hotspot.a.f) hotSpotMainState.getCurAwemeList().getPayload()).f21387a;
                    List list = hotSpotMainState.getCurAwemeList().getList();
                    com.ss.android.ugc.aweme.common.f.c cVar = this.this$0.$listView;
                    if (cVar != null) {
                        com.ss.android.ugc.aweme.discover.hotspot.a aVar = (com.ss.android.ugc.aweme.discover.hotspot.a) cVar;
                        Integer num = (Integer) hotSpotMainState.getLastIndexMap().get(hotSpotMainState.getCurSpotWord());
                        if (num != null) {
                            i = num.intValue();
                        }
                        aVar.s = i;
                        com.ss.android.ugc.aweme.discover.hotspot.a aVar2 = (com.ss.android.ugc.aweme.discover.hotspot.a) this.this$0.$listView;
                        if (list != null) {
                            aVar2.b(list, bVar.f21351a);
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.feed.model.Aweme>");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailFragmentPanel");
                }
            });
            this.this$0.f41242b = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "throwable", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.common.f.c $listView;
        final /* synthetic */ n this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(n nVar, com.ss.android.ugc.aweme.common.f.c cVar) {
            super(2);
            this.this$0 = nVar;
            this.$listView = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            Throwable th2;
            if (PatchProxy.isSupport(new Object[]{fVar, th}, this, changeQuickRedirect, false, 34803, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, th}, this, changeQuickRedirect, false, 34803, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            com.ss.android.ugc.aweme.common.f.c cVar = this.$listView;
            if (!(th instanceof Exception)) {
                th2 = null;
            } else {
                th2 = th;
            }
            cVar.c((Exception) th2);
            this.this$0.f41242b = false;
        }
    }

    public final int a(int i2) {
        return 9;
    }

    public final boolean a() {
        return false;
    }

    public final boolean a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f41241a, false, 34785, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f41241a, false, 34785, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "aid");
        return false;
    }

    public final void c() {
    }

    public final boolean b() {
        return this.f41242b;
    }

    public n(@Nullable HotSpotMainViewModel hotSpotMainViewModel) {
        this.f41243c = hotSpotMainViewModel;
    }

    public final boolean a(@NotNull Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{fragment}, this, f41241a, false, 34782, new Class[]{Fragment.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fragment}, this, f41241a, false, 34782, new Class[]{Fragment.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(fragment, "owner");
        if (this.f41243c == null) {
            return false;
        }
        this.f41244d = new JediWidget();
        a.C0242a aVar = com.bytedance.widget.a.f22910e;
        View view = fragment.getView();
        if (view == null) {
            Intrinsics.throwNpe();
        }
        com.bytedance.widget.a a2 = aVar.a(fragment, view);
        com.bytedance.jedi.arch.h hVar = this.f41244d;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jediView");
        }
        if (hVar != null) {
            a2.a((Widget) hVar);
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.widget.Widget");
    }

    public final void a(@NotNull DetailFragmentPanel detailFragmentPanel) {
        DetailFragmentPanel detailFragmentPanel2 = detailFragmentPanel;
        if (PatchProxy.isSupport(new Object[]{detailFragmentPanel2}, this, f41241a, false, 34783, new Class[]{DetailFragmentPanel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{detailFragmentPanel2}, this, f41241a, false, 34783, new Class[]{DetailFragmentPanel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(detailFragmentPanel2, "panel");
        com.ss.android.ugc.aweme.common.f.c cVar = detailFragmentPanel2;
        HotSpotMainViewModel hotSpotMainViewModel = this.f41243c;
        if (hotSpotMainViewModel == null) {
            Intrinsics.throwNpe();
        }
        com.bytedance.jedi.arch.h hVar = this.f41244d;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jediView");
        }
        com.bytedance.jedi.arch.e eVar = hVar;
        com.bytedance.jedi.arch.ext.list.a cVar2 = new c();
        com.bytedance.jedi.arch.ext.list.c aVar = new a(new d(this, cVar), new f(this, cVar), new e(this, cVar));
        com.bytedance.jedi.arch.ext.list.c bVar = new b(new g(this, cVar), new i(this, cVar), new h(this, cVar));
        if (PatchProxy.isSupport(new Object[]{hotSpotMainViewModel, eVar, cVar2, aVar, bVar, null}, null, com.ss.android.ugc.aweme.discover.hotspot.viewmodel.a.f42491a, true, 36628, new Class[]{HotSpotMainViewModel.class, com.bytedance.jedi.arch.e.class, com.bytedance.jedi.arch.ext.list.a.class, com.bytedance.jedi.arch.ext.list.c.class, com.bytedance.jedi.arch.ext.list.c.class, Function2.class}, Void.TYPE)) {
            Object[] objArr = {hotSpotMainViewModel, eVar, cVar2, aVar, bVar, null};
            PatchProxy.accessDispatch(objArr, null, com.ss.android.ugc.aweme.discover.hotspot.viewmodel.a.f42491a, true, 36628, new Class[]{HotSpotMainViewModel.class, com.bytedance.jedi.arch.e.class, com.bytedance.jedi.arch.ext.list.a.class, com.bytedance.jedi.arch.ext.list.c.class, com.bytedance.jedi.arch.ext.list.c.class, Function2.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(hotSpotMainViewModel, "$this$listSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "subscriber");
        Intrinsics.checkParameterIsNotNull(cVar2, "adapter");
        ListMiddleware.a(hotSpotMainViewModel.g, eVar, cVar2, false, eVar.c(), aVar, bVar, null, null, SearchJediMixFeedAdapter.f42517f);
    }

    public final void a(int i2, @NotNull com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        int i4 = i2;
        com.ss.android.ugc.aweme.feed.param.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), bVar2, Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41241a, false, 34784, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), bVar2, Integer.valueOf(i3), Byte.valueOf(z)}, this, f41241a, false, 34784, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "feedParam");
        if (i4 == 1) {
            HotSpotMainViewModel hotSpotMainViewModel = this.f41243c;
            if (hotSpotMainViewModel == null) {
                Intrinsics.throwNpe();
            }
            if (PatchProxy.isSupport(new Object[]{hotSpotMainViewModel}, null, com.ss.android.ugc.aweme.discover.hotspot.viewmodel.a.f42491a, true, 36625, new Class[]{HotSpotMainViewModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hotSpotMainViewModel}, null, com.ss.android.ugc.aweme.discover.hotspot.viewmodel.a.f42491a, true, 36625, new Class[]{HotSpotMainViewModel.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(hotSpotMainViewModel, "$this$listRefresh");
            hotSpotMainViewModel.g.refresh();
        } else if (i4 == 4) {
            HotSpotMainViewModel hotSpotMainViewModel2 = this.f41243c;
            if (hotSpotMainViewModel2 == null) {
                Intrinsics.throwNpe();
            }
            if (PatchProxy.isSupport(new Object[]{hotSpotMainViewModel2}, null, com.ss.android.ugc.aweme.discover.hotspot.viewmodel.a.f42491a, true, 36624, new Class[]{HotSpotMainViewModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hotSpotMainViewModel2}, null, com.ss.android.ugc.aweme.discover.hotspot.viewmodel.a.f42491a, true, 36624, new Class[]{HotSpotMainViewModel.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(hotSpotMainViewModel2, "$this$listLoadMore");
                hotSpotMainViewModel2.g.loadMore();
            }
        }
    }
}
