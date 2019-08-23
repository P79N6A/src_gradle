package com.ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.GoNextFactoryFactory;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.f;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.music.b;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.p;
import java.io.File;
import org.json.JSONObject;

public final /* synthetic */ class bv implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65838a;

    /* renamed from: b  reason: collision with root package name */
    private final GoNextFactoryFactory.AnonymousClass2.AnonymousClass1 f65839b;

    /* renamed from: c  reason: collision with root package name */
    private final p f65840c;

    bv(GoNextFactoryFactory.AnonymousClass2.AnonymousClass1 r1, p pVar) {
        this.f65839b = r1;
        this.f65840c = pVar;
    }

    public final void a(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f65838a, false, 74142, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f65838a, false, 74142, new Class[]{f.class}, Void.TYPE);
            return;
        }
        GoNextFactoryFactory.AnonymousClass2.AnonymousClass1 r0 = this.f65839b;
        p pVar = this.f65840c;
        try {
            GoNextFactoryFactory.this.f65337b.dismiss();
            GoNextFactoryFactory goNextFactoryFactory = GoNextFactoryFactory.this;
            if (PatchProxy.isSupport(new Object[]{pVar, fVar2}, goNextFactoryFactory, GoNextFactoryFactory.f65336a, false, 74131, new Class[]{p.class, f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pVar, fVar2}, goNextFactoryFactory, GoNextFactoryFactory.f65336a, false, 74131, new Class[]{p.class, f.class}, Void.TYPE);
                return;
            }
            int i = pVar.f74901e;
            String str = pVar.f74899c;
            String str2 = pVar.f74900d;
            a.a("onConcatFinished:" + i);
            fh fhVar = goNextFactoryFactory.f65339d.f65401b;
            if (i >= 0) {
                n.a("aweme_concat_success_rate", 0, (JSONObject) null);
                VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) goNextFactoryFactory.f65338c.getActivity();
                fhVar.Y = videoRecordNewActivity.K.e();
                com.ss.android.common.lib.a.a(goNextFactoryFactory.f65338c.getContext(), "pv_video_edit", "take_video", 0, 0, goNextFactoryFactory.f65338c.t());
                GoNextFactoryFactory.a((Context) goNextFactoryFactory.f65338c.getActivity(), fhVar);
                if (PatchProxy.isSupport(new Object[]{fhVar}, videoRecordNewActivity, VideoRecordNewActivity.f4033b, false, 80569, new Class[]{fh.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fhVar}, videoRecordNewActivity, VideoRecordNewActivity.f4033b, false, 80569, new Class[]{fh.class}, Void.TYPE);
                } else if (videoRecordNewActivity.s != null) {
                    videoRecordNewActivity.s.a(fhVar);
                }
                Intent a2 = GoNextFactoryFactory.a(goNextFactoryFactory.f65339d, videoRecordNewActivity.m.h(), videoRecordNewActivity);
                n.b("aweme_movie_publish", "aweme_concat_time", (float) (System.currentTimeMillis() - goNextFactoryFactory.f65340e));
                boolean z = com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.RecommentMusicByAIPolicy) != 0;
                boolean z2 = z && ("direct_shoot".equals(fhVar.r) || "prop_page".equals(fhVar.r) || "challenge".equals(fhVar.r) || "draft_again".equals(fhVar.r) || "prop_reuse".equals(fhVar.r) || "collection_music".equals(fhVar.r) || "restore_crash".equals(fhVar.r));
                if (fVar2 != null) {
                    a2.putExtra("music_wave_data", fVar2);
                }
                if (z) {
                    com.ss.android.ugc.aweme.port.in.a.i.f().a(fhVar.Y, z2, fhVar.q);
                    if (b.a() == 2) {
                        com.ss.android.ugc.aweme.port.in.a.i.d();
                    }
                }
                a2.putExtra("extra_record_contact_video_path", str);
                a2.putExtra("extra_record_contact_audio_path", str2);
                if (fhVar.an) {
                    VEVideoPublishEditActivity.a((Activity) videoRecordNewActivity, a2, 1);
                } else {
                    VEVideoPublishEditActivity.a((Context) videoRecordNewActivity, a2, 1);
                }
                goNextFactoryFactory.f65339d.e(false);
                goNextFactoryFactory.f65337b.dismiss();
                goNextFactoryFactory.f65337b = null;
                return;
            }
            boolean exists = str != null ? new File(str).exists() : false;
            boolean exists2 = str2 != null ? new File(str2).exists() : false;
            File file = new File(goNextFactoryFactory.f65339d.f65401b.l.g() + "1_frag_v");
            n.a("aweme_concat_success_rate", 1, c.a().a("errorCode", Integer.valueOf(i)).a("videoPath", str).a("audioPath", str2).a("videoFileExists", String.valueOf(exists)).a("audioFileExists", String.valueOf(exists2)).a("firstSegmentPath", String.valueOf(file.exists())).a("firstSegmentLength", String.valueOf(file.length())).a("hardEncode", String.valueOf(fhVar.o)).b());
            String string = goNextFactoryFactory.f65338c.getString(C0906R.string.a0u, Integer.valueOf(i));
            if (i == -10021 || i == -2000) {
                string = goNextFactoryFactory.f65338c.getString(C0906R.string.a63);
            }
            com.bytedance.ies.dmt.ui.d.a.b(goNextFactoryFactory.f65338c.getContext(), string).a();
            goNextFactoryFactory.f65339d.e(false);
        } catch (NullPointerException unused) {
            throw new NullPointerException("concat count = " + GoNextFactoryFactory.this.f65341f + ", concat finished count = " + GoNextFactoryFactory.this.g);
        }
    }
}
