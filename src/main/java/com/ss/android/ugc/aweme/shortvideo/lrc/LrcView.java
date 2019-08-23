package com.ss.android.ugc.aweme.shortvideo.lrc;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.music.R$styleable;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\fJ\u0014\u0010\u001f\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\fJ\b\u0010#\u001a\u00020\u001aH\u0002J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007J\b\u0010%\u001a\u00020\u001aH\u0002R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/lrc/LrcView;", "Landroid/widget/HorizontalScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getAttrs", "()Landroid/util/AttributeSet;", "mCurrentTime", "", "mCutStartTime", "mDuration", "mLrcInfos", "", "Lcom/ss/android/ugc/aweme/shortvideo/lrc/LrcInfo;", "mPreviewStartTime", "mTvwLrc", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "init", "", "setCurrentTime", "time", "setDuration", "duration", "setLrcInfos", "lrcInfos", "setPreviewStartTime", "startTime", "setScrollXByTime", "setStartTime", "setText", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LrcView extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68349a;

    /* renamed from: b  reason: collision with root package name */
    private float f68350b;

    /* renamed from: c  reason: collision with root package name */
    private float f68351c;

    /* renamed from: d  reason: collision with root package name */
    private float f68352d;

    /* renamed from: e  reason: collision with root package name */
    private float f68353e;

    /* renamed from: f  reason: collision with root package name */
    private List<a> f68354f;
    private DmtTextView g;
    @Nullable
    private final AttributeSet h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/ugc/aweme/shortvideo/lrc/LrcInfo;", "kotlin.jvm.PlatformType", "o2", "compare"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Comparator<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f68355a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            float f2 = ((a) obj).f68357a - ((a) obj2).f68357a;
            if (f2 > 0.0f) {
                return 1;
            }
            if (f2 < 0.0f) {
                return -1;
            }
            return 0;
        }
    }

    @JvmOverloads
    public LrcView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public LrcView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f68349a, false, 77595, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f68349a, false, 77595, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(motionEvent2, "ev");
        return false;
    }

    @Nullable
    public final AttributeSet getAttrs() {
        return this.h;
    }

    private final void a() {
        boolean z;
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f68349a, false, 77601, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68349a, false, 77601, new Class[0], Void.TYPE);
            return;
        }
        Collection collection = this.f68354f;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i = 0;
            while (true) {
                List<a> list = this.f68354f;
                if (list == null) {
                    Intrinsics.throwNpe();
                }
                if (i >= list.size() - 1) {
                    break;
                }
                float f3 = this.f68352d;
                List<a> list2 = this.f68354f;
                if (list2 == null) {
                    Intrinsics.throwNpe();
                }
                int i2 = i + 1;
                if (f3 < list2.get(i2).f68357a) {
                    break;
                }
                i = i2;
            }
            DmtTextView dmtTextView = this.g;
            if (dmtTextView == null) {
                Intrinsics.throwNpe();
            }
            List<a> list3 = this.f68354f;
            if (list3 == null) {
                Intrinsics.throwNpe();
            }
            dmtTextView.setText(list3.get(i).f68358b);
            List<a> list4 = this.f68354f;
            if (list4 == null) {
                Intrinsics.throwNpe();
            }
            float f4 = list4.get(i).f68357a;
            List<a> list5 = this.f68354f;
            if (list5 == null) {
                Intrinsics.throwNpe();
            }
            if (i == list5.size() - 1) {
                f2 = this.f68350b;
            } else {
                List<a> list6 = this.f68354f;
                if (list6 == null) {
                    Intrinsics.throwNpe();
                }
                f2 = list6.get(i + 1).f68357a;
            }
            float f5 = this.f68352d - f4;
            float f6 = f2 - f4;
            float f7 = 0.0f;
            if (f5 >= 0.0f && f6 >= f5 && f6 > 0.0f) {
                List<a> list7 = this.f68354f;
                if (list7 == null) {
                    Intrinsics.throwNpe();
                }
                int measuredWidth = (int) (list7.get(i).f68359c - ((float) getMeasuredWidth()));
                if (measuredWidth > 0) {
                    f7 = (((float) measuredWidth) * f5) / f6;
                }
                smoothScrollTo((int) f7, 0);
            }
        }
    }

    public final void setDuration(float f2) {
        this.f68350b = f2;
    }

    public final void setPreviewStartTime(float f2) {
        this.f68353e = f2;
    }

    public final void setCurrentTime(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68349a, false, 77597, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68349a, false, 77597, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i >= 0) {
            this.f68352d = this.f68353e + this.f68351c + (((float) i) / 1000.0f);
            a();
        }
    }

    public final void setStartTime(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68349a, false, 77596, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68349a, false, 77596, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f68351c = ((float) i) / 1000.0f;
        if (!CollectionUtils.isEmpty(this.f68354f)) {
            List<a> list = this.f68354f;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            if (list.size() == 1) {
                setVisibility(8);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.util.List<com.ss.android.ugc.aweme.shortvideo.lrc.a>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setLrcInfos(@org.jetbrains.annotations.NotNull java.util.List<com.ss.android.ugc.aweme.shortvideo.lrc.a> r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f68349a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 77598(0x12f1e, float:1.08738E-40)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f68349a
            r3 = 0
            r4 = 77598(0x12f1e, float:1.08738E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            java.lang.String r0 = "lrcInfos"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            r7.f68354f = r8
            java.util.List<com.ss.android.ugc.aweme.shortvideo.lrc.a> r0 = r7.f68354f
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x004e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r0 = 0
            goto L_0x004f
        L_0x004e:
            r0 = 1
        L_0x004f:
            if (r0 == 0) goto L_0x0052
            return
        L_0x0052:
            r7.setVisibility(r10)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.lrc.a> r0 = r7.f68354f
            if (r0 != 0) goto L_0x005c
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x005c:
            com.ss.android.ugc.aweme.shortvideo.lrc.LrcView$a r1 = com.ss.android.ugc.aweme.shortvideo.lrc.LrcView.a.f68355a
            java.util.Comparator r1 = (java.util.Comparator) r1
            kotlin.collections.CollectionsKt.sortWith(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.lrc.a$a r0 = com.ss.android.ugc.aweme.shortvideo.lrc.a.f68356d
            java.util.List<com.ss.android.ugc.aweme.shortvideo.lrc.a> r1 = r7.f68354f
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r7.g
            if (r2 != 0) goto L_0x006e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x006e:
            android.text.TextPaint r2 = r2.getPaint()
            java.lang.String r3 = "mTvwLrc!!.paint"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r3 = 2
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r1
            r11[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.lrc.a.C0719a.f68360a
            r14 = 0
            r15 = 77594(0x12f1a, float:1.08732E-40)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r4[r10] = r5
            java.lang.Class<android.text.TextPaint> r5 = android.text.TextPaint.class
            r4[r9] = r5
            java.lang.Class<java.util.List> r17 = java.util.List.class
            r12 = r0
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x00bd
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r10] = r1
            r11[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.lrc.a.C0719a.f68360a
            r14 = 0
            r15 = 77594(0x12f1a, float:1.08732E-40)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r1[r10] = r2
            java.lang.Class<android.text.TextPaint> r2 = android.text.TextPaint.class
            r1[r9] = r2
            java.lang.Class<java.util.List> r17 = java.util.List.class
            r12 = r0
            r16 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            goto L_0x0141
        L_0x00bd:
            java.lang.String r0 = "paint"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            if (r1 != 0) goto L_0x00c7
            r1 = 0
            goto L_0x0141
        L_0x00c7:
            r0 = 0
        L_0x00c8:
            int r3 = r1.size()
            if (r0 >= r3) goto L_0x011d
            int r3 = r0 + 1
            int r4 = r1.size()
            if (r3 >= r4) goto L_0x011b
            java.lang.Object r4 = r1.get(r0)
            com.ss.android.ugc.aweme.shortvideo.lrc.a r4 = (com.ss.android.ugc.aweme.shortvideo.lrc.a) r4
            float r4 = r4.f68357a
            java.lang.Object r5 = r1.get(r3)
            com.ss.android.ugc.aweme.shortvideo.lrc.a r5 = (com.ss.android.ugc.aweme.shortvideo.lrc.a) r5
            float r5 = r5.f68357a
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x011b
            java.lang.Object r4 = r1.get(r0)
            com.ss.android.ugc.aweme.shortvideo.lrc.a r4 = (com.ss.android.ugc.aweme.shortvideo.lrc.a) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Object r6 = r1.get(r0)
            com.ss.android.ugc.aweme.shortvideo.lrc.a r6 = (com.ss.android.ugc.aweme.shortvideo.lrc.a) r6
            java.lang.String r6 = r6.f68358b
            r5.append(r6)
            java.lang.String r6 = " "
            r5.append(r6)
            java.lang.Object r6 = r1.get(r3)
            com.ss.android.ugc.aweme.shortvideo.lrc.a r6 = (com.ss.android.ugc.aweme.shortvideo.lrc.a) r6
            java.lang.String r6 = r6.f68358b
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.f68358b = r5
            r1.remove(r3)
            int r0 = r0 + -1
        L_0x011b:
            int r0 = r0 + r9
            goto L_0x00c8
        L_0x011d:
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r3 = 0
        L_0x0125:
            if (r3 >= r0) goto L_0x0141
            java.lang.Object r4 = r1.get(r3)
            com.ss.android.ugc.aweme.shortvideo.lrc.a r4 = (com.ss.android.ugc.aweme.shortvideo.lrc.a) r4
            java.lang.Object r5 = r1.get(r3)
            com.ss.android.ugc.aweme.shortvideo.lrc.a r5 = (com.ss.android.ugc.aweme.shortvideo.lrc.a) r5
            java.lang.String r5 = r5.f68358b
            float r5 = r2.measureText(r5)
            r6 = 1097859072(0x41700000, float:15.0)
            float r5 = r5 + r6
            r4.f68359c = r5
            int r3 = r3 + 1
            goto L_0x0125
        L_0x0141:
            r7.f68354f = r1
            java.util.List<com.ss.android.ugc.aweme.shortvideo.lrc.a> r0 = r7.f68354f
            if (r0 != 0) goto L_0x014a
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x014a:
            int r0 = r0.size()
            if (r0 != r9) goto L_0x0167
            float r0 = r7.f68350b
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x015b
            r0 = 1116471296(0x428c0000, float:70.0)
            r7.f68350b = r0
        L_0x015b:
            float r0 = r7.f68351c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0181
            r0 = 8
            r7.setVisibility(r0)
            return
        L_0x0167:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.lrc.a> r0 = r7.f68354f
            if (r0 != 0) goto L_0x016e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x016e:
            java.lang.Object r0 = kotlin.collections.CollectionsKt.last((java.util.List<? extends T>) r0)
            com.ss.android.ugc.aweme.shortvideo.lrc.a r0 = (com.ss.android.ugc.aweme.shortvideo.lrc.a) r0
            float r0 = r0.f68357a
            float r1 = r7.f68350b
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0181
            r1 = 1101004800(0x41a00000, float:20.0)
            float r0 = r0 + r1
            r7.f68350b = r0
        L_0x0181:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f68349a
            r3 = 0
            r4 = 77600(0x12f20, float:1.08741E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01a7
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f68349a
            r3 = 0
            r4 = 77600(0x12f20, float:1.08741E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x01a7:
            r18.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.lrc.LrcView.setLrcInfos(java.util.List):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LrcView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.h = attributeSet;
        if (PatchProxy.isSupport(new Object[0], this, f68349a, false, 77599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68349a, false, 77599, new Class[0], Void.TYPE);
            return;
        }
        this.g = new DmtTextView(getContext());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.h, R$styleable.LrcView);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 45);
        DmtTextView dmtTextView = this.g;
        if (dmtTextView == null) {
            Intrinsics.throwNpe();
        }
        dmtTextView.setTextSize(0, (float) dimensionPixelOffset);
        int color = obtainStyledAttributes.getColor(1, -1);
        DmtTextView dmtTextView2 = this.g;
        if (dmtTextView2 == null) {
            Intrinsics.throwNpe();
        }
        dmtTextView2.setTextColor(color);
        obtainStyledAttributes.recycle();
        addView(this.g, new ViewGroup.LayoutParams(-2, -2));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LrcView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
