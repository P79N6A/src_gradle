package com.ss.android.ugc.aweme.story.comment.a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72130a;

    /* renamed from: b  reason: collision with root package name */
    public AvatarImageView f72131b;

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f72132c;

    /* renamed from: d  reason: collision with root package name */
    public DmtTextView f72133d;

    /* renamed from: e  reason: collision with root package name */
    public DmtEditText f72134e;

    /* renamed from: f  reason: collision with root package name */
    DmtTextView f72135f;
    DmtTextView g;
    public User h;
    public LifeStory i;

    public a(@NonNull Context context) {
        super(context);
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f72130a, false, 82704, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f72130a, false, 82704, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        getWindow().setSoftInputMode(48);
        setContentView(C0906R.layout.a8e);
        if (PatchProxy.isSupport(new Object[0], this, f72130a, false, 82705, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72130a, false, 82705, new Class[0], Void.TYPE);
            return;
        }
        ButterKnife.bind((Dialog) this);
        if (PatchProxy.isSupport(new Object[0], this, f72130a, false, 82706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72130a, false, 82706, new Class[0], Void.TYPE);
            return;
        }
        this.f72131b = (AvatarImageView) findViewById(C0906R.id.hk);
        this.f72132c = (LinearLayout) findViewById(C0906R.id.d3s);
        this.f72133d = (DmtTextView) findViewById(C0906R.id.title);
        this.f72134e = (DmtEditText) findViewById(C0906R.id.auw);
        this.f72135f = (DmtTextView) findViewById(C0906R.id.q2);
        this.g = (DmtTextView) findViewById(C0906R.id.cnn);
        com.ss.android.ugc.aweme.story.feed.view.ui.a.a((View) this.f72132c, 0.5f, 150);
        this.f72132c.setOnClickListener(new b(this));
        this.f72135f.setOnClickListener(new c(this));
        this.g.setOnClickListener(new d(this));
        com.ss.android.ugc.aweme.story.feed.view.ui.a.a(this.f72135f);
        com.ss.android.ugc.aweme.story.feed.view.ui.a.a(this.g);
    }
}
