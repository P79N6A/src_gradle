package com.bytedance.ies.dmt.ui.input.emoji;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.ies.dmt.ui.input.IInputView;
import com.bytedance.ies.dmt.ui.input.b;
import com.bytedance.ies.dmt.ui.input.tab.a;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public final class i extends b implements a {

    /* renamed from: c  reason: collision with root package name */
    private View f20408c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f20409d;

    /* renamed from: e  reason: collision with root package name */
    private MiniEmojiAdapter f20410e;

    /* renamed from: f  reason: collision with root package name */
    private j f20411f;

    public final void a(int i) {
    }

    public final void c() {
    }

    public final int d() {
        return C0906R.layout.ap_;
    }

    public final e e() {
        return null;
    }

    public final View a() {
        return super.a();
    }

    public final void b() {
        View a2 = a();
        this.f20408c = a2.findViewById(C0906R.id.a9j);
        this.f20409d = (RecyclerView) a2.findViewById(C0906R.id.a9l);
        this.f20409d.setLayoutManager(new GridLayoutManager(a2.getContext(), 8));
    }

    public i(Context context, IInputView iInputView, List<String> list) {
        super(context, iInputView);
        ArrayList arrayList;
        this.f20411f = new j(context);
        this.f20410e = new MiniEmojiAdapter(iInputView);
        this.f20409d.setAdapter(this.f20410e);
        MiniEmojiAdapter miniEmojiAdapter = this.f20410e;
        j jVar = this.f20411f;
        int i = 0;
        if (list == null || list.size() < 8) {
            arrayList = new ArrayList(8);
            String[] strArr = j.f20412a;
            int length = strArr.length;
            while (i < length) {
                a a2 = jVar.a(strArr[i]);
                if (a2 != null) {
                    arrayList.add(a2);
                }
                i++;
            }
        } else {
            arrayList = new ArrayList(8);
            int size = list.size();
            while (arrayList.size() < 8 && i < size) {
                a a3 = jVar.a(list.get(i));
                if (a3 != null) {
                    arrayList.add(a3);
                }
                i++;
            }
        }
        miniEmojiAdapter.f20381a.clear();
        if (arrayList != null) {
            miniEmojiAdapter.f20381a.addAll(arrayList);
        }
        miniEmojiAdapter.notifyDataSetChanged();
    }
}
