package com.ss.android.ugc.graph;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.ss.android.ugc.graph.e;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    Map<String, e.c> f77674a;

    enum a {
        INSTANCE;
        
        private a mDelegate;
        private c mProxy;

        /* access modifiers changed from: package-private */
        @NonNull
        public final c getDelegateProxy() {
            if (this.mProxy == null) {
                this.mProxy = new c((byte) 0);
            }
            return this.mProxy;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        @SuppressLint({"LongLogTag"})
        public final a getComponentsDelegate() {
            if (this.mDelegate == null) {
                try {
                    this.mDelegate = (a) Class.forName("com.ss.android.ugc.graph.ComponentsDelegate").newInstance();
                } catch (Exception unused) {
                }
            }
            return this.mDelegate;
        }
    }

    private c() {
        this.f77674a = new HashMap();
        a componentsDelegate = a.INSTANCE.getComponentsDelegate();
        if (componentsDelegate != null) {
            this.f77674a.putAll(componentsDelegate.sDelegateMap);
        }
    }

    /* synthetic */ c(byte b2) {
        this();
    }
}
