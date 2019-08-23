package com.tt.appbrandimpl.friends.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;

public class GameShareDecorationViewHolder extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void bind() {
    }

    public GameShareDecorationViewHolder(@NonNull View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }
}
