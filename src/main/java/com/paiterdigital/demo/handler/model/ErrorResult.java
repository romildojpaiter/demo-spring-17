package com.paiterdigital.demo.handler.model;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ErrorResult(String message, LocalDateTime time) {
}
