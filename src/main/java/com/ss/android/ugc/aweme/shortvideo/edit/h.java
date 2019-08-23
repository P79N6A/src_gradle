package com.ss.android.ugc.aweme.shortvideo.edit;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 42\u00020\u0001:\u00014B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0006H&J\b\u0010'\u001a\u00020(H&J\b\u0010)\u001a\u00020%H&J\b\u0010*\u001a\u00020%H\u0002J\b\u0010+\u001a\u00020%H\u0016J\u0006\u0010,\u001a\u00020%J\b\u0010-\u001a\u00020%H&J\b\u0010.\u001a\u00020/H\u0002J\u000e\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020/J\u0010\u00102\u001a\u00020%2\u0006\u00103\u001a\u00020\u0006H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 ¨\u00065"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolbarModule;", "", "toolBarContainer", "Landroid/view/ViewGroup;", "editToolbarList", "", "Landroid/view/View;", "context", "Landroid/app/Activity;", "(Landroid/view/ViewGroup;Ljava/util/List;Landroid/app/Activity;)V", "getContext", "()Landroid/app/Activity;", "getEditToolbarList", "()Ljava/util/List;", "moreEditToolContainer", "Landroid/widget/LinearLayout;", "getMoreEditToolContainer", "()Landroid/widget/LinearLayout;", "setMoreEditToolContainer", "(Landroid/widget/LinearLayout;)V", "getToolBarContainer", "()Landroid/view/ViewGroup;", "toolbarDAInterceptor", "Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolbarDAInterceptor;", "getToolbarDAInterceptor", "()Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolbarDAInterceptor;", "setToolbarDAInterceptor", "(Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolbarDAInterceptor;)V", "toolbarMore", "getToolbarMore", "()Landroid/view/View;", "setToolbarMore", "(Landroid/view/View;)V", "toolbarRootView", "getToolbarRootView", "setToolbarRootView", "addMarginForItem", "", "itemView", "getToolbarLayout", "", "hideMore", "initExtensionViews", "initFixedViews", "initLayout", "initMoreContainer", "isNeedInflateMore", "", "setVisibility", "visible", "showMore", "moreView", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67175a;
    public static final a i = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public g f67176b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public View f67177c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f67178d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public View f67179e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f67180f;
    @NotNull
    public final List<View> g;
    @NotNull
    public final Activity h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolbarModule$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolbarModule;", "editPageType", "", "toolBarContainer", "Landroid/view/ViewGroup;", "editToolbarList", "", "Landroid/view/View;", "context", "Landroid/app/Activity;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67181a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67182a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f67183b;

        b(h hVar) {
            this.f67183b = hVar;
        }

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f67182a, false, 76249, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f67182a, false, 76249, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            h hVar = this.f67183b;
            Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
            hVar.b(view2);
        }
    }

    public abstract void a(@NotNull View view);

    public abstract void c();

    public abstract void d();

    public abstract int e();

    public final void a() {
        boolean z;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f67175a, false, 76241, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67175a, false, 76241, new Class[0], Void.TYPE);
            return;
        }
        if (!this.g.isEmpty()) {
            b();
        }
        if (PatchProxy.isSupport(new Object[0], this, f67175a, false, 76243, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67175a, false, 76243, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.g.size() > 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (PatchProxy.isSupport(new Object[0], this, f67175a, false, 76245, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f67175a, false, 76245, new Class[0], Void.TYPE);
                return;
            }
            d();
            for (View view : this.g.subList(2, this.g.size())) {
                LinearLayout linearLayout = this.f67178d;
                if (linearLayout != null) {
                    linearLayout.addView(view);
                }
                if (i2 != 0) {
                    a(view);
                }
                i2++;
            }
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f67175a, false, 76244, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67175a, false, 76244, new Class[0], Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(this.h).inflate(e(), this.f67180f, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont… toolBarContainer, false)");
        this.f67177c = inflate;
        View view = this.f67177c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarRootView");
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0906R.id.aeu);
        int min = Math.min(1, this.g.size() - 1);
        if (min >= 0) {
            int i2 = 0;
            while (true) {
                View view2 = this.g.get(i2);
                linearLayout.addView(view2);
                if (i2 == 1) {
                    a(view2);
                }
                if (i2 == min) {
                    break;
                }
                i2++;
            }
        }
        if (this.g.size() == 3) {
            linearLayout.addView(this.g.get(2));
            a(this.g.get(2));
        } else if (this.g.size() > 3) {
            View view3 = this.f67177c;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarRootView");
            }
            this.f67179e = view3.findViewById(C0906R.id.d4j);
            View view4 = this.f67179e;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            View view5 = this.f67179e;
            if (view5 != null) {
                view5.setOnClickListener(new b(this));
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        ViewGroup viewGroup = this.f67180f;
        View view6 = this.f67177c;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarRootView");
        }
        viewGroup.addView(view6, layoutParams);
    }

    public void b(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f67175a, false, 76246, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f67175a, false, 76246, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "moreView");
        g gVar = this.f67176b;
        if (gVar != null) {
            gVar.a();
        }
    }

    public h(@NotNull ViewGroup viewGroup, @NotNull List<? extends View> list, @NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "toolBarContainer");
        Intrinsics.checkParameterIsNotNull(list, "editToolbarList");
        Intrinsics.checkParameterIsNotNull(activity, "context");
        this.f67180f = viewGroup;
        this.g = list;
        this.h = activity;
    }
}
