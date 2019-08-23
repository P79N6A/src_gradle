package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.a.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.photo.publish.Publish;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import dmt.av.video.ah;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class ec {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66832a;

    /* renamed from: b  reason: collision with root package name */
    q f66833b;

    /* renamed from: c  reason: collision with root package name */
    boolean f66834c;

    /* renamed from: d  reason: collision with root package name */
    private double f66835d;

    /* renamed from: e  reason: collision with root package name */
    private String f66836e;

    /* renamed from: f  reason: collision with root package name */
    private String f66837f = "video";
    private Object g;
    private String h;

    public final void a(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66832a, false, 74386, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66832a, false, 74386, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f66833b != null) {
            long a2 = this.f66833b.a(TimeUnit.MILLISECONDS);
            d a3 = d.a().a("duration", String.format(Locale.US, "%d", new Object[]{Long.valueOf(a2)}));
            d a4 = a3.a("status", (z ? 1 : 0));
            d a5 = a4.a("bite_rate", f.e());
            d a6 = a5.a("fps", this.f66835d).a("content_source", this.f66836e).a("content_type", this.f66837f).a("shoot_way", this.h);
            cb cbVar = (cb) this.g;
            d a7 = a6.a("creation_id", cbVar.creationId).a("file_bitrate", ah.c(cbVar.mOutputFile));
            if (cbVar.isSaveLocal()) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            a7.a("is_download_video", str).a("filter_id_list", cbVar.mCurFilterIds).a("prop_list", cbVar.mStickerID).a("effect_list", cbVar.getEditEffectList()).a("info_sticker_list", cbVar.getInfoStickerList());
            r.a("pre_release_time", (Map) a6.f34114b);
        }
    }

    public ec(Object obj, String str, boolean z) {
        this.g = obj;
        this.f66836e = Publish.a(0, obj);
        this.h = str;
        this.f66835d = (double) ah.b(((cb) obj).mPath);
        this.f66834c = z;
    }
}
