package com.ss.android.ugc.aweme.share;

import a.g;
import a.i;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.douyin.share.profile.share.a;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.widget.PullBackLayout;
import com.ss.android.ugc.aweme.common.widget.b;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.profile.model.User;
import javax.annotation.Nullable;

public class ProfileShareActivity extends AmeActivity implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64514a;
    protected ControllerListener<ImageInfo> A = new BaseControllerListener<ImageInfo>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64531a;

        public final void onRelease(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f64531a, false, 73214, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f64531a, false, 73214, new Class[]{String.class}, Void.TYPE);
                return;
            }
            super.onRelease(str);
        }

        public final void onFailure(String str, Throwable th) {
            if (PatchProxy.isSupport(new Object[]{str, th}, this, f64531a, false, 73213, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, th}, this, f64531a, false, 73213, new Class[]{String.class, Throwable.class}, Void.TYPE);
                return;
            }
            super.onFailure(str, th);
        }

        public final /* synthetic */ void onIntermediateImageSet(String str, @Nullable Object obj) {
            String str2 = str;
            ImageInfo imageInfo = (ImageInfo) obj;
            if (PatchProxy.isSupport(new Object[]{str2, imageInfo}, this, f64531a, false, 73215, new Class[]{String.class, ImageInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, imageInfo}, this, f64531a, false, 73215, new Class[]{String.class, ImageInfo.class}, Void.TYPE);
                return;
            }
            super.onIntermediateImageSet(str2, imageInfo);
        }

        public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
            ImageInfo imageInfo = (ImageInfo) obj;
            if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f64531a, false, 73212, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f64531a, false, 73212, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                return;
            }
            i.a(200).a((g<TResult, TContinuationResult>) new g<Void, Object>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64533a;

                public final Object then(i<Void> iVar) throws Exception {
                    if (!PatchProxy.isSupport(new Object[]{iVar}, this, f64533a, false, 73216, new Class[]{i.class}, Object.class)) {
                        return ProfileShareActivity.this.c();
                    }
                    return PatchProxy.accessDispatch(new Object[]{iVar}, this, f64533a, false, 73216, new Class[]{i.class}, Object.class);
                }
            }, i.f1052b);
        }
    };
    private View B;
    private TextView C;
    private TextView D;
    private TextView E;
    private String F;
    private boolean G;

    /* renamed from: b  reason: collision with root package name */
    User f64515b;

    /* renamed from: c  reason: collision with root package name */
    public int f64516c;

    /* renamed from: d  reason: collision with root package name */
    public int f64517d;

    /* renamed from: e  reason: collision with root package name */
    public Context f64518e;

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f64519f;
    TextView g;
    AnimatedImageView h;
    TextView i;
    AnimatedImageView j;
    CircleImageView k;
    LinearLayout l;
    RemoteImageView m;
    TextView n;
    ImageView o;
    ImageView p;
    PullBackLayout q;
    LinearLayout r;
    LinearLayout s;
    LinearLayout t;
    TextView u;
    View v;
    RemoteImageView w;
    int x;
    LinearLayout y;
    boolean z;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64514a, false, 73204, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64514a, false, 73204, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.ProfileShareActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.ProfileShareActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f64514a, false, 73205, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f64514a, false, 73205, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.ProfileShareActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0427, code lost:
        if (d() != false) goto L_0x03dd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r7 = r18
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 73174(0x11dd6, float:1.02539E-40)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73174(0x11dd6, float:1.02539E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            java.lang.String r0 = "com.ss.android.ugc.aweme.share.ProfileShareActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            super.onCreate(r19)
            r0 = 2131689624(0x7f0f0098, float:1.9008269E38)
            r7.setContentView((int) r0)
            r0 = 2130968593(0x7f040011, float:1.7545844E38)
            r7.a(r0, r10)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73176(0x11dd8, float:1.02541E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0072
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73176(0x11dd8, float:1.02541E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x008a
        L_0x0072:
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r1 = "from"
            java.lang.String r0 = r0.getStringExtra(r1)
            r7.F = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r1 = "show_original_share"
            boolean r0 = r0.getBooleanExtra(r1, r10)
            r7.G = r0
        L_0x008a:
            butterknife.ButterKnife.bind((android.app.Activity) r18)
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r1 = "user"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            r7.f64515b = r0
            r7.f64518e = r7
            android.app.Application r0 = r18.getApplication()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.cm.f64992a
            r14 = 1
            r15 = 73372(0x11e9c, float:1.02816E-40)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Integer.TYPE
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x00dc
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.cm.f64992a
            r14 = 1
            r15 = 73372(0x11e9c, float:1.02816E-40)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Integer.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x00f6
        L_0x00dc:
            java.lang.Integer r1 = com.ss.android.ugc.aweme.share.cm.f64993b
            if (r1 != 0) goto L_0x00f0
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.share.cm.a(r0)
            java.lang.String r1 = "share_internal_share_mode"
            int r0 = r0.getInt(r1, r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.aweme.share.cm.f64993b = r0
        L_0x00f0:
            java.lang.Integer r0 = com.ss.android.ugc.aweme.share.cm.f64993b
            int r0 = r0.intValue()
        L_0x00f6:
            r7.f64516c = r0
            int r0 = r7.f64516c
            r7.f64517d = r0
            r0 = 2131169925(0x7f071285, float:1.7954194E38)
            android.view.View r1 = r7.findViewById(r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r7.l = r1
            r1 = 2131169177(0x7f070f99, float:1.7952677E38)
            android.view.View r1 = r7.findViewById(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1
            r7.m = r1
            r1 = 2131169912(0x7f071278, float:1.7954167E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7.n = r1
            r1 = 2131167728(0x7f0709f0, float:1.7949738E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r7.o = r1
            r1 = 2131167727(0x7f0709ef, float:1.7949736E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r7.p = r1
            r1 = 2131169249(0x7f070fe1, float:1.7952823E38)
            android.view.View r1 = r7.findViewById(r1)
            com.ss.android.ugc.aweme.common.widget.PullBackLayout r1 = (com.ss.android.ugc.aweme.common.widget.PullBackLayout) r1
            r7.q = r1
            r1 = 2131169898(0x7f07126a, float:1.795414E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r7.r = r1
            r1 = 2131169916(0x7f07127c, float:1.7954176E38)
            android.view.View r2 = r7.findViewById(r1)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r7.s = r2
            r2 = 2131169913(0x7f071279, float:1.795417E38)
            android.view.View r3 = r7.findViewById(r2)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r7.t = r3
            r3 = 2131165403(0x7f0700db, float:1.7945022E38)
            android.view.View r3 = r7.findViewById(r3)
            r7.v = r3
            r3 = 2131169890(0x7f071262, float:1.7954123E38)
            android.view.View r3 = r7.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r7.y = r3
            com.ss.android.ugc.aweme.framework.services.ServiceManager r3 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService> r4 = com.ss.android.ugc.aweme.framework.services.IShareService.class
            java.lang.Object r3 = r3.getService(r4)
            com.ss.android.ugc.aweme.framework.services.IShareService r3 = (com.ss.android.ugc.aweme.framework.services.IShareService) r3
            com.ss.android.ugc.aweme.framework.services.ServiceManager r4 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.share.ShareOrderService> r5 = com.ss.android.ugc.aweme.share.ShareOrderService.class
            java.lang.Object r4 = r4.getService(r5)
            com.ss.android.ugc.aweme.share.ShareOrderService r4 = (com.ss.android.ugc.aweme.share.ShareOrderService) r4
            java.lang.String[] r5 = r4.getUrlShareList()
            java.lang.String[] r4 = r4.getUrlShareList()
            int r4 = r4.length
            com.douyin.baseshare.a[] r4 = new com.douyin.baseshare.a[r4]
            r6 = 0
        L_0x0197:
            int r8 = r4.length
            if (r6 >= r8) goto L_0x01a5
            r8 = r5[r6]
            com.douyin.baseshare.a r8 = r3.getShareChannel(r7, r8)
            r4[r6] = r8
            int r6 = r6 + 1
            goto L_0x0197
        L_0x01a5:
            java.lang.String r3 = "toutiao"
            r8 = 2
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r4
            r11[r9] = r3
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.d.x.f61505a
            r14 = 1
            r15 = 70018(0x11182, float:9.8116E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.douyin.baseshare.a[]> r6 = com.douyin.baseshare.a[].class
            r5[r10] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r9] = r6
            java.lang.Class<com.douyin.baseshare.a[]> r17 = com.douyin.baseshare.a[].class
            r16 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x01eb
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r4
            r11[r9] = r3
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.d.x.f61505a
            r14 = 1
            r15 = 70018(0x11182, float:9.8116E-41)
            java.lang.Class[] r3 = new java.lang.Class[r8]
            java.lang.Class<com.douyin.baseshare.a[]> r4 = com.douyin.baseshare.a[].class
            r3[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r9] = r4
            java.lang.Class<com.douyin.baseshare.a[]> r17 = com.douyin.baseshare.a[].class
            r16 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            com.douyin.baseshare.a[] r3 = (com.douyin.baseshare.a[]) r3
            goto L_0x0214
        L_0x01eb:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r4.length
            r11 = 0
        L_0x01f2:
            if (r11 >= r6) goto L_0x0208
            r12 = r4[r11]
            if (r12 == 0) goto L_0x0205
            java.lang.String r13 = r12.d()
            boolean r13 = android.text.TextUtils.equals(r3, r13)
            if (r13 != 0) goto L_0x0205
            r5.add(r12)
        L_0x0205:
            int r11 = r11 + 1
            goto L_0x01f2
        L_0x0208:
            int r3 = r5.size()
            com.douyin.baseshare.a[] r3 = new com.douyin.baseshare.a[r3]
            java.lang.Object[] r3 = r5.toArray(r3)
            com.douyin.baseshare.a[] r3 = (com.douyin.baseshare.a[]) r3
        L_0x0214:
            com.douyin.baseshare.a[] r3 = com.ss.android.ugc.aweme.share.cg.a((com.douyin.baseshare.a[]) r3)
            int r4 = r3.length
            r5 = 0
        L_0x021a:
            if (r5 >= r4) goto L_0x022f
            r6 = r3[r5]
            com.ss.android.ugc.aweme.share.ProfileShareActivity$1 r11 = new com.ss.android.ugc.aweme.share.ProfileShareActivity$1
            r11.<init>(r6)
            com.ss.android.ugc.aweme.share.seconditem.j r6 = com.ss.android.ugc.aweme.share.cg.a((android.app.Activity) r7, (com.douyin.baseshare.a) r6, (android.view.View.OnClickListener) r11)
            android.widget.LinearLayout r11 = r7.y
            r11.addView(r6)
            int r5 = r5 + 1
            goto L_0x021a
        L_0x022f:
            com.ss.android.ugc.aweme.share.ProfileShareActivity$2 r3 = new com.ss.android.ugc.aweme.share.ProfileShareActivity$2
            r3.<init>()
            r4 = 2131165813(0x7f070275, float:1.7945854E38)
            android.view.View r4 = r7.findViewById(r4)
            r4.setOnClickListener(r3)
            r4 = 2131165648(0x7f0701d0, float:1.794552E38)
            android.view.View r4 = r7.findViewById(r4)
            r4.setOnClickListener(r3)
            com.ss.android.ugc.aweme.share.ProfileShareActivity$3 r3 = new com.ss.android.ugc.aweme.share.ProfileShareActivity$3
            r3.<init>()
            android.view.View r2 = r7.findViewById(r2)
            r2.setOnClickListener(r3)
            android.view.View r1 = r7.findViewById(r1)
            r1.setOnClickListener(r3)
            android.view.View r0 = r7.findViewById(r0)
            com.ss.android.ugc.aweme.share.ProfileShareActivity$4 r1 = new com.ss.android.ugc.aweme.share.ProfileShareActivity$4
            r1.<init>()
            r0.setOnClickListener(r1)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73182(0x11dde, float:1.0255E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x028e
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73182(0x11dde, float:1.0255E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08f0
        L_0x028e:
            int r0 = r7.f64516c
            if (r0 != 0) goto L_0x029d
            android.widget.ImageView r0 = r7.o
            r0.setSelected(r9)
            android.widget.ImageView r0 = r7.p
            r0.setSelected(r10)
            goto L_0x02a7
        L_0x029d:
            android.widget.ImageView r0 = r7.p
            r0.setSelected(r9)
            android.widget.ImageView r0 = r7.o
            r0.setSelected(r10)
        L_0x02a7:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73181(0x11ddd, float:1.02548E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02cd
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73181(0x11ddd, float:1.02548E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0332
        L_0x02cd:
            com.ss.android.ugc.aweme.common.widget.PullBackLayout r0 = r7.q
            android.widget.LinearLayout r1 = r7.r
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            java.lang.Byte r2 = java.lang.Byte.valueOf(r10)
            r11[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.common.widget.PullBackLayout.f40456a
            r14 = 0
            r15 = 33747(0x83d3, float:4.729E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r3 = android.view.View.class
            r2[r10] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r9] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0319
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r10] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r11[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.common.widget.PullBackLayout.f40456a
            r14 = 0
            r15 = 33747(0x83d3, float:4.729E-41)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r1[r10] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r9] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x031b
        L_0x0319:
            r0.f40457b = r1
        L_0x031b:
            com.ss.android.ugc.aweme.common.widget.PullBackLayout r0 = r7.q
            android.content.Context r1 = r7.f64518e
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131625020(0x7f0e043c, float:1.8877236E38)
            int r1 = r1.getColor(r2)
            r0.setBackgroundColor(r1)
            com.ss.android.ugc.aweme.common.widget.PullBackLayout r0 = r7.q
            r0.setPullBackListener(r7)
        L_0x0332:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73189(0x11de5, float:1.0256E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0358
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73189(0x11de5, float:1.0256E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0362
        L_0x0358:
            android.widget.LinearLayout r0 = r7.s
            com.ss.android.ugc.aweme.share.ProfileShareActivity$5 r1 = new com.ss.android.ugc.aweme.share.ProfileShareActivity$5
            r1.<init>()
            r0.post(r1)
        L_0x0362:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f64515b
            if (r0 == 0) goto L_0x08f0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73203(0x11df3, float:1.02579E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0394
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73203(0x11df3, float:1.02579E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x042b
        L_0x0394:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f64515b
            if (r0 == 0) goto L_0x042a
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f64515b
            com.ss.android.ugc.aweme.music.h r0 = r0.getOriginalMusician()
            if (r0 == 0) goto L_0x042a
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73202(0x11df2, float:1.02578E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03cd
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73202(0x11df2, float:1.02578E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x03d5
        L_0x03cd:
            java.lang.String r0 = r7.F
            java.lang.String r1 = "musician_share"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
        L_0x03d5:
            if (r0 == 0) goto L_0x041f
            boolean r0 = r18.d()
            if (r0 == 0) goto L_0x03df
        L_0x03dd:
            r0 = 1
            goto L_0x042b
        L_0x03df:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73201(0x11df1, float:1.02576E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x040c
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73201(0x11df1, float:1.02576E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x041b
        L_0x040c:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f64515b
            if (r0 == 0) goto L_0x041a
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f64515b
            int r0 = r0.getVerificationType()
            if (r0 == r8) goto L_0x041a
            r0 = 1
            goto L_0x041b
        L_0x041a:
            r0 = 0
        L_0x041b:
            if (r0 == 0) goto L_0x042a
            r0 = 2
            goto L_0x042b
        L_0x041f:
            boolean r0 = r7.G
            if (r0 == 0) goto L_0x042a
            boolean r0 = r18.d()
            if (r0 == 0) goto L_0x042a
            goto L_0x03dd
        L_0x042a:
            r0 = 0
        L_0x042b:
            r7.x = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73186(0x11de2, float:1.02555E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0454
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73186(0x11de2, float:1.02555E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x059d
        L_0x0454:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f64515b
            boolean r0 = r7.a((com.ss.android.ugc.aweme.profile.model.User) r0)
            if (r0 == 0) goto L_0x059d
            java.lang.String r0 = ""
            int r1 = r7.x
            if (r1 != r8) goto L_0x04ce
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73187(0x11de3, float:1.02557E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x048c
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73187(0x11de3, float:1.02557E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x056c
        L_0x048c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "抖音音乐经纪人-@"
            r0.<init>(r1)
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            java.lang.String r1 = r1.getNickname()
            r0.append(r1)
            java.lang.String r1 = ", 使用"
            r0.append(r1)
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            com.ss.android.ugc.aweme.music.h r1 = r1.getOriginalMusician()
            int r1 = r1.getMusicUseCount()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.append(r1)
            java.lang.String r1 = "首原创音乐,\n获赞"
            r0.append(r1)
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            com.ss.android.ugc.aweme.music.h r1 = r1.getOriginalMusician()
            int r1 = r1.getDiggCount()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x056c
        L_0x04ce:
            int r1 = r7.x
            if (r1 != r9) goto L_0x055e
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73188(0x11de4, float:1.02558E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x04fb
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73188(0x11de4, float:1.02558E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x056c
        L_0x04fb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "抖音音乐人-@"
            r0.<init>(r1)
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            java.lang.String r1 = r1.getNickname()
            r0.append(r1)
            java.lang.String r1 = ", 发布"
            r0.append(r1)
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            com.ss.android.ugc.aweme.music.h r1 = r1.getOriginalMusician()
            int r1 = r1.getMusicCount()
            java.lang.String r1 = com.douyin.share.e.a.b.a(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.append(r1)
            java.lang.String r1 = "首音乐,被"
            r0.append(r1)
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            com.ss.android.ugc.aweme.music.h r1 = r1.getOriginalMusician()
            int r1 = r1.getMusicUseCount()
            java.lang.String r1 = com.douyin.share.e.a.b.a(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.append(r1)
            java.lang.String r1 = "人拍摄,获赞"
            r0.append(r1)
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            com.ss.android.ugc.aweme.music.h r1 = r1.getOriginalMusician()
            int r1 = r1.getDiggCount()
            java.lang.String r1 = com.douyin.share.e.a.b.a(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x056c
        L_0x055e:
            int r1 = r7.x
            if (r1 != 0) goto L_0x056c
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f64515b
            com.ss.android.ugc.aweme.base.share.ShareInfo r0 = r0.getShareInfo()
            java.lang.String r0 = r0.getShareDesc()
        L_0x056c:
            android.widget.TextView r1 = r7.n
            r1.setText(r0)
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r1.getShareInfo()
            r1.setShareDesc(r0)
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f64515b
            int r0 = r0.getAwemeCount()
            if (r0 == 0) goto L_0x0592
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.m
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r1.getShareInfo()
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getImageUrls()
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            goto L_0x059d
        L_0x0592:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.m
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getAvatarMedium()
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
        L_0x059d:
            android.content.Context r0 = r18.getApplicationContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r7.x
            r2 = 2131169926(0x7f071286, float:1.7954196E38)
            if (r1 != 0) goto L_0x05e8
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r1.getShareInfo()
            if (r1 == 0) goto L_0x05d2
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            int r1 = r1.getAwemeCount()
            if (r1 == 0) goto L_0x05d2
            r1 = 2131691004(0x7f0f05fc, float:1.9011068E38)
            android.widget.LinearLayout r3 = r7.l
            android.view.View r0 = r0.inflate(r1, r3, r10)
            r7.B = r0
            android.view.View r0 = r7.B
            android.view.View r0 = r0.findViewById(r2)
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = (com.ss.android.ugc.aweme.base.ui.AnimatedImageView) r0
            r7.j = r0
            goto L_0x0649
        L_0x05d2:
            r1 = 2131691003(0x7f0f05fb, float:1.9011066E38)
            android.widget.LinearLayout r3 = r7.l
            android.view.View r0 = r0.inflate(r1, r3, r10)
            r7.B = r0
            android.view.View r0 = r7.B
            android.view.View r0 = r0.findViewById(r2)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = (com.ss.android.ugc.aweme.base.ui.CircleImageView) r0
            r7.k = r0
            goto L_0x0649
        L_0x05e8:
            int r1 = r7.x
            if (r1 == r9) goto L_0x05f0
            int r1 = r7.x
            if (r1 != r8) goto L_0x0649
        L_0x05f0:
            r1 = 2131690732(0x7f0f04ec, float:1.9010516E38)
            android.widget.LinearLayout r3 = r7.l
            android.view.View r0 = r0.inflate(r1, r3, r10)
            r7.B = r0
            android.view.View r0 = r7.B
            android.view.View r0 = r0.findViewById(r2)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = (com.ss.android.ugc.aweme.base.ui.CircleImageView) r0
            r7.k = r0
            android.view.View r0 = r7.B
            r1 = 2131167675(0x7f0709bb, float:1.794963E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
            r7.w = r0
            android.view.View r0 = r7.B
            r1 = 2131168495(0x7f070cef, float:1.7951293E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.C = r0
            android.view.View r0 = r7.B
            r1 = 2131168493(0x7f070ced, float:1.795129E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.E = r0
            android.view.View r0 = r7.B
            r1 = 2131168507(0x7f070cfb, float:1.7951318E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.D = r0
            int r0 = r7.x
            if (r0 != r8) goto L_0x0649
            android.view.View r0 = r7.B
            r1 = 2130839165(0x7f02067d, float:1.7283333E38)
            android.graphics.drawable.Drawable r1 = android.support.v4.content.ContextCompat.getDrawable(r7, r1)
            r0.setBackground(r1)
        L_0x0649:
            android.widget.LinearLayout r0 = r7.l
            android.view.View r1 = r7.B
            r0.addView(r1)
            android.view.View r0 = r7.B
            r1 = 0
            r0.setPivotX(r1)
            android.view.View r0 = r7.B
            r0.setPivotY(r1)
            android.view.View r0 = r7.B
            r1 = 1048576000(0x3e800000, float:0.25)
            r0.setScaleX(r1)
            android.view.View r0 = r7.B
            r0.setScaleY(r1)
            android.view.View r0 = r7.B
            r1 = 2131169178(0x7f070f9a, float:1.7952679E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.g = r0
            android.view.View r0 = r7.B
            r1 = 2131169929(0x7f071289, float:1.7954202E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = (com.ss.android.ugc.aweme.base.ui.AnimatedImageView) r0
            r7.h = r0
            android.view.View r0 = r7.B
            r1 = 2131169171(0x7f070f93, float:1.7952665E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.i = r0
            android.view.View r0 = r7.B
            r1 = 2131169927(0x7f071287, float:1.7954198E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.f64519f = r0
            android.view.View r0 = r7.B
            r1 = 2131169181(0x7f070f9d, float:1.7952685E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.u = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73192(0x11de8, float:1.02564E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x06cf
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73192(0x11de8, float:1.02564E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08f0
        L_0x06cf:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f64515b
            boolean r0 = r7.a((com.ss.android.ugc.aweme.profile.model.User) r0)
            if (r0 == 0) goto L_0x08f0
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f64515b
            java.lang.String r0 = r0.getUniqueId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x06ea
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f64515b
            java.lang.String r0 = r0.getShortId()
            goto L_0x06f0
        L_0x06ea:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f64515b
            java.lang.String r0 = r0.getUniqueId()
        L_0x06f0:
            android.widget.TextView r1 = r7.g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r3 = r7.f64518e
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131558615(0x7f0d00d7, float:1.874255E38)
            java.lang.String r3 = r3.getString(r4)
            r2.append(r3)
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.setText(r0)
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f64515b
            com.ss.android.ugc.aweme.music.h r11 = r0.getOriginalMusician()
            android.widget.TextView r0 = r7.i
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r1.getShareInfo()
            java.lang.String r1 = r1.getShareDesc()
            r0.setText(r1)
            android.widget.TextView r0 = r7.u
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            java.lang.String r1 = r1.getNickname()
            r0.setText(r1)
            int r0 = r7.x
            r12 = 2131624636(0x7f0e02bc, float:1.8876457E38)
            r13 = 2131427771(0x7f0b01bb, float:1.8477168E38)
            if (r0 != r9) goto L_0x082c
            if (r11 == 0) goto L_0x082c
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.w
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r11.getMusicCoverUrl()
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = r7.h
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r11.getMusicQrcodeUrl()
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r7.k
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getAvatarMedium()
            com.facebook.drawee.controller.ControllerListener<com.facebook.imagepipeline.image.ImageInfo> r2 = r7.A
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (com.ss.android.ugc.aweme.base.model.UrlModel) r1, (com.facebook.drawee.controller.ControllerListener<com.facebook.imagepipeline.image.ImageInfo>) r2)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73193(0x11de9, float:1.02565E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.music.h> r1 = com.ss.android.ugc.aweme.music.h.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0794
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73193(0x11de9, float:1.02565E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.music.h> r1 = com.ss.android.ugc.aweme.music.h.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08f0
        L_0x0794:
            if (r11 == 0) goto L_0x08f0
            android.widget.TextView r0 = r7.C
            com.douyin.share.e.a.d r1 = com.douyin.share.e.a.d.a(r18)
            r2 = 2131561897(0x7f0d0da9, float:1.8749207E38)
            java.lang.String r2 = r7.getString(r2)
            r3 = 2131624928(0x7f0e03e0, float:1.887705E38)
            r4 = 2131427770(0x7f0b01ba, float:1.8477166E38)
            com.douyin.share.e.a.d r1 = r1.a(r2, r4, r3, r10)
            int r2 = r11.getMusicCount()
            java.lang.String r2 = com.douyin.share.e.a.b.a(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.douyin.share.e.a.d r1 = r1.a(r2, r13, r12, r9)
            r2 = 2131561589(0x7f0d0c75, float:1.8748583E38)
            java.lang.String r2 = r7.getString(r2)
            com.douyin.share.e.a.d r1 = r1.a(r2, r4, r3, r10)
            android.text.Spannable r1 = r1.a()
            r0.setText(r1)
            android.widget.TextView r0 = r7.D
            com.douyin.share.e.a.d r1 = com.douyin.share.e.a.d.a(r18)
            r2 = 2131561386(0x7f0d0baa, float:1.8748171E38)
            java.lang.String r2 = r7.getString(r2)
            com.douyin.share.e.a.d r1 = r1.a(r2, r4, r3, r10)
            int r2 = r11.getMusicUseCount()
            java.lang.String r2 = com.douyin.share.e.a.b.a(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.douyin.share.e.a.d r1 = r1.a(r2, r13, r12, r9)
            r2 = 2131559510(0x7f0d0456, float:1.8744366E38)
            java.lang.String r2 = r7.getString(r2)
            com.douyin.share.e.a.d r1 = r1.a(r2, r4, r3, r10)
            android.text.Spannable r1 = r1.a()
            r0.setText(r1)
            android.widget.TextView r0 = r7.E
            com.douyin.share.e.a.d r1 = com.douyin.share.e.a.d.a(r18)
            r2 = 2131561366(0x7f0d0b96, float:1.874813E38)
            java.lang.String r2 = r7.getString(r2)
            com.douyin.share.e.a.d r1 = r1.a(r2, r4, r3, r10)
            int r2 = r11.getDiggCount()
            java.lang.String r2 = com.douyin.share.e.a.b.a(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.douyin.share.e.a.d r1 = r1.a(r2, r13, r12, r9)
            android.text.Spannable r1 = r1.a()
            r0.setText(r1)
            goto L_0x08f0
        L_0x082c:
            int r0 = r7.x
            if (r0 != r8) goto L_0x08b6
            if (r11 == 0) goto L_0x08b6
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.w
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r11.getMusicCoverUrl()
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = r7.h
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r11.getMusicQrcodeUrl()
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r7.k
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getAvatarMedium()
            com.facebook.drawee.controller.ControllerListener<com.facebook.imagepipeline.image.ImageInfo> r2 = r7.A
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (com.ss.android.ugc.aweme.base.model.UrlModel) r1, (com.facebook.drawee.controller.ControllerListener<com.facebook.imagepipeline.image.ImageInfo>) r2)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73194(0x11dea, float:1.02567E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.music.h> r1 = com.ss.android.ugc.aweme.music.h.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0883
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f64514a
            r3 = 0
            r4 = 73194(0x11dea, float:1.02567E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.music.h> r1 = com.ss.android.ugc.aweme.music.h.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08f0
        L_0x0883:
            if (r11 == 0) goto L_0x08f0
            android.widget.TextView r0 = r7.C
            r1 = 2131561389(0x7f0d0bad, float:1.8748177E38)
            java.lang.String r1 = r7.getString(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r7.E
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r7.D
            com.douyin.share.e.a.d r1 = com.douyin.share.e.a.d.a(r18)
            int r2 = r11.getDiggCount()
            java.lang.String r2 = com.douyin.share.e.a.b.a(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.douyin.share.e.a.d r1 = r1.a(r2, r13, r12, r9)
            android.text.Spannable r1 = r1.a()
            r0.setText(r1)
            goto L_0x08f0
        L_0x08b6:
            int r0 = r7.x
            if (r0 != 0) goto L_0x08f0
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f64515b
            int r0 = r0.getAwemeCount()
            if (r0 == 0) goto L_0x08d4
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = r7.j
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r1.getShareInfo()
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getImageUrls()
            com.facebook.drawee.controller.ControllerListener<com.facebook.imagepipeline.image.ImageInfo> r2 = r7.A
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (com.ss.android.ugc.aweme.base.model.UrlModel) r1, (com.facebook.drawee.controller.ControllerListener<com.facebook.imagepipeline.image.ImageInfo>) r2)
            goto L_0x08e1
        L_0x08d4:
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r7.k
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getAvatarMedium()
            com.facebook.drawee.controller.ControllerListener<com.facebook.imagepipeline.image.ImageInfo> r2 = r7.A
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (com.ss.android.ugc.aweme.base.model.UrlModel) r1, (com.facebook.drawee.controller.ControllerListener<com.facebook.imagepipeline.image.ImageInfo>) r2)
        L_0x08e1:
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = r7.h
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f64515b
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r1.getShareInfo()
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getQrCodeUrls()
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
        L_0x08f0:
            java.lang.String r0 = "com.ss.android.ugc.aweme.share.ProfileShareActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.ProfileShareActivity.onCreate(android.os.Bundle):void");
    }

    private boolean d() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f64514a, false, 73200, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f64514a, false, 73200, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f64515b != null && this.f64515b.getVerificationType() == 2) {
            z2 = true;
        }
        return z2;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64514a, false, 73195, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64514a, false, 73195, new Class[0], Void.TYPE);
            return;
        }
        finish();
    }

    public final String c() {
        if (PatchProxy.isSupport(new Object[0], this, f64514a, false, 73184, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f64514a, false, 73184, new Class[0], String.class);
        }
        a.b(a(this.B));
        this.z = true;
        return a.a();
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f64514a, false, 73196, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64514a, false, 73196, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        a(0, 0);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f64514a, false, 73197, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64514a, false, 73197, new Class[0], Void.TYPE);
            return;
        }
        this.q.a(0.0f, true);
    }

    @NonNull
    public final IShareService.ShareStruct b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f64514a, false, 73183, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, f64514a, false, 73183, new Class[0], IShareService.ShareStruct.class);
        }
        String c2 = c();
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        if (this.f64515b.getShareInfo() == null) {
            return shareStruct;
        }
        Context context = this.f64518e;
        User user = this.f64515b;
        if (PatchProxy.isSupport(new Object[]{context, user, c2}, null, com.ss.android.ugc.aweme.feed.share.i.f46055a, true, 42112, new Class[]{Context.class, User.class, String.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{context, user, c2}, null, com.ss.android.ugc.aweme.feed.share.i.f46055a, true, 42112, new Class[]{Context.class, User.class, String.class}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct2 = new IShareService.ShareStruct();
        shareStruct2.identifier = user.getUid();
        if (context != null) {
            shareStruct2.appName = context.getString(C0906R.string.ak);
        } else {
            shareStruct2.appName = "抖音短视频";
        }
        shareStruct2.title = user.getShareInfo().getShareTitle();
        shareStruct2.description = user.getShareInfo().getShareDesc();
        shareStruct2.setThumbPath(c2);
        if (TextUtils.isEmpty(shareStruct2.getThumbPath())) {
            str = "";
        } else {
            str = shareStruct2.getThumbPath();
        }
        shareStruct2.thumbUrl = str;
        shareStruct2.url = com.ss.android.ugc.aweme.feed.share.i.a(user.getShareInfo().getShareUrl());
        if (!com.douyin.share.a.a.a.a.a(shareStruct2.url)) {
            shareStruct2.url = "http://" + shareStruct2.url;
        }
        shareStruct2.uid4Share = null;
        shareStruct2.shareText = null;
        shareStruct2.groupId = 0;
        shareStruct2.itemId = 0;
        shareStruct2.adId = 0;
        return shareStruct2;
    }

    private Bitmap a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f64514a, false, 73185, new Class[]{View.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{view2}, this, f64514a, false, 73185, new Class[]{View.class}, Bitmap.class);
        }
        view2.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null || drawingCache.getWidth() <= 0 || drawingCache.getHeight() <= 0) {
            return null;
        }
        return Bitmap.createBitmap(view.getDrawingCache());
    }

    private boolean a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f64514a, false, 73178, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f64514a, false, 73178, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || user.getShareInfo() == null) {
            return false;
        } else {
            return true;
        }
    }

    public void selectShareMode(View view) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f64514a, false, 73180, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64514a, false, 73180, new Class[]{View.class}, Void.TYPE);
        } else if (view.getId() == C0906R.id.cq2) {
            View view2 = this.v;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f64514a, false, 73190, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f64514a, false, 73190, new Class[]{View.class}, Void.TYPE);
            } else {
                int width = this.s.getWidth();
                if (this.f64516c == 0) {
                    if (this.f64517d != 1) {
                        objectAnimator2 = ObjectAnimator.ofFloat(view2, "translationX", new float[]{0.0f, (float) width});
                    }
                } else if (this.f64517d == 0) {
                    objectAnimator2 = ObjectAnimator.ofFloat(view2, "translationX", new float[]{(float) (-width), 0.0f});
                }
                objectAnimator2.setDuration(300);
                objectAnimator2.start();
            }
            this.p.setSelected(true);
            this.o.setSelected(false);
            this.f64517d = 1;
            cm.a(getApplication(), 1);
        } else {
            if (view.getId() == C0906R.id.cq5) {
                View view3 = this.v;
                if (PatchProxy.isSupport(new Object[]{view3}, this, f64514a, false, 73191, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view3}, this, f64514a, false, 73191, new Class[]{View.class}, Void.TYPE);
                } else {
                    int width2 = this.s.getWidth();
                    if (this.f64516c == 0) {
                        if (this.f64517d == 1) {
                            objectAnimator = ObjectAnimator.ofFloat(view3, "translationX", new float[]{(float) width2, 0.0f});
                        }
                    } else if (this.f64517d != 0) {
                        objectAnimator = ObjectAnimator.ofFloat(view3, "translationX", new float[]{0.0f, (float) (-width2)});
                    }
                    objectAnimator.setDuration(300);
                    objectAnimator.start();
                }
                this.p.setSelected(false);
                this.o.setSelected(true);
                this.f64517d = 0;
                cm.a(getApplication(), 0);
            }
        }
    }

    public final void a(com.douyin.baseshare.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f64514a, false, 73175, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f64514a, false, 73175, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.qrcode.f.a a2 = com.ss.android.ugc.aweme.qrcode.f.a.a(this.f64518e, this.f64518e.getResources().getString(C0906R.string.a8b));
        a2.a();
        com.ss.android.b.a.a.a.b(new bp(this, a2, aVar));
    }

    private void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), 0}, this, f64514a, false, 73177, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), 0}, this, f64514a, false, 73177, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.overridePendingTransition(i2, 0);
    }
}
