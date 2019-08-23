package com.ss.android.ugc.gamora.editor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.e;
import com.ss.android.ugc.aweme.C0906R;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fJ\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/gamora/editor/EditRootScene;", "Lcom/bytedance/scene/group/GroupScene;", "()V", "previewScene", "Lcom/ss/android/ugc/gamora/editor/EditPreviewScene;", "bindPreviewScaleAnimLayout", "", "layout", "Landroid/view/View;", "getLightDetectionDone", "Landroid/arch/lifecycle/MutableLiveData;", "", "getPreviewAutoStartStopArbiter", "Ldmt/av/video/VEEditorAutoStartStopArbiter;", "getSurfaceLayoutHeight", "", "getSurfaceLayoutParams", "Landroid/view/ViewGroup$MarginLayoutParams;", "getSurfaceLayoutWidth", "onCreateView", "Landroid/view/ViewGroup;", "inflater", "Landroid/view/LayoutInflater;", "container", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends com.bytedance.scene.group.c {
    public b k;

    @NotNull
    public final ViewGroup.MarginLayoutParams a() {
        b bVar = this.k;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewScene");
        }
        return bVar.a();
    }

    public final int b() {
        b bVar = this.k;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewScene");
        }
        return bVar.b();
    }

    public final int c() {
        b bVar = this.k;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewScene");
        }
        return bVar.c();
    }

    @Nullable
    public final VEEditorAutoStartStopArbiter d() {
        b bVar = this.k;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewScene");
        }
        return bVar.d();
    }

    public final void a(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "layout");
        b bVar = this.k;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewScene");
        }
        bVar.a(view);
    }

    @NotNull
    public final ViewGroup a(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View inflate = layoutInflater.inflate(C0906R.layout.acs, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void a(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.a(view, bundle);
        b bVar = (b) a("EditPreviewScene");
        if (bVar == null) {
            bVar = new b();
            a((int) C0906R.id.a8u, (e) bVar, "EditPreviewScene");
        }
        this.k = bVar;
    }

    public final /* bridge */ /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return a(layoutInflater, viewGroup);
    }
}
