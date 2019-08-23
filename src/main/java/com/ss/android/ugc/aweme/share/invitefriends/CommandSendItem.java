package com.ss.android.ugc.aweme.share.invitefriends;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0007R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/share/invitefriends/CommandSendItem;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleRes", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mContentTv", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "mIconIv", "Landroid/widget/ImageView;", "mRootView", "Landroid/view/View;", "getContentView", "Landroid/widget/TextView;", "getImageView", "setIcon", "", "resId", "setIconVisibility", "visibility", "setText", "text", "", "setTextVisibility", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CommandSendItem extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65025a;

    /* renamed from: b  reason: collision with root package name */
    private final View f65026b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageView f65027c;

    /* renamed from: d  reason: collision with root package name */
    private final DmtTextView f65028d;

    @JvmOverloads
    public CommandSendItem(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public CommandSendItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @NotNull
    public final TextView getContentView() {
        if (PatchProxy.isSupport(new Object[0], this, f65025a, false, 73482, new Class[0], TextView.class)) {
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, f65025a, false, 73482, new Class[0], TextView.class);
        }
        DmtTextView dmtTextView = this.f65028d;
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "mContentTv");
        return dmtTextView;
    }

    @NotNull
    public final ImageView getImageView() {
        if (PatchProxy.isSupport(new Object[0], this, f65025a, false, 73481, new Class[0], ImageView.class)) {
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, f65025a, false, 73481, new Class[0], ImageView.class);
        }
        ImageView imageView = this.f65027c;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mIconIv");
        return imageView;
    }

    public final void setIcon(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65025a, false, 73476, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65025a, false, 73476, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65027c.setImageResource(i);
    }

    public final void setIconVisibility(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65025a, false, 73477, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65025a, false, 73477, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ImageView imageView = this.f65027c;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mIconIv");
        imageView.setVisibility(i);
    }

    public final void setText(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65025a, false, 73478, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65025a, false, 73478, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65028d.setText(i);
    }

    public final void setTextVisibility(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65025a, false, 73480, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65025a, false, 73480, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        DmtTextView dmtTextView = this.f65028d;
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "mContentTv");
        dmtTextView.setVisibility(i);
    }

    public final void setText(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f65025a, false, 73479, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f65025a, false, 73479, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "text");
        DmtTextView dmtTextView = this.f65028d;
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "mContentTv");
        dmtTextView.setText(str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CommandSendItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.w1, this, true);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…command_send, this, true)");
        this.f65026b = inflate;
        this.f65027c = (ImageView) this.f65026b.findViewById(C0906R.id.aq8);
        this.f65028d = (DmtTextView) this.f65026b.findViewById(C0906R.id.text);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommandSendItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
