package com.ss.android.ugc.aweme.share.invitefriends;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 +2\u00020\u0001:\u0001+B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\n2\u0006\u0010#\u001a\u00020$J\u000e\u0010&\u001a\u00020\n2\u0006\u0010#\u001a\u00020$J\u000e\u0010'\u001a\u00020\n2\u0006\u0010#\u001a\u00020$J\u0006\u0010(\u001a\u00020\nJ\u0016\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006,"}, d2 = {"Lcom/ss/android/ugc/aweme/share/invitefriends/CommandTokenDialogDelegate;", "", "context", "Landroid/content/Context;", "dialog", "Landroid/app/Dialog;", "rootView", "Landroid/view/View;", "onClick", "Lkotlin/Function1;", "", "hasStoragePermission", "", "(Landroid/content/Context;Landroid/app/Dialog;Landroid/view/View;Lkotlin/jvm/functions/Function1;Z)V", "getContext", "()Landroid/content/Context;", "getDialog", "()Landroid/app/Dialog;", "getHasStoragePermission", "()Z", "mCloseButton", "Landroid/widget/ImageButton;", "mQQCommandSendItem", "Lcom/ss/android/ugc/aweme/share/invitefriends/CommandSendItem;", "mStatusIcon", "Landroid/widget/ImageView;", "mStatusLayout", "mStatusTv", "Landroid/widget/TextView;", "mWeChatCommandSendItem", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "getRootView", "()Landroid/view/View;", "initView", "type", "", "setGenerateFailState", "setGeneratedOKState", "setGeneratingState", "setImageSaveFailState", "viewAnimation", "isIn", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65029a;
    public static final C0699a j = new C0699a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final View f65030b;

    /* renamed from: c  reason: collision with root package name */
    public final CommandSendItem f65031c;

    /* renamed from: d  reason: collision with root package name */
    public final CommandSendItem f65032d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final Context f65033e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final Dialog f65034f;
    @NotNull
    public final View g;
    @NotNull
    public final Function1<View, Unit> h;
    public final boolean i;
    private final ImageButton k;
    private final TextView l;
    private final ImageView m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/share/invitefriends/CommandTokenDialogDelegate$Companion;", "", "()V", "IMAGE_TOKEN", "", "TEXT_TOKEN", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.share.invitefriends.a$a  reason: collision with other inner class name */
    public static final class C0699a {
        private C0699a() {
        }

        public /* synthetic */ C0699a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/share/invitefriends/CommandTokenDialogDelegate$initView$1$1"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65035a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f65036b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f65037c;

        b(a aVar, int i) {
            this.f65036b = aVar;
            this.f65037c = i;
        }

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f65035a, false, 73491, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f65035a, false, 73491, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function1<View, Unit> function1 = this.f65036b.h;
            Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
            function1.invoke(view2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/share/invitefriends/CommandTokenDialogDelegate$initView$2$1"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65038a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f65039b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f65040c;

        c(a aVar, int i) {
            this.f65039b = aVar;
            this.f65040c = i;
        }

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f65038a, false, 73492, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f65038a, false, 73492, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function1<View, Unit> function1 = this.f65039b.h;
            Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
            function1.invoke(view2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/share/invitefriends/CommandTokenDialogDelegate$initView$3$1"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f65042b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f65043c;

        d(a aVar, int i) {
            this.f65042b = aVar;
            this.f65043c = i;
        }

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f65041a, false, 73493, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f65041a, false, 73493, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function1<View, Unit> function1 = this.f65042b.h;
            Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
            function1.invoke(view2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65044a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f65045b;

        e(a aVar) {
            this.f65045b = aVar;
        }

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f65044a, false, 73494, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f65044a, false, 73494, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function1<View, Unit> function1 = this.f65045b.h;
            Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
            function1.invoke(view2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f65047b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f65048c;

        f(View view, boolean z) {
            this.f65047b = view;
            this.f65048c = z;
        }

        public final void run() {
            int i;
            float f2;
            if (PatchProxy.isSupport(new Object[0], this, f65046a, false, 73495, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f65046a, false, 73495, new Class[0], Void.TYPE);
                return;
            }
            final int height = (int) (((float) this.f65047b.getHeight()) * 0.075f);
            if (this.f65048c) {
                i = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f;
            } else {
                i = 100;
            }
            View view = this.f65047b;
            float[] fArr = new float[2];
            float f3 = 1.0f;
            if (this.f65048c) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            fArr[0] = f2;
            if (!this.f65048c) {
                f3 = 0.0f;
            }
            fArr[1] = f3;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "alphaAnim");
            ofFloat.setDuration((long) i);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65049a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ f f65050b;

                {
                    this.f65050b = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f65049a, false, 73496, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f65049a, false, 73496, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    float f2 = ((float) height) - (((float) height) * animatedFraction);
                    View view = this.f65050b.f65047b;
                    if (!this.f65050b.f65048c) {
                        f2 = ((float) (-height)) * animatedFraction;
                    }
                    view.setTranslationY(f2);
                }
            });
            ofFloat.setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
            ofFloat.start();
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65029a, false, 73486, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65029a, false, 73486, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65030b.setClickable(false);
        this.l.setText(C0906R.string.b3b);
        this.l.setTextColor(this.f65033e.getResources().getColor(C0906R.color.hi));
        this.m.setVisibility(8);
        this.f65031c.setEnabled(false);
        this.f65031c.setAlpha(0.5f);
        this.f65032d.setEnabled(false);
        this.f65032d.setAlpha(0.5f);
    }

    public final void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65029a, false, 73488, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65029a, false, 73488, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65030b.setClickable(true);
        com.bytedance.ies.dmt.ui.e.b.a(this.f65030b);
        this.m.setImageResource(2130839033);
        this.m.setVisibility(0);
        this.l.setTextColor(this.f65033e.getResources().getColor(C0906R.color.hs));
        this.l.setText(C0906R.string.b38);
        if (i2 == 1 && !this.i) {
            this.f65030b.setVisibility(0);
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65029a, false, 73485, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65029a, false, 73485, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        View view = this.f65030b;
        view.setOnClickListener(new b(this, i2));
        if (i2 == 1) {
            if (this.i) {
                view.setPadding(0, (int) UIUtils.dip2Px(view.getContext(), 5.0f), 0, (int) UIUtils.dip2Px(view.getContext(), 20.0f));
            } else {
                view.setPadding(0, 0, 0, (int) UIUtils.dip2Px(view.getContext(), 10.0f));
            }
        }
        CommandSendItem commandSendItem = this.f65031c;
        commandSendItem.setOnClickListener(new c(this, i2));
        commandSendItem.setIcon(2130839036);
        if (i2 == 0) {
            commandSendItem.setText((int) C0906R.string.b36);
        } else if (this.i) {
            this.f65031c.setText((int) C0906R.string.b33);
        } else {
            this.f65031c.setText((int) C0906R.string.b31);
        }
        CommandSendItem commandSendItem2 = this.f65032d;
        commandSendItem2.setOnClickListener(new d(this, i2));
        commandSendItem2.setIcon(2130839035);
        if (i2 == 0) {
            this.f65032d.setText((int) C0906R.string.b35);
        } else if (this.i) {
            this.f65032d.setText((int) C0906R.string.b32);
        } else {
            this.f65032d.setText((int) C0906R.string.b30);
        }
        this.k.setOnClickListener(new e(this));
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65029a, false, 73487, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65029a, false, 73487, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65030b.setClickable(false);
        this.m.setVisibility(0);
        this.m.setImageResource(2130839034);
        this.l.setTextColor(this.f65033e.getResources().getColor(C0906R.color.hi));
        if (i2 == 0) {
            this.l.setText(C0906R.string.b39);
        } else {
            if (!this.i) {
                this.f65030b.setVisibility(4);
            }
            this.l.setText(C0906R.string.b2y);
        }
        this.f65031c.setEnabled(true);
        this.f65031c.setAlpha(1.0f);
        this.f65032d.setEnabled(true);
        this.f65032d.setAlpha(1.0f);
    }

    public final void a(boolean z, @NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), view2}, this, f65029a, false, 73490, new Class[]{Boolean.TYPE, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), view2}, this, f65029a, false, 73490, new Class[]{Boolean.TYPE, View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "rootView");
        view2.post(new f(view2, z));
    }

    public a(@NotNull Context context, @NotNull Dialog dialog, @NotNull View view, @NotNull Function1<? super View, Unit> function1, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(dialog, "dialog");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(function1, "onClick");
        this.f65033e = context;
        this.f65034f = dialog;
        this.g = view;
        this.h = function1;
        this.i = z;
        View findViewById = this.g.findViewById(C0906R.id.cva);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.status_layout)");
        this.f65030b = findViewById;
        View findViewById2 = this.g.findViewById(C0906R.id.a4p);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.dialog_weixin_confirm)");
        this.f65031c = (CommandSendItem) findViewById2;
        View findViewById3 = this.g.findViewById(C0906R.id.a4m);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.dialog_qq_confirm)");
        this.f65032d = (CommandSendItem) findViewById3;
        View findViewById4 = this.g.findViewById(C0906R.id.ti);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.close)");
        this.k = (ImageButton) findViewById4;
        View findViewById5 = this.f65030b.findViewById(C0906R.id.cvc);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "mStatusLayout.findViewById(R.id.status_text)");
        this.l = (TextView) findViewById5;
        View findViewById6 = this.f65030b.findViewById(C0906R.id.cv7);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "mStatusLayout.findViewById(R.id.status_icon)");
        this.m = (ImageView) findViewById6;
    }

    public /* synthetic */ a(Context context, Dialog dialog, View view, Function1 function1, boolean z, int i2) {
        this(context, dialog, view, function1, true);
    }
}
