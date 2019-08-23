package com.vivo.push.b;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.vivo.push.a;
import java.util.ArrayList;
import java.util.List;

public final class t extends s {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<String> f81522a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<String> f81523b;

    public final String toString() {
        return "OnSetTagsCommand";
    }

    public final ArrayList<String> d() {
        return this.f81522a;
    }

    public final List<String> e() {
        return this.f81523b;
    }

    public t(int i) {
        super(i);
    }

    public final void c(a aVar) {
        super.c(aVar);
        aVar.a(PushConstants.CONTENT, this.f81522a);
        aVar.a("error_msg", this.f81523b);
    }

    public final void d(a aVar) {
        super.d(aVar);
        this.f81522a = aVar.b(PushConstants.CONTENT);
        this.f81523b = aVar.b("error_msg");
    }
}
