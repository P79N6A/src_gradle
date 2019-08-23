package com.ss.android.ugc.aweme.effect;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.effect.VETimeEffectAdapter;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import dmt.av.video.VEVideoPublishEditViewModel;
import dmt.av.video.x;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/TimeEffectTabFragment;", "Landroid/support/v4/app/Fragment;", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class TimeEffectTabFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43550a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f43551b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Ldmt/av/video/VETimeEffectOp;", "onChanged", "com/ss/android/ugc/aweme/effect/TimeEffectTabFragment$onViewCreated$2$1"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Observer<x> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43552a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TimeEffectTabFragment f43553b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VETimeEffectAdapter f43554c;

        a(TimeEffectTabFragment timeEffectTabFragment, VETimeEffectAdapter vETimeEffectAdapter) {
            this.f43553b = timeEffectTabFragment;
            this.f43554c = vETimeEffectAdapter;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            x xVar = (x) obj;
            if (PatchProxy.isSupport(new Object[]{xVar}, this, f43552a, false, 38648, new Class[]{x.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{xVar}, this, f43552a, false, 38648, new Class[]{x.class}, Void.TYPE);
                return;
            }
            if (xVar != null) {
                String str = xVar.f83082b;
                if (str != null) {
                    switch (str.hashCode()) {
                        case 49:
                            if (str.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                                this.f43554c.a(1);
                                return;
                            }
                            break;
                        case 50:
                            if (str.equals(PushConstants.PUSH_TYPE_UPLOAD_LOG)) {
                                this.f43554c.a(2);
                                return;
                            }
                            break;
                        case 51:
                            if (str.equals("3")) {
                                this.f43554c.a(3);
                                return;
                            }
                            break;
                    }
                }
                this.f43554c.a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it2", "", "onChanged", "(Ljava/lang/Boolean;)V", "com/ss/android/ugc/aweme/effect/TimeEffectTabFragment$onViewCreated$2$2"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43555a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TimeEffectTabFragment f43556b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VETimeEffectAdapter f43557c;

        b(TimeEffectTabFragment timeEffectTabFragment, VETimeEffectAdapter vETimeEffectAdapter) {
            this.f43556b = timeEffectTabFragment;
            this.f43557c = vETimeEffectAdapter;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f43555a, false, 38649, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f43555a, false, 38649, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            if (bool != null) {
                this.f43557c.a(bool.booleanValue());
                if (!bool.booleanValue()) {
                    this.f43557c.b();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onItemClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements VETimeEffectAdapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43558a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TimeEffectTabFragment f43559b;

        c(TimeEffectTabFragment timeEffectTabFragment) {
            this.f43559b = timeEffectTabFragment;
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43558a, false, 38650, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43558a, false, 38650, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            FragmentActivity activity = this.f43559b.getActivity();
            if (activity != null) {
                ViewModel viewModel = ViewModelProviders.of(activity).get(VEVideoPublishEditViewModel.class);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(it…ditViewModel::class.java)");
                MutableLiveData<VEEffectSelectOp> g = ((VEVideoPublishEditViewModel) viewModel).g();
                Intrinsics.checkExpressionValueIsNotNull(g, "ViewModelProviders.of(it…  .effectSelectOpLiveData");
                g.setValue(VEEffectSelectOp.selectTime(i));
            }
        }
    }

    private View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43550a, false, 38642, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43550a, false, 38642, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f43551b == null) {
            this.f43551b = new HashMap();
        }
        View view = (View) this.f43551b.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f43551b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43550a, false, 38644, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43550a, false, 38644, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f43550a, false, 38646, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43550a, false, 38646, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f43550a, false, 38645, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43550a, false, 38645, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43550a, false, 38647, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43550a, false, 38647, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f43550a, false, 38643, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43550a, false, 38643, new Class[0], Void.TYPE);
            return;
        }
        if (this.f43551b != null) {
            this.f43551b.clear();
        }
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f43550a, false, 38641, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f43550a, false, 38641, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) a(C0906R.id.d8c);
        Intrinsics.checkExpressionValueIsNotNull(aVDmtHorizontalImageTextLayout, "tvDelete");
        aVDmtHorizontalImageTextLayout.setVisibility(8);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(view.getContext());
        wrapLinearLayoutManager.setOrientation(0);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) a(C0906R.id.ccj);
        Intrinsics.checkExpressionValueIsNotNull(aVDmtPanelRecyleView, "recyerview");
        aVDmtPanelRecyleView.setLayoutManager(wrapLinearLayoutManager);
        VETimeEffectAdapter vETimeEffectAdapter = new VETimeEffectAdapter();
        vETimeEffectAdapter.f43636c = new c(this);
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = (AVDmtPanelRecyleView) a(C0906R.id.ccj);
        Intrinsics.checkExpressionValueIsNotNull(aVDmtPanelRecyleView2, "recyerview");
        aVDmtPanelRecyleView2.setAdapter(vETimeEffectAdapter);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModel viewModel = ViewModelProviders.of(activity).get(VEVideoPublishEditViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(it…ditViewModel::class.java)");
            LifecycleOwner lifecycleOwner = this;
            ((VEVideoPublishEditViewModel) viewModel).n().observe(lifecycleOwner, new a(this, vETimeEffectAdapter));
            ViewModel viewModel2 = ViewModelProviders.of(activity).get(VEVideoPublishEditViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel2, "ViewModelProviders.of(it…ditViewModel::class.java)");
            ((VEVideoPublishEditViewModel) viewModel2).i().observe(lifecycleOwner, new b(this, vETimeEffectAdapter));
        }
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f43550a, false, 38640, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f43550a, false, 38640, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.ns, viewGroup2, false);
    }
}
