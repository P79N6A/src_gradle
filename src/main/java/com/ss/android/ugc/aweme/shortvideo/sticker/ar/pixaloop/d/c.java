package com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.support.v7.widget.ViewStubCompat;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.adapter.PixaloopMattingAdapter;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 32\u00020\u0001:\u00013B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0014\u0010\u001c\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eJ\u0006\u0010\u001f\u001a\u00020\u0019J\u0006\u0010 \u001a\u00020\u0019J\u0006\u0010!\u001a\u00020\u0019J\b\u0010\"\u001a\u00020\u000eH\u0002J\u0006\u0010#\u001a\u00020\u0019J\u0006\u0010$\u001a\u00020\u0019J\u0010\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010'J\u0010\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010*J\u0006\u0010+\u001a\u00020\u0019J\u001e\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020*J\u0006\u00102\u001a\u00020\u0019R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/ui/PixaloopMattingView;", "", "faceViewStub", "Landroid/support/v7/widget/ViewStubCompat;", "activity", "Landroid/app/Activity;", "listener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/listener/OnPixaloopSelectListener;", "(Landroid/support/v7/widget/ViewStubCompat;Landroid/app/Activity;Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/listener/OnPixaloopSelectListener;)V", "adapter", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/adapter/PixaloopMattingAdapter;", "contactDialog", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/ui/PixaloopLoadingDialog;", "isDismiss", "", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "rootView", "Landroid/view/View;", "scanImgCount", "", "getScanImgCount", "()I", "selectPhotoView", "addNewData", "", "data", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/data/PixaloopData;", "addNewDataList", "dataList", "", "clearData", "dismissContactDialog", "hideFaceMattingView", "isValidActivity", "onScanLoadEnd", "onScanLoadStart", "selectData", "path", "", "showContactDialog", "mainHandler", "Landroid/os/Handler;", "showFaceMattingView", "showGuideDialog", "faceStickerBean", "Lcom/ss/android/ugc/aweme/sticker/model/FaceStickerBean;", "onDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "handler", "unSelectData", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69427a = null;

    /* renamed from: f  reason: collision with root package name */
    public static final int f69428f = f69428f;
    public static final a g = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final PixaloopMattingAdapter f69429b;

    /* renamed from: c  reason: collision with root package name */
    public a f69430c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f69431d = true;

    /* renamed from: e  reason: collision with root package name */
    public final Activity f69432e;
    private final View h;
    private final RecyclerView i;
    private final View j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/ui/PixaloopMattingView$Companion;", "", "()V", "SHOW_DIALOG_DELAY_TIME", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69435a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f69436b;

        public b(c cVar) {
            this.f69436b = cVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f69435a, false, 78999, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69435a, false, 78999, new Class[0], Void.TYPE);
                return;
            }
            if (this.f69436b.f69432e != null && !this.f69436b.f69432e.isFinishing() && this.f69436b.f69431d) {
                try {
                    a aVar = this.f69436b.f69430c;
                    if (aVar == null) {
                        Intrinsics.throwNpe();
                    }
                    aVar.show();
                    this.f69436b.f69431d = false;
                } catch (Exception unused) {
                }
            }
        }
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f69427a, false, 78984, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f69427a, false, 78984, new Class[0], Integer.TYPE)).intValue();
        }
        PixaloopMattingAdapter pixaloopMattingAdapter = this.f69429b;
        if (pixaloopMattingAdapter == null) {
            Intrinsics.throwNpe();
        }
        return pixaloopMattingAdapter.a();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f69427a, false, 78985, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69427a, false, 78985, new Class[0], Void.TYPE);
            return;
        }
        this.h.setVisibility(0);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f69427a, false, 78986, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69427a, false, 78986, new Class[0], Void.TYPE);
            return;
        }
        this.h.setVisibility(8);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f69427a, false, 78987, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69427a, false, 78987, new Class[0], Void.TYPE);
            return;
        }
        PixaloopMattingAdapter pixaloopMattingAdapter = this.f69429b;
        if (pixaloopMattingAdapter == null) {
            Intrinsics.throwNpe();
        }
        pixaloopMattingAdapter.b();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f69427a, false, 78991, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69427a, false, 78991, new Class[0], Void.TYPE);
        } else if (this.f69429b != null) {
            this.f69429b.c();
            this.f69429b.notifyItemRemoved(this.f69429b.getItemCount());
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f69427a, false, 78992, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69427a, false, 78992, new Class[0], Void.TYPE);
        } else if (this.f69429b != null) {
            this.f69429b.d();
            this.f69429b.notifyDataSetChanged();
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f69427a, false, 78993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69427a, false, 78993, new Class[0], Void.TYPE);
            return;
        }
        PixaloopMattingAdapter pixaloopMattingAdapter = this.f69429b;
        if (pixaloopMattingAdapter == null) {
            Intrinsics.throwNpe();
        }
        pixaloopMattingAdapter.e();
        this.f69429b.notifyDataSetChanged();
    }

    public final boolean i() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f69427a, false, 78997, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f69427a, false, 78997, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f69432e != null && !this.f69432e.isFinishing()) {
            z = true;
        }
        return z;
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f69427a, false, 78996, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69427a, false, 78996, new Class[0], Void.TYPE);
            return;
        }
        this.f69431d = true;
        if (this.f69430c != null) {
            a aVar = this.f69430c;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            if (aVar.isShowing()) {
                a aVar2 = this.f69430c;
                if (aVar2 == null) {
                    Intrinsics.throwNpe();
                }
                aVar2.dismiss();
            }
        }
    }

    public final void a(@NotNull List<com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b> list) {
        List<com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f69427a, false, 78990, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f69427a, false, 78990, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "dataList");
        if (!j.a((Collection<T>) list2)) {
            PixaloopMattingAdapter pixaloopMattingAdapter = this.f69429b;
            if (pixaloopMattingAdapter == null) {
                Intrinsics.throwNpe();
            }
            pixaloopMattingAdapter.a(list2);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public c(@NotNull ViewStubCompat viewStubCompat, @Nullable Activity activity, @Nullable final com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.b bVar) {
        Intrinsics.checkParameterIsNotNull(viewStubCompat, "faceViewStub");
        this.f69432e = activity;
        View inflate = viewStubCompat.inflate();
        Intrinsics.checkExpressionValueIsNotNull(inflate, "faceViewStub.inflate()");
        this.h = inflate;
        View findViewById = this.h.findViewById(C0906R.id.b_c);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.layout_rv_face_matting)");
        this.i = (RecyclerView) findViewById;
        this.i.setLayoutManager(new LinearLayoutManager(this.i.getContext(), 0, false));
        View findViewById2 = this.h.findViewById(C0906R.id.b4v);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.iv_select)");
        this.j = findViewById2;
        this.j.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69433a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f69433a, false, 78998, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f69433a, false, 78998, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.b bVar = bVar;
                if (bVar != null) {
                    bVar.a();
                }
            }
        });
        Context context = viewStubCompat.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "faceViewStub.context");
        this.f69429b = new PixaloopMattingAdapter(context, bVar);
        this.i.setAdapter(this.f69429b);
        RecyclerView.ItemAnimator itemAnimator = this.i.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            this.h.setVisibility(8);
            if (i()) {
                Activity activity2 = this.f69432e;
                if (activity2 == null) {
                    Intrinsics.throwNpe();
                }
                this.f69430c = new a(activity2);
            }
            ImageView imageView = (ImageView) this.h.findViewById(C0906R.id.cn3);
            if (com.ss.android.g.a.b()) {
                imageView.setColorFilter(-535422941);
            } else {
                imageView.setColorFilter(-1);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d6, code lost:
        if (kotlin.text.StringsKt.contains$default(r4, (java.lang.CharSequence) java.lang.String.valueOf(r22.getStickerId()), false, 2, (java.lang.Object) null) == false) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r22, @org.jetbrains.annotations.NotNull android.content.DialogInterface.OnDismissListener r23, @org.jetbrains.annotations.NotNull android.os.Handler r24) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f69427a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.FaceStickerBean> r5 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.class
            r9[r11] = r5
            java.lang.Class<android.content.DialogInterface$OnDismissListener> r5 = android.content.DialogInterface.OnDismissListener.class
            r9[r12] = r5
            java.lang.Class<android.os.Handler> r5 = android.os.Handler.class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r7 = 0
            r8 = 78994(0x13492, float:1.10694E-40)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x005e
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = f69427a
            r17 = 0
            r18 = 78994(0x13492, float:1.10694E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.FaceStickerBean> r1 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.class
            r0[r11] = r1
            java.lang.Class<android.content.DialogInterface$OnDismissListener> r1 = android.content.DialogInterface.OnDismissListener.class
            r0[r12] = r1
            java.lang.Class<android.os.Handler> r1 = android.os.Handler.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r15 = r21
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x005e:
            java.lang.String r3 = "faceStickerBean"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            java.lang.String r3 = "onDismissListener"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r3)
            java.lang.String r3 = "handler"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b$a r3 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b.f69401e
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b.a.f69405a
            r7 = 0
            r8 = 78962(0x13472, float:1.1065E-40)
            java.lang.Class[] r9 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.FaceStickerBean> r5 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.class
            r9[r11] = r5
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x00a6
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b.a.f69405a
            r7 = 0
            r8 = 78962(0x13472, float:1.1065E-40)
            java.lang.Class[] r9 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.FaceStickerBean> r5 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.class
            r9[r11] = r5
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x00da
        L_0x00a6:
            if (r0 == 0) goto L_0x00d9
            boolean r3 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.f69353e
            if (r3 != 0) goto L_0x00ad
            goto L_0x00d9
        L_0x00ad:
            com.ss.android.ugc.aweme.port.in.ah r3 = com.ss.android.ugc.aweme.port.in.a.o
            java.lang.String r4 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b.f69400d
            java.lang.String r5 = ""
            java.lang.String r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x00c2
        L_0x00c0:
            r3 = 1
            goto L_0x00da
        L_0x00c2:
            java.lang.String r5 = "showSwitch"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)
            long r5 = r22.getStickerId()
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r5 = 0
            boolean r3 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r4, (java.lang.CharSequence) r3, (boolean) r11, (int) r13, (java.lang.Object) r5)
            if (r3 != 0) goto L_0x00d9
            goto L_0x00c0
        L_0x00d9:
            r3 = 0
        L_0x00da:
            if (r3 != 0) goto L_0x00dd
            return r11
        L_0x00dd:
            boolean r3 = r21.i()
            if (r3 != 0) goto L_0x00e4
            return r11
        L_0x00e4:
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.a r3 = new com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.a
            r3.<init>()
            java.util.List<java.lang.String> r13 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.f69350b
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r11] = r13
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.a.f69392a
            r7 = 0
            r8 = 78949(0x13465, float:1.10631E-40)
            java.lang.Class[] r9 = new java.lang.Class[r12]
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r9[r11] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x011b
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r11] = r13
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.a.f69392a
            r7 = 0
            r8 = 78949(0x13465, float:1.10631E-40)
            java.lang.Class[] r9 = new java.lang.Class[r12]
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r9[r11] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0122
        L_0x011b:
            java.lang.String r4 = "urlPrefixList"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r4)
            r3.f69396e = r13
        L_0x0122:
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.a.f69392a
            r7 = 0
            r8 = 78948(0x13464, float:1.1063E-40)
            java.lang.Class[] r9 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.FaceStickerBean> r5 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.class
            r9[r11] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0152
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.a.f69392a
            r7 = 0
            r8 = 78948(0x13464, float:1.1063E-40)
            java.lang.Class[] r9 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.FaceStickerBean> r5 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.class
            r9[r11] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x017a
        L_0x0152:
            java.lang.String r4 = "bean"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r4)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0179 }
            java.lang.String r5 = r22.getExtra()     // Catch:{ Exception -> 0x0179 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r5 = "pixaloop_text"
            java.lang.String r5 = r4.optString(r5)     // Catch:{ Exception -> 0x0179 }
            r3.f69395d = r5     // Catch:{ Exception -> 0x0179 }
            java.lang.String r5 = "pixaloop_picture_cover"
            java.lang.String r5 = r4.optString(r5)     // Catch:{ Exception -> 0x0179 }
            r3.f69393b = r5     // Catch:{ Exception -> 0x0179 }
            java.lang.String r5 = "pixaloop_video_cover"
            java.lang.String r4 = r4.optString(r5)     // Catch:{ Exception -> 0x0179 }
            r3.f69394c = r4     // Catch:{ Exception -> 0x0179 }
            goto L_0x017a
        L_0x0179:
        L_0x017a:
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b r4 = new com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b
            r5 = r21
            android.app.Activity r6 = r5.f69432e
            if (r6 != 0) goto L_0x0185
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0185:
            android.content.Context r6 = (android.content.Context) r6
            r4.<init>(r6, r0, r3)
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b.f69399a
            r16 = 0
            r17 = 78952(0x13468, float:1.10635E-40)
            java.lang.Class[] r0 = new java.lang.Class[r12]
            java.lang.Class<android.os.Handler> r3 = android.os.Handler.class
            r0[r11] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r4
            r18 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x01c0
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b.f69399a
            r16 = 0
            r17 = 78952(0x13468, float:1.10635E-40)
            java.lang.Class[] r0 = new java.lang.Class[r12]
            java.lang.Class<android.os.Handler> r2 = android.os.Handler.class
            r0[r11] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r4
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x01c7
        L_0x01c0:
            java.lang.String r0 = "mainHandler"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            r4.f69403c = r2
        L_0x01c7:
            r4.setOnDismissListener(r1)
            boolean r0 = r21.i()
            if (r0 == 0) goto L_0x01d4
            r4.show()     // Catch:{ Exception -> 0x01d4 }
            return r12
        L_0x01d4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.a(com.ss.android.ugc.aweme.sticker.model.FaceStickerBean, android.content.DialogInterface$OnDismissListener, android.os.Handler):boolean");
    }
}
