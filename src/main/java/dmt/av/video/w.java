package dmt.av.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b#\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0003J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0003J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0003R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\t¨\u0006&"}, d2 = {"Ldmt/av/video/VEPreviewScaleOpV2;", "", "mOpType", "", "mBackGroundColor", "(II)V", "getMBackGroundColor", "()I", "setMBackGroundColor", "(I)V", "mBottomMenuHeight", "getMBottomMenuHeight", "setMBottomMenuHeight", "mMarginBottom", "getMMarginBottom", "setMMarginBottom", "mMarginTop", "getMMarginTop", "setMMarginTop", "mMaxVideoHeight", "getMMaxVideoHeight", "setMMaxVideoHeight", "getMOpType", "setMOpType", "mTopMenuHeight", "getMTopMenuHeight", "setMTopMenuHeight", "setBottomMenuHeight", "bottomMenuHeight", "setMarginBottom", "marginBottom", "setMarginTop", "marginTop", "setMaxVideoHeight", "maxVideoHeight", "setTopMenuHeight", "topMenuHeight", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83074a;
    public static final a i = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public int f83075b;

    /* renamed from: c  reason: collision with root package name */
    public int f83076c;

    /* renamed from: d  reason: collision with root package name */
    public int f83077d;

    /* renamed from: e  reason: collision with root package name */
    public int f83078e;

    /* renamed from: f  reason: collision with root package name */
    public int f83079f;
    public int g;
    public int h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0007J8\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Ldmt/av/video/VEPreviewScaleOpV2$Companion;", "", "()V", "OP_SCALE_DOWN", "", "OP_SCALE_UP", "setBackgroundColorAfterScaleUp", "Ldmt/av/video/VEPreviewScaleOpV2;", "backgroundColor", "menuTop", "menuBottom", "videoHeight", "marginTop", "marginBottom", "setBackgroundColorAndScaleDown", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f83080a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final w a(int i, int i2, int i3, int i4, int i5, int i6) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, this, f83080a, false, 92029, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, w.class)) {
                return new w(1, i).a(i5).c(i6).d(i2).e(i3).b(i4);
            }
            return (w) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, this, f83080a, false, 92029, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, w.class);
        }

        @JvmStatic
        @NotNull
        public final w b(int i, int i2, int i3, int i4, int i5, int i6) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, this, f83080a, false, 92030, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, w.class)) {
                return new w(0, i).a(i5).c(i6).d(i2).e(i3).b(i4);
            }
            return (w) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, this, f83080a, false, 92030, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, w.class);
        }
    }

    @JvmStatic
    @NotNull
    public static final w a(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), 0}, null, f83074a, true, 92027, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, w.class)) {
            return i.a(i2, i3, i4, i5, i6, 0);
        }
        return (w) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), 0}, null, f83074a, true, 92027, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, w.class);
    }

    @JvmStatic
    @NotNull
    public static final w b(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), 0}, null, f83074a, true, 92028, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, w.class)) {
            return i.b(i2, i3, i4, i5, i6, 0);
        }
        return (w) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), 0}, null, f83074a, true, 92028, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, w.class);
    }

    @NotNull
    public final w a(int i2) {
        this.f83075b = i2;
        return this;
    }

    @NotNull
    public final w b(int i2) {
        this.f83079f = i2;
        return this;
    }

    @NotNull
    public final w c(int i2) {
        this.f83076c = i2;
        return this;
    }

    @NotNull
    public final w d(int i2) {
        this.f83077d = i2;
        return this;
    }

    @NotNull
    public final w e(int i2) {
        this.f83078e = i2;
        return this;
    }

    public w(int i2, int i3) {
        this.g = i2;
        this.h = i3;
    }
}
