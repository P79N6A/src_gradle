package com.ss.android.ugc.aweme.choosemusic.d;

import a.g;
import a.i;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.commercialize.utils.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.concurrent.Executor;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35803a;

    /* renamed from: b  reason: collision with root package name */
    public ChooseMusicApi.API f35804b = ChooseMusicApi.a();

    /* renamed from: c  reason: collision with root package name */
    DataCenter f35805c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f35806d;

    /* renamed from: e  reason: collision with root package name */
    Context f35807e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f35808f;
    public boolean g;
    public boolean h;

    public a(Context context, DataCenter dataCenter) {
        this.f35805c = dataCenter;
        this.f35807e = context;
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{0, 1024}, this, f35803a, false, 26729, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0, 1024}, this, f35803a, false, 26729, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f35804b.getMusicSheet(0, 1024).a((g<TResult, TContinuationResult>) new i<TResult,TContinuationResult>(this), i.f1052b);
    }

    public final void b(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{0, 20}, this, f35803a, false, 26733, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0, 20}, this, f35803a, false, 26733, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!this.g) {
            this.g = true;
            this.f35804b.userCollectedMusicList(0, 20).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this), i.f1052b);
        }
    }

    public final void c(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{0, 20}, this, f35803a, false, 26735, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0, 20}, this, f35803a, false, 26735, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!this.h) {
            this.h = true;
            this.f35804b.getHotMusicList(0, 20).a((g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(this), i.f1052b);
        }
    }

    static final /* synthetic */ ChallengeDetail a(boolean z, String str, i iVar) throws Exception {
        ChallengeDetail challengeDetail;
        if (iVar.c() || iVar.d() || iVar.e() == null) {
            return null;
        }
        if (z) {
            challengeDetail = (ChallengeDetail) iVar.e();
            Challenge challenge = challengeDetail.challenge;
            if (challenge != null && r.c(challenge)) {
                r.a(challenge);
                challengeDetail = ChallengeApi.a(str, 0, false);
            }
        } else {
            challengeDetail = (ChallengeDetail) iVar.e();
        }
        return challengeDetail;
    }

    public final void a(String str, int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, 0, 30}, this, f35803a, false, 26731, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, 0, 30}, this, f35803a, false, 26731, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!this.f35808f) {
            this.f35808f = true;
            this.f35804b.musicList(str, 0, 30).a((g<TResult, TContinuationResult>) new k<TResult,TContinuationResult>(this), i.f1052b);
        }
    }

    public final void a(boolean z, String str, Music music) {
        String str2 = str;
        final Music music2 = music;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str2, music2}, this, f35803a, false, 26726, new Class[]{Boolean.TYPE, String.class, Music.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str2, music2}, this, f35803a, false, 26726, new Class[]{Boolean.TYPE, String.class, Music.class}, Void.TYPE);
            return;
        }
        boolean z2 = z;
        this.f35804b.musicPick((Integer) this.f35805c.b("radio_cursor", 0), str2).a((g<TResult, TContinuationResult>) new g<v, v>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35809a;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public v then(i<v> iVar) throws Exception {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f35809a, false, 26751, new Class[]{i.class}, v.class)) {
                    return (v) PatchProxy.accessDispatch(new Object[]{iVar}, this, f35809a, false, 26751, new Class[]{i.class}, v.class);
                }
                if (music2 != null) {
                    try {
                        MusicDetail a2 = MusicApi.a(music2.getMid(), 0);
                        if (!(a2 == null || a2.music == null)) {
                            music2.setCollectStatus(a2.music.getCollectStatus());
                        }
                    } catch (Exception unused) {
                    }
                }
                return (v) iVar.e();
            }
        }, (Executor) i.f1051a).a((g<TResult, TContinuationResult>) new b<TResult,TContinuationResult>(this, z, str2, music2), i.f1052b);
    }

    public final void a(String str, boolean z, String str2, Music music) {
        i iVar;
        String str3 = str;
        String str4 = str2;
        Music music2 = music;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{str3, (byte) 0, str4, music2}, this, f35803a, false, 26727, new Class[]{String.class, Boolean.TYPE, String.class, Music.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, (byte) 0, str4, music2}, this, f35803a, false, 26727, new Class[]{String.class, Boolean.TYPE, String.class, Music.class}, Void.TYPE);
            return;
        }
        if (r.b(str)) {
            iVar = this.f35804b.fetchCommerceChallengeDetail(str3, null, 0, 0);
            z2 = false;
        } else {
            iVar = this.f35804b.fetchChallengeDetail(str3, null, 0, 0);
        }
        iVar.a((g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(z2, str3), (Executor) i.f1051a).a((g<TResult, TContinuationResult>) new g<TResult,TContinuationResult>(this, str4, music2, false), i.f1052b);
    }

    public final void a(MusicModel musicModel, String str, int i, int i2, int i3) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{musicModel, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f35803a, false, 26737, new Class[]{MusicModel.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f35803a, false, 26737, new Class[]{MusicModel.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int i4 = i;
        i collectMusic = this.f35804b.collectMusic(str2, i4);
        f fVar = new f(this, musicModel, i4, i2, i3);
        collectMusic.a((g<TResult, TContinuationResult>) fVar, i.f1052b);
    }
}
