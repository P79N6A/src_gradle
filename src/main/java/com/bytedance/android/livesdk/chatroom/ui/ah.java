package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.ToggleButton;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.widget.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;

public final class ah extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11819a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f11820b;

    static class a implements Consumer<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11821a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f11822b;

        private a(boolean z) {
            this.f11822b = z;
        }

        public final void accept(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f11821a, false, 5655, new Class[]{Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{obj}, this, f11821a, false, 5655, new Class[]{Object.class}, Void.TYPE);
                return;
            }
            if (this.f11822b) {
                ai.a((int) C0906R.string.dga);
            }
            com.bytedance.android.livesdk.w.b.Q.a(Boolean.valueOf(this.f11822b));
        }

        /* synthetic */ a(boolean z, byte b2) {
            this(z);
        }
    }

    static class b implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11823a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<ToggleButton> f11824b;

        private b(ToggleButton toggleButton) {
            this.f11824b = new WeakReference<>(toggleButton);
        }

        public final /* synthetic */ void accept(Object obj) throws Exception {
            Throwable th = (Throwable) obj;
            if (PatchProxy.isSupport(new Object[]{th}, this, f11823a, false, 5656, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f11823a, false, 5656, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            if (this.f11824b.get() != null) {
                ah.f11820b = true;
                ((ToggleButton) this.f11824b.get()).setChecked(false);
                ah.f11820b = false;
            }
        }

        /* synthetic */ b(ToggleButton toggleButton, byte b2) {
            this(toggleButton);
        }
    }

    public final int a() {
        return C0906R.layout.afe;
    }

    public ah(@NonNull Context context) {
        super(context);
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11819a, false, 5653, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11819a, false, 5653, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (com.bytedance.android.live.uikit.a.a.d() && getWindow() != null && !ac.f()) {
            getWindow().setLayout(ac.a(376.0f), ac.a(152.0f));
            getWindow().setGravity(8388693);
        }
        boolean booleanValue = ((Boolean) com.bytedance.android.livesdk.w.b.Q.a()).booleanValue();
        ToggleButton toggleButton = (ToggleButton) findViewById(C0906R.id.d48);
        toggleButton.setChecked(booleanValue);
        toggleButton.setOnCheckedChangeListener(new ai(toggleButton));
    }
}
