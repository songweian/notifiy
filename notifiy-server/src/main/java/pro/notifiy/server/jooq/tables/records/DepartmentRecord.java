/*
 * This file is generated by jOOQ.
 */
package pro.notifiy.server.jooq.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import pro.notifiy.server.jooq.tables.Department;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DepartmentRecord extends UpdatableRecordImpl<DepartmentRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>notify.department.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>notify.department.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>notify.department.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>notify.department.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Department.DEPARTMENT.ID;
    }

    @Override
    public Field<String> field2() {
        return Department.DEPARTMENT.NAME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public DepartmentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public DepartmentRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public DepartmentRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DepartmentRecord
     */
    public DepartmentRecord() {
        super(Department.DEPARTMENT);
    }

    /**
     * Create a detached, initialised DepartmentRecord
     */
    public DepartmentRecord(Integer id, String name) {
        super(Department.DEPARTMENT);

        setId(id);
        setName(name);
    }
}
