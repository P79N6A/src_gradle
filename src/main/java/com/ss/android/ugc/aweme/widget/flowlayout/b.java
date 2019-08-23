package com.ss.android.ugc.aweme.widget.flowlayout;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import java.util.HashSet;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76926a;

    /* renamed from: b  reason: collision with root package name */
    private final TagFlowLayout f76927b;

    /* renamed from: c  reason: collision with root package name */
    private final c f76928c;

    /* renamed from: d  reason: collision with root package name */
    private final int f76929d;

    b(TagFlowLayout tagFlowLayout, c cVar, int i) {
        this.f76927b = tagFlowLayout;
        this.f76928c = cVar;
        this.f76929d = i;
    }

    public final void onClick(View view) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f76926a, false, 90143, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f76926a, false, 90143, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        TagFlowLayout tagFlowLayout = this.f76927b;
        c cVar = this.f76928c;
        int i = this.f76929d;
        if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i)}, tagFlowLayout, TagFlowLayout.f76921e, false, 90138, new Class[]{c.class, Integer.TYPE}, Boolean.TYPE)) {
            Object[] objArr = {cVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = TagFlowLayout.f76921e;
            TagFlowLayout tagFlowLayout2 = tagFlowLayout;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            z = ((Boolean) PatchProxy.accessDispatch(objArr, tagFlowLayout2, changeQuickRedirect2, false, 90138, new Class[]{c.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else {
            if (cVar.f76932b) {
                if (cVar.isChecked()) {
                    tagFlowLayout.b(i, cVar);
                    tagFlowLayout.g.remove(Integer.valueOf(i));
                } else if (tagFlowLayout.f76922f == 1 && tagFlowLayout.g.size() == 1) {
                    Integer next = tagFlowLayout.g.iterator().next();
                    tagFlowLayout.b(next.intValue(), (c) tagFlowLayout.getChildAt(next.intValue()));
                    tagFlowLayout.a(i, cVar);
                    tagFlowLayout.g.remove(next);
                    tagFlowLayout.g.add(Integer.valueOf(i));
                } else if (tagFlowLayout.f76922f <= 0 || tagFlowLayout.g.size() < tagFlowLayout.f76922f) {
                    tagFlowLayout.a(i, cVar);
                    tagFlowLayout.g.add(Integer.valueOf(i));
                    TagFlowLayout.b bVar = tagFlowLayout.j;
                }
                if (tagFlowLayout.h != null) {
                    new HashSet(tagFlowLayout.g);
                }
            }
            z = false;
        }
        if (z && tagFlowLayout.i != null) {
            tagFlowLayout.i.a(cVar, i, tagFlowLayout);
        }
    }
}
