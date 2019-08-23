package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.survey.e;
import java.util.Map;

public final /* synthetic */ class at implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62484a;

    /* renamed from: b  reason: collision with root package name */
    private final int f62485b;

    /* renamed from: c  reason: collision with root package name */
    private final e f62486c;

    /* renamed from: d  reason: collision with root package name */
    private final String f62487d;

    at(int i, e eVar, String str) {
        this.f62485b = i;
        this.f62486c = eVar;
        this.f62487d = str;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f62484a, false, 68328, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62484a, false, 68328, new Class[0], Void.TYPE);
            return;
        }
        int i = this.f62485b;
        e eVar = this.f62486c;
        String str = this.f62487d;
        if (i == 3) {
            r.a("pop_survey_close", (Map) d.a().a("pop_survey_id", String.valueOf(eVar.f74503b)).a("pop_survey_question", eVar.i).a("original_id", eVar.j).f34114b);
            return;
        }
        if (i == 1 || i == 2) {
            r.a("pop_survey_answer", (Map) d.a().a("pop_survey_id", String.valueOf(eVar.f74503b)).a("pop_survey_question", eVar.i).a("original_id", eVar.j).a("pop_survey_answer", str).f34114b);
        }
    }
}
