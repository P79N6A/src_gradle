package com.facebook.react.animated;

import com.facebook.infer.annotation.a;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public abstract class AnimatedNode {
    int mActiveIncomingNodes;
    int mBFSColor;
    @Nullable
    List<AnimatedNode> mChildren;
    int mTag = -1;

    public void onAttachedToNode(AnimatedNode animatedNode) {
    }

    public void onDetachedFromNode(AnimatedNode animatedNode) {
    }

    public void update() {
    }

    AnimatedNode() {
    }

    public final void removeChild(AnimatedNode animatedNode) {
        if (this.mChildren != null) {
            animatedNode.onDetachedFromNode(this);
            this.mChildren.remove(animatedNode);
        }
    }

    public final void addChild(AnimatedNode animatedNode) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList(1);
        }
        ((List) a.b(this.mChildren)).add(animatedNode);
        animatedNode.onAttachedToNode(this);
    }
}
