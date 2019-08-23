package com.ss.android.ugc.aweme.detail.operators;

import android.support.v4.app.Fragment;
import android.view.View;
import com.bytedance.widget.Widget;
import com.bytedance.widget.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.detail.operators.s;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.discover.jedi.adapter.Differ;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/operators/DetailJediOperator;", "Lcom/ss/android/ugc/aweme/detail/operators/DetailOperateFactory$OnOperator;", "viewModel", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchJediViewModel;", "(Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchJediViewModel;)V", "isLoading", "", "jediView", "Lcom/bytedance/jedi/arch/JediView;", "bindView", "", "panel", "Lcom/ss/android/ugc/aweme/detail/panel/DetailFragmentPanel;", "deleteItem", "aid", "", "getPageType", "", "videoType", "init", "owner", "Landroid/support/v4/app/Fragment;", "isDataEmpty", "request", "queryType", "feedParam", "Lcom/ss/android/ugc/aweme/feed/param/FeedParam;", "poiType", "isHashTag", "unInit", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class o implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41258a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f41259b;

    /* renamed from: c  reason: collision with root package name */
    public final SearchJediViewModel f41260c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.jedi.arch.h f41261d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0002H\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "RECEIVER", "invoke", "(Ljava/lang/Object;)V", "com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$1"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(1);
        }

        public final void invoke(com.bytedance.jedi.arch.f fVar) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0002H\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "RECEIVER", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$2"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        public b() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar, th2}, this, changeQuickRedirect, false, 34808, new Class[]{Object.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, th2}, this, changeQuickRedirect, false, 34808, new Class[]{Object.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class c implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.discover.mixfeed.a, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f41262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f41263b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f41264c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f41265d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f41266e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, Unit> f41267f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f41265d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f41266e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, Unit> c() {
            return this.f41267f;
        }

        public c(Function1 function1, Function2 function2, Function2 function22) {
            this.f41262a = function1;
            this.f41263b = function2;
            this.f41264c = function22;
            this.f41265d = function1;
            this.f41266e = function2;
            this.f41267f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class d implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.discover.mixfeed.a, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f41268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f41269b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f41270c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f41271d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f41272e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, Unit> f41273f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f41271d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f41272e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, Unit> c() {
            return this.f41273f;
        }

        public d(Function1 function1, Function2 function2, Function2 function22) {
            this.f41268a = function1;
            this.f41269b = function2;
            this.f41270c = function22;
            this.f41271d = function1;
            this.f41272e = function2;
            this.f41273f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/detail/operators/DetailJediOperator$bindView$1", "Lcom/bytedance/jedi/arch/ext/list/DiffableAdapter;", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "mDiffer", "Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "getMDiffer", "()Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "submitList", "", "list", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements com.bytedance.jedi.arch.ext.list.a<com.ss.android.ugc.aweme.discover.mixfeed.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41274a;

        public final void a(@Nullable List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a> list) {
        }

        e() {
        }

        @NotNull
        public final com.bytedance.jedi.arch.ext.list.differ.b<com.ss.android.ugc.aweme.discover.mixfeed.a> a() {
            if (!PatchProxy.isSupport(new Object[0], this, f41274a, false, 34809, new Class[0], com.bytedance.jedi.arch.ext.list.differ.b.class)) {
                return new com.bytedance.jedi.arch.ext.list.differ.b<>(new DetailJediOperator$bindView$1$mDiffer$1(), new Differ(), null, 4);
            }
            return (com.bytedance.jedi.arch.ext.list.differ.b) PatchProxy.accessDispatch(new Object[0], this, f41274a, false, 34809, new Class[0], com.bytedance.jedi.arch.ext.list.differ.b.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "list", "", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.common.f.c $listView;
        final /* synthetic */ o this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(o oVar, com.ss.android.ugc.aweme.common.f.c cVar) {
            super(2);
            this.this$0 = oVar;
            this.$listView = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 34815, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 34815, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, "list");
            fVar.a(this.this$0.f41260c, new Function1<SearchState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ f this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SearchState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull SearchState searchState) {
                    boolean z;
                    SearchState searchState2 = searchState;
                    if (PatchProxy.isSupport(new Object[]{searchState2}, this, changeQuickRedirect, false, 34816, new Class[]{SearchState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{searchState2}, this, changeQuickRedirect, false, 34816, new Class[]{SearchState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(searchState2, AdvanceSetting.NETWORK_TYPE);
                    com.bytedance.jedi.arch.ext.list.b bVar = ((com.ss.android.ugc.aweme.discover.jedi.viewmodel.e) searchState.getListState().getPayload()).f21387a;
                    Collection arrayList = new ArrayList();
                    for (Object next : searchState.getListState().getList()) {
                        if (((com.ss.android.ugc.aweme.discover.mixfeed.a) next).getFeedType() == 65280) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    Iterable<com.ss.android.ugc.aweme.discover.mixfeed.a> iterable = (List) arrayList;
                    Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (com.ss.android.ugc.aweme.discover.mixfeed.a aweme : iterable) {
                        arrayList2.add(aweme.getAweme());
                    }
                    this.this$0.$listView.a((List) arrayList2, bVar.f21351a);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.common.f.c $listView;
        final /* synthetic */ o this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(o oVar, com.ss.android.ugc.aweme.common.f.c cVar) {
            super(1);
            this.this$0 = oVar;
            this.$listView = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            if (PatchProxy.isSupport(new Object[]{fVar}, this, changeQuickRedirect, false, 34817, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar}, this, changeQuickRedirect, false, 34817, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            this.$listView.s_();
            this.this$0.f41259b = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "list", "", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.common.f.c $listView;
        final /* synthetic */ o this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(o oVar, com.ss.android.ugc.aweme.common.f.c cVar) {
            super(2);
            this.this$0 = oVar;
            this.$listView = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 34818, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 34818, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, "list");
            SearchJediViewModel searchJediViewModel = this.this$0.f41260c;
            if (searchJediViewModel == null) {
                Intrinsics.throwNpe();
            }
            fVar.a(searchJediViewModel, new Function1<SearchState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ h this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SearchState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull SearchState searchState) {
                    boolean z;
                    SearchState searchState2 = searchState;
                    if (PatchProxy.isSupport(new Object[]{searchState2}, this, changeQuickRedirect, false, 34819, new Class[]{SearchState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{searchState2}, this, changeQuickRedirect, false, 34819, new Class[]{SearchState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(searchState2, AdvanceSetting.NETWORK_TYPE);
                    com.bytedance.jedi.arch.ext.list.b bVar = ((com.ss.android.ugc.aweme.discover.jedi.viewmodel.e) searchState.getListState().getPayload()).f21387a;
                    Collection arrayList = new ArrayList();
                    for (Object next : searchState.getListState().getList()) {
                        if (((com.ss.android.ugc.aweme.discover.mixfeed.a) next).getFeedType() == 65280) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    Iterable<com.ss.android.ugc.aweme.discover.mixfeed.a> iterable = (List) arrayList;
                    Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (com.ss.android.ugc.aweme.discover.mixfeed.a aweme : iterable) {
                        arrayList2.add(aweme.getAweme());
                    }
                    this.this$0.$listView.b((List) arrayList2, bVar.f21351a);
                }
            });
            this.this$0.f41259b = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "throwable", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.common.f.c $listView;
        final /* synthetic */ o this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(o oVar, com.ss.android.ugc.aweme.common.f.c cVar) {
            super(2);
            this.this$0 = oVar;
            this.$listView = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            if (PatchProxy.isSupport(new Object[]{fVar, th}, this, changeQuickRedirect, false, 34820, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, th}, this, changeQuickRedirect, false, 34820, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            this.$listView.c(new Exception(th));
            this.this$0.f41259b = false;
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
        if (PatchProxy.isSupport(new Object[]{str2}, this, f41258a, false, 34807, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f41258a, false, 34807, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "aid");
        return false;
    }

    public final void c() {
    }

    public final boolean b() {
        return this.f41259b;
    }

    public o(@Nullable SearchJediViewModel searchJediViewModel) {
        this.f41260c = searchJediViewModel;
    }

    public final boolean a(@NotNull Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{fragment}, this, f41258a, false, 34804, new Class[]{Fragment.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fragment}, this, f41258a, false, 34804, new Class[]{Fragment.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(fragment, "owner");
        if (this.f41260c == null) {
            return false;
        }
        this.f41261d = new JediWidget();
        a.C0242a aVar = com.bytedance.widget.a.f22910e;
        View view = fragment.getView();
        if (view == null) {
            Intrinsics.throwNpe();
        }
        com.bytedance.widget.a a2 = aVar.a(fragment, view);
        com.bytedance.jedi.arch.h hVar = this.f41261d;
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
        if (PatchProxy.isSupport(new Object[]{detailFragmentPanel}, this, f41258a, false, 34805, new Class[]{DetailFragmentPanel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{detailFragmentPanel}, this, f41258a, false, 34805, new Class[]{DetailFragmentPanel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(detailFragmentPanel, "panel");
        com.ss.android.ugc.aweme.common.f.c cVar = detailFragmentPanel;
        SearchJediViewModel searchJediViewModel = this.f41260c;
        if (searchJediViewModel == null) {
            Intrinsics.throwNpe();
        }
        com.bytedance.jedi.arch.h hVar = this.f41261d;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jediView");
        }
        com.ss.android.ugc.aweme.discover.jedi.viewmodel.b.a(searchJediViewModel, hVar, new e(), new c(a.INSTANCE, b.INSTANCE, new f(this, cVar)), new d(new g(this, cVar), new i(this, cVar), new h(this, cVar)), null);
    }

    public final void a(int i2, @NotNull com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        int i4 = i2;
        com.ss.android.ugc.aweme.feed.param.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), bVar2, Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41258a, false, 34806, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), bVar2, Integer.valueOf(i3), Byte.valueOf(z)}, this, f41258a, false, 34806, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "feedParam");
        if (i4 == 1) {
            SearchJediViewModel searchJediViewModel = this.f41260c;
            if (searchJediViewModel == null) {
                Intrinsics.throwNpe();
            }
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.b.b(searchJediViewModel);
        } else if (i4 == 4) {
            SearchJediViewModel searchJediViewModel2 = this.f41260c;
            if (searchJediViewModel2 == null) {
                Intrinsics.throwNpe();
            }
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.b.a(searchJediViewModel2);
        }
    }
}
