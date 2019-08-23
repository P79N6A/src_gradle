package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Set;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39666a;

    public static boolean a(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, null, f39666a, true, 32522, new Class[]{Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{intent2}, null, f39666a, true, 32522, new Class[]{Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (intent2 == null || !TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") || !intent2.hasCategory("android.intent.category.LAUNCHER")) {
            return false;
        } else {
            return true;
        }
    }

    public static void a(Intent intent, Intent intent2) {
        Intent intent3 = intent2;
        if (PatchProxy.isSupport(new Object[]{intent, intent3}, null, f39666a, true, 32524, new Class[]{Intent.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent, intent3}, null, f39666a, true, 32524, new Class[]{Intent.class, Intent.class}, Void.TYPE);
        } else if (intent != null) {
            Set<String> categories = intent.getCategories();
            if (!CollectionUtils.isEmpty(categories)) {
                for (String addCategory : categories) {
                    intent3.addCategory(addCategory);
                }
            }
        }
    }
}
