package com.ss.android.ugc.aweme.discover.hotspot.list;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0015J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0012J\u0006\u0010\u001f\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/list/HotSpotListDialog;", "Landroid/support/design/widget/BottomSheetDialog;", "context", "Landroid/content/Context;", "mainViewModel", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainViewModel;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainViewModel;)V", "hotSpotListAdapter", "Lcom/ss/android/ugc/aweme/discover/hotspot/list/HotSpotListAdapter;", "getHotSpotListAdapter", "()Lcom/ss/android/ugc/aweme/discover/hotspot/list/HotSpotListAdapter;", "listView", "Landroid/support/v7/widget/RecyclerView;", "getMainViewModel", "()Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainViewModel;", "setMainViewModel", "(Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainViewModel;)V", "rootView", "Landroid/view/View;", "getRootView", "init", "", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "scrollTo", "word", "", "scrollToCenter", "v", "showMobAgain", "switch", "item", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HotSpotListDialog extends BottomSheetDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42456a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f42457b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final HotSpotListAdapter f42458c = new HotSpotListAdapter(this);

    /* renamed from: d  reason: collision with root package name */
    View f42459d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public HotSpotMainViewModel f42460e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42461a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HotSpotListDialog f42462b;

        a(HotSpotListDialog hotSpotListDialog) {
            this.f42462b = hotSpotListDialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42461a, false, 36607, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42461a, false, 36607, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f42462b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42463a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HotSpotListDialog f42464b;

        b(HotSpotListDialog hotSpotListDialog) {
            this.f42464b = hotSpotListDialog;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f42463a, false, 36609, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42463a, false, 36609, new Class[0], Void.TYPE);
                return;
            }
            View findViewById = this.f42464b.findViewById(C0906R.id.a3z);
            if (findViewById != null) {
                FrameLayout frameLayout = (FrameLayout) findViewById;
                BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
                Intrinsics.checkExpressionValueIsNotNull(from, "behavior");
                from.setPeekHeight(frameLayout.getHeight());
                from.setSkipCollapsed(true);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow"}, k = 3, mv = {1, 1, 15})
    static final class c implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42465a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HotSpotListDialog f42466b;

        c(HotSpotListDialog hotSpotListDialog) {
            this.f42466b = hotSpotListDialog;
        }

        public final void onShow(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f42465a, false, 36610, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f42465a, false, 36610, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            this.f42466b.f42460e.a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 15})
    static final class d implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42467a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HotSpotListDialog f42468b;

        d(HotSpotListDialog hotSpotListDialog) {
            this.f42468b = hotSpotListDialog;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f42467a, false, 36611, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f42467a, false, 36611, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            this.f42468b.f42460e.a(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42469a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HotSpotListDialog f42470b;

        e(HotSpotListDialog hotSpotListDialog) {
            this.f42470b = hotSpotListDialog;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f42469a, false, 36612, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42469a, false, 36612, new Class[0], Void.TYPE);
                return;
            }
            this.f42470b.dismiss();
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f42456a, false, 36598, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f42456a, false, 36598, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (com.ss.android.ugc.aweme.discover.helper.b.f()) {
            setContentView((int) C0906R.layout.qf);
        } else {
            setContentView((int) C0906R.layout.qg);
        }
        if (PatchProxy.isSupport(new Object[0], this, f42456a, false, 36602, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42456a, false, 36602, new Class[0], Void.TYPE);
        } else {
            View findViewById = findViewById(C0906R.id.vd);
            if (findViewById == null) {
                Intrinsics.throwNpe();
            }
            this.f42459d = findViewById;
            View findViewById2 = findViewById(C0906R.id.cc5);
            if (findViewById2 == null) {
                Intrinsics.throwNpe();
            }
            this.f42457b = (RecyclerView) findViewById2;
            View findViewById3 = findViewById(C0906R.id.ix);
            if (findViewById3 == null) {
                Intrinsics.throwNpe();
            }
            findViewById3.setOnClickListener(new a(this));
            if (com.ss.android.ugc.aweme.discover.helper.b.f()) {
                RecyclerView recyclerView = this.f42457b;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("listView");
                }
                recyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext(), 1, false));
            } else {
                findViewById3.setVisibility(4);
                RecyclerView recyclerView2 = this.f42457b;
                if (recyclerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("listView");
                }
                recyclerView2.setLayoutManager(new WrapLinearLayoutManager(getContext(), 0, false));
            }
            RecyclerView recyclerView3 = this.f42457b;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listView");
            }
            recyclerView3.setAdapter(this.f42458c);
            RecyclerView recyclerView4 = this.f42457b;
            if (recyclerView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listView");
            }
            recyclerView4.setEdgeEffectFactory(new HotSpotListDialog$initView$2());
            View view = this.f42459d;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            view.post(new b(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f42456a, false, 36601, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42456a, false, 36601, new Class[0], Void.TYPE);
        } else {
            int screenHeight = UIUtils.getScreenHeight(getContext()) - UIUtils.getStatusBarHeight(getContext());
            Window window = getWindow();
            if (window != null) {
                if (screenHeight == 0) {
                    screenHeight = -1;
                }
                window.setLayout(-1, screenHeight);
                window.setGravity(80);
                Window window2 = getWindow();
                if (window2 == null) {
                    Intrinsics.throwNpe();
                }
                WindowManager.LayoutParams attributes = window2.getAttributes();
                attributes.gravity = 80;
                Window window3 = getWindow();
                if (window3 == null) {
                    Intrinsics.throwNpe();
                }
                window3.setAttributes(attributes);
                window.setWindowAnimations(C0906R.style.f3);
                setCanceledOnTouchOutside(true);
            }
        }
        setOnShowListener(new c(this));
        setOnDismissListener(new d(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HotSpotListDialog(@NotNull Context context, @NotNull HotSpotMainViewModel hotSpotMainViewModel) {
        super(context, C0906R.style.ff);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(hotSpotMainViewModel, "mainViewModel");
        this.f42460e = hotSpotMainViewModel;
    }
}
