package com.ss.android.ugc.aweme.discover.hotspot.list;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.hotspot.SpotChangeCallBack;
import com.ss.android.ugc.aweme.discover.hotspot.SpotCurWordChangeCallBack;
import com.ss.android.ugc.aweme.discover.hotspot.j;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.discover.widget.HotSearchTitleTextView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 :2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001:B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u00032\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020/2\u0006\u00101\u001a\u000202H\u0016J\u001a\u00104\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u00032\u0006\u00101\u001a\u000202H\u0016J\u0018\u00105\u001a\u00020/2\u0006\u00106\u001a\u00020!2\b\b\u0002\u00107\u001a\u00020!J\u0010\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020!H\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010%\u001a\u00020&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010\u0018¨\u0006;"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/list/HotSpotViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/ugc/aweme/hotsearch/viewholder/IViewHolder;", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "itemView", "Landroid/view/View;", "mListener", "Lcom/ss/android/ugc/aweme/discover/hotspot/list/ItemCallback;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/discover/hotspot/list/ItemCallback;)V", "bgImageView", "Landroid/widget/ImageView;", "getBgImageView", "()Landroid/widget/ImageView;", "mCover", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "getMCover", "()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "setMCover", "(Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;)V", "mHotVideoOrder", "Landroid/widget/TextView;", "getMHotVideoOrder", "()Landroid/widget/TextView;", "setMHotVideoOrder", "(Landroid/widget/TextView;)V", "mItem", "getMItem", "()Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "setMItem", "(Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;)V", "mLastItemClickTime", "", "mUseForScreenShoot", "", "mVideoCount", "getMVideoCount", "setMVideoCount", "mVideoTitle", "Lcom/ss/android/ugc/aweme/discover/widget/HotSearchTitleTextView;", "getMVideoTitle", "()Lcom/ss/android/ugc/aweme/discover/widget/HotSearchTitleTextView;", "setMVideoTitle", "(Lcom/ss/android/ugc/aweme/discover/widget/HotSearchTitleTextView;)V", "mViewCount", "getMViewCount", "setMViewCount", "bindData", "", "item", "position", "", "mob", "setContentView", "setSelected", "isCurrent", "useAnimation", "setUseForScreenShoot", "useForScreenShoot", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HotSpotViewHolder extends RecyclerView.ViewHolder implements com.ss.android.ugc.aweme.hotsearch.viewholder.a<HotSearchItem> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42472a;
    public static final a k = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public TextView f42473b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public HotSearchTitleTextView f42474c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public TextView f42475d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public TextView f42476e;

    /* renamed from: f  reason: collision with root package name */
    public long f42477f;
    @Nullable
    public HotSearchItem g;
    @NotNull
    public RemoteImageView h;
    @Nullable
    public final ImageView i;
    public final b j;
    private boolean l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/list/HotSpotViewHolder$Companion;", "", "()V", "createViewHolder", "Lcom/ss/android/ugc/aweme/discover/hotspot/list/HotSpotViewHolder;", "view", "Landroid/view/ViewGroup;", "callback", "Lcom/ss/android/ugc/aweme/discover/hotspot/list/ItemCallback;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42478a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/discover/hotspot/list/HotSpotViewHolder$setContentView$1", "Lcom/ss/android/ugc/aweme/discover/ui/OnSearchItemTouchAnimListener;", "onAction", "", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends ai {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42479a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HotSpotViewHolder f42480b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HotSearchItem f42481c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f42482d;

        public final void b(@NotNull View view, @NotNull MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f42479a, false, 36622, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f42479a, false, 36622, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(motionEvent, "event");
            if (System.currentTimeMillis() - this.f42480b.f42477f >= 500) {
                this.f42480b.f42477f = System.currentTimeMillis();
                this.f42480b.j.a(this.f42481c, this.f42482d, view);
                this.f42480b.a(true, true);
                SpotChangeCallBack.a aVar = SpotChangeCallBack.f42414d;
                View view2 = this.f42480b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                Context context = view2.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
                r.a("trending_topic_click", (Map) aVar.a(context, this.f42481c));
            }
        }

        b(HotSpotViewHolder hotSpotViewHolder, HotSearchItem hotSearchItem, int i) {
            this.f42480b = hotSpotViewHolder;
            this.f42481c = hotSearchItem;
            this.f42482d = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hotsearchItem", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<String, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ HotSpotViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(HotSpotViewHolder hotSpotViewHolder) {
            super(1);
            this.this$0 = hotSpotViewHolder;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable String str) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 36623, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 36623, new Class[]{String.class}, Void.TYPE);
                return;
            }
            HotSearchItem hotSearchItem = this.this$0.g;
            if (hotSearchItem != null) {
                String word = hotSearchItem.getWord();
                if (word != null) {
                    z = word.equals(str);
                    this.this$0.a(z, false);
                }
            }
            z = false;
            this.this$0.a(z, false);
        }
    }

    public final void a(int i2) {
    }

    public final void c_(boolean z) {
        this.l = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HotSpotViewHolder(@NotNull View view, @NotNull b bVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(bVar, "mListener");
        this.j = bVar;
        View findViewById = view.findViewById(C0906R.id.ap6);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.hot_video_order)");
        this.f42473b = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.dt4);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.video_title)");
        this.f42474c = (HotSearchTitleTextView) findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.ap9);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.hot_video_view_count)");
        this.f42475d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0906R.id.drv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.video_cover)");
        this.h = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(C0906R.id.ap5);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.hot_video_count)");
        this.f42476e = (TextView) findViewById5;
        this.i = (ImageView) view.findViewById(C0906R.id.drw);
    }

    private void b(@Nullable HotSearchItem hotSearchItem, int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{hotSearchItem, Integer.valueOf(i2)}, this, f42472a, false, 36619, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSearchItem, Integer.valueOf(i2)}, this, f42472a, false, 36619, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE);
        } else if (hotSearchItem != null) {
            this.g = hotSearchItem;
            this.f42474c.setInSpot(true);
            this.f42474c.setHotSearchItem(hotSearchItem);
            TextView textView = this.f42476e;
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            Context context = view.getContext();
            if (com.ss.android.ugc.aweme.discover.helper.b.f()) {
                i3 = C0906R.string.c_f;
            } else {
                i3 = C0906R.string.c_g;
            }
            textView.setText(context.getString(i3, new Object[]{Integer.valueOf(hotSearchItem.getVideoCount())}));
            com.ss.android.ugc.aweme.base.c.b(this.h, hotSearchItem.getUrlModel());
            this.itemView.setOnTouchListener(new b(this, hotSearchItem, i2));
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            Activity a2 = v.a(view2.getContext());
            if (a2 != null) {
                FragmentActivity fragmentActivity = (FragmentActivity) a2;
                SpotCurWordChangeCallBack.f42418b.a(fragmentActivity, fragmentActivity, new c(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public final void a_(@Nullable HotSearchItem hotSearchItem, int i2) {
        if (PatchProxy.isSupport(new Object[]{hotSearchItem, Integer.valueOf(i2)}, this, f42472a, false, 36618, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSearchItem, Integer.valueOf(i2)}, this, f42472a, false, 36618, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE);
        } else if (hotSearchItem != null) {
            if (com.ss.android.ugc.aweme.discover.helper.b.f()) {
                View view = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                com.ss.android.ugc.aweme.hotsearch.d.b.a(view.getContext(), this.f42473b, i2);
            } else {
                j.a aVar = j.f42447b;
                View view2 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                Context context = view2.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
                aVar.a(context, this.f42473b, i2, this.i);
            }
            com.ss.android.ugc.aweme.hotsearch.d.b.a(this.f42475d, hotSearchItem.getHotValue());
            b(hotSearchItem, i2);
            if (!hotSearchItem.getHasSentMob()) {
                hotSearchItem.setHasSentMob(true);
                SpotChangeCallBack.a aVar2 = SpotChangeCallBack.f42414d;
                View view3 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                Context context2 = view3.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "itemView.context");
                r.a("trending_topic_show", (Map) aVar2.a(context2, hotSearchItem));
            }
        }
    }

    public final void a(boolean z, boolean z2) {
        float f2;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f42472a, false, 36620, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f42472a, false, 36620, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.discover.helper.b.g()) {
            View findViewById = this.itemView.findViewById(C0906R.id.drx);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            if (findViewById != null) {
                if (z2) {
                    findViewById.animate().alpha(f2).setDuration(100).start();
                } else {
                    findViewById.setAlpha(f2);
                }
            }
            return;
        }
        View view = this.itemView;
        if (z) {
            i2 = Color.parseColor("#0fffffff");
        }
        view.setBackgroundColor(i2);
    }
}
