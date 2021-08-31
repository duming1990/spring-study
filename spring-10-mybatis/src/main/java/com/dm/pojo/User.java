package com.dm.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
public class User implements Serializable {
  private int id;
  private String name;
  private String pwd;
}
