package com.ss.android.ugc.aweme.im.sdk.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.input.IInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.input.audio.widget.AudioRecordBar;
import com.ss.android.ugc.aweme.im.sdk.chat.input.d;
import com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.i;
import com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText;
import java.util.List;

public final class d implements IInputView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50097a;

    /* renamed from: b  reason: collision with root package name */
    public IInputView f50098b;

    /* renamed from: c  reason: collision with root package name */
    private Context f50099c;

    public final void a() {
    }

    public final void a(int i) {
    }

    public final void a(d.a aVar) {
    }

    public final void a(MentionEditText.e eVar) {
    }

    public final void a(String str) {
    }

    public final void a(String str, String str2) {
    }

    public final void a(List<i> list, int i) {
    }

    public final void b(int i) {
    }

    public final void c() {
    }

    public final boolean d() {
        return false;
    }

    public final void e() {
    }

    public final AudioRecordBar f() {
        return null;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f50097a, false, 50129, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50097a, false, 50129, new Class[0], Void.TYPE);
            return;
        }
        new b(this.f50099c, new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50103a;

            public final void sendMsg() {
                if (PatchProxy.isSupport(new Object[0], this, f50103a, false, 50132, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50103a, false, 50132, new Class[0], Void.TYPE);
                    return;
                }
                d.this.f50098b.b();
            }
        }).sendMsg();
    }

    public final void a(final c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f50097a, false, 50130, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f50097a, false, 50130, new Class[]{c.class}, Void.TYPE);
            return;
        }
        new b(this.f50099c, new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50105a;

            public final void sendMsg() {
                if (PatchProxy.isSupport(new Object[0], this, f50105a, false, 50133, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50105a, false, 50133, new Class[0], Void.TYPE);
                    return;
                }
                d.this.f50098b.a(cVar);
            }
        }).sendMsg();
    }

    public final void a(final List<i> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f50097a, false, 50128, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f50097a, false, 50128, new Class[]{List.class}, Void.TYPE);
            return;
        }
        new b(this.f50099c, new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50100a;

            public final void sendMsg() {
                if (PatchProxy.isSupport(new Object[0], this, f50100a, false, 50131, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50100a, false, 50131, new Class[0], Void.TYPE);
                    return;
                }
                d.this.f50098b.a(list);
            }
        }).sendMsg();
    }

    public d(IInputView iInputView, Context context) {
        this.f50098b = iInputView;
        this.f50099c = context;
    }
}
