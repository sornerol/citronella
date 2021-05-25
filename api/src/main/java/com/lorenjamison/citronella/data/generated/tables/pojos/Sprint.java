/*
 * This file is generated by jOOQ.
 */
package com.lorenjamison.citronella.data.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sprint implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long      id;
    private final String    name;
    private final Long      projectId;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final String    status;

    public Sprint(Sprint value) {
        this.id = value.id;
        this.name = value.name;
        this.projectId = value.projectId;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
        this.status = value.status;
    }

    public Sprint(
        Long      id,
        String    name,
        Long      projectId,
        LocalDate startDate,
        LocalDate endDate,
        String    status
    ) {
        this.id = id;
        this.name = name;
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    /**
     * Getter for <code>citronella.sprint.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Getter for <code>citronella.sprint.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>citronella.sprint.project_id</code>.
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * Getter for <code>citronella.sprint.start_date</code>.
     */
    public LocalDate getStartDate() {
        return this.startDate;
    }

    /**
     * Getter for <code>citronella.sprint.end_date</code>.
     */
    public LocalDate getEndDate() {
        return this.endDate;
    }

    /**
     * Getter for <code>citronella.sprint.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Sprint (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(projectId);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
