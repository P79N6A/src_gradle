package com.ss.android.ugc.aweme.share.seconditem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.v;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/share/seconditem/AnimItemView;", "Lcom/ss/android/ugc/aweme/share/BottomShareItem;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mIsShowAnimation", "", "getMIsShowAnimation", "()Z", "setMIsShowAnimation", "(Z)V", "cancelItemAnimation", "", "startItemAnimation", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class a extends v {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65271a;

    /* renamed from: f  reason: collision with root package name */
    public boolean f65272f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.share.seconditem.a$a  reason: collision with other inner class name */
    public static final class C0705a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f65274b;

        public C0705a(a aVar) {
            this.f65274b = aVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f65273a, false, 73688, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f65273a, false, 73688, new Class[0], Void.TYPE);
                return;
            }
            this.f65274b.getShareImageView().animate().scaleX(1.0f).scaleY(1.0f).setDuration(350).withEndAction(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65275a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C0705a f65276b;

                {
                    this.f65276b = r1;
                }

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f65275a, false, 73689, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f65275a, false, 73689, new Class[0], Void.TYPE);
                        return;
                    }
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.9f, 1.03f, 0.9f, 1.03f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation.setDuration(300);
                    scaleAnimation.setRepeatMode(2);
                    scaleAnimation.setRepeatCount(-1);
                    this.f65276b.f65274b.getShareImageView().startAnimation(scaleAnimation);
                }
            }).start();
        }
    }

    @JvmOverloads
    public a(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean getMIsShowAnimation() {
        return this.f65272f;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65271a, false, 73685, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65271a, false, 73685, new Class[0], Void.TYPE);
            return;
        }
        if (this.f65272f) {
            this.f65272f = false;
            getShareImageView().animate().cancel();
            ImageView shareImageView = getShareImageView();
            Intrinsics.checkExpressionValueIsNotNull(shareImageView, "shareImageView");
            Animation animation = shareImageView.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            ImageView shareImageView2 = getShareImageView();
            Intrinsics.checkExpressionValueIsNotNull(shareImageView2, "shareImageView");
            shareImageView2.setScaleX(1.0f);
            ImageView shareImageView3 = getShareImageView();
            Intrinsics.checkExpressionValueIsNotNull(shareImageView3, "shareImageView");
            shareImageView3.setScaleY(1.0f);
        }
    }

    public final void setMIsShowAnimation(boolean z) {
        this.f65272f = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
