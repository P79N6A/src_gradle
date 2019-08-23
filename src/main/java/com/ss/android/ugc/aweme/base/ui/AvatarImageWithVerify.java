package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ey;

public class AvatarImageWithVerify extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34916a;
    private static e[] k = {new d((byte) 0), new c((byte) 0), new b((byte) 0), new a((byte) 0), new f((byte) 0)};

    /* renamed from: b  reason: collision with root package name */
    public ImageView f34917b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f34918c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f34919d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f34920e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f34921f;
    private AvatarImageView g;
    private User h;
    private int i;
    private int j;

    static class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34922a;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void b(AvatarImageWithVerify avatarImageWithVerify, User user) {
            AvatarImageWithVerify avatarImageWithVerify2 = avatarImageWithVerify;
            if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify2, user}, this, f34922a, false, 24964, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify2, user}, this, f34922a, false, 24964, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE);
                return;
            }
            avatarImageWithVerify2.f34917b.setVisibility(0);
        }

        public final void c(AvatarImageWithVerify avatarImageWithVerify, User user) {
            AvatarImageWithVerify avatarImageWithVerify2 = avatarImageWithVerify;
            if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify2, user}, this, f34922a, false, 24965, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify2, user}, this, f34922a, false, 24965, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE);
                return;
            }
            avatarImageWithVerify2.f34917b.setVisibility(8);
        }

        public final boolean a(AvatarImageWithVerify avatarImageWithVerify, User user) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify, user}, this, f34922a, false, 24963, new Class[]{AvatarImageWithVerify.class, User.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify, user}, this, f34922a, false, 24963, new Class[]{AvatarImageWithVerify.class, User.class}, Boolean.TYPE)).booleanValue();
            }
            if (com.ss.android.g.a.b()) {
                if (PatchProxy.isSupport(new Object[]{user}, null, AvatarImageWithVerify.f34916a, true, 24962, new Class[]{User.class}, Boolean.TYPE)) {
                    Object[] objArr = {user};
                    z = ((Boolean) PatchProxy.accessDispatch(objArr, null, AvatarImageWithVerify.f34916a, true, 24962, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
                } else if (user == null || TextUtils.isEmpty(user.getCustomVerify())) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
    }

    static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34923a;

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final boolean a(AvatarImageWithVerify avatarImageWithVerify, User user) {
            if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify, user}, this, f34923a, false, 24966, new Class[]{AvatarImageWithVerify.class, User.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify, user}, this, f34923a, false, 24966, new Class[]{AvatarImageWithVerify.class, User.class}, Boolean.TYPE)).booleanValue();
            } else if (user.getVerificationType() == 3) {
                return true;
            } else {
                return false;
            }
        }

        public final void b(AvatarImageWithVerify avatarImageWithVerify, User user) {
            AvatarImageWithVerify avatarImageWithVerify2 = avatarImageWithVerify;
            if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify2, user}, this, f34923a, false, 24967, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify2, user}, this, f34923a, false, 24967, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE);
                return;
            }
            avatarImageWithVerify2.f34921f.setVisibility(0);
        }

        public final void c(AvatarImageWithVerify avatarImageWithVerify, User user) {
            AvatarImageWithVerify avatarImageWithVerify2 = avatarImageWithVerify;
            if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify2, user}, this, f34923a, false, 24968, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify2, user}, this, f34923a, false, 24968, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE);
                return;
            }
            avatarImageWithVerify2.f34921f.setVisibility(8);
        }
    }

    static class c implements e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34924a;

        private c() {
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        public final boolean a(AvatarImageWithVerify avatarImageWithVerify, User user) {
            if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify, user}, this, f34924a, false, 24969, new Class[]{AvatarImageWithVerify.class, User.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify, user}, this, f34924a, false, 24969, new Class[]{AvatarImageWithVerify.class, User.class}, Boolean.TYPE)).booleanValue();
            } else if (!TextUtils.isEmpty(user.getEnterpriseVerifyReason())) {
                return true;
            } else {
                return false;
            }
        }

        public final void b(AvatarImageWithVerify avatarImageWithVerify, User user) {
            AvatarImageWithVerify avatarImageWithVerify2 = avatarImageWithVerify;
            if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify2, user}, this, f34924a, false, 24970, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify2, user}, this, f34924a, false, 24970, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE);
                return;
            }
            avatarImageWithVerify2.f34920e.setVisibility(0);
        }

        public final void c(AvatarImageWithVerify avatarImageWithVerify, User user) {
            AvatarImageWithVerify avatarImageWithVerify2 = avatarImageWithVerify;
            if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify2, user}, this, f34924a, false, 24971, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify2, user}, this, f34924a, false, 24971, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE);
                return;
            }
            avatarImageWithVerify2.f34920e.setVisibility(8);
        }
    }

    static class d implements e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34925a;

        private d() {
        }

        /* synthetic */ d(byte b2) {
            this();
        }

        public final boolean a(AvatarImageWithVerify avatarImageWithVerify, User user) {
            if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify, user}, this, f34925a, false, 24972, new Class[]{AvatarImageWithVerify.class, User.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify, user}, this, f34925a, false, 24972, new Class[]{AvatarImageWithVerify.class, User.class}, Boolean.TYPE)).booleanValue();
            } else if (user.getVerificationType() == 2) {
                return true;
            } else {
                return false;
            }
        }

        public final void b(AvatarImageWithVerify avatarImageWithVerify, User user) {
            AvatarImageWithVerify avatarImageWithVerify2 = avatarImageWithVerify;
            if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify2, user}, this, f34925a, false, 24973, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify2, user}, this, f34925a, false, 24973, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE);
                return;
            }
            avatarImageWithVerify2.f34919d.setVisibility(0);
        }

        public final void c(AvatarImageWithVerify avatarImageWithVerify, User user) {
            AvatarImageWithVerify avatarImageWithVerify2 = avatarImageWithVerify;
            if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify2, user}, this, f34925a, false, 24974, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify2, user}, this, f34925a, false, 24974, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE);
                return;
            }
            avatarImageWithVerify2.f34919d.setVisibility(8);
        }
    }

    interface e {
        boolean a(AvatarImageWithVerify avatarImageWithVerify, User user);

        void b(AvatarImageWithVerify avatarImageWithVerify, User user);

        void c(AvatarImageWithVerify avatarImageWithVerify, User user);
    }

    static class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34926a;

        private f() {
        }

        /* synthetic */ f(byte b2) {
            this();
        }

        public final boolean a(AvatarImageWithVerify avatarImageWithVerify, User user) {
            String str;
            if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify, user}, this, f34926a, false, 24975, new Class[]{AvatarImageWithVerify.class, User.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify, user}, this, f34926a, false, 24975, new Class[]{AvatarImageWithVerify.class, User.class}, Boolean.TYPE)).booleanValue();
            }
            if (TextUtils.isEmpty(user.getCustomVerify())) {
                str = user.getWeiboVerify();
            } else {
                str = user.getCustomVerify();
            }
            if (!TextUtils.isEmpty(str)) {
                return true;
            }
            return false;
        }

        public final void b(AvatarImageWithVerify avatarImageWithVerify, User user) {
            AvatarImageWithVerify avatarImageWithVerify2 = avatarImageWithVerify;
            if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify2, user}, this, f34926a, false, 24976, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify2, user}, this, f34926a, false, 24976, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE);
                return;
            }
            avatarImageWithVerify2.f34918c.setVisibility(0);
        }

        public final void c(AvatarImageWithVerify avatarImageWithVerify, User user) {
            AvatarImageWithVerify avatarImageWithVerify2 = avatarImageWithVerify;
            if (PatchProxy.isSupport(new Object[]{avatarImageWithVerify2, user}, this, f34926a, false, 24977, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{avatarImageWithVerify2, user}, this, f34926a, false, 24977, new Class[]{AvatarImageWithVerify.class, User.class}, Void.TYPE);
                return;
            }
            avatarImageWithVerify2.f34918c.setVisibility(8);
        }
    }

    private int getVerifyIconMarginEnd() {
        return -this.j;
    }

    @Deprecated
    public AvatarImageView getAvatarImageView() {
        return this.g;
    }

    public User getData() {
        return this.h;
    }

    public int getVerifyIconSize() {
        return this.i;
    }

    @NonNull
    private FrameLayout.LayoutParams getAvatarLayoutParams() {
        if (!PatchProxy.isSupport(new Object[0], this, f34916a, false, 24955, new Class[0], FrameLayout.LayoutParams.class)) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return (FrameLayout.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f34916a, false, 24955, new Class[0], FrameLayout.LayoutParams.class);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f34916a, false, 24961, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34916a, false, 24961, new Class[0], Void.TYPE);
            return;
        }
        for (e c2 : k) {
            c2.c(this, null);
        }
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34916a, false, 24953, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34916a, false, 24953, new Class[0], Void.TYPE);
            return;
        }
        this.g = new AvatarImageView(getContext());
        if (com.ss.android.g.a.b()) {
            ((GenericDraweeHierarchy) this.g.getHierarchy()).setPlaceholderImage((int) C0906R.color.a0k, ScalingUtils.ScaleType.CENTER_CROP);
        }
        addView(this.g, getAvatarLayoutParams());
        FrameLayout.LayoutParams a2 = a(getVerifyIconSize());
        this.f34917b = new ImageView(getContext());
        try {
            this.f34917b.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839424));
        } catch (Resources.NotFoundException unused) {
        }
        this.f34917b.setVisibility(8);
        FrameLayout.LayoutParams a3 = a(getVerifyIconSize());
        this.f34918c = new ImageView(getContext());
        try {
            this.f34918c.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839424));
        } catch (Resources.NotFoundException unused2) {
        }
        this.f34918c.setVisibility(8);
        this.f34919d = new ImageView(getContext());
        try {
            this.f34919d.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839422));
        } catch (Resources.NotFoundException unused3) {
        }
        this.f34919d.setVisibility(8);
        this.f34920e = new ImageView(getContext());
        try {
            this.f34920e.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839418));
        } catch (Resources.NotFoundException unused4) {
        }
        this.f34920e.setVisibility(8);
        this.f34921f = new ImageView(getContext());
        try {
            this.f34921f.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839420));
        } catch (Resources.NotFoundException unused5) {
        }
        this.f34921f.setVisibility(8);
        addView(this.f34917b, a2);
        addView(this.f34918c, a3);
        addView(this.f34919d, a3);
        addView(this.f34920e, a3);
        addView(this.f34921f, a3);
    }

    public AvatarImageWithVerify(Context context) {
        this(context, null);
    }

    @NonNull
    private FrameLayout.LayoutParams a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34916a, false, 24956, new Class[]{Integer.TYPE}, FrameLayout.LayoutParams.class)) {
            return (FrameLayout.LayoutParams) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34916a, false, 24956, new Class[]{Integer.TYPE}, FrameLayout.LayoutParams.class);
        }
        int i3 = i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 8388693;
        a(layoutParams, getVerifyIconMarginEnd());
        return layoutParams;
    }

    public void setPlaceHolder(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f34916a, false, 24954, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f34916a, false, 24954, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ((GenericDraweeHierarchy) this.g.getHierarchy()).setPlaceholderImage(i2, ScalingUtils.ScaleType.CENTER_CROP);
    }

    public void setData(User user) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{user}, this, f34916a, false, 24960, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f34916a, false, 24960, new Class[]{User.class}, Void.TYPE);
        } else if (this.h != user) {
            setClipChildren(false);
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).setClipChildren(false);
            }
            this.h = user;
            if (user == null) {
                this.g.setController(null);
                e[] eVarArr = k;
                int length = eVarArr.length;
                while (i2 < length) {
                    eVarArr[i2].c(this, null);
                    i2++;
                }
                return;
            }
            com.ss.android.ugc.aweme.base.c.b(this.g, user.getAvatarThumb());
            e[] eVarArr2 = k;
            int length2 = eVarArr2.length;
            boolean z = false;
            while (i2 < length2) {
                e eVar = eVarArr2[i2];
                if (z || !eVar.a(this, user)) {
                    eVar.c(this, user);
                } else {
                    eVar.b(this, user);
                    z = true;
                }
                i2++;
            }
        }
    }

    public AvatarImageWithVerify(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(FrameLayout.LayoutParams layoutParams, int i2) {
        FrameLayout.LayoutParams layoutParams2 = layoutParams;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{layoutParams2, Integer.valueOf(i2)}, this, f34916a, false, 24958, new Class[]{FrameLayout.LayoutParams.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{layoutParams2, Integer.valueOf(i2)}, this, f34916a, false, 24958, new Class[]{FrameLayout.LayoutParams.class, Integer.TYPE}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd(i2);
        } else if (ey.a(getContext())) {
            layoutParams2.leftMargin = i3;
        } else {
            layoutParams2.rightMargin = i3;
        }
    }

    public AvatarImageWithVerify(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        float f2;
        Context context2 = GlobalContext.getContext();
        if (com.ss.android.g.a.b()) {
            f2 = 16.0f;
        } else {
            f2 = 20.0f;
        }
        this.i = (int) UIUtils.dip2Px(context2, f2);
        this.j = (int) UIUtils.dip2Px(GlobalContext.getContext(), 2.0f);
        a();
    }
}
