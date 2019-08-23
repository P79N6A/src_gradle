package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.reflect.JavaCalls;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import org.jetbrains.annotations.NotNull;

public class PreloadResCleanerTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55294, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55294, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("PreloadResCleanerTask");
        if (Build.VERSION.SDK_INT >= 24) {
            preloadResCleaner(context);
        } else {
            preloadResCleanerForM(context);
        }
    }

    private void preloadResCleaner(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55295, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55295, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            Object field = JavaCalls.getField(context.getApplicationContext().getResources(), "mResourcesImpl");
            if (field != null) {
                Object field2 = JavaCalls.getField(field, "sPreloadedDrawables");
                if (field2 instanceof LongSparseArray[]) {
                    for (LongSparseArray clear : (LongSparseArray[]) field2) {
                        CollectionUtils.clear(clear);
                    }
                } else {
                    CollectionUtils.clear((LongSparseArray) field2);
                }
                CollectionUtils.clear(JavaCalls.getField(field, "sPreloadedColorDrawables"));
                CollectionUtils.clear(JavaCalls.getField(field, "sPreloadedComplexColors"));
                Object field3 = JavaCalls.getField(field, "mDrawableCache");
                if (field3 != null) {
                    CollectionUtils.clear(JavaCalls.getField(field3, "mNullThemedEntries"));
                    CollectionUtils.clear(JavaCalls.getField(field3, "mThemedEntries"));
                    CollectionUtils.clear(JavaCalls.getField(field3, "mUnthemedEntries"));
                }
                CollectionUtils.clear(JavaCalls.getField(field, "mDrawableCache"));
                CollectionUtils.clear(JavaCalls.getField(field, "mColorDrawableCache"));
                CollectionUtils.clear(JavaCalls.getField(field, "mColorStateListCache"));
            }
        } catch (Exception unused) {
        }
    }

    private void preloadResCleanerForM(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55296, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55296, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            Resources resources = context.getApplicationContext().getResources();
            Object field = JavaCalls.getField(resources, "sPreloadedDrawables");
            if (field instanceof LongSparseArray[]) {
                for (LongSparseArray clear : (LongSparseArray[]) field) {
                    CollectionUtils.clear(clear);
                }
            } else {
                CollectionUtils.clear((LongSparseArray) field);
            }
            CollectionUtils.clear(JavaCalls.getField(resources, "sPreloadedColorDrawables"));
            CollectionUtils.clear(JavaCalls.getField(resources, "sPreloadedColorStateLists"));
            CollectionUtils.clear(JavaCalls.getField(resources, "mDrawableCache"));
            CollectionUtils.clear(JavaCalls.getField(resources, "mColorDrawableCache"));
            CollectionUtils.clear(JavaCalls.getField(resources, "mColorStateListCache"));
        } catch (Exception unused) {
        }
    }
}
