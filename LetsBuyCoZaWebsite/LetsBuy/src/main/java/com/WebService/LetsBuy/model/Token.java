package com.WebService.LetsBuy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Token")
public class Token {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "token_id")
	private int tokenID;

	@Column(name = "userTokenID", unique = true)
	private int userTokenID;

	@Column(name = "authenticationToken")
	private String authenticationToken;

	@Column(name = "secretKey")
	private String secretKey;

	@Column(name = "emailID")
	private String emailID;

	public Token() {
	}

	public Token(int tokenID, int userTokenID, String authenticationToken, String secretKey, String emailID) {
		super();
		this.tokenID = tokenID;
		this.userTokenID = userTokenID;
		this.authenticationToken = authenticationToken;
		this.secretKey = secretKey;
		this.emailID = emailID;
	}

	public int getTokenID() {
		return tokenID;
	}

	public void setTokenID(int tokenID) {
		this.tokenID = tokenID;
	}

	public int getUserTokenID() {
		return userTokenID;
	}

	public void setUserTokenID(int userTokenID) {
		this.userTokenID = userTokenID;
	}

	public String getAuthenticationToken() {
		return authenticationToken;
	}

	public void setAuthenticationToken(String authenticationToken) {
		this.authenticationToken = authenticationToken;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

}