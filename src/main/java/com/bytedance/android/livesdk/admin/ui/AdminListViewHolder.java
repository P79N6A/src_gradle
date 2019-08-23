package com.bytedance.android.livesdk.admin.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.admin.b.b;
import com.bytedance.android.livesdk.admin.b.c;
import com.bytedance.android.livesdk.admin.d.a;
import com.bytedance.android.livesdk.common.AbsViewHolder;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.lang.a;

public class AdminListViewHolder extends AbsViewHolder implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8983a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f8984b;

    /* renamed from: c  reason: collision with root package name */
    public View f8985c;

    /* renamed from: d  reason: collision with root package name */
    public HSImageView f8986d;

    /* renamed from: e  reason: collision with root package name */
    public Context f8987e;

    /* renamed from: f  reason: collision with root package name */
    b f8988f;
    public com.bytedance.android.livesdk.admin.c.a g;
    public long h;
    public long i;
    private VHeadView k;
    private TextView l;

    public final void a(c cVar, Exception exc) {
    }

    public final <T> void a(T t) {
        ImageModel imageModel;
        if (PatchProxy.isSupport(new Object[]{t}, this, f8983a, false, 3095, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, f8983a, false, 3095, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        if (t instanceof b) {
            this.f8988f = (b) t;
            User user = this.f8988f.f8956a;
            if (user != null) {
                if (user.getAvatarThumb() != null) {
                    com.bytedance.android.livesdk.chatroom.f.b.b(this.k, user.getAvatarThumb());
                } else {
                    this.k.setImageResource(2130841141);
                }
                this.k.setOnClickListener(new a(user));
                this.l.setText(user.getNickName());
                if (user.getUserHonor() != null) {
                    imageModel = user.getUserHonor().j();
                } else {
                    imageModel = null;
                }
                if (imageModel == null || CollectionUtils.isEmpty(imageModel.getUrls())) {
                    this.f8986d.setVisibility(8);
                } else {
                    com.bytedance.android.livesdk.chatroom.f.b.a((ImageView) this.f8986d, imageModel, (q.a) new q.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f8992a;

                        public final void a(ImageModel imageModel) {
                        }

                        public final void a(ImageModel imageModel, Exception exc) {
                        }

                        public final void a(ImageModel imageModel, int i, int i2, boolean z) {
                            if (PatchProxy.isSupport(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f8992a, false, 3103, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f8992a, false, 3103, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                                return;
                            }
                            ViewGroup.LayoutParams layoutParams = AdminListViewHolder.this.f8986d.getLayoutParams();
                            int a2 = ac.a(32.0f);
                            layoutParams.width = a2;
                            layoutParams.height = (a2 * i2) / i;
                            AdminListViewHolder.this.f8986d.setLayoutParams(layoutParams);
                        }
                    });
                    this.f8986d.setVisibility(0);
                }
            }
        }
    }

    public final void a(boolean z, User user) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), user}, this, f8983a, false, 3098, new Class[]{Boolean.TYPE, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), user}, this, f8983a, false, 3098, new Class[]{Boolean.TYPE, User.class}, Void.TYPE);
            return;
        }
        if (!z) {
            this.f8984b.setVisibility(0);
            this.f8985c.setVisibility(8);
            com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.admin.a.a(z, user.getId()));
        }
    }

    public final void a(boolean z, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), exc}, this, f8983a, false, 3099, new Class[]{Boolean.TYPE, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), exc}, this, f8983a, false, 3099, new Class[]{Boolean.TYPE, Exception.class}, Void.TYPE);
            return;
        }
        if (!z) {
            this.f8984b.setVisibility(0);
            this.f8985c.setVisibility(8);
            l.a(this.f8987e, exc);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdminListViewHolder(Context context, View view, long j, long j2) {
        super(view, 0);
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f8983a, false, 3094, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f8983a, false, 3094, new Class[]{View.class}, Void.TYPE);
        } else {
            this.k = (VHeadView) view.findViewById(C0906R.id.ank);
            this.f8984b = (TextView) view.findViewById(C0906R.id.q6);
            this.f8985c = view.findViewById(C0906R.id.q_);
            this.l = (TextView) view.findViewById(C0906R.id.dq2);
            this.f8986d = (HSImageView) view.findViewById(C0906R.id.dpb);
            this.f8984b.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8989a;

                /* renamed from: c  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f8990c;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f8989a, true, 3102, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f8989a, true, 3102, new Class[0], Void.TYPE);
                        return;
                    }
                    org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("AdminListViewHolder.java", AnonymousClass1.class);
                    f8990c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.admin.ui.AdminListViewHolder$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 74);
                }

                public void onClick(View view) {
                    String str;
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f8989a, false, 3101, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f8989a, false, 3101, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f8990c, this, this, view2));
                    AdminListViewHolder adminListViewHolder = AdminListViewHolder.this;
                    if (PatchProxy.isSupport(new Object[0], adminListViewHolder, AdminListViewHolder.f8983a, false, 3096, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], adminListViewHolder, AdminListViewHolder.f8983a, false, 3096, new Class[0], Void.TYPE);
                    } else if (adminListViewHolder.f8988f != null && adminListViewHolder.f8988f.f8956a != null) {
                        if (!NetworkUtils.isNetworkAvailable(adminListViewHolder.f8987e)) {
                            com.bytedance.android.live.uikit.d.a.a(adminListViewHolder.f8987e, (int) C0906R.string.cst);
                            return;
                        }
                        User user = adminListViewHolder.f8988f.f8956a;
                        if (PatchProxy.isSupport(new Object[]{user}, adminListViewHolder, AdminListViewHolder.f8983a, false, 3097, new Class[]{User.class}, Void.TYPE)) {
                            AdminListViewHolder adminListViewHolder2 = adminListViewHolder;
                            PatchProxy.accessDispatch(new Object[]{user}, adminListViewHolder2, AdminListViewHolder.f8983a, false, 3097, new Class[]{User.class}, Void.TYPE);
                            return;
                        }
                        if (user != null) {
                            String string = adminListViewHolder.f8987e.getString(C0906R.string.cq1);
                            if (TextUtils.isEmpty(user.getNickName())) {
                                str = "";
                            } else {
                                str = user.getNickName();
                            }
                            String string2 = adminListViewHolder.f8987e.getString(C0906R.string.cq2);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + str + string2);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(adminListViewHolder.f8987e.getResources().getColor(C0906R.color.a8u)), string.length(), string.length() + str.length(), 33);
                            new m.a(adminListViewHolder.f8987e).c((CharSequence) spannableStringBuilder).b(1, (int) C0906R.string.cpz, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f8997a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f8997a, false, 3105, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f8997a, false, 3105, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    f.a(AdminListViewHolder.this.f8987e);
                                    dialogInterface.dismiss();
                                }
                            }).b(0, (int) C0906R.string.cpw, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(user) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f8994a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ User f8995b;

                                {
                                    this.f8995b = r2;
                                }

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f8994a, false, 3104, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f8994a, false, 3104, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    f.a(AdminListViewHolder.this.f8987e);
                                    AdminListViewHolder.this.f8985c.setVisibility(0);
                                    AdminListViewHolder.this.f8984b.setVisibility(8);
                                    AdminListViewHolder.this.g.a(false, this.f8995b.getId(), AdminListViewHolder.this.h, AdminListViewHolder.this.i);
                                    dialogInterface.dismiss();
                                }
                            }).c();
                            f.a(adminListViewHolder.f8987e);
                        }
                    }
                }
            });
        }
        this.f8987e = context;
        this.h = j;
        this.i = j2;
        this.g = new com.bytedance.android.livesdk.admin.c.a(this);
    }
}
