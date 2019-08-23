package com.ss.android.ugc.aweme.comment.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.input.IInputView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.comment.i;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import kotlin.jvm.internal.Intrinsics;

public final class g implements IInputView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36589a;

    /* renamed from: b  reason: collision with root package name */
    public int f36590b;

    /* renamed from: c  reason: collision with root package name */
    private EditText f36591c;

    /* renamed from: d  reason: collision with root package name */
    private InputConnection f36592d = this.f36591c.onCreateInputConnection(new EditorInfo());

    /* renamed from: e  reason: collision with root package name */
    private n f36593e;

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{67}, this, f36589a, false, 27537, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{67}, this, f36589a, false, 27537, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        KeyEvent keyEvent = new KeyEvent(0, 67);
        if (this.f36592d != null) {
            this.f36592d.sendKeyEvent(keyEvent);
        } else {
            this.f36591c.dispatchKeyEvent(keyEvent);
        }
    }

    public final void a(String str, int i) {
        String str2 = str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f36589a, false, 27536, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f36589a, false, 27536, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (AbTestManager.a().aK()) {
            i iVar = i.f36472f;
            if (PatchProxy.isSupport(new Object[]{str2}, iVar, i.f36467a, false, 27175, new Class[]{String.class}, Void.TYPE)) {
                i iVar2 = iVar;
                PatchProxy.accessDispatch(new Object[]{str2}, iVar2, i.f36467a, false, 27175, new Class[]{String.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(str2, "emojiText");
                i.f36471e.set(true);
                if (iVar.b().contains(str2)) {
                    iVar.b().remove(str2);
                    iVar.b().addFirst(str2);
                } else {
                    iVar.b().addFirst(str2);
                    if (iVar.b().size() > 8) {
                        iVar.b().removeLast();
                    }
                }
            }
            if (i2 == 2) {
                this.f36593e.a(str2, i2);
            }
        }
        if (this.f36591c.getText().length() + str.length() > this.f36590b) {
            a.b((Context) com.ss.android.ugc.aweme.framework.e.a.a(), com.ss.android.ugc.aweme.framework.e.a.a().getResources().getString(C0906R.string.c43, new Object[]{Integer.valueOf(this.f36590b)})).a();
            return;
        }
        int selectionStart = this.f36591c.getSelectionStart();
        int selectionEnd = this.f36591c.getSelectionEnd();
        int max = Math.max(0, selectionStart);
        int max2 = Math.max(0, selectionEnd);
        if (max == max2) {
            this.f36591c.getText().insert(max, str2);
        } else {
            try {
                this.f36591c.getText().replace(max, max2, str2);
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        com.bytedance.ies.dmt.ui.input.emoji.g.a((TextView) this.f36591c);
        int length = max + str.length();
        if (length >= this.f36591c.length()) {
            this.f36591c.setSelection(this.f36591c.length());
        } else {
            this.f36591c.setSelection(length);
        }
    }

    g(EditText editText, int i, n nVar) {
        this.f36591c = editText;
        this.f36590b = i;
        this.f36593e = nVar;
    }
}
