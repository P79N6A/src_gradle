package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.comment.CommentInputManager;
import com.ss.android.ugc.aweme.comment.e;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashEvent;
import com.ss.android.ugc.aweme.discover.hitrank.f;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.c.a;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.share.v;
import com.ss.android.ugc.aweme.utils.bg;
import org.greenrobot.eventbus.Subscribe;

public class c extends v implements View.OnClickListener, CommentInputManager.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3666a;

    /* renamed from: f  reason: collision with root package name */
    private Aweme f3667f;
    private IShareService.SharePage g;
    private Fragment h;
    private String i;
    private CommentInputManager j;

    public final void a(int i2, int i3, String str) {
    }

    public final void b(Comment comment) {
    }

    public final void b(boolean z) {
    }

    public final void d(boolean z) {
    }

    public final void e(boolean z) {
    }

    public final boolean f() {
        return true;
    }

    public final boolean g() {
        return true;
    }

    public Comment getCommentInputReplyComment() {
        return null;
    }

    public int getCommentInputViewType() {
        return 4;
    }

    public final boolean h() {
        if (!PatchProxy.isSupport(new Object[0], this, f3666a, false, 61546, new Class[0], Boolean.TYPE)) {
            return e.a(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3666a, false, 61546, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public Aweme getCommentInputAweme() {
        return this.f3667f;
    }

    public String getEventType() {
        return this.i;
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3666a, false, 61535, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3666a, false, 61535, new Class[0], Void.TYPE);
            return;
        }
        if (this.j == null) {
            this.j = new CommentInputManager(this.h, hashCode(), this);
        }
        this.j.e();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3666a, false, 61534, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3666a, false, 61534, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f3666a, false, 61543, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3666a, false, 61543, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        bg.c(this);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f3666a, false, 61544, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3666a, false, 61544, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        bg.d(this);
    }

    public void setDialog(IShareService.SharePage sharePage) {
        this.g = sharePage;
    }

    public void setEnterFrom(String str) {
        this.i = str;
    }

    public void setFragment(Fragment fragment) {
        this.h = fragment;
    }

    private c(Context context) {
        this(context, null);
    }

    public void setData(Aweme aweme) {
        this.f3667f = aweme;
        if (this.f3667f != null) {
        }
    }

    public final void a(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f3666a, false, 61538, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f3666a, false, 61538, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        this.j.g();
        f.f42393c.a(this.f3667f, 3);
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3666a, false, 61537, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3666a, false, 61537, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z && this.g != null && this.g.isShowing()) {
            this.g.dismiss();
        }
    }

    @Subscribe
    public void onAwesomeSplashEvent(AwesomeSplashEvent awesomeSplashEvent) {
        AwesomeSplashEvent awesomeSplashEvent2 = awesomeSplashEvent;
        if (PatchProxy.isSupport(new Object[]{awesomeSplashEvent2}, this, f3666a, false, 61545, new Class[]{AwesomeSplashEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awesomeSplashEvent2}, this, f3666a, false, 61545, new Class[]{AwesomeSplashEvent.class}, Void.TYPE);
            return;
        }
        if (awesomeSplashEvent2.f39420b != 4) {
            this.j.g();
        }
    }

    @Subscribe
    public void onEvent(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3666a, false, 61539, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3666a, false, 61539, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar != null && aVar.f48271e == 1) {
            if (aVar.f48272f == hashCode()) {
                com.ss.android.ugc.aweme.forward.e.a.a(this.i, aVar.f48270d, "detail", "click_share_button", true);
            }
            this.j.g();
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3666a, false, 61533, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3666a, false, 61533, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (PatchProxy.isSupport(new Object[0], this, f3666a, false, 61536, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3666a, false, 61536, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.forward.e.a.a(this.i, this.f3667f, "detail", "click_share_button");
        }
        if ((this.f3667f != null && this.f3667f.getAwemeControl().canShare() && TimeLockRuler.isEnableShowTeenageTip(C0906R.string.ci1)) || d.d(this.f3667f)) {
            return;
        }
        if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            com.ss.android.ugc.aweme.login.e.a(com.ss.android.ugc.aweme.framework.core.a.b().a(), this.i, "click_repost_button", (Bundle) null, (com.ss.android.ugc.aweme.base.component.f) new d(this));
        } else {
            a();
        }
    }

    public final void a(String str) {
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{str}, this, f3666a, false, 61542, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3666a, false, 61542, new Class[]{String.class}, Void.TYPE);
            return;
        }
        String str4 = this.i;
        if (this.f3667f == null) {
            str2 = "";
        } else {
            str2 = this.f3667f.getAid();
        }
        if (this.f3667f == null) {
            str3 = "";
        } else {
            str3 = this.f3667f.getAuthorUid();
        }
        com.ss.android.ugc.aweme.comment.f.a.a(str, str4, str2, str3);
    }

    private c(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public final void a(String str, int i2) {
        String str2;
        String authorUid;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f3666a, false, 61541, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f3666a, false, 61541, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        String str3 = this.i;
        if (this.f3667f == null) {
            str2 = "";
        } else {
            str2 = this.f3667f.getAid();
        }
        if (this.f3667f == null) {
            authorUid = "";
        } else {
            authorUid = this.f3667f.getAuthorUid();
        }
        com.ss.android.ugc.aweme.comment.f.a.a(str, i2, str3, str2, authorUid);
    }

    private c(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        if (PatchProxy.isSupport(new Object[0], this, f3666a, false, 61531, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3666a, false, 61531, new Class[0], Void.TYPE);
        } else {
            setIcon(2130839608);
            setText(getContext().getString(C0906R.string.ahe));
        }
        setOnClickListener(this);
    }

    public final void a(Exception exc, int i2, Comment comment) {
        int i3;
        Exception exc2 = exc;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{exc2, Integer.valueOf(i2), comment}, this, f3666a, false, 61540, new Class[]{Exception.class, Integer.TYPE, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2, Integer.valueOf(i2), comment}, this, f3666a, false, 61540, new Class[]{Exception.class, Integer.TYPE, Comment.class}, Void.TYPE);
            return;
        }
        Context context = getContext();
        if (i4 == 3) {
            i3 = C0906R.string.ahn;
        } else {
            i3 = C0906R.string.v7;
        }
        com.ss.android.ugc.aweme.comment.api.a.a(context, exc, i3);
        if (i4 == 3) {
            com.ss.android.ugc.aweme.forward.e.a.a(this.i, this.f3667f, "detail", "click_share_button", false);
        }
    }

    public static c a(Fragment fragment, Aweme aweme, IShareService.SharePage sharePage, String str) {
        Fragment fragment2 = fragment;
        Aweme aweme2 = aweme;
        IShareService.SharePage sharePage2 = sharePage;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{fragment2, aweme2, sharePage2, str2}, null, f3666a, true, 61532, new Class[]{Fragment.class, Aweme.class, IShareService.SharePage.class, String.class}, c.class)) {
            Object[] objArr = {fragment2, aweme2, sharePage2, str2};
            return (c) PatchProxy.accessDispatch(objArr, null, f3666a, true, 61532, new Class[]{Fragment.class, Aweme.class, IShareService.SharePage.class, String.class}, c.class);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int dip2Px = (int) UIUtils.dip2Px(fragment.getActivity(), 10.0f);
        layoutParams.leftMargin = dip2Px;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(dip2Px);
        }
        c cVar = new c(fragment.getActivity());
        cVar.setLayoutParams(layoutParams);
        cVar.setData(aweme2);
        cVar.setDialog(sharePage2);
        cVar.setFragment(fragment2);
        cVar.setEnterFrom(str2);
        if ((!com.ss.android.g.a.a() && (aweme2 == null || !aweme.getAwemeControl().canForward())) || TimeLockRuler.isTeenModeON()) {
            cVar.setIconAlpha(0.34f);
            cVar.setTextColor(C0906R.color.i2);
            cVar.setTextAlpha(0.34f);
        }
        return cVar;
    }
}
