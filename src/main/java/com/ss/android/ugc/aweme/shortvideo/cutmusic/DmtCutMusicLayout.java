package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.d;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.f;
import com.ss.android.ugc.aweme.shortvideo.f;
import com.ss.android.ugc.aweme.tools.R$styleable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"J\u001a\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020&H\u0007R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/DmtCutMusicLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bubbleText", "", "bubbleTextView", "Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/DmtBubbleTextView;", "cutMusicScrollView", "Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/DmtCutMusicScrollView;", "waveColor", "init", "", "reset", "setAudioWaveViewData", "bean", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusicWaveBean;", "setBubbleText", "text", "setBubbleTextViewAttrite", "attrite", "Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/DmtBubbleTextView$BubbleTextViewAttribute;", "setScrollListener", "scrollListener", "Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/DmtCutMusicScrollView$ScrollListener;", "setTimeBubble", "startTime", "startScrollPosition", "position", "", "updateProgress", "progress", "isAddStartX", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DmtCutMusicLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66620a;

    /* renamed from: b  reason: collision with root package name */
    private DmtCutMusicScrollView f66621b;

    /* renamed from: c  reason: collision with root package name */
    private d f66622c;

    /* renamed from: d  reason: collision with root package name */
    private final int f66623d;

    /* renamed from: e  reason: collision with root package name */
    private String f66624e;

    @JvmOverloads
    public DmtCutMusicLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public DmtCutMusicLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f66620a, false, 76071, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66620a, false, 76071, new Class[0], Void.TYPE);
            return;
        }
        a(0.0f);
        setTimeBubble(0);
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f66621b;
        if (dmtCutMusicScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cutMusicScrollView");
        }
        dmtCutMusicScrollView.setScrollDx(0.0f);
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66620a, false, 76067, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66620a, false, 76067, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f66621b;
        if (dmtCutMusicScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cutMusicScrollView");
        }
        dmtCutMusicScrollView.a(f2);
    }

    public final void setAudioWaveViewData(@Nullable f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f66620a, false, 76066, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f66620a, false, 76066, new Class[]{f.class}, Void.TYPE);
            return;
        }
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f66621b;
        if (dmtCutMusicScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cutMusicScrollView");
        }
        dmtCutMusicScrollView.setAudioWaveViewData(fVar2);
    }

    public final void setBubbleText(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f66620a, false, 76065, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f66620a, false, 76065, new Class[]{String.class}, Void.TYPE);
            return;
        }
        d dVar = this.f66622c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bubbleTextView");
        }
        dVar.setText(str2);
    }

    public final void setBubbleTextViewAttrite(@NotNull d.a aVar) {
        d.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f66620a, false, 76064, new Class[]{d.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f66620a, false, 76064, new Class[]{d.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "attrite");
        d dVar = this.f66622c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bubbleTextView");
        }
        dVar.setAttribute(aVar2);
    }

    public final void setScrollListener(@NotNull DmtCutMusicScrollView.a aVar) {
        DmtCutMusicScrollView.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f66620a, false, 76063, new Class[]{DmtCutMusicScrollView.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f66620a, false, 76063, new Class[]{DmtCutMusicScrollView.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "scrollListener");
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f66621b;
        if (dmtCutMusicScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cutMusicScrollView");
        }
        dmtCutMusicScrollView.setScrollListener(aVar2);
    }

    public final void setTimeBubble(int i) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66620a, false, 76068, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66620a, false, 76068, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        String str2 = this.f66624e;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bubbleText");
        }
        Object[] objArr = new Object[1];
        f.b bVar = f.h;
        long j = (long) i;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, bVar, f.b.f66700a, false, 76124, new Class[]{Long.TYPE}, String.class)) {
            f.b bVar2 = bVar;
            str = (String) PatchProxy.accessDispatch(new Object[]{new Long(j)}, bVar2, f.b.f66700a, false, 76124, new Class[]{Long.TYPE}, String.class);
        } else {
            str = new SimpleDateFormat("mm:ss").format(new Date(j));
            Intrinsics.checkExpressionValueIsNotNull(str, "formatter.format(Date(time))");
        }
        objArr[0] = str;
        String format = String.format(str2, Arrays.copyOf(objArr, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        setBubbleText(format);
    }

    @JvmOverloads
    public final void a(float f2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f66620a, false, 76069, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Byte.valueOf(z)}, this, f66620a, false, 76069, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f66621b;
        if (dmtCutMusicScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cutMusicScrollView");
        }
        dmtCutMusicScrollView.a(f2, z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DmtCutMusicLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KTVView, i, 0);
        this.f66623d = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        if (PatchProxy.isSupport(new Object[]{context}, this, f66620a, false, 76062, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f66620a, false, 76062, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        setOrientation(1);
        this.f66621b = new DmtCutMusicScrollView(context, null, 0, 6);
        this.f66622c = new d(context, null, 2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = (int) UIUtils.dip2Px(context, 8.0f);
        layoutParams.leftMargin = (int) UIUtils.dip2Px(context, 8.0f);
        layoutParams.gravity = 3;
        d dVar = this.f66622c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bubbleTextView");
        }
        dVar.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f66621b;
        if (dmtCutMusicScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cutMusicScrollView");
        }
        dmtCutMusicScrollView.setLayoutParams(layoutParams2);
        d dVar2 = this.f66622c;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bubbleTextView");
        }
        addView(dVar2);
        DmtCutMusicScrollView dmtCutMusicScrollView2 = this.f66621b;
        if (dmtCutMusicScrollView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cutMusicScrollView");
        }
        addView(dmtCutMusicScrollView2);
        DmtCutMusicScrollView dmtCutMusicScrollView3 = this.f66621b;
        if (dmtCutMusicScrollView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cutMusicScrollView");
        }
        dmtCutMusicScrollView3.setWaveColor(this.f66623d);
        String string = getResources().getString(C0906R.string.a44);
        Intrinsics.checkExpressionValueIsNotNull(string, "resources.getString(R.string.cut_music_start_hint)");
        this.f66624e = string;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DmtCutMusicLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
