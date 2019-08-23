package com.ss.android.ugc.aweme.newfollow.vh;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.newfollow.b.c;
import com.ss.android.ugc.aweme.views.e;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/FollowFeedStatusItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "context", "Landroid/content/Context;", "followFeedType", "", "(Landroid/view/View;Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "listener", "Lcom/ss/android/ugc/aweme/newfollow/callback/IRefreshListener;", "mLoadingStatusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "bind", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowFeedStatusItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57571a;

    /* renamed from: b  reason: collision with root package name */
    public c f57572b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final Context f57573c;

    /* renamed from: d  reason: collision with root package name */
    private final DmtStatusView f57574d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowFeedStatusItemViewHolder(@NotNull View view, @NotNull Context context, int i) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f57573c = context;
        View findViewById = view.findViewById(C0906R.id.cuy);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.status)");
        this.f57574d = (DmtStatusView) findViewById;
        this.f57574d.setBuilder(DmtStatusView.a.a(this.f57573c).b(e.a(this.f57573c, new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57575a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ FollowFeedStatusItemViewHolder f57576b;

            {
                this.f57576b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f57575a, false, 62227, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f57575a, false, 62227, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                c cVar = this.f57576b.f57572b;
                if (cVar != null) {
                    cVar.a();
                }
            }
        })));
        switch (i) {
            case 65531:
                ViewGroup.LayoutParams layoutParams = this.f57574d.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.height = (int) UIUtils.dip2Px(this.f57573c, 100.0f);
                    this.f57574d.setLayoutParams(layoutParams2);
                    this.f57574d.d();
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            case 65533:
                this.f57574d.a(false);
                return;
            case 65534:
                this.f57574d.d();
                return;
        }
    }
}
