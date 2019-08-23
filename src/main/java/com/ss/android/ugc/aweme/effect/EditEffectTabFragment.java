package com.ss.android.ugc.aweme.effect;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.util.DiffUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.EffectDiff;
import com.ss.android.ugc.aweme.effect.a.a.b;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.port.in.y;
import com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import dmt.av.video.VEVideoPublishEditViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000 F2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001FB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001fH\u0002J\b\u0010-\u001a\u00020+H\u0004J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012H\u0016J\u001a\u0010/\u001a\u00020+2\u0006\u00100\u001a\u0002012\b\b\u0001\u00102\u001a\u000201H&J\u0012\u00103\u001a\u00020+2\b\u00104\u001a\u0004\u0018\u000105H\u0016J&\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u0010<\u001a\u00020+H\u0016J\u001e\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020?2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012H&J\u001a\u0010A\u001a\u00020+2\u0006\u0010B\u001a\u0002072\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u000e\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020ER\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\"\u001a\u00020#X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X.¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/EditEffectTabFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/ss/android/ugc/aweme/effect/IEffectTabView;", "Lcom/ss/android/ugc/aweme/effect/download/config/IEffectDownloadCallback;", "()V", "mCategory", "", "getMCategory", "()Ljava/lang/String;", "setMCategory", "(Ljava/lang/String;)V", "mDownloadController", "Lcom/ss/android/ugc/aweme/effect/download/EffectDownloadController;", "getMDownloadController", "()Lcom/ss/android/ugc/aweme/effect/download/EffectDownloadController;", "setMDownloadController", "(Lcom/ss/android/ugc/aweme/effect/download/EffectDownloadController;)V", "mEffectList", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "getMEffectList", "()Ljava/util/List;", "setMEffectList", "(Ljava/util/List;)V", "mEffectPointModelStack", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/effect/EffectPointModel;", "Lkotlin/collections/ArrayList;", "getMEffectPointModelStack", "()Ljava/util/ArrayList;", "mEffectSource", "Lcom/ss/android/ugc/aweme/effect/EffectModel;", "getMEffectSource", "setMEffectSource", "mLinearLayoutManager", "Lcom/ss/android/ugc/aweme/views/WrapLinearLayoutManager;", "getMLinearLayoutManager", "()Lcom/ss/android/ugc/aweme/views/WrapLinearLayoutManager;", "setMLinearLayoutManager", "(Lcom/ss/android/ugc/aweme/views/WrapLinearLayoutManager;)V", "mStatusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "addEffectData", "", "effectModel", "fetchEffect", "getCurrentEffect", "onChangeDownloadState", "position", "", "state", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onEffectDiffResult", "result", "Landroid/support/v7/util/DiffUtil$DiffResult;", "newEffectSource", "onViewCreated", "view", "showLoading", "isShow", "", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class EditEffectTabFragment extends Fragment implements b, k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43505a;
    @NotNull
    public static final Lazy h;
    public static final a i = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f43506b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public List<? extends Effect> f43507c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public WrapLinearLayoutManager f43508d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public List<? extends EffectModel> f43509e = CollectionsKt.emptyList();
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.effect.a.a f43510f;
    @NotNull
    public final ArrayList<EffectPointModel> g = new ArrayList<>();
    private DmtStatusView j;
    private HashMap k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0006\u001a\u00020\u00078FX\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/EditEffectTabFragment$Companion;", "", "()V", "EFFECT_CATEGORY", "", "EFFECT_LIST", "mEffectPlatform", "Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;", "mEffectPlatform$annotations", "getMEffectPlatform", "()Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;", "mEffectPlatform$delegate", "Lkotlin/Lazy;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ KProperty[] f43511a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "mEffectPlatform", "getMEffectPlatform()Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;"))};

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f43505a, false, 38524, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f43505a, false, 38524, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.k == null) {
            this.k = new HashMap();
        }
        View view = (View) this.k.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.k.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public abstract void a(@NotNull DiffUtil.DiffResult diffResult, @NotNull List<? extends EffectModel> list);

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f43505a, false, 38525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43505a, false, 38525, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43505a, false, 38527, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43505a, false, 38527, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f43505a, false, 38529, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43505a, false, 38529, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f43505a, false, 38528, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43505a, false, 38528, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43505a, false, 38530, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43505a, false, 38530, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    @NotNull
    public final List<EffectPointModel> c() {
        return this.g;
    }

    static {
        y yVar = com.ss.android.ugc.aweme.port.in.a.h;
        Intrinsics.checkExpressionValueIsNotNull(yVar, "AVEnv.LOCATION_SERVICE");
        h = LazyKt.lazyOf(new EffectPlatform(com.ss.android.ugc.aweme.port.in.a.f61119b, yVar.c(), com.ss.android.ugc.aweme.port.in.a.D.getOKHttpClient()));
    }

    @NotNull
    public final List<Effect> a() {
        if (PatchProxy.isSupport(new Object[0], this, f43505a, false, 38512, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f43505a, false, 38512, new Class[0], List.class);
        }
        List<? extends Effect> list = this.f43507c;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEffectList");
        }
        return list;
    }

    @NotNull
    public final WrapLinearLayoutManager b() {
        if (PatchProxy.isSupport(new Object[0], this, f43505a, false, 38514, new Class[0], WrapLinearLayoutManager.class)) {
            return (WrapLinearLayoutManager) PatchProxy.accessDispatch(new Object[0], this, f43505a, false, 38514, new Class[0], WrapLinearLayoutManager.class);
        }
        WrapLinearLayoutManager wrapLinearLayoutManager = this.f43508d;
        if (wrapLinearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLinearLayoutManager");
        }
        return wrapLinearLayoutManager;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f43505a, false, 38521, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43505a, false, 38521, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        com.ss.android.ugc.aweme.effect.a.a aVar = this.f43510f;
        if (aVar != null) {
            b bVar = this;
            if (PatchProxy.isSupport(new Object[]{bVar}, aVar, com.ss.android.ugc.aweme.effect.a.a.f43645a, false, 38832, new Class[]{b.class}, Void.TYPE)) {
                Object[] objArr = {bVar};
                com.ss.android.ugc.aweme.effect.a.a aVar2 = aVar;
                PatchProxy.accessDispatch(objArr, aVar2, com.ss.android.ugc.aweme.effect.a.a.f43645a, false, 38832, new Class[]{b.class}, Void.TYPE);
            } else {
                aVar.f43648d.remove(bVar);
            }
        }
    }

    public final void d() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f43505a, false, 38522, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43505a, false, 38522, new Class[0], Void.TYPE);
            return;
        }
        a(true);
        List<? extends Effect> list = this.f43507c;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEffectList");
        }
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Effect effect = (Effect) next;
            String str = this.f43506b;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCategory");
            }
            EffectModel a2 = e.a(i2, effect, str);
            Intrinsics.checkExpressionValueIsNotNull(a2, "EffectDataProvider.cover…index, effect, mCategory)");
            if (PatchProxy.isSupport(new Object[]{a2}, this, f43505a, false, 38523, new Class[]{EffectModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{a2}, this, f43505a, false, 38523, new Class[]{EffectModel.class}, Void.TYPE);
            } else {
                List<? extends EffectModel> list2 = this.f43509e;
                List mutableList = CollectionsKt.toMutableList((Collection<? extends T>) this.f43509e);
                mutableList.add(a2);
                DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new EffectDiff(list2, mutableList), true);
                Intrinsics.checkExpressionValueIsNotNull(calculateDiff, "DiffUtil\n               …(oldList, newList), true)");
                a(calculateDiff, mutableList);
                AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) a((int) C0906R.id.ccj);
                if (aVDmtPanelRecyleView != null) {
                    if (aVDmtPanelRecyleView.getVisibility() == 8) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        aVDmtPanelRecyleView = null;
                    }
                    if (aVDmtPanelRecyleView != null) {
                        a(false);
                    }
                }
            }
            i2 = i3;
        }
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43505a, false, 38520, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43505a, false, 38520, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            LinearLayout linearLayout = (LinearLayout) a((int) C0906R.id.bj4);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "loading_area");
            linearLayout.setVisibility(0);
            AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) a((int) C0906R.id.ccj);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtPanelRecyleView, "recyerview");
            aVDmtPanelRecyleView.setVisibility(8);
            DmtStatusView dmtStatusView = this.j;
            if (dmtStatusView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStatusView");
            }
            dmtStatusView.d();
        } else {
            DmtStatusView dmtStatusView2 = this.j;
            if (dmtStatusView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStatusView");
            }
            dmtStatusView2.b();
            LinearLayout linearLayout2 = (LinearLayout) a((int) C0906R.id.bj4);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "loading_area");
            linearLayout2.setVisibility(8);
            AVDmtPanelRecyleView aVDmtPanelRecyleView2 = (AVDmtPanelRecyleView) a((int) C0906R.id.ccj);
            Intrinsics.checkExpressionValueIsNotNull(aVDmtPanelRecyleView2, "recyerview");
            aVDmtPanelRecyleView2.setVisibility(0);
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f43505a, false, 38517, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f43505a, false, 38517, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("effect_list");
            if (parcelableArrayList == null) {
                Intrinsics.throwNpe();
            }
            this.f43507c = parcelableArrayList;
            String string = arguments.getString("effect_category");
            if (string == null) {
                Intrinsics.throwNpe();
            }
            this.f43506b = string;
        }
        this.g.clear();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ArrayList<EffectPointModel> arrayList = this.g;
            ViewModel viewModel = ViewModelProviders.of(activity).get(VEVideoPublishEditViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(fr…ditViewModel::class.java)");
            ArrayList<EffectPointModel> arrayList2 = ((VEVideoPublishEditViewModel) viewModel).f82809c;
            Intrinsics.checkExpressionValueIsNotNull(arrayList2, "ViewModelProviders.of(fr…   .effectPointModelStack");
            Collection arrayList3 = new ArrayList();
            for (Object next : arrayList2) {
                EffectPointModel effectPointModel = (EffectPointModel) next;
                String str = this.f43506b;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCategory");
                }
                Intrinsics.checkExpressionValueIsNotNull(effectPointModel, AdvanceSetting.NETWORK_TYPE);
                if (Intrinsics.areEqual((Object) str, (Object) effectPointModel.getCategory())) {
                    arrayList3.add(next);
                }
            }
            arrayList.addAll((List) arrayList3);
        }
        com.ss.android.ugc.aweme.effect.a.a aVar = this.f43510f;
        if (aVar != null) {
            b bVar = this;
            if (PatchProxy.isSupport(new Object[]{bVar}, aVar, com.ss.android.ugc.aweme.effect.a.a.f43645a, false, 38831, new Class[]{b.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.effect.a.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{bVar}, aVar2, com.ss.android.ugc.aweme.effect.a.a.f43645a, false, 38831, new Class[]{b.class}, Void.TYPE);
            } else {
                aVar.f43648d.add(bVar);
            }
        }
    }

    public final void a(@NotNull List<? extends EffectModel> list) {
        List<? extends EffectModel> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f43505a, false, 38516, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f43505a, false, 38516, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "<set-?>");
        this.f43509e = list2;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f43505a, false, 38519, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f43505a, false, 38519, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(view.getContext());
        wrapLinearLayoutManager.setOrientation(0);
        this.f43508d = wrapLinearLayoutManager;
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) a((int) C0906R.id.ccj);
        Intrinsics.checkExpressionValueIsNotNull(aVDmtPanelRecyleView, "recyerview");
        WrapLinearLayoutManager wrapLinearLayoutManager2 = this.f43508d;
        if (wrapLinearLayoutManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLinearLayoutManager");
        }
        aVDmtPanelRecyleView.setLayoutManager(wrapLinearLayoutManager2);
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f43505a, false, 38518, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f43505a, false, 38518, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0906R.layout.ns, viewGroup2, false);
        View findViewById = inflate.findViewById(C0906R.id.bjh);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.loading_status)");
        this.j = (DmtStatusView) findViewById;
        DmtStatusView dmtStatusView = this.j;
        if (dmtStatusView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusView");
        }
        dmtStatusView.setBuilder(DmtStatusView.a.a(getContext()).c(1));
        return inflate;
    }
}
