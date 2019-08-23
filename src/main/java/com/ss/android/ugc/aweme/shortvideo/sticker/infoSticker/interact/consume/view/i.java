package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.i18n.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0005R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteTabView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "leftOption", "", "(Landroid/content/Context;Z)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tvCount", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "tvOption", "initView", "", "setOption", "option", "", "count", "", "setSelect", "select", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70063a;

    /* renamed from: b  reason: collision with root package name */
    private DmtTextView f70064b;

    /* renamed from: c  reason: collision with root package name */
    private DmtTextView f70065c;

    public final void setSelect(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f70063a, false, 79736, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f70063a, false, 79736, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            DmtTextView dmtTextView = this.f70064b;
            if (dmtTextView != null) {
                dmtTextView.setTextColor(getResources().getColor(C0906R.color.h));
            }
            DmtTextView dmtTextView2 = this.f70065c;
            if (dmtTextView2 != null) {
                dmtTextView2.setTextColor(getResources().getColor(C0906R.color.h));
            }
        } else {
            DmtTextView dmtTextView3 = this.f70064b;
            if (dmtTextView3 != null) {
                dmtTextView3.setTextColor(getResources().getColor(C0906R.color.j));
            }
            DmtTextView dmtTextView4 = this.f70065c;
            if (dmtTextView4 != null) {
                dmtTextView4.setTextColor(getResources().getColor(C0906R.color.j));
            }
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void a(@NotNull String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f70063a, false, 79737, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f70063a, false, 79737, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "option");
        DmtTextView dmtTextView = this.f70065c;
        if (dmtTextView != null) {
            dmtTextView.setText(str2);
        }
        DmtTextView dmtTextView2 = this.f70064b;
        if (dmtTextView2 != null) {
            dmtTextView2.setText(b.a(j));
        }
    }

    public i(@Nullable Context context, boolean z) {
        super(context);
        View view;
        DmtTextView dmtTextView;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f70063a, false, 79735, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f70063a, false, 79735, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            view = LayoutInflater.from(getContext()).inflate(C0906R.layout.asj, this, false);
        } else {
            view = LayoutInflater.from(getContext()).inflate(C0906R.layout.asl, this, false);
        }
        DmtTextView dmtTextView2 = null;
        if (view != null) {
            dmtTextView = (DmtTextView) view.findViewById(C0906R.id.daa);
        } else {
            dmtTextView = null;
        }
        this.f70064b = dmtTextView;
        this.f70065c = view != null ? (DmtTextView) view.findViewById(C0906R.id.dfs) : dmtTextView2;
        addView(view);
    }
}
