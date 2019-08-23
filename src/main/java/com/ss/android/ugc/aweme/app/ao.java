package com.ss.android.ugc.aweme.app;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class ao<T> extends an<List<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f33765d;

    /* renamed from: e  reason: collision with root package name */
    private Class<T> f33766e;

    /* renamed from: d */
    public final List<T> c() {
        if (PatchProxy.isSupport(new Object[0], this, f33765d, false, 22958, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f33765d, false, 22958, new Class[0], List.class);
        }
        String string = a().getString(this.f2633c, "");
        if (TextUtils.isEmpty(string)) {
            return (List) this.f2632b;
        }
        String[] split = string.split(",");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str : split) {
            if (this.f33766e == String.class) {
                arrayList.add(str);
            } else if (this.f33766e == Integer.class) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str)));
            } else if (this.f33766e == Float.class) {
                arrayList.add(Float.valueOf(Float.parseFloat(str)));
            } else if (this.f33766e == Long.class) {
                arrayList.add(Long.valueOf(Long.parseLong(str)));
            } else if (this.f33766e == Boolean.class) {
                arrayList.add(Boolean.valueOf(Boolean.parseBoolean(str)));
            } else {
                throw new RuntimeException("un support type: " + this.f33766e.getName());
            }
        }
        return arrayList;
    }

    public final /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{editor, list}, this, f33765d, false, 22956, new Class[]{SharedPreferences.Editor.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editor, list}, this, f33765d, false, 22956, new Class[]{SharedPreferences.Editor.class, List.class}, Void.TYPE);
        } else if (CollectionUtils.isEmpty(list)) {
            editor.remove(this.f2633c);
        } else {
            editor.putString(this.f2633c, TextUtils.join(",", list));
        }
    }

    public final /* synthetic */ void a(Object obj, boolean z) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f33765d, false, 22957, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f33765d, false, 22957, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = a().edit();
        if (CollectionUtils.isEmpty(list)) {
            edit.remove(this.f2633c);
        } else {
            edit.putString(this.f2633c, TextUtils.join(",", list));
        }
        edit.apply();
    }

    public ao(Class<T> cls, String str, List<T> list) {
        super(str, list);
        this.f33766e = cls;
    }
}
