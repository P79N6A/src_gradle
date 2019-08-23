package com.ss.android.ugc.aweme.story.shootvideo.record;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.port.in.ad;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\tH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0002J\u0012\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020\u000fH\u0002J\b\u0010#\u001a\u00020\u000fH\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordPermissionChecker;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/PermissionChecker;", "()V", "audioPermission", "", "cameraPermission", "context", "Landroid/content/Context;", "flGuideLayout", "Landroid/view/View;", "flGuideRoot", "flPermissionLayout", "ivClose", "openCamera", "Lkotlin/Function0;", "", "storagePermission", "tvPermissionAudio", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "tvPermissionStorage", "tvPermissionVideo", "tvStartRecord", "tvTitle", "checkPermissionBeforeLaunch", "startRecord", "dismiss", "doRealStart", "initView", "rootView", "isAllPermissionGet", "isPermissionGranted", "result", "", "onPermissionAllowed", "playGuideLayoutAnimate", "playPermissionLayoutAnimate", "showGuideNeeded", "isFromPermission", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class k implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73950a;

    /* renamed from: b  reason: collision with root package name */
    public DmtTextView f73951b;

    /* renamed from: c  reason: collision with root package name */
    public DmtTextView f73952c;

    /* renamed from: d  reason: collision with root package name */
    public DmtTextView f73953d;

    /* renamed from: e  reason: collision with root package name */
    public View f73954e;

    /* renamed from: f  reason: collision with root package name */
    public View f73955f;
    public View g;
    public boolean h;
    public boolean i;
    public boolean j;
    public Function0<Unit> k;
    private View l;
    private View m;
    private View n;
    private Context o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<Context, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Context) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 85702, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 85702, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(context2, AdvanceSetting.NETWORK_TYPE);
            Function0<Unit> function0 = this.this$0.k;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordPermissionChecker$initView$1$2"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73956a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f73957b;

        b(k kVar) {
            this.f73957b = kVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73956a, false, 85703, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73956a, false, 85703, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (!this.f73957b.i || !this.f73957b.h) {
                com.ss.android.ugc.aweme.y.b.a();
            } else {
                this.f73957b.c();
            }
            k.a(this.f73957b).animate().alpha(0.0f).setDuration(300).withEndAction(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73958a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f73959b;

                {
                    this.f73959b = r1;
                }

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f73958a, false, 85704, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f73958a, false, 85704, new Class[0], Void.TYPE);
                        return;
                    }
                    k.a(this.f73959b.f73957b).setVisibility(8);
                    k.a(this.f73959b.f73957b).setAlpha(1.0f);
                }
            }).start();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordPermissionChecker$initView$1$3"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73960a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f73961b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f73962c;

        c(View view, k kVar) {
            this.f73961b = view;
            this.f73962c = kVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73960a, false, 85705, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73960a, false, 85705, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.port.in.k kVar = com.ss.android.ugc.aweme.port.in.a.H;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "AVEnv.sAPI");
            ad E = kVar.E();
            Context context = this.f73961b.getContext();
            if (context != null) {
                E.a((FragmentActivity) context, new ad.a(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f73963a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ c f73964b;

                    {
                        this.f73964b = r1;
                    }

                    public final void a(@Nullable String[] strArr, @Nullable int[] iArr) {
                        if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f73963a, false, 85706, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f73963a, false, 85706, new Class[]{String[].class, int[].class}, Void.TYPE);
                            return;
                        }
                        if (k.a(iArr)) {
                            this.f73964b.f73962c.i = true;
                            k.b(this.f73964b.f73962c).setCompoundDrawablesWithIntrinsicBounds(2130839172, 0, 0, 0);
                            k.b(this.f73964b.f73962c).setEnabled(false);
                            this.f73964b.f73962c.a();
                        }
                    }
                }, "android.permission.CAMERA");
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordPermissionChecker$initView$1$4"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73965a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f73966b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f73967c;

        d(View view, k kVar) {
            this.f73966b = view;
            this.f73967c = kVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73965a, false, 85707, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73965a, false, 85707, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.port.in.k kVar = com.ss.android.ugc.aweme.port.in.a.H;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "AVEnv.sAPI");
            ad E = kVar.E();
            Context context = this.f73966b.getContext();
            if (context != null) {
                E.a((FragmentActivity) context, new ad.a(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f73968a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ d f73969b;

                    {
                        this.f73969b = r1;
                    }

                    public final void a(@Nullable String[] strArr, @Nullable int[] iArr) {
                        if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f73968a, false, 85708, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f73968a, false, 85708, new Class[]{String[].class, int[].class}, Void.TYPE);
                            return;
                        }
                        if (k.a(iArr)) {
                            this.f73969b.f73967c.h = true;
                            k.c(this.f73969b.f73967c).setCompoundDrawablesWithIntrinsicBounds(2130839172, 0, 0, 0);
                            k.c(this.f73969b.f73967c).setEnabled(false);
                            this.f73969b.f73967c.a();
                        }
                    }
                }, "android.permission.RECORD_AUDIO");
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordPermissionChecker$initView$1$5"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73970a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f73971b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f73972c;

        e(View view, k kVar) {
            this.f73971b = view;
            this.f73972c = kVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73970a, false, 85709, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73970a, false, 85709, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.port.in.k kVar = com.ss.android.ugc.aweme.port.in.a.H;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "AVEnv.sAPI");
            ad E = kVar.E();
            Context context = this.f73971b.getContext();
            if (context != null) {
                E.a((FragmentActivity) context, new ad.a(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f73973a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ e f73974b;

                    {
                        this.f73974b = r1;
                    }

                    public final void a(@Nullable String[] strArr, @Nullable int[] iArr) {
                        if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f73973a, false, 85710, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f73973a, false, 85710, new Class[]{String[].class, int[].class}, Void.TYPE);
                            return;
                        }
                        if (k.a(iArr)) {
                            this.f73974b.f73972c.j = true;
                            k.d(this.f73974b.f73972c).setCompoundDrawablesWithIntrinsicBounds(2130839172, 0, 0, 0);
                            k.d(this.f73974b.f73972c).setEnabled(false);
                            this.f73974b.f73972c.a();
                        }
                    }
                }, "android.permission.WRITE_EXTERNAL_STORAGE");
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordPermissionChecker$initView$1$6"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73975a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f73976b;

        f(k kVar) {
            this.f73976b = kVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73975a, false, 85711, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73975a, false, 85711, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            k.a(this.f73976b).animate().alpha(0.0f).setDuration(300).withEndAction(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73977a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ f f73978b;

                {
                    this.f73978b = r1;
                }

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f73977a, false, 85712, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f73977a, false, 85712, new Class[0], Void.TYPE);
                        return;
                    }
                    View view = this.f73978b.f73976b.f73955f;
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("flGuideLayout");
                    }
                    view.setVisibility(8);
                    k.a(this.f73978b.f73976b).setVisibility(8);
                    k.a(this.f73978b.f73976b).setAlpha(1.0f);
                }
            }).start();
            this.f73976b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73979a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f73980b;

        g(k kVar) {
            this.f73980b = kVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f73979a, false, 85713, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73979a, false, 85713, new Class[0], Void.TYPE);
                return;
            }
            View view = this.f73980b.f73954e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flPermissionLayout");
            }
            view.setVisibility(8);
            this.f73980b.b();
        }
    }

    private final boolean d() {
        if (!this.i || !this.h || !this.j) {
            return false;
        }
        return true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f73950a, false, 85697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73950a, false, 85697, new Class[0], Void.TYPE);
            return;
        }
        if (d() && !a(true)) {
            c();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f73950a, false, 85701, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73950a, false, 85701, new Class[0], Void.TYPE);
            return;
        }
        j jVar = j.f73940c;
        Context context = this.o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        jVar.a(context, new a(this));
    }

    private final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f73950a, false, 85699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73950a, false, 85699, new Class[0], Void.TYPE);
            return;
        }
        View view = this.f73954e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flPermissionLayout");
        }
        view.animate().setDuration(300).alpha(0.0f).withEndAction(new g(this)).start();
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f73950a, false, 85696, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73950a, false, 85696, new Class[0], Void.TYPE);
            return;
        }
        View view = this.g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flGuideRoot");
        }
        if (view.getVisibility() == 0) {
            View view2 = this.f73955f;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flGuideLayout");
            }
            view2.setVisibility(8);
            View view3 = this.f73954e;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flPermissionLayout");
            }
            view3.setVisibility(8);
            View view4 = this.g;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flGuideRoot");
            }
            view4.setVisibility(8);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f73950a, false, 85700, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73950a, false, 85700, new Class[0], Void.TYPE);
            return;
        }
        Context context = this.o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        float f2 = -UIUtils.dip2Px(context, 30.0f);
        View view = this.f73955f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flGuideLayout");
        }
        view.setVisibility(0);
        View view2 = this.f73955f;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flGuideLayout");
        }
        view2.setAlpha(0.0f);
        View view3 = this.m;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvTitle");
        }
        view3.animate().translationY(f2).start();
        View view4 = this.f73955f;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flGuideLayout");
        }
        view4.animate().alpha(1.0f).setDuration(300).start();
        View view5 = this.f73955f;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flGuideLayout");
        }
        view5.animate().alpha(1.0f).translationY(f2).setDuration(300).start();
    }

    public static final /* synthetic */ View a(k kVar) {
        View view = kVar.g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flGuideRoot");
        }
        return view;
    }

    public static final /* synthetic */ DmtTextView b(k kVar) {
        DmtTextView dmtTextView = kVar.f73951b;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPermissionVideo");
        }
        return dmtTextView;
    }

    public static final /* synthetic */ DmtTextView c(k kVar) {
        DmtTextView dmtTextView = kVar.f73952c;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPermissionAudio");
        }
        return dmtTextView;
    }

    public static final /* synthetic */ DmtTextView d(k kVar) {
        DmtTextView dmtTextView = kVar.f73953d;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPermissionStorage");
        }
        return dmtTextView;
    }

    public static boolean a(int[] iArr) {
        boolean z;
        if (iArr != null) {
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || iArr[0] != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(boolean r17) {
        /*
            r16 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r17)
            r8 = 0
            r1[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f73950a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r8] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 85698(0x14ec2, float:1.20088E-40)
            r2 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0043
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r17)
            r9[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = f73950a
            r12 = 0
            r13 = 85698(0x14ec2, float:1.20088E-40)
            java.lang.Class[] r14 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r14[r8] = r0
            java.lang.Class r15 = java.lang.Boolean.TYPE
            r10 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0043:
            com.ss.android.ugc.aweme.port.in.ah r1 = com.ss.android.ugc.aweme.port.in.a.o
            java.lang.String r2 = "AVEnv.SP_SERIVCE"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.port.in.ah$a r1 = r1.g()
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            if (r2 != 0) goto L_0x0082
            com.ss.android.ugc.aweme.port.in.ah r2 = com.ss.android.ugc.aweme.port.in.a.o
            java.lang.String r3 = "AVEnv.SP_SERIVCE"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.port.in.ah$a r2 = r2.g()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.a(r3)
            if (r17 == 0) goto L_0x0070
            r16.e()
            goto L_0x0082
        L_0x0070:
            r2 = r16
            android.view.View r3 = r2.g
            if (r3 != 0) goto L_0x007b
            java.lang.String r4 = "flGuideRoot"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x007b:
            r3.setVisibility(r8)
            r16.b()
            goto L_0x0084
        L_0x0082:
            r2 = r16
        L_0x0084:
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x008b
            return r0
        L_0x008b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.record.k.a(boolean):boolean");
    }

    public final void a(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73950a, false, 85694, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73950a, false, 85694, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        this.o = context;
        View findViewById = view.findViewById(C0906R.id.azz);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.iv_close_guide)");
        this.l = findViewById;
        View findViewById2 = view.findViewById(C0906R.id.dcn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.tv_guide_title)");
        this.m = findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.dg8);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.tv_permission_video)");
        this.f73951b = (DmtTextView) findViewById3;
        View findViewById4 = view.findViewById(C0906R.id.dg3);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.tv_permission_audio)");
        this.f73952c = (DmtTextView) findViewById4;
        View findViewById5 = view.findViewById(C0906R.id.dg7);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.tv_permission_storage)");
        this.f73953d = (DmtTextView) findViewById5;
        View findViewById6 = view.findViewById(C0906R.id.djj);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.tv_start_record)");
        this.n = findViewById6;
        View findViewById7 = view.findViewById(C0906R.id.afz);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.fl_permission)");
        this.f73954e = findViewById7;
        View findViewById8 = view.findViewById(C0906R.id.afj);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "findViewById(R.id.fl_guide)");
        this.f73955f = findViewById8;
        View findViewById9 = view.findViewById(C0906R.id.afk);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "findViewById(R.id.fl_guide_root)");
        this.g = findViewById9;
        View view2 = this.l;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivClose");
        }
        View view3 = this.l;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivClose");
        }
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = p.c();
            view2.setLayoutParams(layoutParams2);
            View view4 = this.l;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivClose");
            }
            view4.setOnClickListener(new b(this));
            DmtTextView dmtTextView = this.f73951b;
            if (dmtTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPermissionVideo");
            }
            dmtTextView.setOnClickListener(new c(view, this));
            DmtTextView dmtTextView2 = this.f73952c;
            if (dmtTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPermissionAudio");
            }
            dmtTextView2.setOnClickListener(new d(view, this));
            DmtTextView dmtTextView3 = this.f73953d;
            if (dmtTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPermissionStorage");
            }
            dmtTextView3.setOnClickListener(new e(view, this));
            View view5 = this.n;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvStartRecord");
            }
            view5.setOnClickListener(new f(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
    }

    public final void a(@NotNull Function0<Unit> function0) {
        boolean z;
        boolean z2;
        boolean z3;
        if (PatchProxy.isSupport(new Object[]{function0}, this, f73950a, false, 85695, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function0}, this, f73950a, false, 85695, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function0, "startRecord");
        this.k = function0;
        com.ss.android.ugc.aweme.port.in.k kVar = com.ss.android.ugc.aweme.port.in.a.H;
        Intrinsics.checkExpressionValueIsNotNull(kVar, "AVEnv.sAPI");
        ad E = kVar.E();
        Context context = this.o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        if (E.b(context) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        com.ss.android.ugc.aweme.port.in.k kVar2 = com.ss.android.ugc.aweme.port.in.a.H;
        Intrinsics.checkExpressionValueIsNotNull(kVar2, "AVEnv.sAPI");
        ad E2 = kVar2.E();
        Context context2 = this.o;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        if (E2.a(context2) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.i = z2;
        com.ss.android.ugc.aweme.port.in.k kVar3 = com.ss.android.ugc.aweme.port.in.a.H;
        Intrinsics.checkExpressionValueIsNotNull(kVar3, "AVEnv.sAPI");
        ad E3 = kVar3.E();
        Context context3 = this.o;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        if (E3.c(context3) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.j = z3;
        if (d()) {
            View view = this.f73954e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flPermissionLayout");
            }
            view.setVisibility(8);
            if (!a(false)) {
                View view2 = this.g;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("flGuideRoot");
                }
                view2.setVisibility(8);
                c();
            }
        } else {
            View view3 = this.g;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flGuideRoot");
            }
            view3.setAlpha(0.0f);
            View view4 = this.g;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flGuideRoot");
            }
            view4.setVisibility(0);
            View view5 = this.f73954e;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flPermissionLayout");
            }
            view5.setVisibility(0);
            if (this.h) {
                DmtTextView dmtTextView = this.f73952c;
                if (dmtTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvPermissionAudio");
                }
                dmtTextView.setCompoundDrawablesWithIntrinsicBounds(2130839172, 0, 0, 0);
            }
            if (this.i) {
                DmtTextView dmtTextView2 = this.f73951b;
                if (dmtTextView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvPermissionVideo");
                }
                dmtTextView2.setCompoundDrawablesWithIntrinsicBounds(2130839172, 0, 0, 0);
            }
            if (this.j) {
                DmtTextView dmtTextView3 = this.f73953d;
                if (dmtTextView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvPermissionStorage");
                }
                dmtTextView3.setCompoundDrawablesWithIntrinsicBounds(2130839172, 0, 0, 0);
            }
            DmtTextView dmtTextView4 = this.f73952c;
            if (dmtTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPermissionAudio");
            }
            dmtTextView4.setEnabled(!this.h);
            DmtTextView dmtTextView5 = this.f73951b;
            if (dmtTextView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPermissionVideo");
            }
            dmtTextView5.setEnabled(!this.i);
            DmtTextView dmtTextView6 = this.f73953d;
            if (dmtTextView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPermissionStorage");
            }
            dmtTextView6.setEnabled(!this.j);
            View view6 = this.g;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flGuideRoot");
            }
            view6.animate().alpha(1.0f).setDuration(300).start();
        }
    }
}
