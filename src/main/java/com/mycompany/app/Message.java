package com.mycompany.app;

import java.util.Date;

public class Message {
  private Long id;
  private String content;
  private Date createDate;

  public Long getId() {
    return this.id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getContent() {
    return this.content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public Date getCreateDate() {
    return this.createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }
}
