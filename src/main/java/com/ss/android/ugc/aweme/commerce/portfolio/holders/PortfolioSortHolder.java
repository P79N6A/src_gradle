package com.ss.android.ugc.aweme.commerce.portfolio.holders;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.service.models.t;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/holders/PortfolioSortHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "parentView", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bind", "", "column", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "mCB", "Lkotlin/Function1;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PortfolioSortHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37079a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37080a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function1 f37081b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t f37082c;

        public a(Function1 function1, t tVar) {
            this.f37081b = function1;
            this.f37082c = tVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37080a, false, 28467, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37080a, false, 28467, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function1 function1 = this.f37081b;
            if (function1 != null) {
                function1.invoke(this.f37082c);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PortfolioSortHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.t6, viewGroup, false));
        Intrinsics.checkParameterIsNotNull(viewGroup, "parentView");
    }
}
