package com.ss.android.ugc.aweme.tools;

import android.view.ScaleGestureDetector;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class h extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74766a;

    /* renamed from: b  reason: collision with root package name */
    public ScaleGestureDetector f74767b;

    /* renamed from: c  reason: collision with root package name */
    public float f74768c;

    /* renamed from: d  reason: collision with root package name */
    public float f74769d;

    /* renamed from: e  reason: collision with root package name */
    public int f74770e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f74771f;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74766a, false, 86953, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74766a, false, 86953, new Class[0], String.class);
        }
        return "CameraStateEvent{detector=" + this.f74767b + ", x=" + this.f74768c + ", y=" + this.f74769d + ", type=" + this.f74770e + ", result=" + this.f74771f + '}';
    }
}
