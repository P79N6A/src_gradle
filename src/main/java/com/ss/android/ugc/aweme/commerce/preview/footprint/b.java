package com.ss.android.ugc.aweme.commerce.preview.footprint;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.preview.footprint.ProductAdapter;
import com.ss.android.ugc.aweme.commerce.preview.footprint.ProductPageSnapHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002 !B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001e\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/footprint/FootPrintLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mDepend", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/FootPrintLayout$FootPrintDepend;", "getMDepend", "()Lcom/ss/android/ugc/aweme/commerce/preview/footprint/FootPrintLayout$FootPrintDepend;", "setMDepend", "(Lcom/ss/android/ugc/aweme/commerce/preview/footprint/FootPrintLayout$FootPrintDepend;)V", "createDataView", "Landroid/support/v7/widget/RecyclerView;", "productItemList", "", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductItem;", "headView", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/HeadTextView;", "createHeadView", "createLoadingView", "Landroid/view/View;", "createTipView", "tip", "", "requestData", "", "DataCallBack", "FootPrintDepend", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37446a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public C0475b f37447b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/footprint/FootPrintLayout$DataCallBack;", "", "fail", "", "message", "", "success", "productItemList", "", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductItem;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(@NotNull String str);

        void a(@NotNull List<e> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/footprint/FootPrintLayout$FootPrintDepend;", "", "loadData", "", "callBack", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/FootPrintLayout$DataCallBack;", "onFootprintShow", "getDataSuccess", "", "onItemShow", "productItem", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductItem;", "openPreviewPage", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.preview.footprint.b$b  reason: collision with other inner class name */
    public interface C0475b {
        void a(@NotNull a aVar);

        void a(@NotNull e eVar);

        void a(boolean z);

        void b(@NotNull e eVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/footprint/FootPrintLayout$createDataView$1", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductPageSnapHelper$PositionListener;", "updatePosition", "", "position", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements ProductPageSnapHelper.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37450a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HeadTextView f37451b;

        c(HeadTextView headTextView) {
            this.f37451b = headTextView;
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f37450a, false, 28918, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f37450a, false, 28918, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f37451b.setIndex(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/footprint/FootPrintLayout$createDataView$adapter$1", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductAdapter$ItemClickListener;", "click", "", "productItem", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductItem;", "view", "Landroid/view/View;", "onItemShow", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements ProductAdapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37452a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f37453b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ProductPageSnapHelper f37454c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LinearLayoutManager f37455d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RecyclerView f37456e;

        public final void a(@NotNull e eVar) {
            e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{eVar2}, this, f37452a, false, 28920, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2}, this, f37452a, false, 28920, new Class[]{e.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(eVar2, "productItem");
            C0475b mDepend = this.f37453b.getMDepend();
            if (mDepend != null) {
                mDepend.b(eVar2);
            }
        }

        public final void a(@NotNull e eVar, @NotNull View view) {
            if (PatchProxy.isSupport(new Object[]{eVar, view}, this, f37452a, false, 28919, new Class[]{e.class, View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar, view}, this, f37452a, false, 28919, new Class[]{e.class, View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(eVar, "productItem");
            Intrinsics.checkParameterIsNotNull(view, "view");
            View a2 = this.f37454c.a(this.f37455d);
            int left = view.getLeft();
            if (a2 == null) {
                Intrinsics.throwNpe();
            }
            int left2 = left - a2.getLeft();
            if (left2 != 0) {
                this.f37456e.smoothScrollBy(left2, 0);
                return;
            }
            C0475b mDepend = this.f37453b.getMDepend();
            if (mDepend != null) {
                mDepend.a(eVar);
            }
        }

        d(b bVar, ProductPageSnapHelper productPageSnapHelper, LinearLayoutManager linearLayoutManager, RecyclerView recyclerView) {
            this.f37453b = bVar;
            this.f37454c = productPageSnapHelper;
            this.f37455d = linearLayoutManager;
            this.f37456e = recyclerView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/footprint/FootPrintLayout$requestData$1", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/FootPrintLayout$DataCallBack;", "fail", "", "message", "", "success", "productItemList", "", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductItem;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37457a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f37458b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37459a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f37460b;

            a(e eVar) {
                this.f37460b = eVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f37459a, false, 28923, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37459a, false, 28923, new Class[0], Void.TYPE);
                    return;
                }
                C0475b mDepend = this.f37460b.f37458b.getMDepend();
                if (mDepend != null) {
                    mDepend.a(false);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.commerce.preview.footprint.b$e$b  reason: collision with other inner class name */
        static final class C0476b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37461a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f37462b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ View f37463c;

            C0476b(e eVar, View view) {
                this.f37462b = eVar;
                this.f37463c = view;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f37461a, false, 28924, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37461a, false, 28924, new Class[0], Void.TYPE);
                    return;
                }
                if (this.f37462b.f37458b.getChildCount() > 0) {
                    this.f37462b.f37458b.removeAllViews();
                }
                this.f37462b.f37458b.addView(this.f37462b.f37458b.a());
                this.f37462b.f37458b.addView(this.f37463c);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        static final class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37464a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f37465b;

            c(e eVar) {
                this.f37465b = eVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f37464a, false, 28925, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37464a, false, 28925, new Class[0], Void.TYPE);
                    return;
                }
                C0475b mDepend = this.f37465b.f37458b.getMDepend();
                if (mDepend != null) {
                    mDepend.a(true);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        static final class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37466a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f37467b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ HeadTextView f37468c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ RecyclerView f37469d;

            d(e eVar, HeadTextView headTextView, RecyclerView recyclerView) {
                this.f37467b = eVar;
                this.f37468c = headTextView;
                this.f37469d = recyclerView;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f37466a, false, 28926, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37466a, false, 28926, new Class[0], Void.TYPE);
                    return;
                }
                if (this.f37467b.f37458b.getChildCount() > 0) {
                    this.f37467b.f37458b.removeAllViews();
                }
                this.f37467b.f37458b.addView(this.f37468c);
                this.f37467b.f37458b.addView(this.f37469d);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.commerce.preview.footprint.b$e$e  reason: collision with other inner class name */
        static final class C0477e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37470a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f37471b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ HeadTextView f37472c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ View f37473d;

            C0477e(e eVar, HeadTextView headTextView, View view) {
                this.f37471b = eVar;
                this.f37472c = headTextView;
                this.f37473d = view;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f37470a, false, 28927, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37470a, false, 28927, new Class[0], Void.TYPE);
                    return;
                }
                if (this.f37471b.f37458b.getChildCount() > 0) {
                    this.f37471b.f37458b.removeAllViews();
                }
                this.f37471b.f37458b.addView(this.f37472c);
                this.f37471b.f37458b.addView(this.f37473d);
            }
        }

        public e(b bVar) {
            this.f37458b = bVar;
        }

        public final void a(@NotNull String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f37457a, false, 28921, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f37457a, false, 28921, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str, "message");
            View a2 = this.f37458b.a(str);
            a2.post(new a(this));
            this.f37458b.post(new C0476b(this, a2));
        }

        public final void a(@NotNull List<e> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f37457a, false, 28922, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f37457a, false, 28922, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list, "productItemList");
            HeadTextView a2 = this.f37458b.a();
            a2.post(new c(this));
            if (!list.isEmpty()) {
                this.f37458b.post(new d(this, a2, this.f37458b.a(list, a2)));
                return;
            }
            b bVar = this.f37458b;
            Context context = this.f37458b.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            String string = context.getResources().getString(C0906R.string.y4);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getStr…merce_footprint_no_trace)");
            this.f37458b.post(new C0477e(this, a2, bVar.a(string)));
        }
    }

    @Nullable
    public final C0475b getMDepend() {
        return this.f37447b;
    }

    public final HeadTextView a() {
        if (PatchProxy.isSupport(new Object[0], this, f37446a, false, 28912, new Class[0], HeadTextView.class)) {
            return (HeadTextView) PatchProxy.accessDispatch(new Object[0], this, f37446a, false, 28912, new Class[0], HeadTextView.class);
        }
        HeadTextView headTextView = new HeadTextView(getContext());
        headTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) UIUtils.dip2Px(getContext(), 21.0f)));
        headTextView.setGravity(1);
        headTextView.setNumTextSize((int) UIUtils.sp2px(getContext(), 11.0f));
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        headTextView.setTextColor(context.getResources().getColor(C0906R.color.a17));
        headTextView.setTextSize(13.0f);
        return headTextView;
    }

    public final void setMDepend(@Nullable C0475b bVar) {
        this.f37447b = bVar;
    }

    public b(@Nullable Context context) {
        this(context, null, 0);
    }

    public final View a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f37446a, false, 28913, new Class[]{String.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{str}, this, f37446a, false, 28913, new Class[]{String.class}, View.class);
        }
        DmtTextView dmtTextView = new DmtTextView(getContext());
        dmtTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        dmtTextView.setText(str);
        dmtTextView.setTextSize(14.0f);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        dmtTextView.setTextColor(context.getResources().getColor(C0906R.color.a17));
        dmtTextView.setGravity(17);
        return dmtTextView;
    }

    public final RecyclerView a(List<e> list, HeadTextView headTextView) {
        List<e> list2 = list;
        HeadTextView headTextView2 = headTextView;
        if (PatchProxy.isSupport(new Object[]{list2, headTextView2}, this, f37446a, false, 28911, new Class[]{List.class, HeadTextView.class}, RecyclerView.class)) {
            return (RecyclerView) PatchProxy.accessDispatch(new Object[]{list2, headTextView2}, this, f37446a, false, 28911, new Class[]{List.class, HeadTextView.class}, RecyclerView.class);
        }
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new ProductItemDecoration());
        recyclerView.addOnScrollListener(new ItemScrollListener());
        ProductPageSnapHelper productPageSnapHelper = new ProductPageSnapHelper();
        if (list.size() > 1) {
            int size = list.size();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(size), 1}, headTextView, HeadTextView.f37401a, false, 28940, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                HeadTextView headTextView3 = headTextView;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(size), 1}, headTextView3, HeadTextView.f37401a, false, 28940, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                headTextView2.f37403c = size;
                headTextView2.f37404d = 1;
                headTextView.a();
            }
            productPageSnapHelper.f37429b = new c(headTextView2);
        }
        productPageSnapHelper.a(recyclerView);
        recyclerView.setAdapter(new ProductAdapter(list2, new d(this, productPageSnapHelper, linearLayoutManager, recyclerView)));
        return recyclerView;
    }

    private b(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, null, 0);
        setOrientation(1);
        post(new Runnable(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37448a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f37449b;

            {
                this.f37449b = r1;
            }

            public final void run() {
                View view;
                if (PatchProxy.isSupport(new Object[0], this, f37448a, false, 28917, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37448a, false, 28917, new Class[0], Void.TYPE);
                    return;
                }
                this.f37449b.addView(this.f37449b.a());
                b bVar = this.f37449b;
                b bVar2 = this.f37449b;
                if (PatchProxy.isSupport(new Object[0], bVar2, b.f37446a, false, 28914, new Class[0], View.class)) {
                    view = (View) PatchProxy.accessDispatch(new Object[0], bVar2, b.f37446a, false, 28914, new Class[0], View.class);
                } else {
                    DmtTextView dmtTextView = new DmtTextView(bVar2.getContext());
                    dmtTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    Context context = bVar2.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    dmtTextView.setText(context.getResources().getString(C0906R.string.y3));
                    dmtTextView.setTextSize(14.0f);
                    Context context2 = bVar2.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                    dmtTextView.setTextColor(context2.getResources().getColor(C0906R.color.a17));
                    dmtTextView.setGravity(17);
                    view = dmtTextView;
                }
                bVar.addView(view);
            }
        });
    }
}
