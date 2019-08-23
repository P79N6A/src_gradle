package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.input.p;
import com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent;
import com.ss.android.ugc.aweme.im.sdk.widget.DragView;
import com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView;

public class PhotoDetailActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50744a;

    /* renamed from: b  reason: collision with root package name */
    public View f50745b;

    /* renamed from: c  reason: collision with root package name */
    public View f50746c;

    /* renamed from: d  reason: collision with root package name */
    public DragView f50747d;

    /* renamed from: e  reason: collision with root package name */
    public View f50748e;

    /* renamed from: f  reason: collision with root package name */
    public PhotoDraweeView f50749f;
    public int g;
    n h;
    public boolean i;
    UrlModel j;
    OnlyPictureContent k;
    StoryPictureContent l;
    public boolean m;
    public ViewGroup.MarginLayoutParams n;
    private DragView.b o;
    private p p;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f50744a, false, 50979, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50744a, false, 50979, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50744a, false, 50980, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50744a, false, 50980, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f50744a, false, 50976, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50744a, false, 50976, new Class[0], Void.TYPE);
            return;
        }
        a();
        if (this.f50747d != null) {
            this.f50747d.a();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f50744a, false, 50977, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50744a, false, 50977, new Class[0], Void.TYPE);
            return;
        }
        k.a().a(this, new f(this));
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f50744a, false, 50968, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50744a, false, 50968, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f50744a, false, 50969, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50744a, false, 50969, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50744a, false, 50975, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50744a, false, 50975, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f50749f.getLayoutParams();
            marginLayoutParams.leftMargin = this.n.leftMargin;
            marginLayoutParams.topMargin = this.n.topMargin;
            marginLayoutParams.height = this.n.height;
            marginLayoutParams.width = this.n.width;
            this.f50749f.setLayoutParams(marginLayoutParams);
            this.f50749f.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f50744a, false, 50967, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f50744a, false, 50967, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("drag_view_info", this.o);
        bundle.putSerializable("photo_message", this.h);
        bundle.putSerializable("photo_param", this.j);
        bundle.putInt("photo_show_type", this.g);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f50744a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 50965(0xc715, float:7.1417E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f50744a
            r3 = 0
            r4 = 50965(0xc715, float:7.1417E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            java.lang.String r0 = "com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            r7.overridePendingTransition(r10, r10)
            super.onCreate(r21)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f50744a
            r3 = 0
            r4 = 50966(0xc716, float:7.1419E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r11 = 19
            if (r0 == 0) goto L_0x006d
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f50744a
            r3 = 0
            r4 = 50966(0xc716, float:7.1419E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x007a
        L_0x006d:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r11) goto L_0x007a
            android.view.Window r0 = r20.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
        L_0x007a:
            r0 = 2131689571(0x7f0f0063, float:1.9008161E38)
            r7.setContentView((int) r0)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f50744a
            r3 = 0
            r4 = 50970(0xc71a, float:7.1424E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r12 = 2
            if (r0 == 0) goto L_0x00b4
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f50744a
            r3 = 0
            r4 = 50970(0xc71a, float:7.1424E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0222
        L_0x00b4:
            r7.m = r9
            if (r8 == 0) goto L_0x00e0
            java.lang.String r0 = "photo_param"
            java.io.Serializable r0 = r8.getSerializable(r0)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = (com.ss.android.ugc.aweme.base.model.UrlModel) r0
            r7.j = r0
            java.lang.String r0 = "photo_message"
            java.io.Serializable r0 = r8.getSerializable(r0)
            com.bytedance.im.core.d.n r0 = (com.bytedance.im.core.d.n) r0
            r7.h = r0
            java.lang.String r0 = "photo_show_type"
            int r0 = r8.getInt(r0, r10)
            r7.g = r0
            java.lang.String r0 = "drag_view_info"
            android.os.Parcelable r0 = r8.getParcelable(r0)
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$b r0 = (com.ss.android.ugc.aweme.im.sdk.widget.DragView.b) r0
            r7.o = r0
            goto L_0x0222
        L_0x00e0:
            android.content.Intent r0 = r20.getIntent()
            java.lang.String r1 = "photo_message"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            com.bytedance.im.core.d.n r0 = (com.bytedance.im.core.d.n) r0
            r7.h = r0
            android.content.Intent r0 = r20.getIntent()
            java.lang.String r1 = "photo_show_type"
            int r0 = r0.getIntExtra(r1, r10)
            r7.g = r0
            android.content.Intent r0 = r20.getIntent()
            java.lang.String r1 = "drag_view_info"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$b r0 = (com.ss.android.ugc.aweme.im.sdk.widget.DragView.b) r0
            r7.o = r0
            com.bytedance.im.core.d.n r0 = r7.h
            int r0 = r0.getMsgType()
            r1 = 27
            if (r0 != r1) goto L_0x018e
            com.bytedance.im.core.d.n r0 = r7.h
            java.lang.String r0 = r0.getContent()
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent> r1 = com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.im.sdk.utils.l.a(r0, r1)
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent r0 = (com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent) r0
            r7.l = r0
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent r0 = r7.l
            if (r0 == 0) goto L_0x0222
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent r0 = r7.l
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getUrl()
            r7.j = r0
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.j
            if (r0 == 0) goto L_0x0156
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.j
            java.lang.String r0 = r0.getUri()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0156
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.j
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent r1 = r7.l
            int r1 = r1.getWidth()
            r0.setWidth(r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.j
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent r1 = r7.l
            int r1 = r1.getHeight()
            r0.setHeight(r1)
            goto L_0x0222
        L_0x0156:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r0.<init>()
            r7.j = r0
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "file://"
            r1.<init>(r2)
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent r2 = r7.l
            java.lang.String r2 = r2.getPicturePath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setUri(r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.j
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent r1 = r7.l
            int r1 = r1.getWidth()
            r0.setWidth(r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.j
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent r1 = r7.l
            int r1 = r1.getHeight()
            r0.setHeight(r1)
            goto L_0x0222
        L_0x018e:
            com.bytedance.im.core.d.n r0 = r7.h
            int r0 = r0.getMsgType()
            if (r0 != r12) goto L_0x0222
            com.bytedance.im.core.d.n r0 = r7.h
            java.lang.String r0 = r0.getContent()
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent> r1 = com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.im.sdk.utils.l.a(r0, r1)
            com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent r0 = (com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent) r0
            r7.k = r0
            com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent r0 = r7.k
            if (r0 == 0) goto L_0x0222
            com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent r0 = r7.k
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getUrl()
            r7.j = r0
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.j
            if (r0 == 0) goto L_0x01d9
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.j
            java.util.List r0 = r0.getUrlList()
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01d9
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.j
            com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent r1 = r7.k
            int r1 = r1.getWidth()
            r0.setWidth(r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.j
            com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent r1 = r7.k
            int r1 = r1.getHeight()
            r0.setHeight(r1)
            goto L_0x0222
        L_0x01d9:
            com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent r0 = r7.k
            java.lang.String r0 = r0.getPicturePath()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0222
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r0.<init>()
            r7.j = r0
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "file://"
            r1.<init>(r2)
            com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent r2 = r7.k
            java.lang.String r2 = r2.getPicturePath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setUri(r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.j
            com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent r1 = r7.k
            int r1 = r1.getWidth()
            r0.setWidth(r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.j
            com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent r1 = r7.k
            int r1 = r1.getHeight()
            r0.setHeight(r1)
            com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent r0 = r7.k
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r7.j
            r0.setUrl(r1)
        L_0x0222:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f50744a
            r3 = 0
            r4 = 50971(0xc71b, float:7.1426E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r8 = 3
            if (r0 == 0) goto L_0x024a
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f50744a
            r3 = 0
            r4 = 50971(0xc71b, float:7.1426E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0366
        L_0x024a:
            r0 = 2131167904(0x7f070aa0, float:1.7950095E38)
            android.view.View r0 = r7.findViewById(r0)
            com.ss.android.ugc.aweme.im.sdk.widget.DragView r0 = (com.ss.android.ugc.aweme.im.sdk.widget.DragView) r0
            r7.f50747d = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r11) goto L_0x025e
            com.ss.android.ugc.aweme.im.sdk.widget.DragView r0 = r7.f50747d
            r0.setFullScreenWindow(r9)
        L_0x025e:
            r0 = 2131169615(0x7f07114f, float:1.7953565E38)
            android.view.View r0 = r7.findViewById(r0)
            r7.f50746c = r0
            r0 = 2131169665(0x7f071181, float:1.7953666E38)
            android.view.View r0 = r7.findViewById(r0)
            r7.f50745b = r0
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r20)
            r1 = 2131690412(0x7f0f03ac, float:1.9009867E38)
            com.ss.android.ugc.aweme.im.sdk.widget.DragView r2 = r7.f50747d
            android.view.View r0 = r0.inflate(r1, r2, r10)
            r7.f50748e = r0
            android.view.View r0 = r7.f50748e
            r1 = 2131167689(0x7f0709c9, float:1.7949659E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView r0 = (com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView) r0
            r7.f50749f = r0
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$b r0 = r7.o
            if (r0 == 0) goto L_0x029b
            com.ss.android.ugc.aweme.im.sdk.widget.DragView r0 = r7.f50747d
            android.view.View r1 = r7.f50748e
            com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView r2 = r7.f50749f
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$b r3 = r7.o
            r0.a(r1, r2, r3)
        L_0x029b:
            com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView r0 = r7.f50749f
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r7.j
            java.lang.Object[] r13 = new java.lang.Object[r8]
            r13[r10] = r1
            r2 = 0
            r13[r9] = r2
            r13[r12] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView.f52811a
            r16 = 0
            r17 = 54185(0xd3a9, float:7.593E-41)
            java.lang.Class[] r3 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r4 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            r3[r10] = r4
            java.lang.Class<com.facebook.imagepipeline.common.ResizeOptions> r4 = com.facebook.imagepipeline.common.ResizeOptions.class
            r3[r9] = r4
            java.lang.Class<com.facebook.drawee.controller.ControllerListener> r4 = com.facebook.drawee.controller.ControllerListener.class
            r3[r12] = r4
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x02ef
            java.lang.Object[] r13 = new java.lang.Object[r8]
            r13[r10] = r1
            r13[r9] = r2
            r13[r12] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView.f52811a
            r16 = 0
            r17 = 54185(0xd3a9, float:7.593E-41)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r2 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            r1[r10] = r2
            java.lang.Class<com.facebook.imagepipeline.common.ResizeOptions> r2 = com.facebook.imagepipeline.common.ResizeOptions.class
            r1[r9] = r2
            java.lang.Class<com.facebook.drawee.controller.ControllerListener> r2 = com.facebook.drawee.controller.ControllerListener.class
            r1[r12] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0366
        L_0x02ef:
            com.facebook.imagepipeline.request.ImageRequest[] r1 = com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.model.UrlModel) r1, (com.facebook.imagepipeline.common.ResizeOptions) r2, (com.facebook.imagepipeline.request.Postprocessor) r2)
            if (r1 == 0) goto L_0x0366
            int r3 = r1.length
            if (r3 != 0) goto L_0x02f9
            goto L_0x0366
        L_0x02f9:
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r3 = com.facebook.drawee.backends.pipeline.Fresco.newDraweeControllerBuilder()
            com.facebook.drawee.view.DraweeHolder<com.facebook.drawee.generic.GenericDraweeHierarchy> r4 = r0.f52812b
            com.facebook.drawee.interfaces.DraweeController r4 = r4.getController()
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r3 = r3.setOldController((com.facebook.drawee.interfaces.DraweeController) r4)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r3 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r3
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r3 = r3.setFirstAvailableImageRequests(r1)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r3 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r3
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r10] = r1
            r13[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView.f52811a
            r16 = 0
            r17 = 54186(0xd3aa, float:7.5931E-41)
            java.lang.Class[] r4 = new java.lang.Class[r12]
            java.lang.Class<com.facebook.imagepipeline.request.ImageRequest[]> r5 = com.facebook.imagepipeline.request.ImageRequest[].class
            r4[r10] = r5
            java.lang.Class<com.facebook.drawee.controller.ControllerListener> r5 = com.facebook.drawee.controller.ControllerListener.class
            r4[r9] = r5
            java.lang.Class<com.facebook.drawee.controller.ControllerListener> r19 = com.facebook.drawee.controller.ControllerListener.class
            r14 = r0
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x0354
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r10] = r1
            r13[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView.f52811a
            r16 = 0
            r17 = 54186(0xd3aa, float:7.5931E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class<com.facebook.imagepipeline.request.ImageRequest[]> r2 = com.facebook.imagepipeline.request.ImageRequest[].class
            r1[r10] = r2
            java.lang.Class<com.facebook.drawee.controller.ControllerListener> r2 = com.facebook.drawee.controller.ControllerListener.class
            r1[r9] = r2
            java.lang.Class<com.facebook.drawee.controller.ControllerListener> r19 = com.facebook.drawee.controller.ControllerListener.class
            r14 = r0
            r18 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            com.facebook.drawee.controller.ControllerListener r1 = (com.facebook.drawee.controller.ControllerListener) r1
            goto L_0x035a
        L_0x0354:
            com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView$1 r4 = new com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView$1
            r4.<init>(r1, r2)
            r1 = r4
        L_0x035a:
            r3.setControllerListener(r1)
            com.facebook.drawee.controller.AbstractDraweeController r1 = r3.build()
            com.facebook.drawee.view.DraweeHolder<com.facebook.drawee.generic.GenericDraweeHierarchy> r0 = r0.f52812b
            r0.setController(r1)
        L_0x0366:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f50744a
            r3 = 0
            r4 = 50973(0xc71d, float:7.1428E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x038c
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f50744a
            r3 = 0
            r4 = 50973(0xc71d, float:7.1428E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03f3
        L_0x038c:
            com.ss.android.ugc.aweme.im.sdk.chat.input.p r0 = r7.p
            if (r0 != 0) goto L_0x0397
            com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity$2 r0 = new com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity$2
            r0.<init>()
            r7.p = r0
        L_0x0397:
            com.ss.android.ugc.aweme.im.sdk.chat.input.p r0 = r7.p
            android.view.View[] r1 = new android.view.View[r8]
            android.view.View r2 = r7.f50746c
            r1[r10] = r2
            android.view.View r2 = r7.f50748e
            r1[r9] = r2
            android.view.View r2 = r7.f50745b
            r1[r12] = r2
            com.ss.android.ugc.aweme.im.sdk.chat.input.p.a((android.view.View.OnClickListener) r0, (android.view.View[]) r1)
            com.ss.android.ugc.aweme.im.sdk.chat.input.p r0 = r7.p
            android.view.View[] r1 = new android.view.View[r12]
            android.view.View r2 = r7.f50746c
            r1[r10] = r2
            com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView r2 = r7.f50749f
            r1[r9] = r2
            com.ss.android.ugc.aweme.im.sdk.chat.input.p.a((android.view.View.OnLongClickListener) r0, (android.view.View[]) r1)
            com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView r0 = r7.f50749f
            com.ss.android.ugc.aweme.im.sdk.chat.input.photo.e r1 = new com.ss.android.ugc.aweme.im.sdk.chat.input.photo.e
            r1.<init>(r7)
            r0.setOnPhotoTapListener(r1)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f50744a
            r3 = 0
            r4 = 50974(0xc71e, float:7.143E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03e9
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f50744a
            r3 = 0
            r4 = 50974(0xc71e, float:7.143E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03f3
        L_0x03e9:
            com.ss.android.ugc.aweme.im.sdk.widget.DragView r0 = r7.f50747d
            com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity$3 r1 = new com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity$3
            r1.<init>()
            r0.setDragStateListener(r1)
        L_0x03f3:
            java.lang.String r0 = "com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity.onCreate(android.os.Bundle):void");
    }

    public static void a(Context context, n nVar, int i2, DragView.b bVar) {
        Context context2 = context;
        n nVar2 = nVar;
        DragView.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{context2, nVar2, Integer.valueOf(i2), bVar2}, null, f50744a, true, 50964, new Class[]{Context.class, n.class, Integer.TYPE, DragView.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, nVar2, Integer.valueOf(i2), bVar2}, null, f50744a, true, 50964, new Class[]{Context.class, n.class, Integer.TYPE, DragView.b.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, PhotoDetailActivity.class);
        intent.putExtra("drag_view_info", bVar2);
        intent.putExtra("photo_message", nVar2);
        intent.putExtra("photo_show_type", i2);
        context2.startActivity(intent);
    }
}
