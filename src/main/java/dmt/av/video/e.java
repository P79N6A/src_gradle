package dmt.av.video;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.q.c;
import com.ss.android.vesdk.VEUtils;
import java.io.File;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82988a;

    public final void a(cb cbVar) {
        String str;
        int i;
        cb cbVar2 = cbVar;
        if (PatchProxy.isSupport(new Object[]{cbVar2}, this, f82988a, false, 91951, new Class[]{cb.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cbVar2}, this, f82988a, false, 91951, new Class[]{cb.class}, Void.TYPE);
            return;
        }
        if (a.L.a(e.a.UploadOriginalAudioTrack) && cbVar.shouldUploadOriginalSound()) {
            new File(fg.j).mkdirs();
            if (TextUtils.isEmpty(cbVar2.mWavFile)) {
                str = cbVar2.mPath;
            } else {
                str = cbVar2.mWavFile;
            }
            String str2 = str;
            if (cbVar2.previewConfigure == null || cbVar2.previewConfigure.getVideoSegments().isEmpty()) {
                i = VEUtils.transCodeAudio(str2, cbVar2.mEncodedAudioOutputFile, 1, 88200);
            } else {
                VEVideoSegment vEVideoSegment = cbVar2.previewConfigure.getVideoSegments().get(0);
                i = VEUtils.transCodeAudio(str2, vEVideoSegment.start, vEVideoSegment.getEnd(), cbVar2.mEncodedAudioOutputFile, 1, 8820);
            }
            int b2 = c.b(cbVar2.mEncodedAudioOutputFile);
            n.b("aweme_movie_publish_log", "encode_audio_file", new bi().a("status", Integer.valueOf(b2 + 10000)).a("errorDesc", "encodeResult = " + i + " checkResult = " + b2 + " path = " + cbVar2.mEncodedAudioOutputFile).b());
        }
    }
}
