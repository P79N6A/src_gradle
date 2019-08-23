package com.ss.android.socialbase.downloader.depend;

import java.util.List;

public abstract class a implements q {

    /* renamed from: a  reason: collision with root package name */
    private boolean f30876a;

    public final boolean a() {
        return this.f30876a;
    }

    public void a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f30876a = true;
        }
    }
}
