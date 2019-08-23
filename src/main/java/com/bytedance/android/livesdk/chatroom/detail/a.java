package com.bytedance.android.livesdk.chatroom.detail;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.media.AudioManager;
import android.support.v4.app.FragmentActivity;
import com.bytedance.android.livesdk.utils.AudioFocusUtil;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9909a;

    /* renamed from: b  reason: collision with root package name */
    public final g f9910b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9911c = false;

    /* renamed from: d  reason: collision with root package name */
    public long f9912d = -1;

    /* renamed from: e  reason: collision with root package name */
    public Context f9913e;

    /* renamed from: f  reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f9914f = new AudioManager.OnAudioFocusChangeListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9915a;

        public final void onAudioFocusChange(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f9915a, false, 4052, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f9915a, false, 4052, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (a.this.f9911c) {
                if (i == -2 || i == -3) {
                    a.this.f9912d = System.currentTimeMillis();
                    a.this.f9910b.a(true, a.this.f9913e);
                } else if (i != 1) {
                    if (i == -1) {
                        a.this.f9912d = System.currentTimeMillis();
                        a.this.f9910b.a(true, a.this.f9913e);
                    }
                } else if (!(a.this.f9913e instanceof FragmentActivity) || ((FragmentActivity) a.this.f9913e).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                    a.this.f9912d = -1;
                    a.this.f9910b.a(false, a.this.f9913e);
                }
            }
        }
    };

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9909a, false, 4051, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9909a, false, 4051, new Class[0], Void.TYPE);
            return;
        }
        AudioFocusUtil.a(this.f9914f);
    }

    public a(g gVar) {
        this.f9910b = gVar;
    }

    public final void b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f9909a, false, 4050, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f9909a, false, 4050, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (this.f9910b != null) {
            this.f9910b.a(true, context2);
        }
        a();
        if (PatchProxy.isSupport(new Object[0], null, AudioFocusUtil.f17521a, true, 13631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, AudioFocusUtil.f17521a, true, 13631, new Class[0], Void.TYPE);
            return;
        }
        try {
            AudioFocusUtil.f17523c.unregisterMediaButtonEventReceiver(AudioFocusUtil.f17522b);
            AudioFocusUtil.f17523c.abandonAudioFocus(AudioFocusUtil.f17524d);
        } catch (Exception unused) {
        }
    }

    public final void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f9909a, false, 4049, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f9909a, false, 4049, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f9913e = context2;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f9914f;
        if (PatchProxy.isSupport(new Object[]{onAudioFocusChangeListener}, null, AudioFocusUtil.f17521a, true, 13633, new Class[]{AudioManager.OnAudioFocusChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onAudioFocusChangeListener}, null, AudioFocusUtil.f17521a, true, 13633, new Class[]{AudioManager.OnAudioFocusChangeListener.class}, Void.TYPE);
        } else {
            AudioFocusUtil.f17525e.add(onAudioFocusChangeListener);
        }
        if (AudioFocusUtil.a() == 1) {
            this.f9912d = -1;
            this.f9910b.a(false, context2);
        } else if (this.f9911c) {
            this.f9912d = System.currentTimeMillis();
            this.f9910b.a(true, context2);
        } else {
            this.f9912d = -1;
            this.f9910b.a(false, context2);
        }
    }
}
