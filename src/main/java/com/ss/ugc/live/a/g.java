package com.ss.ugc.live.a;

import com.ss.avframework.livestreamv2.filter.IFilterManager;
import com.ss.ugc.live.a.a.c;

public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    IFilterManager f78614a;

    public g(IFilterManager iFilterManager) {
        this.f78614a = iFilterManager;
    }

    public final void a(String str) {
        this.f78614a.setEffect(null, false);
    }

    public final void a(boolean z) {
        this.f78614a.enableMockFace(z);
    }

    public final int a(int i, int i2) {
        return this.f78614a.composerSetMode(i, i2);
    }

    public final int a(String[] strArr, int i) {
        return this.f78614a.composerSetNodes(strArr, i);
    }

    public final void a(String str, float f2) {
        IFilterManager iFilterManager = this.f78614a;
        if (str == null) {
            str = "";
        }
        iFilterManager.setFilter(str, 1.0f);
    }

    public final void a(String str, boolean z) {
        this.f78614a.setEffect(str, z);
    }

    public final int b(String str, String str2, float f2) {
        return this.f78614a.composerUpdateNode(str, str2, f2);
    }

    public final int a(String str, String str2, float f2) {
        return this.f78614a.setFilter(str, str2, f2);
    }

    public final void a(String str, String str2, boolean z) {
        this.f78614a.setCustomEffect(str, str2);
    }
}
