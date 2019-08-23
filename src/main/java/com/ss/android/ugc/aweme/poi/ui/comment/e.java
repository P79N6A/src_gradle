package com.ss.android.ugc.aweme.poi.ui.comment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.preview.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60621a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiCommentPresenter f60622b;

    /* renamed from: c  reason: collision with root package name */
    private final c f60623c;

    /* renamed from: d  reason: collision with root package name */
    private final List f60624d;

    /* renamed from: e  reason: collision with root package name */
    private final int f60625e;

    /* renamed from: f  reason: collision with root package name */
    private final int f60626f;

    e(PoiCommentPresenter poiCommentPresenter, c cVar, List list, int i, int i2) {
        this.f60622b = poiCommentPresenter;
        this.f60623c = cVar;
        this.f60624d = list;
        this.f60625e = i;
        this.f60626f = i2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60621a, false, 66289, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60621a, false, 66289, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiCommentPresenter poiCommentPresenter = this.f60622b;
        c cVar = this.f60623c;
        List<UrlModel> list = this.f60624d;
        int i = this.f60625e;
        int i2 = this.f60626f;
        a.a("comment", cVar);
        a a2 = a.a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (UrlModel urlModel : list) {
            arrayList.add(urlModel.getUrlList().get(0));
            arrayList2.add(urlModel.getUrlList().get(0));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "poi_page");
        hashMap.put("poi_id", cVar.getPoiId());
        hashMap.put("page_type", "comment_pic");
        hashMap.put("poi_type", cVar.getPoiType());
        hashMap.put("group_id", cVar.getAwemeId());
        hashMap.put("previous_page", cVar.getPreviousPage());
        h.a(hashMap, cVar);
        a2.a(poiCommentPresenter.f60581c, arrayList, arrayList2, cVar.getPoiId(), "comment", hashMap);
        a2.a("tag_poi_comment", i, i2);
    }
}
