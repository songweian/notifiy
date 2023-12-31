/*
 * This file is generated by jOOQ.
 */
package pro.notifiy.server.jooq.tables.records;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import pro.notifiy.server.jooq.tables.SendTask;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SendTaskRecord extends UpdatableRecordImpl<SendTaskRecord> implements Record6<Long, String, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>notify.send_task.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>notify.send_task.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>notify.send_task.app_id</code>.
     */
    public void setAppId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>notify.send_task.app_id</code>.
     */
    public String getAppId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>notify.send_task.task_id</code>.
     */
    public void setTaskId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>notify.send_task.task_id</code>.
     */
    public String getTaskId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>notify.send_task.batch_id</code>.
     */
    public void setBatchId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>notify.send_task.batch_id</code>.
     */
    public String getBatchId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>notify.send_task.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>notify.send_task.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>notify.send_task.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>notify.send_task.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return SendTask.SEND_TASK.ID;
    }

    @Override
    public Field<String> field2() {
        return SendTask.SEND_TASK.APP_ID;
    }

    @Override
    public Field<String> field3() {
        return SendTask.SEND_TASK.TASK_ID;
    }

    @Override
    public Field<String> field4() {
        return SendTask.SEND_TASK.BATCH_ID;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SendTask.SEND_TASK.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return SendTask.SEND_TASK.UPDATE_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getAppId();
    }

    @Override
    public String component3() {
        return getTaskId();
    }

    @Override
    public String component4() {
        return getBatchId();
    }

    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component6() {
        return getUpdateTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getAppId();
    }

    @Override
    public String value3() {
        return getTaskId();
    }

    @Override
    public String value4() {
        return getBatchId();
    }

    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value6() {
        return getUpdateTime();
    }

    @Override
    public SendTaskRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SendTaskRecord value2(String value) {
        setAppId(value);
        return this;
    }

    @Override
    public SendTaskRecord value3(String value) {
        setTaskId(value);
        return this;
    }

    @Override
    public SendTaskRecord value4(String value) {
        setBatchId(value);
        return this;
    }

    @Override
    public SendTaskRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public SendTaskRecord value6(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public SendTaskRecord values(Long value1, String value2, String value3, String value4, LocalDateTime value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SendTaskRecord
     */
    public SendTaskRecord() {
        super(SendTask.SEND_TASK);
    }

    /**
     * Create a detached, initialised SendTaskRecord
     */
    public SendTaskRecord(Long id, String appId, String taskId, String batchId, LocalDateTime createTime, LocalDateTime updateTime) {
        super(SendTask.SEND_TASK);

        setId(id);
        setAppId(appId);
        setTaskId(taskId);
        setBatchId(batchId);
        setCreateTime(createTime);
        setUpdateTime(updateTime);
    }
}
