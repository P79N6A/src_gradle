package com.ss.android.ugc.aweme.shortvideo.edit;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolbarModuleA;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolbarModule;", "toolBarContainer", "Landroid/view/ViewGroup;", "editToolbarList", "", "Landroid/view/View;", "context", "Landroid/app/Activity;", "(Landroid/view/ViewGroup;Ljava/util/List;Landroid/app/Activity;)V", "bubbleWidth", "", "moreBubble", "Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView;", "addMarginForItem", "", "itemView", "getToolbarLayout", "hideMore", "initMoreContainer", "showMore", "moreView", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i extends h {
    public static ChangeQuickRedirect j;
    private b k;
    private int l = -1;

    public final int e() {
        return C0906R.layout.lu;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 76253, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 76253, new Class[0], Void.TYPE);
            return;
        }
        b bVar = this.k;
        if (bVar != null) {
            bVar.f();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 76251, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 76251, new Class[0], Void.TYPE);
            return;
        }
        this.f67178d = new LinearLayout(this.h);
        LinearLayout linearLayout = this.f67178d;
        if (linearLayout != null) {
            this.k = new b.a(this.h).d(false).a(false).a(2147483647L).a((View) linearLayout).a();
        }
    }

    public final void a(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, j, false, 76250, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, j, false, 76250, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams2.setMarginStart((int) UIUtils.dip2Px(this.h, 4.0f));
            } else {
                layoutParams2.leftMargin = (int) UIUtils.dip2Px(this.h, 4.0f);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    public final void b(@NotNull View view) {
        float f2;
        int i;
        if (PatchProxy.isSupport(new Object[]{view}, this, j, false, 76252, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, j, false, 76252, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "moreView");
        super.b(view);
        b bVar = this.k;
        if (bVar != null) {
            if (this.l == -1) {
                bVar.a();
                this.l = bVar.e();
            }
            if (ey.a((Context) this.h)) {
                i = (int) (((float) (-view.getWidth())) - UIUtils.dip2Px(this.h, 12.0f));
                f2 = ((float) (view.getWidth() / 2)) - UIUtils.dip2Px(this.h, 10.0f);
            } else {
                f2 = ((float) (this.l - (view.getWidth() / 2))) - UIUtils.dip2Px(this.h, 16.0f);
                i = (int) (((float) (view.getWidth() - this.l)) - UIUtils.dip2Px(this.h, 8.0f));
            }
            bVar.a(view, 80, f2, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(@NotNull ViewGroup viewGroup, @NotNull List<? extends View> list, @NotNull Activity activity) {
        super(viewGroup, list, activity);
        Intrinsics.checkParameterIsNotNull(viewGroup, "toolBarContainer");
        Intrinsics.checkParameterIsNotNull(list, "editToolbarList");
        Intrinsics.checkParameterIsNotNull(activity, "context");
    }
}
