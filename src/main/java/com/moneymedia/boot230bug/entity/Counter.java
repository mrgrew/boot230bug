package com.moneymedia.boot230bug.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotNull;

@Data
@Table("stats.counter")
public class Counter {
    @Id
    @NotNull
    private Long counterId;
    private String counterName;
}
