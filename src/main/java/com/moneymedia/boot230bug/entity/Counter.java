package com.moneymedia.boot230bug.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

@Data
public class Counter {
    @Id
    @NotNull
    private Long counterId;
    private String counterName;
}
