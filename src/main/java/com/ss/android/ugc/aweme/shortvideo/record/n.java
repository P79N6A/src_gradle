package com.ss.android.ugc.aweme.shortvideo.record;

import android.support.annotation.NonNull;
import android.widget.RadioGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.tools.am;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69119a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f69120b = true;

    /* renamed from: c  reason: collision with root package name */
    private RadioGroup f69121c;

    public interface a {
        void a(am amVar);
    }

    public final am a() {
        if (PatchProxy.isSupport(new Object[0], this, f69119a, false, 78388, new Class[0], am.class)) {
            return (am) PatchProxy.accessDispatch(new Object[0], this, f69119a, false, 78388, new Class[0], am.class);
        }
        int checkedRadioButtonId = this.f69121c.getCheckedRadioButtonId();
        if (checkedRadioButtonId == C0906R.id.c_q) {
            return am.EPIC;
        }
        if (checkedRadioButtonId == C0906R.id.c_r) {
            return am.SLOW;
        }
        if (checkedRadioButtonId == C0906R.id.c_s) {
            return am.NORMAL;
        }
        if (checkedRadioButtonId == C0906R.id.c_t) {
            return am.FAST;
        }
        if (checkedRadioButtonId == C0906R.id.c_u) {
            return am.LAPSE;
        }
        throw new IllegalArgumentException("unknown view: " + checkedRadioButtonId);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69119a, false, 78389, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69119a, false, 78389, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f69121c.setVisibility(i);
    }

    public final void a(am amVar) {
        if (PatchProxy.isSupport(new Object[]{amVar}, this, f69119a, false, 78387, new Class[]{am.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{amVar}, this, f69119a, false, 78387, new Class[]{am.class}, Void.TYPE);
            return;
        }
        switch (amVar) {
            case EPIC:
                this.f69121c.check(C0906R.id.c_q);
                return;
            case SLOW:
                this.f69121c.check(C0906R.id.c_r);
                return;
            case NORMAL:
                this.f69121c.check(C0906R.id.c_s);
                return;
            case FAST:
                this.f69121c.check(C0906R.id.c_t);
                return;
            case LAPSE:
                this.f69121c.check(C0906R.id.c_u);
                break;
        }
    }

    public n(@NonNull RadioGroup radioGroup, @NonNull final a aVar) {
        this.f69121c = radioGroup;
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69122a;

            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (PatchProxy.isSupport(new Object[]{radioGroup, Integer.valueOf(i)}, this, f69122a, false, 78392, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{radioGroup, Integer.valueOf(i)}, this, f69122a, false, 78392, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE);
                } else if (n.this.f69120b) {
                    if (i == C0906R.id.c_q) {
                        aVar.a(am.EPIC);
                    } else if (i == C0906R.id.c_r) {
                        aVar.a(am.SLOW);
                    } else if (i == C0906R.id.c_s) {
                        aVar.a(am.NORMAL);
                    } else if (i == C0906R.id.c_t) {
                        aVar.a(am.FAST);
                    } else if (i == C0906R.id.c_u) {
                        aVar.a(am.LAPSE);
                    } else {
                        throw new IllegalArgumentException("unknown view: " + i);
                    }
                }
            }
        });
    }
}
