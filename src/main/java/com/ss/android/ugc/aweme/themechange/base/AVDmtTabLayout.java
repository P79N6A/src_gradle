package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0006\u0010\u0010\u001a\u00020\u000eJ\u001c\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u001a\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/themechange/base/AVDmtTabLayout;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/widget/tablayout/TabLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "selectColor", "tabSelectedListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/widget/tablayout/TabLayout$OnTabSelectedListener;", "unSelectColor", "addOnTabSelectedListener", "", "listener", "configForEffectEditPage", "configTabItemWidthMode", "count", "nameList", "", "", "init", "setMaxTabModeForCount", "Companion", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AVDmtTabLayout extends TabLayout {
    public static ChangeQuickRedirect u;
    public static final a w = new a((byte) 0);
    public TabLayout.b v;
    private int x;
    private int y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/themechange/base/AVDmtTabLayout$Companion;", "", "()V", "ITEM_MARGIN", "", "ITEM_MARGIN_EFFECT_EDIT", "ITEM_TEXT_SIZE", "", "MAX_TAB_COUNT_MIX_MODE", "createTabItemView", "Lcom/ss/android/ugc/aweme/themechange/base/AVDmtTabItemView;", "context", "Landroid/content/Context;", "isOldPanel", "", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74570a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @NotNull
        public final a a(@Nullable Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f74570a, false, 86826, new Class[]{Context.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{context2}, this, f74570a, false, 86826, new Class[]{Context.class}, a.class);
            }
            if (context2 == null) {
                Intrinsics.throwNpe();
            }
            return new a(context2, false);
        }

        @NotNull
        public final a a(@Nullable Context context, boolean z) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f74570a, false, 86827, new Class[]{Context.class, Boolean.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z)}, this, f74570a, false, 86827, new Class[]{Context.class, Boolean.TYPE}, a.class);
            }
            if (context2 == null) {
                Intrinsics.throwNpe();
            }
            return new a(context2, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/themechange/base/AVDmtTabLayout$init$1", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/widget/tablayout/TabLayout$OnTabSelectedListener;", "onTabReselected", "", "tab", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/widget/tablayout/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements TabLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74571a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AVDmtTabLayout f74572b;

        b(AVDmtTabLayout aVDmtTabLayout) {
            this.f74572b = aVDmtTabLayout;
        }

        public final void a(@NotNull TabLayout.e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f74571a, false, 86828, new Class[]{TabLayout.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f74571a, false, 86828, new Class[]{TabLayout.e.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(eVar, "tab");
            if (this.f74572b.v != null) {
                TabLayout.b bVar = this.f74572b.v;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                bVar.a(eVar);
            }
        }

        public final void b(@NotNull TabLayout.e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f74571a, false, 86829, new Class[]{TabLayout.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f74571a, false, 86829, new Class[]{TabLayout.e.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(eVar, "tab");
            if (this.f74572b.v != null) {
                TabLayout.b bVar = this.f74572b.v;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                bVar.b(eVar);
            }
        }

        public final void c(@NotNull TabLayout.e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f74571a, false, 86830, new Class[]{TabLayout.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f74571a, false, 86830, new Class[]{TabLayout.e.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(eVar, "tab");
            if (this.f74572b.v != null) {
                TabLayout.b bVar = this.f74572b.v;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                bVar.c(eVar);
            }
        }
    }

    @JvmOverloads
    public AVDmtTabLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public AVDmtTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a(@NotNull TabLayout.b bVar) {
        TabLayout.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, u, false, 86820, new Class[]{TabLayout.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, u, false, 86820, new Class[]{TabLayout.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "listener");
        this.v = bVar2;
    }

    public final void setMaxTabModeForCount(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, u, false, 86821, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, u, false, 86821, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i <= 1) {
            setHideIndicatorView(true);
        } else {
            setHideIndicatorView(false);
        }
        if (i > 4 || i <= 1) {
            setTabMode(0);
        } else {
            setTabMode(1);
        }
    }

    public final void a(int i, @NotNull List<String> list) {
        float f2;
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), list2}, this, u, false, 86823, new Class[]{Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), list2}, this, u, false, 86823, new Class[]{Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "nameList");
        setMaxTabModeForCount(i);
        if (!j.a((Collection<T>) list2)) {
            Paint paint = new Paint();
            paint.setTextSize(UIUtils.dip2Px(getContext(), 15.0f));
            int i2 = 0;
            for (String next : list) {
                if (next != null) {
                    f2 = paint.measureText(next);
                } else {
                    f2 = 0.0f;
                }
                if (f2 > ((float) i2)) {
                    i2 = (int) f2;
                }
            }
            if (((float) i2) > UIUtils.dip2Px(getContext(), 50.0f) && i > 2) {
                setTabMode(0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AVDmtTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        Intrinsics.checkParameterIsNotNull(context, "context");
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, u, false, 86819, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, u, false, 86819, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        this.x = b.f74589e.a(attributeSet2 != null ? context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView).getBoolean(21, false) : z);
        this.y = b.a(this.x);
        setOverScrollMode(2);
        a(this.y, this.x);
        setSelectedTabIndicatorColor(this.x);
        setTabMargin(16);
        super.a((TabLayout.b) new b(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AVDmtTabLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
