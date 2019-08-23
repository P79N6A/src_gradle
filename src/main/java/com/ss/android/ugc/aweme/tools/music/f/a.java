package com.ss.android.ugc.aweme.tools.music.f;

import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.shortvideo.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/music/utils/AVChallengeTransformation;", "Lcom/google/common/base/Function;", "Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "Lcom/ss/android/ugc/aweme/shortvideo/AVChallenge;", "()V", "apply", "input", "Companion", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements f<Challenge, c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74884a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0781a f74885b = new C0781a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/music/utils/AVChallengeTransformation$Companion;", "", "()V", "transform", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/shortvideo/AVChallenge;", "fromList", "", "Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.tools.music.f.a$a  reason: collision with other inner class name */
    public static final class C0781a {
        private C0781a() {
        }

        public /* synthetic */ C0781a(byte b2) {
            this();
        }
    }

    @Nullable
    /* renamed from: a */
    public final c apply(@Nullable Challenge challenge) {
        if (PatchProxy.isSupport(new Object[]{challenge}, this, f74884a, false, 87234, new Class[]{Challenge.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{challenge}, this, f74884a, false, 87234, new Class[]{Challenge.class}, c.class);
        }
        c cVar = new c();
        if (challenge == null) {
            Intrinsics.throwNpe();
        }
        cVar.cid = challenge.getCid();
        cVar.challengeName = challenge.getChallengeName();
        cVar.stickerId = challenge.getStickerId();
        cVar.type = challenge.getType();
        cVar.viewCount = challenge.getViewCount();
        cVar.userCount = challenge.getUserCount();
        return cVar;
    }
}
