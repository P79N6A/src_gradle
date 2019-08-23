package com.ss.android.ugc.aweme.utils;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class dz {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75788a;

    /* renamed from: b  reason: collision with root package name */
    List<String> f75789b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    String f75790c;

    /* renamed from: d  reason: collision with root package name */
    boolean f75791d = true;

    /* renamed from: e  reason: collision with root package name */
    private Gson f75792e = new Gson();

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f75788a, false, 88560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75788a, false, 88560, new Class[0], Void.TYPE);
            return;
        }
        this.f75790c = null;
        this.f75789b.clear();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75788a, false, 88559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75788a, false, 88559, new Class[0], Void.TYPE);
            return;
        }
        this.f75791d = false;
        b();
    }

    public final void a(EditText editText) {
        EditText editText2 = editText;
        if (PatchProxy.isSupport(new Object[]{editText2}, this, f75788a, false, 88556, new Class[]{EditText.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editText2}, this, f75788a, false, 88556, new Class[]{EditText.class}, Void.TYPE);
        } else if (editText2 != null) {
            editText2.addTextChangedListener(new TextWatcher() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f75793a;

                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    if (PatchProxy.isSupport(new Object[]{editable}, this, f75793a, false, 88561, new Class[]{Editable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{editable}, this, f75793a, false, 88561, new Class[]{Editable.class}, Void.TYPE);
                        return;
                    }
                    dz dzVar = dz.this;
                    String obj = editable.toString();
                    if (PatchProxy.isSupport(new Object[]{obj}, dzVar, dz.f75788a, false, 88557, new Class[]{String.class}, Void.TYPE)) {
                        dz dzVar2 = dzVar;
                        PatchProxy.accessDispatch(new Object[]{obj}, dzVar2, dz.f75788a, false, 88557, new Class[]{String.class}, Void.TYPE);
                    } else if (TextUtils.isEmpty(obj)) {
                        dzVar.f75791d = true;
                    } else {
                        if (dzVar.f75791d) {
                            if (TextUtils.isEmpty(dzVar.f75790c)) {
                                dzVar.f75789b.add(obj);
                                dzVar.f75790c = obj;
                                return;
                            }
                            int length = dzVar.f75790c.length();
                            int length2 = obj.length();
                            if (length != length2) {
                                if (length > length2) {
                                    dzVar.a();
                                } else if (!obj.startsWith(dzVar.f75790c)) {
                                    dzVar.a();
                                } else {
                                    dzVar.f75789b.add(obj.substring(length));
                                    dzVar.f75790c = obj;
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f75788a, false, 88558, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f75788a, false, 88558, new Class[]{String.class}, Void.TYPE);
        } else if (!this.f75789b.isEmpty() && this.f75791d) {
            r.a("input_word_cut", (Map) d.a().a("enter_from", str).a("input_content", this.f75790c).a("input_content_cut", this.f75792e.toJson((Object) this.f75789b)).f34114b);
            a();
        }
    }
}
