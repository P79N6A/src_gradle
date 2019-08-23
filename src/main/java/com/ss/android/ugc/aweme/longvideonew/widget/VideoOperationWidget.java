package com.ss.android.ugc.aweme.longvideonew.widget;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.comment.a;
import com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.longvideo.DiggView;
import com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView;
import com.ss.android.ugc.aweme.longvideonew.b;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.u.v;
import com.ss.android.ugc.aweme.utils.GenericWidget;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B1\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0012\u0010*\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010,\u001a\u00020'2\b\u0010-\u001a\u0004\u0018\u00010)H\u0016J\b\u0010.\u001a\u00020'H\u0016J\b\u0010/\u001a\u00020'H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00060"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/widget/VideoOperationWidget;", "Lcom/ss/android/ugc/aweme/utils/GenericWidget;", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "Landroid/view/View$OnClickListener;", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mEventType", "", "mPageType", "", "mBusinessType", "mDialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;Ljava/lang/String;ILjava/lang/String;Lcom/ss/android/ugc/aweme/feed/DialogController;)V", "getMAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getMBusinessType", "()Ljava/lang/String;", "mCommentCountControl", "Lcom/ss/android/ugc/aweme/longvideonew/CommentCountControl;", "getMCommentCountControl", "()Lcom/ss/android/ugc/aweme/longvideonew/CommentCountControl;", "setMCommentCountControl", "(Lcom/ss/android/ugc/aweme/longvideonew/CommentCountControl;)V", "getMDialogController", "()Lcom/ss/android/ugc/aweme/feed/DialogController;", "mDiggView", "Lcom/ss/android/ugc/aweme/longvideo/DiggView;", "getMEventType", "getMPageType", "()I", "mRootView", "Landroid/view/ViewGroup;", "getMRootView", "()Landroid/view/ViewGroup;", "setMRootView", "(Landroid/view/ViewGroup;)V", "onBindView", "", "view", "Landroid/view/View;", "onChanged", "t", "onClick", "v", "onCreate", "onDestroy", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VideoOperationWidget extends GenericWidget implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>, View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54088a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f54089b;
    @Nullable
    public com.ss.android.ugc.aweme.longvideonew.a k;
    @Nullable
    public final Aweme l;
    @NotNull
    public final String m;
    public final int n;
    @NotNull
    public final String o;
    @Nullable
    public final d p;
    private DiggView q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/longvideonew/widget/VideoOperationWidget$onBindView$1", "Lcom/ss/android/ugc/aweme/longvideo/DiggView$IDiggCallback;", "onDigg", "", "onUndigg", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements DiggView.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54090a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoOperationWidget f54091b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f54090a, false, 56982, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54090a, false, 56982, new Class[0], Void.TYPE);
                return;
            }
            new v().e(this.f54091b.m).f(this.f54091b.m).a(this.f54091b.n).f(this.f54091b.l).b(1).e();
        }

        a(VideoOperationWidget videoOperationWidget) {
            this.f54091b = videoOperationWidget;
        }
    }

    public final void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f54088a, false, 56977, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54088a, false, 56977, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        Observer observer = this;
        this.g.a("action_is_landscape_mode", observer).a("action_container_on_double_click_digg", observer);
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f54088a, false, 56978, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54088a, false, 56978, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        DiggView diggView = this.q;
        if (diggView != null) {
            diggView.onDestroy();
        }
        com.ss.android.ugc.aweme.longvideonew.a aVar = this.k;
        if (aVar != null) {
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.longvideonew.a.f3485a, false, 56814, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.longvideonew.a.f3485a, false, 56814, new Class[0], Void.TYPE);
            } else {
                bg.d(aVar);
            }
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.a aVar = (com.ss.android.ugc.aweme.arch.widgets.base.a) obj;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f54088a, false, 56980, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f54088a, false, 56980, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            str = aVar.f34376a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -338693263) {
                if (hashCode == 929573523 && str.equals("action_is_landscape_mode")) {
                    ViewGroup viewGroup = this.f54089b;
                    if (viewGroup != null) {
                        Object a2 = aVar.a();
                        Intrinsics.checkExpressionValueIsNotNull(a2, "t.getData()");
                        if (((Boolean) a2).booleanValue()) {
                            i = 8;
                        }
                        viewGroup.setVisibility(i);
                    }
                }
            } else if (str.equals("action_container_on_double_click_digg")) {
                DiggView diggView = this.q;
                if (diggView != null) {
                    diggView.a();
                }
            }
        }
    }

    public final void a(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f54088a, false, 56979, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54088a, false, 56979, new Class[]{View.class}, Void.TYPE);
        } else if (view != null) {
            this.f54089b = (ViewGroup) view;
            TextView textView = null;
            View inflate = LayoutInflater.from(c()).inflate(C0906R.layout.a9v, null, false);
            if (inflate != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                ViewGroup viewGroup = this.f54089b;
                if (viewGroup != null) {
                    viewGroup.addView(linearLayout);
                }
                View findViewById = linearLayout.findViewById(C0906R.id.b2n);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "operationView.findViewById(R.id.iv_like)");
                LongVideoDiggAnimationView longVideoDiggAnimationView = (LongVideoDiggAnimationView) findViewById;
                View findViewById2 = ((ViewGroup) c().findViewById(16908290)).findViewById(C0906R.id.ww);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "root.findViewById(R.id.commerce_like_layout)");
                CommerceLikeLayout commerceLikeLayout = (CommerceLikeLayout) findViewById2;
                if (b.f54028a.a()) {
                    textView = (TextView) linearLayout.findViewById(C0906R.id.db2);
                    textView.setOnClickListener(this);
                    Intrinsics.checkExpressionValueIsNotNull(textView, "diggCountView");
                    textView.setVisibility(0);
                }
                this.q = new DiggView(longVideoDiggAnimationView, textView, this.m);
                DiggView diggView = this.q;
                if (diggView != null) {
                    Activity c2 = c();
                    if (c2 != null) {
                        diggView.a((AmeSSActivity) c2, this.l, commerceLikeLayout, this.m);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.AmeSSActivity");
                    }
                }
                DiggView diggView2 = this.q;
                if (diggView2 != null) {
                    diggView2.a((DiggView.a) new a(this));
                }
                View findViewById3 = linearLayout.findViewById(C0906R.id.b02);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "operationView.findViewById(R.id.iv_comment)");
                View.OnClickListener onClickListener = this;
                ((ImageView) findViewById3).setOnClickListener(onClickListener);
                View findViewById4 = linearLayout.findViewById(C0906R.id.b54);
                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "operationView.findViewById(R.id.iv_share)");
                ((ImageView) findViewById4).setOnClickListener(onClickListener);
                if (b.f54028a.a()) {
                    View findViewById5 = linearLayout.findViewById(C0906R.id.d_r);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById5, "operationView.findViewById(R.id.tv_comment_count)");
                    TextView textView2 = (TextView) findViewById5;
                    textView2.setOnClickListener(onClickListener);
                    this.k = new com.ss.android.ugc.aweme.longvideonew.a(textView2, this.l);
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    public final void onClick(@Nullable View view) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{view}, this, f54088a, false, 56981, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54088a, false, 56981, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        bg.a(new com.ss.android.ugc.aweme.longvideo.a.a());
        String str = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C0906R.id.b02) {
            d dVar = this.p;
            if (dVar != null) {
                dVar.a(new a.C0457a(this.l).a());
            }
        } else if (num != null && num.intValue() == C0906R.id.b54) {
            d dVar2 = this.p;
            if (dVar2 != null) {
                dVar2.a(c(), this.l);
            }
            Aweme aweme = this.l;
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.m).a("is_long_item", 1);
            Aweme aweme2 = this.l;
            if (aweme2 != null) {
                str = aweme2.getAid();
            }
            h.a(aweme, "click_more_button", a2.a("group_id", str));
        } else if (num != null && num.intValue() == C0906R.id.db2) {
            DiggView diggView = this.q;
            if (diggView != null) {
                if (PatchProxy.isSupport(new Object[0], diggView, DiggView.f3446a, false, 56512, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], diggView, DiggView.f3446a, false, 56512, new Class[0], Void.TYPE);
                } else {
                    diggView.onClick(diggView.f3449d);
                }
            }
        } else if (num != null && num.intValue() == C0906R.id.d_r) {
            d dVar3 = this.p;
            if (dVar3 != null) {
                dVar3.a(new a.C0457a(this.l).a());
            }
        }
    }

    public VideoOperationWidget(@Nullable Aweme aweme, @NotNull String str, int i, @NotNull String str2, @Nullable d dVar) {
        Intrinsics.checkParameterIsNotNull(str, "mEventType");
        Intrinsics.checkParameterIsNotNull(str2, "mBusinessType");
        this.l = aweme;
        this.m = str;
        this.n = i;
        this.o = str2;
        this.p = dVar;
    }
}
