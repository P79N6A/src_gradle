package com.ss.android.ugc.aweme.friends.ui;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.b.a;
import com.ss.android.ugc.aweme.profile.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ej;

public class ThirdPartyAddFriendView extends LinearLayout implements View.OnClickListener, ad, h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49381a;

    /* renamed from: b  reason: collision with root package name */
    TextView f49382b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49383c;

    /* renamed from: d  reason: collision with root package name */
    View f49384d;

    /* renamed from: e  reason: collision with root package name */
    public View f49385e;

    /* renamed from: f  reason: collision with root package name */
    private a f49386f;
    private IUserService g;
    private View.OnClickListener h;
    private View.OnClickListener i;
    private View.OnClickListener j;
    private View k;

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f49381a, false, 47506, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49381a, false, 47506, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.k = findViewById(C0906R.id.de);
        this.k.setOnClickListener(this);
        this.f49383c = (TextView) findViewById(C0906R.id.dk);
        this.f49383c.setOnClickListener(this);
        this.f49382b = (TextView) findViewById(C0906R.id.dp);
        this.f49382b.setOnClickListener(this);
        this.f49384d = findViewById(C0906R.id.cb_);
        this.f49385e = findViewById(C0906R.id.mi);
        if (PatchProxy.isSupport(new Object[0], this, f49381a, false, 47507, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49381a, false, 47507, new Class[0], Void.TYPE);
            return;
        }
        if (ej.a(getContext(), "com.tencent.mm")) {
            this.f49382b.setVisibility(0);
        }
        if (ej.a(getContext(), "com.tencent.mobileqq")) {
            this.f49383c.setVisibility(0);
        }
    }

    public void setAddContactsFriendsClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public void setAddQQFriendsClickListener(View.OnClickListener onClickListener) {
        this.j = onClickListener;
    }

    public void setAddWeChatFriendsClickListener(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public ThirdPartyAddFriendView(Context context) {
        this(context, null);
    }

    public final void a(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f49381a, false, 47509, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f49381a, false, 47509, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = this.k;
        if (!z) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f49381a, false, 47510, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f49381a, false, 47510, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f49384d.setVisibility(8);
    }

    public void onClick(View view) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f49381a, false, 47508, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49381a, false, 47508, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view != null) {
            i2 = view.getId();
        } else {
            i2 = -1;
        }
        if (i2 == C0906R.id.de && this.h != null) {
            this.h.onClick(view);
        } else if (i2 != C0906R.id.dk || this.j == null) {
            if (i2 == C0906R.id.dp && this.i != null) {
                this.i.onClick(view);
            }
        } else {
            this.j.onClick(view);
        }
    }

    public ThirdPartyAddFriendView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThirdPartyAddFriendView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.as5, this);
        setOrientation(1);
        ButterKnife.bind(inflate);
        this.f49386f = new a((Activity) getContext());
        this.g = (IUserService) ServiceManager.get().getService(IUserService.class);
        a aVar = this.f49386f;
        User currentUser = this.g.getCurrentUser();
        if (PatchProxy.isSupport(new Object[]{currentUser}, aVar, a.f48832a, false, 46564, new Class[]{User.class}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{currentUser}, aVar2, a.f48832a, false, 46564, new Class[]{User.class}, Void.TYPE);
        } else if (currentUser != null && aVar.f48833b != currentUser) {
            aVar.f48833b = currentUser;
            String string = aVar.f48835d.getString(C0906R.string.ak);
            aVar.f48834c.a(aVar.f48833b, aVar.f48835d.getString(C0906R.string.b2b, new Object[]{string}), aVar.f48835d.getString(C0906R.string.b29, new Object[]{string}));
        }
    }
}
