package com.bytedance.ies.dmt.ui.input.emoji;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.dmt.ui.input.IInputView;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;

public class MiniEmojiAdapter extends RecyclerView.Adapter<EmojiViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    ArrayList<a> f20381a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private IInputView f20382b;

    public static final class EmojiViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        ImageView f20383a;

        /* renamed from: b  reason: collision with root package name */
        a f20384b;

        /* renamed from: c  reason: collision with root package name */
        private IInputView f20385c;

        public final void onClick(View view) {
            if (this.f20384b != null) {
                this.f20385c.a(this.f20384b.f20386a, 2);
            }
        }

        public EmojiViewHolder(View view, IInputView iInputView) {
            super(view);
            this.f20383a = (ImageView) view.findViewById(C0906R.id.a9e);
            this.f20385c = iInputView;
            this.f20383a.setOnClickListener(this);
        }
    }

    public int getItemCount() {
        if (this.f20381a == null) {
            return 0;
        }
        return this.f20381a.size();
    }

    public MiniEmojiAdapter(IInputView iInputView) {
        this.f20382b = iInputView;
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new EmojiViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ap1, viewGroup, false), this.f20382b);
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        EmojiViewHolder emojiViewHolder = (EmojiViewHolder) viewHolder;
        a aVar = this.f20381a.get(i);
        if (aVar != null) {
            emojiViewHolder.f20384b = aVar;
            emojiViewHolder.f20383a.setImageResource(aVar.f20387b);
            if (!TextUtils.isEmpty(aVar.f20386a)) {
                emojiViewHolder.f20383a.setContentDescription(aVar.f20386a);
            }
        }
    }
}
