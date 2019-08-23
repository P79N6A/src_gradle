package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UgActivityTasks extends Message<UgActivityTasks, Builder> {
    public static final DefaultValueProtoAdapter<UgActivityTasks> ADAPTER = new ProtoAdapter_UgActivityTasks();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String task_id;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer task_type;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long time;

    public static final class Builder extends Message.Builder<UgActivityTasks, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String task_id;
        public Integer task_type;
        public Long time;

        public final UgActivityTasks build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49212, new Class[0], UgActivityTasks.class)) {
                return new UgActivityTasks(this.task_id, this.task_type, this.time, super.buildUnknownFields());
            }
            return (UgActivityTasks) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49212, new Class[0], UgActivityTasks.class);
        }

        public final Builder task_id(String str) {
            this.task_id = str;
            return this;
        }

        public final Builder task_type(Integer num) {
            this.task_type = num;
            return this;
        }

        public final Builder time(Long l) {
            this.time = l;
            return this;
        }
    }

    static final class ProtoAdapter_UgActivityTasks extends DefaultValueProtoAdapter<UgActivityTasks> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final UgActivityTasks redact(UgActivityTasks ugActivityTasks) {
            return ugActivityTasks;
        }

        public ProtoAdapter_UgActivityTasks() {
            super(FieldEncoding.LENGTH_DELIMITED, UgActivityTasks.class);
        }

        public final UgActivityTasks decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49215, new Class[]{ProtoReader.class}, UgActivityTasks.class)) {
                return decode(protoReader2, (UgActivityTasks) null);
            }
            return (UgActivityTasks) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49215, new Class[]{ProtoReader.class}, UgActivityTasks.class);
        }

        public final int encodedSize(UgActivityTasks ugActivityTasks) {
            UgActivityTasks ugActivityTasks2 = ugActivityTasks;
            if (!PatchProxy.isSupport(new Object[]{ugActivityTasks2}, this, changeQuickRedirect, false, 49213, new Class[]{UgActivityTasks.class}, Integer.TYPE)) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, ugActivityTasks2.task_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, ugActivityTasks2.task_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, ugActivityTasks2.time) + ugActivityTasks.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{ugActivityTasks2}, this, changeQuickRedirect, false, 49213, new Class[]{UgActivityTasks.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, UgActivityTasks ugActivityTasks) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            UgActivityTasks ugActivityTasks2 = ugActivityTasks;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, ugActivityTasks2}, this, changeQuickRedirect, false, 49214, new Class[]{ProtoWriter.class, UgActivityTasks.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, ugActivityTasks2}, this, changeQuickRedirect, false, 49214, new Class[]{ProtoWriter.class, UgActivityTasks.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter2, 1, ugActivityTasks2.task_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, ugActivityTasks2.task_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, ugActivityTasks2.time);
            protoWriter2.writeBytes(ugActivityTasks.unknownFields());
        }

        public final UgActivityTasks decode(ProtoReader protoReader, UgActivityTasks ugActivityTasks) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            UgActivityTasks ugActivityTasks2 = ugActivityTasks;
            if (PatchProxy.isSupport(new Object[]{protoReader2, ugActivityTasks2}, this, changeQuickRedirect, false, 49216, new Class[]{ProtoReader.class, UgActivityTasks.class}, UgActivityTasks.class)) {
                return (UgActivityTasks) PatchProxy.accessDispatch(new Object[]{protoReader2, ugActivityTasks2}, this, changeQuickRedirect, false, 49216, new Class[]{ProtoReader.class, UgActivityTasks.class}, UgActivityTasks.class);
            }
            UgActivityTasks ugActivityTasks3 = (UgActivityTasks) a.a().a(UgActivityTasks.class, ugActivityTasks2);
            if (ugActivityTasks3 != null) {
                builder = ugActivityTasks3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder2.task_id((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 2:
                            builder2.task_type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder2.time((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (ugActivityTasks3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder2.build();
                }
            }
        }
    }

    @KtNullable
    public final String getTaskId() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49205, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49205, new Class[0], String.class);
        } else if (this.task_id != null) {
            return this.task_id;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getTaskType() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49206, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49206, new Class[0], Integer.class);
        } else if (this.task_type != null) {
            return this.task_type;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Long getTime() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49207, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49207, new Class[0], Long.class);
        } else if (this.time != null) {
            return this.time;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49210, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49210, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.task_id != null) {
                i = this.task_id.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.task_type != null) {
                i2 = this.task_type.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.time != null) {
                i3 = this.time.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49208, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49208, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.task_id = this.task_id;
        builder.task_type = this.task_type;
        builder.time = this.time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49211, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49211, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.task_id != null) {
            sb.append(", task_id=");
            sb.append(this.task_id);
        }
        if (this.task_type != null) {
            sb.append(", task_type=");
            sb.append(this.task_type);
        }
        if (this.time != null) {
            sb.append(", time=");
            sb.append(this.time);
        }
        StringBuilder replace = sb.replace(0, 2, "UgActivityTasks{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49209, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49209, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof UgActivityTasks)) {
                return false;
            }
            UgActivityTasks ugActivityTasks = (UgActivityTasks) obj;
            if (!unknownFields().equals(ugActivityTasks.unknownFields()) || !Internal.equals(this.task_id, ugActivityTasks.task_id) || !Internal.equals(this.task_type, ugActivityTasks.task_type) || !Internal.equals(this.time, ugActivityTasks.time)) {
                return false;
            }
            return true;
        }
    }

    public UgActivityTasks(String str, Integer num, Long l) {
        this(str, num, l, ByteString.EMPTY);
    }

    public UgActivityTasks(String str, Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.task_id = str;
        this.task_type = num;
        this.time = l;
    }
}
