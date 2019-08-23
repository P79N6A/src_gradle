package com.ss.android.ugc.aweme.story.feed.view.widget;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.api.b;
import com.ss.android.ugc.aweme.story.api.f;
import com.ss.android.ugc.aweme.story.base.b.a;
import java.util.HashMap;
import java.util.Map;

public class FromDoushanWidget extends BaseFeedBottomWidget {
    public static ChangeQuickRedirect p;
    private static Map<Integer, String> t;
    DmtTextView q;
    LinearLayout r;
    ImageView s;

    public final boolean b(boolean z) {
        return !z;
    }

    public final int i() {
        return C0906R.layout.ast;
    }

    static {
        HashMap hashMap = new HashMap();
        t = hashMap;
        hashMap.clear();
        t.put(1, "maya1349://activity_main?url=https://maya.ppkankan01.com/feoffline/spring2019/template/spring2019/venue1.html?disable_web_progress=1&hide_status_bar=1&hide_title_bar=1&hide_more=1&back_button_color=1&hide_back_button=1");
        t.put(2, "maya1349://activity_main?url=https://maya.ppkankan01.com/feoffline/spring2019/template/spring2019/venue2.html?disable_web_progress=1&hide_status_bar=1&hide_title_bar=1&hide_more=1&back_button_color=1&hide_back_button=1");
        t.put(3, "maya1349://story_detail");
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84236, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84236, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84241, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84241, new Class[0], Void.TYPE);
            return;
        }
        b bVar = (b) ServiceManager.get().getService(b.class);
        if (bVar != null) {
            Integer a2 = bVar.a();
            if (a2 == null || a2.intValue() == -1) {
                str = "maya1349://home?tab=im";
            } else if (TextUtils.isEmpty(t.get(a2))) {
                str = "maya1349://home?tab=im";
            } else {
                str = t.get(a2);
            }
            bVar.a(this.f2709d, str, this.f4154b.getLifeStory(), new b.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72898a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f72898a, false, 84245, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f72898a, false, 84245, new Class[0], Void.TYPE);
                        return;
                    }
                    FromDoushanWidget.this.h();
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f72898a, false, 84246, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f72898a, false, 84246, new Class[0], Void.TYPE);
                        return;
                    }
                    FromDoushanWidget.this.g();
                }
            });
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, p, false, 84237, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, p, false, 84237, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        if (PatchProxy.isSupport(new Object[]{view}, this, p, false, 84238, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, p, false, 84238, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.q = (DmtTextView) view.findViewById(C0906R.id.db7);
        this.r = (LinearLayout) view.findViewById(C0906R.id.yx);
        this.s = (ImageView) view.findViewById(C0906R.id.b25);
        this.r.setOnClickListener(new a(this));
    }

    public final void a(com.ss.android.ugc.aweme.story.api.model.b bVar) {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, p, false, 84239, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, p, false, 84239, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE);
            return;
        }
        super.a(bVar);
        if (PatchProxy.isSupport(new Object[0], this, p, false, 84240, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 84240, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2711f.getVisibility() != 8) {
            if (PatchProxy.isSupport(new Object[0], this, p, false, 84242, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, p, false, 84242, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                f fVar = (f) ServiceManager.get().getService(f.class);
                if (fVar != null && fVar.c()) {
                    com.ss.android.ugc.aweme.story.api.model.a.b thirdPlatformInfo = this.f4154b.getLifeStory().getThirdPlatformInfo();
                    if (thirdPlatformInfo != null && thirdPlatformInfo.isFromDuoshan()) {
                        z = true;
                    }
                }
                z = false;
            }
            if (!z) {
                this.f2711f.setVisibility(8);
                return;
            }
            this.f2711f.setVisibility(0);
            this.q.setText(this.f2709d.getResources().getString(C0906R.string.aii));
            if (PatchProxy.isSupport(new Object[0], this, p, false, 84243, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, p, false, 84243, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                if (!k()) {
                    b bVar2 = (b) ServiceManager.get().getService(b.class);
                }
                z2 = false;
            }
            if (!z2) {
                this.s.setVisibility(8);
                this.r.setClickable(false);
            } else {
                this.s.setVisibility(0);
                this.r.setClickable(true);
            }
            r.a("duoshan_banner_show", (Map) new a().a("enter_from", "homepage_story").a("action_type", "show").a("message_style", "duoshan_story").f71925b);
        }
    }
}
