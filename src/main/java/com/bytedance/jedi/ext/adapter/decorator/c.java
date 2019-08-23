package com.bytedance.jedi.ext.adapter.decorator;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/decorator/LoadingView;", "", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "showLoadingStatus", "", "status", "", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public interface c {
    @NotNull
    View a();

    void a(@LoadingStatus int i);
}
