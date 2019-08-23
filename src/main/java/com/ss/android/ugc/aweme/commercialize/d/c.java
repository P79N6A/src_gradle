package com.ss.android.ugc.aweme.commercialize.d;

import android.graphics.Color;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.story.live.a.a;
import com.ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.ss.android.ugc.aweme.story.model.StoryResponse;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Collections;

public final class c extends com.ss.android.ugc.aweme.main.story.live.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38656a;

    public final void a(StoryResponse.a aVar) {
        StoryResponse.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f38656a, false, 30987, new Class[]{StoryResponse.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f38656a, false, 30987, new Class[]{StoryResponse.a.class}, Void.TYPE);
        } else if (aVar2 == null || aVar2.f73226a == null) {
            this.f54978c.setVisibility(8);
        } else {
            if (this.f54979d != null) {
                this.f54979d.a(Collections.singletonList(aVar2.f73226a));
                if (this.f54979d instanceof a) {
                    int parseColor = Color.parseColor(aVar2.g);
                    a aVar3 = (a) this.f54979d;
                    aVar3.a(parseColor, parseColor);
                    String str = aVar2.h;
                    if (PatchProxy.isSupport(new Object[]{str}, aVar3, a.f38650a, false, 30980, new Class[]{String.class}, Void.TYPE)) {
                        a aVar4 = aVar3;
                        PatchProxy.accessDispatch(new Object[]{str}, aVar4, a.f38650a, false, 30980, new Class[]{String.class}, Void.TYPE);
                    } else {
                        aVar3.f38651b.setText(str);
                    }
                    String str2 = aVar2.f73227b;
                    if (PatchProxy.isSupport(new Object[]{str2}, aVar3, a.f38650a, false, 30981, new Class[]{String.class}, Void.TYPE)) {
                        a aVar5 = aVar3;
                        PatchProxy.accessDispatch(new Object[]{str2}, aVar5, a.f38650a, false, 30981, new Class[]{String.class}, Void.TYPE);
                    } else {
                        aVar3.f38652c.setText(str2);
                    }
                }
                this.f54980e = true;
                this.f54978c.setVisibility(0);
                if (aVar2.f73231f) {
                    bg.a(new f());
                }
            } else {
                this.f54978c.setVisibility(8);
            }
        }
    }

    public c(AbsLiveStoryItemView absLiveStoryItemView, a aVar) {
        super(absLiveStoryItemView, aVar);
    }
}
