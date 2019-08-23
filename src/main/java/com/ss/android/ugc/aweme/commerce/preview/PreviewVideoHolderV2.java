package com.ss.android.ugc.aweme.commerce.preview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.floatvideo.h;
import com.ss.android.ugc.aweme.commerce.preview.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J>\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2&\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eJ\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0010J\b\u0010\u0016\u001a\u00020\nH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/PreviewVideoHolderV2;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "parentView", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "playBox", "Lcom/ss/android/ugc/aweme/commerce/floatvideo/RecyclePlayBox;", "bind", "", "uid", "", "acb", "Lkotlin/Function4;", "Landroid/view/View;", "", "getTimeSpan", "timeInLong", "", "playVideo", "force", "removeLastVideoTexture", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PreviewVideoHolderV2 extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37264a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f37265c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    Aweme f37266b;

    /* renamed from: d  reason: collision with root package name */
    private h f37267d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/PreviewVideoHolderV2$Companion;", "", "()V", "SPAN_RATIO", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewVideoHolderV2$bind$2$1", "Lcom/ss/android/ugc/aweme/widget/flowlayout/TagAdapter;", "", "getView", "Landroid/view/View;", "parent", "Lcom/ss/android/ugc/aweme/widget/flowlayout/FlowLayout;", "position", "", "o", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends com.ss.android.ugc.aweme.widget.flowlayout.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f37269b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PreviewVideoHolderV2 f37270c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(List list, List list2, PreviewVideoHolderV2 previewVideoHolderV2) {
            super(list2);
            this.f37269b = list;
            this.f37270c = previewVideoHolderV2;
        }

        public final /* synthetic */ View a(FlowLayout flowLayout, int i, Object obj) {
            FlowLayout flowLayout2 = flowLayout;
            String str = (String) obj;
            if (PatchProxy.isSupport(new Object[]{flowLayout2, Integer.valueOf(i), str}, this, f37268a, false, 28796, new Class[]{FlowLayout.class, Integer.TYPE, String.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{flowLayout2, Integer.valueOf(i), str}, this, f37268a, false, 28796, new Class[]{FlowLayout.class, Integer.TYPE, String.class}, View.class);
            }
            Intrinsics.checkParameterIsNotNull(flowLayout, "parent");
            Intrinsics.checkParameterIsNotNull(str, "o");
            View view = this.f37270c.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            LayoutInflater from = LayoutInflater.from(view.getContext());
            View view2 = this.f37270c.itemView;
            if (view2 != null) {
                View inflate = from.inflate(C0906R.layout.a2r, (ViewGroup) view2, false);
                if (inflate != null) {
                    TextView textView = (TextView) inflate;
                    textView.setText(str);
                    textView.setIncludeFontPadding(false);
                    return textView;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37271a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewVideoHolderV2 f37272b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function4 f37273c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Aweme f37274d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f37275e;

        c(PreviewVideoHolderV2 previewVideoHolderV2, Function4 function4, Aweme aweme, String str) {
            this.f37272b = previewVideoHolderV2;
            this.f37273c = function4;
            this.f37274d = aweme;
            this.f37275e = str;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37271a, false, 28797, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37271a, false, 28797, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function4 function4 = this.f37273c;
            if (function4 != null) {
                Aweme aweme = this.f37274d;
                View view2 = this.f37272b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                RemoteImageView remoteImageView = (RemoteImageView) view2.findViewById(C0906R.id.c4e);
                Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "itemView.portfolio_item_image");
                function4.invoke(aweme, remoteImageView, this.f37275e, Boolean.FALSE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37276a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewVideoHolderV2 f37277b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function4 f37278c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Aweme f37279d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f37280e;

        d(PreviewVideoHolderV2 previewVideoHolderV2, Function4 function4, Aweme aweme, String str) {
            this.f37277b = previewVideoHolderV2;
            this.f37278c = function4;
            this.f37279d = aweme;
            this.f37280e = str;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37276a, false, 28798, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37276a, false, 28798, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function4 function4 = this.f37278c;
            if (function4 != null) {
                Aweme aweme = this.f37279d;
                View view2 = this.f37277b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                RemoteImageView remoteImageView = (RemoteImageView) view2.findViewById(C0906R.id.c4e);
                Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "itemView.portfolio_item_image");
                function4.invoke(aweme, remoteImageView, this.f37280e, Boolean.TRUE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "newProgress", "", "invoke", "com/ss/android/ugc/aweme/commerce/preview/PreviewVideoHolderV2$playVideo$1$1"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<Long, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Aweme $this_apply;
        final /* synthetic */ PreviewVideoHolderV2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Aweme aweme, PreviewVideoHolderV2 previewVideoHolderV2) {
            super(1);
            this.$this_apply = aweme;
            this.this$0 = previewVideoHolderV2;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 28799, new Class[]{Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 28799, new Class[]{Long.TYPE}, Void.TYPE);
                return;
            }
            View view = this.this$0.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view.findViewById(C0906R.id.d32);
            if (dmtTextView != null) {
                PreviewVideoHolderV2 previewVideoHolderV2 = this.this$0;
                Video video = this.$this_apply.getVideo();
                Intrinsics.checkExpressionValueIsNotNull(video, "video");
                dmtTextView.setText(previewVideoHolderV2.a(((long) video.getDuration()) - j));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/ugc/aweme/commerce/preview/PreviewVideoHolderV2$playVideo$1$2"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Aweme $this_apply;
        final /* synthetic */ PreviewVideoHolderV2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Aweme aweme, PreviewVideoHolderV2 previewVideoHolderV2) {
            super(0);
            this.$this_apply = aweme;
            this.this$0 = previewVideoHolderV2;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28800, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28800, new Class[0], Void.TYPE);
                return;
            }
            View view = this.this$0.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view.findViewById(C0906R.id.d32);
            if (dmtTextView != null) {
                PreviewVideoHolderV2 previewVideoHolderV2 = this.this$0;
                Video video = this.$this_apply.getVideo();
                Intrinsics.checkExpressionValueIsNotNull(video, "video");
                dmtTextView.setText(previewVideoHolderV2.a((long) video.getDuration()));
            }
            View view2 = this.this$0.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            View findViewById = view2.findViewById(C0906R.id.es);
            if (findViewById != null) {
                findViewById.setBackgroundResource(2130838471);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewVideoHolderV2(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a2h, viewGroup, false));
        Intrinsics.checkParameterIsNotNull(viewGroup, "parentView");
    }

    public final String a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f37264a, false, 28792, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f37264a, false, 28792, new Class[]{Long.TYPE}, String.class);
        }
        String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j2) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j2))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j2) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j2)))}, 2));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f37264a, false, 28794, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f37264a, false, 28794, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!Intrinsics.areEqual((Object) m.a.b(), (Object) this.f37266b) || z) {
            Aweme aweme = this.f37266b;
            if (aweme != null) {
                m.a aVar = m.f37518c;
                View view = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C0906R.id.arp);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "itemView.image_wrap_box");
                View view2 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                RemoteImageView remoteImageView = (RemoteImageView) view2.findViewById(C0906R.id.c4e);
                Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "itemView.portfolio_item_image");
                this.f37267d = aVar.a(relativeLayout, remoteImageView, aweme);
                h hVar = this.f37267d;
                if (hVar != null) {
                    hVar.a((Function1<? super Long, Unit>) new e<Object,Unit>(aweme, this));
                }
                h hVar2 = this.f37267d;
                if (hVar2 != null) {
                    hVar2.a((Function0<Unit>) new f<Unit>(aweme, this));
                }
                View view3 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                View findViewById = view3.findViewById(C0906R.id.es);
                if (findViewById != null) {
                    findViewById.setBackgroundResource(2130838470);
                }
            }
        }
    }
}
