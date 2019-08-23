package com.ss.android.ugc.aweme.comment.ui;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.log.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;
import com.ss.android.ugc.aweme.u.aa;

public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36613a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoCommentDialogFragment2 f36614b;

    /* renamed from: c  reason: collision with root package name */
    private final String f36615c;

    /* renamed from: d  reason: collision with root package name */
    private final PoiStruct f36616d;

    r(VideoCommentDialogFragment2 videoCommentDialogFragment2, String str, PoiStruct poiStruct) {
        this.f36614b = videoCommentDialogFragment2;
        this.f36615c = str;
        this.f36616d = poiStruct;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36613a, false, 27727, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36613a, false, 27727, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        VideoCommentDialogFragment2 videoCommentDialogFragment2 = this.f36614b;
        String str = this.f36615c;
        PoiStruct poiStruct = this.f36616d;
        if (!a.a(view)) {
            Context context = videoCommentDialogFragment2.getContext();
            Aweme aweme = videoCommentDialogFragment2.r;
            String e2 = aa.e(videoCommentDialogFragment2.r);
            if (PatchProxy.isSupport(new Object[]{context, aweme, e2}, null, g.f39316a, true, 31753, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, aweme, e2}, null, g.f39316a, true, 31753, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE);
            } else if (g.S(context, aweme)) {
                g.a(context, "comment_ad", "location_click", w.a(g.f(context, aweme, "comment location"), e2), aweme.getAwemeRawAdIdStr(), g.a(aweme));
            }
            PoiDetailActivity.a(videoCommentDialogFragment2.getContext(), new l.a().k(aa.m(videoCommentDialogFragment2.r)).g(aa.g(videoCommentDialogFragment2.r)).c(aa.e(videoCommentDialogFragment2.r)).f(aa.h(videoCommentDialogFragment2.r)).a(videoCommentDialogFragment2.r.getPoiStruct()).h(aa.a(videoCommentDialogFragment2.r)).i(videoCommentDialogFragment2.getEventType()).o(str).r(String.valueOf(poiStruct.getPoiSubTitleType())).l("click_comment").a(videoCommentDialogFragment2.r).t(AwemeAppData.p().ap ? "auto" : "normal").a());
        }
    }
}
