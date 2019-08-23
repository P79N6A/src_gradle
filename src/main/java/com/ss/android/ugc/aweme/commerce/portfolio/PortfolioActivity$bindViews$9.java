package com.ss.android.ugc.aweme.commerce.portfolio;

import a.g;
import a.i;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity;
import com.ss.android.ugc.aweme.commerce.portfolio.api.a;
import com.ss.android.ugc.aweme.utils.dr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/commerce/portfolio/PortfolioActivity$bindViews$9", "Landroid/support/v4/widget/DrawerLayout$DrawerListener;", "onDrawerClosed", "", "p0", "Landroid/view/View;", "onDrawerOpened", "onDrawerSlide", "p1", "", "onDrawerStateChanged", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PortfolioActivity$bindViews$9 implements DrawerLayout.DrawerListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36982a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PortfolioActivity f36983b;

    public final void onDrawerClosed(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f36982a, false, 28386, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f36982a, false, 28386, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "p0");
    }

    public final void onDrawerSlide(@NotNull View view, float f2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f36982a, false, 28385, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f36982a, false, 28385, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "p0");
    }

    public final void onDrawerStateChanged(int i) {
    }

    PortfolioActivity$bindViews$9(PortfolioActivity portfolioActivity) {
        this.f36983b = portfolioActivity;
    }

    public final void onDrawerOpened(@NotNull View view) {
        i iVar;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f36982a, false, 28387, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f36982a, false, 28387, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "p0");
        PortfolioActivity portfolioActivity = this.f36983b;
        if (PatchProxy.isSupport(new Object[0], portfolioActivity, PortfolioActivity.f2884a, false, 28341, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], portfolioActivity, PortfolioActivity.f2884a, false, 28341, new Class[0], Void.TYPE);
            return;
        }
        String uid = portfolioActivity.d().getUid();
        String a2 = dr.a().a(portfolioActivity.d().getUid());
        if (PatchProxy.isSupport(new Object[]{uid, a2}, null, a.f37050a, true, 28455, new Class[]{String.class, String.class}, i.class)) {
            iVar = (i) PatchProxy.accessDispatch(new Object[]{uid, a2}, null, a.f37050a, true, 28455, new Class[]{String.class, String.class}, i.class);
        } else {
            Intrinsics.checkParameterIsNotNull(uid, "kolId");
            iVar = a.f37051b.searchUserCategory(uid, a2, "native");
        }
        iVar.a((g<TResult, TContinuationResult>) new PortfolioActivity.q<TResult,TContinuationResult>(portfolioActivity), i.f1052b);
    }
}
