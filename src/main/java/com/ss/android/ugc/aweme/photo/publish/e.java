package com.ss.android.ugc.aweme.photo.publish;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.share.c;
import java.util.ArrayList;
import java.util.List;

public interface e {

    public static class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58703a;

        /* renamed from: b  reason: collision with root package name */
        public Activity f58704b;

        /* renamed from: c  reason: collision with root package name */
        private List<com.douyin.baseshare.a> f58705c;

        /* renamed from: d  reason: collision with root package name */
        private LinearLayout f58706d;

        /* renamed from: e  reason: collision with root package name */
        private int f58707e;

        /* renamed from: f  reason: collision with root package name */
        private int f58708f;
        private int g;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.douyin.baseshare.a a(com.douyin.baseshare.a[] r20, java.lang.String r21) {
            /*
                r19 = this;
                r0 = r20
                r1 = r21
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r0
                r11 = 1
                r3[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r5 = f58703a
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<com.douyin.baseshare.a[]> r4 = com.douyin.baseshare.a[].class
                r8[r10] = r4
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r8[r11] = r4
                java.lang.Class<com.douyin.baseshare.a> r9 = com.douyin.baseshare.a.class
                r6 = 0
                r7 = 63758(0xf90e, float:8.9344E-41)
                r4 = r19
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x004a
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r0
                r12[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r14 = f58703a
                r15 = 0
                r16 = 63758(0xf90e, float:8.9344E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<com.douyin.baseshare.a[]> r1 = com.douyin.baseshare.a[].class
                r0[r10] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r11] = r1
                java.lang.Class<com.douyin.baseshare.a> r18 = com.douyin.baseshare.a.class
                r13 = r19
                r17 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                com.douyin.baseshare.a r0 = (com.douyin.baseshare.a) r0
                return r0
            L_0x004a:
                int r2 = r0.length
            L_0x004b:
                if (r10 >= r2) goto L_0x005d
                r3 = r0[r10]
                java.lang.String r4 = r3.d()
                boolean r4 = r1.equals(r4)
                if (r4 == 0) goto L_0x005a
                return r3
            L_0x005a:
                int r10 = r10 + 1
                goto L_0x004b
            L_0x005d:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.photo.publish.e.a.a(com.douyin.baseshare.a[], java.lang.String):com.douyin.baseshare.a");
        }

        @NonNull
        public final LinearLayout a(@NonNull Aweme aweme, @NonNull PhotoContext photoContext) {
            ImageView imageView;
            ImageView imageView2;
            ImageView imageView3;
            Aweme aweme2 = aweme;
            PhotoContext photoContext2 = photoContext;
            char c2 = 2;
            char c3 = 1;
            if (PatchProxy.isSupport(new Object[]{aweme2, photoContext2}, this, f58703a, false, 63759, new Class[]{Aweme.class, PhotoContext.class}, LinearLayout.class)) {
                return (LinearLayout) PatchProxy.accessDispatch(new Object[]{aweme2, photoContext2}, this, f58703a, false, 63759, new Class[]{Aweme.class, PhotoContext.class}, LinearLayout.class);
            }
            int i = 0;
            while (i < this.f58705c.size()) {
                if (i == 0) {
                    LinearLayout linearLayout = this.f58706d;
                    com.douyin.baseshare.a aVar = this.f58705c.get(i);
                    String str = photoContext2.mPhotoLocalPath;
                    Object[] objArr = new Object[3];
                    objArr[0] = aVar;
                    objArr[c3] = aweme2;
                    objArr[c2] = str;
                    ChangeQuickRedirect changeQuickRedirect = f58703a;
                    Class[] clsArr = new Class[3];
                    clsArr[0] = com.douyin.baseshare.a.class;
                    clsArr[c3] = Aweme.class;
                    clsArr[c2] = String.class;
                    String str2 = str;
                    com.douyin.baseshare.a aVar2 = aVar;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, 63760, clsArr, ImageView.class)) {
                        imageView3 = (ImageView) PatchProxy.accessDispatch(new Object[]{aVar2, aweme2, str2}, this, f58703a, false, 63760, new Class[]{com.douyin.baseshare.a.class, Aweme.class, String.class}, ImageView.class);
                    } else {
                        imageView3 = a(aVar2, aweme2, str2);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f58707e, this.f58707e);
                        layoutParams.setMargins(0, 0, this.g, 0);
                        imageView3.setLayoutParams(layoutParams);
                    }
                    linearLayout.addView(imageView3);
                } else if (i == this.f58705c.size() - 1) {
                    LinearLayout linearLayout2 = this.f58706d;
                    com.douyin.baseshare.a aVar3 = this.f58705c.get(i);
                    String str3 = photoContext2.mPhotoLocalPath;
                    if (PatchProxy.isSupport(new Object[]{aVar3, aweme2, str3}, this, f58703a, false, 63762, new Class[]{com.douyin.baseshare.a.class, Aweme.class, String.class}, ImageView.class)) {
                        imageView2 = (ImageView) PatchProxy.accessDispatch(new Object[]{aVar3, aweme2, str3}, this, f58703a, false, 63762, new Class[]{com.douyin.baseshare.a.class, Aweme.class, String.class}, ImageView.class);
                    } else {
                        imageView2 = a(aVar3, aweme2, str3);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f58707e, this.f58707e);
                        layoutParams2.setMargins(this.g, 0, 0, 0);
                        imageView2.setLayoutParams(layoutParams2);
                    }
                    linearLayout2.addView(imageView2);
                } else {
                    LinearLayout linearLayout3 = this.f58706d;
                    com.douyin.baseshare.a aVar4 = this.f58705c.get(i);
                    String str4 = photoContext2.mPhotoLocalPath;
                    if (PatchProxy.isSupport(new Object[]{aVar4, aweme2, str4}, this, f58703a, false, 63761, new Class[]{com.douyin.baseshare.a.class, Aweme.class, String.class}, ImageView.class)) {
                        imageView = (ImageView) PatchProxy.accessDispatch(new Object[]{aVar4, aweme2, str4}, this, f58703a, false, 63761, new Class[]{com.douyin.baseshare.a.class, Aweme.class, String.class}, ImageView.class);
                    } else {
                        imageView = a(aVar4, aweme2, str4);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(this.f58707e, this.f58707e);
                        layoutParams3.setMargins(this.g, 0, this.g, 0);
                        imageView.setLayoutParams(layoutParams3);
                    }
                    linearLayout3.addView(imageView);
                    i++;
                    c2 = 2;
                    c3 = 1;
                }
                i++;
                c2 = 2;
                c3 = 1;
            }
            return this.f58706d;
        }

        public a(@NonNull Activity activity, @NonNull com.douyin.baseshare.a[] aVarArr, @NonNull LinearLayout linearLayout) {
            List<com.douyin.baseshare.a> list;
            this.f58704b = activity;
            if (PatchProxy.isSupport(new Object[]{aVarArr}, this, f58703a, false, 63757, new Class[]{com.douyin.baseshare.a[].class}, List.class)) {
                list = (List) PatchProxy.accessDispatch(new Object[]{aVarArr}, this, f58703a, false, 63757, new Class[]{com.douyin.baseshare.a[].class}, List.class);
            } else {
                list = new ArrayList<>();
                list.add(new c(this.f58704b));
                list.add(a(aVarArr, "weixin_moments"));
                list.add(a(aVarArr, "weixin"));
                list.add(a(aVarArr, "qq"));
                list.add(a(aVarArr, "weibo"));
            }
            this.f58705c = list;
            this.f58706d = linearLayout;
            this.f58707e = (int) UIUtils.dip2Px(this.f58704b, 33.0f);
            this.f58708f = (int) UIUtils.dip2Px(this.f58704b, 3.0f);
            this.g = (int) UIUtils.dip2Px(this.f58704b, 4.5f);
        }

        private ImageView a(com.douyin.baseshare.a aVar, Aweme aweme, String str) {
            final com.douyin.baseshare.a aVar2 = aVar;
            final Aweme aweme2 = aweme;
            final String str2 = str;
            if (PatchProxy.isSupport(new Object[]{aVar2, aweme2, str2}, this, f58703a, false, 63763, new Class[]{com.douyin.baseshare.a.class, Aweme.class, String.class}, ImageView.class)) {
                return (ImageView) PatchProxy.accessDispatch(new Object[]{aVar2, aweme2, str2}, this, f58703a, false, 63763, new Class[]{com.douyin.baseshare.a.class, Aweme.class, String.class}, ImageView.class);
            }
            RemoteImageView remoteImageView = new RemoteImageView(this.f58704b);
            if (!TextUtils.equals(aVar.d(), "chat_merge") || !b.c()) {
                remoteImageView.setImageDrawable(aVar.g());
            } else {
                b.a((Context) this.f58704b, remoteImageView, 3);
            }
            remoteImageView.setPadding(this.f58708f, this.f58708f, this.f58708f, this.f58708f);
            remoteImageView.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58709a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f58709a, false, 63764, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f58709a, false, 63764, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (aVar2.a()) {
                        r.onEvent(MobClick.obtain().setEventName("share_bodydance_card").setLabelName(aVar2.d()));
                        aVar2.b(i.c(a.this.f58704b, aweme2, str2));
                        return;
                    }
                    com.bytedance.ies.dmt.ui.d.a.b((Context) a.this.f58704b, aVar2.c(), 0).a();
                }
            });
            return remoteImageView;
        }
    }

    LinearLayout a(@NonNull Aweme aweme, @NonNull PhotoContext photoContext);
}
