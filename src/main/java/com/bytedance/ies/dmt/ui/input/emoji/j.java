package com.bytedance.ies.dmt.ui.input.emoji;

import android.content.Context;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f20412a = {"[赞]", "[玫瑰]", "[捂脸]", "[666]", "[鼓掌]", "[呲牙]", "[微笑]", "[耶]"};

    /* renamed from: b  reason: collision with root package name */
    private Context f20413b;

    /* renamed from: c  reason: collision with root package name */
    private f f20414c;

    public j(Context context) {
        this.f20413b = context;
        this.f20414c = f.a(context);
    }

    /* access modifiers changed from: package-private */
    public a a(String str) {
        int a2 = this.f20414c.a(str);
        if (a2 < 0) {
            return null;
        }
        a aVar = new a();
        aVar.f20387b = this.f20414c.a(a2);
        aVar.f20386a = this.f20414c.b(a2);
        return aVar;
    }
}
