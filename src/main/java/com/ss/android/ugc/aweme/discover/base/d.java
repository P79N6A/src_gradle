package com.ss.android.ugc.aweme.discover.base;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001e\u0010&\u001a\u00020'2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\b\u0010)\u001a\u00020'H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/MusicViewHolderHelper;", "Landroid/arch/lifecycle/Observer;", "Lkotlin/Pair;", "", "", "playStatus", "Landroid/widget/ImageView;", "activity", "Landroid/support/v4/app/FragmentActivity;", "(Landroid/widget/ImageView;Landroid/support/v4/app/FragmentActivity;)V", "getActivity", "()Landroid/support/v4/app/FragmentActivity;", "setActivity", "(Landroid/support/v4/app/FragmentActivity;)V", "mPlayHelper", "Lcom/ss/android/ugc/aweme/discover/helper/MusicPlayHelper;", "getMPlayHelper", "()Lcom/ss/android/ugc/aweme/discover/helper/MusicPlayHelper;", "setMPlayHelper", "(Lcom/ss/android/ugc/aweme/discover/helper/MusicPlayHelper;)V", "mRotateAnimation", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "getMRotateAnimation", "()Landroid/view/animation/Animation;", "setMRotateAnimation", "(Landroid/view/animation/Animation;)V", "value", "Lcom/ss/android/ugc/aweme/music/model/Music;", "music", "getMusic", "()Lcom/ss/android/ugc/aweme/music/model/Music;", "setMusic", "(Lcom/ss/android/ugc/aweme/music/model/Music;)V", "getPlayStatus", "()Landroid/widget/ImageView;", "setPlayStatus", "(Landroid/widget/ImageView;)V", "onChanged", "", "t", "updatePlayingStatus", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d implements Observer<Pair<? extends Integer, ? extends Long>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42151a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public MusicPlayHelper f42152b;

    /* renamed from: c  reason: collision with root package name */
    public Animation f42153c = AnimationUtils.loadAnimation(this.f42156f, C0906R.anim.ck);
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public Music f42154d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public ImageView f42155e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public FragmentActivity f42156f;

    private final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f42151a, false, 36154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42151a, false, 36154, new Class[0], Void.TYPE);
            return;
        }
        this.f42155e.clearAnimation();
        MusicPlayHelper musicPlayHelper = this.f42152b;
        Music music = this.f42154d;
        if (music == null) {
            Intrinsics.throwNpe();
        }
        if (musicPlayHelper.a(music.getId())) {
            this.f42155e.setImageResource(2130839288);
            this.f42152b.a(this.f42156f, this);
            return;
        }
        MusicPlayHelper musicPlayHelper2 = this.f42152b;
        Music music2 = this.f42154d;
        if (music2 == null) {
            Intrinsics.throwNpe();
        }
        if (musicPlayHelper2.b(music2.getId())) {
            this.f42155e.setImageResource(2130839287);
            this.f42155e.startAnimation(this.f42153c);
            return;
        }
        this.f42155e.setImageResource(2130839289);
        this.f42152b.a((Observer<Pair<Integer, Long>>) this);
    }

    public final void a(@Nullable Music music) {
        Music music2 = music;
        if (PatchProxy.isSupport(new Object[]{music2}, this, f42151a, false, 36152, new Class[]{Music.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{music2}, this, f42151a, false, 36152, new Class[]{Music.class}, Void.TYPE);
            return;
        }
        this.f42154d = music2;
        a();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        Pair pair = (Pair) obj;
        if (PatchProxy.isSupport(new Object[]{pair}, this, f42151a, false, 36153, new Class[]{Pair.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pair}, this, f42151a, false, 36153, new Class[]{Pair.class}, Void.TYPE);
            return;
        }
        a();
    }

    public d(@NotNull ImageView imageView, @NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(imageView, "playStatus");
        Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f42155e = imageView;
        this.f42156f = fragmentActivity;
        ViewModel viewModel = ViewModelProviders.of(this.f42156f).get(MusicPlayHelper.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…icPlayHelper::class.java)");
        this.f42152b = (MusicPlayHelper) viewModel;
        this.f42155e.setVisibility(0);
        this.f42155e.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42157a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f42158b;

            {
                this.f42158b = r1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:29:0x0167  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x0172 A[RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r19) {
                /*
                    r18 = this;
                    r7 = r18
                    r9 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r10 = 0
                    r0[r10] = r19
                    com.meituan.robust.ChangeQuickRedirect r2 = f42157a
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<android.view.View> r1 = android.view.View.class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 36157(0x8d3d, float:5.0667E-41)
                    r1 = r18
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0036
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r0[r10] = r19
                    com.meituan.robust.ChangeQuickRedirect r2 = f42157a
                    r3 = 0
                    r4 = 36157(0x8d3d, float:5.0667E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<android.view.View> r1 = android.view.View.class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r18
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0036:
                    com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r19)
                    com.ss.android.ugc.aweme.discover.base.d r0 = r7.f42158b
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r0 = r0.f42152b
                    com.ss.android.ugc.aweme.discover.base.d r1 = r7.f42158b
                    com.ss.android.ugc.aweme.music.model.Music r1 = r1.f42154d
                    if (r1 != 0) goto L_0x0046
                    kotlin.jvm.internal.Intrinsics.throwNpe()
                L_0x0046:
                    long r1 = r1.getId()
                    boolean r0 = r0.a((long) r1)
                    if (r0 != 0) goto L_0x015a
                    com.ss.android.ugc.aweme.discover.base.d r0 = r7.f42158b
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r0 = r0.f42152b
                    com.ss.android.ugc.aweme.discover.base.d r1 = r7.f42158b
                    com.ss.android.ugc.aweme.music.model.Music r1 = r1.f42154d
                    if (r1 != 0) goto L_0x005d
                    kotlin.jvm.internal.Intrinsics.throwNpe()
                L_0x005d:
                    long r1 = r1.getId()
                    boolean r0 = r0.b(r1)
                    if (r0 == 0) goto L_0x0069
                    goto L_0x015a
                L_0x0069:
                    com.ss.android.ugc.aweme.discover.base.d r0 = r7.f42158b
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r0 = r0.f42152b
                    com.ss.android.ugc.aweme.discover.base.d r1 = r7.f42158b
                    android.support.v4.app.FragmentActivity r1 = r1.f42156f
                    android.arch.lifecycle.LifecycleOwner r1 = (android.arch.lifecycle.LifecycleOwner) r1
                    com.ss.android.ugc.aweme.discover.base.d r2 = r7.f42158b
                    android.arch.lifecycle.Observer r2 = (android.arch.lifecycle.Observer) r2
                    r0.a(r1, r2)
                    com.ss.android.ugc.aweme.discover.base.d r0 = r7.f42158b
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r0 = r0.f42152b
                    com.ss.android.ugc.aweme.discover.base.d r1 = r7.f42158b
                    android.support.v4.app.FragmentActivity r1 = r1.f42156f
                    com.ss.android.ugc.aweme.discover.base.d r2 = r7.f42158b
                    com.ss.android.ugc.aweme.music.model.Music r2 = r2.f42154d
                    if (r2 != 0) goto L_0x008b
                    kotlin.jvm.internal.Intrinsics.throwNpe()
                L_0x008b:
                    r3 = 2
                    java.lang.Object[] r11 = new java.lang.Object[r3]
                    r11[r10] = r1
                    r11[r9] = r2
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper.f42284a
                    r14 = 0
                    r15 = 36323(0x8de3, float:5.09E-41)
                    java.lang.Class[] r4 = new java.lang.Class[r3]
                    java.lang.Class<android.support.v4.app.FragmentActivity> r5 = android.support.v4.app.FragmentActivity.class
                    r4[r10] = r5
                    java.lang.Class<com.ss.android.ugc.aweme.music.model.Music> r5 = com.ss.android.ugc.aweme.music.model.Music.class
                    r4[r9] = r5
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r0
                    r16 = r4
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r4 == 0) goto L_0x00cd
                    java.lang.Object[] r11 = new java.lang.Object[r3]
                    r11[r10] = r1
                    r11[r9] = r2
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper.f42284a
                    r14 = 0
                    r15 = 36323(0x8de3, float:5.09E-41)
                    java.lang.Class[] r1 = new java.lang.Class[r3]
                    java.lang.Class<android.support.v4.app.FragmentActivity> r2 = android.support.v4.app.FragmentActivity.class
                    r1[r10] = r2
                    java.lang.Class<com.ss.android.ugc.aweme.music.model.Music> r2 = com.ss.android.ugc.aweme.music.model.Music.class
                    r1[r9] = r2
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r0
                    r16 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    goto L_0x0161
                L_0x00cd:
                    java.lang.String r3 = "context"
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r3)
                    java.lang.String r3 = "music"
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
                    com.ss.android.ugc.b.b r3 = r0.f42287c
                    r3.b()
                    r0.f42288d = r2
                    com.ss.android.ugc.aweme.music.util.c r3 = com.ss.android.ugc.aweme.music.util.c.f56796b
                    com.ss.android.ugc.aweme.shortvideo.model.MusicModel r3 = r3.a((com.ss.android.ugc.aweme.music.model.Music) r2)
                    android.content.Context r1 = (android.content.Context) r1
                    boolean r1 = com.ss.android.ugc.aweme.music.util.d.a((com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r3, (android.content.Context) r1, (boolean) r9)
                    if (r1 == 0) goto L_0x0161
                    com.ss.android.ugc.b.b.a r1 = new com.ss.android.ugc.b.b.a
                    r1.<init>()
                    java.util.HashMap r4 = com.ss.android.ugc.aweme.music.util.d.a((boolean) r9)
                    r1.a(r4)
                    com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r4 = r3.getMusicType()
                    com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r5 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType.ONLINE
                    if (r4 != r5) goto L_0x0103
                    r4 = 4
                    r1.f77132b = r4
                L_0x0103:
                    int r4 = r3.getDuration()
                    r1.f77133c = r4
                    com.ss.android.ugc.aweme.arch.widgets.base.b<kotlin.Pair<java.lang.Integer, java.lang.Long>> r4 = r0.f42286b
                    kotlin.Pair r5 = new kotlin.Pair
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
                    long r8 = r2.getId()
                    java.lang.Long r8 = java.lang.Long.valueOf(r8)
                    r5.<init>(r6, r8)
                    r4.setValue(r5)
                    com.ss.android.ugc.b.b r4 = r0.f42287c
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b r5 = new com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b
                    r5.<init>(r0, r2, r3)
                    com.ss.android.ugc.b.a.d r5 = (com.ss.android.ugc.b.a.d) r5
                    r4.a((com.ss.android.ugc.b.a.d) r5)
                    com.ss.android.ugc.b.b r2 = r0.f42287c
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$c r4 = new com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$c
                    r4.<init>(r0)
                    com.ss.android.ugc.b.a.b r4 = (com.ss.android.ugc.b.a.b) r4
                    r2.a((com.ss.android.ugc.b.a.b) r4)
                    com.ss.android.ugc.b.b r2 = r0.f42287c
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$d r4 = new com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$d
                    r4.<init>(r0)
                    com.ss.android.ugc.b.a.c r4 = (com.ss.android.ugc.b.a.c) r4
                    r2.a((com.ss.android.ugc.b.a.c) r4)
                    com.ss.android.ugc.aweme.music.c r2 = com.ss.android.ugc.aweme.music.c.a()
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$e r4 = new com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$e
                    r4.<init>(r0, r1)
                    com.ss.android.ugc.aweme.music.c$a r4 = (com.ss.android.ugc.aweme.music.c.a) r4
                    r2.f56320b = r4
                    com.ss.android.ugc.aweme.music.c r0 = com.ss.android.ugc.aweme.music.c.a()
                    java.util.HashMap<java.lang.String, java.lang.String> r1 = r1.f77134d
                    r0.a(r3, r1)
                    goto L_0x0161
                L_0x015a:
                    com.ss.android.ugc.aweme.discover.base.d r0 = r7.f42158b
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r0 = r0.f42152b
                    r0.a()
                L_0x0161:
                    com.ss.android.ugc.aweme.discover.base.d r0 = r7.f42158b
                    android.view.animation.Animation r0 = r0.f42153c
                    if (r0 == 0) goto L_0x0172
                    android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
                    r1.<init>()
                    android.view.animation.Interpolator r1 = (android.view.animation.Interpolator) r1
                    r0.setInterpolator(r1)
                    return
                L_0x0172:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.base.d.AnonymousClass1.onClick(android.view.View):void");
            }
        });
    }
}
