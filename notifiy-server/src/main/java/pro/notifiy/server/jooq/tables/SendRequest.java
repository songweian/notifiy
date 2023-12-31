/*
 * This file is generated by jOOQ.
 */
package pro.notifiy.server.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.EnumConverter;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import pro.notifiy.server.jooq.Keys;
import pro.notifiy.server.jooq.Notify;
import pro.notifiy.server.jooq.tables.records.SendRequestRecord;
import pro.notifiy.server.model.SendStatus;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SendRequest extends TableImpl<SendRequestRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>notify.send_request</code>
     */
    public static final SendRequest SEND_REQUEST = new SendRequest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SendRequestRecord> getRecordType() {
        return SendRequestRecord.class;
    }

    /**
     * The column <code>notify.send_request.id</code>.
     */
    public final TableField<SendRequestRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>notify.send_request.app_id</code>.
     */
    public final TableField<SendRequestRecord, String> APP_ID = createField(DSL.name("app_id"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>notify.send_request.batch_id</code>.
     */
    public final TableField<SendRequestRecord, String> BATCH_ID = createField(DSL.name("batch_id"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>notify.send_request.template_code</code>.
     */
    public final TableField<SendRequestRecord, String> TEMPLATE_CODE = createField(DSL.name("template_code"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>notify.send_request.template_params</code>.
     */
    public final TableField<SendRequestRecord, String> TEMPLATE_PARAMS = createField(DSL.name("template_params"), SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>notify.send_request.target_type</code>.
     */
    public final TableField<SendRequestRecord, String> TARGET_TYPE = createField(DSL.name("target_type"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>notify.send_request.target_list</code>.
     */
    public final TableField<SendRequestRecord, String> TARGET_LIST = createField(DSL.name("target_list"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>notify.send_request.send_status</code>.
     */
    public final TableField<SendRequestRecord, SendStatus> SEND_STATUS = createField(DSL.name("send_status"), SQLDataType.VARCHAR(50).nullable(false), this, "", new EnumConverter<String, SendStatus>(String.class, SendStatus.class));

    /**
     * The column <code>notify.send_request.send_time</code>.
     */
    public final TableField<SendRequestRecord, LocalDateTime> SEND_TIME = createField(DSL.name("send_time"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>notify.send_request.send_result</code>.
     */
    public final TableField<SendRequestRecord, String> SEND_RESULT = createField(DSL.name("send_result"), SQLDataType.VARCHAR(1024).nullable(false), this, "");

    /**
     * The column <code>notify.send_request.create_time</code>.
     */
    public final TableField<SendRequestRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>notify.send_request.update_time</code>.
     */
    public final TableField<SendRequestRecord, LocalDateTime> UPDATE_TIME = createField(DSL.name("update_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private SendRequest(Name alias, Table<SendRequestRecord> aliased) {
        this(alias, aliased, null);
    }

    private SendRequest(Name alias, Table<SendRequestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>notify.send_request</code> table reference
     */
    public SendRequest(String alias) {
        this(DSL.name(alias), SEND_REQUEST);
    }

    /**
     * Create an aliased <code>notify.send_request</code> table reference
     */
    public SendRequest(Name alias) {
        this(alias, SEND_REQUEST);
    }

    /**
     * Create a <code>notify.send_request</code> table reference
     */
    public SendRequest() {
        this(DSL.name("send_request"), null);
    }

    public <O extends Record> SendRequest(Table<O> child, ForeignKey<O, SendRequestRecord> key) {
        super(child, key, SEND_REQUEST);
    }

    @Override
    public Schema getSchema() {
        return Notify.NOTIFY;
    }

    @Override
    public Identity<SendRequestRecord, Long> getIdentity() {
        return (Identity<SendRequestRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<SendRequestRecord> getPrimaryKey() {
        return Keys.KEY_SEND_REQUEST_PRIMARY;
    }

    @Override
    public List<UniqueKey<SendRequestRecord>> getKeys() {
        return Arrays.<UniqueKey<SendRequestRecord>>asList(Keys.KEY_SEND_REQUEST_PRIMARY);
    }

    @Override
    public SendRequest as(String alias) {
        return new SendRequest(DSL.name(alias), this);
    }

    @Override
    public SendRequest as(Name alias) {
        return new SendRequest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SendRequest rename(String name) {
        return new SendRequest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SendRequest rename(Name name) {
        return new SendRequest(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, String, String, String, String, String, String, SendStatus, LocalDateTime, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
