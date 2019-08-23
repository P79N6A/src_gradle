package com.ss.android.ugc.aweme.video.d;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.video.preload.b;
import com.ss.android.ugc.playerkit.videoview.d.d;
import com.ss.android.ugc.playerkit.videoview.d.g;

public final class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76046a;

    /* renamed from: b  reason: collision with root package name */
    private final b f76047b;

    public e(b bVar) {
        this.f76047b = bVar;
    }

    public final com.ss.android.ugc.playerkit.videoview.d.e a(g.a aVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f76046a, false, 89313, new Class[]{g.a.class}, com.ss.android.ugc.playerkit.videoview.d.e.class)) {
            return (com.ss.android.ugc.playerkit.videoview.d.e) PatchProxy.accessDispatch(new Object[]{aVar}, this, f76046a, false, 89313, new Class[]{g.a.class}, com.ss.android.ugc.playerkit.videoview.d.e.class);
        }
        d a2 = aVar.a();
        VideoUrlModel videoUrlModel = a2.f77763a;
        String[] strArr = a2.f77765c;
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(strArr[i]);
                String str2 = strArr[i];
                String sourceId = videoUrlModel.getSourceId();
                if (PatchProxy.isSupport(new Object[]{str2, sourceId}, this, f76046a, false, 89314, new Class[]{String.class, String.class}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{str2, sourceId}, this, f76046a, false, 89314, new Class[]{String.class, String.class}, String.class);
                } else if (TextUtils.isEmpty(str2)) {
                    str = "";
                } else if (str2.contains("?")) {
                    str = "&source_id=" + sourceId;
                } else {
                    str = "?&source_id=" + sourceId;
                }
                sb.append(str);
                strArr[i] = sb.toString();
            }
        }
        return new com.ss.android.ugc.playerkit.videoview.d.e(this.f76047b.a(videoUrlModel, a2.f77764b, strArr));
    }
}
