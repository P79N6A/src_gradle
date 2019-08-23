package com.ss.android.ugc.aweme.shortvideo.edit;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/EditMusicToolBarItem;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolBarItem;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "toolIvContainer", "Landroid/widget/LinearLayout;", "getToolIvContainer", "()Landroid/widget/LinearLayout;", "setToolIvContainer", "(Landroid/widget/LinearLayout;)V", "getLayoutId", "onLayoutInflated", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67168a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f67169b;

    public final int getLayoutId() {
        return C0906R.layout.aao;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67168a, false, 76224, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67168a, false, 76224, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        View findViewById = findViewById(C0906R.id.p7);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.btn_tool_iv_container)");
        this.f67169b = (LinearLayout) findViewById;
    }

    @NotNull
    public final LinearLayout getToolIvContainer() {
        if (PatchProxy.isSupport(new Object[0], this, f67168a, false, 76222, new Class[0], LinearLayout.class)) {
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, f67168a, false, 76222, new Class[0], LinearLayout.class);
        }
        LinearLayout linearLayout = this.f67169b;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolIvContainer");
        }
        return linearLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setToolIvContainer(@NotNull LinearLayout linearLayout) {
        LinearLayout linearLayout2 = linearLayout;
        if (PatchProxy.isSupport(new Object[]{linearLayout2}, this, f67168a, false, 76223, new Class[]{LinearLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linearLayout2}, this, f67168a, false, 76223, new Class[]{LinearLayout.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(linearLayout2, "<set-?>");
        this.f67169b = linearLayout2;
    }
}
