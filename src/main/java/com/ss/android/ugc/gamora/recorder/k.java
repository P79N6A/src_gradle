package com.ss.android.ugc.gamora.recorder;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.scene.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment;
import com.ss.android.ugc.aweme.shortvideo.record.n;
import com.ss.android.ugc.aweme.tools.am;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordSpeedGroupScene;", "Lcom/bytedance/scene/Scene;", "()V", "owner", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoRecordingOperationPanelFragment;", "speedGroupViewModel", "Lcom/ss/android/ugc/gamora/recorder/RecordSpeedGroupViewModel;", "speedModule", "Lcom/ss/android/ugc/aweme/shortvideo/record/RecordSpeedModule;", "getSpeedModule", "()Lcom/ss/android/ugc/aweme/shortvideo/record/RecordSpeedModule;", "setSpeedModule", "(Lcom/ss/android/ugc/aweme/shortvideo/record/RecordSpeedModule;)V", "speedRadioGroup", "Landroid/widget/RadioGroup;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class k extends e {
    public static final a k = new a((byte) 0);
    public RadioGroup i;
    @NotNull
    public n j;
    private ShortVideoRecordingOperationPanelFragment l;
    private RecordSpeedGroupViewModel m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordSpeedGroupScene$Companion;", "", "()V", "TAG", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a( \u0007*\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00060\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "p1", "Lcom/ss/android/ugc/aweme/tools/RecordingSpeed;", "Lkotlin/ParameterName;", "name", "speed", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final /* synthetic */ class b extends FunctionReference implements Function1<am, Unit> {
        b(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
            super(1, shortVideoRecordingOperationPanelFragment);
        }

        public final String getName() {
            return "dispatchSpeedChangeEvent";
        }

        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ShortVideoRecordingOperationPanelFragment.class);
        }

        public final String getSignature() {
            return "dispatchSpeedChangeEvent(Lcom/ss/android/ugc/aweme/tools/RecordingSpeed;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((am) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(am amVar) {
            ((ShortVideoRecordingOperationPanelFragment) this.receiver).a(amVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f77660a;

        c(k kVar) {
            this.f77660a = kVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                int dip2Px = (int) UIUtils.dip2Px(this.f77660a.f22093a, 33.0f);
                ViewGroup.LayoutParams layoutParams = k.a(this.f77660a).getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (!bool.booleanValue()) {
                        dip2Px = 0;
                    }
                    marginLayoutParams.bottomMargin = dip2Px;
                    k.a(this.f77660a).setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    public static final /* synthetic */ RadioGroup a(k kVar) {
        RadioGroup radioGroup = kVar.i;
        if (radioGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("speedRadioGroup");
        }
        return radioGroup;
    }

    public final void f(@Nullable Bundle bundle) {
        super.f(bundle);
        Object a2 = w().a("owner");
        if (a2 == null) {
            Intrinsics.throwNpe();
        }
        this.l = (ShortVideoRecordingOperationPanelFragment) a2;
        Activity s = s();
        if (s != null) {
            ViewModel viewModel = ViewModelProviders.of((FragmentActivity) s).get(RecordSpeedGroupViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(re…oupViewModel::class.java)");
            this.m = (RecordSpeedGroupViewModel) viewModel;
            View a3 = a((int) C0906R.id.c9z);
            Intrinsics.checkExpressionValueIsNotNull(a3, "findViewById(R.id.radioGroup)");
            this.i = (RadioGroup) a3;
            RadioGroup radioGroup = this.i;
            if (radioGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("speedRadioGroup");
            }
            ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment = this.l;
            if (shortVideoRecordingOperationPanelFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("owner");
            }
            this.j = new n(radioGroup, new l(new b(shortVideoRecordingOperationPanelFragment)));
            RecordSpeedGroupViewModel recordSpeedGroupViewModel = this.m;
            if (recordSpeedGroupViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("speedGroupViewModel");
            }
            recordSpeedGroupViewModel.f77607a.observe(this, new c(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    @NotNull
    public final View a(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View inflate = layoutInflater.inflate(C0906R.layout.aq4, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
    }
}
