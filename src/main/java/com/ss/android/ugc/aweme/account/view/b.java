package com.ss.android.ugc.aweme.account.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/account/view/LoadingViewWithBackground;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "text", "", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;I)V", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class b extends FrameLayout {
    @JvmOverloads
    public b(@NotNull Context context) {
        this(context, null, null, 0, 14);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private b(@NotNull Context context, @NotNull String str, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "text");
        LayoutInflater.from(context).inflate(C0906R.layout.a_s, this);
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) (!(findViewById(C0906R.id.bj_) instanceof DmtLoadingLayout) ? null : findViewById(C0906R.id.bj_));
        if (dmtLoadingLayout != null) {
            dmtLoadingLayout.setVisibility(0);
        }
    }

    @JvmOverloads
    private /* synthetic */ b(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        this(context, "", null, 0);
    }
}
