package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/views/CommerceLikeLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "composition", "Lcom/airbnb/lottie/LottieComposition;", "divideTime", "", "lottieStartTime", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mLottieAnimationViewFirst", "Lcom/ss/android/ugc/aweme/base/ui/AnimationImageView;", "mLottieAnimationViewSecond", "success", "Ljava/util/concurrent/atomic/AtomicBoolean;", "clearLikeAnim", "", "getFullScreenLottieView", "initCommerceLottie", "setCommerceDigg", "aweme", "showAnim", "enterFrom", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CommerceLikeLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39893a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f39894b;

    /* renamed from: c  reason: collision with root package name */
    public LottieComposition f39895c;

    /* renamed from: d  reason: collision with root package name */
    private AnimationImageView f39896d;

    /* renamed from: e  reason: collision with root package name */
    private AnimationImageView f39897e;

    /* renamed from: f  reason: collision with root package name */
    private Aweme f39898f;
    private long g;
    private final long h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39899a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommerceLikeLayout f39900b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f39901c;

        a(CommerceLikeLayout commerceLikeLayout, Aweme aweme) {
            this.f39900b = commerceLikeLayout;
            this.f39901c = aweme;
        }

        public final void run() {
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f39899a, false, 32852, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39899a, false, 32852, new Class[0], Void.TYPE);
                return;
            }
            Context context = this.f39900b.getContext();
            Aweme aweme = this.f39901c;
            if (aweme != null) {
                str = aweme.getCommerceAdLikeDigg();
            } else {
                str = null;
            }
            final j a2 = f.a(context, str);
            Intrinsics.checkExpressionValueIsNotNull(a2, "task");
            if (a2.f4883b == null && a2.f4882a != null) {
                com.ss.android.b.a.a.a.b(new Runnable(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f39902a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ a f39903b;

                    {
                        this.f39903b = r1;
                    }

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f39902a, false, 32853, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f39902a, false, 32853, new Class[0], Void.TYPE);
                            return;
                        }
                        this.f39903b.f39900b.f39894b.set(true);
                        CommerceLikeLayout commerceLikeLayout = this.f39903b.f39900b;
                        j jVar = a2;
                        Intrinsics.checkExpressionValueIsNotNull(jVar, "task");
                        commerceLikeLayout.f39895c = (LottieComposition) jVar.f4882a;
                    }
                });
            }
        }
    }

    @JvmOverloads
    public CommerceLikeLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public CommerceLikeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39893a, false, 32847, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39893a, false, 32847, new Class[0], Void.TYPE);
            return;
        }
        removeAllViews();
        AnimationImageView animationImageView = this.f39896d;
        if (animationImageView != null) {
            animationImageView.cancelAnimation();
        }
        AnimationImageView animationImageView2 = this.f39897e;
        if (animationImageView2 != null) {
            animationImageView2.cancelAnimation();
        }
        this.f39896d = null;
        this.f39897e = null;
    }

    private final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f39893a, false, 32845, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f39893a, false, 32845, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (this.f39896d == null) {
            this.f39896d = b(context);
            addView(this.f39896d);
        }
        if (this.f39897e == null) {
            this.f39897e = b(context);
            addView(this.f39897e);
        }
    }

    private final AnimationImageView b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f39893a, false, 32846, new Class[]{Context.class}, AnimationImageView.class)) {
            return (AnimationImageView) PatchProxy.accessDispatch(new Object[]{context2}, this, f39893a, false, 32846, new Class[]{Context.class}, AnimationImageView.class);
        }
        AnimationImageView animationImageView = new AnimationImageView(context2);
        animationImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        animationImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return animationImageView;
    }

    public final void setCommerceDigg(@Nullable Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f39893a, false, 32849, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f39893a, false, 32849, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme != null) {
            str = aweme.getCommerceAdLikeDigg();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f39898f = aweme;
            com.ss.android.b.a.a.a.a(new a(this, aweme));
        }
    }

    public final void a(@NotNull String str) {
        String str2;
        String str3;
        CommerceLikeLayout commerceLikeLayout;
        String str4;
        String str5;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str}, this, f39893a, false, 32848, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f39893a, false, 32848, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "enterFrom");
        Aweme aweme = this.f39898f;
        String str6 = null;
        if (aweme != null) {
            str2 = aweme.getCommerceAdLikeDigg();
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!this.f39894b.get() || this.f39895c == null) {
                d a2 = d.a().a("fail_type", "load_fail").a("enter_from", str);
                Aweme aweme2 = this.f39898f;
                if (aweme2 != null) {
                    str3 = aweme2.getAid();
                } else {
                    str3 = null;
                }
                d a3 = a2.a("group_id", str3);
                Aweme aweme3 = this.f39898f;
                if (aweme3 != null) {
                    User author = aweme3.getAuthor();
                    if (author != null) {
                        str6 = author.getUid();
                    }
                }
                r.a("show_egg_ad_fail", (Map) a3.a("author_id", str6).f34114b);
            } else {
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                a(context);
                AnimationImageView animationImageView = this.f39897e;
                if (animationImageView != null) {
                    LottieComposition lottieComposition = this.f39895c;
                    if (lottieComposition == null) {
                        Intrinsics.throwNpe();
                    }
                    animationImageView.setComposition(lottieComposition);
                }
                AnimationImageView animationImageView2 = this.f39896d;
                if (animationImageView2 != null) {
                    LottieComposition lottieComposition2 = this.f39895c;
                    if (lottieComposition2 == null) {
                        Intrinsics.throwNpe();
                    }
                    animationImageView2.setComposition(lottieComposition2);
                }
                if (this.g == 0 || System.currentTimeMillis() - this.g > this.h) {
                    if (this.f39896d == null || this.f39897e == null) {
                        z = false;
                    }
                    if (z) {
                        commerceLikeLayout = this;
                    } else {
                        commerceLikeLayout = null;
                    }
                    if (commerceLikeLayout != null) {
                        AnimationImageView animationImageView3 = this.f39896d;
                        if (animationImageView3 == null) {
                            Intrinsics.throwNpe();
                        }
                        if (!animationImageView3.isAnimating()) {
                            AnimationImageView animationImageView4 = this.f39896d;
                            if (animationImageView4 != null) {
                                animationImageView4.playAnimation();
                            }
                            d a4 = d.a().a("enter_from", str);
                            Aweme aweme4 = this.f39898f;
                            if (aweme4 != null) {
                                str5 = aweme4.getAid();
                            } else {
                                str5 = null;
                            }
                            d a5 = a4.a("group_id", str5);
                            Aweme aweme5 = this.f39898f;
                            if (aweme5 != null) {
                                User author2 = aweme5.getAuthor();
                                if (author2 != null) {
                                    str6 = author2.getUid();
                                }
                            }
                            r.a("show_egg_ad", (Map) a5.a("author_id", str6).f34114b);
                            this.g = System.currentTimeMillis();
                        } else {
                            AnimationImageView animationImageView5 = this.f39897e;
                            if (animationImageView5 == null) {
                                Intrinsics.throwNpe();
                            }
                            if (!animationImageView5.isAnimating()) {
                                AnimationImageView animationImageView6 = this.f39897e;
                                if (animationImageView6 != null) {
                                    animationImageView6.playAnimation();
                                }
                                d a6 = d.a().a("enter_from", str);
                                Aweme aweme6 = this.f39898f;
                                if (aweme6 != null) {
                                    str4 = aweme6.getAid();
                                } else {
                                    str4 = null;
                                }
                                d a7 = a6.a("group_id", str4);
                                Aweme aweme7 = this.f39898f;
                                if (aweme7 != null) {
                                    User author3 = aweme7.getAuthor();
                                    if (author3 != null) {
                                        str6 = author3.getUid();
                                    }
                                }
                                r.a("show_egg_ad", (Map) a7.a("author_id", str6).f34114b);
                                this.g = System.currentTimeMillis();
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CommerceLikeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f39894b = new AtomicBoolean(false);
        this.h = 800;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommerceLikeLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
