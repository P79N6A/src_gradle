package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.profile.model.User;

public final class ah extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49392a;

    /* renamed from: b  reason: collision with root package name */
    public a f49393b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f49394c;

    /* renamed from: d  reason: collision with root package name */
    private AvatarImageView f49395d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f49396e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f49397f;
    private TextView g;
    private ImageView h;
    private User i;

    public interface a {
        void a(User user);
    }

    public final User getData() {
        return this.i;
    }

    public final void setListener(a aVar) {
        this.f49393b = aVar;
    }

    public ah(Context context) {
        this(context, null);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f49392a, false, 47383, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f49392a, false, 47383, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0) {
            this.g.setText(getContext().getString(C0906R.string.afp));
            this.g.setTextColor(getContext().getResources().getColor(C0906R.color.ne));
            this.g.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838144));
        } else {
            if (i2 == 1) {
                this.g.setText(getContext().getString(C0906R.string.agr));
                this.g.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838146));
                this.g.setTextColor(getContext().getResources().getColor(C0906R.color.nd));
            }
        }
    }

    public final void setData(final User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f49392a, false, 47382, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f49392a, false, 47382, new Class[]{User.class}, Void.TYPE);
        } else if (user != null) {
            this.i = user;
            if (!StringUtils.isEmpty(user.getWeiboVerify()) || !StringUtils.isEmpty(user.getCustomVerify())) {
                this.h.setVisibility(0);
            } else {
                this.h.setVisibility(8);
            }
            this.f49394c.setText(user.getNickname());
            c.b(this.f49395d, user.getAvatarThumb());
            TextView textView = this.f49396e;
            textView.setText(getContext().getString(C0906R.string.agu) + b.a((long) user.getFollowerCount()));
            this.f49397f.setText(user.getSignature());
            this.g.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49398a;

                public final void onClick(View view) {
                    int i = 1;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f49398a, false, 47384, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f49398a, false, 47384, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (ah.this.f49393b != null) {
                        ah.this.f49393b.a(user);
                        User user = user;
                        if (user.getFollowStatus() == 1) {
                            i = 0;
                        }
                        user.setFollowStatus(i);
                        ah.this.a(user.getFollowStatus());
                    }
                }
            });
            a(user.getFollowStatus());
            this.f49395d.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49401a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f49401a, false, 47385, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f49401a, false, 47385, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    h a2 = h.a();
                    a2.a(j.a("aweme://user/profile/" + user.getUid()).a("sec_user_id", user.getSecUid()).a());
                }
            });
        }
    }

    private ah(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private ah(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(C0906R.layout.ze, this);
        setOrientation(0);
        this.f49394c = (TextView) findViewById(C0906R.id.dnq);
        this.f49395d = (AvatarImageView) findViewById(C0906R.id.ayr);
        this.f49396e = (TextView) findViewById(C0906R.id.dn1);
        this.f49397f = (TextView) findViewById(C0906R.id.dmv);
        this.g = (TextView) findViewById(C0906R.id.dmz);
        this.h = (ImageView) findViewById(C0906R.id.dr3);
    }
}
