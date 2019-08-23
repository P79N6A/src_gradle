package com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/ui/PixaloopLoadingDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "hintTextView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "loadingLayout", "Lcom/bytedance/ies/dmt/ui/widget/DmtLoadingLayout;", "recordView", "Landroid/view/View;", "dismiss", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setTitleText", "text", "", "show", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69420a;

    /* renamed from: b  reason: collision with root package name */
    private DmtLoadingLayout f69421b;

    /* renamed from: c  reason: collision with root package name */
    private DmtTextView f69422c;

    /* renamed from: d  reason: collision with root package name */
    private View f69423d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.a$a  reason: collision with other inner class name */
    static final class C0730a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69424a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f69425b;

        C0730a(a aVar) {
            this.f69425b = aVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f69424a, false, 78983, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f69424a, false, 78983, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.bytedance.ies.dmt.ui.d.a.a(this.f69425b.getContext(), (int) C0906R.string.bmw).a();
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f69420a, false, 78981, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69420a, false, 78981, new Class[0], Void.TYPE);
            return;
        }
        b.a(this);
        if (this.f69421b != null) {
            DmtLoadingLayout dmtLoadingLayout = this.f69421b;
            if (dmtLoadingLayout == null) {
                Intrinsics.throwNpe();
            }
            dmtLoadingLayout.setVisibility(8);
        }
    }

    public final void show() {
        if (PatchProxy.isSupport(new Object[0], this, f69420a, false, 78980, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69420a, false, 78980, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        if (this.f69421b != null) {
            DmtLoadingLayout dmtLoadingLayout = this.f69421b;
            if (dmtLoadingLayout == null) {
                Intrinsics.throwNpe();
            }
            dmtLoadingLayout.setVisibility(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        super(context, C0906R.style.gc);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f69420a, false, 78978, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f69420a, false, 78978, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.a8t);
        this.f69421b = (DmtLoadingLayout) findViewById(C0906R.id.bjl);
        this.f69422c = (DmtTextView) findViewById(C0906R.id.zd);
        this.f69423d = findViewById(C0906R.id.cc1);
        Window window = getWindow();
        if (window == null) {
            Intrinsics.throwNpe();
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        Window window2 = getWindow();
        if (window2 == null) {
            Intrinsics.throwNpe();
        }
        window2.setAttributes(attributes);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
        Paint paint = shapeDrawable.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "drawable.paint");
        paint.setColor(0);
        Window window3 = getWindow();
        if (window3 == null) {
            Intrinsics.throwNpe();
        }
        window3.setBackgroundDrawable(shapeDrawable);
        setCanceledOnTouchOutside(false);
        View view = this.f69423d;
        if (view == null) {
            Intrinsics.throwNpe();
        }
        view.setOnClickListener(new C0730a(this));
    }
}
