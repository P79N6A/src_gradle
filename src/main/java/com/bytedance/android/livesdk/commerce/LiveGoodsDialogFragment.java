package com.bytedance.android.livesdk.commerce;

import android.app.Dialog;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.paging.PagedList;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LiveDialogFragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.a.o;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.live.core.widget.simple.SimpleListViewModel;
import com.bytedance.android.live.core.widget.simple.SimpleViewHolder;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bytedance/android/livesdk/commerce/LiveGoodsDialogFragment;", "Landroid/support/v4/app/LiveDialogFragment;", "()V", "countView", "Landroid/widget/TextView;", "goodsListView", "Landroid/support/v7/widget/RecyclerView;", "roomId", "", "userId", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
@Deprecated(message = "instead by com.bytedance.android.livesdk.livecommerce.broadcast.ui.LiveRoomPromotionListFragment")
public final class LiveGoodsDialogFragment extends LiveDialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f1843a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f1844e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public long f1845b;

    /* renamed from: c  reason: collision with root package name */
    public long f1846c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f1847d;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView f1848f;
    private HashMap g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/android/livesdk/commerce/LiveGoodsDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/bytedance/android/livesdk/commerce/LiveGoodsDialogFragment;", "userId", "", "roomId", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13582a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveGoodsDialogFragment f13583b;

        b(LiveGoodsDialogFragment liveGoodsDialogFragment) {
            this.f13583b = liveGoodsDialogFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f13582a, false, 8053, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f13582a, false, 8053, new Class[]{View.class}, Void.TYPE);
                return;
            }
            this.f13583b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "n", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 13})
    static final class c<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13584a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveGoodsDialogFragment f13585b;

        c(LiveGoodsDialogFragment liveGoodsDialogFragment) {
            this.f13585b = liveGoodsDialogFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (PatchProxy.isSupport(new Object[]{num}, this, f13584a, false, 8054, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f13584a, false, 8054, new Class[]{Integer.class}, Void.TYPE);
            } else if (num == null || Intrinsics.compare(num.intValue(), 0) <= 0) {
                TextView textView = this.f13585b.f1847d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else {
                TextView textView2 = this.f13585b.f1847d;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                TextView textView3 = this.f13585b.f1847d;
                if (textView3 != null) {
                    textView3.setText(ac.a((int) C0906R.string.dcf, num));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "res", "Lcom/bytedance/android/live/core/network/NetworkStat;", "onChanged"}, k = 3, mv = {1, 1, 13})
    static final class d<T> implements Observer<com.bytedance.android.live.core.network.d> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13586a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f13587b;

        d(Ref.ObjectRef objectRef) {
            this.f13587b = objectRef;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.android.live.core.network.d dVar = (com.bytedance.android.live.core.network.d) obj;
            if (PatchProxy.isSupport(new Object[]{dVar}, this, f13586a, false, 8055, new Class[]{com.bytedance.android.live.core.network.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar}, this, f13586a, false, 8055, new Class[]{com.bytedance.android.live.core.network.d.class}, Void.TYPE);
                return;
            }
            if (dVar != null) {
                if (dVar == com.bytedance.android.live.core.network.d.f7861d) {
                    ((LoadingStatusView) this.f13587b.element).b();
                    return;
                }
                ((LoadingStatusView) this.f13587b.element).setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"com/bytedance/android/livesdk/commerce/LiveGoodsDialogFragment$onViewCreated$4", "Lcom/bytedance/android/live/core/widget/simple/SimpleViewHolderType;", "Lcom/bytedance/android/livesdk/commerce/LiveGoods;", "", "bind", "", "simpleViewHolder", "Lcom/bytedance/android/live/core/widget/simple/SimpleViewHolder;", "data", "position", "", "getLayoutResId", "match", "", "unBind", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class e extends com.bytedance.android.live.core.widget.simple.a<d, Object> {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f13588b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LiveGoodsDialogFragment f13589c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13590a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f13591b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d f13592c;

            a(e eVar, d dVar) {
                this.f13591b = eVar;
                this.f13592c = dVar;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f13590a, false, 8058, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f13590a, false, 8058, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                al.a(al.b.CLICK, "", "").a("room_id", this.f13591b.f13589c.f1846c).a("anchor_id", this.f13591b.f13589c.f1845b).a("commodity_id", this.f13592c.f13622b).a("hotsoonlive_commodity_click");
                TTLiveSDKContext.getHostService().i().a((Context) this.f13591b.f13589c.getActivity(), this.f13592c.g);
            }
        }

        public final int a() {
            return C0906R.layout.ajp;
        }

        e(LiveGoodsDialogFragment liveGoodsDialogFragment) {
            this.f13589c = liveGoodsDialogFragment;
        }

        public final boolean a(@Nullable Object obj) {
            return obj instanceof d;
        }

        public final /* synthetic */ void a(SimpleViewHolder simpleViewHolder, Object obj) {
            d dVar = (d) obj;
            if (PatchProxy.isSupport(new Object[]{simpleViewHolder, dVar}, this, f13588b, false, 8057, new Class[]{SimpleViewHolder.class, d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{simpleViewHolder, dVar}, this, f13588b, false, 8057, new Class[]{SimpleViewHolder.class, d.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(simpleViewHolder, "simpleViewHolder");
            Intrinsics.checkParameterIsNotNull(dVar, "data");
            if (System.currentTimeMillis() - simpleViewHolder.a("start_time") > 100) {
                al.a(al.b.SHOW, "", "").a("room_id", this.f13589c.f1846c).a("anchor_id", this.f13589c.f1845b).a("commodity_id", dVar.f13622b).a("hotsoonlive_commodity_show");
            }
        }

        public final /* synthetic */ void a(SimpleViewHolder simpleViewHolder, Object obj, int i) {
            int i2;
            int i3;
            String str;
            SimpleViewHolder simpleViewHolder2 = simpleViewHolder;
            d dVar = (d) obj;
            if (PatchProxy.isSupport(new Object[]{simpleViewHolder2, dVar, Integer.valueOf(i)}, this, f13588b, false, 8056, new Class[]{SimpleViewHolder.class, d.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{simpleViewHolder2, dVar, Integer.valueOf(i)}, this, f13588b, false, 8056, new Class[]{SimpleViewHolder.class, d.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(simpleViewHolder2, "simpleViewHolder");
            Intrinsics.checkParameterIsNotNull(dVar, "data");
            simpleViewHolder2.a((int) C0906R.id.title, dVar.f13625e);
            simpleViewHolder2.a((int) C0906R.id.c5v, String.valueOf(dVar.f13624d / 100));
            if (!TextUtils.isEmpty(dVar.h)) {
                simpleViewHolder2.a((int) C0906R.id.ble, dVar.h);
                i3 = 1;
                i2 = 2;
            } else {
                i2 = 2;
                i3 = 1;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ble)}, simpleViewHolder, SimpleViewHolder.f8365a, false, 1530, new Class[]{Integer.TYPE}, SimpleViewHolder.class)) {
                    SimpleViewHolder simpleViewHolder3 = simpleViewHolder;
                    SimpleViewHolder simpleViewHolder4 = (SimpleViewHolder) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ble)}, simpleViewHolder3, SimpleViewHolder.f8365a, false, 1530, new Class[]{Integer.TYPE}, SimpleViewHolder.class);
                } else {
                    View a2 = simpleViewHolder2.a((int) C0906R.id.ble);
                    if (a2 != null) {
                        a2.setVisibility(8);
                    }
                }
            }
            int i4 = dVar.f13624d % 100;
            StringBuilder sb = new StringBuilder();
            if (i4 > 10) {
                str = ClassUtils.PACKAGE_SEPARATOR;
            } else {
                str = ".0";
            }
            sb.append(str);
            sb.append(i4);
            simpleViewHolder2.a((int) C0906R.id.c5w, sb.toString());
            Object[] objArr = new Object[i3];
            objArr[0] = Integer.valueOf(dVar.f13626f);
            simpleViewHolder2.a((int) C0906R.id.cj2, ac.a((int) C0906R.string.dch, objArr));
            q.b((ImageView) simpleViewHolder2.a((int) C0906R.id.a1a), dVar.f13623c);
            simpleViewHolder2.itemView.setOnClickListener(new a(this, dVar));
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            Object[] objArr2 = new Object[i2];
            objArr2[0] = "start_time";
            objArr2[i3] = valueOf;
            ChangeQuickRedirect changeQuickRedirect = SimpleViewHolder.f8365a;
            Class[] clsArr = new Class[i2];
            clsArr[0] = String.class;
            clsArr[i3] = Object.class;
            if (PatchProxy.isSupport(objArr2, simpleViewHolder, changeQuickRedirect, false, 1532, clsArr, Void.TYPE)) {
                Object[] objArr3 = new Object[i2];
                objArr3[0] = "start_time";
                objArr3[i3] = valueOf;
                ChangeQuickRedirect changeQuickRedirect2 = SimpleViewHolder.f8365a;
                Class[] clsArr2 = new Class[i2];
                clsArr2[0] = String.class;
                clsArr2[i3] = Object.class;
                PatchProxy.accessDispatch(objArr3, simpleViewHolder, changeQuickRedirect2, false, 1532, clsArr2, Void.TYPE);
                return;
            }
            simpleViewHolder2.f8366d.put("start_time", valueOf);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u000e"}, d2 = {"com/bytedance/android/livesdk/commerce/LiveGoodsDialogFragment$onViewCreated$5", "Lcom/bytedance/android/live/core/widget/simple/SimpleViewHolderType;", "Lcom/bytedance/android/livesdk/commerce/LiveGoodsBanner;", "", "bind", "", "simpleViewHolder", "Lcom/bytedance/android/live/core/widget/simple/SimpleViewHolder;", "data", "position", "", "getLayoutResId", "match", "", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class f extends com.bytedance.android.live.core.widget.simple.a<e, Object> {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f13593b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LiveGoodsViewModel f13594c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13595a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f13596b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e f13597c;

            a(f fVar, e eVar) {
                this.f13596b = fVar;
                this.f13597c = eVar;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f13595a, false, 8060, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f13595a, false, 8060, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                LiveGoodsViewModel liveGoodsViewModel = this.f13596b.f13594c;
                e eVar = this.f13597c;
                if (PatchProxy.isSupport(new Object[]{eVar}, liveGoodsViewModel, LiveGoodsViewModel.n, false, 8062, new Class[]{e.class}, Void.TYPE)) {
                    LiveGoodsViewModel liveGoodsViewModel2 = liveGoodsViewModel;
                    PatchProxy.accessDispatch(new Object[]{eVar}, liveGoodsViewModel2, LiveGoodsViewModel.n, false, 8062, new Class[]{e.class}, Void.TYPE);
                    return;
                }
                if (eVar != null) {
                    liveGoodsViewModel.r.a(Long.valueOf(eVar.f13627a));
                    if (PatchProxy.isSupport(new Object[]{eVar}, liveGoodsViewModel, PagingViewModel.f7972b, false, 603, new Class[]{Object.class}, Void.TYPE)) {
                        LiveGoodsViewModel liveGoodsViewModel3 = liveGoodsViewModel;
                        PatchProxy.accessDispatch(new Object[]{eVar}, liveGoodsViewModel3, PagingViewModel.f7972b, false, 603, new Class[]{Object.class}, Void.TYPE);
                    } else {
                        if (!(liveGoodsViewModel.i == null || eVar == null)) {
                            liveGoodsViewModel.i.a(eVar);
                        }
                    }
                }
            }
        }

        public final int a() {
            return C0906R.layout.ajq;
        }

        f(LiveGoodsViewModel liveGoodsViewModel) {
            this.f13594c = liveGoodsViewModel;
        }

        public final boolean a(@Nullable Object obj) {
            return obj instanceof e;
        }

        public final /* synthetic */ void a(SimpleViewHolder simpleViewHolder, Object obj, int i) {
            SimpleViewHolder simpleViewHolder2 = simpleViewHolder;
            e eVar = (e) obj;
            if (PatchProxy.isSupport(new Object[]{simpleViewHolder2, eVar, Integer.valueOf(i)}, this, f13593b, false, 8059, new Class[]{SimpleViewHolder.class, e.class, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {simpleViewHolder2, eVar, Integer.valueOf(i)};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f13593b, false, 8059, new Class[]{SimpleViewHolder.class, e.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(simpleViewHolder2, "simpleViewHolder");
            Intrinsics.checkParameterIsNotNull(eVar, "data");
            simpleViewHolder2.a((int) C0906R.id.text, eVar.f13628b);
            View.OnClickListener aVar = new a(this, eVar);
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.a3_), aVar}, simpleViewHolder, SimpleViewHolder.f8365a, false, 1528, new Class[]{Integer.TYPE, View.OnClickListener.class}, SimpleViewHolder.class)) {
                SimpleViewHolder simpleViewHolder3 = simpleViewHolder;
                SimpleViewHolder simpleViewHolder4 = (SimpleViewHolder) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.a3_), aVar}, simpleViewHolder3, SimpleViewHolder.f8365a, false, 1528, new Class[]{Integer.TYPE, View.OnClickListener.class}, SimpleViewHolder.class);
            } else {
                simpleViewHolder2.a((int) C0906R.id.a3_).setOnClickListener(aVar);
            }
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f1843a, false, 8050, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1843a, false, 8050, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.clear();
        }
    }

    public final void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f1843a, false, 8045, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f1843a, false, 8045, new Class[]{Bundle.class}, Void.TYPE);
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

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f1843a, false, 8044, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f1843a, false, 8044, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.vm);
        setCancelable(true);
        Bundle arguments = getArguments();
        if (arguments == null) {
            dismiss();
            return;
        }
        this.f1845b = arguments.getLong("user_id");
        this.f1846c = arguments.getLong("room_id");
    }

    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f1843a, false, 8046, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f1843a, false, 8046, new Class[]{Bundle.class}, Dialog.class);
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
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f1843a, false, 8048, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f1843a, false, 8048, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        view2.findViewById(C0906R.id.ti).setOnClickListener(new b(this));
        this.f1847d = (TextView) view2.findViewById(C0906R.id.a08);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T findViewById = view2.findViewById(C0906R.id.cvd);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.status_view)");
        objectRef.element = (LoadingStatusView) findViewById;
        this.f1848f = (RecyclerView) view2.findViewById(C0906R.id.bcl);
        RecyclerView recyclerView = this.f1848f;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new SSLinearLayoutManager(getActivity(), 1, false));
        }
        ViewModel viewModel = ViewModelProviders.of((Fragment) this).get(LiveGoodsViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(th…odsViewModel::class.java)");
        LiveGoodsViewModel liveGoodsViewModel = (LiveGoodsViewModel) viewModel;
        LifecycleOwner lifecycleOwner = this;
        liveGoodsViewModel.q.observe(lifecycleOwner, new c(this));
        liveGoodsViewModel.f7975d.observe(lifecycleOwner, new d(objectRef));
        liveGoodsViewModel.p = this.f1845b;
        SimpleListViewModel a2 = liveGoodsViewModel.a((com.bytedance.android.live.core.widget.simple.b<T>) new e<T>(this)).a((com.bytedance.android.live.core.widget.simple.b<T>) new f<T>(liveGoodsViewModel));
        RecyclerView recyclerView2 = this.f1848f;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, a2, SimpleListViewModel.f8361a, false, 1514, new Class[]{RecyclerView.class}, SimpleListViewModel.class)) {
            SimpleListViewModel simpleListViewModel = a2;
            a2 = (SimpleListViewModel) PatchProxy.accessDispatch(new Object[]{recyclerView2}, simpleListViewModel, SimpleListViewModel.f8361a, false, 1514, new Class[]{RecyclerView.class}, SimpleListViewModel.class);
        } else {
            recyclerView2.setAdapter(a2.l);
        }
        if (PatchProxy.isSupport(new Object[0], a2, SimpleListViewModel.f8361a, false, 1516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, SimpleListViewModel.f8361a, false, 1516, new Class[0], Void.TYPE);
            return;
        }
        a2.a(new com.bytedance.android.live.core.paging.a.d().a((com.bytedance.android.live.core.paging.b.b<V>) a2).a(new PagedList.Config.Builder().setEnablePlaceholders(false).setPageSize(10).setPrefetchDistance(5).build()).a(o.a()).a(a2.m, new com.bytedance.android.live.core.a.e()).j());
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f1843a, false, 8047, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f1843a, false, 8047, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.agc, viewGroup2, false);
    }
}
