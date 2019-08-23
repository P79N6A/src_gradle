package com.ss.android.ugc.aweme.filter;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.google.common.collect.ay;
import com.google.common.collect.bd;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.filter.FilterBoxView;
import com.ss.android.ugc.aweme.filter.r;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.es;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 E2\u00020\u0001:\u0001EB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u0002012\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020.\u0018\u000103H\u0002J\u0006\u00104\u001a\u00020.J\u0006\u00105\u001a\u00020.J\u0018\u00106\u001a\u00020.2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020908H\u0002J\u0018\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020<2\u0006\u00100\u001a\u000201H\u0016J\u0018\u0010=\u001a\u00020.2\u0006\u0010;\u001a\u00020<2\u0006\u00100\u001a\u000201H\u0016J\u0018\u0010>\u001a\u00020.2\u0006\u0010;\u001a\u00020<2\u0006\u00100\u001a\u000201H\u0016J\b\u0010?\u001a\u00020.H\u0002J\u0006\u0010@\u001a\u00020$J\u0010\u0010A\u001a\u00020.2\u0006\u00100\u001a\u00020BH\u0002J\u0006\u0010C\u001a\u00020.J\b\u0010D\u001a\u00020.H\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X.¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006F"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBox;", "Lcom/ss/android/ugc/aweme/filter/FilterBoxView$OnItemChangeCallback;", "dependency", "Lcom/ss/android/ugc/aweme/filter/FilterBoxDependency;", "activity", "Landroid/support/v7/app/AppCompatActivity;", "root", "Landroid/widget/FrameLayout;", "(Lcom/ss/android/ugc/aweme/filter/FilterBoxDependency;Landroid/support/v7/app/AppCompatActivity;Landroid/widget/FrameLayout;)V", "getActivity", "()Landroid/support/v7/app/AppCompatActivity;", "api", "Lcom/ss/android/ugc/aweme/filter/FilterBoxApi;", "getApi", "()Lcom/ss/android/ugc/aweme/filter/FilterBoxApi;", "api$delegate", "Lkotlin/Lazy;", "chooseFilterTransition", "Lcom/ss/android/ugc/aweme/filter/ChooseFilterTransition;", "getDependency", "()Lcom/ss/android/ugc/aweme/filter/FilterBoxDependency;", "disposable", "Lio/reactivex/disposables/Disposable;", "filterBoxView", "Lcom/ss/android/ugc/aweme/filter/FilterBoxView;", "filterBoxViewContainer", "Landroid/view/View;", "mCurrentFilterId", "", "mFilterBoxShow", "", "getMFilterBoxShow", "()Z", "setMFilterBoxShow", "(Z)V", "patch", "Lcom/ss/android/ugc/aweme/filter/FilterBoxPatch;", "getRoot", "()Landroid/widget/FrameLayout;", "transitionListener", "Lcom/ss/android/ugc/aweme/photomovie/transition/TransitionListener;", "getTransitionListener", "()Lcom/ss/android/ugc/aweme/photomovie/transition/TransitionListener;", "setTransitionListener", "(Lcom/ss/android/ugc/aweme/photomovie/transition/TransitionListener;)V", "download", "", "isHighPriority", "filter", "Lcom/ss/android/ugc/aweme/filter/FilterBoxFilterBean;", "action", "Lkotlin/Function0;", "hide", "hideWithTransition", "initView", "listFilterBox", "Lio/reactivex/Single;", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectChannelModel;", "onBuiltinItemClicked", "category", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "onItemInserted", "onItemRemoved", "refreshFilterBox", "retrievePatch", "selectFilter", "Lcom/ss/android/ugc/aweme/filter/FilterBean;", "show", "updateFilterBox", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i implements FilterBoxView.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47603a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f47604b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(i.class), "api", "getApi()Lcom/ss/android/ugc/aweme/filter/FilterBoxApi;"))};
    public static final a n = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public boolean f47605c;

    /* renamed from: d  reason: collision with root package name */
    View f47606d;

    /* renamed from: e  reason: collision with root package name */
    public FilterBoxView f47607e;

    /* renamed from: f  reason: collision with root package name */
    b f47608f;
    public t g;
    public int h = -1;
    @Nullable
    public com.ss.android.ugc.aweme.photomovie.transition.f i;
    Disposable j;
    @NotNull
    public final j k;
    @NotNull
    public final AppCompatActivity l;
    @NotNull
    public final FrameLayout m;
    private final Lazy o = LazyKt.lazy(b.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBox$Companion;", "", "()V", "ENTER_METHOD_FILTER_BOX", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/filter/FilterBoxApi;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<FilterBoxApi> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        public final FilterBoxApi invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44095, new Class[0], FilterBoxApi.class)) {
                return (FilterBoxApi) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44095, new Class[0], FilterBoxApi.class);
            }
            Host host = EffectPlatform.f3093c.get(0);
            Intrinsics.checkExpressionValueIsNotNull(host, "EffectPlatform.HOST[0]");
            return (FilterBoxApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(host.getItemName()).create(FilterBoxApi.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J9\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000b\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/ugc/aweme/filter/FilterBox$download$1", "Lcom/ss/android/ugc/aweme/effect/persistence/callback/ISerialTaskCallback;", "Lcom/ss/android/ugc/aweme/filter/FilterBean;", "Ljava/lang/Void;", "onFailed", "", "param", "code", "", "msg", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lcom/ss/android/ugc/aweme/filter/FilterBean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Exception;)V", "onStart", "onSuccess", "result", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements com.ss.android.ugc.aweme.effect.c.a.a<h, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47611a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f47612b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/ugc/aweme/filter/FilterBox$download$1$onSuccess$1$1"}, k = 3, mv = {1, 1, 15})
        static final class a extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            public final void invoke() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44099, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44099, new Class[0], Void.TYPE);
                    return;
                }
                this.this$0.f47612b.invoke();
            }
        }

        c(Function0 function0) {
            this.f47612b = function0;
        }

        public final /* synthetic */ void a(Object obj) {
            h hVar = (h) obj;
            if (PatchProxy.isSupport(new Object[]{hVar}, this, f47611a, false, 44096, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar}, this, f47611a, false, 44096, new Class[]{h.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(hVar, "param");
        }

        public final /* synthetic */ void a(Object obj, Object obj2) {
            h hVar = (h) obj;
            Void voidR = (Void) obj2;
            if (PatchProxy.isSupport(new Object[]{hVar, voidR}, this, f47611a, false, 44097, new Class[]{h.class, Void.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar, voidR}, this, f47611a, false, 44097, new Class[]{h.class, Void.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(hVar, "param");
            if (this.f47612b != null) {
                Function0 aVar = new a(this);
                if (PatchProxy.isSupport(new Object[]{aVar}, null, p.f47640a, true, 44127, new Class[]{Function0.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, null, p.f47640a, true, 44127, new Class[]{Function0.class}, Void.TYPE);
                    return;
                }
                com.ss.android.b.a.a.a.b(new q(aVar));
            }
        }

        public final /* synthetic */ void a(Object obj, Integer num, String str, Exception exc) {
            h hVar = (h) obj;
            if (PatchProxy.isSupport(new Object[]{hVar, num, str, exc}, this, f47611a, false, 44098, new Class[]{h.class, Integer.class, String.class, Exception.class}, Void.TYPE)) {
                Object[] objArr = {hVar, num, str, exc};
                PatchProxy.accessDispatch(objArr, this, f47611a, false, 44098, new Class[]{h.class, Integer.class, String.class, Exception.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(hVar, "param");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/filter/FilterBox$hide$1", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/transition/EmptyTransition;", "onHidePre", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends com.ss.android.ugc.aweme.shortvideo.sticker.c.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47613a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f47614b;

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f47613a, false, 44100, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f47613a, false, 44100, new Class[0], Void.TYPE);
                return;
            }
            super.c();
            i.a(this.f47614b).setCategoryMap(this.f47614b.k.d());
            com.ss.android.ugc.aweme.photomovie.transition.f fVar = this.f47614b.i;
            if (fVar != null) {
                fVar.c();
            }
        }

        d(i iVar) {
            this.f47614b = iVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47615a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f47616b;

        e(i iVar) {
            this.f47616b = iVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f47615a, false, 44101, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f47615a, false, 44101, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f47616b.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectChannelModel;", "kotlin.jvm.PlatformType", "it", "Lcom/ss/android/ugc/aweme/filter/FilterBoxEffectNetListResponse;", "apply"}, k = 3, mv = {1, 1, 15})
    static final class f<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47617a;

        /* renamed from: b  reason: collision with root package name */
        public static final f f47618b = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            m mVar = (m) obj;
            if (PatchProxy.isSupport(new Object[]{mVar}, this, f47617a, false, 44102, new Class[]{m.class}, EffectChannelModel.class)) {
                return (EffectChannelModel) PatchProxy.accessDispatch(new Object[]{mVar}, this, f47617a, false, 44102, new Class[]{m.class}, EffectChannelModel.class);
            }
            Intrinsics.checkParameterIsNotNull(mVar, AdvanceSetting.NETWORK_TYPE);
            return mVar.data;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ o $filter;
        final /* synthetic */ i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(i iVar, o oVar) {
            super(0);
            this.this$0 = iVar;
            this.$filter = oVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44103, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44103, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.a((h) this.$filter);
            r.f47643b.a(this.$filter, i.b(this.this$0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ EffectCategoryModel $category;
        final /* synthetic */ o $filter;
        final /* synthetic */ i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(i iVar, EffectCategoryModel effectCategoryModel, o oVar) {
            super(0);
            this.this$0 = iVar;
            this.$category = effectCategoryModel;
            this.$filter = oVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44104, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44104, new Class[0], Void.TYPE);
                return;
            }
            i.b(this.this$0).a(this.$category, this.$filter);
            this.this$0.a((h) this.$filter);
            r.f47643b.a(this.$filter, i.b(this.this$0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<no name provided>", "Lcom/google/common/collect/ListMultimap;", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "response", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectChannelModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.filter.i$i  reason: collision with other inner class name */
    static final class C0569i<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47619a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f47620b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.filter.i$i$a */
        public static final class a<T> implements Comparator<T> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47621a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ EffectCategoryModel f47622b;

            public a(EffectCategoryModel effectCategoryModel) {
                this.f47622b = effectCategoryModel;
            }

            public final int compare(T t, T t2) {
                if (PatchProxy.isSupport(new Object[]{t, t2}, this, f47621a, false, 44106, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{t, t2}, this, f47621a, false, 44106, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
                }
                Effect effect = (Effect) t;
                EffectCategoryModel effectCategoryModel = this.f47622b;
                Intrinsics.checkExpressionValueIsNotNull(effectCategoryModel, "category");
                List<String> list = effectCategoryModel.effects;
                Intrinsics.checkExpressionValueIsNotNull(effect, AdvanceSetting.NETWORK_TYPE);
                Effect effect2 = (Effect) t2;
                EffectCategoryModel effectCategoryModel2 = this.f47622b;
                Intrinsics.checkExpressionValueIsNotNull(effectCategoryModel2, "category");
                List<String> list2 = effectCategoryModel2.effects;
                Intrinsics.checkExpressionValueIsNotNull(effect2, AdvanceSetting.NETWORK_TYPE);
                return ComparisonsKt.compareValues(Integer.valueOf(list.indexOf(effect.effect_id)), Integer.valueOf(list2.indexOf(effect2.effect_id)));
            }
        }

        C0569i(i iVar) {
            this.f47620b = iVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            EffectChannelModel effectChannelModel = (EffectChannelModel) obj;
            if (PatchProxy.isSupport(new Object[]{effectChannelModel}, this, f47619a, false, 44105, new Class[]{EffectChannelModel.class}, ay.class)) {
                return (ay) PatchProxy.accessDispatch(new Object[]{effectChannelModel}, this, f47619a, false, 44105, new Class[]{EffectChannelModel.class}, ay.class);
            }
            Intrinsics.checkParameterIsNotNull(effectChannelModel, "response");
            ay d2 = this.f47620b.k.d();
            List<EffectCategoryModel> list = effectChannelModel.category;
            Intrinsics.checkExpressionValueIsNotNull(list, "response.category");
            for (EffectCategoryModel effectCategoryModel : list) {
                List<Effect> list2 = effectChannelModel.effects;
                Intrinsics.checkExpressionValueIsNotNull(list2, "response.effects");
                Collection arrayList = new ArrayList();
                for (Object next : list2) {
                    Effect effect = (Effect) next;
                    Intrinsics.checkExpressionValueIsNotNull(effectCategoryModel, "category");
                    List<String> list3 = effectCategoryModel.effects;
                    Intrinsics.checkExpressionValueIsNotNull(effect, AdvanceSetting.NETWORK_TYPE);
                    if (list3.contains(effect.effect_id)) {
                        arrayList.add(next);
                    }
                }
                d2.putAll(effectCategoryModel, CollectionsKt.sortedWith((List) arrayList, new a(effectCategoryModel)));
            }
            return d2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/google/common/collect/ListMultimap;", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "Lcom/ss/android/ugc/aweme/filter/FilterBoxFilterBean;", "data", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "apply"}, k = 3, mv = {1, 1, 15})
    static final class j<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47623a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f47624b;

        j(i iVar) {
            this.f47624b = iVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            o oVar;
            String str;
            ay ayVar = (ay) obj;
            if (PatchProxy.isSupport(new Object[]{ayVar}, this, f47623a, false, 44107, new Class[]{ay.class}, ay.class)) {
                return (ay) PatchProxy.accessDispatch(new Object[]{ayVar}, this, f47623a, false, 44107, new Class[]{ay.class}, ay.class);
            }
            Intrinsics.checkParameterIsNotNull(ayVar, "data");
            ay d2 = this.f47624b.k.d();
            Collection<Map.Entry> entries = ayVar.entries();
            Intrinsics.checkExpressionValueIsNotNull(entries, "data.entries()");
            for (Map.Entry entry : entries) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    com.ss.android.ugc.aweme.effectplatform.e eVar = (com.ss.android.ugc.aweme.effectplatform.e) value;
                    if (PatchProxy.isSupport(new Object[]{eVar}, null, com.ss.android.ugc.aweme.effectplatform.f.f43848a, true, 38989, new Class[]{com.ss.android.ugc.aweme.effectplatform.e.class}, o.class)) {
                        oVar = (o) PatchProxy.accessDispatch(new Object[]{eVar}, null, com.ss.android.ugc.aweme.effectplatform.f.f43848a, true, 38989, new Class[]{com.ss.android.ugc.aweme.effectplatform.e.class}, o.class);
                    } else {
                        Intrinsics.checkParameterIsNotNull(eVar, "$this$toFilterBean");
                        o oVar2 = new o();
                        oVar2.f47599c = eVar.name;
                        oVar2.f47600d = w.a((Effect) eVar);
                        oVar2.f47598b = Integer.parseInt(eVar.effect_id);
                        UrlModel urlModel = eVar.icon_url;
                        Intrinsics.checkExpressionValueIsNotNull(urlModel, "filterEffect.iconUrl");
                        List<String> list = urlModel.url_list;
                        if (list != null) {
                            str = list.get(0);
                        } else {
                            str = null;
                        }
                        oVar2.g = Uri.parse(str);
                        oVar2.f47601e = es.a(com.ss.android.ugc.aweme.effectplatform.a.a(eVar.file_url));
                        oVar2.k = eVar.getTags();
                        oVar2.l = eVar.f43845b;
                        oVar2.m = eVar.f43846c;
                        oVar = oVar2;
                    }
                    Object key2 = entry.getKey();
                    Intrinsics.checkExpressionValueIsNotNull(key2, "it.key");
                    oVar.n = ((EffectCategoryModel) key2).name;
                    d2.put(key, oVar);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.effectplatform.FilterEffect");
                }
            }
            return d2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/google/common/collect/ListMultimap;", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "Lcom/ss/android/ugc/aweme/filter/FilterBoxFilterBean;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class k<T> implements Consumer<ay<EffectCategoryModel, o>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47625a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f47626b;

        k(i iVar) {
            this.f47626b = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            ay ayVar = (ay) obj;
            if (PatchProxy.isSupport(new Object[]{ayVar}, this, f47625a, false, 44108, new Class[]{ay.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{ayVar}, this, f47625a, false, 44108, new Class[]{ay.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(ayVar, "data");
            if (ayVar.isEmpty()) {
                i.a(this.f47626b).setState(3);
                return;
            }
            i.a(this.f47626b).setState(0);
            i.a(this.f47626b).setCategoryMap(ayVar);
            i.a(this.f47626b).setCallback(this.f47626b);
            t b2 = i.b(this.f47626b);
            bd<EffectCategoryModel, o> bdVar = ayVar;
            if (PatchProxy.isSupport(new Object[]{bdVar}, b2, t.f47649a, false, 44152, new Class[]{bd.class}, Void.TYPE)) {
                t tVar = b2;
                PatchProxy.accessDispatch(new Object[]{bdVar}, tVar, t.f47649a, false, 44152, new Class[]{bd.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bdVar, "<set-?>");
            b2.f47650b = bdVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class l<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47627a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f47628b;

        l(i iVar) {
            this.f47628b = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (PatchProxy.isSupport(new Object[]{th}, this, f47627a, false, 44109, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f47627a, false, 44109, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            i.a(this.f47628b).setState(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/filter/FilterBox$show$1", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/transition/EmptyTransition;", "onShowPre", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class m extends com.ss.android.ugc.aweme.shortvideo.sticker.c.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47629a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f47630b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f47629a, false, 44110, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f47629a, false, 44110, new Class[0], Void.TYPE);
                return;
            }
            super.a();
            i.a(this.f47630b).setVisibility(0);
            com.ss.android.ugc.aweme.photomovie.transition.f fVar = this.f47630b.i;
            if (fVar != null) {
                fVar.a();
            }
        }

        m(i iVar) {
            this.f47630b = iVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/effectmanager/common/model/BaseNetResponse;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class n<T> implements Consumer<BaseNetResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47631a;

        /* renamed from: b  reason: collision with root package name */
        public static final n f47632b = new n();

        n() {
        }

        public final /* synthetic */ void accept(Object obj) {
            BaseNetResponse baseNetResponse = (BaseNetResponse) obj;
            if (PatchProxy.isSupport(new Object[]{baseNetResponse}, this, f47631a, false, 44111, new Class[]{BaseNetResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{baseNetResponse}, this, f47631a, false, 44111, new Class[]{BaseNetResponse.class}, Void.TYPE);
                return;
            }
            aa.a().g();
        }
    }

    /* access modifiers changed from: package-private */
    public final FilterBoxApi a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f47603a, false, 44080, new Class[0], FilterBoxApi.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f47603a, false, 44080, new Class[0], FilterBoxApi.class);
        } else {
            value = this.o.getValue();
        }
        return (FilterBoxApi) value;
    }

    public final void b() {
        boolean z;
        Set set;
        Single<BaseNetResponse> single;
        Single<BaseNetResponse> single2;
        if (PatchProxy.isSupport(new Object[0], this, f47603a, false, 44085, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47603a, false, 44085, new Class[0], Void.TYPE);
            return;
        }
        b bVar = this.f47608f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chooseFilterTransition");
        }
        bVar.b(new com.ss.android.ugc.aweme.shortvideo.sticker.c.c());
        if (PatchProxy.isSupport(new Object[0], this, f47603a, false, 44083, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47603a, false, 44083, new Class[0], Void.TYPE);
            return;
        }
        b bVar2 = this.f47608f;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chooseFilterTransition");
        }
        bVar2.b(new d(this));
        Disposable disposable = this.j;
        if (disposable != null) {
            disposable.dispose();
        }
        if (PatchProxy.isSupport(new Object[0], this, f47603a, false, 44088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47603a, false, 44088, new Class[0], Void.TYPE);
        } else {
            t tVar = this.g;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("patch");
            }
            if (PatchProxy.isSupport(new Object[0], tVar, t.f47649a, false, 44154, new Class[0], Set.class)) {
                set = (Set) PatchProxy.accessDispatch(new Object[0], tVar, t.f47649a, false, 44154, new Class[0], Set.class);
            } else {
                Collection values = tVar.f47652d.values();
                Intrinsics.checkExpressionValueIsNotNull(values, "removedItems.values()");
                Iterable<o> iterable = values;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (o oVar : iterable) {
                    Intrinsics.checkExpressionValueIsNotNull(oVar, AdvanceSetting.NETWORK_TYPE);
                    arrayList.add(Integer.valueOf(oVar.f47598b));
                }
                set = CollectionsKt.toSet((List) arrayList);
            }
            if (!set.isEmpty()) {
                single = a().updateFilterBox(new bc(set, bb.f47559d, (byte) 0));
            } else {
                single = Single.error((Throwable) new Exception());
                Intrinsics.checkExpressionValueIsNotNull(single, "Single.error(Exception())");
            }
            t tVar2 = this.g;
            if (tVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("patch");
            }
            Set a2 = tVar2.a();
            if (!a2.isEmpty()) {
                single2 = a().updateFilterBox(new bc(a2, bb.f47558c, (byte) 0));
            } else {
                single2 = Single.error((Throwable) new Exception());
                Intrinsics.checkExpressionValueIsNotNull(single2, "Single.error(Exception())");
            }
            PublishSubject create = PublishSubject.create();
            Intrinsics.checkExpressionValueIsNotNull(create, "PublishSubject.create<BaseNetResponse>()");
            create.firstOrError().subscribe(n.f47632b, Functions.emptyConsumer());
            Single.mergeDelayError(single, single2).toObservable().subscribeOn(Schedulers.from(a.i.f1051a)).subscribe((Observer<? super T>) create);
        }
        t tVar3 = this.g;
        if (tVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("patch");
        }
        if (PatchProxy.isSupport(new Object[0], tVar3, t.f47649a, false, 44157, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], tVar3, t.f47649a, false, 44157, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            z = tVar3.f47650b.isEmpty();
        }
        if (!z) {
            an d2 = com.ss.android.ugc.aweme.port.in.a.d();
            t tVar4 = this.g;
            if (tVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("patch");
            }
            d2.a(tVar4);
        }
        this.f47605c = false;
    }

    public static final /* synthetic */ FilterBoxView a(i iVar) {
        FilterBoxView filterBoxView = iVar.f47607e;
        if (filterBoxView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterBoxView");
        }
        return filterBoxView;
    }

    public static final /* synthetic */ t b(i iVar) {
        t tVar = iVar.g;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("patch");
        }
        return tVar;
    }

    public final void a(h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f47603a, false, 44092, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, f47603a, false, 44092, new Class[]{h.class}, Void.TYPE);
            return;
        }
        this.k.a(hVar2);
    }

    public final void b(@NotNull EffectCategoryModel effectCategoryModel, @NotNull o oVar) {
        if (PatchProxy.isSupport(new Object[]{effectCategoryModel, oVar}, this, f47603a, false, 44090, new Class[]{EffectCategoryModel.class, o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectCategoryModel, oVar}, this, f47603a, false, 44090, new Class[]{EffectCategoryModel.class, o.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(effectCategoryModel, "category");
        Intrinsics.checkParameterIsNotNull(oVar, "filter");
        h hVar = oVar;
        if (!w.b(hVar)) {
            a(false, oVar, new h(this, effectCategoryModel, oVar));
            return;
        }
        t tVar = this.g;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("patch");
        }
        tVar.a(effectCategoryModel, oVar);
        a(hVar);
        r.a aVar = r.f47643b;
        t tVar2 = this.g;
        if (tVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("patch");
        }
        aVar.a(oVar, tVar2);
    }

    public final void a(@NotNull EffectCategoryModel effectCategoryModel, @NotNull o oVar) {
        if (PatchProxy.isSupport(new Object[]{effectCategoryModel, oVar}, this, f47603a, false, 44089, new Class[]{EffectCategoryModel.class, o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectCategoryModel, oVar}, this, f47603a, false, 44089, new Class[]{EffectCategoryModel.class, o.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(effectCategoryModel, "category");
        Intrinsics.checkParameterIsNotNull(oVar, "filter");
        h hVar = oVar;
        if (!w.b(hVar)) {
            a(true, oVar, new g(this, oVar));
            return;
        }
        a(hVar);
        r.a aVar = r.f47643b;
        t tVar = this.g;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("patch");
        }
        aVar.a(oVar, tVar);
    }

    public final void c(@NotNull EffectCategoryModel effectCategoryModel, @NotNull o oVar) {
        List list;
        EffectCategoryModel effectCategoryModel2 = effectCategoryModel;
        o oVar2 = oVar;
        if (PatchProxy.isSupport(new Object[]{effectCategoryModel2, oVar2}, this, f47603a, false, 44091, new Class[]{EffectCategoryModel.class, o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectCategoryModel2, oVar2}, this, f47603a, false, 44091, new Class[]{EffectCategoryModel.class, o.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(effectCategoryModel2, "category");
        Intrinsics.checkParameterIsNotNull(oVar2, "filter");
        t tVar = this.g;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("patch");
        }
        if (PatchProxy.isSupport(new Object[]{effectCategoryModel2, oVar2}, tVar, t.f47649a, false, 44156, new Class[]{EffectCategoryModel.class, o.class}, Void.TYPE)) {
            t tVar2 = tVar;
            PatchProxy.accessDispatch(new Object[]{effectCategoryModel2, oVar2}, tVar2, t.f47649a, false, 44156, new Class[]{EffectCategoryModel.class, o.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(effectCategoryModel2, "category");
            Intrinsics.checkParameterIsNotNull(oVar2, "filter");
            tVar.f47652d.put(effectCategoryModel2, oVar2);
            tVar.f47651c.remove(effectCategoryModel2, oVar2);
        }
        r.a aVar = r.f47643b;
        if (PatchProxy.isSupport(new Object[]{oVar2}, aVar, r.a.f47644a, false, 44140, new Class[]{o.class}, Void.TYPE)) {
            r.a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{oVar2}, aVar2, r.a.f47644a, false, 44140, new Class[]{o.class}, Void.TYPE);
        } else if (oVar2 != null) {
            h hVar = oVar2;
            if (w.b(hVar)) {
                an d2 = com.ss.android.ugc.aweme.port.in.a.d();
                Intrinsics.checkExpressionValueIsNotNull(d2, "AVEnv.getFilterSources()");
                MutableLiveData<List<h>> a2 = d2.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AVEnv.getFilterSources().preparedFilterSources");
                List<h> list2 = (List) a2.getValue();
                if (list2 != null) {
                    Intrinsics.checkExpressionValueIsNotNull(list2, "AVEnv.getFilterSources()…erSources.value ?: return");
                    r.a aVar3 = aVar;
                    if (aVar3.a(list2, hVar)) {
                        if (PatchProxy.isSupport(new Object[]{list2, hVar}, aVar3, r.a.f47644a, false, 44141, new Class[]{List.class, h.class}, List.class)) {
                            r.a aVar4 = aVar3;
                            list = (List) PatchProxy.accessDispatch(new Object[]{list2, hVar}, aVar4, r.a.f47644a, false, 44141, new Class[]{List.class, h.class}, List.class);
                        } else {
                            list = new ArrayList();
                            for (h hVar2 : list2) {
                                int i2 = hVar2.f47598b;
                                if (hVar == null || i2 != hVar.f47598b) {
                                    list.add(hVar2);
                                }
                            }
                        }
                        an d3 = com.ss.android.ugc.aweme.port.in.a.d();
                        Intrinsics.checkExpressionValueIsNotNull(d3, "AVEnv.getFilterSources()");
                        MutableLiveData<List<h>> a3 = d3.a();
                        Intrinsics.checkExpressionValueIsNotNull(a3, "AVEnv.getFilterSources().preparedFilterSources");
                        a3.setValue(list);
                    }
                }
            }
        }
        if (this.h == oVar2.f47598b) {
            a(this.k.c());
        }
    }

    public i(@NotNull j jVar, @NotNull AppCompatActivity appCompatActivity, @NotNull FrameLayout frameLayout) {
        Intrinsics.checkParameterIsNotNull(jVar, "dependency");
        Intrinsics.checkParameterIsNotNull(appCompatActivity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(frameLayout, "root");
        this.k = jVar;
        this.l = appCompatActivity;
        this.m = frameLayout;
        int i2 = -1;
        ViewModel viewModel = ViewModelProviders.of((FragmentActivity) this.l).get(FilterViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…terViewModel::class.java)");
        MutableLiveData<h> a2 = ((FilterViewModel) viewModel).a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "curSelectedFilter");
        h hVar = (h) a2.getValue();
        this.h = hVar != null ? hVar.f47598b : i2;
        a2.observe(this.l, new android.arch.lifecycle.Observer<h>(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47609a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ i f47610b;

            {
                this.f47610b = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                h hVar = (h) obj;
                if (PatchProxy.isSupport(new Object[]{hVar}, this, f47609a, false, 44094, new Class[]{h.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{hVar}, this, f47609a, false, 44094, new Class[]{h.class}, Void.TYPE);
                } else if (hVar != null) {
                    i iVar = this.f47610b;
                    Intrinsics.checkExpressionValueIsNotNull(hVar, AdvanceSetting.NETWORK_TYPE);
                    iVar.h = hVar.f47598b;
                }
            }
        });
    }

    private final void a(boolean z, o oVar, Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), oVar, function02}, this, f47603a, false, 44093, new Class[]{Boolean.TYPE, o.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), oVar, function02}, this, f47603a, false, 44093, new Class[]{Boolean.TYPE, o.class, Function0.class}, Void.TYPE);
            return;
        }
        aa.a().a(oVar, z, new c(function02));
    }
}
