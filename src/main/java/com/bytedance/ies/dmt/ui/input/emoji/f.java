package com.bytedance.ies.dmt.ui.input.emoji;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.ies.dmt.R$drawable;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static f f20401a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Integer> f20402b;

    /* renamed from: c  reason: collision with root package name */
    private String[] f20403c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f20404d;

    public final int a() {
        b();
        return this.f20404d.size();
    }

    private void b() {
        if (this.f20403c != null && this.f20403c.length > 0 && this.f20402b == null) {
            this.f20404d = new ArrayList();
            this.f20402b = new HashMap(this.f20403c.length);
            for (String split : this.f20403c) {
                String[] split2 = split.split("\\|", 2);
                int parseInt = Integer.parseInt(split2[0]);
                this.f20402b.put(split2[1], Integer.valueOf(c(String.format(Locale.ENGLISH, "im_e%d", new Object[]{Integer.valueOf(parseInt)}))));
                if (this.f20404d.size() == parseInt) {
                    this.f20404d.set(parseInt - 1, split2[1]);
                } else {
                    this.f20404d.add(split2[1]);
                }
            }
        }
    }

    @DrawableRes
    private static int c(String str) {
        Class<R$drawable> cls = R$drawable.class;
        try {
            return cls.getField(str).getInt(cls);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException unused) {
            return 0;
        }
    }

    private f(@NonNull Context context) {
        if (this.f20403c == null || this.f20403c.length <= 0) {
            this.f20403c = context.getResources().getStringArray(C0906R.array.n);
        }
    }

    public static f a(@NonNull Context context) {
        if (f20401a == null) {
            synchronized (f.class) {
                if (f20401a == null) {
                    f20401a = new f(context);
                }
            }
        }
        return f20401a;
    }

    @DrawableRes
    public final int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        b();
        Integer num = this.f20402b.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @DrawableRes
    public final int a(int i) {
        return c(String.format(Locale.ENGLISH, "im_e%d", new Object[]{Integer.valueOf(i + 1)}));
    }

    public final String b(int i) {
        b();
        if (this.f20404d.size() <= i) {
            return "";
        }
        return this.f20404d.get(i);
    }

    public final int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int size = this.f20404d.size();
        for (int i = 0; i < size; i++) {
            if (this.f20404d.get(i).contains(str)) {
                return i;
            }
        }
        return -1;
    }
}
