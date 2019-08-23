package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.a.q;
import com.google.common.a.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.photo.publish.Publish;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.el;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.video.b;
import dmt.av.video.ah;
import dmt.av.video.k;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class hi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68141a;

    /* renamed from: b  reason: collision with root package name */
    private double f68142b;

    /* renamed from: c  reason: collision with root package name */
    private q f68143c;

    /* renamed from: d  reason: collision with root package name */
    private k f68144d;

    /* renamed from: e  reason: collision with root package name */
    private String f68145e;

    /* renamed from: f  reason: collision with root package name */
    private int f68146f;
    private String g;
    private String h = Publish.b(this.f68146f);
    private Object i;

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f68141a, false, 74849, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68141a, false, 74849, new Class[0], Void.TYPE);
            return;
        }
        this.f68143c = q.a((v) el.e.f67575b);
        d a2 = d.a().a("resolution", this.f68145e);
        if (f.a()) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        d a3 = a2.a("is_hardcode", str);
        d a4 = a3.a("bite_rate", f.e());
        d a5 = a4.a("video_quality", f.g()).a("_perf_monitor", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        r.a("video_publish_start", (Map) a5.a("fps", this.f68142b).f34114b);
    }

    public hi(Object obj, k kVar, int i2) {
        this.f68144d = kVar;
        this.f68146f = i2;
        this.i = obj;
        this.g = Publish.a(this.f68146f, obj);
        if (this.f68146f == 0) {
            this.f68142b = (double) ah.b(((cb) obj).mPath);
        }
        if ("upload".equals(this.g)) {
            this.f68145e = f.i();
        } else {
            this.f68145e = f.h();
        }
    }

    public final void a(boolean z, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z2 = z;
        String str8 = str;
        String str9 = str2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str8, str9}, this, f68141a, false, 74850, new Class[]{Boolean.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str8, str9}, this, f68141a, false, 74850, new Class[]{Boolean.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        long a2 = this.f68143c.a(TimeUnit.MILLISECONDS);
        String format = String.format(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) ((this.f68144d.b(this.i) * 1000) / a2)) / 1024.0f)});
        d a3 = d.a().a("duration", String.format(Locale.US, "%d", new Object[]{Long.valueOf(a2)}));
        d a4 = a3.a("status", (z2 ? 1 : 0)).a("fail_info", str8).a("resolution", this.f68145e);
        if (f.a()) {
            str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str3 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        d a5 = a4.a("record_code_type", str3);
        if (f.b()) {
            str4 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str4 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        d a6 = a5.a("compose_code_type", str4);
        d a7 = a6.a("bite_rate", f.e());
        d a8 = a7.a("video_quality", f.g()).a("upload_speed", format).a("_perf_monitor", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        d a9 = a8.a("fps", this.f68142b).a("content_source", this.g).a("content_type", this.h);
        if (!z2) {
            a9.a("error_code", str9);
        }
        if (Publish.c(this.f68146f)) {
            cb cbVar = (cb) this.i;
            int c2 = ah.c(cbVar.mOutputFile);
            String str10 = null;
            if (b.b(cbVar.mOutputFile)) {
                str10 = String.format(Locale.US, "%d", new Object[]{Long.valueOf(new File(cbVar.mOutputFile).length() / 1024)});
            }
            d a10 = a9.a("creation_id", cbVar.creationId).a("filter_id_list", cbVar.mCurFilterIds).a("prop_list", cbVar.mStickerID).a("effect_list", cbVar.getEditEffectList()).a("info_sticker_list", cbVar.getInfoStickerList());
            if (cbVar.mSelectedId == 0) {
                str5 = PushConstants.PUSH_TYPE_NOTIFY;
            } else {
                str5 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            }
            d a11 = a10.a("video_edit_page_filter", str5).a("file_bitrate", c2);
            if (cbVar.isSyntheticHardEncode) {
                str6 = "hardcoding";
            } else {
                str6 = "softcoding";
            }
            d a12 = a11.a("compose_coding", str6);
            if (k.b(cbVar)) {
                str7 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str7 = PushConstants.PUSH_TYPE_NOTIFY;
            }
            a12.a("is_reencode", str7).a("file_size", str10);
        }
        r.a("video_publish_end", (Map) a9.f34114b);
        ai.d("uploadPublishVideoEndEvent: " + a2);
    }
}
