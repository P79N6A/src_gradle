package com.ss.android.ugc.aweme.shortvideo.filter.func;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.filter.at;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.fh;
import java.util.Map;

public final /* synthetic */ class g implements at.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67745a;

    /* renamed from: b  reason: collision with root package name */
    private final RecordFilterModuleImpl f67746b;

    g(RecordFilterModuleImpl recordFilterModuleImpl) {
        this.f67746b = recordFilterModuleImpl;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f67745a, false, 77302, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f67745a, false, 77302, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) this.f67746b.f3946b).get(ShortVideoContextViewModel.class)).f65401b;
        r.a("click_modify_tab", (Map) d.a().a("creation_id", fhVar.q).a("shoot_way", fhVar.r).a("content_source", fhVar.d().getContentSource()).a("content_type", fhVar.d().getContentType()).a("enter_from", "video_shoot_page").a("tab_name", i == 0 ? "filter" : "beauty").f34114b);
    }
}
