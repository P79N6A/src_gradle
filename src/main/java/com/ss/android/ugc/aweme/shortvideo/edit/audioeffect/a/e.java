package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/guide/TextAudioEffectGuide;", "Lcom/ss/android/ugc/aweme/shortvideo/guide/IStickerGuide;", "mEffect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)V", "flAnimContainer", "Landroid/view/View;", "mGuideLayout", "mParentLayout", "Landroid/widget/FrameLayout;", "mStickerPrompt", "Landroid/widget/TextView;", "mStickerPromptHideAction", "Ljava/lang/Runnable;", "mStickerPromptIcon", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "hide", "", "isAutoHide", "", "show", "layout", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e implements com.ss.android.ugc.aweme.shortvideo.guide.e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67044a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f67045c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public View f67046b;

    /* renamed from: d  reason: collision with root package name */
    private TextView f67047d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteImageView f67048e;

    /* renamed from: f  reason: collision with root package name */
    private View f67049f;
    private FrameLayout g;
    private final Runnable h = new b(this);
    private final Effect i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/guide/TextAudioEffectGuide$Companion;", "", "()V", "getAlphaAnimation", "Landroid/view/animation/Animation;", "fromAlpha", "", "toAlpha", "duration", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67050a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Animation a(float f2, float f3, long j) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), 300L}, this, f67050a, false, 76693, new Class[]{Float.TYPE, Float.TYPE, Long.TYPE}, Animation.class)) {
                return (Animation) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), 300L}, this, f67050a, false, 76693, new Class[]{Float.TYPE, Float.TYPE, Long.TYPE}, Animation.class);
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
            alphaAnimation.setDuration(300);
            return alphaAnimation;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67051a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f67052b;

        b(e eVar) {
            this.f67052b = eVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f67051a, false, 76694, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f67051a, false, 76694, new Class[0], Void.TYPE);
                return;
            }
            Animation a2 = e.f67045c.a(1.0f, 0.0f, 300);
            a2.setAnimationListener(new Animation.AnimationListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67053a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f67054b;

                public final void onAnimationRepeat(@NotNull Animation animation) {
                    Animation animation2 = animation;
                    if (PatchProxy.isSupport(new Object[]{animation2}, this, f67053a, false, 76697, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation2}, this, f67053a, false, 76697, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(animation2, "animation");
                }

                public final void onAnimationStart(@NotNull Animation animation) {
                    Animation animation2 = animation;
                    if (PatchProxy.isSupport(new Object[]{animation2}, this, f67053a, false, 76695, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation2}, this, f67053a, false, 76695, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(animation2, "animation");
                }

                {
                    this.f67054b = r1;
                }

                public final void onAnimationEnd(@NotNull Animation animation) {
                    Animation animation2 = animation;
                    if (PatchProxy.isSupport(new Object[]{animation2}, this, f67053a, false, 76696, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation2}, this, f67053a, false, 76696, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(animation2, "animation");
                    this.f67054b.f67052b.a(true);
                }
            });
            View view = this.f67052b.f67046b;
            if (view != null) {
                view.startAnimation(a2);
            }
        }
    }

    public e(@NotNull Effect effect) {
        Intrinsics.checkParameterIsNotNull(effect, "mEffect");
        this.i = effect;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67044a, false, 76691, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67044a, false, 76691, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = this.f67046b;
        if (view != null) {
            view.removeCallbacks(this.h);
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            frameLayout.removeView(this.f67049f);
        }
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable android.widget.FrameLayout r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f67044a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.widget.FrameLayout> r1 = android.widget.FrameLayout.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 76690(0x12b92, float:1.07466E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f67044a
            r3 = 0
            r4 = 76690(0x12b92, float:1.07466E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.widget.FrameLayout> r1 = android.widget.FrameLayout.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            if (r10 != 0) goto L_0x0035
            return
        L_0x0035:
            r9.g = r10
            android.content.Context r0 = r10.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690796(0x7f0f052c, float:1.9010646E38)
            r2 = r10
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r0 = r0.inflate(r1, r2, r8)
            r9.f67049f = r0
            android.widget.FrameLayout r0 = r9.g
            if (r0 == 0) goto L_0x0054
            android.view.View r1 = r9.f67049f
            r0.addView(r1)
        L_0x0054:
            android.view.View r0 = r9.f67049f
            r1 = 0
            if (r0 == 0) goto L_0x0061
            r2 = 2131166774(0x7f070636, float:1.7947803E38)
            android.view.View r0 = r0.findViewById(r2)
            goto L_0x0062
        L_0x0061:
            r0 = r1
        L_0x0062:
            r9.f67046b = r0
            android.view.View r0 = r9.f67049f
            if (r0 == 0) goto L_0x0072
            r2 = 2131170121(0x7f071349, float:1.7954591E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x0073
        L_0x0072:
            r0 = r1
        L_0x0073:
            r9.f67047d = r0
            android.widget.TextView r0 = r9.f67047d
            if (r0 == 0) goto L_0x0088
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r9.i
            java.lang.String r2 = r2.hint
            if (r2 == 0) goto L_0x0082
        L_0x007f:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L_0x0085
        L_0x0082:
            java.lang.String r2 = ""
            goto L_0x007f
        L_0x0085:
            r0.setText(r2)
        L_0x0088:
            android.view.View r0 = r9.f67049f
            if (r0 == 0) goto L_0x0096
            r1 = 2131170122(0x7f07134a, float:1.7954593E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1
        L_0x0096:
            r9.f67048e = r1
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r9.f67048e
            android.view.View r0 = (android.view.View) r0
            r1 = 8
            com.ss.android.ugc.aweme.base.utils.v.a((android.view.View) r0, (int) r1)
            android.view.View r0 = r9.f67046b
            if (r0 == 0) goto L_0x00b3
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.e$a r1 = f67045c
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 300(0x12c, double:1.48E-321)
            android.view.animation.Animation r1 = r1.a(r2, r3, r4)
            r0.startAnimation(r1)
        L_0x00b3:
            android.view.View r0 = r9.f67046b
            if (r0 == 0) goto L_0x00bf
            java.lang.Runnable r1 = r9.h
            r2 = 5000(0x1388, double:2.4703E-320)
            r0.postDelayed(r1, r2)
            return
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.e.a(android.widget.FrameLayout):void");
    }
}
