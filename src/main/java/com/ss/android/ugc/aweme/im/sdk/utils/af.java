package com.ss.android.ugc.aweme.im.sdk.utils;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/utils/NoDoubleClickUtils;", "", "()V", "DEFAULT_SPACE_TIME", "", "lastClickTimeMap", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "", "clear", "", "isDoubleClick", "", "view", "spaceTime", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class af {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52470a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<View, Long> f52471b = new WeakHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final af f52472c = new af();

    /* renamed from: d  reason: collision with root package name */
    private static final int f52473d = f52473d;

    private af() {
    }

    @JvmOverloads
    public final boolean a(@Nullable View view, long j) {
        View view2 = view;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view2, 500L}, this, f52470a, false, 53670, new Class[]{View.class, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, 500L}, this, f52470a, false, 53670, new Class[]{View.class, Long.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (view2 == null) {
            return false;
        } else {
            Long l = f52471b.get(view2);
            long nanoTime = System.nanoTime() / 1000000;
            if (l == null) {
                f52471b.put(view2, Long.valueOf(nanoTime));
                return false;
            }
            if (nanoTime - l.longValue() > 500) {
                z = false;
            }
            if (!z) {
                f52471b.put(view2, Long.valueOf(nanoTime));
            }
            return z;
        }
    }
}
