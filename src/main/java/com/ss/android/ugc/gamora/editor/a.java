package com.ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.edit.f;
import com.ss.android.ugc.aweme.utils.ax;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0015\u001a\u0004\u0018\u00010\bJ\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010 \u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\"\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/ugc/gamora/editor/EditBottomBarScene;", "Lcom/bytedance/scene/Scene;", "()V", "bottomBarContainer", "Landroid/widget/LinearLayout;", "bottomBarViewMap", "", "", "Landroid/view/View;", "bottomLayout", "Landroid/widget/RelativeLayout;", "editToolbarViewModel", "Lcom/ss/android/ugc/gamora/editor/EditToolbarViewModel;", "editViewModel", "Lcom/ss/android/ugc/gamora/editor/EditViewModel;", "nextStep", "Landroid/widget/TextView;", "toolbarHelper", "Lcom/ss/android/ugc/gamora/editor/EditToolbarHelper;", "getChooseMusicItem", "Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolBarItem;", "getTvSticker", "initBottomBarView", "", "items", "", "Lcom/ss/android/ugc/gamora/editor/EditToolbarItemModel;", "initObserver", "initToolbarItemObserver", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends com.bytedance.scene.e {
    public EditViewModel i;
    public RelativeLayout j;
    LinearLayout k;
    public final Map<Integer, View> l = new LinkedHashMap();
    e m;
    private EditToolbarViewModel n;
    private TextView o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/gamora/editor/EditBottomBarScene$initBottomBarView$1$1", "Lcom/ss/android/ugc/aweme/utils/DebounceOnClickListener;", "doClick", "", "v", "Landroid/view/View;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.gamora.editor.a$a  reason: collision with other inner class name */
    public static final class C0814a extends ax {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f77555a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f77556b;

        public final void a(@Nullable View view) {
            a.a(this.f77556b).e().setValue(Integer.valueOf(this.f77555a.f77594a));
        }

        C0814a(f fVar, a aVar) {
            this.f77555a = fVar;
            this.f77556b = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "items", "", "Lcom/ss/android/ugc/gamora/editor/EditToolbarItemModel;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<List<? extends f>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f77557a;

        b(a aVar) {
            this.f77557a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            View view;
            List<f> list = (List) obj;
            if (list != null) {
                a aVar = this.f77557a;
                Intrinsics.checkExpressionValueIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
                for (f fVar : list) {
                    if (fVar.f77594a == 1) {
                        f.a aVar2 = f.f67171d;
                        Activity activity = aVar.f22093a;
                        if (activity == null) {
                            Intrinsics.throwNpe();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
                        view = aVar2.b(activity, fVar.f77596c, fVar.f77595b);
                    } else {
                        f.a aVar3 = f.f67171d;
                        Activity activity2 = aVar.f22093a;
                        if (activity2 == null) {
                            Intrinsics.throwNpe();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(activity2, "activity!!");
                        view = aVar3.a(activity2, fVar.f77596c, fVar.f77595b);
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.leftMargin = (int) UIUtils.dip2Px(aVar.q(), 4.0f);
                    LinearLayout linearLayout = aVar.k;
                    if (linearLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("bottomBarContainer");
                    }
                    linearLayout.addView(view, layoutParams);
                    aVar.l.put(Integer.valueOf(fVar.f77594a), view);
                    view.setOnClickListener(new C0814a(fVar, aVar));
                }
                e eVar = aVar.m;
                if (eVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("toolbarHelper");
                }
                eVar.a(aVar.l);
                e eVar2 = aVar.m;
                if (eVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("toolbarHelper");
                }
                eVar2.b(aVar.l);
                e eVar3 = aVar.m;
                if (eVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("toolbarHelper");
                }
                eVar3.a(aVar.l, 48);
                View view2 = aVar.l.get(1);
                if (view2 != null) {
                    e eVar4 = aVar.m;
                    if (eVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("toolbarHelper");
                    }
                    if (view2 != null) {
                        eVar4.a((com.ss.android.ugc.aweme.shortvideo.edit.d) view2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditMusicToolBarItem");
                    }
                }
                View view3 = aVar.l.get(7);
                if (view3 != null) {
                    e eVar5 = aVar.m;
                    if (eVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("toolbarHelper");
                    }
                    eVar5.a(view3);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "i", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f77558a;

        c(a aVar) {
            this.f77558a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                ViewGroup.LayoutParams layoutParams = a.b(this.f77558a).getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    Intrinsics.checkExpressionValueIsNotNull(num, AdvanceSetting.NETWORK_TYPE);
                    marginLayoutParams.bottomMargin = num.intValue();
                    a.b(this.f77558a).setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "i", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f77559a;

        d(a aVar) {
            this.f77559a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                ViewGroup.LayoutParams layoutParams = a.b(this.f77559a).getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    Intrinsics.checkExpressionValueIsNotNull(num, AdvanceSetting.NETWORK_TYPE);
                    marginLayoutParams.height = num.intValue();
                    a.b(this.f77559a).setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/gamora/editor/EditBottomBarScene$onViewCreated$1", "Lcom/ss/android/ugc/aweme/utils/DebounceOnClickListener;", "doClick", "", "v", "Landroid/view/View;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e extends ax {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f77560a;

        public final void a(@Nullable View view) {
            a.a(this.f77560a).d().setValue(null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, long j) {
            super(600);
            this.f77560a = aVar;
        }
    }

    @Nullable
    public final View a() {
        return this.l.get(4);
    }

    public static final /* synthetic */ EditViewModel a(a aVar) {
        EditViewModel editViewModel = aVar.i;
        if (editViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editViewModel");
        }
        return editViewModel;
    }

    public static final /* synthetic */ RelativeLayout b(a aVar) {
        RelativeLayout relativeLayout = aVar.j;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomLayout");
        }
        return relativeLayout;
    }

    public final void e(@Nullable Bundle bundle) {
        super.e(bundle);
        Activity activity = this.f22093a;
        if (activity != null) {
            ViewModel viewModel = ViewModelProviders.of((FragmentActivity) activity).get(EditViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ditViewModel::class.java]");
            this.i = (EditViewModel) viewModel;
            Activity activity2 = this.f22093a;
            if (activity2 != null) {
                ViewModel viewModel2 = ViewModelProviders.of((FragmentActivity) activity2).get(EditToolbarViewModel.class);
                Intrinsics.checkExpressionValueIsNotNull(viewModel2, "ViewModelProviders.of(ac…barViewModel::class.java]");
                this.n = (EditToolbarViewModel) viewModel2;
                Activity activity3 = this.f22093a;
                if (activity3 != null) {
                    FragmentActivity fragmentActivity = (FragmentActivity) activity3;
                    EditViewModel editViewModel = this.i;
                    if (editViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("editViewModel");
                    }
                    EditToolbarViewModel editToolbarViewModel = this.n;
                    if (editToolbarViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("editToolbarViewModel");
                    }
                    this.m = new e(fragmentActivity, editViewModel, editToolbarViewModel);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final void f(@Nullable Bundle bundle) {
        super.f(bundle);
        EditToolbarViewModel editToolbarViewModel = this.n;
        if (editToolbarViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editToolbarViewModel");
        }
        LifecycleOwner lifecycleOwner = this;
        editToolbarViewModel.e().observe(lifecycleOwner, new b(this));
        EditToolbarViewModel editToolbarViewModel2 = this.n;
        if (editToolbarViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editToolbarViewModel");
        }
        LiveData c2 = editToolbarViewModel2.c();
        TextView textView = this.o;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nextStep");
        }
        com.ss.android.ugc.gamora.recorder.a.a(c2, lifecycleOwner, textView);
        EditToolbarViewModel editToolbarViewModel3 = this.n;
        if (editToolbarViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editToolbarViewModel");
        }
        editToolbarViewModel3.p().observe(lifecycleOwner, new c(this));
        EditToolbarViewModel editToolbarViewModel4 = this.n;
        if (editToolbarViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editToolbarViewModel");
        }
        editToolbarViewModel4.q().observe(lifecycleOwner, new d(this));
        View view = this.l.get(9);
        if (view != null) {
            e eVar = this.m;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarHelper");
            }
            if (view != null) {
                eVar.a((f) view);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
        }
    }

    public final void a(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.a(view, bundle);
        View a2 = a((int) C0906R.id.b82);
        Intrinsics.checkExpressionValueIsNotNull(a2, "findViewById(R.id.layout_bottom_tool)");
        this.j = (RelativeLayout) a2;
        View a3 = a((int) C0906R.id.m5);
        Intrinsics.checkExpressionValueIsNotNull(a3, "findViewById(R.id.bottom_bar_container)");
        this.k = (LinearLayout) a3;
        View a4 = a((int) C0906R.id.bqm);
        Intrinsics.checkExpressionValueIsNotNull(a4, "findViewById(R.id.next_step)");
        this.o = (TextView) a4;
        TextView textView = this.o;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nextStep");
        }
        textView.setOnClickListener(new e(this, 600));
    }

    @NotNull
    public final View a(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View inflate = layoutInflater.inflate(C0906R.layout.acq, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…om_bar, container, false)");
        return inflate;
    }
}
