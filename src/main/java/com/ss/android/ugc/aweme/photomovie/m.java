package com.ss.android.ugc.aweme.photomovie;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.setting.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.setting.l;
import java.util.Map;

public final /* synthetic */ class m implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59015a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoMoviePublishFragment f59016b;

    m(PhotoMoviePublishFragment photoMoviePublishFragment) {
        this.f59016b = photoMoviePublishFragment;
    }

    public final void OnSettingItemClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f59015a, false, 64030, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59015a, false, 64030, new Class[]{View.class}, Void.TYPE);
            return;
        }
        PhotoMoviePublishFragment photoMoviePublishFragment = this.f59016b;
        a.L.a(e.a.ReactDuetSettingChanged, true);
        if (photoMoviePublishFragment.f58859c.isChecked()) {
            a.L.a(e.a.ReactDuetSettingCurrent, l.g);
        } else {
            a.L.a(e.a.ReactDuetSettingCurrent, l.f63987f);
        }
        photoMoviePublishFragment.f58859c.toggle();
        r.a("click_react_duet_control", (Map) d.a().a("creation_id", photoMoviePublishFragment.f58858b.creationId).a("enter_from", "video_post_page").a("to_status", photoMoviePublishFragment.f58859c.isChecked() ? "off" : "on").f34114b);
    }
}
