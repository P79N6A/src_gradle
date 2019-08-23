package com.bytedance.ies.dmt.ui.input.emoji;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.bytedance.ies.dmt.ui.input.IInputView;
import com.bytedance.ies.dmt.ui.input.c;
import com.bytedance.ies.dmt.ui.input.emoji.EmojiGridView;
import com.bytedance.ies.dmt.ui.input.tab.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class EmojiPageAdapter extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public IInputView f20377a;

    /* renamed from: b  reason: collision with root package name */
    private a f20378b;

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public final int getCount() {
        int i = 0;
        for (c d2 : this.f20378b.e().f20398c) {
            i += d2.d();
        }
        return i;
    }

    public EmojiPageAdapter(IInputView iInputView, a aVar) {
        this.f20377a = iInputView;
        this.f20378b = aVar;
    }

    public final /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i) {
        c cVar;
        final List list;
        e e2 = this.f20378b.e();
        int i2 = 0;
        if (i >= 0) {
            Iterator<c> it2 = e2.f20398c.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                cVar = it2.next();
                i3 += cVar.d();
                if (i < i3) {
                    break;
                }
            }
        }
        cVar = null;
        if (cVar == null) {
            View view = new d(viewGroup.getContext()).f20395a;
            if (viewGroup.indexOfChild(view) < 0) {
                viewGroup.addView(view);
            }
            return view;
        }
        EmojiGridView emojiGridView = new EmojiGridView(viewGroup.getContext(), 1);
        e e3 = this.f20378b.e();
        if (i >= 0) {
            Iterator<c> it3 = e3.f20398c.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    list = new ArrayList();
                    break;
                }
                c next = it3.next();
                if (i < next.d() + i2) {
                    list = next.b(i - i2);
                    break;
                }
                i2 += next.d();
            }
        } else {
            list = new ArrayList();
        }
        EmojiGridView.a aVar = emojiGridView.f20370c;
        aVar.f20375a.clear();
        aVar.f20375a.addAll(list);
        aVar.notifyDataSetChanged();
        emojiGridView.f20370c.notifyDataSetChanged();
        View view2 = emojiGridView.f20368a;
        if (viewGroup.indexOfChild(view2) < 0) {
            viewGroup.addView(view2);
        }
        emojiGridView.f20369b.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                a aVar = (a) list.get(i);
                if (aVar.f20387b == 2130841633) {
                    EmojiPageAdapter.this.f20377a.a(67);
                } else {
                    EmojiPageAdapter.this.f20377a.a(aVar.f20386a, 1);
                }
            }
        });
        return view2;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
