package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.guide.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/guide/DefaultAudioEffectGuideFactory;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/guide/IAudioEffectGuideFactory;", "()V", "createGuide", "Lcom/ss/android/ugc/aweme/shortvideo/guide/IStickerGuide;", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67041a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f67042b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/guide/DefaultAudioEffectGuideFactory$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/guide/DefaultAudioEffectGuideFactory;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67043a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private b() {
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    @NotNull
    public final e a(@Nullable Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, f67041a, false, 76687, new Class[]{Effect.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{effect2}, this, f67041a, false, 76687, new Class[]{Effect.class}, e.class);
        } else if (effect2 == null) {
            return new e.a();
        } else {
            return new e(effect2);
        }
    }
}
