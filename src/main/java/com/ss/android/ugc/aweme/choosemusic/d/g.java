package com.ss.android.ugc.aweme.choosemusic.d;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35830a;

    /* renamed from: b  reason: collision with root package name */
    private final a f35831b;

    /* renamed from: c  reason: collision with root package name */
    private final String f35832c;

    /* renamed from: d  reason: collision with root package name */
    private final Music f35833d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f35834e;

    g(a aVar, String str, Music music, boolean z) {
        this.f35831b = aVar;
        this.f35832c = str;
        this.f35833d = music;
        this.f35834e = z;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35830a, false, 26743, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35830a, false, 26743, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f35831b;
        String str = this.f35832c;
        Music music = this.f35833d;
        boolean z = this.f35834e;
        if (!iVar.c() && !iVar.d()) {
            ChallengeDetail challengeDetail = (ChallengeDetail) iVar.e();
            if (challengeDetail != null) {
                List<Music> connectMusics = challengeDetail.challenge.getConnectMusics();
                if (connectMusics != null && connectMusics.size() > 0) {
                    aVar.f35805c.a("data_challenge", (Object) challengeDetail);
                    str = null;
                    music = null;
                }
            }
        }
        aVar.a(z, str, music);
        return null;
    }
}
