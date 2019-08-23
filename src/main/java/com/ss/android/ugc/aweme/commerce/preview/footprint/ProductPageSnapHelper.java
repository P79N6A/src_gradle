package com.ss.android.ugc.aweme.commerce.preview.footprint;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductPageSnapHelper;", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ThreePagerSnapHelper;", "()V", "mPosition", "", "getMPosition", "()I", "setMPosition", "(I)V", "mPositionListener", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductPageSnapHelper$PositionListener;", "getMPositionListener", "()Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductPageSnapHelper$PositionListener;", "setMPositionListener", "(Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductPageSnapHelper$PositionListener;)V", "findSnapView", "Landroid/view/View;", "layoutManager", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "PositionListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ProductPageSnapHelper extends ThreePagerSnapHelper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37428a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public a f37429b;

    /* renamed from: c  reason: collision with root package name */
    public int f37430c = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductPageSnapHelper$PositionListener;", "", "updatePosition", "", "position", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(int i);
    }

    @Nullable
    public final View a(@Nullable RecyclerView.LayoutManager layoutManager) {
        if (PatchProxy.isSupport(new Object[]{layoutManager}, this, f37428a, false, 28966, new Class[]{RecyclerView.LayoutManager.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutManager}, this, f37428a, false, 28966, new Class[]{RecyclerView.LayoutManager.class}, View.class);
        }
        View a2 = super.a(layoutManager);
        if (!(a2 == null || layoutManager == null)) {
            int position = layoutManager.getPosition(a2) + 1;
            if (this.f37430c != position) {
                this.f37430c = position;
                a aVar = this.f37429b;
                if (aVar != null) {
                    aVar.a(position);
                }
            }
        }
        return a2;
    }
}
