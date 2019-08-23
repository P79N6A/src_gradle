package com.ss.android.ugc.aweme.share.seconditem;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.api.a.a;
import com.ss.android.ugc.aweme.commercialize.api.d;
import com.ss.android.ugc.aweme.commercialize.b.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.net.e;
import com.ss.android.ugc.aweme.share.v;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;

public class k extends v implements View.OnClickListener, e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65291a;

    /* renamed from: f  reason: collision with root package name */
    private Aweme f65292f;
    private boolean g;
    private View.OnClickListener h;

    public Aweme getData() {
        return this.f65292f;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f65291a, false, 73735, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65291a, false, 73735, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f65292f == null || this.g == this.f65292f.isTop())) {
            bg.a(new g(1));
        }
        super.onDetachedFromWindow();
    }

    private void a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f65291a, false, 73730, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65291a, false, 73730, new Class[0], Void.TYPE);
            return;
        }
        setSelected(!this.f65292f.isTop());
        Context context = getContext();
        if (!this.f65292f.isTop()) {
            i = C0906R.string.cnz;
        } else {
            i = C0906R.string.bi5;
        }
        setText(context.getString(i));
    }

    public void setItemOnClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public k(Context context) {
        this(context, null);
    }

    public void setData(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f65291a, false, 73729, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f65291a, false, 73729, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.f65292f = aweme;
        this.g = aweme.isTop();
        a();
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f65291a, false, 73733, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f65291a, false, 73733, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        d.a(this, this.f65292f.getAid(), !this.f65292f.isTop());
    }

    public final void a(Exception exc) {
        String str;
        if (PatchProxy.isSupport(new Object[]{exc}, this, f65291a, false, 73732, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f65291a, false, 73732, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a.a(getContext(), exc, C0906R.string.bgf);
        this.h.onClick(null);
        com.ss.android.ugc.aweme.app.d.d a2 = new com.ss.android.ugc.aweme.app.d.d().a("group_id", this.f65292f.getAid()).a("author_id", this.f65292f.getAuthor().getUid()).a("enter_from", "personal_homepage");
        if (this.f65292f.isTop()) {
            str = "top";
        } else {
            str = "top_cancel";
        }
        r.a("click_video_top", (Map) a2.a("final_status", str).f34114b);
    }

    private k(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public final void a(String str, Object obj) {
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{str, obj}, this, f65291a, false, 73731, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, obj}, this, f65291a, false, 73731, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        this.f65292f.setIsTop(this.f65292f.isTop() ^ true ? 1 : 0);
        a();
        Context context = getContext();
        if (this.f65292f.isTop()) {
            str2 = getContext().getString(C0906R.string.co5);
        } else {
            str2 = getContext().getString(C0906R.string.co1);
        }
        com.bytedance.ies.dmt.ui.d.a.a(context, str2).a();
        this.h.onClick(null);
        com.ss.android.ugc.aweme.app.d.d a2 = new com.ss.android.ugc.aweme.app.d.d().a("group_id", this.f65292f.getAid()).a("author_id", this.f65292f.getAuthor().getUid()).a("enter_from", "personal_homepage");
        if (this.f65292f.isTop()) {
            str3 = "top";
        } else {
            str3 = "top_cancel";
        }
        r.a("click_video_top", (Map) a2.a("final_status", str3).f34114b);
    }

    private k(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        setIcon(2130837944);
        setOnClickListener(this);
    }
}
