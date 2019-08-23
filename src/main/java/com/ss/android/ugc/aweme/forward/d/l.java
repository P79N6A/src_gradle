package com.ss.android.ugc.aweme.forward.d;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.forward.model.ForwardDetail;

public interface l extends o {
    void a(ForwardDetail forwardDetail);

    void b(Exception exc, Comment comment);

    void e(Comment comment);
}
