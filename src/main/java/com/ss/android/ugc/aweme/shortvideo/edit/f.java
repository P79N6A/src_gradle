package com.ss.android.ugc.aweme.shortvideo.edit;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\tH\u0016J\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\u000eJ\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\b\b\u0001\u0010\u0016\u001a\u00020\tJ\u0010\u0010\u0017\u001a\u00020\u00102\b\b\u0001\u0010\u0018\u001a\u00020\tJ\u0010\u0010\u0019\u001a\u00020\u00102\b\b\u0001\u0010\u0016\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolBarItem;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mToolIv", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mToolTv", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "baseInit", "", "getLayoutId", "getToolIv", "getToolTv", "onLayoutInflated", "setContentDescription", "stringRes", "setIcon", "iconRes", "setText", "text", "", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class f extends LinearLayout {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f67170c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f67171d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private DmtTextView f67172a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f67173b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bJ$\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolBarItem$Companion;", "", "()V", "buildMusicToolItemView", "Lcom/ss/android/ugc/aweme/shortvideo/edit/EditMusicToolBarItem;", "context", "Landroid/content/Context;", "stringRes", "", "iconRes", "buildToolItemView", "Lcom/ss/android/ugc/aweme/shortvideo/edit/EditToolBarItem;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67174a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final f a(@NotNull Context context, @StringRes int i, @DrawableRes int i2) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f67174a, false, 76237, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, f.class)) {
                return (f) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f67174a, false, 76237, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, f.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            f fVar = new f(context2);
            fVar.setText(i);
            fVar.setIcon(i2);
            return fVar;
        }

        @NotNull
        public final d b(@NotNull Context context, @StringRes int i, @DrawableRes int i2) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f67174a, false, 76238, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, d.class)) {
                return (d) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f67174a, false, 76238, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, d.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            d dVar = new d(context2);
            dVar.setText(i);
            dVar.setIcon(i2);
            return dVar;
        }
    }

    public void a() {
    }

    public int getLayoutId() {
        return C0906R.layout.aqd;
    }

    @NotNull
    public final RemoteImageView getToolIv() {
        if (PatchProxy.isSupport(new Object[0], this, f67170c, false, 76228, new Class[0], RemoteImageView.class)) {
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, f67170c, false, 76228, new Class[0], RemoteImageView.class);
        }
        RemoteImageView remoteImageView = this.f67173b;
        if (remoteImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mToolIv");
        }
        return remoteImageView;
    }

    @NotNull
    public final DmtTextView getToolTv() {
        if (PatchProxy.isSupport(new Object[0], this, f67170c, false, 76229, new Class[0], DmtTextView.class)) {
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, f67170c, false, 76229, new Class[0], DmtTextView.class);
        }
        DmtTextView dmtTextView = this.f67172a;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mToolTv");
        }
        return dmtTextView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (PatchProxy.isSupport(new Object[0], this, f67170c, false, 76227, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67170c, false, 76227, new Class[0], Void.TYPE);
            return;
        }
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(getLayoutId(), this);
            View findViewById = findViewById(C0906R.id.p8);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "this.findViewById(R.id.btn_tool_tv)");
            this.f67172a = (DmtTextView) findViewById;
            View findViewById2 = findViewById(C0906R.id.p6);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "this.findViewById(R.id.btn_tool_iv)");
            this.f67173b = (RemoteImageView) findViewById2;
            a();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final void setContentDescription(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f67170c, false, 76233, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f67170c, false, 76233, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        DmtTextView dmtTextView = this.f67172a;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mToolTv");
        }
        dmtTextView.setContentDescription(getContext().getString(i));
    }

    public final void setIcon(@DrawableRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f67170c, false, 76230, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f67170c, false, 76230, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        RemoteImageView remoteImageView = this.f67173b;
        if (remoteImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mToolIv");
        }
        remoteImageView.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), i));
    }

    public final void setText(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f67170c, false, 76231, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f67170c, false, 76231, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        DmtTextView dmtTextView = this.f67172a;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mToolTv");
        }
        dmtTextView.setText(getContext().getString(i));
    }

    public final void setText(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f67170c, false, 76232, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f67170c, false, 76232, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "text");
        DmtTextView dmtTextView = this.f67172a;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mToolTv");
        }
        dmtTextView.setText(str2);
    }
}
