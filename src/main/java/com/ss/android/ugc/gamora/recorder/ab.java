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
import com.bytedance.scene.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.DontDrawLastItemDividerItemDecoration;
import com.ss.android.ugc.aweme.shortvideo.adapter.c;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordToolbarScene;", "Lcom/bytedance/scene/Scene;", "()V", "toolbarRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "toolbarViewModel", "Lcom/ss/android/ugc/gamora/recorder/RecordToolbarViewModel;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ab extends e {
    public static final a i = new a((byte) 0);
    private RecyclerView j;
    private RecordToolbarViewModel k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordToolbarScene$Companion;", "", "()V", "TAG", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void f(@Nullable Bundle bundle) {
        super.f(bundle);
        Activity activity = this.f22093a;
        if (activity != null) {
            ViewModel viewModel = ViewModelProviders.of((FragmentActivity) activity).get(RecordToolbarViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…barViewModel::class.java)");
            this.k = (RecordToolbarViewModel) viewModel;
            RecordToolbarViewModel recordToolbarViewModel = this.k;
            if (recordToolbarViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarViewModel");
            }
            c a2 = recordToolbarViewModel.a();
            View a3 = a((int) C0906R.id.cca);
            Intrinsics.checkExpressionValueIsNotNull(a3, "findViewById(R.id.recycler_toolbar)");
            this.j = (RecyclerView) a3;
            RecyclerView recyclerView = this.j;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarRecyclerView");
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(s(), 1, false));
            RecyclerView recyclerView2 = this.j;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarRecyclerView");
            }
            recyclerView2.setAdapter(a2.f65503b);
            DontDrawLastItemDividerItemDecoration dontDrawLastItemDividerItemDecoration = new DontDrawLastItemDividerItemDecoration(s(), 1);
            Drawable drawable = ContextCompat.getDrawable(s(), 2130837711);
            if (drawable == null) {
                Intrinsics.throwNpe();
            }
            dontDrawLastItemDividerItemDecoration.setDrawable(drawable);
            RecyclerView recyclerView3 = this.j;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarRecyclerView");
            }
            recyclerView3.addItemDecoration(dontDrawLastItemDividerItemDecoration);
            RecordToolbarViewModel recordToolbarViewModel2 = this.k;
            if (recordToolbarViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarViewModel");
            }
            recordToolbarViewModel2.a(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    @NotNull
    public final View a(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View inflate = layoutInflater.inflate(C0906R.layout.aq5, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
    }
}
