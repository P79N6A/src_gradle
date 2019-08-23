package com.ss.android.ugc.aweme.account.login.e;

import android.content.Context;
import android.support.annotation.NonNull;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.common.a.r;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32216a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f32217b = 86;

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f32218c;

    /* renamed from: d  reason: collision with root package name */
    private List<com.ss.android.ugc.aweme.account.login.model.a> f32219d = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.account.login.e.a$a  reason: collision with other inner class name */
    public static class C0407a implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("countryCode_")
        private int countryCode_ = 0;
        @SerializedName("countryIso_")
        private String countryIso_ = Locale.CHINA.getCountry();
        @SerializedName("nationalNumber_")
        private long nationalNumber_ = 0;
        @SerializedName("rawInput_")
        private String rawInput_ = "";

        public int getCountryCode() {
            return this.countryCode_;
        }

        public String getCountryIso() {
            return this.countryIso_;
        }

        public long getNationalNumber() {
            return this.nationalNumber_;
        }

        public String getRawInput() {
            return this.rawInput_;
        }

        public C0407a setCountryCode(int i) {
            this.countryCode_ = i;
            return this;
        }

        public void setCountryIso(String str) {
            this.countryIso_ = str;
        }

        public C0407a setNationalNumber(long j) {
            this.nationalNumber_ = j;
            return this;
        }

        public C0407a setRawInput(String str) {
            this.rawInput_ = str;
            return this;
        }
    }

    public static class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32220a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f32221b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f32222c;

        /* renamed from: d  reason: collision with root package name */
        private int f32223d;

        private void a() {
            this.f32222c = true;
        }

        public final synchronized void afterTextChanged(Editable editable) {
            String str;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{editable}, this, f32220a, false, 20814, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f32220a, false, 20814, new Class[]{Editable.class}, Void.TYPE);
            } else if (this.f32222c) {
                if (editable.length() == 0) {
                    z = false;
                }
                this.f32222c = z;
            } else if (!this.f32221b) {
                int selectionEnd = Selection.getSelectionEnd(editable);
                if (PatchProxy.isSupport(new Object[]{editable, Integer.valueOf(selectionEnd)}, this, f32220a, false, 20815, new Class[]{CharSequence.class, Integer.TYPE}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{editable, Integer.valueOf(selectionEnd)}, this, f32220a, false, 20815, new Class[]{CharSequence.class, Integer.TYPE}, String.class);
                } else {
                    int length = editable.length();
                    StringBuilder sb = new StringBuilder();
                    int i = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        int digit = Character.digit(editable.charAt(i2), 10);
                        if (digit != -1) {
                            sb.append(digit);
                            if ((sb.length() + 1) % 4 == 0) {
                                sb.append(' ');
                                if (i2 < selectionEnd) {
                                    i--;
                                }
                            }
                        } else if (i2 < selectionEnd) {
                            i++;
                        }
                    }
                    this.f32223d = selectionEnd - i;
                    str = sb.toString();
                }
                String str2 = str;
                this.f32221b = true;
                editable.replace(0, editable.length(), str2, 0, str2.length());
                if (str2.equals(editable.toString())) {
                    Selection.setSelection(editable, this.f32223d);
                }
                this.f32221b = false;
            }
        }

        private boolean a(CharSequence charSequence, int i, int i2) {
            CharSequence charSequence2 = charSequence;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f32220a, false, 20816, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f32220a, false, 20816, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            }
            for (int i3 = i; i3 < i + i2; i3++) {
                if (!PhoneNumberUtils.isNonSeparator(charSequence2.charAt(i3))) {
                    return true;
                }
            }
            return false;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f32220a, false, 20812, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f32220a, false, 20812, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (!this.f32221b && !this.f32222c && i2 > 0 && a(charSequence, i, i2)) {
                a();
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2 = charSequence;
            int i4 = i3;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f32220a, false, 20813, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f32220a, false, 20813, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (!this.f32221b && !this.f32222c && i4 > 0 && a(charSequence2, i, i4)) {
                a();
            }
        }
    }

    public static a a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f32216a, true, 20806, new Class[]{Context.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context}, null, f32216a, true, 20806, new Class[]{Context.class}, a.class);
        }
        if (f32218c == null) {
            synchronized (a.class) {
                if (f32218c == null) {
                    a aVar = new a();
                    f32218c = aVar;
                    aVar.f32219d = com.ss.android.ugc.aweme.account.login.model.a.b();
                }
            }
        }
        return f32218c;
    }

    @NonNull
    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f32216a, true, 20807, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f32216a, true, 20807, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            int length = str.length();
            if (length < 4) {
                return str2;
            }
            int max = Math.max(length - 7, 2);
            int min = Math.min(max + 4, length - 1);
            return new StringBuilder(str2).replace(max, min, r.a("*", min - max)).toString();
        }
    }

    public final int a(String str, String str2) {
        String str3;
        a aVar;
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f32216a, false, 20805, new Class[]{String.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f32216a, false, 20805, new Class[]{String.class, String.class}, Integer.TYPE)).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            aVar = this;
            str3 = str2;
        } else {
            aVar = this;
            str3 = str;
        }
        for (com.ss.android.ugc.aweme.account.login.model.a next : aVar.f32219d) {
            if (TextUtils.equals(next.f32262d, str3)) {
                return next.a();
            }
        }
        return f32217b;
    }
}
