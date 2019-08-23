package com.ss.android.ugc.playerkit.videoview;

import android.view.Surface;
import android.view.View;

public interface VideoSurfaceHolder {

    public @interface ViewType {
    }

    View a();

    void a(i iVar);

    void a(boolean z);

    Surface b();

    void b(i iVar);

    boolean c();

    void d();

    void e();

    void f();

    @ViewType
    int g();

    boolean h();
}
