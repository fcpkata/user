package com.shoppingcart.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class User {
	private String name;
	private String id;
	private String emailId;
	private String mobileNumber;

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber + "]";
	}
}
