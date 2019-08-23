package com.ss.android.sdk.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.sdk.c.c;

@Deprecated
public abstract class AbsBrowserFragment extends AbsFragment {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f2547a;

    /* renamed from: b  reason: collision with root package name */
    public a f2548b;

    /* renamed from: c  reason: collision with root package name */
    public c.a f2549c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2550d;

    /* renamed from: e  reason: collision with root package name */
    public c f2551e;

    public interface a {
        void a();

        void a(int i);

        void a(WebResourceResponse webResourceResponse);

        void b();
    }

    public interface b extends a {
        void a(int i, String str, String str2);

        void a(WebResourceRequest webResourceRequest, WebResourceError webResourceError);

        void a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);
    }

    public interface c {
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    public abstract void a(String str, boolean z);

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void a(String str) {
        a(str, false);
    }
}
