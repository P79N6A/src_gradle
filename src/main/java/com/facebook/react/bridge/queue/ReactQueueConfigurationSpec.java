package com.facebook.react.bridge.queue;

import android.os.Build;
import com.facebook.infer.annotation.a;
import javax.annotation.Nullable;

public class ReactQueueConfigurationSpec {
    private final MessageQueueThreadSpec mJSQueueThreadSpec;
    private final MessageQueueThreadSpec mLayoutThreadSpec;
    private final MessageQueueThreadSpec mNativeModulesQueueThreadSpec;

    public static class Builder {
        @Nullable
        private MessageQueueThreadSpec mJSQueueSpec;
        @Nullable
        private MessageQueueThreadSpec mLayoutSpec;
        @Nullable
        private MessageQueueThreadSpec mNativeModulesQueueSpec;

        public ReactQueueConfigurationSpec build() {
            return new ReactQueueConfigurationSpec((MessageQueueThreadSpec) a.b(this.mNativeModulesQueueSpec), (MessageQueueThreadSpec) a.b(this.mJSQueueSpec), (MessageQueueThreadSpec) a.b(this.mLayoutSpec));
        }

        public Builder setJSQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            boolean z;
            if (this.mJSQueueSpec == null) {
                z = true;
            } else {
                z = false;
            }
            a.a(z, "Setting JS queue multiple times!");
            this.mJSQueueSpec = messageQueueThreadSpec;
            return this;
        }

        public Builder setLayouthreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            boolean z;
            if (this.mLayoutSpec == null) {
                z = true;
            } else {
                z = false;
            }
            a.a(z, "Setting layout thread multiple times!");
            this.mLayoutSpec = messageQueueThreadSpec;
            return this;
        }

        public Builder setNativeModulesQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            boolean z;
            if (this.mNativeModulesQueueSpec == null) {
                z = true;
            } else {
                z = false;
            }
            a.a(z, "Setting native modules queue spec multiple times!");
            this.mNativeModulesQueueSpec = messageQueueThreadSpec;
            return this;
        }
    }

    public MessageQueueThreadSpec getJSQueueThreadSpec() {
        return this.mJSQueueThreadSpec;
    }

    public MessageQueueThreadSpec getLayoutThreadSpec() {
        return this.mLayoutThreadSpec;
    }

    public MessageQueueThreadSpec getNativeModulesQueueThreadSpec() {
        return this.mNativeModulesQueueThreadSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReactQueueConfigurationSpec createDefault() {
        MessageQueueThreadSpec messageQueueThreadSpec;
        if (Build.VERSION.SDK_INT < 21) {
            messageQueueThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules", 2000000);
        } else {
            messageQueueThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules");
        }
        return builder().setJSQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("js")).setNativeModulesQueueThreadSpec(messageQueueThreadSpec).setLayouthreadSpec(MessageQueueThreadSpec.newLayoutThreadSpec("layout", 2000000)).build();
    }

    private ReactQueueConfigurationSpec(MessageQueueThreadSpec messageQueueThreadSpec, MessageQueueThreadSpec messageQueueThreadSpec2, MessageQueueThreadSpec messageQueueThreadSpec3) {
        this.mNativeModulesQueueThreadSpec = messageQueueThreadSpec;
        this.mJSQueueThreadSpec = messageQueueThreadSpec2;
        this.mLayoutThreadSpec = messageQueueThreadSpec3;
    }
}
