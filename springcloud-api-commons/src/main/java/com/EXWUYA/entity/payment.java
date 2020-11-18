package com.EXWUYA.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class payment implements Serializable {
  private long id;
  private String serial;

}
