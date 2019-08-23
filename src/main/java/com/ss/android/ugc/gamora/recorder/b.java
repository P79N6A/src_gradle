package com.ss.android.ugc.gamora.recorder;

import android.app.Activity;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.scene.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.DontDrawLastItemDividerItemDecoration;
import com.ss.android.ugc.aweme.shortvideo.adapter.c;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/MoreCommandsScene;", "Lcom/bytedance/scene/Scene;", "()V", "recordViewModel", "Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;", "toolbarHiddenRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "toolbarViewModel", "Lcom/ss/android/ugc/gamora/recorder/RecordToolbarViewModel;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends e {
    public static final a j = new a((byte) 0);
    public RecordViewModel i;
    private RecyclerView k;
    private RecordToolbarViewModel l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/MoreCommandsScene$Companion;", "", "()V", "TAG", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.gamora.recorder.b$b  reason: collision with other inner class name */
    static final class C0820b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77638a;

        C0820b(b bVar) {
            this.f77638a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            RecordViewModel recordViewModel = this.f77638a.i;
            if (recordViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordViewModel");
            }
            recordViewModel.f77631a.setValue(Boolean.FALSE);
        }
    }

    public final void f(@Nullable Bundle bundle) {
        super.f(bundle);
        Activity activity = this.f22093a;
        if (activity != null) {
            ViewModel viewModel = ViewModelProviders.of((FragmentActivity) activity).get(RecordViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ordViewModel::class.java)");
            this.i = (RecordViewModel) viewModel;
            Activity activity2 = this.f22093a;
            if (activity2 != null) {
                ViewModel viewModel2 = ViewModelProviders.of((FragmentActivity) activity2).get(RecordToolbarViewModel.class);
                Intrinsics.checkExpressionValueIsNotNull(viewModel2, "ViewModelProviders.of(ac…barViewModel::class.java)");
                this.l = (RecordToolbarViewModel) viewModel2;
                RecordToolbarViewModel recordToolbarViewModel = this.l;
                if (recordToolbarViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("toolbarViewModel");
                }
                c a2 = recordToolbarViewModel.a();
                FrameLayout frameLayout = (FrameLayout) a((int) C0906R.id.bnm);
                View findViewById = frameLayout.findViewById(C0906R.id.ccb);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "moreCommands.findViewByI….recycler_toolbar_hidden)");
                this.k = (RecyclerView) findViewById;
                RecyclerView recyclerView = this.k;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("toolbarHiddenRecyclerView");
                }
                recyclerView.setLayoutManager(new LinearLayoutManager(s(), 1, false));
                RecyclerView recyclerView2 = this.k;
                if (recyclerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("toolbarHiddenRecyclerView");
                }
                recyclerView2.setAdapter(a2.f65504c);
                DontDrawLastItemDividerItemDecoration dontDrawLastItemDividerItemDecoration = new DontDrawLastItemDividerItemDecoration(s(), 1);
                Drawable drawable = ContextCompat.getDrawable(s(), 2130837711);
                if (drawable == null) {
                    Intrinsics.throwNpe();
                }
                dontDrawLastItemDividerItemDecoration.setDrawable(drawable);
                RecyclerView recyclerView3 = this.k;
                if (recyclerView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("toolbarHiddenRecyclerView");
                }
                recyclerView3.addItemDecoration(dontDrawLastItemDividerItemDecoration);
                RecordToolbarViewModel recordToolbarViewModel2 = this.l;
                if (recordToolbarViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("toolbarViewModel");
                }
                recordToolbarViewModel2.a(this);
                frameLayout.setOnClickListener(new C0820b(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    @NotNull
    public final View a(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View inflate = layoutInflater.inflate(C0906R.layout.aq0, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
    }
}
