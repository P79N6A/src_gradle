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
import com.bytedance.scene.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment;
import com.ss.android.ugc.aweme.shortvideo.n;
import com.ss.android.ugc.aweme.story.widget.TabHost;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u000eJ\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0016\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordBottomTabScene;", "Lcom/bytedance/scene/Scene;", "()V", "bottomTabViewModel", "Lcom/ss/android/ugc/gamora/recorder/RecordBottomTabViewModel;", "owner", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoRecordingOperationPanelFragment;", "tabHost", "Lcom/ss/android/ugc/aweme/story/widget/TabHost;", "clearAnimation", "", "getCurrentTag", "", "getIndexByTag", "", "tag", "getTagByIndex", "index", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setIndex", "anim", "", "startAnimation", "animation", "Landroid/view/animation/Animation;", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends e {
    public static final a j = new a((byte) 0);
    public TabHost i;
    private RecordBottomTabViewModel k;
    private ShortVideoRecordingOperationPanelFragment l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordBottomTabScene$Companion;", "", "()V", "TAG", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f77646a;

        b(d dVar) {
            this.f77646a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            ViewGroup.LayoutParams layoutParams = d.a(this.f77646a).getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (num == null) {
                    Intrinsics.throwNpe();
                }
                marginLayoutParams.bottomMargin = num.intValue();
                d.a(this.f77646a).setLayoutParams(marginLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @Nullable
    public final Object a() {
        TabHost tabHost = this.i;
        if (tabHost == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabHost");
        }
        TabHost tabHost2 = this.i;
        if (tabHost2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabHost");
        }
        return tabHost.a(tabHost2.getCurrentIndex());
    }

    public static final /* synthetic */ TabHost a(d dVar) {
        TabHost tabHost = dVar.i;
        if (tabHost == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabHost");
        }
        return tabHost;
    }

    public final void f(@Nullable Bundle bundle) {
        super.f(bundle);
        Activity s = s();
        if (s != null) {
            ViewModel viewModel = ViewModelProviders.of((FragmentActivity) s).get(RecordBottomTabViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(re…TabViewModel::class.java)");
            this.k = (RecordBottomTabViewModel) viewModel;
            Object a2 = w().a("owner");
            if (a2 == null) {
                Intrinsics.throwNpe();
            }
            this.l = (ShortVideoRecordingOperationPanelFragment) a2;
            View a3 = a((int) C0906R.id.mu);
            Intrinsics.checkExpressionValueIsNotNull(a3, "findViewById(R.id.bottom_tab_host)");
            this.i = (TabHost) a3;
            com.ss.android.g.a.b();
            ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment = this.l;
            if (shortVideoRecordingOperationPanelFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("owner");
            }
            TabHost tabHost = this.i;
            if (tabHost == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabHost");
            }
            new n(shortVideoRecordingOperationPanelFragment, tabHost);
            RecordBottomTabViewModel recordBottomTabViewModel = this.k;
            if (recordBottomTabViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabViewModel");
            }
            recordBottomTabViewModel.f77597a.observe(this, new b(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    @NotNull
    public final View a(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View inflate = layoutInflater.inflate(C0906R.layout.apw, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
    }
}
