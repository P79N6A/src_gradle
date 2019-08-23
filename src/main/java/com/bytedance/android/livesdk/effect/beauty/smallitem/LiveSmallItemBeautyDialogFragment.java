package com.bytedance.android.livesdk.effect.beauty.smallitem;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LiveDialogFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.effect.beauty.smallitem.LiveSmallItemBeautyAdapter;
import com.bytedance.android.livesdk.effect.k;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\n\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010&\u001a\u00020\u0014H\u0002J\u000e\u0010'\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyDialogFragment;", "Landroid/support/v4/app/LiveDialogFragment;", "()V", "beautyAdapter", "Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyAdapter;", "getBeautyAdapter", "()Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyAdapter;", "beautyAdapter$delegate", "Lkotlin/Lazy;", "beautyLoadCallback", "com/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyDialogFragment$beautyLoadCallback$1", "Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyDialogFragment$beautyLoadCallback$1;", "isCardUI", "", "onDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "selectSticker", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "initAdapter", "initView", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onViewCreated", "view", "refreshView", "setOnDismissListener", "Companion", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class LiveSmallItemBeautyDialogFragment extends LiveDialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13742a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f13743b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LiveSmallItemBeautyDialogFragment.class), "beautyAdapter", "getBeautyAdapter()Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyAdapter;"))};

    /* renamed from: f  reason: collision with root package name */
    public static final a f13744f = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdk.sticker.b.a f13745c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13746d;

    /* renamed from: e  reason: collision with root package name */
    public final c f13747e = new c(this);
    private DialogInterface.OnDismissListener g;
    private final Lazy h = LazyKt.lazy(new b(this));
    private HashMap i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyDialogFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyDialogFragment;", "isCardUI", "", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13748a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyAdapter;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class b extends Lambda implements Function0<LiveSmallItemBeautyAdapter> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ LiveSmallItemBeautyDialogFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LiveSmallItemBeautyDialogFragment liveSmallItemBeautyDialogFragment) {
            super(0);
            this.this$0 = liveSmallItemBeautyDialogFragment;
        }

        @NotNull
        public final LiveSmallItemBeautyAdapter invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 8260, new Class[0], LiveSmallItemBeautyAdapter.class)) {
                return (LiveSmallItemBeautyAdapter) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 8260, new Class[0], LiveSmallItemBeautyAdapter.class);
            }
            LiveSmallItemBeautyDialogFragment liveSmallItemBeautyDialogFragment = this.this$0;
            if (PatchProxy.isSupport(new Object[0], liveSmallItemBeautyDialogFragment, LiveSmallItemBeautyDialogFragment.f13742a, false, 8254, new Class[0], LiveSmallItemBeautyAdapter.class)) {
                return (LiveSmallItemBeautyAdapter) PatchProxy.accessDispatch(new Object[0], liveSmallItemBeautyDialogFragment, LiveSmallItemBeautyDialogFragment.f13742a, false, 8254, new Class[0], LiveSmallItemBeautyAdapter.class);
            }
            LiveSmallItemBeautyAdapter liveSmallItemBeautyAdapter = new LiveSmallItemBeautyAdapter();
            LiveSmallItemBeautyAdapter.a dVar = new d(liveSmallItemBeautyDialogFragment);
            if (PatchProxy.isSupport(new Object[]{dVar}, liveSmallItemBeautyAdapter, LiveSmallItemBeautyAdapter.f13730a, false, 8242, new Class[]{LiveSmallItemBeautyAdapter.a.class}, Void.TYPE)) {
                LiveSmallItemBeautyAdapter liveSmallItemBeautyAdapter2 = liveSmallItemBeautyAdapter;
                PatchProxy.accessDispatch(new Object[]{dVar}, liveSmallItemBeautyAdapter2, LiveSmallItemBeautyAdapter.f13730a, false, 8242, new Class[]{LiveSmallItemBeautyAdapter.a.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(dVar, "listener");
                liveSmallItemBeautyAdapter.f13733d = dVar;
            }
            return liveSmallItemBeautyAdapter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\b"}, d2 = {"com/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyDialogFragment$beautyLoadCallback$1", "Lcom/bytedance/android/livesdk/effect/LiveSmallItemBeautyHelper$LiveBeautyLoadCallback;", "onError", "", "onSuccess", "stickerList", "", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class c implements k.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13749a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveSmallItemBeautyDialogFragment f13750b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f13749a, false, 8262, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f13749a, false, 8262, new Class[0], Void.TYPE);
                return;
            }
            LoadingStatusView loadingStatusView = (LoadingStatusView) this.f13750b.a(C0906R.id.cs_);
            if (loadingStatusView != null) {
                loadingStatusView.d();
            }
        }

        c(LiveSmallItemBeautyDialogFragment liveSmallItemBeautyDialogFragment) {
            this.f13750b = liveSmallItemBeautyDialogFragment;
        }

        public final void a(@NotNull List<? extends com.bytedance.android.livesdk.sticker.b.a> list) {
            List<? extends com.bytedance.android.livesdk.sticker.b.a> list2 = list;
            if (PatchProxy.isSupport(new Object[]{list2}, this, f13749a, false, 8261, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list2}, this, f13749a, false, 8261, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list2, "stickerList");
            LiveSmallItemBeautyAdapter a2 = this.f13750b.a();
            if (PatchProxy.isSupport(new Object[]{list2}, a2, LiveSmallItemBeautyAdapter.f13730a, false, 8241, new Class[]{List.class}, Void.TYPE)) {
                LiveSmallItemBeautyAdapter liveSmallItemBeautyAdapter = a2;
                PatchProxy.accessDispatch(new Object[]{list2}, liveSmallItemBeautyAdapter, LiveSmallItemBeautyAdapter.f13730a, false, 8241, new Class[]{List.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(list2, "list");
                a2.f13731b = list2;
                a2.notifyDataSetChanged();
            }
            if (this.f13750b.f13745c == null) {
                this.f13750b.f13745c = (com.bytedance.android.livesdk.sticker.b.a) list2.get(0);
            }
            if (((LoadingStatusView) this.f13750b.a(C0906R.id.cs_)) != null) {
                LoadingStatusView loadingStatusView = (LoadingStatusView) this.f13750b.a(C0906R.id.cs_);
                Intrinsics.checkExpressionValueIsNotNull(loadingStatusView, "small_item_beauty_loading_view");
                loadingStatusView.setVisibility(8);
            }
            this.f13750b.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyDialogFragment$initAdapter$1", "Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyAdapter$OnSelectItemChangeListener;", "onChange", "", "sticker", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class d implements LiveSmallItemBeautyAdapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13751a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveSmallItemBeautyDialogFragment f13752b;

        d(LiveSmallItemBeautyDialogFragment liveSmallItemBeautyDialogFragment) {
            this.f13752b = liveSmallItemBeautyDialogFragment;
        }

        public final void a(@NotNull com.bytedance.android.livesdk.sticker.b.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f13751a, false, 8263, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f13751a, false, 8263, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(aVar, "sticker");
            this.f13752b.f13745c = aVar;
            this.f13752b.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13753a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveSmallItemBeautyDialogFragment f13754b;

        e(LiveSmallItemBeautyDialogFragment liveSmallItemBeautyDialogFragment) {
            this.f13754b = liveSmallItemBeautyDialogFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f13753a, false, 8264, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f13753a, false, 8264, new Class[]{View.class}, Void.TYPE);
                return;
            }
            this.f13754b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13755a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveSmallItemBeautyDialogFragment f13756b;

        f(LiveSmallItemBeautyDialogFragment liveSmallItemBeautyDialogFragment) {
            this.f13756b = liveSmallItemBeautyDialogFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f13755a, false, 8265, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f13755a, false, 8265, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.effect.b p = j.q().p();
            Intrinsics.checkExpressionValueIsNotNull(p, "LiveInternalService.inst().liveEffectService()");
            p.b().a((Fragment) this.f13756b, (k.c) this.f13756b.f13747e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyDialogFragment$initView$3", "Lcom/bytedance/android/livesdk/widget/AdjustPercentBar$OnLevelChangeListener;", "onChanged", "", "level", "", "onFreeze", "onTouched", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class g implements AdjustPercentBar.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13757a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveSmallItemBeautyDialogFragment f13758b;

        public final void a() {
        }

        public final void b(int i) {
        }

        g(LiveSmallItemBeautyDialogFragment liveSmallItemBeautyDialogFragment) {
            this.f13758b = liveSmallItemBeautyDialogFragment;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                r8 = 0
                r0[r8] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f13757a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 8266(0x204a, float:1.1583E-41)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0038
                java.lang.Object[] r0 = new java.lang.Object[r7]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                r0[r8] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f13757a
                r3 = 0
                r4 = 8266(0x204a, float:1.1583E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0038:
                com.bytedance.android.livesdk.effect.beauty.smallitem.LiveSmallItemBeautyDialogFragment r0 = r9.f13758b
                com.bytedance.android.livesdk.sticker.b.a r0 = r0.f13745c
                if (r0 != 0) goto L_0x003f
                return
            L_0x003f:
                com.bytedance.android.livesdk.v.f r0 = com.bytedance.android.livesdk.v.j.q()
                com.bytedance.android.livesdk.sticker.a.c r0 = r0.o()
                com.bytedance.android.livesdk.effect.beauty.smallitem.LiveSmallItemBeautyDialogFragment r1 = r9.f13758b
                com.bytedance.android.livesdk.sticker.b.a r1 = r1.f13745c
                if (r1 == 0) goto L_0x0054
                com.bytedance.android.livesdk.sticker.b.a$a r1 = r1.h
                if (r1 == 0) goto L_0x0054
                java.lang.String r1 = r1.f17256b
                goto L_0x0055
            L_0x0054:
                r1 = 0
            L_0x0055:
                com.bytedance.android.livesdk.effect.k$a r2 = com.bytedance.android.livesdk.effect.k.f13799c
                com.bytedance.android.livesdk.effect.beauty.smallitem.LiveSmallItemBeautyDialogFragment r3 = r9.f13758b
                com.bytedance.android.livesdk.sticker.b.a r3 = r3.f13745c
                if (r3 != 0) goto L_0x0060
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0060:
                float r2 = r2.a((com.bytedance.android.livesdk.sticker.b.a) r3, (int) r10)
                r0.a((java.lang.String) r1, (float) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.effect.beauty.smallitem.LiveSmallItemBeautyDialogFragment.g.a(int):void");
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f13742a, false, 8256, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f13742a, false, 8256, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.i == null) {
            this.i = new HashMap();
        }
        View view = (View) this.i.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.i.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final LiveSmallItemBeautyAdapter a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f13742a, false, 8245, new Class[0], LiveSmallItemBeautyAdapter.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f13742a, false, 8245, new Class[0], LiveSmallItemBeautyAdapter.class);
        } else {
            value = this.h.getValue();
        }
        return (LiveSmallItemBeautyAdapter) value;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f13742a, false, 8257, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13742a, false, 8257, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f13742a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 8255(0x203f, float:1.1568E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f13742a
            r5 = 0
            r6 = 8255(0x203f, float:1.1568E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            com.bytedance.android.livesdk.sticker.b.a r1 = r9.f13745c
            r2 = 0
            if (r1 == 0) goto L_0x002b
            com.bytedance.android.livesdk.sticker.b.a$a r1 = r1.h
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            r3 = 2131169997(0x7f0712cd, float:1.795434E38)
            if (r1 != 0) goto L_0x0042
            android.view.View r0 = r9.a(r3)
            com.bytedance.android.livesdk.widget.AdjustPercentBar r0 = (com.bytedance.android.livesdk.widget.AdjustPercentBar) r0
            java.lang.String r1 = "small_item_beauty_seek_bar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            return
        L_0x0042:
            android.view.View r1 = r9.a(r3)
            com.bytedance.android.livesdk.widget.AdjustPercentBar r1 = (com.bytedance.android.livesdk.widget.AdjustPercentBar) r1
            java.lang.String r4 = "small_item_beauty_seek_bar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            r1.setVisibility(r0)
            com.bytedance.android.livesdk.v.f r1 = com.bytedance.android.livesdk.v.j.q()
            com.bytedance.android.livesdk.sticker.a.c r1 = r1.o()
            com.bytedance.android.livesdk.sticker.b.a r4 = r9.f13745c
            if (r4 == 0) goto L_0x0063
            com.bytedance.android.livesdk.sticker.b.a$a r4 = r4.h
            if (r4 == 0) goto L_0x0063
            java.lang.String r4 = r4.f17256b
            goto L_0x0064
        L_0x0063:
            r4 = r2
        L_0x0064:
            java.lang.Float r1 = r1.c(r4)
            if (r1 != 0) goto L_0x0092
            com.bytedance.android.livesdk.effect.k$a r1 = com.bytedance.android.livesdk.effect.k.f13799c
            com.bytedance.android.livesdk.sticker.b.a r4 = r9.f13745c
            if (r4 != 0) goto L_0x0073
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0073:
            com.bytedance.android.livesdk.sticker.b.a r5 = r9.f13745c
            if (r5 == 0) goto L_0x0081
            com.bytedance.android.livesdk.sticker.b.a$a r5 = r5.h
            if (r5 == 0) goto L_0x0081
            int r2 = r5.f17255a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0081:
            if (r2 != 0) goto L_0x0086
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0086:
            int r2 = r2.intValue()
            float r1 = r1.a((com.bytedance.android.livesdk.sticker.b.a) r4, (int) r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
        L_0x0092:
            android.view.View r2 = r9.a(r3)
            com.bytedance.android.livesdk.widget.AdjustPercentBar r2 = (com.bytedance.android.livesdk.widget.AdjustPercentBar) r2
            java.lang.String r4 = "small_item_beauty_seek_bar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            com.bytedance.android.livesdk.effect.k$a r4 = com.bytedance.android.livesdk.effect.k.f13799c
            com.bytedance.android.livesdk.sticker.b.a r5 = r9.f13745c
            if (r5 != 0) goto L_0x00a6
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00a6:
            float r1 = r1.floatValue()
            int r1 = r4.a((com.bytedance.android.livesdk.sticker.b.a) r5, (float) r1)
            r2.setPercent(r1)
            com.bytedance.android.livesdk.sticker.b.a r1 = r9.f13745c
            r2 = 1
            if (r1 == 0) goto L_0x00cc
            com.bytedance.android.livesdk.sticker.b.a$a r1 = r1.h
            if (r1 == 0) goto L_0x00cc
            boolean r1 = r1.f17259e
            if (r1 != r2) goto L_0x00cc
            android.view.View r1 = r9.a(r3)
            com.bytedance.android.livesdk.widget.AdjustPercentBar r1 = (com.bytedance.android.livesdk.widget.AdjustPercentBar) r1
            r2 = 50
            r3 = -50
            r1.a(r2, r3, r0, r0)
            goto L_0x00d7
        L_0x00cc:
            android.view.View r1 = r9.a(r3)
            com.bytedance.android.livesdk.widget.AdjustPercentBar r1 = (com.bytedance.android.livesdk.widget.AdjustPercentBar) r1
            r3 = 100
            r1.a(r3, r0, r0, r2)
        L_0x00d7:
            com.bytedance.android.livesdk.v.f r0 = com.bytedance.android.livesdk.v.j.q()
            com.bytedance.android.livesdk.sticker.a.c r0 = r0.o()
            java.lang.String r1 = com.bytedance.android.livesdk.sticker.c.a.f17264e
            com.bytedance.android.livesdk.sticker.b.a r2 = r9.f13745c
            r0.a((java.lang.String) r1, (com.bytedance.android.livesdk.sticker.b.a) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.effect.beauty.smallitem.LiveSmallItemBeautyDialogFragment.b():void");
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f13742a, false, 8246, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f13742a, false, 8246, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.w7);
        setCancelable(true);
    }

    public final void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f13742a, false, 8247, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f13742a, false, 8247, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -2);
            }
        }
    }

    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f13742a, false, 8248, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f13742a, false, 8248, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkExpressionValueIsNotNull(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
        }
        return onCreateDialog;
    }

    public final void onDismiss(@Nullable DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f13742a, false, 8251, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f13742a, false, 8251, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            DialogInterface.OnDismissListener onDismissListener = this.g;
            if (onDismissListener == null) {
                Intrinsics.throwNpe();
            }
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f13742a, false, 8250, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f13742a, false, 8250, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f13742a, false, 8252, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13742a, false, 8252, new Class[0], Void.TYPE);
        } else {
            a(C0906R.id.a5n).setOnClickListener(new e(this));
            View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.a_c, null);
            inflate.setOnClickListener(new f(this));
            ((LoadingStatusView) a(C0906R.id.cs_)).setBuilder(LoadingStatusView.a.a(getContext()).c(inflate).a(getResources().getDimensionPixelSize(C0906R.dimen.ms)));
            ((LoadingStatusView) a(C0906R.id.cs_)).b();
            ((AdjustPercentBar) a(C0906R.id.csb)).setOnLevelChangeListener(new g(this));
            RecyclerView recyclerView = (RecyclerView) a(C0906R.id.csa);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "small_item_beauty_recycle_view");
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            RecyclerView recyclerView2 = (RecyclerView) a(C0906R.id.csa);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "small_item_beauty_recycle_view");
            recyclerView2.setAdapter(a());
            ((RecyclerView) a(C0906R.id.csa)).addItemDecoration(new LiveSmallItemBeautyItemDecoration());
            b();
        }
        com.bytedance.android.livesdk.effect.b p = j.q().p();
        Intrinsics.checkExpressionValueIsNotNull(p, "LiveInternalService.inst().liveEffectService()");
        p.b().a((Fragment) this, (k.c) this.f13747e);
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i2;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f13742a, false, 8249, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f13742a, false, 8249, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        if (this.f13746d) {
            i2 = C0906R.layout.afk;
        } else {
            i2 = C0906R.layout.afg;
        }
        return layoutInflater2.inflate(i2, viewGroup2, false);
    }
}
