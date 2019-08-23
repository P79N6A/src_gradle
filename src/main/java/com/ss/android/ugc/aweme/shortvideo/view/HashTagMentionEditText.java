package com.ss.android.ugc.aweme.shortvideo.view;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.o.h;
import com.ss.android.ugc.aweme.video.hashtag.a;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.aweme.views.mention.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashTagMentionEditText extends MentionEditText {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71258a;

    /* renamed from: b  reason: collision with root package name */
    public int f71259b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.n.a f71260c;
    private String n = "";
    private boolean o;

    class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71261a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private a() {
        }

        public final void afterTextChanged(Editable editable) {
            if (PatchProxy.isSupport(new Object[]{editable}, this, f71261a, false, 81240, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f71261a, false, 81240, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            HashTagMentionEditText.this.post(new h(this));
        }

        /* synthetic */ a(HashTagMentionEditText hashTagMentionEditText, byte b2) {
            this();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71261a, false, 81239, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71261a, false, 81239, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (com.ss.android.ugc.aweme.port.in.a.j.e() && HashTagMentionEditText.this.f71259b != 0 && HashTagMentionEditText.this.f71260c != null) {
                Editable text = HashTagMentionEditText.this.getText();
                com.ss.android.ugc.aweme.shortvideo.n.a[] aVarArr = (com.ss.android.ugc.aweme.shortvideo.n.a[]) text.getSpans(0, text.length(), com.ss.android.ugc.aweme.shortvideo.n.a.class);
                if (aVarArr != null) {
                    i4 = aVarArr.length;
                }
                if (HashTagMentionEditText.this.f71259b == 1 && i4 == 0) {
                    HashTagMentionEditText.this.a();
                }
                HashTagMentionEditText.this.f71259b = i4;
            }
        }
    }

    public String getCreationId() {
        return this.n;
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f71258a, false, 81225, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71258a, false, 81225, new Class[0], Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.port.in.a.x.a()) {
            addTextChangedListener(new a(this, (byte) 0));
        }
    }

    public List<TextExtraStruct> getCompatTextExtraStructList() {
        if (!PatchProxy.isSupport(new Object[0], this, f71258a, false, 81226, new Class[0], List.class)) {
            return getTextExtraStructListWithHashTag();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f71258a, false, 81226, new Class[0], List.class);
    }

    public List<TextExtraStruct> getTextExtraStructListWithHashTag() {
        if (PatchProxy.isSupport(new Object[0], this, f71258a, false, 81234, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f71258a, false, 81234, new Class[0], List.class);
        }
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MentionEditText.c cVar : getMentionText()) {
            if (cVar.f76504d == 0) {
                cVar.f76505e.setStart(text.getSpanStart(cVar));
                cVar.f76505e.setEnd(text.getSpanEnd(cVar));
                arrayList.add(cVar.f76505e);
            }
        }
        List<com.ss.android.ugc.aweme.video.hashtag.a> a2 = a(getText().toString());
        for (com.ss.android.ugc.aweme.video.hashtag.a next : a2) {
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(1);
            textExtraStruct.setStarAtlasTag(a(a2.indexOf(next)));
            textExtraStruct.setHashTagName(next.f76101d.toLowerCase().replaceAll("#", ""));
            textExtraStruct.setStart(next.f76099b);
            textExtraStruct.setEnd(next.f76100c);
            arrayList.add(textExtraStruct);
            com.ss.android.ugc.aweme.port.in.a.k.a(System.currentTimeMillis(), textExtraStruct.getHashTagName());
        }
        return arrayList;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f71258a, false, 81237, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71258a, false, 81237, new Class[0], Void.TYPE);
        } else if (!this.o) {
            r.a("caption_delete", (Map) d.a().a("creation_id", this.n).f34114b);
            this.o = true;
        }
    }

    public void setCreationId(String str) {
        this.n = str;
    }

    public HashTagMentionEditText(Context context) {
        super(context);
        f();
    }

    public void setAVTextExtraList(List<AVTextExtraStruct> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f71258a, false, 81227, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f71258a, false, 81227, new Class[]{List.class}, Void.TYPE);
            return;
        }
        setTextExtraList(h.a(list));
    }

    private boolean a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71258a, false, 81229, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71258a, false, 81229, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        MentionEditText.c[] mentionText = getMentionText();
        if (i2 < 0 || i2 >= mentionText.length) {
            return false;
        }
        return mentionText[i2].f76505e.isStarAtlasTag();
    }

    private boolean a(Editable editable) {
        Editable editable2 = editable;
        if (PatchProxy.isSupport(new Object[]{editable2}, this, f71258a, false, 81232, new Class[]{Editable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{editable2}, this, f71258a, false, 81232, new Class[]{Editable.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f71260c == null) {
            return false;
        } else {
            for (MentionEditText.c cVar : (MentionEditText.c[]) editable2.getSpans(0, editable.length(), MentionEditText.c.class)) {
                if (!TextUtils.isEmpty(cVar.f76506f)) {
                    return true;
                }
            }
            return false;
        }
    }

    private List<com.ss.android.ugc.aweme.video.hashtag.a> a(String str) {
        ArrayList<String> arrayList;
        boolean z;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f71258a, false, 81233, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2}, this, f71258a, false, 81233, new Class[]{String.class}, List.class);
        }
        HashSet hashSet = new HashSet();
        boolean a2 = com.ss.android.g.a.a();
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(a2 ? (byte) 1 : 0)}, null, com.ss.android.ugc.aweme.video.hashtag.d.f76111a, true, 89099, new Class[]{String.class, Boolean.TYPE}, ArrayList.class)) {
            arrayList = (ArrayList) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(a2)}, null, com.ss.android.ugc.aweme.video.hashtag.d.f76111a, true, 89099, new Class[]{String.class, Boolean.TYPE}, ArrayList.class);
        } else {
            arrayList = com.ss.android.ugc.aweme.video.hashtag.d.a(str2, com.ss.android.ugc.aweme.video.hashtag.d.a(a2));
        }
        int i = 0;
        for (String next : arrayList) {
            int indexOf = str2.indexOf(next, i);
            if (indexOf >= 0) {
                Iterator it2 = this.l.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (indexOf == str2.indexOf((String) it2.next(), i)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                int length = next.length() + indexOf;
                if (!z) {
                    hashSet.add(new com.ss.android.ugc.aweme.video.hashtag.a(next, indexOf, length));
                }
                i = length;
            }
        }
        for (String str3 : this.l) {
            int i2 = 0;
            while (i2 < str.length()) {
                int indexOf2 = str2.indexOf(str3, i2);
                if (indexOf2 < 0) {
                    break;
                }
                int length2 = str3.length() + indexOf2;
                hashSet.add(new com.ss.android.ugc.aweme.video.hashtag.a(str3, indexOf2, length2));
                i2 = length2;
            }
        }
        ArrayList arrayList2 = new ArrayList(hashSet);
        Collections.sort(arrayList2, new a.C0794a());
        return arrayList2;
    }

    public void setTextExtraList(List<TextExtraStruct> list) {
        int i;
        if (PatchProxy.isSupport(new Object[]{list}, this, f71258a, false, 81228, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f71258a, false, 81228, new Class[]{List.class}, Void.TYPE);
            return;
        }
        super.setTextExtraList(list);
        Editable text = getText();
        if (text != null && !TextUtils.isEmpty(text.toString())) {
            int length = text.length();
            if (!CollectionUtils.isEmpty(list)) {
                for (TextExtraStruct next : list) {
                    if (next != null) {
                        if (next.getType() == 1) {
                            if (next.getStart() <= length && next.getEnd() <= length && next.getStart() <= next.getEnd()) {
                                if (next.isStarAtlasTag()) {
                                    i = this.f76490f;
                                } else {
                                    i = this.f76489e;
                                }
                                MentionEditText.c cVar = new MentionEditText.c(i, text.subSequence(next.getStart(), next.getEnd()).toString(), next.getUserId(), next.getType(), next.getAtUserType());
                                cVar.a(next.isStarAtlasTag());
                                text.setSpan(cVar, next.getStart(), next.getEnd(), 33);
                            }
                        }
                        if (com.ss.android.ugc.aweme.port.in.a.j.e() && next.getType() == 0 && !TextUtils.isEmpty(next.getAwemeId()) && next.getStart() <= length && next.getEnd() <= length && next.getStart() <= next.getEnd()) {
                            if (next.getEnd() < length && text.charAt(next.getEnd()) == 160) {
                                text.replace(next.getEnd(), next.getEnd() + 1, " ");
                            }
                            this.f71260c = new com.ss.android.ugc.aweme.shortvideo.n.a(getContext(), this, (int) (((float) UIUtils.getScreenWidth(getContext())) - UIUtils.dip2Px(getContext(), 128.0f)));
                            text.setSpan(this.f71260c, next.getStart(), next.getEnd(), 33);
                            this.f71259b = 1;
                        }
                    }
                }
            }
        }
    }

    public final void a(boolean z) {
        int i;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f71258a, false, 81230, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f71258a, false, 81230, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (getText() != null) {
            System.currentTimeMillis();
            b();
            ArrayList<c> arrayList = new ArrayList<>();
            String obj = getText().toString();
            for (com.ss.android.ugc.aweme.video.hashtag.a next : a(obj)) {
                arrayList.add(new c(next.f76099b, next.f76100c));
            }
            ArrayList<c> arrayList2 = new ArrayList<>(arrayList);
            if (this.i != null && !this.i.isEmpty()) {
                arrayList2.addAll(this.i);
            }
            if (PatchProxy.isSupport(new Object[]{arrayList2}, this, f71258a, false, 81235, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{arrayList2}, this, f71258a, false, 81235, new Class[]{List.class}, Void.TYPE);
            } else {
                Collections.sort(arrayList2, g.f71304b);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (c cVar : arrayList) {
                if (z2 || cVar.a(getSelectionStart() - 1, getSelectionEnd() - 1) || cVar.a(getSelectionStart() + 1, getSelectionEnd() + 1)) {
                    spannableStringBuilder.append(obj.substring(cVar.f76513a, cVar.f76514b));
                    boolean a2 = a(arrayList.indexOf(cVar));
                    if (a2) {
                        i = this.f76490f;
                    } else {
                        i = this.f76489e;
                    }
                    MentionEditText.c cVar2 = new MentionEditText.c(i, spannableStringBuilder.toString(), "", 1, "");
                    cVar2.a(a2);
                    b(cVar.f76513a, cVar.f76514b);
                    getText().setSpan(cVar2, cVar.f76513a, cVar.f76514b, 33);
                    spannableStringBuilder.clear();
                }
            }
            int length = obj.length();
            int i2 = 0;
            for (c cVar3 : arrayList2) {
                if (i2 >= 0 && cVar3.f76513a <= length && i2 <= cVar3.f76513a) {
                    b(i2, cVar3.f76513a);
                    i2 = cVar3.f76514b;
                }
            }
            if (i2 <= length) {
                b(i2, length);
            }
            if (PatchProxy.isSupport(new Object[0], this, f71258a, false, 81231, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71258a, false, 81231, new Class[0], Void.TYPE);
            } else if (com.ss.android.ugc.aweme.port.in.a.j.e() && this.f71260c != null) {
                Editable text = getText();
                if (text.length() != 0 && !a(text)) {
                    text.removeSpan(this.f71260c);
                    this.f71260c = null;
                    a();
                }
            }
            c();
            com.ss.android.ugc.aweme.framework.a.a.a("MentionEditText", "full: " + z2 + "\n  text: " + getText().toString() + " and se: " + getSelectionEnd());
        }
    }

    public HashTagMentionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f();
    }

    private void b(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71258a, false, 81236, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71258a, false, 81236, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i3 < i4 && getText() != null) {
            for (MentionEditText.c removeSpan : (MentionEditText.c[]) getText().getSpans(i3, i4, MentionEditText.c.class)) {
                getText().removeSpan(removeSpan);
            }
        }
    }

    public HashTagMentionEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f();
    }
}
