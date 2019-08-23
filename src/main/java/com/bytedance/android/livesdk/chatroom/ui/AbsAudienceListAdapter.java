package com.bytedance.android.livesdk.chatroom.ui;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import com.bytedance.android.livesdk.rank.model.b;
import java.util.List;

public abstract class AbsAudienceListAdapter<T extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<T> {
    public abstract void a();

    public abstract void a(long j);

    public abstract void a(List<b> list);

    public abstract void a(boolean z);
}
