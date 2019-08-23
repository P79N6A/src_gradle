package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a;

import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.guide.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u0017\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/guide/AudioEffectGuidePresenter;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/guide/IAudioEffectGuidePresenter;", "layout", "Landroid/widget/FrameLayout;", "(Landroid/widget/FrameLayout;)V", "mFrameLayout", "mFactory", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/guide/IAudioEffectGuideFactory;", "(Landroid/widget/FrameLayout;Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/guide/IAudioEffectGuideFactory;)V", "mCurEffect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "mCurrentGuide", "Lcom/ss/android/ugc/aweme/shortvideo/guide/IStickerGuide;", "hide", "", "show", "effect", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67036a;

    /* renamed from: b  reason: collision with root package name */
    private e f67037b;

    /* renamed from: c  reason: collision with root package name */
    private Effect f67038c;

    /* renamed from: d  reason: collision with root package name */
    private final FrameLayout f67039d;

    /* renamed from: e  reason: collision with root package name */
    private final c f67040e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67036a, false, 76686, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67036a, false, 76686, new Class[0], Void.TYPE);
            return;
        }
        e eVar = this.f67037b;
        if (eVar != null) {
            eVar.a(true);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(@org.jetbrains.annotations.Nullable android.widget.FrameLayout r10) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.b$a r7 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.b.f67042b
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.b.a.f67043a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.b> r6 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.b.class
            r3 = 0
            r4 = 76689(0x12b91, float:1.07464E-40)
            r1 = r7
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x002a
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.b.a.f67043a
            r3 = 0
            r4 = 76689(0x12b91, float:1.07464E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.b> r6 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.b.class
            r1 = r7
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.b r0 = (com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.b) r0
            goto L_0x002f
        L_0x002a:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.b r0 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.b
            r0.<init>(r8)
        L_0x002f:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.c r0 = (com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.c) r0
            r9.<init>(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.a.<init>(android.widget.FrameLayout):void");
    }

    public final void a(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f67036a, false, 76685, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f67036a, false, 76685, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        e eVar = this.f67037b;
        if (eVar != null) {
            eVar.a(false);
        }
        if (effect != null && !Intrinsics.areEqual((Object) effect, (Object) this.f67038c)) {
            this.f67038c = effect;
            this.f67037b = this.f67040e.a(effect);
            e eVar2 = this.f67037b;
            if (eVar2 != null) {
                eVar2.a(this.f67039d);
            }
        }
    }

    private a(@Nullable FrameLayout frameLayout, @NotNull c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "mFactory");
        this.f67039d = frameLayout;
        this.f67040e = cVar;
    }
}
