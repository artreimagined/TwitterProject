package com.tts.TechTalentTwitter.model;

import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TweetDisplay {

    private User user;
    private String message;
    private String date;
    private List<Tag> tags;
    
  //new
    
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
//	public String getMessage() {
//		return message;
//	}
//	public void setMessage(String message) {
//		this.message = message;
//	}
//	public List<Tag> getTags() {
//		return tags;
//	}
//	public void setTags(List<Tag> tags) {
//		this.tags = tags;
//	}
//	public String getDate() {
//		return date;
//	}
//	public void setDate(String date) {
//		this.date = date;
//	}
	
	
    
    
    
    

}
