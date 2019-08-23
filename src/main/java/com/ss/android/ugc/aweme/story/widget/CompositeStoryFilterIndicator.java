package com.ss.android.ugc.aweme.story.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/story/widget/CompositeStoryFilterIndicator;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "masterIndicator", "Lcom/ss/android/ugc/aweme/story/widget/StoryFilterIndicator;", "secondaryIndicator", "setCurIndicator", "", "pre", "Lcom/ss/android/ugc/aweme/story/widget/FilterNameWithCategory;", "cur", "animRtl", "", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CompositeStoryFilterIndicator extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74455a;

    /* renamed from: b  reason: collision with root package name */
    private final b f74456b = new b(getContext());

    /* renamed from: c  reason: collision with root package name */
    private final b f74457c = new b(getContext());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositeStoryFilterIndicator(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setOrientation(1);
        addView(this.f74456b);
        addView(this.f74457c);
        this.f74457c.setScaleX(0.5f);
        this.f74457c.setScaleY(0.5f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositeStoryFilterIndicator(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        setOrientation(1);
        addView(this.f74456b);
        addView(this.f74457c);
        this.f74457c.setScaleX(0.5f);
        this.f74457c.setScaleY(0.5f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositeStoryFilterIndicator(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        setOrientation(1);
        addView(this.f74456b);
        addView(this.f74457c);
        this.f74457c.setScaleX(0.5f);
        this.f74457c.setScaleY(0.5f);
    }

    public final void a(@NotNull a aVar, @NotNull a aVar2, boolean z) {
        a aVar3 = aVar;
        a aVar4 = aVar2;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{aVar3, aVar4, Byte.valueOf(z ? (byte) 1 : 0)}, this, f74455a, false, 86597, new Class[]{a.class, a.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar3, aVar4, Byte.valueOf(z)}, this, f74455a, false, 86597, new Class[]{a.class, a.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar3, "pre");
        Intrinsics.checkParameterIsNotNull(aVar4, "cur");
        this.f74456b.a(aVar3.f74475b, aVar4.f74475b, z2);
        this.f74457c.a(aVar3.f74476c, aVar4.f74476c, z2);
        setVisibility(0);
    }
}
