package com.ss.android.ugc.aweme.commerce.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0014J\u0014\u0010\u001b\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\fR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/widget/AlignTextView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mPaintList", "", "Landroid/graphics/Paint;", "mRect", "Landroid/graphics/Rect;", "mTextItemList", "Lcom/ss/android/ugc/aweme/commerce/widget/AlignTextView$TextItem;", "calculateViewHeight", "heightMeasureSpec", "calculateViewWidth", "widthMeasureSpec", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "setTextList", "textItemList", "TextItem", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AlignTextView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38327a;

    /* renamed from: b  reason: collision with root package name */
    private List<a> f38328b;

    /* renamed from: c  reason: collision with root package name */
    private List<? extends Paint> f38329c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f38330d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fR\u001a\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/widget/AlignTextView$TextItem;", "", "text", "", "textSize", "", "textColor", "", "leftSpace", "isBold", "", "bottomSpace", "(Ljava/lang/String;FIFZF)V", "getBottomSpace", "()F", "setBottomSpace", "(F)V", "()Z", "setBold", "(Z)V", "getLeftSpace", "setLeftSpace", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getTextColor", "()I", "setTextColor", "(I)V", "getTextSize", "setTextSize", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public String f38331a;

        /* renamed from: b  reason: collision with root package name */
        public float f38332b;

        /* renamed from: c  reason: collision with root package name */
        public int f38333c;

        /* renamed from: d  reason: collision with root package name */
        public float f38334d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f38335e;

        /* renamed from: f  reason: collision with root package name */
        public float f38336f;

        public a(@NotNull String str, float f2, int i, float f3, boolean z, float f4) {
            Intrinsics.checkParameterIsNotNull(str, "text");
            this.f38331a = str;
            this.f38332b = f2;
            this.f38333c = i;
            this.f38334d = f3;
            this.f38335e = z;
            this.f38336f = f4;
        }

        public /* synthetic */ a(String str, float f2, int i, float f3, boolean z, float f4, int i2) {
            this(str, f2, i, f3, z, 0.0f);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AlignTextView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setTextList(@NotNull List<a> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f38327a, false, 30132, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f38327a, false, 30132, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list, "textItemList");
        this.f38328b = list;
        List arrayList = new ArrayList();
        for (a next : list) {
            Paint paint = new Paint(1);
            paint.setTextSize(next.f38332b);
            paint.setColor(next.f38333c);
            paint.setFakeBoldText(next.f38335e);
            arrayList.add(paint);
        }
        this.f38329c = CollectionsKt.toList(arrayList);
        requestLayout();
        invalidate();
    }

    private final int a(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38327a, false, 30134, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38327a, false, 30134, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int mode = View.MeasureSpec.getMode(i);
        int defaultSize = View.getDefaultSize(getMinimumHeight(), i);
        if (mode == 1073741824) {
            return defaultSize;
        }
        List<a> list = this.f38328b;
        if (list != null) {
            i2 = 0;
            int i3 = 0;
            for (a aVar : list) {
                List<? extends Paint> list2 = this.f38329c;
                if (list2 == null) {
                    Intrinsics.throwNpe();
                }
                ((Paint) list2.get(i3)).getTextBounds(aVar.f38331a, 0, aVar.f38331a.length(), this.f38330d);
                int i4 = ((int) aVar.f38336f) + (this.f38330d.bottom - this.f38330d.top);
                if (i4 > i2) {
                    i2 = i4;
                }
                i3++;
            }
        } else {
            i2 = 0;
        }
        if (defaultSize == 0) {
            return i2;
        }
        return Math.min(i2, defaultSize);
    }

    private final int b(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38327a, false, 30135, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38327a, false, 30135, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int mode = View.MeasureSpec.getMode(i);
        int defaultSize = View.getDefaultSize(getMinimumWidth(), i);
        if (mode == 1073741824) {
            return defaultSize;
        }
        List<a> list = this.f38328b;
        if (list != null) {
            i2 = 0;
            int i3 = 0;
            for (a aVar : list) {
                List<? extends Paint> list2 = this.f38329c;
                if (list2 == null) {
                    Intrinsics.throwNpe();
                }
                ((Paint) list2.get(i3)).getTextBounds(aVar.f38331a, 0, aVar.f38331a.length(), this.f38330d);
                i2 = i2 + (this.f38330d.right - this.f38330d.left) + ((int) aVar.f38334d);
                i3++;
            }
        } else {
            i2 = 0;
        }
        if (defaultSize == 0) {
            return i2;
        }
        return Math.min(i2, defaultSize);
    }

    public final void onDraw(@Nullable Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f38327a, false, 30136, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f38327a, false, 30136, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        List<? extends Paint> list = this.f38329c;
        if (list != null) {
            int i = 0;
            int i2 = 0;
            for (Paint paint : list) {
                List<a> list2 = this.f38328b;
                if (list2 == null) {
                    Intrinsics.throwNpe();
                }
                a aVar = list2.get(i);
                int i3 = i2 + ((int) aVar.f38334d);
                paint.getTextBounds(aVar.f38331a, 0, aVar.f38331a.length(), this.f38330d);
                if (canvas != null) {
                    canvas.drawText(aVar.f38331a, (float) (i3 - this.f38330d.left), ((float) (getHeight() - this.f38330d.bottom)) - aVar.f38336f, paint);
                }
                i2 = i3 + (this.f38330d.right - this.f38330d.left);
                i++;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AlignTextView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
    }

    public final void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38327a, false, 30133, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38327a, false, 30133, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        setMeasuredDimension(b(i), a(i2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlignTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f38330d = new Rect();
    }
}
