package com.ss.android.ugc.aweme.share.seconditem;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.serverpush.b.a;
import com.ss.android.ugc.aweme.setting.serverpush.b.c;
import com.ss.android.ugc.aweme.share.v;
import com.ss.android.ugc.aweme.utils.bg;

public class d extends v implements View.OnClickListener, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65279a;

    /* renamed from: f  reason: collision with root package name */
    private Aweme f65280f;
    private boolean g;
    private c h;

    public final void X_() {
    }

    public final void c() {
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f65279a, false, 73704, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65279a, false, 73704, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.h.k();
    }

    public d(Context context) {
        this(context, null);
    }

    public void setData(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f65279a, false, 73701, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f65279a, false, 73701, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.f65280f = aweme;
        if (PatchProxy.isSupport(new Object[0], this, f65279a, false, 73702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65279a, false, 73702, new Class[0], Void.TYPE);
        } else if (this.f65280f == null || this.f65280f.getAuthor() == null || (this.f65280f.getAuthor().getCommentSetting() != com.ss.android.ugc.aweme.setting.d.f63936e && this.f65280f.getCommentSetting() == com.ss.android.ugc.aweme.setting.d.f63933b)) {
            setIcon(2130839599);
            setText(getContext().getString(C0906R.string.v0));
            this.g = false;
        } else {
            setIcon(2130839600);
            setText(getContext().getString(C0906R.string.vm));
            this.g = true;
        }
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{view}, this, f65279a, false, 73703, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f65279a, false, 73703, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (com.ss.android.ugc.aweme.commercialize.utils.c.L(this.f65280f)) {
            com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.ca).a();
        }
        int i = 3;
        if (!this.g) {
            c cVar = this.h;
            Object[] objArr = new Object[3];
            objArr[0] = "item_comment";
            objArr[1] = 3;
            if (this.f65280f != null) {
                str2 = this.f65280f.getAid();
            } else {
                str2 = "";
            }
            objArr[2] = str2;
            cVar.a(objArr);
            setIcon(2130839600);
            setText(getContext().getString(C0906R.string.vm));
            this.g = true;
        } else if (this.f65280f == null || this.f65280f.getAuthor() == null || this.f65280f.getAuthor().getCommentSetting() != com.ss.android.ugc.aweme.setting.d.f63936e) {
            c cVar2 = this.h;
            Object[] objArr2 = new Object[3];
            objArr2[0] = "item_comment";
            objArr2[1] = 0;
            if (this.f65280f != null) {
                str3 = this.f65280f.getAid();
            } else {
                str3 = "";
            }
            objArr2[2] = str3;
            cVar2.a(objArr2);
            setIcon(2130839599);
            setText(getContext().getString(C0906R.string.v0));
            this.g = false;
        } else {
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.er).a();
            return;
        }
        if (this.f65280f != null) {
            com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
            Aweme aweme = this.f65280f;
            if (!this.g) {
                i = 0;
            }
            if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, a2, com.ss.android.ugc.aweme.feed.a.f44607a, false, 39925, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
                com.ss.android.ugc.aweme.feed.a aVar = a2;
                PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, aVar, com.ss.android.ugc.aweme.feed.a.f44607a, false, 39925, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
            } else if (aweme != null) {
                aweme.setCommentSetting(i);
            }
        }
        if (this.f65280f != null) {
            str = this.f65280f.getAid();
        } else {
            str = "";
        }
        bg.a(new com.ss.android.ugc.aweme.comment.b.a(8, str));
    }

    private d(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private d(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        setOnClickListener(this);
        this.h = new c();
        this.h.a(this);
    }
}
