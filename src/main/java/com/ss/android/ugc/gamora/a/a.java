package com.ss.android.ugc.gamora.a;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.bytedance.jedi.arch.JediViewModel;

public final class a {

    /* renamed from: com.ss.android.ugc.gamora.a.a$a  reason: collision with other inner class name */
    static class C0813a implements ViewModelProvider.Factory {
        private C0813a() {
        }

        /* synthetic */ C0813a(byte b2) {
            this();
        }

        @NonNull
        public final <T extends ViewModel> T create(@NonNull Class<T> cls) {
            try {
                T t = (ViewModel) cls.newInstance();
                if (t instanceof JediViewModel) {
                    JediViewModel jediViewModel = (JediViewModel) t;
                    T a2 = jediViewModel.f2282c.a(cls);
                    if (a2 != null) {
                        a2.binding(jediViewModel);
                    }
                    jediViewModel.a(b.f77536a);
                }
                return t;
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }
    }

    public static ViewModelProvider a(@NonNull FragmentActivity fragmentActivity) {
        return ViewModelProviders.of(fragmentActivity, (ViewModelProvider.Factory) new C0813a((byte) 0));
    }
}
