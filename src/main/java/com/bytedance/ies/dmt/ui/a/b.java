package com.bytedance.ies.dmt.ui.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\u0018\u00002\u00020\u0001:\u0004fghiB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\nH\u0002J\b\u0010I\u001a\u00020FH\u0016J\u0006\u0010J\u001a\u00020FJ\u0006\u0010K\u001a\u00020\nJ\u0006\u0010L\u001a\u00020\nJ\u0006\u0010M\u001a\u00020\u0015J\u0006\u0010N\u001a\u00020\nJ\u0006\u0010O\u001a\u00020\nJ\u0010\u0010P\u001a\u00020\n2\u0006\u0010H\u001a\u00020\nH\u0004J\b\u0010Q\u001a\u00020FH\u0002J\u0006\u0010R\u001a\u00020FJ\b\u0010S\u001a\u00020FH\u0002J\u0006\u0010T\u001a\u00020FJ\u0006\u0010U\u001a\u00020FJ\u0012\u0010V\u001a\u00020F2\b\u0010W\u001a\u0004\u0018\u00010>H\u0002J \u0010X\u001a\u00020F2\u0006\u0010Y\u001a\u00020>2\u0006\u0010H\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\u0011H\u0002J\b\u0010[\u001a\u00020FH\u0002J\u0014\u0010\\\u001a\u00020F2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020(0'J \u0010^\u001a\u00020F2\b\u0010Y\u001a\u0004\u0018\u00010>2\u0006\u0010H\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\u0011J(\u0010^\u001a\u00020F2\b\u0010Y\u001a\u0004\u0018\u00010>2\u0006\u0010H\u001a\u00020\n2\u0006\u0010_\u001a\u00020\u00172\u0006\u0010`\u001a\u00020\nJ(\u0010a\u001a\u00020F2\u0006\u0010Y\u001a\u00020>2\u0006\u0010H\u001a\u00020\n2\u0006\u0010b\u001a\u00020\n2\u0006\u0010c\u001a\u00020\nH\u0016J.\u0010d\u001a\u00020F2\u0006\u0010Y\u001a\u00020>2\u0006\u0010H\u001a\u00020\n2\u0006\u0010b\u001a\u00020\n2\u0006\u0010c\u001a\u00020\n2\u0006\u0010e\u001a\u00020\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X.¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010DX\u000e¢\u0006\u0002\n\u0000¨\u0006j"}, d2 = {"Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView;", "Landroid/widget/PopupWindow;", "builder", "Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$Builder;", "(Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$Builder;)V", "activity", "Landroid/app/Activity;", "bubbleText", "", "bubbleTextRes", "", "defaultMargin", "getDefaultMargin", "()I", "setDefaultMargin", "(I)V", "hasCome", "", "isAlreadyDismiss", "isHideVirtualKey", "mAnimTime", "", "mArrowOffset", "", "mAutoDismissDelayMillis", "mBgColor", "mBorderColor", "mBubbleOffset", "mClickListener", "Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$OnBubbleClickListener;", "mDismissListener", "Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$OnBubbleDismissListener;", "mDismissRunnable", "Ljava/lang/Runnable;", "mDmtBubbleLayout", "Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleLayout;", "mGravity", "mHeight", "mLocationSupplier", "Lcom/bytedance/ies/dmt/ui/base/SupplierC;", "Landroid/graphics/Point;", "mNeedAddColor", "mNeedArrow", "mNeedOverShoot", "mNeedPath", "mNeedPressFade", "mNeedShadow", "mOutSideTouchable", "mPadding", "mParentHeight", "mParentWidth", "mShadowColor", "mShowListener", "Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$OnBubbleShowListener;", "mTextColor", "mTextSize", "mTextView", "Landroid/widget/TextView;", "mTypeFace", "Landroid/graphics/Typeface;", "mUseDefaultView", "mView", "Landroid/view/View;", "mWidth", "mXOffset", "mYOffset", "padding", "set", "Landroid/animation/AnimatorSet;", "animatorEasyInOut", "", "isIn", "gravity", "dismiss", "dismissDirectly", "getBubbledHeight", "getBubbledWidth", "getInAnimTime", "getMeasuredHeight", "getMeasuredWidth", "getOrientation", "hideSystemUi", "hideView", "initContentView", "measure", "onDestroy", "setBubbleLayout", "view", "setBubblePosition", "parent", "isMiddle", "setDefaultView", "setLocationSupplier", "locationSupplier", "show", "arrowOffset", "offset", "showAtLocation", "x", "y", "showPopAtLocation", "arrowOffSet", "Builder", "OnBubbleClickListener", "OnBubbleDismissListener", "OnBubbleShowListener", "awemeuikit_douyinCnRelease"}, k = 1, mv = {1, 1, 11})
public final class b extends PopupWindow {
    private float A = 13.0f;
    private int B;
    private Typeface C;
    private boolean D = true;
    private float E = 12.0f;
    private int F;
    private int G;
    private boolean H = true;
    private boolean I = true;
    private boolean J;
    private TextView K;
    private boolean L;
    private int M;
    private Activity N;
    private View O;
    private com.bytedance.ies.dmt.ui.base.b<Point> P;
    private final Runnable Q;

    /* renamed from: a  reason: collision with root package name */
    public int f20261a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20262b;

    /* renamed from: c  reason: collision with root package name */
    public long f20263c = 200;

    /* renamed from: d  reason: collision with root package name */
    public int f20264d;

    /* renamed from: e  reason: collision with root package name */
    public a f20265e;

    /* renamed from: f  reason: collision with root package name */
    public AnimatorSet f20266f;
    public C0184b g;
    public d h;
    public c i;
    private float j;
    private float k;
    private int l;
    private int m;
    private boolean n = true;
    private boolean o;
    private boolean p;
    private int q;
    private boolean r;
    private int s;
    private int t;
    private long u = 5000;
    private boolean v = true;
    private int w;
    private int x;
    private String y = "";
    private int z;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b4\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0001\u001a\u00030\u0001J\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\tJ\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u000fJ\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\tJ\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0018J\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0018J\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020!J\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0018J\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u000fJ\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u000fJ\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0018J\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0018J\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020BJ\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020BJ\u0010\u0010 \u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020BJ\u0010\u0010¡\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020BJ\u0010\u0010¢\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020BJ\u0010\u0010£\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020BJ\u0010\u0010¤\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020BJ\u0010\u0010¥\u0001\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020*J\u0010\u0010§\u0001\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u000206J\u0010\u0010¨\u0001\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020cJ\u0010\u0010©\u0001\u001a\u00020\u00002\u0007\u0010ª\u0001\u001a\u00020BJ\u0010\u0010«\u0001\u001a\u00020\u00002\u0007\u0010¬\u0001\u001a\u00020\u000fJ\u0010\u0010­\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0018J\u0010\u0010®\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0018J\u0010\u0010¯\u0001\u001a\u00020\u00002\u0007\u0010°\u0001\u001a\u00020\u000fJ\u0010\u0010±\u0001\u001a\u00020\u00002\u0007\u0010²\u0001\u001a\u00020oJ\u0010\u0010³\u0001\u001a\u00020\u00002\u0007\u0010´\u0001\u001a\u00020BJ\u0010\u0010µ\u0001\u001a\u00020\u00002\u0007\u0010¶\u0001\u001a\u00020xJ\u0010\u0010·\u0001\u001a\u00020\u00002\u0007\u0010¸\u0001\u001a\u00020\u0018J\u0010\u0010¹\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0018J\u0010\u0010º\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001c\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0011\"\u0004\b1\u0010\u0013R\u001a\u00102\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0011\"\u0004\b4\u0010\u0013R\u001c\u00105\u001a\u0004\u0018\u000106X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010\u001cR\u001a\u0010>\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010\u001cR\u001a\u0010A\u001a\u00020BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR\u001a\u0010J\u001a\u00020BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010D\"\u0004\bL\u0010FR\u001a\u0010M\u001a\u00020BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010D\"\u0004\bO\u0010FR\u001a\u0010P\u001a\u00020BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010D\"\u0004\bR\u0010FR\u001a\u0010S\u001a\u00020BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010D\"\u0004\bU\u0010FR\u001a\u0010V\u001a\u00020BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010D\"\u0004\bX\u0010FR\u001a\u0010Y\u001a\u00020BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010D\"\u0004\b[\u0010FR\u001a\u0010\\\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0011\"\u0004\b^\u0010\u0013R\u001a\u0010_\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u001a\"\u0004\ba\u0010\u001cR\u001c\u0010b\u001a\u0004\u0018\u00010cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001a\u0010h\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u001a\"\u0004\bj\u0010\u001cR\u001a\u0010k\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u0011\"\u0004\bm\u0010\u0013R\u001c\u0010n\u001a\u0004\u0018\u00010oX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001a\u0010t\u001a\u00020BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010D\"\u0004\bv\u0010FR\u001c\u0010w\u001a\u0004\u0018\u00010xX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u001a\u0010}\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010\u001a\"\u0004\b\u0010\u001cR\u001d\u0010\u0001\u001a\u00020\u0018X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u001a\"\u0005\b\u0001\u0010\u001cR\u001d\u0010\u0001\u001a\u00020\u0018X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u001a\"\u0005\b\u0001\u0010\u001c¨\u0006»\u0001"}, d2 = {"Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$Builder;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "setActivity", "mAnimTime", "", "getMAnimTime", "()J", "setMAnimTime", "(J)V", "mArrowOffset", "", "getMArrowOffset", "()F", "setMArrowOffset", "(F)V", "mAutoDismissDelayMillis", "getMAutoDismissDelayMillis", "setMAutoDismissDelayMillis", "mBgColor", "", "getMBgColor", "()I", "setMBgColor", "(I)V", "mBorderColor", "getMBorderColor", "setMBorderColor", "mBubbleText", "", "getMBubbleText", "()Ljava/lang/String;", "setMBubbleText", "(Ljava/lang/String;)V", "mBubbleTextRes", "getMBubbleTextRes", "setMBubbleTextRes", "mClickListener", "Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$OnBubbleClickListener;", "getMClickListener", "()Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$OnBubbleClickListener;", "setMClickListener", "(Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$OnBubbleClickListener;)V", "mContentXOffset", "getMContentXOffset", "setMContentXOffset", "mContentYOffset", "getMContentYOffset", "setMContentYOffset", "mDismissListener", "Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$OnBubbleDismissListener;", "getMDismissListener", "()Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$OnBubbleDismissListener;", "setMDismissListener", "(Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$OnBubbleDismissListener;)V", "mGravity", "getMGravity", "setMGravity", "mHeight", "getMHeight", "setMHeight", "mHideVirtualKey", "", "getMHideVirtualKey", "()Z", "setMHideVirtualKey", "(Z)V", "mNeedAddColor", "getMNeedAddColor", "setMNeedAddColor", "mNeedArrow", "getMNeedArrow", "setMNeedArrow", "mNeedOverShoot", "getMNeedOverShoot", "setMNeedOverShoot", "mNeedPath", "getMNeedPath", "setMNeedPath", "mNeedPressFade", "getMNeedPressFade", "setMNeedPressFade", "mNeedShadow", "getMNeedShadow", "setMNeedShadow", "mOutSideTouchable", "getMOutSideTouchable", "setMOutSideTouchable", "mPadding", "getMPadding", "setMPadding", "mShadowColor", "getMShadowColor", "setMShadowColor", "mShowListener", "Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$OnBubbleShowListener;", "getMShowListener", "()Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$OnBubbleShowListener;", "setMShowListener", "(Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$OnBubbleShowListener;)V", "mTextColor", "getMTextColor", "setMTextColor", "mTextSize", "getMTextSize", "setMTextSize", "mTypeFace", "Landroid/graphics/Typeface;", "getMTypeFace", "()Landroid/graphics/Typeface;", "setMTypeFace", "(Landroid/graphics/Typeface;)V", "mUseDefaultView", "getMUseDefaultView", "setMUseDefaultView", "mView", "Landroid/view/View;", "getMView", "()Landroid/view/View;", "setMView", "(Landroid/view/View;)V", "mWidth", "getMWidth", "setMWidth", "mXOffset", "getMXOffset", "setMXOffset", "mYOffset", "getMYOffset", "setMYOffset", "build", "Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView;", "setAnimTime", "time", "setArrowOffset", "offset", "setAutoDismissDelayMillis", "setBgColor", "color", "setBorderColor", "setBubbleText", "str", "setBubbleTextRes", "resId", "setContentXOffset", "xValue", "setContentYOffset", "yValue", "setGravity", "gravity", "setHeight", "height", "setHideVirtualKey", "hide", "setNeedAddColor", "need", "setNeedArrow", "setNeedOverShoot", "setNeedPath", "setNeedPressFade", "setNeedShadow", "setOnClickListener", "listener", "setOnDismissListener", "setOnShowListener", "setOutSideTouchable", "touchable", "setPadding", "padding", "setShadowColor", "setTextColor", "setTextSize", "textSize", "setTypeface", "tf", "setUseDefaultView", "useDefault", "setView", "view", "setWidth", "width", "setXOffset", "setYOffset", "awemeuikit_douyinCnRelease"}, k = 1, mv = {1, 1, 11})
    public static final class a {
        public boolean A = true;
        public boolean B;
        public int C;
        public boolean D = true;
        @NotNull
        public Activity E;

        /* renamed from: a  reason: collision with root package name */
        public int f20267a;

        /* renamed from: b  reason: collision with root package name */
        public float f20268b;

        /* renamed from: c  reason: collision with root package name */
        public int f20269c;

        /* renamed from: d  reason: collision with root package name */
        public int f20270d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f20271e = true;

        /* renamed from: f  reason: collision with root package name */
        public boolean f20272f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;
        public long k = 800;
        public long l = 5000;
        public boolean m = true;
        @Nullable
        public View n;
        public int o;
        public int p;
        @NotNull
        public String q = "";
        public int r;
        public float s = 13.0f;
        @Nullable
        public Typeface t;
        public int u;
        @Nullable
        public C0184b v;
        @Nullable
        public c w;
        @Nullable
        public d x;
        public boolean y = true;
        public float z = 12.0f;

        @NotNull
        public final b a() {
            return new b(this);
        }

        @NotNull
        public final a a(float f2) {
            this.z = f2;
            return this;
        }

        @NotNull
        public final a b(int i2) {
            this.r = i2;
            return this;
        }

        @NotNull
        public final a c(int i2) {
            this.f20270d = i2;
            return this;
        }

        @NotNull
        public final a d(int i2) {
            this.i = i2;
            return this;
        }

        @NotNull
        public final a e(int i2) {
            this.j = i2;
            return this;
        }

        @NotNull
        public final a a(int i2) {
            this.u = i2;
            return this;
        }

        @NotNull
        public final a b(boolean z2) {
            this.y = true;
            return this;
        }

        @NotNull
        public final a c(boolean z2) {
            this.f20271e = false;
            return this;
        }

        @NotNull
        public final a d(boolean z2) {
            this.m = false;
            return this;
        }

        @NotNull
        public final a a(long j2) {
            this.l = j2;
            return this;
        }

        @NotNull
        public final a a(@NotNull View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.n = view;
            return this;
        }

        public a(@NotNull Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
            this.E = activity;
        }

        @NotNull
        public final a a(@NotNull C0184b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "listener");
            this.v = bVar;
            return this;
        }

        @NotNull
        public final a a(@NotNull d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "listener");
            this.x = dVar;
            return this;
        }

        @NotNull
        public final a a(@NotNull String str) {
            Intrinsics.checkParameterIsNotNull(str, "str");
            this.q = str;
            return this;
        }

        @NotNull
        public final a a(boolean z2) {
            this.A = z2;
            return this;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$OnBubbleClickListener;", "", "clickBubble", "", "awemeuikit_douyinCnRelease"}, k = 1, mv = {1, 1, 11})
    /* renamed from: com.bytedance.ies.dmt.ui.a.b$b  reason: collision with other inner class name */
    public interface C0184b {
        void a();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$OnBubbleDismissListener;", "", "bubbleDismiss", "", "awemeuikit_douyinCnRelease"}, k = 1, mv = {1, 1, 11})
    public interface c {
        void a();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView$OnBubbleShowListener;", "", "bubbleShow", "", "awemeuikit_douyinCnRelease"}, k = 1, mv = {1, 1, 11})
    public interface d {
        void a();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 11})
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f20274b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f20275c;

        e(b bVar, a aVar, boolean z) {
            this.f20273a = bVar;
            this.f20274b = aVar;
            this.f20275c = z;
        }

        public final void run() {
            int i;
            int i2;
            float f2;
            float f3;
            float f4;
            float f5;
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long j7;
            long j8;
            if (this.f20273a.f20266f != null) {
                int i3 = this.f20273a.f20261a;
                if (i3 == 3) {
                    i2 = (int) (this.f20274b.getX() + ((float) this.f20274b.getMeasuredWidth()));
                    i = (int) (this.f20274b.getY() + b.a(this.f20273a).getBubbleOffset());
                } else if (i3 == 5) {
                    i2 = (int) this.f20274b.getX();
                    i = (int) (this.f20274b.getY() + b.a(this.f20273a).getBubbleOffset());
                } else if (i3 == 48) {
                    i2 = (int) (this.f20274b.getX() + b.a(this.f20273a).getBubbleOffset());
                    i = (int) (this.f20274b.getY() + ((float) this.f20274b.getMeasuredHeight()));
                } else if (i3 != 80) {
                    i2 = 0;
                    i = 0;
                } else {
                    i2 = (int) (this.f20274b.getX() + b.a(this.f20273a).getBubbleOffset());
                    i = (int) this.f20274b.getY();
                }
                this.f20274b.setPivotY((float) i);
                this.f20274b.setPivotX((float) i2);
                a aVar = this.f20274b;
                float[] fArr = new float[2];
                if (this.f20275c) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                fArr[0] = f2;
                if (this.f20275c) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                fArr[1] = f3;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar, "scaleX", fArr);
                Intrinsics.checkExpressionValueIsNotNull(ofFloat, "scaleX");
                ofFloat.setDuration(200);
                a aVar2 = this.f20274b;
                float[] fArr2 = new float[2];
                if (this.f20275c) {
                    f4 = 0.0f;
                } else {
                    f4 = 1.0f;
                }
                fArr2[0] = f4;
                if (this.f20275c) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                fArr2[1] = f5;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVar2, "scaleY", fArr2);
                Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "scaleY");
                ofFloat2.setDuration(200);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f20274b, "translationY", new float[]{0.0f});
                Intrinsics.checkExpressionValueIsNotNull(ofFloat3, "translationDownAnimL");
                if (this.f20275c) {
                    j = 500;
                } else {
                    j = 200;
                }
                ofFloat3.setDuration(j);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f20274b, "translationY", new float[]{0.0f});
                Intrinsics.checkExpressionValueIsNotNull(ofFloat4, "translationUpAnimL");
                if (this.f20275c) {
                    j2 = 500;
                } else {
                    j2 = 200;
                }
                ofFloat4.setDuration(j2);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f20274b, "translationX", new float[]{0.0f});
                Intrinsics.checkExpressionValueIsNotNull(ofFloat5, "translationLeftAnimL");
                if (this.f20275c) {
                    j3 = 500;
                } else {
                    j3 = 200;
                }
                ofFloat5.setDuration(j3);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f20274b, "translationX", new float[]{0.0f});
                Intrinsics.checkExpressionValueIsNotNull(ofFloat6, "translationRightAnimL");
                if (this.f20275c) {
                    j4 = 500;
                } else {
                    j4 = 200;
                }
                ofFloat6.setDuration(j4);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f20274b, "translationY", new float[]{0.0f, 10.0f});
                Intrinsics.checkExpressionValueIsNotNull(ofFloat7, "translationDownAnimS");
                if (this.f20275c) {
                    j5 = 200;
                } else {
                    j5 = 150;
                }
                ofFloat7.setDuration(j5);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f20274b, "translationY", new float[]{0.0f, -10.0f});
                Intrinsics.checkExpressionValueIsNotNull(ofFloat8, "translationUpAnimS");
                if (this.f20275c) {
                    j6 = 200;
                } else {
                    j6 = 150;
                }
                ofFloat8.setDuration(j6);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f20274b, "translationX", new float[]{0.0f, -10.0f});
                Intrinsics.checkExpressionValueIsNotNull(ofFloat9, "translationLeftAnimS");
                if (this.f20275c) {
                    j7 = 200;
                } else {
                    j7 = 150;
                }
                ofFloat9.setDuration(j7);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f20274b, "translationX", new float[]{0.0f, 10.0f});
                Intrinsics.checkExpressionValueIsNotNull(ofFloat10, "translationRightAnimS");
                if (this.f20275c) {
                    j8 = 200;
                } else {
                    j8 = 150;
                }
                ofFloat10.setDuration(j8);
                this.f20274b.setVisibility(0);
                if (this.f20275c) {
                    int i4 = this.f20273a.f20261a;
                    if (i4 == 3) {
                        ofFloat9.setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
                        ofFloat6.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet = this.f20273a.f20266f;
                        if (animatorSet != null) {
                            AnimatorSet.Builder play = animatorSet.play(ofFloat);
                            if (play != null) {
                                AnimatorSet.Builder with = play.with(ofFloat2);
                                if (with != null) {
                                    AnimatorSet.Builder with2 = with.with(ofFloat9);
                                    if (with2 != null) {
                                        with2.before(ofFloat6);
                                    }
                                }
                            }
                        }
                    } else if (i4 == 5) {
                        ofFloat10.setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
                        ofFloat5.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet2 = this.f20273a.f20266f;
                        if (animatorSet2 != null) {
                            AnimatorSet.Builder play2 = animatorSet2.play(ofFloat);
                            if (play2 != null) {
                                AnimatorSet.Builder with3 = play2.with(ofFloat2);
                                if (with3 != null) {
                                    AnimatorSet.Builder with4 = with3.with(ofFloat10);
                                    if (with4 != null) {
                                        with4.before(ofFloat5);
                                    }
                                }
                            }
                        }
                    } else if (i4 == 48) {
                        ofFloat8.setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
                        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet3 = this.f20273a.f20266f;
                        if (animatorSet3 != null) {
                            AnimatorSet.Builder play3 = animatorSet3.play(ofFloat);
                            if (play3 != null) {
                                AnimatorSet.Builder with5 = play3.with(ofFloat2);
                                if (with5 != null) {
                                    AnimatorSet.Builder with6 = with5.with(ofFloat8);
                                    if (with6 != null) {
                                        with6.before(ofFloat3);
                                    }
                                }
                            }
                        }
                    } else if (i4 == 80) {
                        ofFloat7.setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
                        ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet4 = this.f20273a.f20266f;
                        if (animatorSet4 != null) {
                            AnimatorSet.Builder play4 = animatorSet4.play(ofFloat);
                            if (play4 != null) {
                                AnimatorSet.Builder with7 = play4.with(ofFloat2);
                                if (with7 != null) {
                                    AnimatorSet.Builder with8 = with7.with(ofFloat7);
                                    if (with8 != null) {
                                        with8.before(ofFloat4);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int i5 = this.f20273a.f20261a;
                    if (i5 == 3) {
                        ofFloat6.setInterpolator(new com.bytedance.ies.dmt.ui.c.b());
                        ofFloat9.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet5 = this.f20273a.f20266f;
                        if (animatorSet5 != null) {
                            AnimatorSet.Builder play5 = animatorSet5.play(ofFloat);
                            if (play5 != null) {
                                AnimatorSet.Builder with9 = play5.with(ofFloat2);
                                if (with9 != null) {
                                    AnimatorSet.Builder with10 = with9.with(ofFloat6);
                                    if (with10 != null) {
                                        with10.after(ofFloat9);
                                    }
                                }
                            }
                        }
                    } else if (i5 == 5) {
                        ofFloat5.setInterpolator(new com.bytedance.ies.dmt.ui.c.b());
                        ofFloat10.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet6 = this.f20273a.f20266f;
                        if (animatorSet6 != null) {
                            AnimatorSet.Builder play6 = animatorSet6.play(ofFloat);
                            if (play6 != null) {
                                AnimatorSet.Builder with11 = play6.with(ofFloat2);
                                if (with11 != null) {
                                    AnimatorSet.Builder with12 = with11.with(ofFloat5);
                                    if (with12 != null) {
                                        with12.after(ofFloat10);
                                    }
                                }
                            }
                        }
                    } else if (i5 == 48) {
                        ofFloat3.setInterpolator(new com.bytedance.ies.dmt.ui.c.b());
                        ofFloat8.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet7 = this.f20273a.f20266f;
                        if (animatorSet7 != null) {
                            AnimatorSet.Builder play7 = animatorSet7.play(ofFloat);
                            if (play7 != null) {
                                AnimatorSet.Builder with13 = play7.with(ofFloat2);
                                if (with13 != null) {
                                    AnimatorSet.Builder with14 = with13.with(ofFloat3);
                                    if (with14 != null) {
                                        with14.after(ofFloat8);
                                    }
                                }
                            }
                        }
                    } else if (i5 == 80) {
                        ofFloat4.setInterpolator(new com.bytedance.ies.dmt.ui.c.b());
                        ofFloat7.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet8 = this.f20273a.f20266f;
                        if (animatorSet8 != null) {
                            AnimatorSet.Builder play8 = animatorSet8.play(ofFloat);
                            if (play8 != null) {
                                AnimatorSet.Builder with15 = play8.with(ofFloat2);
                                if (with15 != null) {
                                    AnimatorSet.Builder with16 = with15.with(ofFloat4);
                                    if (with16 != null) {
                                        with16.after(ofFloat7);
                                    }
                                }
                            }
                        }
                    }
                }
                AnimatorSet animatorSet9 = this.f20273a.f20266f;
                if (animatorSet9 != null) {
                    animatorSet9.addListener(new AnimatorListenerAdapter(this) {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ e f20276a;

                        {
                            this.f20276a = r1;
                        }

                        public final void onAnimationEnd(@NotNull Animator animator) {
                            Intrinsics.checkParameterIsNotNull(animator, "animation");
                            super.onAnimationEnd(animator);
                            if (!this.f20276a.f20275c) {
                                this.f20276a.f20274b.setVisibility(8);
                                c cVar = this.f20276a.f20273a.i;
                                if (cVar != null) {
                                    cVar.a();
                                }
                                this.f20276a.f20273a.b();
                            }
                        }

                        public final void onAnimationStart(@NotNull Animator animator) {
                            Intrinsics.checkParameterIsNotNull(animator, "animation");
                            super.onAnimationStart(animator);
                            if (this.f20276a.f20275c) {
                                d dVar = this.f20276a.f20273a.h;
                                if (dVar != null) {
                                    dVar.a();
                                }
                                this.f20276a.f20274b.setVisibility(0);
                            }
                        }
                    });
                }
                if (this.f20273a.f20262b) {
                    AnimatorSet animatorSet10 = this.f20273a.f20266f;
                    if (animatorSet10 != null) {
                        animatorSet10.setInterpolator(new OvershootInterpolator(1.0f));
                    }
                }
                AnimatorSet animatorSet11 = this.f20273a.f20266f;
                if (animatorSet11 != null) {
                    animatorSet11.start();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 11})
    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20277a;

        f(b bVar) {
            this.f20277a = bVar;
        }

        public final void run() {
            this.f20277a.a(false);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 11})
    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20278a;

        g(b bVar) {
            this.f20278a = bVar;
        }

        public final void onClick(View view) {
            C0184b bVar = this.f20278a.g;
            if (bVar != null) {
                bVar.a();
            }
            this.f20278a.dismiss();
        }
    }

    private static int a(int i2) {
        if (i2 == 3) {
            return 2;
        }
        if (i2 != 5) {
            if (i2 == 48) {
                return 3;
            }
            if (i2 == 80) {
                return 0;
            }
        }
        return 1;
    }

    public final int c() {
        a();
        View contentView = getContentView();
        Intrinsics.checkExpressionValueIsNotNull(contentView, "contentView");
        return contentView.getMeasuredHeight();
    }

    public final int d() {
        a();
        View contentView = getContentView();
        Intrinsics.checkExpressionValueIsNotNull(contentView, "contentView");
        return contentView.getMeasuredWidth();
    }

    public final void dismiss() {
        if (!this.L) {
            a(false);
            getContentView().removeCallbacks(this.Q);
            this.s = 0;
            this.t = 0;
        }
    }

    public final void a() {
        if (this.w == 0 || this.x == 0) {
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
            return;
        }
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(this.w, 1073741824), View.MeasureSpec.makeMeasureSpec(this.x, 1073741824));
    }

    public final void b() {
        AnimatorSet animatorSet = this.f20266f;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f20266f;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f20266f = null;
        if (!this.N.isFinishing() && isShowing()) {
            try {
                c.a(this);
            } catch (Exception unused) {
            }
        }
    }

    public final int e() {
        a();
        View contentView = getContentView();
        Intrinsics.checkExpressionValueIsNotNull(contentView, "contentView");
        int measuredWidth = contentView.getMeasuredWidth();
        a aVar = this.f20265e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        return measuredWidth - (aVar.getPADDING() * 4);
    }

    public final void f() {
        if (!this.L) {
            a aVar = this.f20265e;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
            }
            aVar.setVisibility(8);
            b();
            getContentView().removeCallbacks(this.Q);
            this.s = 0;
            this.t = 0;
        }
    }

    public final void a(@NotNull com.bytedance.ies.dmt.ui.base.b<Point> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "locationSupplier");
        this.P = bVar;
    }

    @NotNull
    public static final /* synthetic */ a a(b bVar) {
        a aVar = bVar.f20265e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        return aVar;
    }

    private final void a(View view) {
        this.f20265e = new a(this.N);
        a aVar = this.f20265e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        aVar.setBackgroundColor(0);
        a aVar2 = this.f20265e;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        aVar2.addView(view);
        a aVar3 = this.f20265e;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        aVar3.setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        a aVar4 = this.f20265e;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        aVar4.setLayoutParams(marginLayoutParams);
        a aVar5 = this.f20265e;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        aVar5.setVisibility(8);
        if (this.l != 0) {
            a aVar6 = this.f20265e;
            if (aVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
            }
            aVar6.setMBgColor(this.l);
        }
        a aVar7 = this.f20265e;
        if (aVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        aVar7.setMNeedPath(this.n);
        a aVar8 = this.f20265e;
        if (aVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        aVar8.setMNeedArrow(this.D);
        a aVar9 = this.f20265e;
        if (aVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        aVar9.setMNeedPressFade(this.o);
        a aVar10 = this.f20265e;
        if (aVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        aVar10.setMNeedShadow(this.p);
        a aVar11 = this.f20265e;
        if (aVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        aVar11.setMShadowColor(this.q);
        a aVar12 = this.f20265e;
        if (aVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        aVar12.setOnClickListener(new g(this));
        a aVar13 = this.f20265e;
        if (aVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        setContentView(aVar13);
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public b(@NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
        this.N = aVar.E;
        this.f20261a = aVar.f20267a;
        this.k = aVar.f20268b;
        this.l = aVar.f20269c;
        this.m = aVar.f20270d;
        this.n = aVar.f20271e;
        this.o = aVar.f20272f;
        this.f20262b = aVar.g;
        this.r = aVar.h;
        this.s = aVar.i;
        this.t = aVar.j;
        this.f20263c = aVar.k;
        this.u = aVar.l;
        this.v = aVar.m;
        this.O = aVar.n;
        this.x = aVar.p;
        this.w = aVar.o;
        this.y = aVar.q;
        this.z = aVar.r;
        this.A = aVar.s;
        this.B = aVar.u;
        this.C = aVar.t;
        this.g = aVar.v;
        this.i = aVar.w;
        this.h = aVar.x;
        this.D = aVar.y;
        this.E = aVar.z;
        this.H = aVar.A;
        this.p = aVar.B;
        this.q = aVar.C;
        this.I = aVar.D;
        this.f20264d = (int) UIUtils.dip2Px(this.N, 3.0f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(this.H);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        if (this.v || this.O == null) {
            this.K = new DmtTextView(this.N);
            if (this.B != 0) {
                TextView textView = this.K;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTextView");
                }
                textView.setTextColor(this.B);
            } else {
                TextView textView2 = this.K;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTextView");
                }
                textView2.setTextColor(this.N.getResources().getColor(C0906R.color.ak7));
            }
            TextView textView3 = this.K;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTextView");
            }
            textView3.setTextSize(1, 13.0f);
            if (Build.VERSION.SDK_INT >= 17) {
                TextView textView4 = this.K;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTextView");
                }
                textView4.setTextAlignment(5);
            }
            TextView textView5 = this.K;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTextView");
            }
            textView5.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            TextView textView6 = this.K;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTextView");
            }
            textView6.setGravity(17);
            TextView textView7 = this.K;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTextView");
            }
            textView7.setMaxWidth((int) UIUtils.dip2Px(this.N, 197.0f));
            TextView textView8 = this.K;
            if (textView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTextView");
            }
            textView8.setMaxLines(2);
            TextView textView9 = this.K;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTextView");
            }
            a((View) textView9);
            this.r = true;
            if (!TextUtils.isEmpty(this.y)) {
                TextView textView10 = this.K;
                if (textView10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTextView");
                }
                textView10.setText(this.y);
            }
            if (this.z != 0) {
                TextView textView11 = this.K;
                if (textView11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTextView");
                }
                textView11.setText(this.z);
            }
            if (this.A != 0.0f) {
                TextView textView12 = this.K;
                if (textView12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTextView");
                }
                textView12.setTextSize(1, this.A);
            }
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            a(this.O);
            a aVar2 = this.f20265e;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
            }
            aVar2.setUseDefaultView(false);
        }
        if (!(this.w == 0 || this.x == 0)) {
            setWidth(this.w);
            setHeight(this.x);
            a.l = getWidth();
            a.m = getHeight();
        }
        if (this.r && this.r) {
            if (Build.VERSION.SDK_INT < 19) {
                View contentView = getContentView();
                Intrinsics.checkExpressionValueIsNotNull(contentView, "contentView");
                contentView.setSystemUiVisibility(8);
            } else if (Build.VERSION.SDK_INT >= 19) {
                View contentView2 = getContentView();
                Intrinsics.checkExpressionValueIsNotNull(contentView2, "contentView");
                contentView2.setSystemUiVisibility(4102);
            }
        }
        if (this.l != 0) {
            a aVar3 = this.f20265e;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
            }
            aVar3.setMBgColor(this.l);
        }
        if (this.m != 0) {
            a aVar4 = this.f20265e;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
            }
            aVar4.setMBorderColor(this.m);
        }
        if (!this.I) {
            a aVar5 = this.f20265e;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
            }
            aVar5.setNeedAddColor(false);
        }
        a aVar6 = this.f20265e;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        aVar6.setMNeedPath(this.n);
        a aVar7 = this.f20265e;
        if (aVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        aVar7.setBubbleOrientation(a(this.f20261a));
        if (this.E != 0.0f) {
            a aVar8 = this.f20265e;
            if (aVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
            }
            aVar8.setMPadding(this.E);
        }
        this.Q = new f(this);
    }

    public final void a(boolean z2) {
        a aVar = this.f20265e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
        }
        if (!z2) {
            this.L = true;
        }
        this.f20266f = new AnimatorSet();
        if (aVar != null) {
            aVar.post(new e(this, aVar, z2));
        }
    }

    private final void b(View view, int i2, boolean z2) {
        int i3;
        int i4;
        int i5;
        Point point;
        int[] iArr = new int[2];
        int i6 = 0;
        if (this.P == null || Build.VERSION.SDK_INT < 24) {
            view.getLocationOnScreen(iArr);
        } else {
            com.bytedance.ies.dmt.ui.base.b<Point> bVar = this.P;
            if (bVar != null) {
                point = (Point) bVar.a();
            } else {
                point = null;
            }
            if (point == null) {
                Intrinsics.throwNpe();
            }
            iArr[0] = point.x;
            iArr[1] = point.y;
        }
        if (i2 == 3) {
            if (z2) {
                i3 = (view.getMeasuredHeight() - c()) / 2;
            } else {
                i3 = 0;
            }
            showAtLocation(view, 0, (iArr[0] + this.s) - d(), iArr[1] + this.t + i3 + ((int) UIUtils.dip2Px(this.N, 1.3f)));
        } else if (i2 == 5) {
            if (z2) {
                i4 = (view.getMeasuredHeight() - c()) / 2;
            } else {
                i4 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.s + view.getWidth(), iArr[1] + this.t + i4 + ((int) UIUtils.dip2Px(this.N, 1.3f)));
        } else if (i2 == 48) {
            if (z2) {
                i5 = (view.getMeasuredWidth() - d()) / 2;
            } else {
                i5 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.s + i5 + ((int) UIUtils.dip2Px(this.N, 1.4f)), (iArr[1] - c()) + this.t + ((int) UIUtils.dip2Px(this.N, 1.3f)));
        } else if (i2 == 80) {
            if (z2) {
                i6 = (view.getMeasuredWidth() - d()) / 2;
            }
            showAsDropDown(view, this.s + i6 + ((int) UIUtils.dip2Px(this.N, 1.4f)), this.t + ((int) UIUtils.dip2Px(this.N, 1.3f)));
            a(true);
        }
    }

    public final void a(@Nullable View view, int i2, boolean z2) {
        if (!this.N.isFinishing() && view != null && view.getWindowToken() != null) {
            this.F = view.getMeasuredHeight();
            this.G = view.getMeasuredWidth();
            getContentView().removeCallbacks(this.Q);
            this.f20261a = i2;
            a aVar = this.f20265e;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
            }
            this.M = aVar.getPADDING();
            if (!isShowing()) {
                int a2 = a(i2);
                if (this.w == 0 || this.x == 0) {
                    getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
                } else {
                    getContentView().measure(View.MeasureSpec.makeMeasureSpec(this.w, 1073741824), View.MeasureSpec.makeMeasureSpec(this.x, 1073741824));
                }
                if (z2) {
                    if (i2 == 80 || i2 == 48) {
                        this.j = ((float) d()) / 2.0f;
                    } else {
                        this.j = ((float) c()) / 2.0f;
                    }
                } else if (!this.J) {
                    this.k += (float) (this.M * 8);
                    this.J = true;
                }
                a aVar2 = this.f20265e;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
                }
                aVar2.a(a2, this.j + this.k);
                b(view, i2, z2);
                this.L = false;
                if (this.u > 0) {
                    getContentView().postDelayed(this.Q, this.u);
                }
            } else {
                c.a(this);
            }
        }
    }

    public final void showAtLocation(@NotNull View view, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(view, "parent");
        try {
            super.showAtLocation(view, i2, i3, i4);
            a(true);
        } catch (Exception unused) {
        }
    }

    public final void a(@Nullable View view, int i2, float f2, int i3) {
        if (i2 == 80 || i2 == 48) {
            this.s = i3;
        }
        this.j = f2;
        a(view, i2, false);
    }

    public final void a(@NotNull View view, int i2, int i3, int i4, float f2) {
        Intrinsics.checkParameterIsNotNull(view, "parent");
        try {
            this.f20261a = i2;
            this.k = f2;
            a aVar = this.f20265e;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDmtBubbleLayout");
            }
            aVar.a(a(i2), this.j + this.k);
            showAtLocation(view, 0, i3, i4);
            if (this.u > 0) {
                getContentView().postDelayed(this.Q, this.u);
            }
        } catch (Exception unused) {
        }
    }
}
