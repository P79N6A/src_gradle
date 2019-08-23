package com.bytedance.ies.dmt.ui.input.emoji;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import com.bytedance.ies.dmt.ui.base.BaseViewHolder;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public final class EmojiGridView {

    /* renamed from: a  reason: collision with root package name */
    public View f20368a = LayoutInflater.from(this.f20371d).inflate(C0906R.layout.ap9, null);

    /* renamed from: b  reason: collision with root package name */
    public GridView f20369b = ((GridView) this.f20368a.findViewById(C0906R.id.a9i));

    /* renamed from: c  reason: collision with root package name */
    a f20370c = new a();

    /* renamed from: d  reason: collision with root package name */
    private Context f20371d;

    /* renamed from: e  reason: collision with root package name */
    private int f20372e;

    final class EmojiHolder extends BaseViewHolder<a> {

        /* renamed from: b  reason: collision with root package name */
        private ImageView f20374b;

        public final void b() {
        }

        public final void a() {
            this.f20374b = (ImageView) this.itemView.findViewById(C0906R.id.a9e);
        }

        public final void a(a aVar) {
            if (aVar != null) {
                this.f20374b.setImageResource(aVar.f20387b);
                if (!TextUtils.isEmpty(aVar.f20386a)) {
                    this.f20374b.setContentDescription(aVar.f20386a);
                }
            }
        }

        public EmojiHolder(View view) {
            super(view);
        }
    }

    final class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        List<a> f20375a = new ArrayList();

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            return this.f20375a.size();
        }

        public final Object getItem(int i) {
            return this.f20375a.get(i);
        }

        public a() {
        }

        @NonNull
        public final View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
            EmojiHolder emojiHolder;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ap0, null);
                emojiHolder = new EmojiHolder(view);
                view.setTag(emojiHolder);
            } else {
                emojiHolder = (EmojiHolder) view.getTag();
            }
            emojiHolder.a(this.f20375a.get(i));
            return view;
        }
    }

    public EmojiGridView(Context context, int i) {
        int i2;
        this.f20371d = context;
        this.f20372e = i;
        GridView gridView = this.f20369b;
        if (this.f20372e != 1) {
            i2 = 4;
        } else {
            i2 = 7;
        }
        gridView.setNumColumns(i2);
        this.f20369b.setAdapter(this.f20370c);
    }
}
