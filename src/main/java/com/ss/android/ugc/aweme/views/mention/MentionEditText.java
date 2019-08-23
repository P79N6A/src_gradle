package com.ss.android.ugc.aweme.views.mention;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MentionEditText extends DmtEditText {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f76487d;

    /* renamed from: a  reason: collision with root package name */
    private Runnable f76488a;

    /* renamed from: e  reason: collision with root package name */
    protected int f76489e;

    /* renamed from: f  reason: collision with root package name */
    protected int f76490f;
    public boolean g;
    public c h;
    protected List<c> i;
    public e j;
    protected List<TextWatcher> k = new ArrayList();
    public Set<String> l = new HashSet();
    public View.OnKeyListener m;

    class a extends InputConnectionWrapper {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76493a;

        /* renamed from: c  reason: collision with root package name */
        private EditText f76495c;

        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            if (PatchProxy.isSupport(new Object[]{keyEvent}, this, f76493a, false, 89735, new Class[]{KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{keyEvent}, this, f76493a, false, 89735, new Class[]{KeyEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (MentionEditText.this.m != null) {
                return MentionEditText.this.m.onKey(MentionEditText.this, keyEvent.getKeyCode(), keyEvent);
            } else {
                if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
                    return super.sendKeyEvent(keyEvent);
                }
                int selectionStart = this.f76495c.getSelectionStart();
                c a2 = MentionEditText.this.a(selectionStart, this.f76495c.getSelectionEnd());
                if (a2 == null) {
                    MentionEditText.this.g = false;
                    return super.sendKeyEvent(keyEvent);
                } else if (MentionEditText.this.g || selectionStart == a2.f76513a) {
                    MentionEditText.this.g = false;
                    return super.sendKeyEvent(keyEvent);
                } else {
                    MentionEditText.this.g = true;
                    MentionEditText.this.h = a2;
                    if (Build.VERSION.SDK_INT >= 25) {
                        setSelection(a2.f76513a, a2.f76514b);
                    } else {
                        setSelection(a2.f76514b, a2.f76513a);
                    }
                    return true;
                }
            }
        }

        public final boolean commitText(CharSequence charSequence, int i) {
            if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i)}, this, f76493a, false, 89737, new Class[]{CharSequence.class, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i)}, this, f76493a, false, 89737, new Class[]{CharSequence.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            }
            try {
                return super.commitText(charSequence, i);
            } catch (NullPointerException unused) {
                return true;
            }
        }

        public final boolean deleteSurroundingText(int i, int i2) {
            int i3;
            int i4;
            int i5 = i;
            int i6 = i2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f76493a, false, 89736, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f76493a, false, 89736, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (i5 == 1 && i6 == 0) {
                Editable text = MentionEditText.this.getText();
                if (text != null && text.length() > 0) {
                    int max = Math.max(MentionEditText.this.getSelectionStart() - 1, 0);
                    int selectionEnd = MentionEditText.this.getSelectionEnd();
                    if (max > selectionEnd) {
                        int i7 = selectionEnd;
                        selectionEnd = max;
                        max = i7;
                    }
                    text.delete(max, selectionEnd);
                }
                return false;
            } else {
                if (i5 < 0) {
                    i4 = -i6;
                    i3 = -i5;
                } else {
                    i4 = i5;
                    i3 = i6;
                }
                return super.deleteSurroundingText(i4, i3);
            }
        }

        a(InputConnection inputConnection, boolean z, MentionEditText mentionEditText) {
            super(inputConnection, true);
            this.f76495c = mentionEditText;
        }
    }

    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76500a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (PatchProxy.isSupport(new Object[]{parcel2}, this, f76500a, false, 89739, new Class[]{Parcel.class}, b.class)) {
                    return (b) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f76500a, false, 89739, new Class[]{Parcel.class}, b.class);
                }
                try {
                    return new b(parcel2, (byte) 0);
                } catch (Exception unused) {
                    return null;
                }
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76496a;

        /* renamed from: b  reason: collision with root package name */
        public String f76497b;

        /* renamed from: c  reason: collision with root package name */
        public int f76498c;

        /* renamed from: d  reason: collision with root package name */
        public List<TextExtraStruct> f76499d;

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f76497b = parcel.readString();
            this.f76498c = parcel.readInt();
            Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
            if (readBundle != null) {
                this.f76499d = readBundle.getParcelableArrayList("text_extra_struct");
            }
        }

        /* synthetic */ b(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f76496a, false, 89738, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f76496a, false, 89738, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f76497b);
            parcel.writeInt(this.f76498c);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("text_extra_struct", (ArrayList) this.f76499d);
            parcel.writeBundle(bundle);
        }
    }

    public static class c extends ForegroundColorSpan {
        public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76507a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f76507a, false, 89745, new Class[]{Parcel.class}, c.class)) {
                    return new c(parcel2);
                }
                return (c) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f76507a, false, 89745, new Class[]{Parcel.class}, c.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76501a;

        /* renamed from: b  reason: collision with root package name */
        public String f76502b;

        /* renamed from: c  reason: collision with root package name */
        public String f76503c;

        /* renamed from: d  reason: collision with root package name */
        public int f76504d;

        /* renamed from: e  reason: collision with root package name */
        public TextExtraStruct f76505e;

        /* renamed from: f  reason: collision with root package name */
        public String f76506f = "";

        public int describeContents() {
            return 0;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[0], this, f76501a, false, 89744, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76501a, false, 89744, new Class[0], Integer.TYPE)).intValue();
            }
            if (this.f76502b != null) {
                i = this.f76502b.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            if (this.f76503c != null) {
                i2 = this.f76503c.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (((i4 + i2) * 31) + this.f76504d) * 31;
            if (this.f76505e != null) {
                i3 = this.f76505e.hashCode();
            }
            return i5 + i3;
        }

        public c(Parcel parcel) {
            super(parcel);
            this.f76502b = parcel.readString();
            this.f76503c = parcel.readString();
            this.f76504d = parcel.readInt();
            this.f76505e = (TextExtraStruct) parcel.readParcelable(TextExtraStruct.class.getClassLoader());
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f76501a, false, 89740, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f76501a, false, 89740, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.f76505e.setStarAtlasTag(z);
        }

        public boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f76501a, false, 89743, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f76501a, false, 89743, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (this == obj) {
                return true;
            } else {
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (this.f76504d != cVar.f76504d) {
                    return false;
                }
                if (this.f76502b == null ? cVar.f76502b != null : !this.f76502b.equals(cVar.f76502b)) {
                    return false;
                }
                if (this.f76503c == null ? cVar.f76503c != null : !this.f76503c.equals(cVar.f76503c)) {
                    return false;
                }
                if (this.f76505e != null) {
                    return this.f76505e.equals(cVar.f76505e);
                }
                if (cVar.f76505e == null) {
                    return true;
                }
                return false;
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f76501a, false, 89742, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f76501a, false, 89742, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            parcel.writeString(this.f76502b);
            parcel.writeString(this.f76503c);
            parcel.writeInt(this.f76504d);
            parcel.writeParcelable(this.f76505e, i);
        }

        public c(int i, String str, String str2, int i2, String str3) {
            super(i);
            this.f76502b = str2;
            this.f76503c = str;
            this.f76504d = i2;
            this.f76505e = new TextExtraStruct();
            this.f76505e.setUserId(str2);
            this.f76505e.setType(i2);
            this.f76505e.setAtUserType(str3);
        }
    }

    class d implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76508a;

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private d() {
        }

        /* synthetic */ d(MentionEditText mentionEditText, byte b2) {
            this();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76508a, false, 89746, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76508a, false, 89746, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i3 == 1 && !TextUtils.isEmpty(charSequence)) {
                int i4 = i;
                if ('@' == charSequence.toString().charAt(i) && MentionEditText.this.j != null) {
                    MentionEditText.this.j.a();
                }
            }
        }
    }

    public interface e {
        void a();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f76487d, false, 89709, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76487d, false, 89709, new Class[0], Void.TYPE);
            return;
        }
        for (TextWatcher removeTextChangedListener : this.k) {
            super.removeTextChangedListener(removeTextChangedListener);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f76487d, false, 89710, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76487d, false, 89710, new Class[0], Void.TYPE);
            return;
        }
        for (TextWatcher addTextChangedListener : this.k) {
            super.addTextChangedListener(addTextChangedListener);
        }
    }

    public List<TextExtraStruct> getCompatTextExtraStructList() {
        if (!PatchProxy.isSupport(new Object[0], this, f76487d, false, 89730, new Class[0], List.class)) {
            return getTextExtraStructList();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f76487d, false, 89730, new Class[0], List.class);
    }

    public int getMentionTextCount() {
        if (PatchProxy.isSupport(new Object[0], this, f76487d, false, 89725, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76487d, false, 89725, new Class[0], Integer.TYPE)).intValue();
        }
        c[] mentionText = getMentionText();
        if (mentionText == null) {
            return 0;
        }
        return mentionText.length;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76487d, false, 89712, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76487d, false, 89712, new Class[0], Void.TYPE);
            return;
        }
        this.i = new ArrayList(5);
        this.f76489e = -65536;
        addTextChangedListener(new d(this, (byte) 0));
        if (ey.a(getContext())) {
            if (Build.VERSION.SDK_INT >= 17) {
                setTextAlignment(5);
            }
            setGravity(getGravity() | 8388611);
        }
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f76487d, false, 89713, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76487d, false, 89713, new Class[0], Void.TYPE);
            return;
        }
        this.g = false;
        if (this.i != null) {
            this.i.clear();
        }
        Editable text = getText();
        if (text != null && !TextUtils.isEmpty(text.toString())) {
            for (c cVar : getMentionText()) {
                c cVar2 = new c(text.getSpanStart(cVar), text.getSpanEnd(cVar));
                if (!TextUtils.equals(text.subSequence(cVar2.f76513a, cVar2.f76514b).toString(), cVar.f76503c)) {
                    text.removeSpan(cVar);
                } else if (cVar.f76504d == 0) {
                    this.i.add(cVar2);
                }
            }
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f76487d, false, 89724, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76487d, false, 89724, new Class[0], Void.TYPE);
            return;
        }
        Editable text = getText();
        String obj = text.toString();
        int length = obj.length();
        int i2 = 0;
        while (i2 < length && obj.charAt(i2) <= ' ') {
            i2++;
        }
        int i3 = length;
        while (i3 > i2 && obj.charAt(i3 - 1) <= ' ') {
            i3--;
        }
        if (i2 < i3) {
            int i4 = i3 + 1;
            if (i4 < length) {
                text.delete(i4, length);
            }
            text.delete(0, i2);
            return;
        }
        setText("");
    }

    public c[] getMentionText() {
        if (PatchProxy.isSupport(new Object[0], this, f76487d, false, 89726, new Class[0], c[].class)) {
            return (c[]) PatchProxy.accessDispatch(new Object[0], this, f76487d, false, 89726, new Class[0], c[].class);
        }
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        c[] cVarArr = (c[]) text.getSpans(0, text.length(), c.class);
        Arrays.sort(cVarArr, new a(text));
        return cVarArr;
    }

    public ArrayList<TextExtraStruct> getStarAtlasExtraList() {
        if (PatchProxy.isSupport(new Object[0], this, f76487d, false, 89721, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, f76487d, false, 89721, new Class[0], ArrayList.class);
        }
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        for (c cVar : getMentionText()) {
            if (cVar.f76505e.isStarAtlasTag()) {
                cVar.f76505e.setStart(text.getSpanStart(cVar));
                cVar.f76505e.setEnd(text.getSpanEnd(cVar));
                arrayList.add(cVar.f76505e);
            }
        }
        return arrayList;
    }

    public ArrayList<TextExtraStruct> getTextExtraStructList() {
        if (PatchProxy.isSupport(new Object[0], this, f76487d, false, 89720, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, f76487d, false, 89720, new Class[0], ArrayList.class);
        }
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        for (c cVar : getMentionText()) {
            if (cVar.f76504d == 0) {
                cVar.f76505e.setStart(text.getSpanStart(cVar));
                cVar.f76505e.setEnd(text.getSpanEnd(cVar));
                arrayList.add(cVar.f76505e);
            }
        }
        return arrayList;
    }

    public Parcelable onSaveInstanceState() {
        if (PatchProxy.isSupport(new Object[0], this, f76487d, false, 89729, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f76487d, false, 89729, new Class[0], Parcelable.class);
        }
        b bVar = new b(super.onSaveInstanceState());
        bVar.f76497b = getText().toString();
        bVar.f76498c = Math.max(getSelectionEnd(), 0);
        bVar.f76499d = getCompatTextExtraStructList();
        return bVar;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f76487d, false, 89719, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76487d, false, 89719, new Class[0], Void.TYPE);
            return;
        }
        if (!(getStarAtlasExtraList() == null || getText() == null)) {
            Iterator<TextExtraStruct> it2 = getStarAtlasExtraList().iterator();
            while (it2.hasNext()) {
                TextExtraStruct next = it2.next();
                if (next.isStarAtlasTag()) {
                    if (getText().charAt(next.getEnd()) == ' ') {
                        setText(getText().replace(next.getStart(), next.getEnd() + 1, ""));
                    } else {
                        setText(getText().replace(next.getStart(), next.getEnd(), ""));
                    }
                }
            }
        }
    }

    public void setMentionTextColor(int i2) {
        this.f76489e = i2;
    }

    public void setOnMentionInputListener(e eVar) {
        this.j = eVar;
    }

    public void setStarAtlasMentionTextColor(int i2) {
        this.f76490f = i2;
    }

    public MentionEditText(Context context) {
        super(context);
        a();
    }

    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        View.OnKeyListener onKeyListener2 = onKeyListener;
        if (PatchProxy.isSupport(new Object[]{onKeyListener2}, this, f76487d, false, 89732, new Class[]{View.OnKeyListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onKeyListener2}, this, f76487d, false, 89732, new Class[]{View.OnKeyListener.class}, Void.TYPE);
            return;
        }
        this.m = onKeyListener2;
        super.setOnKeyListener(onKeyListener);
    }

    private void setClip(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f76487d, false, 89728, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f76487d, false, 89728, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ((ClipboardManager) getContext().getSystemService("clipboard")).setText(str2);
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        if (PatchProxy.isSupport(new Object[]{textWatcher}, this, f76487d, false, 89706, new Class[]{TextWatcher.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textWatcher}, this, f76487d, false, 89706, new Class[]{TextWatcher.class}, Void.TYPE);
            return;
        }
        super.addTextChangedListener(textWatcher);
        if (!(this.k == null || textWatcher == null)) {
            this.k.add(textWatcher);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (PatchProxy.isSupport(new Object[]{editorInfo}, this, f76487d, false, 89704, new Class[]{EditorInfo.class}, InputConnection.class)) {
            return (InputConnection) PatchProxy.accessDispatch(new Object[]{editorInfo}, this, f76487d, false, 89704, new Class[]{EditorInfo.class}, InputConnection.class);
        }
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        return new a(onCreateInputConnection, true, this);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f76487d, false, 89731, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f76487d, false, 89731, new Class[]{Parcelable.class}, Void.TYPE);
        } else if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            b bVar = (b) parcelable;
            super.onRestoreInstanceState(bVar.getSuperState());
            setText(bVar.f76497b);
            int min = Math.min(bVar.f76498c, getText().length());
            if (min >= 0) {
                setSelection(min);
            }
            setTextExtraList(bVar.f76499d);
        }
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        if (PatchProxy.isSupport(new Object[]{textWatcher}, this, f76487d, false, 89707, new Class[]{TextWatcher.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textWatcher}, this, f76487d, false, 89707, new Class[]{TextWatcher.class}, Void.TYPE);
            return;
        }
        super.removeTextChangedListener(textWatcher);
        if (!(this.k == null || textWatcher == null)) {
            this.k.remove(textWatcher);
        }
    }

    public boolean onTextContextMenuItem(int i2) {
        int i3;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f76487d, false, 89727, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f76487d, false, 89727, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        String str = "";
        if (i4 == 16908320 || i4 == 16908321) {
            int length = getText().length();
            if (isFocused()) {
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                i3 = Math.max(0, Math.min(selectionStart, selectionEnd));
                length = Math.max(0, Math.max(selectionStart, selectionEnd));
            } else {
                i3 = 0;
            }
            str = getText().subSequence(i3, length).toString();
        }
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i2);
        if (i4 == 16908320 || i4 == 16908321) {
            setClip(str);
        }
        return onTextContextMenuItem;
    }

    public void setTextExtraList(List<TextExtraStruct> list) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f76487d, false, 89723, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f76487d, false, 89723, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.g = false;
        if (this.i != null) {
            this.i.clear();
        }
        if (list != null && !list.isEmpty()) {
            Editable text = getText();
            if (text != null && !TextUtils.isEmpty(text.toString())) {
                int length = text.length();
                for (TextExtraStruct next : list) {
                    if (next.isStarAtlasTag()) {
                        i2 = this.f76490f;
                    } else {
                        i2 = this.f76489e;
                    }
                    int i3 = i2;
                    if (next.getType() == 0 && next.getStart() <= length && next.getEnd() <= length && next.getStart() <= next.getEnd()) {
                        c cVar = new c(i3, text.subSequence(next.getStart(), next.getEnd()).toString(), next.getUserId(), next.getType(), next.getAtUserType());
                        cVar.a(next.isStarAtlasTag());
                        if (!TextUtils.isEmpty(next.getAwemeId())) {
                            String awemeId = next.getAwemeId();
                            if (PatchProxy.isSupport(new Object[]{awemeId}, cVar, c.f76501a, false, 89741, new Class[]{String.class}, Void.TYPE)) {
                                c cVar2 = cVar;
                                PatchProxy.accessDispatch(new Object[]{awemeId}, cVar2, c.f76501a, false, 89741, new Class[]{String.class}, Void.TYPE);
                            } else {
                                cVar.f76506f = awemeId;
                                cVar.f76505e.setAwemeId(awemeId);
                            }
                        }
                        text.setSpan(cVar, next.getStart(), next.getEnd(), 33);
                        this.i.add(new c(next.getStart(), next.getEnd()));
                    }
                }
            }
        }
    }

    public MentionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (PatchProxy.isSupport(new Object[]{charSequence, bufferType}, this, f76487d, false, 89705, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence, bufferType}, this, f76487d, false, 89705, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE);
            return;
        }
        try {
            super.setText(charSequence, bufferType);
        } catch (Exception unused) {
        }
        if (this.f76488a == null) {
            this.f76488a = new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76491a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f76491a, false, 89734, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f76491a, false, 89734, new Class[0], Void.TYPE);
                        return;
                    }
                    MentionEditText.this.setSelection(MentionEditText.this.getText().length());
                }
            };
        }
        post(this.f76488a);
    }

    private c b(int i2, int i3) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76487d, false, 89715, new Class[]{Integer.TYPE, Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76487d, false, 89715, new Class[]{Integer.TYPE, Integer.TYPE}, c.class);
        } else if (this.i == null) {
            return null;
        } else {
            for (c next : this.i) {
                if ((i2 <= next.f76513a || i2 >= next.f76514b) && (i3 <= next.f76513a || i3 >= next.f76514b)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    return next;
                }
            }
            return null;
        }
    }

    public final c a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76487d, false, 89714, new Class[]{Integer.TYPE, Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76487d, false, 89714, new Class[]{Integer.TYPE, Integer.TYPE}, c.class);
        } else if (this.i == null) {
            return null;
        } else {
            for (c next : this.i) {
                if (next.a(i2, i3)) {
                    return next;
                }
            }
            return null;
        }
    }

    public void onSelectionChanged(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76487d, false, 89711, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76487d, false, 89711, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSelectionChanged(i2, i3);
        if (getStarAtlasExtraList() != null && !TextUtils.isEmpty(getText())) {
            Iterator<TextExtraStruct> it2 = getStarAtlasExtraList().iterator();
            while (it2.hasNext()) {
                TextExtraStruct next = it2.next();
                if (i2 < next.getEnd() + 1) {
                    i5 = next.getEnd() + 1;
                } else {
                    i5 = i2;
                }
                if (i3 < next.getEnd() + 1) {
                    i6 = next.getEnd() + 1;
                } else {
                    i6 = i3;
                }
                if (i5 > getText().length()) {
                    i5 = getText().length();
                }
                if (i6 > getText().length()) {
                    i6 = getText().length();
                }
                setSelection(i5, i6);
            }
        }
        if (this.h != null) {
            c cVar = this.h;
            if (!((cVar.f76513a == i2 && cVar.f76514b == i3) || (cVar.f76513a == i3 && cVar.f76514b == i2))) {
                z = false;
            }
            if (z) {
                return;
            }
        }
        c a2 = a(i2, i3);
        if (a2 != null && a2.f76514b == i3) {
            this.g = false;
        }
        c b2 = b(i2, i3);
        if (b2 != null) {
            if (i2 == i3) {
                try {
                    if ((i2 - b2.f76513a) - (b2.f76514b - i2) >= 0) {
                        i4 = b2.f76514b;
                    } else {
                        i4 = b2.f76513a;
                    }
                    setSelection(i4);
                } catch (IndexOutOfBoundsException unused) {
                }
                return;
            }
            if (i3 < b2.f76514b) {
                setSelection(i2, b2.f76514b);
            }
            if (i2 > b2.f76513a) {
                setSelection(b2.f76513a, i3);
            }
        }
    }

    public MentionEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }

    public final boolean a(int i2, String str, String str2) {
        if (!PatchProxy.isSupport(new Object[]{0, str, str2}, this, f76487d, false, 89716, new Class[]{Integer.TYPE, String.class, String.class}, Boolean.TYPE)) {
            return a(0, str, str2, "", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{0, str, str2}, this, f76487d, false, 89716, new Class[]{Integer.TYPE, String.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f76487d, false, 89708, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f76487d, false, 89708, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        f();
    }

    public final boolean a(int i2, String str, String str2, String str3, boolean z) {
        int i3;
        String str4;
        String str5;
        int i4;
        int i5;
        int i6 = i2;
        String str6 = str;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str6, str2, str3, Byte.valueOf(z ? (byte) 1 : 0)}, this, f76487d, false, 89718, new Class[]{Integer.TYPE, String.class, String.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str6, str2, str3, Byte.valueOf(z)}, this, f76487d, false, 89718, new Class[]{Integer.TYPE, String.class, String.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (z2) {
            i3 = 0;
        } else {
            i3 = getSelectionStart();
        }
        Editable text = getText();
        if (text == null) {
            return false;
        }
        if (i6 == 0) {
            str4 = "@";
        } else if (i6 == 1) {
            str4 = "#";
        } else {
            str4 = "";
        }
        SpannableString spannableString = new SpannableString(str5 + str6);
        if (z2) {
            i4 = this.f76490f;
        } else {
            i4 = this.f76489e;
        }
        SpannableString spannableString2 = spannableString;
        String str7 = str5;
        c cVar = new c(i4, spannableString.toString(), str2, i2, str3);
        b.a(spannableString2, cVar, 0, spannableString2.length(), 33);
        cVar.a(z2);
        c[] mentionText = getMentionText();
        if (!z2 && mentionText != null && Arrays.asList(mentionText).contains(cVar)) {
            return false;
        }
        if (TextUtils.isEmpty(text)) {
            text.insert(0, spannableString2);
            text.append(" ");
            return true;
        }
        int length = text.length();
        if (z2) {
            if (text.length() + spannableString2.length() + 1 > 100) {
                if (spannableString2.length() + 1 > text.length()) {
                    i5 = text.length();
                } else {
                    i5 = spannableString2.length() + 1;
                }
                text.delete(0, i5);
            }
            text.insert(i3, " ");
            text.insert(i3, spannableString2);
        } else if (i3 <= length && i3 >= 0) {
            if (i3 > 0) {
                int i7 = i3 - 1;
                if (TextUtils.equals(text.subSequence(i7, i3), str7)) {
                    text.delete(i7, i3);
                    i3--;
                    length--;
                }
            }
            int min = Math.min(length, Math.max(0, i3));
            text.insert(min, spannableString2);
            text.insert(Math.min(min + spannableString2.length(), text.length()), " ");
        }
        return true;
    }
}
