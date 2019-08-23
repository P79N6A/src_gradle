package com.ss.android.ugc.aweme.commercialize.loft.half;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/half/LoftListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/commercialize/loft/half/LoftListAdapter$HomeView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "height", "", "getHeight", "()I", "setHeight", "(I)V", "reactView", "Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;", "getReactView", "()Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;", "setReactView", "(Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;)V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "HomeView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LoftListAdapter extends RecyclerView.Adapter<HomeView> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39199a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public CrossPlatformWebView f39200b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f39201c;

    /* renamed from: d  reason: collision with root package name */
    public int f39202d = u.a(400.0d);

    /* renamed from: e  reason: collision with root package name */
    private final Context f39203e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/half/LoftListAdapter$HomeView;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;", "(Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class HomeView extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HomeView(@NotNull CrossPlatformWebView crossPlatformWebView) {
            super(crossPlatformWebView);
            Intrinsics.checkParameterIsNotNull(crossPlatformWebView, "itemView");
        }
    }

    public final int getItemCount() {
        return 1;
    }

    public LoftListAdapter(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f39203e = context;
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        HomeView homeView;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f39199a, false, 31236, new Class[]{ViewGroup.class, Integer.TYPE}, HomeView.class)) {
            homeView = (HomeView) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f39199a, false, 31236, new Class[]{ViewGroup.class, Integer.TYPE}, HomeView.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            CrossPlatformWebView crossPlatformWebView = new CrossPlatformWebView(this.f39203e, null, 0, 6, null);
            this.f39200b = crossPlatformWebView;
            CrossPlatformWebView crossPlatformWebView2 = this.f39200b;
            if (crossPlatformWebView2 == null) {
                Intrinsics.throwNpe();
            }
            new HomeView(crossPlatformWebView2);
        }
        return homeView;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        HomeView homeView = (HomeView) viewHolder;
        if (PatchProxy.isSupport(new Object[]{homeView, Integer.valueOf(i)}, this, f39199a, false, 31237, new Class[]{HomeView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{homeView, Integer.valueOf(i)}, this, f39199a, false, 31237, new Class[]{HomeView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(homeView, "holder");
        if (homeView.itemView != null) {
            View view = homeView.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            ((CrossPlatformWebView) view).setLayoutParams(new ViewGroup.LayoutParams(-1, this.f39202d));
            ((CrossPlatformWebView) homeView.itemView).a(1, 0, u.a(143.0d), 0, 0);
            String str = this.f39201c;
            if (str != null) {
                ((CrossPlatformWebView) homeView.itemView).a(str, false);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
    }
}
